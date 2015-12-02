package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class xhttprequest extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.xhttprequest");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.xhttprequest.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.Map _data = null;
public anywheresoftware.b4a.objects.collections.Map _parameters = null;
public anywheresoftware.b4a.objects.collections.Map _cookies = null;
public String _url = "";
public String _method = "";
public String _useragent = "";
public b4a.example.main _main = null;
public String  _class_globals(b4a.example.xhttprequest __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xhttprequest";
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Public Data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Public Parameters As Map";
_parameters = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Public Cookies As Map";
_cookies = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Public Url As String";
_url = "";
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="Public Method As String";
_method = "";
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="Public UserAgent As String = Null";
_useragent = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.xhttprequest __ref,anywheresoftware.b4a.BA _ba,String _purl,String _pmethod) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xhttprequest";
if (Debug.shouldDelegate("initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba,_purl,_pmethod});
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub Initialize(pUrl As String,pMethod As St";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Cookies.Initialize()";
__ref._cookies.Initialize();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Parameters.Initialize()";
__ref._parameters.Initialize();
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="Data.Initialize()";
__ref._data.Initialize();
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="Method = pMethod";
__ref._method = _pmethod;
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="Url = pUrl";
__ref._url = _purl;
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="End Sub";
return "";
}
}