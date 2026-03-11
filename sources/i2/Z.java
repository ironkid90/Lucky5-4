package I2;

import A2.i;
import B.m;
import N2.a;
import N2.b;
import N2.k;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class Z extends b {

    /* renamed from: b  reason: collision with root package name */
    public final V f745b;

    /* renamed from: c  reason: collision with root package name */
    public b0 f746c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a0 f747d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ M f748e;

    public Z(V v, a0 a0Var, M m3) {
        this.f747d = a0Var;
        this.f748e = m3;
        this.f745b = v;
    }

    public final void b(Object obj, Object obj2) {
        boolean z3;
        Object obj3;
        k kVar = (k) obj;
        if (obj2 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        V v = this.f745b;
        if (z3) {
            obj3 = v;
        } else {
            obj3 = this.f746c;
        }
        if (obj3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.f1202f;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, obj3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z3) {
                b0 b0Var = this.f746c;
                i.b(b0Var);
                v.h(b0Var);
            }
        }
    }

    public final m c(Object obj) {
        k kVar = (k) obj;
        if (this.f747d.E() == this.f748e) {
            return null;
        }
        return a.f1183e;
    }
}
