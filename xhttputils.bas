Type=Class
Version=5.5
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Class module
Sub Class_Globals
	Private client As XHttpClient
	Private token As String
	Public Username As String = Null
	Public Password As String = Null
	
	
End Sub


Public Sub Initialize(pBaseUrl As String,pUsername As String,pPassword As String)
	client.Initialize(pBaseUrl)
	Username = pUsername
	Password = pPassword

End Sub

public Sub FacebookLogin As XHttpJob
	Dim request As XHttpRequest
	request.Initialize("/json/reply/Authenticate","POST")
	request.Data.Put("provider","twitter")
	Return Execute(request)
End Sub


public Sub Authenticate As XHttpJob
	Dim request As XHttpRequest
	request.Initialize("/json/reply/Authenticate","POST")
	If Username <> Null Then request.Data.Put("UserName",Username)
	If Password <> Null Then request.Data.Put("Password",Password)
	request.Data.Put("provider","credentials")
	Return Execute(request).OnSuccess(Me,"SetAuthToken")
	
End Sub

public Sub Logout As XHttpJob
	Dim request As XHttpRequest
	request.Initialize("/json/reply/Authenticate","POST")
	request.Data.Put("provider","logout")
	Return Execute(request).OnSuccess(Me,"RemoveAuthToken")
	
End Sub

private Sub SetAuthToken(response As Map)
	token = response.Get("SessionId")
End Sub

private Sub RemoveAuthToken(response As Map)
	token = Null
End Sub

public Sub Execute(request As XHttpRequest) As XHttpJob
	If token <> Null And token.Trim <> "" Then
		request.Cookies.Put("ss-id",token)
	End If
	
	Return client.Execute(request)
End Sub

public Sub GetMedia(args As Map) As XHttpJob
	Dim Request As XHttpRequest
	Request.Initialize("/json/reply/GetMedia","GET")
	Request.Parameters = args
	Return Execute(Request)
End Sub

public Sub GetMyProfile() As XHttpJob
	Dim Request As XHttpRequest
	Request.Initialize("/json/reply/GetProfile","GET")
	Return Execute(Request)
End Sub

public Sub GetProfile(userId As Int) As XHttpJob
	Dim Request As XHttpRequest
	Request.Initialize("/json/reply/GetProfile","GET")
	Request.Parameters.Put("Id",userId)
	Return Execute(Request)
End Sub

public Sub UploadMedia(args As Map) As XHttpJob
	Dim Request As XHttpRequest
	Request.Initialize("/json/reply/UploadMedia","POST")
	Request.Data = args
	Return Execute(Request)
End Sub

public Sub UpdateProfile(args As Map) As XHttpJob
	Dim Request As XHttpRequest
	Request.Initialize("/json/oneway/UpdateProfile","PUT")
	Request.Data = args
	Return Execute(Request)
End Sub

public Sub UpdateMedia(args As Map) As XHttpJob
	Dim Request As XHttpRequest
	Request.Initialize("/json/oneway/UpdateProfile","PUT")
	Request.Data = args
	Return Execute(Request)
End Sub

public Sub RequestPayment(saleId As Long) As XHttpJob
	Dim Request As XHttpRequest
	Request.Initialize("/json/oneway/RequestPayment","POST")
	Request.Data.Put("Sale",saleId)
	Return Execute(Request)
End Sub

public Sub GetSales() As XHttpJob
	Dim Request As XHttpRequest
	Request.Initialize("/json/reply/GetSales","GET")
	Return Execute(Request)
End Sub

public Sub GetCountries() As XHttpJob
	Dim Request As XHttpRequest
	Request.Initialize("/json/reply/GetCountries","GET")
	Return Execute(Request)
End Sub

public Sub GetProvinces(countryId As String) As XHttpJob
	Dim Request As XHttpRequest
	Request.Initialize("/json/reply/GetProvinces","GET")
	Request.Parameters.Put("Country",countryId)
	Return Execute(Request)
End Sub

public Sub GetCities(provinceId As String) As XHttpJob
	Dim Request As XHttpRequest
	Request.Initialize("/json/reply/GetCities","GET")
	Request.Parameters.Put("Province",provinceId)
	Return Execute(Request)
End Sub

public Sub GetMediaTypes() As XHttpJob
	Dim Request As XHttpRequest
	Request.Initialize("/json/reply/GetMediaTypes","GET")
	Return Execute(Request)
End Sub

public Sub GetCategories() As XHttpJob
	Dim Request As XHttpRequest
	Request.Initialize("/json/reply/GetCategories","GET")
	Return Execute(Request)
End Sub

public Sub GetDemandTypes() As XHttpJob
	Dim Request As XHttpRequest
	Request.Initialize("/json/reply/GetDemandTypes","GET")
	Return Execute(Request)
End Sub

public Sub GetDemandScopes() As XHttpJob
	Dim Request As XHttpRequest
	Request.Initialize("/json/reply/GetDemandScopes","GET")
	Return Execute(Request)
End Sub