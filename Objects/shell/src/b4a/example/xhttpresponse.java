
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class xhttpresponse {
    public static RemoteObject myClass;
	public xhttpresponse() {
	}
    public static PCBA staticBA = new PCBA(null, xhttpresponse.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _outputstream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
public static RemoteObject _contenttype = RemoteObject.createImmutable("");
public static RemoteObject _contentlength = RemoteObject.createImmutable(0);
public static RemoteObject _statuscode = RemoteObject.createImmutable(0);
public static b4a.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ContentLength",_ref.getField(false, "_contentlength"),"ContentType",_ref.getField(false, "_contenttype"),"OutputStream",_ref.getField(false, "_outputstream"),"StatusCode",_ref.getField(false, "_statuscode")};
}
}