package S2;

import A2.j;
import A2.n;
import java.io.IOException;
import p2.C0368h;
import z2.p;

public final class f extends j implements p {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ n f1542g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ long f1543h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ A2.p f1544i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ R2.p f1545j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ A2.p f1546k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ A2.p f1547l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(n nVar, long j3, A2.p pVar, R2.p pVar2, A2.p pVar3, A2.p pVar4) {
        super(2);
        this.f1542g = nVar;
        this.f1543h = j3;
        this.f1544i = pVar;
        this.f1545j = pVar2;
        this.f1546k = pVar3;
        this.f1547l = pVar4;
    }

    public final Object i(Object obj, Object obj2) {
        long j3;
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 1) {
            n nVar = this.f1542g;
            if (!nVar.f83f) {
                nVar.f83f = true;
                if (longValue >= this.f1543h) {
                    A2.p pVar = this.f1544i;
                    long j4 = pVar.f85f;
                    int i3 = (j4 > 4294967295L ? 1 : (j4 == 4294967295L ? 0 : -1));
                    R2.p pVar2 = this.f1545j;
                    if (i3 == 0) {
                        j4 = pVar2.b();
                    }
                    pVar.f85f = j4;
                    A2.p pVar3 = this.f1546k;
                    long j5 = 0;
                    if (pVar3.f85f == 4294967295L) {
                        j3 = pVar2.b();
                    } else {
                        j3 = 0;
                    }
                    pVar3.f85f = j3;
                    A2.p pVar4 = this.f1547l;
                    if (pVar4.f85f == 4294967295L) {
                        j5 = pVar2.b();
                    }
                    pVar4.f85f = j5;
                } else {
                    throw new IOException("bad zip: zip64 extra too short");
                }
            } else {
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }
        return C0368h.f4194a;
    }
}
