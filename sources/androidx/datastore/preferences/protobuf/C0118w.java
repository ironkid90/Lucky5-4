package androidx.datastore.preferences.protobuf;

import A2.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.w  reason: case insensitive filesystem */
public abstract class C0118w extends C0097a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, C0118w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected c0 unknownFields = c0.f2410f;

    public C0118w() {
        this.memoizedHashCode = 0;
    }

    public static C0118w f(Class cls) {
        C0118w wVar = defaultInstanceMap.get(cls);
        if (wVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                wVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (wVar == null) {
            wVar = (C0118w) ((C0118w) i0.d(cls)).e(6);
            if (wVar != null) {
                defaultInstanceMap.put(cls, wVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return wVar;
    }

    public static Object g(Method method, C0097a aVar, Object... objArr) {
        try {
            return method.invoke(aVar, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static final boolean h(C0118w wVar, boolean z3) {
        byte byteValue = ((Byte) wVar.e(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        T t3 = T.f2381c;
        t3.getClass();
        boolean a2 = t3.a(wVar.getClass()).a(wVar);
        if (z3) {
            wVar.e(2);
        }
        return a2;
    }

    public static void l(Class cls, C0118w wVar) {
        wVar.j();
        defaultInstanceMap.put(cls, wVar);
    }

    public final int a(W w3) {
        int i3;
        int i4;
        if (i()) {
            if (w3 == null) {
                T t3 = T.f2381c;
                t3.getClass();
                i4 = t3.a(getClass()).f(this);
            } else {
                i4 = w3.f(this);
            }
            if (i4 >= 0) {
                return i4;
            }
            throw new IllegalStateException(h.e("serialized size must be non-negative, was ", i4));
        }
        int i5 = this.memoizedSerializedSize;
        if ((i5 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i5 & Integer.MAX_VALUE;
        }
        if (w3 == null) {
            T t4 = T.f2381c;
            t4.getClass();
            i3 = t4.a(getClass()).f(this);
        } else {
            i3 = w3.f(this);
        }
        m(i3);
        return i3;
    }

    public final void b(C0109m mVar) {
        T t3 = T.f2381c;
        t3.getClass();
        W a2 = t3.a(getClass());
        F f3 = mVar.f2459l;
        if (f3 == null) {
            f3 = new F(mVar);
        }
        a2.d(this, f3);
    }

    public final void c() {
        this.memoizedHashCode = 0;
    }

    public final void d() {
        m(Integer.MAX_VALUE);
    }

    public abstract Object e(int i3);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        T t3 = T.f2381c;
        t3.getClass();
        return t3.a(getClass()).i(this, (C0118w) obj);
    }

    public final int hashCode() {
        if (i()) {
            T t3 = T.f2381c;
            t3.getClass();
            return t3.a(getClass()).e(this);
        }
        if (this.memoizedHashCode == 0) {
            T t4 = T.f2381c;
            t4.getClass();
            this.memoizedHashCode = t4.a(getClass()).e(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public final void j() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final C0118w k() {
        return (C0118w) e(4);
    }

    public final void m(int i3) {
        if (i3 >= 0) {
            this.memoizedSerializedSize = (i3 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException(h.e("serialized size must be non-negative, was ", i3));
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = M.f2360a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        M.c(this, sb, 0);
        return sb.toString();
    }
}
