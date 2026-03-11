package c2;

import C0.f;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f2779a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f2780b;

    public g(f fVar) {
        this.f2780b = fVar;
    }

    public final void a(Object obj) {
        if (!this.f2779a.get()) {
            f fVar = this.f2780b;
            if (((AtomicReference) fVar.f127g).get() == this) {
                f fVar2 = (f) fVar.f129i;
                ((f) fVar2.f128h).b((String) fVar2.f127g, ((x) fVar2.f129i).b(obj));
            }
        }
    }
}
