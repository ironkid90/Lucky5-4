package A2;

import F2.a;
import p2.C0361a;

public abstract class g extends c implements f, a, C0361a {

    /* renamed from: l  reason: collision with root package name */
    public final int f77l;

    /* renamed from: m  reason: collision with root package name */
    public final int f78m;

    public g(int i3, Class cls, String str, String str2, int i4) {
        this(i3, b.f68f, cls, str, str2, i4);
    }

    public final a b() {
        r.f87a.getClass();
        return this;
    }

    public final int d() {
        return this.f77l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (!this.f72i.equals(gVar.f72i) || !this.f73j.equals(gVar.f73j) || this.f78m != gVar.f78m || this.f77l != gVar.f77l || !i.a(this.f70g, gVar.f70g) || !c().equals(gVar.c())) {
                return false;
            }
            return true;
        } else if (!(obj instanceof g)) {
            return false;
        } else {
            a aVar = this.f69f;
            if (aVar == null) {
                b();
                this.f69f = this;
                aVar = this;
            }
            return obj.equals(aVar);
        }
    }

    public final int hashCode() {
        c();
        int hashCode = this.f72i.hashCode();
        return this.f73j.hashCode() + ((hashCode + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        a aVar = this.f69f;
        if (aVar == null) {
            b();
            this.f69f = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f72i;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(int i3, Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.f77l = i3;
        this.f78m = 0;
    }
}
