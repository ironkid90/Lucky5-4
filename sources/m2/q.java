package M2;

import A2.j;
import I2.C0058i;
import I2.C0068t;
import I2.Q;
import I2.a0;
import N2.t;
import r2.C0423g;
import r2.C0424h;
import z2.p;

public final class q extends j implements p {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ n f1128g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(n nVar) {
        super(2);
        this.f1128g = nVar;
    }

    public final Object i(Object obj, Object obj2) {
        int i3;
        int intValue = ((Number) obj).intValue();
        C0423g gVar = (C0423g) obj2;
        C0424h key = gVar.getKey();
        C0423g n3 = this.f1128g.f1122j.n(key);
        if (key != C0068t.f786g) {
            if (gVar != n3) {
                i3 = Integer.MIN_VALUE;
            } else {
                i3 = intValue + 1;
            }
            return Integer.valueOf(i3);
        }
        Q q3 = (Q) n3;
        Q q4 = (Q) gVar;
        while (true) {
            if (q4 != null) {
                if (q4 == q3 || !(q4 instanceof t)) {
                    break;
                }
                C0058i iVar = (C0058i) a0.f751g.get((a0) q4);
                if (iVar != null) {
                    q4 = iVar.getParent();
                } else {
                    q4 = null;
                }
            } else {
                q4 = null;
                break;
            }
        }
        if (q4 == q3) {
            if (q3 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + q4 + ", expected child of " + q3 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
