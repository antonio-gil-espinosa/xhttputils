Type=Class
Version=5.5
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Class module
Sub Class_Globals
	Public Request As XHttpRequest
	Public Response As XHttpResponse
	Public SuccessCallbacks As List
	Public ErrorCallbacks As List
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	SuccessCallbacks.Initialize()
	ErrorCallbacks.Initialize()
End Sub

Public Sub OnSuccess(module As Object,routine As String) As XHttpJob
	Dim cb As Callback
	cb.Initialize(module,routine)
	SuccessCallbacks.Add(cb)
	Return Me
End Sub

Public Sub OnError(module As Object,routine As String) As XHttpJob
	Dim cb As Callback
	cb.Initialize(module,routine)
	ErrorCallbacks.Add(cb)
	Return Me
End Sub