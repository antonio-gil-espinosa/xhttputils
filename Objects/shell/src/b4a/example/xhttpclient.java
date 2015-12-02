
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class xhttpclient {
    public static RemoteObject myClass;
	public xhttpclient() {
	}
    public static PCBA staticBA = new PCBA(null, xhttpclient.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _baseurl = RemoteObject.createImmutable("");
public static RemoteObject _jobs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _jobcounter = RemoteObject.createImmutable(0);
public static RemoteObject _client = RemoteObject.declareNull("anywheresoftware.b4a.http.HttpClientWrapper");
public static RemoteObject _useragent = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BaseUrl",_ref.getField(false, "_baseurl"),"client",_ref.getField(false, "_client"),"jobCounter",_ref.getField(false, "_jobcounter"),"jobs",_ref.getField(false, "_jobs"),"UserAgent",_ref.getField(false, "_useragent")};
}
}