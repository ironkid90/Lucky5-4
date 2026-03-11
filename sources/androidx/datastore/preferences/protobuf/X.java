package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public abstract class X {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f2391a;

    /* renamed from: b  reason: collision with root package name */
    public static final d0 f2392b;

    /* renamed from: c  reason: collision with root package name */
    public static final d0 f2393c = new Object();

    /* JADX WARNING: type inference failed for: r0v3, types: [androidx.datastore.preferences.protobuf.d0, java.lang.Object] */
    static {
        Class<?> cls;
        Class<?> cls2;
        T t3 = T.f2381c;
        d0 d0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f2391a = cls;
        try {
            T t4 = T.f2381c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                d0Var = (d0) cls2.getConstructor((Class[]) null).newInstance((Object[]) null);
            }
        } catch (Throwable unused3) {
        }
        f2392b = d0Var;
    }

    public static void A(d0 d0Var, Object obj, Object obj2) {
        d0Var.getClass();
        C0118w wVar = (C0118w) obj;
        c0 c0Var = wVar.unknownFields;
        c0 c0Var2 = ((C0118w) obj2).unknownFields;
        c0 c0Var3 = c0.f2410f;
        if (!c0Var3.equals(c0Var2)) {
            if (c0Var3.equals(c0Var)) {
                int i3 = c0Var.f2411a + c0Var2.f2411a;
                int[] copyOf = Arrays.copyOf(c0Var.f2412b, i3);
                System.arraycopy(c0Var2.f2412b, 0, copyOf, c0Var.f2411a, c0Var2.f2411a);
                Object[] copyOf2 = Arrays.copyOf(c0Var.f2413c, i3);
                System.arraycopy(c0Var2.f2413c, 0, copyOf2, c0Var.f2411a, c0Var2.f2411a);
                c0Var = new c0(i3, copyOf, copyOf2, true);
            } else {
                c0Var.getClass();
                if (!c0Var2.equals(c0Var3)) {
                    if (c0Var.f2415e) {
                        int i4 = c0Var.f2411a + c0Var2.f2411a;
                        c0Var.a(i4);
                        System.arraycopy(c0Var2.f2412b, 0, c0Var.f2412b, c0Var.f2411a, c0Var2.f2411a);
                        System.arraycopy(c0Var2.f2413c, 0, c0Var.f2413c, c0Var.f2411a, c0Var2.f2411a);
                        c0Var.f2411a = i4;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        wVar.unknownFields = c0Var;
    }

    public static boolean B(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static void C(int i3, List list, F f3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0109m mVar = (C0109m) f3.f2351a;
            int i4 = 0;
            if (z3) {
                mVar.O0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Boolean) list.get(i6)).getClass();
                    Logger logger = C0109m.f2457q;
                    i5++;
                }
                mVar.Q0(i5);
                while (i4 < list.size()) {
                    mVar.B0(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : 0);
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                mVar.D0(i3, ((Boolean) list.get(i4)).booleanValue());
                i4++;
            }
        }
    }

    public static void D(int i3, List list, F f3) {
        if (list != null && !list.isEmpty()) {
            f3.getClass();
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((C0109m) f3.f2351a).E0(i3, (C0103g) list.get(i4));
            }
        }
    }

    public static void E(int i3, List list, F f3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0109m mVar = (C0109m) f3.f2351a;
            int i4 = 0;
            if (z3) {
                mVar.O0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Double) list.get(i6)).getClass();
                    Logger logger = C0109m.f2457q;
                    i5 += 8;
                }
                mVar.Q0(i5);
                while (i4 < list.size()) {
                    mVar.J0(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                double doubleValue = ((Double) list.get(i4)).doubleValue();
                mVar.getClass();
                mVar.I0(Double.doubleToRawLongBits(doubleValue), i3);
                i4++;
            }
        }
    }

    public static void F(int i3, List list, F f3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0109m mVar = (C0109m) f3.f2351a;
            int i4 = 0;
            if (z3) {
                mVar.O0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += C0109m.y0((long) ((Integer) list.get(i6)).intValue());
                }
                mVar.Q0(i5);
                while (i4 < list.size()) {
                    mVar.L0(((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                mVar.K0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
        }
    }

    public static void G(int i3, List list, F f3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0109m mVar = (C0109m) f3.f2351a;
            int i4 = 0;
            if (z3) {
                mVar.O0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).getClass();
                    Logger logger = C0109m.f2457q;
                    i5 += 4;
                }
                mVar.Q0(i5);
                while (i4 < list.size()) {
                    mVar.H0(((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                mVar.G0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
        }
    }

    public static void H(int i3, List list, F f3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0109m mVar = (C0109m) f3.f2351a;
            int i4 = 0;
            if (z3) {
                mVar.O0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) list.get(i6)).getClass();
                    Logger logger = C0109m.f2457q;
                    i5 += 8;
                }
                mVar.Q0(i5);
                while (i4 < list.size()) {
                    mVar.J0(((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                mVar.I0(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
        }
    }

    public static void I(int i3, List list, F f3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0109m mVar = (C0109m) f3.f2351a;
            int i4 = 0;
            if (z3) {
                mVar.O0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Float) list.get(i6)).getClass();
                    Logger logger = C0109m.f2457q;
                    i5 += 4;
                }
                mVar.Q0(i5);
                while (i4 < list.size()) {
                    mVar.H0(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                float floatValue = ((Float) list.get(i4)).floatValue();
                mVar.getClass();
                mVar.G0(i3, Float.floatToRawIntBits(floatValue));
                i4++;
            }
        }
    }

    public static void J(int i3, List list, F f3, W w3) {
        if (list != null && !list.isEmpty()) {
            f3.getClass();
            for (int i4 = 0; i4 < list.size(); i4++) {
                f3.h(i3, list.get(i4), w3);
            }
        }
    }

    public static void K(int i3, List list, F f3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0109m mVar = (C0109m) f3.f2351a;
            int i4 = 0;
            if (z3) {
                mVar.O0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += C0109m.y0((long) ((Integer) list.get(i6)).intValue());
                }
                mVar.Q0(i5);
                while (i4 < list.size()) {
                    mVar.L0(((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                mVar.K0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
        }
    }

    public static void L(int i3, List list, F f3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0109m mVar = (C0109m) f3.f2351a;
            int i4 = 0;
            if (z3) {
                mVar.O0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += C0109m.y0(((Long) list.get(i6)).longValue());
                }
                mVar.Q0(i5);
                while (i4 < list.size()) {
                    mVar.S0(((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                mVar.R0(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
        }
    }

    public static void M(int i3, List list, F f3, W w3) {
        if (list != null && !list.isEmpty()) {
            f3.getClass();
            for (int i4 = 0; i4 < list.size(); i4++) {
                f3.k(i3, list.get(i4), w3);
            }
        }
    }

    public static void N(int i3, List list, F f3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0109m mVar = (C0109m) f3.f2351a;
            int i4 = 0;
            if (z3) {
                mVar.O0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).getClass();
                    Logger logger = C0109m.f2457q;
                    i5 += 4;
                }
                mVar.Q0(i5);
                while (i4 < list.size()) {
                    mVar.H0(((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                mVar.G0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
        }
    }

    public static void O(int i3, List list, F f3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0109m mVar = (C0109m) f3.f2351a;
            int i4 = 0;
            if (z3) {
                mVar.O0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) list.get(i6)).getClass();
                    Logger logger = C0109m.f2457q;
                    i5 += 8;
                }
                mVar.Q0(i5);
                while (i4 < list.size()) {
                    mVar.J0(((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                mVar.I0(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
        }
    }

    public static void P(int i3, List list, F f3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0109m mVar = (C0109m) f3.f2351a;
            int i4 = 0;
            if (z3) {
                mVar.O0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    int intValue = ((Integer) list.get(i6)).intValue();
                    i5 += C0109m.w0((intValue >> 31) ^ (intValue << 1));
                }
                mVar.Q0(i5);
                while (i4 < list.size()) {
                    int intValue2 = ((Integer) list.get(i4)).intValue();
                    mVar.Q0((intValue2 >> 31) ^ (intValue2 << 1));
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                int intValue3 = ((Integer) list.get(i4)).intValue();
                mVar.P0(i3, (intValue3 >> 31) ^ (intValue3 << 1));
                i4++;
            }
        }
    }

    public static void Q(int i3, List list, F f3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0109m mVar = (C0109m) f3.f2351a;
            int i4 = 0;
            if (z3) {
                mVar.O0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    long longValue = ((Long) list.get(i6)).longValue();
                    i5 += C0109m.y0((longValue >> 63) ^ (longValue << 1));
                }
                mVar.Q0(i5);
                while (i4 < list.size()) {
                    long longValue2 = ((Long) list.get(i4)).longValue();
                    mVar.S0((longValue2 >> 63) ^ (longValue2 << 1));
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                long longValue3 = ((Long) list.get(i4)).longValue();
                mVar.R0((longValue3 >> 63) ^ (longValue3 << 1), i3);
                i4++;
            }
        }
    }

    public static void R(int i3, List list, F f3) {
        if (list != null && !list.isEmpty()) {
            f3.getClass();
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((C0109m) f3.f2351a).M0((String) list.get(i4), i3);
            }
        }
    }

    public static void S(int i3, List list, F f3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0109m mVar = (C0109m) f3.f2351a;
            int i4 = 0;
            if (z3) {
                mVar.O0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += C0109m.w0(((Integer) list.get(i6)).intValue());
                }
                mVar.Q0(i5);
                while (i4 < list.size()) {
                    mVar.Q0(((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                mVar.P0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
        }
    }

    public static void T(int i3, List list, F f3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0109m mVar = (C0109m) f3.f2351a;
            int i4 = 0;
            if (z3) {
                mVar.O0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += C0109m.y0(((Long) list.get(i6)).longValue());
                }
                mVar.Q0(i5);
                while (i4 < list.size()) {
                    mVar.S0(((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                mVar.R0(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
        }
    }

    public static int a(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0109m.e0(i3) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int u02 = C0109m.u0(i3) * size;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int size2 = ((C0103g) list.get(i4)).size();
            u02 += C0109m.w0(size2) + size2;
        }
        return u02;
    }

    public static int d(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0109m.u0(i3) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0109m.y0((long) ((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int f(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0109m.i0(i3) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0109m.j0(i3) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i3, List list, W w3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0109m.l0(i3, (C0097a) list.get(i5), w3);
        }
        return i4;
    }

    public static int k(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0109m.u0(i3) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0109m.y0((long) ((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int m(int i3, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0109m.u0(i3) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0109m.y0(((Long) list.get(i4)).longValue());
        }
        return i3;
    }

    public static int o(int i3, Object obj, W w3) {
        int u02 = C0109m.u0(i3);
        int a2 = ((C0097a) obj).a(w3);
        return C0109m.w0(a2) + a2 + u02;
    }

    public static int p(int i3, List list, W w3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int u02 = C0109m.u0(i3) * size;
        for (int i4 = 0; i4 < size; i4++) {
            int a2 = ((C0097a) list.get(i4)).a(w3);
            u02 += C0109m.w0(a2) + a2;
        }
        return u02;
    }

    public static int q(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0109m.u0(i3) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int intValue = ((Integer) list.get(i4)).intValue();
            i3 += C0109m.w0((intValue >> 31) ^ (intValue << 1));
        }
        return i3;
    }

    public static int s(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0109m.u0(i3) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            long longValue = ((Long) list.get(i4)).longValue();
            i3 += C0109m.y0((longValue >> 63) ^ (longValue << 1));
        }
        return i3;
    }

    public static int u(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int u02 = C0109m.u0(i3) * size;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            if (obj instanceof C0103g) {
                int size2 = ((C0103g) obj).size();
                u02 = C0109m.w0(size2) + size2 + u02;
            } else {
                u02 = C0109m.t0((String) obj) + u02;
            }
        }
        return u02;
    }

    public static int v(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0109m.u0(i3) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0109m.w0(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int x(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0109m.u0(i3) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0109m.y0(((Long) list.get(i4)).longValue());
        }
        return i3;
    }

    public static Object z(Object obj, int i3, C0119x xVar, Object obj2, d0 d0Var) {
        return obj2;
    }
}
