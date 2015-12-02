package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class xhttpresponse_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public OutputStream As OutputStream";
xhttpresponse._outputstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");__ref.setField("_outputstream",xhttpresponse._outputstream);
 //BA.debugLineNum = 4;BA.debugLine="Public ContentType As String";
xhttpresponse._contenttype = RemoteObject.createImmutable("");__ref.setField("_contenttype",xhttpresponse._contenttype);
 //BA.debugLineNum = 5;BA.debugLine="Public ContentLength As Int";
xhttpresponse._contentlength = RemoteObject.createImmutable(0);__ref.setField("_contentlength",xhttpresponse._contentlength);
 //BA.debugLineNum = 6;BA.debugLine="Public StatusCode As Int";
xhttpresponse._statuscode = RemoteObject.createImmutable(0);__ref.setField("_statuscode",xhttpresponse._statuscode);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (xhttpresponse) ","xhttpresponse",3,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "xhttpresponse","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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