Type=Class
Version=5.5
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Class module
Sub Class_Globals
	Public OutputStream As OutputStream
	Public ContentType As String
	Public ContentLength As Int
	Public StatusCode As Int
	Public Headers As Map
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	Headers.Initialize
End Sub