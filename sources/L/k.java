package L;

import androidx.datastore.preferences.protobuf.C0103g;
import androidx.datastore.preferences.protobuf.C0116u;
import androidx.datastore.preferences.protobuf.C0118w;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.V;

public final class k extends C0118w {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final k DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile S PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        C0118w.l(k.class, kVar);
    }

    public static i F() {
        return (i) ((C0116u) DEFAULT_INSTANCE.e(5));
    }

    public static void n(k kVar, long j3) {
        kVar.valueCase_ = 4;
        kVar.value_ = Long.valueOf(j3);
    }

    public static void o(k kVar, String str) {
        kVar.getClass();
        str.getClass();
        kVar.valueCase_ = 5;
        kVar.value_ = str;
    }

    public static void p(k kVar, h hVar) {
        kVar.getClass();
        kVar.value_ = hVar;
        kVar.valueCase_ = 6;
    }

    public static void q(k kVar, double d3) {
        kVar.valueCase_ = 7;
        kVar.value_ = Double.valueOf(d3);
    }

    public static void r(k kVar, C0103g gVar) {
        kVar.getClass();
        kVar.valueCase_ = 8;
        kVar.value_ = gVar;
    }

    public static void s(k kVar, boolean z3) {
        kVar.valueCase_ = 1;
        kVar.value_ = Boolean.valueOf(z3);
    }

    public static void t(k kVar, float f3) {
        kVar.valueCase_ = 2;
        kVar.value_ = Float.valueOf(f3);
    }

    public static void u(k kVar, int i3) {
        kVar.valueCase_ = 3;
        kVar.value_ = Integer.valueOf(i3);
    }

    public static k x() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long B() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0;
    }

    public final String C() {
        if (this.valueCase_ == 5) {
            return (String) this.value_;
        }
        return "";
    }

    public final h D() {
        if (this.valueCase_ == 6) {
            return (h) this.value_;
        }
        return h.o();
    }

    public final int E() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case FLOAT_FIELD_NUMBER /*2*/:
                return 2;
            case INTEGER_FIELD_NUMBER /*3*/:
                return 3;
            case LONG_FIELD_NUMBER /*4*/:
                return 4;
            case STRING_FIELD_NUMBER /*5*/:
                return 5;
            case STRING_SET_FIELD_NUMBER /*6*/:
                return 6;
            case DOUBLE_FIELD_NUMBER /*7*/:
                return 7;
            case BYTES_FIELD_NUMBER /*8*/:
                return 8;
            default:
                return 0;
        }
    }

    /* JADX WARNING: type inference failed for: r4v15, types: [java.lang.Object, androidx.datastore.preferences.protobuf.S] */
    public final Object e(int i3) {
        S s3;
        switch (j.b(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case FLOAT_FIELD_NUMBER /*2*/:
                return new V(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", h.class});
            case INTEGER_FIELD_NUMBER /*3*/:
                return new k();
            case LONG_FIELD_NUMBER /*4*/:
                return new C0116u(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /*5*/:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /*6*/:
                S s4 = PARSER;
                S s5 = s4;
                if (s4 == null) {
                    synchronized (k.class) {
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

    public final boolean v() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final C0103g w() {
        if (this.valueCase_ == 8) {
            return (C0103g) this.value_;
        }
        return C0103g.f2423h;
    }

    public final double y() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float z() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }
}
