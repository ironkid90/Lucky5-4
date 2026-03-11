package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f2443a;

    /* renamed from: b  reason: collision with root package name */
    public static final h0 f2444b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f2445c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f2446d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f2447e = ((long) e(byte[].class));

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f2448f;

    static {
        boolean z3;
        boolean z4;
        boolean z5 = false;
        Unsafe i3 = i();
        f2443a = i3;
        Class cls = C0099c.f2408a;
        boolean h3 = h(Long.TYPE);
        boolean h4 = h(Integer.TYPE);
        h0 h0Var = null;
        if (i3 != null) {
            if (!C0099c.a()) {
                h0Var = new h0(i3);
            } else if (h3) {
                h0Var = new f0(i3, 1);
            } else if (h4) {
                h0Var = new f0(i3, 0);
            }
        }
        f2444b = h0Var;
        if (h0Var == null) {
            z3 = false;
        } else {
            z3 = h0Var.r();
        }
        f2445c = z3;
        if (h0Var == null) {
            z4 = false;
        } else {
            z4 = h0Var.q();
        }
        f2446d = z4;
        Class<boolean[]> cls2 = boolean[].class;
        e(cls2);
        f(cls2);
        Class<int[]> cls3 = int[].class;
        e(cls3);
        f(cls3);
        Class<long[]> cls4 = long[].class;
        e(cls4);
        f(cls4);
        Class<float[]> cls5 = float[].class;
        e(cls5);
        f(cls5);
        Class<double[]> cls6 = double[].class;
        e(cls6);
        f(cls6);
        Class<Object[]> cls7 = Object[].class;
        e(cls7);
        f(cls7);
        Field g2 = g();
        if (!(g2 == null || h0Var == null)) {
            h0Var.i(g2);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z5 = true;
        }
        f2448f = z5;
    }

    public static void a(Throwable th) {
        Logger logger = Logger.getLogger(i0.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j3, Object obj) {
        if (((byte) ((f2444b.f(-4 & j3, obj) >>> ((int) (((~j3) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static boolean c(long j3, Object obj) {
        if (((byte) ((f2444b.f(-4 & j3, obj) >>> ((int) ((j3 & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static Object d(Class cls) {
        try {
            return f2443a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int e(Class cls) {
        if (f2446d) {
            return f2444b.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f2446d) {
            f2444b.b(cls);
        }
    }

    public static Field g() {
        Field field;
        Field field2;
        Class<Buffer> cls = Buffer.class;
        if (C0099c.a()) {
            try {
                field2 = cls.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = cls.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean h(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C0099c.a()) {
            return false;
        }
        try {
            Class cls3 = C0099c.f2408a;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new e0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j3, byte b3) {
        f2444b.k(bArr, f2447e + j3, b3);
    }

    public static void k(Object obj, long j3, byte b3) {
        long j4 = -4 & j3;
        int f3 = f2444b.f(j4, obj);
        int i3 = ((~((int) j3)) & 3) << 3;
        m(obj, j4, ((255 & b3) << i3) | (f3 & (~(255 << i3))));
    }

    public static void l(Object obj, long j3, byte b3) {
        long j4 = -4 & j3;
        int i3 = (((int) j3) & 3) << 3;
        m(obj, j4, ((255 & b3) << i3) | (f2444b.f(j4, obj) & (~(255 << i3))));
    }

    public static void m(Object obj, long j3, int i3) {
        f2444b.n(obj, j3, i3);
    }

    public static void n(Object obj, long j3, long j4) {
        f2444b.o(obj, j3, j4);
    }

    public static void o(long j3, Object obj, Object obj2) {
        f2444b.p(j3, obj, obj2);
    }
}
