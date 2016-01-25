Type=Class
Version=5.5
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Class module
Sub Class_Globals
	Private inputStreams As List
	Private position As Int
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(streams() As InputStream)
	inputStreams.Initialize()
	position = 0

	For i = 0 To streams.Length-1 
		Dim inputStream As InputStream = streams(i)
		inputStreams.Add(inputStream)
	Next

End Sub

Public Sub IsInitialized() As Boolean
	 For i = 0 To inputStreams.Size-1 
		Dim inputStream As InputStream = inputStreams.Get(i)
		If(inputStream.IsInitialized() = False) Then
			Return False
		End If
	Next
	Return True
End Sub

public Sub InitializeFromBytesArray(x() As Byte,y As Int,z As Int)
	
	
End Sub
public Sub ReadBytes(buffer() As Byte,startOffset As Int,maxCount As Int) As Int
	Dim readTotal As Int = 0
	Do While (readTotal < maxCount And position < inputStreams.Size-1 )
		Dim inputStream As InputStream = inputStreams.Get(position)
		
		
		Dim read As String = inputStream.ReadBytes(buffer,startOffset,maxCount)
		
		If read < 1 Then
			inputStream.Close()
			position = position + 1
			If position = inputStreams.Size Then
				Exit
			End If
		Else
			readTotal = readTotal + read 
		End If
	Loop
	Return readTotal
End Sub


public Sub BytesAvailable() As Int
	Dim avaliable As Int = 0

	For i = 0 To inputStreams.Size
		Dim inputStream As InputStream = inputStreams.Get(i)
		avaliable = avaliable + inputStream.BytesAvailable()
	Next
	
	Return avaliable
End Sub

Public Sub Close()
	For i = position To inputStreams.Size-1 
		Dim inputStream As InputStream = inputStreams.Get(i)
		inputStream.Close()
	Next
End Sub