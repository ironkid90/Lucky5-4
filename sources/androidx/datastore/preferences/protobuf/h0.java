package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final Unsafe f2434a;

    public h0(Unsafe unsafe) {
        this.f2434a = unsafe;
    }

    public final int a(Class cls) {
        return this.f2434a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f2434a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j3, Object obj);

    public abstract double d(long j3, Object obj);

    public abstract float e(long j3, Object obj);

    public final int f(long j3, Object obj) {
        return this.f2434a.getInt(obj, j3);
    }

    public final long g(long j3, Object obj) {
        return this.f2434a.getLong(obj, j3);
    }

    public final Object h(long j3, Object obj) {
        return this.f2434a.getObject(obj, j3);
    }

    public final long i(Field field) {
        return this.f2434a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j3, boolean z3);

    public abstract void k(Object obj, long j3, byte b3);

    public abstract void l(Object obj, long j3, double d3);

    public abstract void m(Object obj, long j3, float f3);

    public final void n(Object obj, long j3, int i3) {
        this.f2434a.putInt(obj, j3, i3);
    }

    public final void o(Object obj, long j3, long j4) {
        this.f2434a.putLong(obj, j3, j4);
    }

    public final void p(long j3, Object obj, Object obj2) {
        this.f2434a.putObject(obj, j3, obj2);
    }

    public boolean q() {
        Class<Class> cls = Class.class;
        Class<Object> cls2 = Object.class;
        Unsafe unsafe = this.f2434a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls3 = unsafe.getClass();
            cls3.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls3.getMethod("arrayBaseOffset", new Class[]{cls});
            cls3.getMethod("arrayIndexScale", new Class[]{cls});
            Class cls4 = Long.TYPE;
            cls3.getMethod("getInt", new Class[]{cls2, cls4});
            cls3.getMethod("putInt", new Class[]{cls2, cls4, Integer.TYPE});
            cls3.getMethod("getLong", new Class[]{cls2, cls4});
            cls3.getMethod("putLong", new Class[]{cls2, cls4, cls4});
            cls3.getMethod("getObject", new Class[]{cls2, cls4});
            cls3.getMethod("putObject", new Class[]{cls2, cls4, cls2});
            return true;
        } catch (Throwable th) {
            i0.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
