package A2;

import F2.a;
import F2.c;

public abstract class m extends c implements c {

    /* renamed from: l  reason: collision with root package name */
    public final boolean f82l = false;

    public m(Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, true);
    }

    public final a e() {
        if (this.f82l) {
            return this;
        }
        a aVar = this.f69f;
        if (aVar != null) {
            return aVar;
        }
        a b3 = b();
        this.f69f = b3;
        return b3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (!c().equals(mVar.c()) || !this.f72i.equals(mVar.f72i) || !this.f73j.equals(mVar.f73j) || !i.a(this.f70g, mVar.f70g)) {
                return false;
            }
            return true;
        } else if (obj instanceof c) {
            return obj.equals(e());
        } else {
            return false;
        }
    }

    public final int hashCode() {
        int hashCode = this.f72i.hashCode();
        return this.f73j.hashCode() + ((hashCode + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        a e2 = e();
        if (e2 != this) {
            return e2.toString();
        }
        return "property " + this.f72i + " (Kotlin reflection is not available)";
    }
}
