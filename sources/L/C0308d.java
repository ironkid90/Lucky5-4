package l;

import java.util.Iterator;

/* renamed from: l.d  reason: case insensitive filesystem */
public final class C0308d extends C0309e implements Iterator {

    /* renamed from: f  reason: collision with root package name */
    public C0307c f3995f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3996g = true;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C0310f f3997h;

    public C0308d(C0310f fVar) {
        this.f3997h = fVar;
    }

    public final void a(C0307c cVar) {
        boolean z3;
        C0307c cVar2 = this.f3995f;
        if (cVar == cVar2) {
            C0307c cVar3 = cVar2.f3994i;
            this.f3995f = cVar3;
            if (cVar3 == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f3996g = z3;
        }
    }

    public final boolean hasNext() {
        if (!this.f3996g) {
            C0307c cVar = this.f3995f;
            if (cVar == null || cVar.f3993h == null) {
                return false;
            }
            return true;
        } else if (this.f3997h.f3998f != null) {
            return true;
        } else {
            return false;
        }
    }

    public final Object next() {
        C0307c cVar;
        if (this.f3996g) {
            this.f3996g = false;
            this.f3995f = this.f3997h.f3998f;
        } else {
            C0307c cVar2 = this.f3995f;
            if (cVar2 != null) {
                cVar = cVar2.f3993h;
            } else {
                cVar = null;
            }
            this.f3995f = cVar;
        }
        return this.f3995f;
    }
}
