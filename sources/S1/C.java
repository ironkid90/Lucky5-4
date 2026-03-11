package S1;

import io.flutter.embedding.engine.renderer.h;
import io.flutter.embedding.engine.renderer.i;

public final class C implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f1425a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ E f1426b;

    public C(E e2, Runnable runnable) {
        this.f1426b = e2;
        this.f1425a = runnable;
    }

    public final void b() {
        this.f1425a.run();
        h hVar = this.f1426b.f1428b;
        if (hVar != null) {
            hVar.c(this);
        }
    }

    public final void a() {
    }
}
