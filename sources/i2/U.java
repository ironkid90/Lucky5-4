package I2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class U extends a0 {

    /* renamed from: h  reason: collision with root package name */
    public final boolean f734h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U(Q q3) {
        super(true);
        C0059j jVar;
        C0059j jVar2;
        boolean z3 = true;
        H(q3);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a0.f751g;
        C0058i iVar = (C0058i) atomicReferenceFieldUpdater.get(this);
        if (iVar instanceof C0059j) {
            jVar = (C0059j) iVar;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            a0 n3 = jVar.n();
            while (true) {
                if (!n3.B()) {
                    C0058i iVar2 = (C0058i) atomicReferenceFieldUpdater.get(n3);
                    if (iVar2 instanceof C0059j) {
                        jVar2 = (C0059j) iVar2;
                    } else {
                        jVar2 = null;
                    }
                    if (jVar2 == null) {
                        break;
                    }
                    n3 = jVar2.n();
                } else {
                    break;
                }
            }
        }
        z3 = false;
        this.f734h = z3;
    }

    public final boolean B() {
        return this.f734h;
    }

    public final boolean C() {
        return true;
    }
}
