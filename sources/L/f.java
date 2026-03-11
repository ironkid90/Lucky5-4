package L;

import androidx.datastore.preferences.protobuf.C0116u;
import androidx.datastore.preferences.protobuf.C0118w;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.V;
import java.util.Collections;
import java.util.Map;

public final class f extends C0118w {
    private static final f DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private I preferences_ = I.f2356g;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        C0118w.l(f.class, fVar);
    }

    public static I n(f fVar) {
        I i3 = fVar.preferences_;
        if (!i3.f2357f) {
            fVar.preferences_ = i3.b();
        }
        return fVar.preferences_;
    }

    public static d p() {
        return (d) ((C0116u) DEFAULT_INSTANCE.e(5));
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.IOException] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static L.f q(java.io.InputStream r4) {
        /*
            L.f r0 = DEFAULT_INSTANCE
            androidx.datastore.preferences.protobuf.i r1 = new androidx.datastore.preferences.protobuf.i
            r1.<init>(r4)
            androidx.datastore.preferences.protobuf.o r4 = androidx.datastore.preferences.protobuf.C0111o.a()
            androidx.datastore.preferences.protobuf.w r0 = r0.k()
            androidx.datastore.preferences.protobuf.T r2 = androidx.datastore.preferences.protobuf.T.f2381c     // Catch:{ A -> 0x004b, b0 -> 0x0049, IOException -> 0x0047, RuntimeException -> 0x0045 }
            r2.getClass()     // Catch:{ A -> 0x004b, b0 -> 0x0049, IOException -> 0x0047, RuntimeException -> 0x0045 }
            java.lang.Class r3 = r0.getClass()     // Catch:{ A -> 0x004b, b0 -> 0x0049, IOException -> 0x0047, RuntimeException -> 0x0045 }
            androidx.datastore.preferences.protobuf.W r2 = r2.a(r3)     // Catch:{ A -> 0x004b, b0 -> 0x0049, IOException -> 0x0047, RuntimeException -> 0x0045 }
            androidx.datastore.preferences.protobuf.k r3 = r1.f2450b     // Catch:{ A -> 0x004b, b0 -> 0x0049, IOException -> 0x0047, RuntimeException -> 0x0045 }
            if (r3 == 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            androidx.datastore.preferences.protobuf.k r3 = new androidx.datastore.preferences.protobuf.k     // Catch:{ A -> 0x004b, b0 -> 0x0049, IOException -> 0x0047, RuntimeException -> 0x0045 }
            r3.<init>(r1)     // Catch:{ A -> 0x004b, b0 -> 0x0049, IOException -> 0x0047, RuntimeException -> 0x0045 }
        L_0x0026:
            r2.b(r0, r3, r4)     // Catch:{ A -> 0x004b, b0 -> 0x0049, IOException -> 0x0047, RuntimeException -> 0x0045 }
            r2.h(r0)     // Catch:{ A -> 0x004b, b0 -> 0x0049, IOException -> 0x0047, RuntimeException -> 0x0045 }
            r4 = 1
            boolean r4 = androidx.datastore.preferences.protobuf.C0118w.h(r0, r4)
            if (r4 == 0) goto L_0x0036
            L.f r0 = (L.f) r0
            return r0
        L_0x0036:
            androidx.datastore.preferences.protobuf.b0 r4 = new androidx.datastore.preferences.protobuf.b0
            r4.<init>()
            androidx.datastore.preferences.protobuf.A r0 = new androidx.datastore.preferences.protobuf.A
            java.lang.String r4 = r4.getMessage()
            r0.<init>(r4)
            throw r0
        L_0x0045:
            r4 = move-exception
            goto L_0x004d
        L_0x0047:
            r4 = move-exception
            goto L_0x005d
        L_0x0049:
            r4 = move-exception
            goto L_0x0076
        L_0x004b:
            r4 = move-exception
            goto L_0x0080
        L_0x004d:
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof androidx.datastore.preferences.protobuf.A
            if (r0 == 0) goto L_0x005c
            java.lang.Throwable r4 = r4.getCause()
            androidx.datastore.preferences.protobuf.A r4 = (androidx.datastore.preferences.protobuf.A) r4
            throw r4
        L_0x005c:
            throw r4
        L_0x005d:
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof androidx.datastore.preferences.protobuf.A
            if (r0 == 0) goto L_0x006c
            java.lang.Throwable r4 = r4.getCause()
            androidx.datastore.preferences.protobuf.A r4 = (androidx.datastore.preferences.protobuf.A) r4
            throw r4
        L_0x006c:
            androidx.datastore.preferences.protobuf.A r0 = new androidx.datastore.preferences.protobuf.A
            java.lang.String r1 = r4.getMessage()
            r0.<init>(r1, r4)
            throw r0
        L_0x0076:
            androidx.datastore.preferences.protobuf.A r0 = new androidx.datastore.preferences.protobuf.A
            java.lang.String r4 = r4.getMessage()
            r0.<init>(r4)
            throw r0
        L_0x0080:
            boolean r0 = r4.f2335f
            if (r0 == 0) goto L_0x008e
            androidx.datastore.preferences.protobuf.A r0 = new androidx.datastore.preferences.protobuf.A
            java.lang.String r1 = r4.getMessage()
            r0.<init>(r1, r4)
            r4 = r0
        L_0x008e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: L.f.q(java.io.InputStream):L.f");
    }

    /* JADX WARNING: type inference failed for: r4v15, types: [java.lang.Object, androidx.datastore.preferences.protobuf.S] */
    public final Object e(int i3) {
        S s3;
        switch (j.b(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case k.FLOAT_FIELD_NUMBER:
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f919a});
            case k.INTEGER_FIELD_NUMBER:
                return new f();
            case k.LONG_FIELD_NUMBER:
                return new C0116u(DEFAULT_INSTANCE);
            case k.STRING_FIELD_NUMBER:
                return DEFAULT_INSTANCE;
            case k.STRING_SET_FIELD_NUMBER:
                S s4 = PARSER;
                S s5 = s4;
                if (s4 == null) {
                    synchronized (f.class) {
                        try {
                            S s6 = PARSER;
                            s3 = s6;
                            if (s6 == null) {
                                ? obj = new Object();
                                PARSER = obj;
                                s3 = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    s5 = s3;
                }
                return s5;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
