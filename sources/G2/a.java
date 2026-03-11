package G2;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f479a;

    public a(e eVar) {
        this.f479a = new AtomicReference(eVar);
    }

    public final Iterator iterator() {
        b bVar = (b) this.f479a.getAndSet((Object) null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
