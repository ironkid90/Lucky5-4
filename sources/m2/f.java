package M2;

import A2.i;
import K2.p;
import L2.d;
import L2.e;
import M0.a;
import N2.t;
import java.util.ArrayList;
import p2.C0368h;
import q2.C0401d;
import r2.C0420d;
import r2.C0425i;
import r2.C0426j;
import s2.C0466a;
import z2.l;

public abstract class f implements j {

    /* renamed from: f  reason: collision with root package name */
    public final C0425i f1109f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1110g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1111h;

    public f(C0425i iVar, int i3, int i4) {
        this.f1109f = iVar;
        this.f1110g = i3;
        this.f1111h = i4;
    }

    public abstract Object a(p pVar, C0420d dVar);

    public abstract f b(C0425i iVar, int i3, int i4);

    public final d d(C0425i iVar, int i3, int i4) {
        C0425i iVar2 = this.f1109f;
        C0425i d3 = iVar.d(iVar2);
        int i5 = this.f1111h;
        int i6 = this.f1110g;
        if (i4 == 1) {
            if (i6 != -3) {
                if (i3 != -3) {
                    if (i6 != -2) {
                        if (i3 != -2) {
                            i3 += i6;
                            if (i3 < 0) {
                                i3 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i3 = i6;
            }
            i4 = i5;
        }
        if (i.a(d3, iVar2) && i3 == i6 && i4 == i5) {
            return this;
        }
        return b(d3, i3, i4);
    }

    public Object g(e eVar, C0420d dVar) {
        d dVar2 = new d(eVar, this, (C0420d) null);
        t tVar = new t(dVar, dVar.h());
        Object U3 = a.U(tVar, tVar, dVar2);
        if (U3 == C0466a.f4632f) {
            return U3;
        }
        return C0368h.f4194a;
    }

    public String toString() {
        String str;
        ArrayList arrayList = new ArrayList(4);
        C0426j jVar = C0426j.f4457f;
        C0425i iVar = this.f1109f;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i3 = this.f1110g;
        if (i3 != -3) {
            arrayList.add("capacity=" + i3);
        }
        int i4 = this.f1111h;
        if (i4 != 1) {
            if (i4 == 1) {
                str = "SUSPEND";
            } else if (i4 == 2) {
                str = "DROP_OLDEST";
            } else if (i4 != 3) {
                str = "null";
            } else {
                str = "DROP_LATEST";
            }
            arrayList.add("onBufferOverflow=".concat(str));
        }
        return getClass().getSimpleName() + '[' + C0401d.e0(arrayList, ", ", (String) null, (String) null, (l) null, 62) + ']';
    }
}
