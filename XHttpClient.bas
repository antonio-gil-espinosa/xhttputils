Type=Class
Version=5.5
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Class module
Sub Class_Globals
	Public BaseUrl As String
	Private jobs As Map
	Private jobCounter As Int
	Private client As OkHttpClient
	Public UserAgent As String = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2227.0 Safari/537.36"

End Sub




'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(pBaseUrl As String)
	BaseUrl = pBaseUrl
	client.Initialize("xhttpclient")
	jobs.Initialize()

End Sub

Private Sub Map2String(map As Map,separator As String) As String
	Dim ret As String = ""

	For i = 0 To map.Size-1
		If i > 0 Then
			ret = ret & separator
		End If
		ret = ret & map.GetKeyAt(i) & "=" & map.GetValueAt(i)
	Next
	Return ret
End Sub

Public Sub Execute(request As XHttpRequest) As XHttpJob
	
	
	jobCounter = jobCounter + 1
	
	Dim httpRequest As OkHttpRequest
	Dim url As String = BaseUrl & request.Url
	If request.Parameters <> Null And request.Parameters.Size > 0 Then
		url = url & "?" & Map2String(request.Parameters,"&")
	End If

	
	Dim method As String = request.Method.ToUpperCase()
	
	If method = "GET" Then
		httpRequest.InitializeGet(url)
	Else If method = "POST" Then
		Dim inputStream As InputStream
		Dim bytes() As Byte = Map2String(request.Data,"&").GetBytes("UTF8")
		inputStream.InitializeFromBytesArray(bytes,0,bytes.Length)
		httpRequest.InitializePost(url,inputStream,bytes.Length)
	Else If method ="PUT" Then
		Dim inputStream As InputStream
		Dim bytes() As Byte = Map2String(request.Data,"&").GetBytes("UTF8")
		inputStream.InitializeFromBytesArray(bytes,0,bytes.Length)
		httpRequest.InitializePut(url,inputStream,bytes.Length)
	Else If method ="DELETE" Then
		httpRequest.InitializeDelete(url)
	Else
	
	End If
	
	If request.Cookies <> Null And request.Cookies.Size > 0 Then
		httpRequest.SetHeader("Cookie",Map2String(request.Cookies,"; "))
	End If
	
	
	If request.UserAgent <> Null And request.UserAgent.Length > 0 Then
		httpRequest.SetHeader("User-Agent",request.UserAgent)
	else If UserAgent  <> Null And UserAgent.Length > 0 Then
		httpRequest.SetHeader("User-Agent",UserAgent)
	End If
	
	Dim job As XHttpJob
	job.Initialize()
	job.Request = request
	
	jobs.Put(jobCounter,job)
	
	
	client.Execute(httpRequest,jobCounter)
	Return job
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

Private Sub Response_StreamFinish (Success As Boolean, TaskId As Int)
	Try
		Dim job As XHttpJob = jobs.Get(TaskId)
		If Success Then
			For Each callback As Callback In job.GetSuccessCallbacks()
				Dim contentType As String = job.Response.ContentType
				If contentType.Contains("application/json") Then
					
					Dim buffer() As Byte = job.Response.OutputStream.ToBytesArray()
					Dim str As String = BytesToString(buffer,0,buffer.Length,"UTF8")
					Dim jsonParser As JSONParser
					jsonParser.Initialize(str)
					
					
					If str.StartsWith("{") Then
						Dim map As Map = jsonParser.NextObject()
						CallSubDelayed2(callback.GetModule(),callback.GetRoutine(),map)
					else if str.StartsWith("[") Then
						Dim list As List = jsonParser.NextArray()
						CallSubDelayed2(callback.GetModule,callback.GetRoutine,list)
					Else 
						Dim obj As Object = jsonParser.NextValue()
						CallSubDelayed2(callback.GetModule,callback.GetRoutine,obj)
					End If
					
				Else
					CallSubDelayed2(callback.GetModule,callback.GetRoutine,job.Response)
				End If
			Next
		Else
			For Each callback As Callback In job.ErrorCallbacks
					CallSubDelayed2(callback.GetModule,callback.GetRoutine,job.Response)
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
				CallSubDelayed2(callback.GetModule,callback.GetRoutine,job.Response)
		Next
	jobs.Remove(taskId)
End Sub
