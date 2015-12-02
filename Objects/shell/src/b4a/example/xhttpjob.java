
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class xhttpjob {
    public static RemoteObject myClass;
	public xhttpjob() {
	}
    public static PCBA staticBA = new PCBA(null, xhttpjob.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _request = RemoteObject.declareNull("b4a.example.xhttprequest");
public static RemoteObject _response = RemoteObject.declareNull("b4a.example.xhttpresponse");
public static RemoteObject _successcallbacks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _errorcallbacks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static b4a.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ErrorCallbacks",_ref.getField(false, "_errorcallbacks"),"Request",_ref.getField(false, "_request"),"Response",_ref.getField(false, "_response"),"SuccessCallbacks",_ref.getField(false, "_successcallbacks")};
}
}