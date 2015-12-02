package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class callback extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.callback");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.callback.class).invoke(this, new Object[] {null});
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
public Object _module = null;
public String _routine = "";
public b4a.example.main _main = null;
public String  _invokesubdelayed2(b4a.example.callback __ref,Object _arg1) throws Exception{
__ref = this;
RDebugUtils.currentModule="callback";
if (Debug.shouldDelegate("invokesubdelayed2"))
	return (String) Debug.delegate(ba, "invokesubdelayed2", new Object[] {_arg1});
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="public Sub InvokeSubDelayed2(arg1 As Object)";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="CallSubDelayed2(Module,Routine,arg1)";
__c.CallSubDelayed2(getActivityBA(),__ref._module,__ref._routine,_arg1);
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.callback __ref,anywheresoftware.b4a.BA _ba,Object _pmodule,String _proutine) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="callback";
if (Debug.shouldDelegate("initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba,_pmodule,_proutine});
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub Initialize(pModule As Object,pRoutine A";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Module=pModule";
__ref._module = _pmodule;
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Routine = pRoutine";
__ref._routine = _proutine;
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.callback __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="callback";
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Private Module As Object";
_module = new Object();
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Private Routine As String";
_routine = "";
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="End Sub";
return "";
}
public Object  _invokesub(b4a.example.callback __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="callback";
if (Debug.shouldDelegate("invokesub"))
	return (Object) Debug.delegate(ba, "invokesub", null);
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="public Sub InvokeSub()As Object";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Return CallSub(Module,Routine)";
if (true) return __c.CallSubNew(getActivityBA(),__ref._module,__ref._routine);
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return null;
}
public Object  _invokesub2(b4a.example.callback __ref,Object _arg1) throws Exception{
__ref = this;
RDebugUtils.currentModule="callback";
if (Debug.shouldDelegate("invokesub2"))
	return (Object) Debug.delegate(ba, "invokesub2", new Object[] {_arg1});
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="public Sub InvokeSub2(arg1 As Object)As Object";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Return CallSub2(Module,Routine,arg1)";
if (true) return __c.CallSubNew2(getActivityBA(),__ref._module,__ref._routine,_arg1);
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return null;
}
public Object  _invokesub3(b4a.example.callback __ref,Object _arg1,Object _arg2) throws Exception{
__ref = this;
RDebugUtils.currentModule="callback";
if (Debug.shouldDelegate("invokesub3"))
	return (Object) Debug.delegate(ba, "invokesub3", new Object[] {_arg1,_arg2});
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="public Sub InvokeSub3(arg1 As Object,arg2 As Objec";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Return CallSub3(Module,Routine,arg1,arg2)";
if (true) return __c.CallSubNew3(getActivityBA(),__ref._module,__ref._routine,_arg1,_arg2);
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return null;
}
public String  _invokesubdelayed(b4a.example.callback __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="callback";
if (Debug.shouldDelegate("invokesubdelayed"))
	return (String) Debug.delegate(ba, "invokesubdelayed", null);
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="public Sub InvokeSubDelayed()";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="CallSubDelayed(Module,Routine)";
__c.CallSubDelayed(getActivityBA(),__ref._module,__ref._routine);
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public String  _invokesubdelayed3(b4a.example.callback __ref,Object _arg1,Object _arg2) throws Exception{
__ref = this;
RDebugUtils.currentModule="callback";
if (Debug.shouldDelegate("invokesubdelayed3"))
	return (String) Debug.delegate(ba, "invokesubdelayed3", new Object[] {_arg1,_arg2});
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="public Sub InvokeSubDelayed3(arg1 As Object,arg2 A";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="CallSubDelayed3(Module,Routine,arg1,arg2)";
__c.CallSubDelayed3(getActivityBA(),__ref._module,__ref._routine,_arg1,_arg2);
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
}