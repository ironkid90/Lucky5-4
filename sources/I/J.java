package I;

import B.m;
import I2.C0067s;
import I2.C0069u;
import I2.C0071w;
import I2.Q;
import I2.a0;
import K2.b;
import K2.g;
import K2.h;
import M0.a;
import java.util.concurrent.atomic.AtomicInteger;
import p2.C0368h;
import r2.C0420d;
import s1.C0464y;
import s2.C0466a;
import t2.C0488f;
import z2.p;

public final class J extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public int f547j;

    /* renamed from: k  reason: collision with root package name */
    public /* synthetic */ Object f548k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ P f549l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ C0488f f550m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J(P p3, p pVar, C0420d dVar) {
        super(2, dVar);
        this.f549l = p3;
        this.f550m = (C0488f) pVar;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [z2.p, t2.f] */
    public final C0420d c(Object obj, C0420d dVar) {
        J j3 = new J(this.f549l, this.f550m, dVar);
        j3.f548k = obj;
        return j3;
    }

    public final Object i(Object obj, Object obj2) {
        return ((J) c((C0069u) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [I2.l, I2.a0] */
    /* JADX WARNING: type inference failed for: r7v0, types: [z2.p, t2.f] */
    public final Object l(Object obj) {
        Object obj2 = C0466a.f4632f;
        int i3 = this.f547j;
        if (i3 == 0) {
            a.V(obj);
            ? a0Var = new a0(true);
            Throwable th = null;
            a0Var.H((Q) null);
            P p3 = this.f549l;
            S s3 = new S(this.f550m, a0Var, p3.f575m.r(), ((C0069u) this.f548k).j());
            C0464y yVar = p3.f579q;
            Object i4 = ((b) yVar.f4624h).i(s3);
            if (i4 instanceof g) {
                g gVar = (g) i4;
                if (gVar == null) {
                    gVar = null;
                }
                if (gVar != null) {
                    th = gVar.f900a;
                }
                if (th == null) {
                    th = new IllegalStateException("Channel was closed normally");
                }
                throw th;
            } else if (!(i4 instanceof h)) {
                if (((AtomicInteger) ((m) yVar.f4625i).f100g).getAndIncrement() == 0) {
                    C0071w.h((C0069u) yVar.f4622f, (C0067s) null, new V(yVar, (C0420d) null), 3);
                }
                this.f547j = 1;
                obj = a0Var.U(this);
                if (obj == obj2) {
                    return obj2;
                }
            } else {
                throw new IllegalStateException("Check failed.");
            }
        } else if (i3 == 1) {
            a.V(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
