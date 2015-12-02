package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class xhttpjob_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Request As XHttpRequest";
xhttpjob._request = RemoteObject.createNew ("b4a.example.xhttprequest");__ref.setField("_request",xhttpjob._request);
 //BA.debugLineNum = 4;BA.debugLine="Public Response As XHttpResponse";
xhttpjob._response = RemoteObject.createNew ("b4a.example.xhttpresponse");__ref.setField("_response",xhttpjob._response);
 //BA.debugLineNum = 5;BA.debugLine="Public SuccessCallbacks As List";
xhttpjob._successcallbacks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_successcallbacks",xhttpjob._successcallbacks);
 //BA.debugLineNum = 6;BA.debugLine="Public ErrorCallbacks As List";
xhttpjob._errorcallbacks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_errorcallbacks",xhttpjob._errorcallbacks);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (xhttpjob) ","xhttpjob",4,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "xhttpjob","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="SuccessCallbacks.Initialize()";
Debug.ShouldStop(1024);
__ref.getField(false,"_successcallbacks").runVoidMethod ("Initialize");
 BA.debugLineNum = 12;BA.debugLine="ErrorCallbacks.Initialize()";
Debug.ShouldStop(2048);
__ref.getField(false,"_errorcallbacks").runVoidMethod ("Initialize");
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _onerror(RemoteObject __ref,RemoteObject _module,RemoteObject _routine) throws Exception{
try {
		Debug.PushSubsStack("OnError (xhttpjob) ","xhttpjob",4,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("onerror")) return __ref.runUserSub(false, "xhttpjob","onerror", __ref, _module, _routine);
RemoteObject _cb = RemoteObject.declareNull("b4a.example.callback");
Debug.locals.put("module", _module);
Debug.locals.put("routine", _routine);
 BA.debugLineNum = 22;BA.debugLine="Public Sub OnError(module As Object,routine As Str";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Dim cb As Callback";
Debug.ShouldStop(4194304);
_cb = RemoteObject.createNew ("b4a.example.callback");Debug.locals.put("cb", _cb);
 BA.debugLineNum = 24;BA.debugLine="cb.Initialize(module,routine)";
Debug.ShouldStop(8388608);
_cb.runClassMethod (b4a.example.callback.class, "_initialize",__ref.getField(false, "ba"),(Object)(_module),(Object)(_routine));
 BA.debugLineNum = 25;BA.debugLine="ErrorCallbacks.Add(cb)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_errorcallbacks").runVoidMethod ("Add",(Object)((_cb)));
 BA.debugLineNum = 26;BA.debugLine="Return Me";
Debug.ShouldStop(33554432);
if (true) return (__ref);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _onsuccess(RemoteObject __ref,RemoteObject _module,RemoteObject _routine) throws Exception{
try {
		Debug.PushSubsStack("OnSuccess (xhttpjob) ","xhttpjob",4,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("onsuccess")) return __ref.runUserSub(false, "xhttpjob","onsuccess", __ref, _module, _routine);
RemoteObject _cb = RemoteObject.declareNull("b4a.example.callback");
Debug.locals.put("module", _module);
Debug.locals.put("routine", _routine);
 BA.debugLineNum = 15;BA.debugLine="Public Sub OnSuccess(module As Object,routine As S";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Dim cb As Callback";
Debug.ShouldStop(32768);
_cb = RemoteObject.createNew ("b4a.example.callback");Debug.locals.put("cb", _cb);
 BA.debugLineNum = 17;BA.debugLine="cb.Initialize(module,routine)";
Debug.ShouldStop(65536);
_cb.runClassMethod (b4a.example.callback.class, "_initialize",__ref.getField(false, "ba"),(Object)(_module),(Object)(_routine));
 BA.debugLineNum = 18;BA.debugLine="SuccessCallbacks.Add(cb)";
Debug.ShouldStop(131072);
__ref.getField(false,"_successcallbacks").runVoidMethod ("Add",(Object)((_cb)));
 BA.debugLineNum = 19;BA.debugLine="Return Me";
Debug.ShouldStop(262144);
if (true) return (__ref);
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}