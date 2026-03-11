package i2;

import L.k;
import W0.i;
import W0.j;
import W0.l;
import W0.o;
import W0.p;
import X0.g;
import android.support.v4.media.session.a;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Map;
import java.util.Objects;
import s1.C0453n;

/* renamed from: i2.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0223d implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3240f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Map f3241g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ i f3242h;

    public /* synthetic */ C0223d(Map map, i iVar, int i3) {
        this.f3240f = i3;
        this.f3241g = map;
        this.f3242h = iVar;
    }

    public final void run() {
        switch (this.f3240f) {
            case 0:
                Map map = this.f3241g;
                i iVar = this.f3242h;
                try {
                    FirebaseMessaging c3 = FirebaseMessaging.c();
                    Object obj = map.get("topic");
                    Objects.requireNonNull(obj);
                    p pVar = c3.f2870h;
                    C0453n nVar = new C0453n((String) obj, 1);
                    pVar.getClass();
                    o oVar = j.f1876a;
                    p pVar2 = new p();
                    pVar.f1889b.d(new l(oVar, nVar, pVar2));
                    pVar.o();
                    a.d(pVar2);
                    iVar.b((Object) null);
                    return;
                } catch (Exception e2) {
                    iVar.a(e2);
                    return;
                }
            case 1:
                Map map2 = this.f3241g;
                i iVar2 = this.f3242h;
                try {
                    FirebaseMessaging c4 = FirebaseMessaging.c();
                    Object obj2 = map2.get("enabled");
                    Objects.requireNonNull(obj2);
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    c4.getClass();
                    g d3 = g.d();
                    d3.a();
                    d3.f1936a.getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", booleanValue).apply();
                    a.B(c4.f2864b, c4.f2865c, c4.j());
                    iVar2.b((Object) null);
                    return;
                } catch (Exception e3) {
                    iVar2.a(e3);
                    return;
                }
            case k.FLOAT_FIELD_NUMBER:
                Map map3 = this.f3241g;
                i iVar3 = this.f3242h;
                try {
                    FirebaseMessaging c5 = FirebaseMessaging.c();
                    Object obj3 = map3.get("topic");
                    Objects.requireNonNull(obj3);
                    p pVar3 = c5.f2870h;
                    C0453n nVar2 = new C0453n((String) obj3, 0);
                    pVar3.getClass();
                    o oVar2 = j.f1876a;
                    p pVar4 = new p();
                    pVar3.f1889b.d(new l(oVar2, nVar2, pVar4));
                    pVar3.o();
                    a.d(pVar4);
                    iVar3.b((Object) null);
                    return;
                } catch (Exception e4) {
                    iVar3.a(e4);
                    return;
                }
            default:
                Map map4 = this.f3241g;
                i iVar4 = this.f3242h;
                try {
                    FirebaseMessaging.c().h(a.v(map4));
                    iVar4.b((Object) null);
                    return;
                } catch (Exception e5) {
                    iVar4.a(e5);
                    return;
                }
        }
    }
}
