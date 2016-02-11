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
		
		job.Response = xResponse
		job.Response.OutputStream.InitializeToBytesArray(0)
		response.GetAsynchronously("response", xResponse.OutputStream, True, taskId)
End Sub

Private Sub ProccessContent(contentType As String,response As XHttpResponse,cb As Callback)
	If contentType.Contains("application/json") Then
		
		Dim buffer() As Byte = response.OutputStream.ToBytesArray()
		Dim str As String = BytesToString(buffer,0,buffer.Length,"UTF8")
		Dim jsonParser As JSONParser
		jsonParser.Initialize(str)

		If str.StartsWith("{") Then
			Dim map As Map = jsonParser.NextObject()
			Try
				CallSub2(cb.GetModule(),cb.GetRoutine(),map)
			Catch 
				Log(LastException.Message)
			End Try
			
		else if str.StartsWith("[") Then
			Dim list As List = jsonParser.NextArray()
			Try
				CallSub2(cb.GetModule(),cb.GetRoutine(),list)
			Catch 
				Log(LastException.Message)
			End Try
		Else 
			Dim obj As Object = jsonParser.NextValue()
			Try
				CallSub2(cb.GetModule(),cb.GetRoutine(),obj)
			Catch 
				Log(LastException.Message)
			End Try
		End If
			
	Else

		CallSub2(cb.GetModule,cb.GetRoutine,response)
	End If
End Sub

Private Sub Response_StreamFinish (Success As Boolean, TaskId As Int)
	Try
		DoEvents 
		Dim job As XHttpJob = jobs.Get(TaskId)
		If Success Then
			For Each callback As Callback In job.GetSuccessCallbacks()
				ProccessContent(job.Response.ContentType,job.Response,callback)
			Next
		Else
			For Each callback As Callback In job.GetErrorCallbacks
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
	For Each callback As Callback In job.GetErrorCallbacks()

			Try
				CallSub2(callback.GetModule,callback.GetRoutine,job.Response)
			Catch 
				Log(LastException.Message)
			End Try
		
		Next
	jobs.Remove(taskId)
End Sub
