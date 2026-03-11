package U2;

import I2.C0069u;
import M0.a;
import V2.d;
import p2.C0368h;
import r2.C0420d;
import t2.C0488f;
import z2.p;

public final class j extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public /* synthetic */ Object f1810j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ l f1811k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ String f1812l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ l f1813m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ d f1814n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ long f1815o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(l lVar, String str, l lVar2, d dVar, long j3, C0420d dVar2) {
        super(2, dVar2);
        this.f1811k = lVar;
        this.f1812l = str;
        this.f1813m = lVar2;
        this.f1814n = dVar;
        this.f1815o = j3;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        j jVar = new j(this.f1811k, this.f1812l, this.f1813m, this.f1814n, this.f1815o, dVar);
        jVar.f1810j = obj;
        return jVar;
    }

    public final Object i(Object obj, Object obj2) {
        C0368h hVar = C0368h.f4194a;
        ((j) c((C0069u) obj, (C0420d) obj2)).l(hVar);
        return hVar;
    }

    public final Object l(Object obj) {
        a.V(obj);
        l lVar = this.f1811k;
        p pVar = lVar.f1820f;
        StringBuilder sb = new StringBuilder("Now loading ");
        String str = this.f1812l;
        sb.append(str);
        pVar.c(sb.toString());
        int load = lVar.f1826l.f1828a.load(str, 1);
        lVar.f1826l.f1829b.put(new Integer(load), this.f1813m);
        lVar.f1823i = new Integer(load);
        p pVar2 = lVar.f1820f;
        pVar2.c("time to call load() for " + this.f1814n + ": " + (System.currentTimeMillis() - this.f1815o) + " player=" + ((C0069u) this.f1810j));
        return C0368h.f4194a;
    }
}
