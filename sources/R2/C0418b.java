package r2;

import A2.i;
import z2.p;

/* renamed from: r2.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0418b implements p {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4453f;

    public /* synthetic */ C0418b(int i3) {
        this.f4453f = i3;
    }

    public final Object i(Object obj, Object obj2) {
        C0419c cVar;
        switch (this.f4453f) {
            case 0:
                String str = (String) obj;
                C0423g gVar = (C0423g) obj2;
                i.e(str, "acc");
                i.e(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                C0425i iVar = (C0425i) obj;
                C0423g gVar2 = (C0423g) obj2;
                i.e(iVar, "acc");
                i.e(gVar2, "element");
                C0425i c3 = iVar.c(gVar2.getKey());
                C0426j jVar = C0426j.f4457f;
                if (c3 == jVar) {
                    return gVar2;
                }
                C0421e eVar = C0421e.f4456f;
                C0422f fVar = (C0422f) c3.n(eVar);
                if (fVar == null) {
                    cVar = new C0419c(c3, gVar2);
                } else {
                    C0425i c4 = c3.c(eVar);
                    if (c4 == jVar) {
                        return new C0419c(gVar2, fVar);
                    }
                    cVar = new C0419c(new C0419c(c4, gVar2), fVar);
                }
                return cVar;
        }
    }
}
