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
public Sub GetModule()As Object
	Return Module
End Sub

public Sub GetRoutine()As String
	Return Routine
End Sub


