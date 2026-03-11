package G2;

import B2.a;
import H2.b;
import H2.c;
import java.util.Iterator;

public final class f implements Iterable, a {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c f481f;

    public f(c cVar) {
        this.f481f = cVar;
    }

    public final Iterator iterator() {
        return new b(this.f481f);
    }
}
