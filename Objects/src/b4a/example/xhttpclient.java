package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class xhttpclient extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.xhttpclient");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.xhttpclient.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _baseurl = "";
public anywheresoftware.b4a.objects.collections.Map _jobs = null;
public int _jobcounter = 0;
public anywheresoftware.b4a.http.HttpClientWrapper _client = null;
public String _useragent = "";
public b4a.example.main _main = null;
public String  _class_globals(b4a.example.xhttpclient __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xhttpclient";
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Public BaseUrl As String";
_baseurl = "";
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Private jobs As Map";
_jobs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Private jobCounter As Int";
_jobcounter = 0;
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="Private client As HttpClient";
_client = new anywheresoftware.b4a.http.HttpClientWrapper();
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Public UserAgent As String = \"Mozilla/5.0 (Window";
_useragent = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2227.0 Safari/537.36";
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="End Sub";
return "";
}
public b4a.example.xhttpjob  _execute(b4a.example.xhttpclient __ref,b4a.example.xhttprequest _request) throws Exception{
__ref = this;
RDebugUtils.currentModule="xhttpclient";
if (Debug.shouldDelegate("execute"))
	return (b4a.example.xhttpjob) Debug.delegate(ba, "execute", new Object[] {_request});
anywheresoftware.b4a.http.HttpClientWrapper.HttpUriRequestWrapper _httprequest = null;
String _url = "";
String _method = "";
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream = null;
byte[] _bytes = null;
b4a.example.xhttpjob _job = null;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Execute(request As XHttpRequest) As XHt";
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="jobCounter = jobCounter + 1";
__ref._jobcounter = (int) (__ref._jobcounter+1);
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Dim httpRequest As HttpRequest";
_httprequest = new anywheresoftware.b4a.http.HttpClientWrapper.HttpUriRequestWrapper();
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="Dim url As String = BaseUrl & request.Url";
_url = __ref._baseurl+_request._url;
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="If request.Parameters <> Null And request.Paramet";
if (_request._parameters!= null && _request._parameters.getSize()>0) { 
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="url = url & \"?\" & Map2String(request.Parameters,";
_url = _url+"?"+__ref._map2string(null,_request._parameters,"&");
 };
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="Dim method As String = request.Method.ToUpperCase";
_method = _request._method.toUpperCase();
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="If method = \"GET\" Then";
if ((_method).equals("GET")) { 
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="httpRequest.InitializeGet(url)";
_httprequest.InitializeGet(_url);
 }else 
{RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="Else If method = \"POST\" Then";
if ((_method).equals("POST")) { 
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="Dim inputStream As InputStream";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=983058;
 //BA.debugLineNum = 983058;BA.debugLine="Dim bytes() As Byte = Map2String(request.Data,\"&";
_bytes = __ref._map2string(null,_request._data,"&").getBytes("UTF8");
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="inputStream.InitializeFromBytesArray(bytes,0,byt";
_inputstream.InitializeFromBytesArray(_bytes,(int) (0),_bytes.length);
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="httpRequest.InitializePost(url,inputStream,bytes";
_httprequest.InitializePost(_url,(java.io.InputStream)(_inputstream.getObject()),_bytes.length);
 }else 
{RDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="Else If method =\"PUT\" Then";
if ((_method).equals("PUT")) { 
RDebugUtils.currentLine=983062;
 //BA.debugLineNum = 983062;BA.debugLine="Dim inputStream As InputStream";
_inputstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=983063;
 //BA.debugLineNum = 983063;BA.debugLine="Dim bytes() As Byte = Map2String(request.Data,\"&";
_bytes = __ref._map2string(null,_request._data,"&").getBytes("UTF8");
RDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="inputStream.InitializeFromBytesArray(bytes,0,byt";
_inputstream.InitializeFromBytesArray(_bytes,(int) (0),_bytes.length);
RDebugUtils.currentLine=983065;
 //BA.debugLineNum = 983065;BA.debugLine="httpRequest.InitializePut(url,inputStream,bytes.";
_httprequest.InitializePut(_url,(java.io.InputStream)(_inputstream.getObject()),_bytes.length);
 }else 
{RDebugUtils.currentLine=983066;
 //BA.debugLineNum = 983066;BA.debugLine="Else If method =\"DELETE\" Then";
if ((_method).equals("DELETE")) { 
RDebugUtils.currentLine=983067;
 //BA.debugLineNum = 983067;BA.debugLine="httpRequest.InitializeDelete(url)";
_httprequest.InitializeDelete(_url);
 }else {
 }}}};
RDebugUtils.currentLine=983072;
 //BA.debugLineNum = 983072;BA.debugLine="If request.Cookies <> Null And request.Cookies.Si";
if (_request._cookies!= null && _request._cookies.getSize()>0) { 
RDebugUtils.currentLine=983073;
 //BA.debugLineNum = 983073;BA.debugLine="httpRequest.SetHeader(\"Cookie\",Map2String(reques";
_httprequest.SetHeader("Cookie",__ref._map2string(null,_request._cookies,"; "));
 };
RDebugUtils.currentLine=983077;
 //BA.debugLineNum = 983077;BA.debugLine="If request.UserAgent <> Null And request.UserAgen";
if (_request._useragent!= null && _request._useragent.length()>0) { 
RDebugUtils.currentLine=983078;
 //BA.debugLineNum = 983078;BA.debugLine="httpRequest.SetHeader(\"User-Agent\",request.UserA";
_httprequest.SetHeader("User-Agent",_request._useragent);
 }else 
{RDebugUtils.currentLine=983079;
 //BA.debugLineNum = 983079;BA.debugLine="else If UserAgent  <> Null And UserAgent.Length >";
if (__ref._useragent!= null && __ref._useragent.length()>0) { 
RDebugUtils.currentLine=983080;
 //BA.debugLineNum = 983080;BA.debugLine="httpRequest.SetHeader(\"User-Agent\",UserAgent)";
_httprequest.SetHeader("User-Agent",__ref._useragent);
 }};
RDebugUtils.currentLine=983083;
 //BA.debugLineNum = 983083;BA.debugLine="Dim job As XHttpJob";
_job = new b4a.example.xhttpjob();
RDebugUtils.currentLine=983084;
 //BA.debugLineNum = 983084;BA.debugLine="job.Initialize()";
_job._initialize(null,ba);
RDebugUtils.currentLine=983085;
 //BA.debugLineNum = 983085;BA.debugLine="job.Request = request";
_job._request = _request;
RDebugUtils.currentLine=983087;
 //BA.debugLineNum = 983087;BA.debugLine="jobs.Put(jobCounter,job)";
__ref._jobs.Put((Object)(__ref._jobcounter),(Object)(_job));
RDebugUtils.currentLine=983090;
 //BA.debugLineNum = 983090;BA.debugLine="client.Execute(httpRequest,jobCounter)";
__ref._client.Execute(ba,_httprequest,__ref._jobcounter);
RDebugUtils.currentLine=983091;
 //BA.debugLineNum = 983091;BA.debugLine="Return job";
if (true) return _job;
RDebugUtils.currentLine=983092;
 //BA.debugLineNum = 983092;BA.debugLine="End Sub";
return null;
}
public String  _map2string(b4a.example.xhttpclient __ref,anywheresoftware.b4a.objects.collections.Map _map,String _separator) throws Exception{
__ref = this;
RDebugUtils.currentModule="xhttpclient";
if (Debug.shouldDelegate("map2string"))
	return (String) Debug.delegate(ba, "map2string", new Object[] {_map,_separator});
String _ret = "";
int _i = 0;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub Map2String(map As Map,separator As Str";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Dim ret As String = \"\"";
_ret = "";
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="For i = 0 To map.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (_map.getSize()-1);
for (_i = (int) (0) ; (step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2); _i = ((int)(0 + _i + step2)) ) {
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="ret = ret & separator";
_ret = _ret+_separator;
 };
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="ret = ret & map.GetKeyAt(i) & \"=\" & map.GetValue";
_ret = _ret+BA.ObjectToString(_map.GetKeyAt(_i))+"="+BA.ObjectToString(_map.GetValueAt(_i));
 }
};
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.xhttpclient __ref,anywheresoftware.b4a.BA _ba,String _pbaseurl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xhttpclient";
if (Debug.shouldDelegate("initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba,_pbaseurl});
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub Initialize(pBaseUrl As String)";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="BaseUrl = pBaseUrl";
__ref._baseurl = _pbaseurl;
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="client.Initialize(\"xhttpclient\")";
__ref._client.Initialize("xhttpclient");
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="jobs.Initialize()";
__ref._jobs.Initialize();
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="End Sub";
return "";
}
public String  _response_streamfinish(b4a.example.xhttpclient __ref,boolean _success,int _taskid) throws Exception{
__ref = this;
RDebugUtils.currentModule="xhttpclient";
if (Debug.shouldDelegate("response_streamfinish"))
	return (String) Debug.delegate(ba, "response_streamfinish", new Object[] {_success,_taskid});
b4a.example.xhttpjob _job = null;
b4a.example.callback _callback = null;
String _contenttype = "";
byte[] _buffer = null;
String _str = "";
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub Response_StreamFinish (Success As Bool";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Try";
try {RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Dim job As XHttpJob = jobs.Get(TaskId)";
_job = (b4a.example.xhttpjob)(__ref._jobs.Get((Object)(_taskid)));
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="For Each callback As Callback In job.SuccessCal";
final anywheresoftware.b4a.BA.IterableList group76 = _job._successcallbacks;
final int groupLen76 = group76.getSize();
for (int index76 = 0;index76 < groupLen76 ;index76++){
_callback = (b4a.example.callback)(group76.Get(index76));
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="Dim contentType As String = job.Response.Conte";
_contenttype = _job._response._contenttype;
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="If contentType.Contains(\"application/json\") Th";
if (_contenttype.contains("application/json")) { 
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="Dim buffer() As Byte = job.Response.OutputStr";
_buffer = _job._response._outputstream.ToBytesArray();
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="Dim str As String = BytesToString(buffer,0,bu";
_str = __c.BytesToString(_buffer,(int) (0),_buffer.length,"UTF8");
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="jsonParser.Initialize(str)";
_jsonparser.Initialize(_str);
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="If str.StartsWith(\"{\") Then";
if (_str.startsWith("{")) { 
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="callback.InvokeSubDelayed2(jsonParser.NextOb";
_callback._invokesubdelayed2(null,(Object)(_jsonparser.NextObject().getObject()));
 }else 
{RDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="else if str.StartsWith(\"[\") Then";
if (_str.startsWith("[")) { 
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="callback.InvokeSubDelayed2(jsonParser.NextAr";
_callback._invokesubdelayed2(null,(Object)(_jsonparser.NextArray().getObject()));
 }else {
RDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="callback.InvokeSubDelayed2(jsonParser.NextVa";
_callback._invokesubdelayed2(null,_jsonparser.NextValue());
 }};
 }else {
RDebugUtils.currentLine=1114134;
 //BA.debugLineNum = 1114134;BA.debugLine="callback.InvokeSubDelayed2(job.Response)";
_callback._invokesubdelayed2(null,(Object)(_job._response));
 };
 }
;
 }else {
RDebugUtils.currentLine=1114138;
 //BA.debugLineNum = 1114138;BA.debugLine="For Each callback As Callback In job.ErrorCallb";
final anywheresoftware.b4a.BA.IterableList group95 = _job._errorcallbacks;
final int groupLen95 = group95.getSize();
for (int index95 = 0;index95 < groupLen95 ;index95++){
_callback = (b4a.example.callback)(group95.Get(index95));
RDebugUtils.currentLine=1114139;
 //BA.debugLineNum = 1114139;BA.debugLine="callback.InvokeSubDelayed2(job.Response)";
_callback._invokesubdelayed2(null,(Object)(_job._response));
 }
;
 };
 } 
       catch (Exception e100) {
			ba.setLastException(e100);RDebugUtils.currentLine=1114143;
 //BA.debugLineNum = 1114143;BA.debugLine="Log(LastException.Message)";
__c.Log(__c.LastException(getActivityBA()).getMessage());
 };
RDebugUtils.currentLine=1114146;
 //BA.debugLineNum = 1114146;BA.debugLine="If jobs.ContainsKey(TaskId) Then";
if (__ref._jobs.ContainsKey((Object)(_taskid))) { 
RDebugUtils.currentLine=1114147;
 //BA.debugLineNum = 1114147;BA.debugLine="jobs.Remove(TaskId)";
__ref._jobs.Remove((Object)(_taskid));
 };
RDebugUtils.currentLine=1114149;
 //BA.debugLineNum = 1114149;BA.debugLine="End Sub";
return "";
}
public String  _xhttpclient_responseerror(b4a.example.xhttpclient __ref,anywheresoftware.b4a.http.HttpClientWrapper.HttpResponeWrapper _response,String _reason,int _statuscode,int _taskid) throws Exception{
__ref = this;
RDebugUtils.currentModule="xhttpclient";
if (Debug.shouldDelegate("xhttpclient_responseerror"))
	return (String) Debug.delegate(ba, "xhttpclient_responseerror", new Object[] {_response,_reason,_statuscode,_taskid});
b4a.example.xhttpjob _job = null;
b4a.example.callback _callback = null;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub xhttpclient_ResponseError (response As HttpRe";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Dim job As XHttpJob = jobs.Get(taskId)";
_job = (b4a.example.xhttpjob)(__ref._jobs.Get((Object)(_taskid)));
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="For Each callback As Callback In job.ErrorCallbac";
final anywheresoftware.b4a.BA.IterableList group108 = _job._errorcallbacks;
final int groupLen108 = group108.getSize();
for (int index108 = 0;index108 < groupLen108 ;index108++){
_callback = (b4a.example.callback)(group108.Get(index108));
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="callback.InvokeSubDelayed2(job.Response)";
_callback._invokesubdelayed2(null,(Object)(_job._response));
 }
;
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="jobs.Remove(taskId)";
__ref._jobs.Remove((Object)(_taskid));
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="End Sub";
return "";
}
public String  _xhttpclient_responsesuccess(b4a.example.xhttpclient __ref,anywheresoftware.b4a.http.HttpClientWrapper.HttpResponeWrapper _response,int _taskid) throws Exception{
__ref = this;
RDebugUtils.currentModule="xhttpclient";
if (Debug.shouldDelegate("xhttpclient_responsesuccess"))
	return (String) Debug.delegate(ba, "xhttpclient_responsesuccess", new Object[] {_response,_taskid});
b4a.example.xhttpjob _job = null;
b4a.example.xhttpresponse _xresponse = null;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub xhttpclient_ResponseSuccess (response As HttpR";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Dim job As XHttpJob = jobs.Get(taskId)";
_job = (b4a.example.xhttpjob)(__ref._jobs.Get((Object)(_taskid)));
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Dim xResponse As XHttpResponse";
_xresponse = new b4a.example.xhttpresponse();
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="xResponse.Initialize()";
_xresponse._initialize(null,ba);
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="xResponse.ContentType = response.ContentType";
_xresponse._contenttype = _response.getContentType();
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="xResponse.ContentLength = response.ContentLength";
_xresponse._contentlength = (int) (_response.getContentLength());
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="xResponse.StatusCode = response.StatusCode";
_xresponse._statuscode = _response.getStatusCode();
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="job.Response = xResponse";
_job._response = _xresponse;
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="job.Response.OutputStream.InitializeToBytesArray";
_job._response._outputstream.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="response.GetAsynchronously(\"response\", xResponse";
_response.GetAsynchronously(ba,"response",(java.io.OutputStream)(_xresponse._outputstream.getObject()),__c.True,_taskid);
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="End Sub";
return "";
}
}