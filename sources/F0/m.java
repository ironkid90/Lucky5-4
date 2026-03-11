package F0;

import C0.r;
import D0.c;
import G0.o;
import java.util.Arrays;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final a f337a;

    /* renamed from: b  reason: collision with root package name */
    public final c f338b;

    public /* synthetic */ m(a aVar, c cVar) {
        this.f337a = aVar;
        this.f338b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof m)) {
            m mVar = (m) obj;
            if (!o.g(this.f337a, mVar.f337a) || !o.g(this.f338b, mVar.f338b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f337a, this.f338b});
    }

    public final String toString() {
        r rVar = new r((Object) this);
        rVar.B(this.f337a, "key");
        rVar.B(this.f338b, "feature");
        return rVar.toString();
    }
}
