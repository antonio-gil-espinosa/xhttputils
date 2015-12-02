
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class xhttprequest {
    public static RemoteObject myClass;
	public xhttprequest() {
	}
    public static PCBA staticBA = new PCBA(null, xhttprequest.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _parameters = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _cookies = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _url = RemoteObject.createImmutable("");
public static RemoteObject _method = RemoteObject.createImmutable("");
public static RemoteObject _useragent = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Cookies",_ref.getField(false, "_cookies"),"Data",_ref.getField(false, "_data"),"Method",_ref.getField(false, "_method"),"Parameters",_ref.getField(false, "_parameters"),"Url",_ref.getField(false, "_url"),"UserAgent",_ref.getField(false, "_useragent")};
}
}