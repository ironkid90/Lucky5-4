package I;

import M0.a;
import p2.C0368h;
import r2.C0420d;
import t2.C0488f;
import z2.l;

/* renamed from: I.f  reason: case insensitive filesystem */
public final class C0030f extends C0488f implements l {

    /* renamed from: j  reason: collision with root package name */
    public int f621j;

    /* JADX WARNING: type inference failed for: r0v0, types: [I.f, t2.f] */
    public final Object j(Object obj) {
        ? fVar = new C0488f(1, (C0420d) obj);
        C0368h hVar = C0368h.f4194a;
        fVar.l(hVar);
        return hVar;
    }

    public final Object l(Object obj) {
        int i3 = this.f621j;
        if (i3 == 0) {
            a.V(obj);
            this.f621j = 1;
            throw null;
        } else if (i3 == 1) {
            a.V(obj);
            return C0368h.f4194a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
