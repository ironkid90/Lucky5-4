package l;

import java.util.Iterator;

/* renamed from: l.b  reason: case insensitive filesystem */
public final class C0306b extends C0309e implements Iterator {

    /* renamed from: f  reason: collision with root package name */
    public C0307c f3988f;

    /* renamed from: g  reason: collision with root package name */
    public C0307c f3989g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f3990h;

    public C0306b(C0307c cVar, C0307c cVar2, int i3) {
        this.f3990h = i3;
        this.f3988f = cVar2;
        this.f3989g = cVar;
    }

    public final void a(C0307c cVar) {
        C0307c cVar2;
        C0307c cVar3 = null;
        if (this.f3988f == cVar && cVar == this.f3989g) {
            this.f3989g = null;
            this.f3988f = null;
        }
        C0307c cVar4 = this.f3988f;
        if (cVar4 == cVar) {
            switch (this.f3990h) {
                case 0:
                    cVar2 = cVar4.f3994i;
                    break;
                default:
                    cVar2 = cVar4.f3993h;
                    break;
            }
            this.f3988f = cVar2;
        }
        C0307c cVar5 = this.f3989g;
        if (cVar5 == cVar) {
            C0307c cVar6 = this.f3988f;
            if (!(cVar5 == cVar6 || cVar6 == null)) {
                cVar3 = b(cVar5);
            }
            this.f3989g = cVar3;
        }
    }

    public final C0307c b(C0307c cVar) {
        switch (this.f3990h) {
            case 0:
                return cVar.f3993h;
            default:
                return cVar.f3994i;
        }
    }

    public final boolean hasNext() {
        if (this.f3989g != null) {
            return true;
        }
        return false;
    }

    public final Object next() {
        C0307c cVar;
        C0307c cVar2 = this.f3989g;
        C0307c cVar3 = this.f3988f;
        if (cVar2 == cVar3 || cVar3 == null) {
            cVar = null;
        } else {
            cVar = b(cVar2);
        }
        this.f3989g = cVar;
        return cVar2;
    }
}
