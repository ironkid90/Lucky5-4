package a1;

import X0.b;
import i1.C0218a;
import i1.C0219b;
import java.util.Set;

public final class r implements C0219b {

    /* renamed from: a  reason: collision with root package name */
    public final Set f2036a;

    /* renamed from: b  reason: collision with root package name */
    public final C0219b f2037b;

    public r(Set set, C0219b bVar) {
        this.f2036a = set;
        this.f2037b = bVar;
    }

    public final void a(C0218a aVar) {
        if (this.f2036a.contains(b.class)) {
            this.f2037b.a(aVar);
            return;
        }
        throw new RuntimeException("Attempting to publish an undeclared event " + aVar + ".");
    }
}
