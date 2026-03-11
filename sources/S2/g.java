package S2;

import A2.j;
import A2.q;
import java.io.IOException;
import p2.C0368h;
import z2.p;

public final class g extends j implements p {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ R2.p f1548g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ q f1549h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ q f1550i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ q f1551j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(R2.p pVar, q qVar, q qVar2, q qVar3) {
        super(2);
        this.f1548g = pVar;
        this.f1549h = qVar;
        this.f1550i = qVar2;
        this.f1551j = qVar3;
    }

    public final Object i(Object obj, Object obj2) {
        boolean z3;
        boolean z4;
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 21589) {
            long j3 = 1;
            if (longValue >= 1) {
                R2.p pVar = this.f1548g;
                pVar.e(1);
                byte d3 = pVar.f1401g.d();
                boolean z5 = true;
                if ((d3 & 1) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((d3 & 2) == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((d3 & 4) != 4) {
                    z5 = false;
                }
                if (z3) {
                    j3 = 5;
                }
                if (z4) {
                    j3 += 4;
                }
                if (z5) {
                    j3 += 4;
                }
                if (longValue >= j3) {
                    if (z3) {
                        this.f1549h.f86f = Long.valueOf(((long) pVar.a()) * 1000);
                    }
                    if (z4) {
                        this.f1550i.f86f = Long.valueOf(((long) pVar.a()) * 1000);
                    }
                    if (z5) {
                        this.f1551j.f86f = Long.valueOf(((long) pVar.a()) * 1000);
                    }
                } else {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
            } else {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
        }
        return C0368h.f4194a;
    }
}
