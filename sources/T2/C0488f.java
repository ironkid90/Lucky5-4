package t2;

import A2.f;
import A2.i;
import A2.r;
import r2.C0420d;

/* renamed from: t2.f  reason: case insensitive filesystem */
public abstract class C0488f extends C0484b implements f {

    /* renamed from: i  reason: collision with root package name */
    public final int f4688i;

    public C0488f(int i3, C0420d dVar) {
        super(dVar);
        this.f4688i = i3;
    }

    public final int d() {
        return this.f4688i;
    }

    public final String toString() {
        if (this.f4683f != null) {
            return super.toString();
        }
        r.f87a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        i.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
