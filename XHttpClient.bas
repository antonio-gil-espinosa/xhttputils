Type=Class
Version=5.5
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Class module
Sub Class_Globals
	Public BaseUrl As String


	Public UserAgent As String = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2227.0 Safari/537.36"

End Sub




'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(pBaseUrl As String)
	BaseUrl = pBaseUrl

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
	
				Dim boundary As String = "---------------------------411C467633A"

	
	Dim httpRequest As OkHttpRequest
	

	
	
	Dim url As String = BaseUrl & request.Url
	If request.Parameters <> Null And request.Parameters.Size > 0 Then
		url = url & "?" & Map2String(request.Parameters,"&")
	End If

	
	Dim method As String = request.Method.ToUpperCase()

	If method = "GET" Then
		httpRequest.InitializeGet(url)
	Else If method = "POST" Then
		

		Dim xStream As XInputStream = request.GetXInputStream(boundary)
		httpRequest.InitializePost(url,xStream.GetInputStream(),xStream.GetSize)
		httpRequest.SetContentType("multipart/form-data; boundary=" & boundary)

	Else If method ="PUT" Then

		Dim xStream As XInputStream = request.GetXInputStream(boundary)
		httpRequest.InitializePut(url,xStream.GetInputStream(),xStream.GetSize)
			httpRequest.SetContentType("multipart/form-data; boundary=" & boundary)

	Else If method ="DELETE" Then
		httpRequest.InitializeDelete(url)
	Else
	
	End If
	
	If request.Cookies <> Null And request.Cookies.Size > 0 Then
		Dim authCookie As String = Map2String(request.Cookies,"; ")
		httpRequest.SetHeader("Cookie",authCookie)
	End If
	
	
	If request.UserAgent <> Null And request.UserAgent.Length > 0 Then
		httpRequest.SetHeader("User-Agent",request.UserAgent)
	else If UserAgent  <> Null And UserAgent.Length > 0 Then
		httpRequest.SetHeader("User-Agent",UserAgent)
	End If
	
	Dim job As XHttpJob
	job.Initialize()
	job.Request = request
	
	CallSubDelayed3(XHttpService, "Execute", httpRequest,job)	
	Return job

End Sub