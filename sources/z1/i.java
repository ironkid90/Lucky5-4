package z1;

import E1.a;
import E1.b;
import E1.c;
import java.lang.reflect.Type;
import java.util.Map;
import w1.k;
import w1.r;
import y1.m;

public final class i extends r {

    /* renamed from: a  reason: collision with root package name */
    public final com.dexterous.flutterlocalnotifications.i f4899a;

    /* renamed from: b  reason: collision with root package name */
    public final com.dexterous.flutterlocalnotifications.i f4900b;

    /* renamed from: c  reason: collision with root package name */
    public final m f4901c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0526b f4902d;

    public i(C0526b bVar, k kVar, Type type, r rVar, Type type2, r rVar2, m mVar) {
        this.f4902d = bVar;
        this.f4899a = new com.dexterous.flutterlocalnotifications.i(kVar, rVar, type);
        this.f4900b = new com.dexterous.flutterlocalnotifications.i(kVar, rVar2, type2);
        this.f4901c = mVar;
    }

    public final Object a(b bVar) {
        int w3 = bVar.w();
        if (w3 == 9) {
            bVar.s();
            return null;
        }
        Map map = (Map) this.f4901c.r();
        com.dexterous.flutterlocalnotifications.i iVar = this.f4900b;
        com.dexterous.flutterlocalnotifications.i iVar2 = this.f4899a;
        r rVar = (r) iVar.f2818c;
        r rVar2 = (r) iVar2.f2818c;
        if (w3 == 1) {
            bVar.a();
            while (bVar.j()) {
                bVar.a();
                Object a2 = rVar2.a(bVar);
                if (map.put(a2, rVar.a(bVar)) == null) {
                    bVar.e();
                } else {
                    throw new RuntimeException("duplicate key: " + a2);
                }
            }
            bVar.e();
        } else {
            bVar.b();
            while (bVar.j()) {
                a.f226a.getClass();
                a.a(bVar);
                Object a3 = rVar2.a(bVar);
                if (map.put(a3, rVar.a(bVar)) != null) {
                    throw new RuntimeException("duplicate key: " + a3);
                }
            }
            bVar.g();
        }
        return map;
    }

    public final void b(c cVar, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            cVar.j();
            return;
        }
        this.f4902d.getClass();
        com.dexterous.flutterlocalnotifications.i iVar = this.f4900b;
        cVar.c();
        for (Map.Entry entry : map.entrySet()) {
            cVar.h(String.valueOf(entry.getKey()));
            iVar.b(cVar, entry.getValue());
        }
        cVar.g();
    }
}
