package P2;

import I2.J;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import r2.C0425i;

public abstract class g extends J {

    /* renamed from: h  reason: collision with root package name */
    public final b f1267h;

    public g(int i3, int i4, long j3, String str) {
        this.f1267h = new b(i3, i4, j3, str);
    }

    public final void g(C0425i iVar, Runnable runnable) {
        b bVar = this.f1267h;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1252m;
        bVar.b(runnable, k.f1278g, false);
    }
}
