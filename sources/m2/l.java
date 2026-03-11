package M2;

import A2.i;
import A2.t;
import B.m;
import J2.c;
import L2.d;
import N2.a;
import r2.C0420d;
import r2.C0425i;
import r2.C0426j;
import s2.C0466a;
import z2.p;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final m f1119a = new m(11, (Object) "NULL");

    public static /* synthetic */ d a(j jVar, c cVar, int i3, int i4, int i5) {
        C0425i iVar = cVar;
        if ((i5 & 1) != 0) {
            iVar = C0426j.f4457f;
        }
        if ((i5 & 2) != 0) {
            i3 = -3;
        }
        if ((i5 & 4) != 0) {
            i4 = 1;
        }
        return jVar.d(iVar, i3, i4);
    }

    /* JADX INFO: finally extract failed */
    public static final Object b(C0425i iVar, Object obj, Object obj2, p pVar, C0420d dVar) {
        Object m3 = a.m(iVar, obj2);
        try {
            s sVar = new s(dVar, iVar);
            t.a(2, pVar);
            Object i3 = pVar.i(obj, sVar);
            a.h(iVar, m3);
            if (i3 == C0466a.f4632f) {
                i.e(dVar, "frame");
            }
            return i3;
        } catch (Throwable th) {
            a.h(iVar, m3);
            throw th;
        }
    }
}
