package I;

import K.b;
import L2.e;
import M0.a;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0484b;
import t2.C0488f;
import z2.q;

/* renamed from: I.q  reason: case insensitive filesystem */
public final class C0041q extends C0488f implements q {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f660j = 1;

    /* renamed from: k  reason: collision with root package name */
    public int f661k;

    /* renamed from: l  reason: collision with root package name */
    public /* synthetic */ Object f662l;

    public /* synthetic */ C0041q(int i3, C0420d dVar) {
        super(i3, dVar);
    }

    public final Object l(Object obj) {
        switch (this.f660j) {
            case 0:
                C0466a aVar = C0466a.f4632f;
                int i3 = this.f661k;
                if (i3 == 0) {
                    a.V(obj);
                    this.f661k = 1;
                    if (P.a((P) this.f662l, this) == aVar) {
                        return aVar;
                    }
                } else if (i3 == 1) {
                    a.V(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C0368h.f4194a;
            default:
                C0466a aVar2 = C0466a.f4632f;
                int i4 = this.f661k;
                if (i4 == 0) {
                    a.V(obj);
                    b bVar = (b) this.f662l;
                    this.f661k = 1;
                    bVar.getClass();
                    obj = b.a(bVar, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else if (i4 == 1) {
                    a.V(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
        }
    }

    public final Object p(Object obj, Object obj2, C0484b bVar) {
        switch (this.f660j) {
            case 0:
                e eVar = (e) obj;
                Throwable th = (Throwable) obj2;
                return new C0041q((P) this.f662l, (C0420d) bVar).l(C0368h.f4194a);
            default:
                ((Boolean) obj2).getClass();
                C0041q qVar = new C0041q(3, (C0420d) bVar);
                qVar.f662l = (b) obj;
                return qVar.l(C0368h.f4194a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0041q(P p3, C0420d dVar) {
        super(3, dVar);
        this.f662l = p3;
    }
}
