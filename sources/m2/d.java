package M2;

import I2.C;
import I2.C0069u;
import I2.C0071w;
import K2.b;
import K2.i;
import K2.o;
import L2.e;
import L2.t;
import M0.a;
import p2.C0368h;
import r2.C0420d;
import r2.C0421e;
import r2.C0425i;
import s2.C0466a;
import t2.C0488f;
import z2.p;

public final class d extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public int f1102j;

    /* renamed from: k  reason: collision with root package name */
    public /* synthetic */ Object f1103k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ e f1104l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ f f1105m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(e eVar, f fVar, C0420d dVar) {
        super(2, dVar);
        this.f1104l = eVar;
        this.f1105m = fVar;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        d dVar2 = new d(this.f1104l, this.f1105m, dVar);
        dVar2.f1103k = obj;
        return dVar2;
    }

    public final Object i(Object obj, Object obj2) {
        return ((d) c((C0069u) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        C0466a aVar = C0466a.f4632f;
        int i3 = this.f1102j;
        C0368h hVar = C0368h.f4194a;
        if (i3 == 0) {
            a.V(obj);
            C0069u uVar = (C0069u) this.f1103k;
            f fVar = this.f1105m;
            int i4 = fVar.f1110g;
            if (i4 == -3) {
                i4 = -2;
            }
            e eVar = new e(fVar, (C0420d) null);
            b a2 = i.a(i4, fVar.f1111h, 4);
            C0425i b3 = C0071w.b(uVar.j(), fVar.f1109f, true);
            P2.d dVar = C.f715a;
            if (b3 != dVar && b3.n(C0421e.f4456f) == null) {
                b3 = b3.d(dVar);
            }
            o oVar = new o(b3, a2);
            oVar.W(3, oVar, eVar);
            this.f1102j = 1;
            Object b4 = t.b(this.f1104l, oVar, true, this);
            if (b4 != aVar) {
                b4 = hVar;
            }
            if (b4 == aVar) {
                return aVar;
            }
        } else if (i3 == 1) {
            a.V(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return hVar;
    }
}
