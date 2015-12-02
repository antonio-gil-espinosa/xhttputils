
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class callback {
    public static RemoteObject myClass;
	public callback() {
	}
    public static PCBA staticBA = new PCBA(null, callback.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static RemoteObject _routine = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Module",_ref.getField(false, "_module"),"Routine",_ref.getField(false, "_routine")};
}
}