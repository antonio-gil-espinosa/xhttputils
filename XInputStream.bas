Type=Class
Version=5.5
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Class module
Sub Class_Globals
		Private size As Int
		Private steam As InputStream
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(inputStream As InputStream,length As Int)
	size = length
	steam = inputStream 
End Sub

public Sub GetSize() As Int
	Return size
End Sub

public Sub GetInputStream() As InputStream
	Return steam
End Sub

