package r2;

import A2.i;
import java.io.Serializable;
import z2.p;

/* renamed from: r2.c  reason: case insensitive filesystem */
public final class C0419c implements C0425i, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final C0425i f4454f;

    /* renamed from: g  reason: collision with root package name */
    public final C0423g f4455g;

    public C0419c(C0425i iVar, C0423g gVar) {
        i.e(iVar, "left");
        i.e(gVar, "element");
        this.f4454f = iVar;
        this.f4455g = gVar;
    }

    public final C0425i c(C0424h hVar) {
        i.e(hVar, "key");
        C0423g gVar = this.f4455g;
        C0423g n3 = gVar.n(hVar);
        C0425i iVar = this.f4454f;
        if (n3 != null) {
            return iVar;
        }
        C0425i c3 = iVar.c(hVar);
        if (c3 == iVar) {
            return this;
        }
        if (c3 == C0426j.f4457f) {
            return gVar;
        }
        return new C0419c(c3, gVar);
    }

    public final C0425i d(C0425i iVar) {
        i.e(iVar, "context");
        if (iVar == C0426j.f4457f) {
            return this;
        }
        return (C0425i) iVar.e(this, new C0418b(1));
    }

    public final Object e(Object obj, p pVar) {
        return pVar.i(this.f4454f.e(obj, pVar), this.f4455g);
    }

    public final boolean equals(Object obj) {
        boolean z3;
        if (this != obj) {
            if (!(obj instanceof C0419c)) {
                return false;
            }
            C0419c cVar = (C0419c) obj;
            cVar.getClass();
            int i3 = 2;
            C0419c cVar2 = cVar;
            int i4 = 2;
            while (true) {
                C0425i iVar = cVar2.f4454f;
                if (iVar instanceof C0419c) {
                    cVar2 = (C0419c) iVar;
                } else {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    break;
                }
                i4++;
            }
            C0419c cVar3 = this;
            while (true) {
                C0425i iVar2 = cVar3.f4454f;
                if (iVar2 instanceof C0419c) {
                    cVar3 = (C0419c) iVar2;
                } else {
                    cVar3 = null;
                }
                if (cVar3 == null) {
                    break;
                }
                i3++;
            }
            if (i4 != i3) {
                return false;
            }
            C0419c cVar4 = this;
            while (true) {
                C0423g gVar = cVar4.f4455g;
                if (i.a(cVar.n(gVar.getKey()), gVar)) {
                    C0425i iVar3 = cVar4.f4454f;
                    if (!(iVar3 instanceof C0419c)) {
                        i.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        C0423g gVar2 = (C0423g) iVar3;
                        z3 = i.a(cVar.n(gVar2.getKey()), gVar2);
                        break;
                    }
                    cVar4 = (C0419c) iVar3;
                } else {
                    z3 = false;
                    break;
                }
            }
            if (z3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f4455g.hashCode() + this.f4454f.hashCode();
    }

    public final C0423g n(C0424h hVar) {
        i.e(hVar, "key");
        C0419c cVar = this;
        while (true) {
            C0423g n3 = cVar.f4455g.n(hVar);
            if (n3 != null) {
                return n3;
            }
            C0425i iVar = cVar.f4454f;
            if (!(iVar instanceof C0419c)) {
                return iVar.n(hVar);
            }
            cVar = (C0419c) iVar;
        }
    }

    public final String toString() {
        return "[" + ((String) e("", new C0418b(0))) + ']';
    }
}
