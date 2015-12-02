package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class xhttpjob extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.xhttpjob");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.xhttpjob.class).invoke(this, new Object[] {null});
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
public b4a.example.xhttprequest _request = null;
public b4a.example.xhttpresponse _response = null;
public anywheresoftware.b4a.objects.collections.List _successcallbacks = null;
public anywheresoftware.b4a.objects.collections.List _errorcallbacks = null;
public b4a.example.main _main = null;
public String  _initialize(b4a.example.xhttpjob __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xhttpjob";
if (Debug.shouldDelegate("initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="SuccessCallbacks.Initialize()";
__ref._successcallbacks.Initialize();
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="ErrorCallbacks.Initialize()";
__ref._errorcallbacks.Initialize();
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.xhttpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xhttpjob";
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Public Request As XHttpRequest";
_request = new b4a.example.xhttprequest();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Public Response As XHttpResponse";
_response = new b4a.example.xhttpresponse();
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Public SuccessCallbacks As List";
_successcallbacks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Public ErrorCallbacks As List";
_errorcallbacks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="End Sub";
return "";
}
public b4a.example.xhttpjob  _onerror(b4a.example.xhttpjob __ref,Object _module,String _routine) throws Exception{
__ref = this;
RDebugUtils.currentModule="xhttpjob";
if (Debug.shouldDelegate("onerror"))
	return (b4a.example.xhttpjob) Debug.delegate(ba, "onerror", new Object[] {_module,_routine});
b4a.example.callback _cb = null;
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub OnError(module As Object,routine As Str";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Dim cb As Callback";
_cb = new b4a.example.callback();
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="cb.Initialize(module,routine)";
_cb._initialize(null,ba,_module,_routine);
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="ErrorCallbacks.Add(cb)";
__ref._errorcallbacks.Add((Object)(_cb));
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="Return Me";
if (true) return (b4a.example.xhttpjob)(this);
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="End Sub";
return null;
}
public b4a.example.xhttpjob  _onsuccess(b4a.example.xhttpjob __ref,Object _module,String _routine) throws Exception{
__ref = this;
RDebugUtils.currentModule="xhttpjob";
if (Debug.shouldDelegate("onsuccess"))
	return (b4a.example.xhttpjob) Debug.delegate(ba, "onsuccess", new Object[] {_module,_routine});
b4a.example.callback _cb = null;
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub OnSuccess(module As Object,routine As S";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Dim cb As Callback";
_cb = new b4a.example.callback();
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="cb.Initialize(module,routine)";
_cb._initialize(null,ba,_module,_routine);
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="SuccessCallbacks.Add(cb)";
__ref._successcallbacks.Add((Object)(_cb));
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Return Me";
if (true) return (b4a.example.xhttpjob)(this);
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="End Sub";
return null;
}
}