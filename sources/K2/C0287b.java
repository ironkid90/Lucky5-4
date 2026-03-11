package k2;

import A2.i;
import c2.v;
import c2.w;
import java.nio.ByteBuffer;
import java.util.List;
import q2.C0402e;

/* renamed from: k2.b  reason: case insensitive filesystem */
public final class C0287b extends w {

    /* renamed from: e  reason: collision with root package name */
    public static final C0287b f3907e = new C0287b(0);

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3908d;

    public /* synthetic */ C0287b(int i3) {
        this.f3908d = i3;
    }

    public Object f(byte b3, ByteBuffer byteBuffer) {
        List list;
        List list2;
        switch (this.f3908d) {
            case 1:
                i.e(byteBuffer, "buffer");
                if (b3 == -127) {
                    Long l3 = (Long) e(byteBuffer);
                    if (l3 == null) {
                        return null;
                    }
                    int longValue = (int) l3.longValue();
                    C0283K.f3897g.getClass();
                    for (C0283K k3 : C0283K.values()) {
                        if (k3.f3902f == longValue) {
                            return k3;
                        }
                    }
                    return null;
                } else if (b3 == -126) {
                    Object e2 = e(byteBuffer);
                    if (e2 instanceof List) {
                        list2 = (List) e2;
                    } else {
                        list2 = null;
                    }
                    if (list2 == null) {
                        return null;
                    }
                    Object obj = list2.get(1);
                    i.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    return new C0292g((String) list2.get(0), ((Boolean) obj).booleanValue());
                } else if (b3 != -125) {
                    return super.f(b3, byteBuffer);
                } else {
                    Object e3 = e(byteBuffer);
                    if (e3 instanceof List) {
                        list = (List) e3;
                    } else {
                        list = null;
                    }
                    if (list == null) {
                        return null;
                    }
                    Object obj2 = list.get(1);
                    i.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                    return new C0285M((String) list.get(0), (C0283K) obj2);
                }
            default:
                return super.f(b3, byteBuffer);
        }
    }

    public void k(v vVar, Object obj) {
        switch (this.f3908d) {
            case 1:
                if (obj instanceof C0283K) {
                    vVar.write(129);
                    k(vVar, Integer.valueOf(((C0283K) obj).f3902f));
                    return;
                } else if (obj instanceof C0292g) {
                    vVar.write(130);
                    C0292g gVar = (C0292g) obj;
                    k(vVar, C0402e.b0(gVar.f3916a, Boolean.valueOf(gVar.f3917b)));
                    return;
                } else if (obj instanceof C0285M) {
                    vVar.write(131);
                    C0285M m3 = (C0285M) obj;
                    k(vVar, C0402e.b0(m3.f3903a, m3.f3904b));
                    return;
                } else {
                    super.k(vVar, obj);
                    return;
                }
            default:
                super.k(vVar, obj);
                return;
        }
    }
}
