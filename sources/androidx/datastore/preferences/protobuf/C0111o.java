package androidx.datastore.preferences.protobuf;

import java.util.Collections;

/* renamed from: androidx.datastore.preferences.protobuf.o  reason: case insensitive filesystem */
public final class C0111o {

    /* renamed from: a  reason: collision with root package name */
    public static volatile C0111o f2465a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0111o f2466b;

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.o, java.lang.Object] */
    static {
        ? obj = new Object();
        Collections.emptyMap();
        f2466b = obj;
    }

    public static C0111o a() {
        T t3 = T.f2381c;
        C0111o oVar = f2465a;
        if (oVar == null) {
            synchronized (C0111o.class) {
                try {
                    oVar = f2465a;
                    if (oVar == null) {
                        Class cls = C0110n.f2464a;
                        C0111o oVar2 = null;
                        if (cls != null) {
                            try {
                                oVar2 = (C0111o) cls.getDeclaredMethod("getEmptyRegistry", (Class[]) null).invoke((Object) null, (Object[]) null);
                            } catch (Exception unused) {
                            }
                        }
                        if (oVar2 == null) {
                            oVar2 = f2466b;
                        }
                        f2465a = oVar2;
                        oVar = oVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oVar;
    }
}
