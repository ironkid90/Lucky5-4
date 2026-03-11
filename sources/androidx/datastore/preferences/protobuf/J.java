package androidx.datastore.preferences.protobuf;

import java.util.Map;

public final class J {
    public static int a(int i3, Object obj, Object obj2) {
        I i4 = (I) obj;
        H h3 = (H) obj2;
        int i5 = 0;
        if (!i4.isEmpty()) {
            for (Map.Entry entry : i4.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                h3.getClass();
                int u02 = C0109m.u0(i3);
                int a2 = H.a(h3.f2355a, key, value);
                i5 += C0109m.w0(a2) + a2 + u02;
            }
        }
        return i5;
    }

    public static I b(Object obj, Object obj2) {
        I i3 = (I) obj;
        I i4 = (I) obj2;
        if (!i4.isEmpty()) {
            if (!i3.f2357f) {
                i3 = i3.b();
            }
            i3.a();
            if (!i4.isEmpty()) {
                i3.putAll(i4);
            }
        }
        return i3;
    }

    public static void c(Object obj) {
        ((I) obj).f2357f = false;
    }
}
