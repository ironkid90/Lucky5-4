package androidx.lifecycle;

import A2.i;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public e f2507a;

    /* renamed from: b  reason: collision with root package name */
    public i f2508b;

    public final void a(j jVar, d dVar) {
        e a2 = dVar.a();
        e eVar = this.f2507a;
        i.e(eVar, "state1");
        if (a2.compareTo(eVar) < 0) {
            eVar = a2;
        }
        this.f2507a = eVar;
        this.f2508b.a(jVar, dVar);
        this.f2507a = a2;
    }
}
