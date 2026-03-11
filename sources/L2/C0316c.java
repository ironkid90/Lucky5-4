package l2;

import c2.v;
import c2.w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: l2.c  reason: case insensitive filesystem */
public final class C0316c extends w {

    /* renamed from: d  reason: collision with root package name */
    public static final C0316c f4008d = new Object();

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, l2.e] */
    /* JADX WARNING: type inference failed for: r4v5, types: [l2.a, java.lang.Object] */
    public final Object f(byte b3, ByteBuffer byteBuffer) {
        if (b3 == -127) {
            ArrayList arrayList = (ArrayList) e(byteBuffer);
            ? obj = new Object();
            Boolean bool = (Boolean) arrayList.get(0);
            if (bool != null) {
                obj.f4011a = bool;
                Boolean bool2 = (Boolean) arrayList.get(1);
                if (bool2 != null) {
                    obj.f4012b = bool2;
                    Map map = (Map) arrayList.get(2);
                    if (map != null) {
                        obj.f4013c = map;
                        return obj;
                    }
                    throw new IllegalStateException("Nonnull field \"headers\" is null.");
                }
                throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
            }
            throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
        } else if (b3 != -126) {
            return super.f(b3, byteBuffer);
        } else {
            ? obj2 = new Object();
            Boolean bool3 = (Boolean) ((ArrayList) e(byteBuffer)).get(0);
            if (bool3 != null) {
                obj2.f4006a = bool3;
                return obj2;
            }
            throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
        }
    }

    public final void k(v vVar, Object obj) {
        if (obj instanceof C0318e) {
            vVar.write(129);
            C0318e eVar = (C0318e) obj;
            eVar.getClass();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(eVar.f4011a);
            arrayList.add(eVar.f4012b);
            arrayList.add(eVar.f4013c);
            k(vVar, arrayList);
        } else if (obj instanceof C0314a) {
            vVar.write(130);
            C0314a aVar = (C0314a) obj;
            aVar.getClass();
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(aVar.f4006a);
            k(vVar, arrayList2);
        } else {
            super.k(vVar, obj);
        }
    }
}
