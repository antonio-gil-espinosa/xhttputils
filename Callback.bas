Type=Class
Version=5.5
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Class module
Sub Class_Globals
	Private Module As Object
	Private Routine As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(pModule As Object,pRoutine As String)
	Module=pModule
	Routine = pRoutine
 
End Sub

public Sub InvokeSub()As Object
	Return CallSub(Module,Routine)
End Sub

public Sub InvokeSub2(arg1 As Object)As Object
	Return CallSub2(Module,Routine,arg1)
End Sub

public Sub InvokeSub3(arg1 As Object,arg2 As Object) As Object
	Return CallSub3(Module,Routine,arg1,arg2)
End Sub

public Sub InvokeSubDelayed()
	CallSubDelayed(Module,Routine)
End Sub

public Sub InvokeSubDelayed2(arg1 As Object)
	CallSubDelayed2(Module,Routine,arg1)
End Sub

public Sub InvokeSubDelayed3(arg1 As Object,arg2 As Object)
	CallSubDelayed3(Module,Routine,arg1,arg2)
End Sub


