package A2;

import java.io.Serializable;

public abstract class j implements f, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final int f80f;

    public j(int i3) {
        this.f80f = i3;
    }

    public final int d() {
        return this.f80f;
    }

    public final String toString() {
        r.f87a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        i.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
