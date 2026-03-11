package z1;

import D1.a;
import l0.C0312b;
import w1.k;
import w1.r;
import w1.s;

public final class p implements s {

    /* renamed from: f  reason: collision with root package name */
    public final a f4925f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4926g;

    /* renamed from: h  reason: collision with root package name */
    public final C0312b f4927h;

    public p(C0312b bVar, a aVar, boolean z3) {
        this.f4927h = bVar;
        this.f4925f = aVar;
        this.f4926g = z3;
    }

    public final r create(k kVar, a aVar) {
        a aVar2 = this.f4925f;
        if (aVar2 == null) {
            throw null;
        } else if (aVar2.equals(aVar) || (this.f4926g && aVar2.f221b == aVar.f220a)) {
            return new q(this.f4927h, kVar, aVar, this);
        } else {
            return null;
        }
    }
}
