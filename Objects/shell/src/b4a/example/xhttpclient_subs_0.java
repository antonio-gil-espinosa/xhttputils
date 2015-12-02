package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class xhttpclient_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public BaseUrl As String";
xhttpclient._baseurl = RemoteObject.createImmutable("");__ref.setField("_baseurl",xhttpclient._baseurl);
 //BA.debugLineNum = 4;BA.debugLine="Private jobs As Map";
xhttpclient._jobs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_jobs",xhttpclient._jobs);
 //BA.debugLineNum = 5;BA.debugLine="Private jobCounter As Int";
xhttpclient._jobcounter = RemoteObject.createImmutable(0);__ref.setField("_jobcounter",xhttpclient._jobcounter);
 //BA.debugLineNum = 6;BA.debugLine="Private client As HttpClient";
xhttpclient._client = RemoteObject.createNew ("anywheresoftware.b4a.http.HttpClientWrapper");__ref.setField("_client",xhttpclient._client);
 //BA.debugLineNum = 7;BA.debugLine="Public UserAgent As String = \"Mozilla/5.0 (Window";
xhttpclient._useragent = BA.ObjectToString("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2227.0 Safari/537.36");__ref.setField("_useragent",xhttpclient._useragent);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _execute(RemoteObject __ref,RemoteObject _request) throws Exception{
try {
		Debug.PushSubsStack("Execute (xhttpclient) ","xhttpclient",1,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("execute")) return __ref.runUserSub(false, "xhttpclient","execute", __ref, _request);
RemoteObject _httprequest = RemoteObject.declareNull("anywheresoftware.b4a.http.HttpClientWrapper.HttpUriRequestWrapper");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _method = RemoteObject.createImmutable("");
RemoteObject _inputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _bytes = null;
RemoteObject _job = RemoteObject.declareNull("b4a.example.xhttpjob");
Debug.locals.put("request", _request);
 BA.debugLineNum = 34;BA.debugLine="Public Sub Execute(request As XHttpRequest) As XHt";
Debug.ShouldStop(2);
 BA.debugLineNum = 37;BA.debugLine="jobCounter = jobCounter + 1";
Debug.ShouldStop(16);
__ref.setField ("_jobcounter",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_jobcounter"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 39;BA.debugLine="Dim httpRequest As HttpRequest";
Debug.ShouldStop(64);
_httprequest = RemoteObject.createNew ("anywheresoftware.b4a.http.HttpClientWrapper.HttpUriRequestWrapper");Debug.locals.put("httpRequest", _httprequest);
 BA.debugLineNum = 40;BA.debugLine="Dim url As String = BaseUrl & request.Url";
Debug.ShouldStop(128);
_url = RemoteObject.concat(__ref.getField(true,"_baseurl"),_request.getField(true,"_url"));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 41;BA.debugLine="If request.Parameters <> Null And request.Paramet";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("N",_request.getField(false,"_parameters")) && RemoteObject.solveBoolean(">",_request.getField(false,"_parameters").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 42;BA.debugLine="url = url & \"?\" & Map2String(request.Parameters,";
Debug.ShouldStop(512);
_url = RemoteObject.concat(_url,RemoteObject.createImmutable("?"),__ref.runClassMethod (b4a.example.xhttpclient.class, "_map2string",(Object)(_request.getField(false,"_parameters")),(Object)(RemoteObject.createImmutable("&"))));Debug.locals.put("url", _url);
 };
 BA.debugLineNum = 46;BA.debugLine="Dim method As String = request.Method.ToUpperCase";
Debug.ShouldStop(8192);
_method = _request.getField(true,"_method").runMethod(true,"toUpperCase");Debug.locals.put("method", _method);Debug.locals.put("method", _method);
 BA.debugLineNum = 48;BA.debugLine="If method = \"GET\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_method,BA.ObjectToString("GET"))) { 
 BA.debugLineNum = 49;BA.debugLine="httpRequest.InitializeGet(url)";
Debug.ShouldStop(65536);
_httprequest.runVoidMethod ("InitializeGet",(Object)(_url));
 }else 
{ BA.debugLineNum = 50;BA.debugLine="Else If method = \"POST\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_method,BA.ObjectToString("POST"))) { 
 BA.debugLineNum = 51;BA.debugLine="Dim inputStream As InputStream";
Debug.ShouldStop(262144);
_inputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("inputStream", _inputstream);
 BA.debugLineNum = 52;BA.debugLine="Dim bytes() As Byte = Map2String(request.Data,\"&";
Debug.ShouldStop(524288);
_bytes = __ref.runClassMethod (b4a.example.xhttpclient.class, "_map2string",(Object)(_request.getField(false,"_data")),(Object)(RemoteObject.createImmutable("&"))).runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("bytes", _bytes);Debug.locals.put("bytes", _bytes);
 BA.debugLineNum = 53;BA.debugLine="inputStream.InitializeFromBytesArray(bytes,0,byt";
Debug.ShouldStop(1048576);
_inputstream.runVoidMethod ("InitializeFromBytesArray",(Object)(_bytes),(Object)(BA.numberCast(int.class, 0)),(Object)(_bytes.getField(true,"length")));
 BA.debugLineNum = 54;BA.debugLine="httpRequest.InitializePost(url,inputStream,bytes";
Debug.ShouldStop(2097152);
_httprequest.runVoidMethod ("InitializePost",(Object)(_url),(Object)((_inputstream.getObject())),(Object)(_bytes.getField(true,"length")));
 }else 
{ BA.debugLineNum = 55;BA.debugLine="Else If method =\"PUT\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_method,BA.ObjectToString("PUT"))) { 
 BA.debugLineNum = 56;BA.debugLine="Dim inputStream As InputStream";
Debug.ShouldStop(8388608);
_inputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("inputStream", _inputstream);
 BA.debugLineNum = 57;BA.debugLine="Dim bytes() As Byte = Map2String(request.Data,\"&";
Debug.ShouldStop(16777216);
_bytes = __ref.runClassMethod (b4a.example.xhttpclient.class, "_map2string",(Object)(_request.getField(false,"_data")),(Object)(RemoteObject.createImmutable("&"))).runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("bytes", _bytes);Debug.locals.put("bytes", _bytes);
 BA.debugLineNum = 58;BA.debugLine="inputStream.InitializeFromBytesArray(bytes,0,byt";
Debug.ShouldStop(33554432);
_inputstream.runVoidMethod ("InitializeFromBytesArray",(Object)(_bytes),(Object)(BA.numberCast(int.class, 0)),(Object)(_bytes.getField(true,"length")));
 BA.debugLineNum = 59;BA.debugLine="httpRequest.InitializePut(url,inputStream,bytes.";
Debug.ShouldStop(67108864);
_httprequest.runVoidMethod ("InitializePut",(Object)(_url),(Object)((_inputstream.getObject())),(Object)(_bytes.getField(true,"length")));
 }else 
{ BA.debugLineNum = 60;BA.debugLine="Else If method =\"DELETE\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_method,BA.ObjectToString("DELETE"))) { 
 BA.debugLineNum = 61;BA.debugLine="httpRequest.InitializeDelete(url)";
Debug.ShouldStop(268435456);
_httprequest.runVoidMethod ("InitializeDelete",(Object)(_url));
 }else {
 }}}};
 BA.debugLineNum = 66;BA.debugLine="If request.Cookies <> Null And request.Cookies.Si";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("N",_request.getField(false,"_cookies")) && RemoteObject.solveBoolean(">",_request.getField(false,"_cookies").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 67;BA.debugLine="httpRequest.SetHeader(\"Cookie\",Map2String(reques";
Debug.ShouldStop(4);
_httprequest.runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Cookie")),(Object)(__ref.runClassMethod (b4a.example.xhttpclient.class, "_map2string",(Object)(_request.getField(false,"_cookies")),(Object)(RemoteObject.createImmutable("; ")))));
 };
 BA.debugLineNum = 71;BA.debugLine="If request.UserAgent <> Null And request.UserAgen";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("N",_request.getField(true,"_useragent")) && RemoteObject.solveBoolean(">",_request.getField(true,"_useragent").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 72;BA.debugLine="httpRequest.SetHeader(\"User-Agent\",request.UserA";
Debug.ShouldStop(128);
_httprequest.runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("User-Agent")),(Object)(_request.getField(true,"_useragent")));
 }else 
{ BA.debugLineNum = 73;BA.debugLine="else If UserAgent  <> Null And UserAgent.Length >";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_useragent")) && RemoteObject.solveBoolean(">",__ref.getField(true,"_useragent").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 74;BA.debugLine="httpRequest.SetHeader(\"User-Agent\",UserAgent)";
Debug.ShouldStop(512);
_httprequest.runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("User-Agent")),(Object)(__ref.getField(true,"_useragent")));
 }};
 BA.debugLineNum = 77;BA.debugLine="Dim job As XHttpJob";
Debug.ShouldStop(4096);
_job = RemoteObject.createNew ("b4a.example.xhttpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 78;BA.debugLine="job.Initialize()";
Debug.ShouldStop(8192);
_job.runClassMethod (b4a.example.xhttpjob.class, "_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 79;BA.debugLine="job.Request = request";
Debug.ShouldStop(16384);
_job.setField ("_request",_request);
 BA.debugLineNum = 81;BA.debugLine="jobs.Put(jobCounter,job)";
Debug.ShouldStop(65536);
__ref.getField(false,"_jobs").runVoidMethod ("Put",(Object)((__ref.getField(true,"_jobcounter"))),(Object)((_job)));
 BA.debugLineNum = 84;BA.debugLine="client.Execute(httpRequest,jobCounter)";
Debug.ShouldStop(524288);
__ref.getField(false,"_client").runVoidMethod ("Execute",__ref.getField(false, "ba"),(Object)(_httprequest),(Object)(__ref.getField(true,"_jobcounter")));
 BA.debugLineNum = 85;BA.debugLine="Return job";
Debug.ShouldStop(1048576);
if (true) return _job;
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _pbaseurl) throws Exception{
try {
		Debug.PushSubsStack("Initialize (xhttpclient) ","xhttpclient",1,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "xhttpclient","initialize", __ref, _ba, _pbaseurl);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("pBaseUrl", _pbaseurl);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(pBaseUrl As String)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="BaseUrl = pBaseUrl";
Debug.ShouldStop(32768);
__ref.setField ("_baseurl",_pbaseurl);
 BA.debugLineNum = 17;BA.debugLine="client.Initialize(\"xhttpclient\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_client").runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("xhttpclient")));
 BA.debugLineNum = 18;BA.debugLine="jobs.Initialize()";
Debug.ShouldStop(131072);
__ref.getField(false,"_jobs").runVoidMethod ("Initialize");
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _map2string(RemoteObject __ref,RemoteObject _map,RemoteObject _separator) throws Exception{
try {
		Debug.PushSubsStack("Map2String (xhttpclient) ","xhttpclient",1,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("map2string")) return __ref.runUserSub(false, "xhttpclient","map2string", __ref, _map, _separator);
RemoteObject _ret = RemoteObject.createImmutable("");
int _i = 0;
Debug.locals.put("map", _map);
Debug.locals.put("separator", _separator);
 BA.debugLineNum = 22;BA.debugLine="Private Sub Map2String(map As Map,separator As Str";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Dim ret As String = \"\"";
Debug.ShouldStop(4194304);
_ret = BA.ObjectToString("");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 25;BA.debugLine="For i = 0 To map.Size-1";
Debug.ShouldStop(16777216);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_map.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2); _i = ((int)(0 + _i + step2)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 26;BA.debugLine="If i > 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 27;BA.debugLine="ret = ret & separator";
Debug.ShouldStop(67108864);
_ret = RemoteObject.concat(_ret,_separator);Debug.locals.put("ret", _ret);
 };
 BA.debugLineNum = 29;BA.debugLine="ret = ret & map.GetKeyAt(i) & \"=\" & map.GetValue";
Debug.ShouldStop(268435456);
_ret = RemoteObject.concat(_ret,_map.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable("="),_map.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ret", _ret);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 31;BA.debugLine="Return ret";
Debug.ShouldStop(1073741824);
if (true) return _ret;
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _response_streamfinish(RemoteObject __ref,RemoteObject _success,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("Response_StreamFinish (xhttpclient) ","xhttpclient",1,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("response_streamfinish")) return __ref.runUserSub(false, "xhttpclient","response_streamfinish", __ref, _success, _taskid);
RemoteObject _job = RemoteObject.declareNull("b4a.example.xhttpjob");
RemoteObject _callback = RemoteObject.declareNull("b4a.example.callback");
RemoteObject _contenttype = RemoteObject.createImmutable("");
RemoteObject _buffer = null;
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
Debug.locals.put("Success", _success);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 101;BA.debugLine="Private Sub Response_StreamFinish (Success As Bool";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 103;BA.debugLine="Dim job As XHttpJob = jobs.Get(TaskId)";
Debug.ShouldStop(64);
_job = (__ref.getField(false,"_jobs").runMethod(false,"Get",(Object)((_taskid))));Debug.locals.put("job", _job);Debug.locals.put("job", _job);
 BA.debugLineNum = 104;BA.debugLine="If Success Then";
Debug.ShouldStop(128);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 105;BA.debugLine="For Each callback As Callback In job.SuccessCal";
Debug.ShouldStop(256);
final RemoteObject group76 = _job.getField(false,"_successcallbacks");
final int groupLen76 = group76.runMethod(true,"getSize").<Integer>get();
for (int index76 = 0;index76 < groupLen76 ;index76++){
_callback = (group76.runMethod(false,"Get",index76));Debug.locals.put("callback", _callback);
Debug.locals.put("callback", _callback);
 BA.debugLineNum = 106;BA.debugLine="Dim contentType As String = job.Response.Conte";
Debug.ShouldStop(512);
_contenttype = _job.getField(false,"_response").getField(true,"_contenttype");Debug.locals.put("contentType", _contenttype);Debug.locals.put("contentType", _contenttype);
 BA.debugLineNum = 107;BA.debugLine="If contentType.Contains(\"application/json\") Th";
Debug.ShouldStop(1024);
if (_contenttype.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("application/json"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 109;BA.debugLine="Dim buffer() As Byte = job.Response.OutputStr";
Debug.ShouldStop(4096);
_buffer = _job.getField(false,"_response").getField(false,"_outputstream").runMethod(false,"ToBytesArray");Debug.locals.put("buffer", _buffer);Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 110;BA.debugLine="Dim str As String = BytesToString(buffer,0,bu";
Debug.ShouldStop(8192);
_str = xhttpclient.__c.runMethod(true,"BytesToString",(Object)(_buffer),(Object)(BA.numberCast(int.class, 0)),(Object)(_buffer.getField(true,"length")),(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 111;BA.debugLine="Dim jsonParser As JSONParser";
Debug.ShouldStop(16384);
_jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jsonParser", _jsonparser);
 BA.debugLineNum = 112;BA.debugLine="jsonParser.Initialize(str)";
Debug.ShouldStop(32768);
_jsonparser.runVoidMethod ("Initialize",(Object)(_str));
 BA.debugLineNum = 113;BA.debugLine="If str.StartsWith(\"{\") Then";
Debug.ShouldStop(65536);
if (_str.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("{"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 114;BA.debugLine="callback.InvokeSubDelayed2(jsonParser.NextOb";
Debug.ShouldStop(131072);
_callback.runClassMethod (b4a.example.callback.class, "_invokesubdelayed2",(Object)((_jsonparser.runMethod(false,"NextObject").getObject())));
 }else 
{ BA.debugLineNum = 116;BA.debugLine="else if str.StartsWith(\"[\") Then";
Debug.ShouldStop(524288);
if (_str.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("["))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 117;BA.debugLine="callback.InvokeSubDelayed2(jsonParser.NextAr";
Debug.ShouldStop(1048576);
_callback.runClassMethod (b4a.example.callback.class, "_invokesubdelayed2",(Object)((_jsonparser.runMethod(false,"NextArray").getObject())));
 }else {
 BA.debugLineNum = 119;BA.debugLine="callback.InvokeSubDelayed2(jsonParser.NextVa";
Debug.ShouldStop(4194304);
_callback.runClassMethod (b4a.example.callback.class, "_invokesubdelayed2",(Object)(_jsonparser.runMethod(false,"NextValue")));
 }};
 }else {
 BA.debugLineNum = 123;BA.debugLine="callback.InvokeSubDelayed2(job.Response)";
Debug.ShouldStop(67108864);
_callback.runClassMethod (b4a.example.callback.class, "_invokesubdelayed2",(Object)((_job.getField(false,"_response"))));
 };
 }
Debug.locals.put("callback", _callback);
;
 }else {
 BA.debugLineNum = 127;BA.debugLine="For Each callback As Callback In job.ErrorCallb";
Debug.ShouldStop(1073741824);
final RemoteObject group95 = _job.getField(false,"_errorcallbacks");
final int groupLen95 = group95.runMethod(true,"getSize").<Integer>get();
for (int index95 = 0;index95 < groupLen95 ;index95++){
_callback = (group95.runMethod(false,"Get",index95));Debug.locals.put("callback", _callback);
Debug.locals.put("callback", _callback);
 BA.debugLineNum = 128;BA.debugLine="callback.InvokeSubDelayed2(job.Response)";
Debug.ShouldStop(-2147483648);
_callback.runClassMethod (b4a.example.callback.class, "_invokesubdelayed2",(Object)((_job.getField(false,"_response"))));
 }
Debug.locals.put("callback", _callback);
;
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e100) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e100.toString()); BA.debugLineNum = 132;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(8);
xhttpclient.__c.runVoidMethod ("Log",(Object)(xhttpclient.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA")).runMethod(true,"getMessage")));
 };
 BA.debugLineNum = 135;BA.debugLine="If jobs.ContainsKey(TaskId) Then";
Debug.ShouldStop(64);
if (__ref.getField(false,"_jobs").runMethod(true,"ContainsKey",(Object)((_taskid))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 136;BA.debugLine="jobs.Remove(TaskId)";
Debug.ShouldStop(128);
__ref.getField(false,"_jobs").runVoidMethod ("Remove",(Object)((_taskid)));
 };
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xhttpclient_responseerror(RemoteObject __ref,RemoteObject _response,RemoteObject _reason,RemoteObject _statuscode,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("xhttpclient_ResponseError (xhttpclient) ","xhttpclient",1,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("xhttpclient_responseerror")) return __ref.runUserSub(false, "xhttpclient","xhttpclient_responseerror", __ref, _response, _reason, _statuscode, _taskid);
RemoteObject _job = RemoteObject.declareNull("b4a.example.xhttpjob");
RemoteObject _callback = RemoteObject.declareNull("b4a.example.callback");
Debug.locals.put("response", _response);
Debug.locals.put("reason", _reason);
Debug.locals.put("statusCode", _statuscode);
Debug.locals.put("taskId", _taskid);
 BA.debugLineNum = 141;BA.debugLine="Sub xhttpclient_ResponseError (response As HttpRe";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="Dim job As XHttpJob = jobs.Get(taskId)";
Debug.ShouldStop(8192);
_job = (__ref.getField(false,"_jobs").runMethod(false,"Get",(Object)((_taskid))));Debug.locals.put("job", _job);Debug.locals.put("job", _job);
 BA.debugLineNum = 143;BA.debugLine="For Each callback As Callback In job.ErrorCallbac";
Debug.ShouldStop(16384);
final RemoteObject group108 = _job.getField(false,"_errorcallbacks");
final int groupLen108 = group108.runMethod(true,"getSize").<Integer>get();
for (int index108 = 0;index108 < groupLen108 ;index108++){
_callback = (group108.runMethod(false,"Get",index108));Debug.locals.put("callback", _callback);
Debug.locals.put("callback", _callback);
 BA.debugLineNum = 144;BA.debugLine="callback.InvokeSubDelayed2(job.Response)";
Debug.ShouldStop(32768);
_callback.runClassMethod (b4a.example.callback.class, "_invokesubdelayed2",(Object)((_job.getField(false,"_response"))));
 }
Debug.locals.put("callback", _callback);
;
 BA.debugLineNum = 146;BA.debugLine="jobs.Remove(taskId)";
Debug.ShouldStop(131072);
__ref.getField(false,"_jobs").runVoidMethod ("Remove",(Object)((_taskid)));
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xhttpclient_responsesuccess(RemoteObject __ref,RemoteObject _response,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("xhttpclient_ResponseSuccess (xhttpclient) ","xhttpclient",1,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("xhttpclient_responsesuccess")) return __ref.runUserSub(false, "xhttpclient","xhttpclient_responsesuccess", __ref, _response, _taskid);
RemoteObject _job = RemoteObject.declareNull("b4a.example.xhttpjob");
RemoteObject _xresponse = RemoteObject.declareNull("b4a.example.xhttpresponse");
Debug.locals.put("response", _response);
Debug.locals.put("taskId", _taskid);
 BA.debugLineNum = 88;BA.debugLine="Sub xhttpclient_ResponseSuccess (response As HttpR";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="Dim job As XHttpJob = jobs.Get(taskId)";
Debug.ShouldStop(16777216);
_job = (__ref.getField(false,"_jobs").runMethod(false,"Get",(Object)((_taskid))));Debug.locals.put("job", _job);Debug.locals.put("job", _job);
 BA.debugLineNum = 90;BA.debugLine="Dim xResponse As XHttpResponse";
Debug.ShouldStop(33554432);
_xresponse = RemoteObject.createNew ("b4a.example.xhttpresponse");Debug.locals.put("xResponse", _xresponse);
 BA.debugLineNum = 91;BA.debugLine="xResponse.Initialize()";
Debug.ShouldStop(67108864);
_xresponse.runClassMethod (b4a.example.xhttpresponse.class, "_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 92;BA.debugLine="xResponse.ContentType = response.ContentType";
Debug.ShouldStop(134217728);
_xresponse.setField ("_contenttype",_response.runMethod(true,"getContentType"));
 BA.debugLineNum = 93;BA.debugLine="xResponse.ContentLength = response.ContentLength";
Debug.ShouldStop(268435456);
_xresponse.setField ("_contentlength",BA.numberCast(int.class, _response.runMethod(true,"getContentLength")));
 BA.debugLineNum = 94;BA.debugLine="xResponse.StatusCode = response.StatusCode";
Debug.ShouldStop(536870912);
_xresponse.setField ("_statuscode",_response.runMethod(true,"getStatusCode"));
 BA.debugLineNum = 96;BA.debugLine="job.Response = xResponse";
Debug.ShouldStop(-2147483648);
_job.setField ("_response",_xresponse);
 BA.debugLineNum = 97;BA.debugLine="job.Response.OutputStream.InitializeToBytesArray";
Debug.ShouldStop(1);
_job.getField(false,"_response").getField(false,"_outputstream").runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 98;BA.debugLine="response.GetAsynchronously(\"response\", xResponse";
Debug.ShouldStop(2);
_response.runVoidMethod ("GetAsynchronously",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("response")),(Object)((_xresponse.getField(false,"_outputstream").getObject())),(Object)(xhttpclient.__c.getField(true,"True")),(Object)(_taskid));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}