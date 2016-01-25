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
	Public Files As List
	Private size As Int
End Sub



'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(pUrl As String,pMethod As String)
	Cookies.Initialize()
	Parameters.Initialize()
	Data.Initialize()
	Method = pMethod
	Url = pUrl
	Files.Initialize()
	
End Sub

Public Sub GetXInputStream(boundary As String) As XInputStream

	Dim size As Int = 0
	Dim cisb As CompositeInputStreamBuilder
	
	
	Dim sb As StringBuilder
	sb.Initialize()

	For i = 0 To Data.Size-1
		sb.Append("--" & boundary)
		sb.Append(Chr(13) & Chr(10))
		sb.Append("Content-Disposition: form-data; name=" & QUOTE & Data.GetKeyAt(i) & QUOTE)
		sb.Append(Chr(13) & Chr(10))
		sb.Append(Chr(13) & Chr(10))
		sb.Append(Data.GetValueAt(i))
		sb.Append(Chr(13) & Chr(10))
	Next
	
	size = size + AddString(cisb,sb.ToString)

	
	For i = 0 To Files.Size-1
		Dim uploadfile As XFile = Files.Get(i)
		
		Dim sb2 As StringBuilder
		sb2.Initialize()
		sb2.Append("--"&boundary)
		sb2.Append(Chr(13) & Chr(10))
		sb2.Append("Content-Type: " & uploadfile.ContentType & Chr(13) & Chr(10))
		sb2.Append("Content-Disposition: form-data; name=" & QUOTE & Data.GetKeyAt(i) & QUOTE & "; filename=" & QUOTE & uploadfile.FileName & QUOTE)
		sb2.Append(Chr(13) & Chr(10))
		sb2.Append(Chr(13) & Chr(10))
		
		size = size + AddString(cisb,sb2.ToString)
		size = size + AddFile(cisb,uploadfile.Directory,uploadfile.FileName)
		size = size + AddString(cisb,Chr(13) & Chr(10))
	Next
	
	size = size + AddString(cisb,"--" & boundary & "--" & Chr(13) & Chr(10))
	
	Dim ret As XInputStream
	ret.Initialize(cisb.Build(),size)
	Return ret
	
End Sub

Private Sub AddFile(cisb As CompositeInputStreamBuilder,dir As String,filePath As String) As Int
	Dim ret As InputStream = File.OpenInput(dir,filePath)
	cisb.AddStream(ret)
	Return File.Size(dir,filePath)
End Sub

Private Sub AddString(cisb As CompositeInputStreamBuilder,input As String) As Int
	Dim bytes() As Byte = input.GetBytes("UTF-8")
	cisb.AddBytes(bytes)
	Return bytes.Length
End Sub



