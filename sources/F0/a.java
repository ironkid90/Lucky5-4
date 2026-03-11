package F0;

import C0.r;
import G0.i;
import G0.o;
import java.util.Arrays;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f295a;

    /* renamed from: b  reason: collision with root package name */
    public final r f296b;

    /* renamed from: c  reason: collision with root package name */
    public final String f297c;

    public a(r rVar, String str) {
        i iVar = i.f420a;
        this.f296b = rVar;
        this.f297c = str;
        this.f295a = Arrays.hashCode(new Object[]{rVar, iVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (o.g(this.f296b, aVar.f296b)) {
            i iVar = i.f420a;
            if (!o.g(iVar, iVar) || !o.g(this.f297c, aVar.f297c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f295a;
    }
}
