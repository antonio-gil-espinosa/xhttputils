package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class callback_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Module As Object";
callback._module = RemoteObject.createNew ("Object");__ref.setField("_module",callback._module);
 //BA.debugLineNum = 4;BA.debugLine="Private Routine As String";
callback._routine = RemoteObject.createImmutable("");__ref.setField("_routine",callback._routine);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _pmodule,RemoteObject _proutine) throws Exception{
try {
		Debug.PushSubsStack("Initialize (callback) ","callback",5,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "callback","initialize", __ref, _ba, _pmodule, _proutine);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("pModule", _pmodule);
Debug.locals.put("pRoutine", _proutine);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(pModule As Object,pRoutine A";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="Module=pModule";
Debug.ShouldStop(256);
__ref.setField ("_module",_pmodule);
 BA.debugLineNum = 10;BA.debugLine="Routine = pRoutine";
Debug.ShouldStop(512);
__ref.setField ("_routine",_proutine);
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
public static RemoteObject  _invokesub(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InvokeSub (callback) ","callback",5,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("invokesub")) return __ref.runUserSub(false, "callback","invokesub", __ref);
 BA.debugLineNum = 14;BA.debugLine="public Sub InvokeSub()As Object";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Return CallSub(Module,Routine)";
Debug.ShouldStop(16384);
if (true) return callback.__c.runMethodAndSync(false,"CallSubNew",__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(false,"_module")),(Object)(__ref.getField(true,"_routine")));
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _invokesub2(RemoteObject __ref,RemoteObject _arg1) throws Exception{
try {
		Debug.PushSubsStack("InvokeSub2 (callback) ","callback",5,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("invokesub2")) return __ref.runUserSub(false, "callback","invokesub2", __ref, _arg1);
Debug.locals.put("arg1", _arg1);
 BA.debugLineNum = 18;BA.debugLine="public Sub InvokeSub2(arg1 As Object)As Object";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Return CallSub2(Module,Routine,arg1)";
Debug.ShouldStop(262144);
if (true) return callback.__c.runMethodAndSync(false,"CallSubNew2",__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(false,"_module")),(Object)(__ref.getField(true,"_routine")),(Object)(_arg1));
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
public static RemoteObject  _invokesub3(RemoteObject __ref,RemoteObject _arg1,RemoteObject _arg2) throws Exception{
try {
		Debug.PushSubsStack("InvokeSub3 (callback) ","callback",5,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("invokesub3")) return __ref.runUserSub(false, "callback","invokesub3", __ref, _arg1, _arg2);
Debug.locals.put("arg1", _arg1);
Debug.locals.put("arg2", _arg2);
 BA.debugLineNum = 22;BA.debugLine="public Sub InvokeSub3(arg1 As Object,arg2 As Objec";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Return CallSub3(Module,Routine,arg1,arg2)";
Debug.ShouldStop(4194304);
if (true) return callback.__c.runMethodAndSync(false,"CallSubNew3",__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(false,"_module")),(Object)(__ref.getField(true,"_routine")),(Object)(_arg1),(Object)(_arg2));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _invokesubdelayed(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InvokeSubDelayed (callback) ","callback",5,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("invokesubdelayed")) return __ref.runUserSub(false, "callback","invokesubdelayed", __ref);
 BA.debugLineNum = 26;BA.debugLine="public Sub InvokeSubDelayed()";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="CallSubDelayed(Module,Routine)";
Debug.ShouldStop(67108864);
callback.__c.runVoidMethod ("CallSubDelayed",__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(false,"_module")),(Object)(__ref.getField(true,"_routine")));
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _invokesubdelayed2(RemoteObject __ref,RemoteObject _arg1) throws Exception{
try {
		Debug.PushSubsStack("InvokeSubDelayed2 (callback) ","callback",5,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("invokesubdelayed2")) return __ref.runUserSub(false, "callback","invokesubdelayed2", __ref, _arg1);
Debug.locals.put("arg1", _arg1);
 BA.debugLineNum = 30;BA.debugLine="public Sub InvokeSubDelayed2(arg1 As Object)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="CallSubDelayed2(Module,Routine,arg1)";
Debug.ShouldStop(1073741824);
callback.__c.runVoidMethod ("CallSubDelayed2",__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(false,"_module")),(Object)(__ref.getField(true,"_routine")),(Object)(_arg1));
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
public static RemoteObject  _invokesubdelayed3(RemoteObject __ref,RemoteObject _arg1,RemoteObject _arg2) throws Exception{
try {
		Debug.PushSubsStack("InvokeSubDelayed3 (callback) ","callback",5,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("invokesubdelayed3")) return __ref.runUserSub(false, "callback","invokesubdelayed3", __ref, _arg1, _arg2);
Debug.locals.put("arg1", _arg1);
Debug.locals.put("arg2", _arg2);
 BA.debugLineNum = 34;BA.debugLine="public Sub InvokeSubDelayed3(arg1 As Object,arg2 A";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="CallSubDelayed3(Module,Routine,arg1,arg2)";
Debug.ShouldStop(4);
callback.__c.runVoidMethod ("CallSubDelayed3",__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(false,"_module")),(Object)(__ref.getField(true,"_routine")),(Object)(_arg1),(Object)(_arg2));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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