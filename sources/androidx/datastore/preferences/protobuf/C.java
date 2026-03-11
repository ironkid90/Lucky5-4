package androidx.datastore.preferences.protobuf;

public final class C {
    public static void a(long j3, Object obj) {
        C0098b bVar = (C0098b) ((C0119x) i0.f2444b.h(j3, obj));
        if (bVar.f2407f) {
            bVar.f2407f = false;
        }
    }

    public static C0119x b(long j3, Object obj) {
        int i3;
        C0119x xVar = (C0119x) i0.f2444b.h(j3, obj);
        if (((C0098b) xVar).f2407f) {
            return xVar;
        }
        U u3 = (U) xVar;
        int i4 = u3.f2386h;
        if (i4 == 0) {
            i3 = 10;
        } else {
            i3 = i4 * 2;
        }
        U c3 = u3.c(i3);
        i0.o(j3, obj, c3);
        return c3;
    }
}
