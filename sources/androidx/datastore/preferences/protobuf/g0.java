package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public final class g0 extends h0 {
    public final boolean c(long j3, Object obj) {
        return this.f2434a.getBoolean(obj, j3);
    }

    public final double d(long j3, Object obj) {
        return this.f2434a.getDouble(obj, j3);
    }

    public final float e(long j3, Object obj) {
        return this.f2434a.getFloat(obj, j3);
    }

    public final void j(Object obj, long j3, boolean z3) {
        this.f2434a.putBoolean(obj, j3, z3);
    }

    public final void k(Object obj, long j3, byte b3) {
        this.f2434a.putByte(obj, j3, b3);
    }

    public final void l(Object obj, long j3, double d3) {
        this.f2434a.putDouble(obj, j3, d3);
    }

    public final void m(Object obj, long j3, float f3) {
        this.f2434a.putFloat(obj, j3, f3);
    }

    public final boolean q() {
        Class<Object> cls = Object.class;
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls2 = this.f2434a.getClass();
            Class cls3 = Long.TYPE;
            cls2.getMethod("getByte", new Class[]{cls, cls3});
            cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, cls3});
            cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, cls3});
            cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, cls3});
            cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
            return true;
        } catch (Throwable th) {
            i0.a(th);
            return false;
        }
    }

    public final boolean r() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = this.f2434a;
        if (unsafe != null) {
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
                Class cls3 = Long.TYPE;
                cls2.getMethod("getLong", new Class[]{cls, cls3});
                if (i0.g() != null) {
                    try {
                        Class<?> cls4 = this.f2434a.getClass();
                        cls4.getMethod("getByte", new Class[]{cls3});
                        cls4.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
                        cls4.getMethod("getInt", new Class[]{cls3});
                        cls4.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
                        cls4.getMethod("getLong", new Class[]{cls3});
                        cls4.getMethod("putLong", new Class[]{cls3, cls3});
                        cls4.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
                        cls4.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
                        return true;
                    } catch (Throwable th) {
                        i0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                i0.a(th2);
            }
        }
        return false;
    }
}
