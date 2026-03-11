package c2;

import java.util.Map;
import org.json.JSONObject;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f2785a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2786b;

    public m(Object obj, String str) {
        this.f2785a = str;
        this.f2786b = obj;
    }

    public final Object a(String str) {
        Object obj = this.f2786b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }
}
