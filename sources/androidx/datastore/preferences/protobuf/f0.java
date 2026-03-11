package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

public final class f0 extends h0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2422b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Unsafe unsafe, int i3) {
        super(unsafe);
        this.f2422b = i3;
    }

    public final boolean c(long j3, Object obj) {
        switch (this.f2422b) {
            case 0:
                if (i0.f2448f) {
                    return i0.b(j3, obj);
                }
                return i0.c(j3, obj);
            default:
                if (i0.f2448f) {
                    return i0.b(j3, obj);
                }
                return i0.c(j3, obj);
        }
    }

    public final double d(long j3, Object obj) {
        switch (this.f2422b) {
            case 0:
                return Double.longBitsToDouble(g(j3, obj));
            default:
                return Double.longBitsToDouble(g(j3, obj));
        }
    }

    public final float e(long j3, Object obj) {
        switch (this.f2422b) {
            case 0:
                return Float.intBitsToFloat(f(j3, obj));
            default:
                return Float.intBitsToFloat(f(j3, obj));
        }
    }

    public final void j(Object obj, long j3, boolean z3) {
        switch (this.f2422b) {
            case 0:
                if (i0.f2448f) {
                    i0.k(obj, j3, z3 ? (byte) 1 : 0);
                    return;
                } else {
                    i0.l(obj, j3, z3 ? (byte) 1 : 0);
                    return;
                }
            default:
                if (i0.f2448f) {
                    i0.k(obj, j3, z3 ? (byte) 1 : 0);
                    return;
                } else {
                    i0.l(obj, j3, z3 ? (byte) 1 : 0);
                    return;
                }
        }
    }

    public final void k(Object obj, long j3, byte b3) {
        switch (this.f2422b) {
            case 0:
                if (i0.f2448f) {
                    i0.k(obj, j3, b3);
                    return;
                } else {
                    i0.l(obj, j3, b3);
                    return;
                }
            default:
                if (i0.f2448f) {
                    i0.k(obj, j3, b3);
                    return;
                } else {
                    i0.l(obj, j3, b3);
                    return;
                }
        }
    }

    public final void l(Object obj, long j3, double d3) {
        switch (this.f2422b) {
            case 0:
                o(obj, j3, Double.doubleToLongBits(d3));
                return;
            default:
                o(obj, j3, Double.doubleToLongBits(d3));
                return;
        }
    }

    public final void m(Object obj, long j3, float f3) {
        switch (this.f2422b) {
            case 0:
                n(obj, j3, Float.floatToIntBits(f3));
                return;
            default:
                n(obj, j3, Float.floatToIntBits(f3));
                return;
        }
    }

    public final boolean r() {
        switch (this.f2422b) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
