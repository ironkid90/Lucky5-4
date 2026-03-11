package T1;

import S1.C0078d;
import U1.a;
import W1.f;
import c2.p;
import c2.q;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.l;
import java.util.ArrayList;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1724a = new ArrayList();

    public h(C0078d dVar, String[] strArr) {
        f fVar = (f) C0.f.O().f128h;
        if (!fVar.f1912a) {
            fVar.d(dVar.getApplicationContext());
            fVar.a(dVar.getApplicationContext(), strArr);
        }
    }

    public final c a(g gVar) {
        c cVar;
        g gVar2 = gVar;
        C0078d dVar = gVar2.f1718a;
        a aVar = gVar2.f1719b;
        String str = gVar2.f1720c;
        List list = gVar2.f1721d;
        l lVar = new l();
        boolean z3 = gVar2.f1722e;
        boolean z4 = gVar2.f1723f;
        if (aVar == null) {
            f fVar = (f) C0.f.O().f128h;
            if (fVar.f1912a) {
                aVar = new a((String) fVar.f1915d.f1900c, "main");
            } else {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
        }
        a aVar2 = aVar;
        ArrayList arrayList = this.f1724a;
        if (arrayList.size() == 0) {
            cVar = new c(dVar, (FlutterJNI) null, lVar, (String[]) null, z3, z4);
            if (str != null) {
                ((q) cVar.f1688i.f100g).a("setInitialRoute", str, (p) null);
            }
            cVar.f1682c.c(aVar2, list);
        } else {
            c cVar2 = (c) arrayList.get(0);
            if (cVar2.f1680a.isAttached()) {
                long j3 = c.f1678y;
                cVar = new c(dVar, cVar2.f1680a.spawn(aVar2.f1758c, aVar2.f1757b, str, list, j3), lVar, (String[]) null, z3, z4);
            } else {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
        }
        arrayList.add(cVar);
        cVar.v.add(new f(this, cVar));
        return cVar;
    }
}
