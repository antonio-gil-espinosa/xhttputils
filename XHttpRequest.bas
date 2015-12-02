Type=Class
Version=5.5
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Class module
Sub Class_Globals
	Public Data As Map
	Public Parameters As Map
	Public Cookies As Map
	Public Url As String
	Public Method As String
	Public UserAgent As String = Null
End Sub



'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(pUrl As String,pMethod As String)
	Cookies.Initialize()
	Parameters.Initialize()
	Data.Initialize()
	Method = pMethod
	Url = pUrl
End Sub



