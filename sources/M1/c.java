package M1;

import a.C0094a;
import c2.m;
import c2.p;
import java.util.Map;
import org.json.JSONObject;

public final class c extends C0094a {

    /* renamed from: l  reason: collision with root package name */
    public final b f1095l;

    /* renamed from: m  reason: collision with root package name */
    public final m f1096m;

    public c(m mVar, p pVar) {
        super(5);
        this.f1096m = mVar;
        this.f1095l = new b(pVar, 0);
    }

    public final boolean E() {
        Object obj = this.f1096m.f2786b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey("transactionId");
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has("transactionId");
        }
        throw new ClassCastException();
    }

    public final Object t(String str) {
        return this.f1096m.a(str);
    }

    public final String x() {
        return this.f1096m.f2785a;
    }

    public final d z() {
        return this.f1095l;
    }
}
