package s0;

import android.content.Context;
import c2.n;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final n f4481a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4482b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f4483c = new HashMap();

    public f(Context context, d dVar) {
        n nVar = new n(context);
        this.f4481a = nVar;
        this.f4482b = dVar;
    }

    public final synchronized g a(String str) {
        if (this.f4483c.containsKey(str)) {
            return (g) this.f4483c.get(str);
        }
        CctBackendFactory g2 = this.f4481a.g(str);
        if (g2 == null) {
            return null;
        }
        d dVar = this.f4482b;
        g create = g2.create(new b(dVar.f4476a, dVar.f4477b, dVar.f4478c, str));
        this.f4483c.put(str, create);
        return create;
    }
}
