Type=Service
Version=5.5
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	
#End Region

Sub Process_Globals
	Private jobs As Map
	Private jobCounter As Int

End Sub

Sub Service_Create
	jobs.Initialize()
End Sub

Sub Service_Start (StartingIntent As Intent)

End Sub

Sub Service_Destroy

End Sub


Public Sub Execute(httpRequest As OkHttpRequest,job As XHttpJob)
	
	httpRequest.Timeout = job.Request.Timeout
	jobCounter = jobCounter + 1
	
	Dim client As OkHttpClient
	client.Initialize("xhttpclient")
	client.Execute(httpRequest,jobCounter)



	
	jobs.Put(jobCounter,job)

End Sub

Sub xhttpclient_ResponseSuccess (response As OkHttpResponse, taskId As Int)
		Dim job As XHttpJob = jobs.Get(taskId)
		Dim xResponse As XHttpResponse
		xResponse.Initialize()
		xResponse.ContentType = response.ContentType
		xResponse.ContentLength = response.ContentLength
		xResponse.StatusCode = response.StatusCode
		xResponse.Headers = response.GetHeaders
		job.Response = xResponse
		job.Response.OutputStream.InitializeToBytesArray(0)
		response.GetAsynchronously("response", xResponse.OutputStream, True, taskId)
End Sub



Private Sub ProccessContent(contentType As String,response As XHttpResponse,cb_ As Object)
	If contentType.Contains("application/json") Then
		
		Dim buffer() As Byte = response.OutputStream.ToBytesArray()
		Dim str As String = BytesToString(buffer,0,buffer.Length,"UTF8")
		Dim jsonParser As JSONParser
		jsonParser.Initialize(str)

		If str.StartsWith("{") Then
			Dim map As Map = jsonParser.NextObject()
			Try
				If cb_ Is Callback Then
					Dim cb As Callback = cb_
					CallSub2(cb.GetModule(),cb.GetRoutine(),map)
				Else if cb_ Is Callback2 Then
					Dim cb2 As Callback2 = cb_
					CallSub3(cb2.GetModule(),cb2.GetRoutine(),map,cb2.GetArg)
				End If

			Catch 
				Log(LastException.Message)
			End Try
			
		else if str.StartsWith("[") Then
			Dim list As List = jsonParser.NextArray()
			Try
				If cb_ Is Callback Then
					Dim cb As Callback = cb_
					CallSub2(cb.GetModule(),cb.GetRoutine(),list)
				Else if cb_ Is Callback2 Then
					Dim cb2 As Callback2 = cb_
					CallSub3(cb2.GetModule(),cb2.GetRoutine(),list,cb2.GetArg)
				End If
			Catch 
				Log(LastException.Message)
			End Try
		Else 
			Dim obj As Object = jsonParser.NextValue()
			Try
				If cb_ Is Callback Then
					Dim cb As Callback = cb_
					CallSub2(cb.GetModule(),cb.GetRoutine(),obj)
				Else if cb_ Is Callback2 Then
					Dim cb2 As Callback2 = cb_
					CallSub3(cb2.GetModule(),cb2.GetRoutine(),obj,cb2.GetArg)
				End If
			Catch 
				Log(LastException.Message)
			End Try
		End If
			
	Else
		If cb_ Is Callback Then
			Dim cb As Callback = cb_
			CallSub2(cb.GetModule(),cb.GetRoutine(),response)
		Else if cb_ Is Callback2 Then
			Dim cb2 As Callback2 = cb_
			CallSub3(cb2.GetModule(),cb2.GetRoutine(),response,cb2.GetArg)
		End If
	End If
End Sub

Private Sub Response_StreamFinish (Success As Boolean, TaskId As Int)
	Try
		DoEvents 
		Dim job As XHttpJob = jobs.Get(TaskId)
		If Success Then
			For Each callback As Object In job.GetSuccessCallbacks()
				ProccessContent(job.Response.ContentType,job.Response,callback)
			Next
		Else
			For Each callback As Object In job.GetErrorCallbacks
				ProccessContent(job.Response.ContentType,job.Response,callback)
			Next
		End If
	Catch
		Log(LastException.Message)
	End Try
	
	If jobs.ContainsKey(TaskId) Then
		 jobs.Remove(TaskId) 
	End If
	
End Sub


 Sub xhttpclient_ResponseError (response As OkHttpResponse, reason As String, statusCode As Int, taskId As Int)
 	Dim job As XHttpJob = jobs.Get(taskId)
	Dim xResponse As XHttpResponse
	xResponse.Initialize()
	'xResponse.ContentType = response.ContentType
	'xResponse.ContentLength = response.ContentLength

	xResponse.StatusCode = statusCode
	xResponse.OutputStream.InitializeToBytesArray(0)
	

	Try
		xResponse.Headers = response.GetHeaders
	Catch
		Log("Could not get headers")
	End Try
	
	Try
		Dim bytes() As Byte = response.ErrorResponse.GetBytes("UTF-8")
		xResponse.OutputStream.WriteBytes(bytes,0,bytes.Length)
	Catch
		Log("Could not get error response")
	End Try
	
	job.Response = xResponse
	
	For Each callback As Object In job.GetErrorCallbacks()

			Try
				If callback Is Callback Then
				Dim cb As Callback = callback
				CallSub2(cb.GetModule(),cb.GetRoutine(),xResponse)
			Else if callback Is Callback2 Then
				Dim cb2 As Callback2 = callback
				CallSub3(cb2.GetModule(),cb2.GetRoutine(),xResponse,cb2.GetArg)
			End If
			Catch 
				Log(LastException.Message)
			End Try
		
	Next
	jobs.Remove(taskId)
End Sub
