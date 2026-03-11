package Q2;

import N2.u;
import java.util.concurrent.atomic.AtomicReferenceArray;
import r2.C0425i;

public final class j extends u {

    /* renamed from: j  reason: collision with root package name */
    public final AtomicReferenceArray f1320j = new AtomicReferenceArray(i.f1319f);

    public j(long j3, j jVar, int i3) {
        super(j3, jVar, i3);
    }

    public final int f() {
        return i.f1319f;
    }

    public final void g(int i3, C0425i iVar) {
        this.f1320j.set(i3, i.f1318e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f1221h + ", hashCode=" + hashCode() + ']';
    }
}
