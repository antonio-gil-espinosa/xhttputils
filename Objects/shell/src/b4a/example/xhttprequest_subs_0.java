package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class xhttprequest_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Data As Map";
xhttprequest._data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_data",xhttprequest._data);
 //BA.debugLineNum = 4;BA.debugLine="Public Parameters As Map";
xhttprequest._parameters = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_parameters",xhttprequest._parameters);
 //BA.debugLineNum = 5;BA.debugLine="Public Cookies As Map";
xhttprequest._cookies = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_cookies",xhttprequest._cookies);
 //BA.debugLineNum = 6;BA.debugLine="Public Url As String";
xhttprequest._url = RemoteObject.createImmutable("");__ref.setField("_url",xhttprequest._url);
 //BA.debugLineNum = 7;BA.debugLine="Public Method As String";
xhttprequest._method = RemoteObject.createImmutable("");__ref.setField("_method",xhttprequest._method);
 //BA.debugLineNum = 8;BA.debugLine="Public UserAgent As String = Null";
xhttprequest._useragent = BA.ObjectToString(xhttprequest.__c.getField(false,"Null"));__ref.setField("_useragent",xhttprequest._useragent);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _purl,RemoteObject _pmethod) throws Exception{
try {
		Debug.PushSubsStack("Initialize (xhttprequest) ","xhttprequest",2,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "xhttprequest","initialize", __ref, _ba, _purl, _pmethod);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("pUrl", _purl);
Debug.locals.put("pMethod", _pmethod);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(pUrl As String,pMethod As St";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Cookies.Initialize()";
Debug.ShouldStop(16384);
__ref.getField(false,"_cookies").runVoidMethod ("Initialize");
 BA.debugLineNum = 16;BA.debugLine="Parameters.Initialize()";
Debug.ShouldStop(32768);
__ref.getField(false,"_parameters").runVoidMethod ("Initialize");
 BA.debugLineNum = 17;BA.debugLine="Data.Initialize()";
Debug.ShouldStop(65536);
__ref.getField(false,"_data").runVoidMethod ("Initialize");
 BA.debugLineNum = 18;BA.debugLine="Method = pMethod";
Debug.ShouldStop(131072);
__ref.setField ("_method",_pmethod);
 BA.debugLineNum = 19;BA.debugLine="Url = pUrl";
Debug.ShouldStop(262144);
__ref.setField ("_url",_purl);
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
}