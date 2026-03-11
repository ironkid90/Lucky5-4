package t2;

import A2.i;
import I2.C0055f;
import M0.a;
import N2.h;
import j.X;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r2.C0420d;
import r2.C0421e;
import r2.C0422f;
import r2.C0423g;
import r2.C0425i;
import s2.C0466a;

/* renamed from: t2.b  reason: case insensitive filesystem */
public abstract class C0484b implements C0420d, C0485c, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final C0420d f4683f;

    /* renamed from: g  reason: collision with root package name */
    public final C0425i f4684g;

    /* renamed from: h  reason: collision with root package name */
    public transient C0420d f4685h;

    public C0484b(C0420d dVar, C0425i iVar) {
        this.f4683f = dVar;
        this.f4684g = iVar;
    }

    public C0420d c(Object obj, C0420d dVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement e() {
        int i3;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i4;
        C0486d dVar = (C0486d) getClass().getAnnotation(C0486d.class);
        String str2 = null;
        if (dVar == null) {
            return null;
        }
        int v = dVar.v();
        if (v <= 1) {
            int i5 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(this);
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                if (num != null) {
                    i4 = num.intValue();
                } else {
                    i4 = 0;
                }
                i3 = i4 - 1;
            } catch (Exception unused) {
                i3 = -1;
            }
            if (i3 >= 0) {
                i5 = dVar.l()[i3];
            }
            X x2 = C0487e.f4687b;
            X x3 = C0487e.f4686a;
            if (x2 == null) {
                try {
                    X x4 = new X(Class.class.getDeclaredMethod("getModule", (Class[]) null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", (Class[]) null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", (Class[]) null));
                    C0487e.f4687b = x4;
                    x2 = x4;
                } catch (Exception unused2) {
                    C0487e.f4687b = x3;
                    x2 = x3;
                }
            }
            if (!(x2 == x3 || (method = x2.f3648a) == null || (invoke = method.invoke(getClass(), (Object[]) null)) == null || (method2 = x2.f3649b) == null || (invoke2 = method2.invoke(invoke, (Object[]) null)) == null)) {
                Method method3 = x2.f3650c;
                if (method3 != null) {
                    obj = method3.invoke(invoke2, (Object[]) null);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str2 = (String) obj;
                }
            }
            if (str2 == null) {
                str = dVar.c();
            } else {
                str = str2 + '/' + dVar.c();
            }
            return new StackTraceElement(str, dVar.m(), dVar.f(), i5);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
    }

    public C0485c g() {
        C0420d dVar = this.f4683f;
        if (dVar instanceof C0485c) {
            return (C0485c) dVar;
        }
        return null;
    }

    public C0425i h() {
        C0425i iVar = this.f4684g;
        i.b(iVar);
        return iVar;
    }

    public abstract Object l(Object obj);

    public final void m(Object obj) {
        C0420d dVar = this;
        while (true) {
            C0484b bVar = (C0484b) dVar;
            C0420d dVar2 = bVar.f4683f;
            i.b(dVar2);
            try {
                obj = bVar.l(obj);
                if (obj == C0466a.f4632f) {
                    return;
                }
            } catch (Throwable th) {
                obj = a.h(th);
            }
            bVar.n();
            if (dVar2 instanceof C0484b) {
                dVar = dVar2;
            } else {
                dVar2.m(obj);
                return;
            }
        }
    }

    public void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0055f fVar;
        C0420d dVar = this.f4685h;
        if (!(dVar == null || dVar == this)) {
            C0423g n3 = h().n(C0421e.f4456f);
            i.b(n3);
            C0422f fVar2 = (C0422f) n3;
            h hVar = (h) dVar;
            do {
                atomicReferenceFieldUpdater = h.f1192m;
            } while (atomicReferenceFieldUpdater.get(hVar) == N2.a.f1182d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            if (obj instanceof C0055f) {
                fVar = (C0055f) obj;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                fVar.r();
            }
        }
        this.f4685h = C0483a.f4682f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object e2 = e();
        if (e2 == null) {
            e2 = getClass().getName();
        }
        sb.append(e2);
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0484b(C0420d dVar) {
        this(dVar, dVar != null ? dVar.h() : null);
    }
}
