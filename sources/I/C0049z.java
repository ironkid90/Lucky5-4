package I;

import B.m;
import I2.C0061l;
import I2.C0069u;
import J2.c;
import L2.d;
import M0.a;
import M2.h;
import M2.j;
import M2.l;
import p2.C0368h;
import r2.C0420d;
import r2.C0426j;
import s2.C0466a;
import t2.C0488f;
import z2.p;

/* renamed from: I.z  reason: case insensitive filesystem */
public final class C0049z extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public int f692j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ P f693k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0049z(P p3, C0420d dVar) {
        super(2, dVar);
        this.f693k = p3;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        return new C0049z(this.f693k, dVar);
    }

    public final Object i(Object obj, Object obj2) {
        return ((C0049z) c((C0069u) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        d dVar;
        C0466a aVar = C0466a.f4632f;
        int i3 = this.f692j;
        C0368h hVar = C0368h.f4194a;
        P p3 = this.f693k;
        if (i3 == 0) {
            a.V(obj);
            this.f692j = 1;
            Object U3 = ((C0061l) p3.f576n.f4623g).U(this);
            if (U3 != aVar) {
                U3 = hVar;
            }
            if (U3 == aVar) {
                return aVar;
            }
        } else if (i3 == 1) {
            a.V(obj);
        } else if (i3 == 2) {
            a.V(obj);
            return hVar;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        m mVar = p3.f().f606c;
        if (mVar instanceof j) {
            dVar = l.a((j) mVar, (c) null, 0, 2, 1);
        } else {
            dVar = new h(mVar, C0426j.f4457f, 0, 2);
        }
        C0048y yVar = new C0048y(0, p3);
        this.f692j = 2;
        if (dVar.g(yVar, this) == aVar) {
            return aVar;
        }
        return hVar;
    }
}
