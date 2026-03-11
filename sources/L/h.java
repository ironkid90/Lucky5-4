package L;

import androidx.datastore.preferences.protobuf.C0098b;
import androidx.datastore.preferences.protobuf.C0116u;
import androidx.datastore.preferences.protobuf.C0118w;
import androidx.datastore.preferences.protobuf.C0119x;
import androidx.datastore.preferences.protobuf.C0120y;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.V;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;

public final class h extends C0118w {
    private static final h DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C0119x strings_ = U.f2384i;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        C0118w.l(h.class, hVar);
    }

    public static void n(h hVar, Set set) {
        int i3;
        C0119x xVar = hVar.strings_;
        if (!((C0098b) xVar).f2407f) {
            U u3 = (U) xVar;
            int i4 = u3.f2386h;
            if (i4 == 0) {
                i3 = 10;
            } else {
                i3 = i4 * 2;
            }
            hVar.strings_ = u3.c(i3);
        }
        C0119x xVar2 = hVar.strings_;
        Charset charset = C0120y.f2497a;
        set.getClass();
        if (xVar2 instanceof ArrayList) {
            ((ArrayList) xVar2).ensureCapacity(set.size() + ((U) xVar2).f2386h);
        }
        U u4 = (U) xVar2;
        int i5 = u4.f2386h;
        for (Object next : set) {
            if (next == null) {
                String str = "Element at index " + (u4.f2386h - i5) + " is null.";
                for (int i6 = u4.f2386h - 1; i6 >= i5; i6--) {
                    u4.remove(i6);
                }
                throw new NullPointerException(str);
            }
            u4.add(next);
        }
    }

    public static h o() {
        return DEFAULT_INSTANCE;
    }

    public static g q() {
        return (g) ((C0116u) DEFAULT_INSTANCE.e(5));
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
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case k.INTEGER_FIELD_NUMBER:
                return new h();
            case k.LONG_FIELD_NUMBER:
                return new C0116u(DEFAULT_INSTANCE);
            case k.STRING_FIELD_NUMBER:
                return DEFAULT_INSTANCE;
            case k.STRING_SET_FIELD_NUMBER:
                S s4 = PARSER;
                S s5 = s4;
                if (s4 == null) {
                    synchronized (h.class) {
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

    public final C0119x p() {
        return this.strings_;
    }
}
