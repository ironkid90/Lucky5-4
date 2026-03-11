package androidx.datastore.preferences.protobuf;

import L.j;
import java.util.concurrent.ConcurrentHashMap;

public final class T {

    /* renamed from: c  reason: collision with root package name */
    public static final T f2381c = new T();

    /* renamed from: a  reason: collision with root package name */
    public final F f2382a = new F();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f2383b = new ConcurrentHashMap();

    public final W a(Class cls) {
        W w3;
        C0112p pVar;
        C0112p pVar2;
        O o3;
        Class cls2;
        C0120y.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f2383b;
        W w4 = (W) concurrentHashMap.get(cls);
        if (w4 != null) {
            return w4;
        }
        F f3 = this.f2382a;
        f3.getClass();
        Class cls3 = X.f2391a;
        Class<C0118w> cls4 = C0118w.class;
        if (cls4.isAssignableFrom(cls) || (cls2 = X.f2391a) == null || cls2.isAssignableFrom(cls)) {
            V b3 = ((E) f3.f2351a).b(cls);
            if ((b3.f2390d & 2) == 2) {
                boolean isAssignableFrom = cls4.isAssignableFrom(cls);
                C0118w wVar = b3.f2387a;
                if (isAssignableFrom) {
                    o3 = new O(X.f2393c, C0113q.f2467a, wVar);
                } else {
                    d0 d0Var = X.f2392b;
                    C0112p pVar3 = C0113q.f2468b;
                    if (pVar3 != null) {
                        o3 = new O(d0Var, pVar3, wVar);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                w3 = o3;
            } else if (cls4.isAssignableFrom(cls)) {
                P p3 = Q.f2380b;
                C c3 = D.f2348b;
                d0 d0Var2 = X.f2393c;
                if (j.b(b3.d()) != 1) {
                    pVar2 = C0113q.f2467a;
                } else {
                    pVar2 = null;
                }
                J j3 = K.f2359b;
                int[] iArr = N.f2361n;
                if (b3 instanceof V) {
                    w3 = N.x(b3, p3, c3, d0Var2, pVar2, j3);
                } else {
                    b3.getClass();
                    throw new ClassCastException();
                }
            } else {
                P p4 = Q.f2379a;
                C c4 = D.f2347a;
                d0 d0Var3 = X.f2392b;
                if (j.b(b3.d()) != 1) {
                    pVar = C0113q.f2468b;
                    if (pVar == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                } else {
                    pVar = null;
                }
                J j4 = K.f2358a;
                int[] iArr2 = N.f2361n;
                if (b3 instanceof V) {
                    w3 = N.x(b3, p4, c4, d0Var3, pVar, j4);
                } else {
                    b3.getClass();
                    throw new ClassCastException();
                }
            }
            W w5 = (W) concurrentHashMap.putIfAbsent(cls, w3);
            if (w5 != null) {
                return w5;
            }
            return w3;
        }
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
    }
}
