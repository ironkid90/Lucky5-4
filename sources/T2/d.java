package T2;

import A2.i;
import C0.r;
import U2.m;
import U2.p;
import Y1.a;
import Y1.b;
import android.content.Context;
import android.media.AudioManager;
import c2.f;
import c2.q;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p2.C0363c;
import q2.o;

public final class d implements b {

    /* renamed from: f  reason: collision with root package name */
    public r f1738f;

    /* renamed from: g  reason: collision with root package name */
    public Context f1739g;

    /* renamed from: h  reason: collision with root package name */
    public f f1740h;

    /* renamed from: i  reason: collision with root package name */
    public r f1741i;

    /* renamed from: j  reason: collision with root package name */
    public final ConcurrentHashMap f1742j = new ConcurrentHashMap();

    /* renamed from: k  reason: collision with root package name */
    public a f1743k = new a(false, false, 2, 1, 1, 0);

    public static void c(p pVar, boolean z3) {
        i.e(pVar, "player");
        pVar.f1834b.J("audio.onPrepared", o.Z(new C0363c("value", Boolean.valueOf(z3))));
    }

    public final AudioManager a() {
        Context context = this.f1739g;
        if (context != null) {
            Object systemService = context.getApplicationContext().getSystemService("audio");
            i.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return (AudioManager) systemService;
        }
        i.g("context");
        throw null;
    }

    public final void b(String str) {
        i.e(str, "message");
        r rVar = this.f1738f;
        if (rVar != null) {
            rVar.J("audio.onLog", o.Z(new C0363c("value", str)));
        } else {
            i.g("globalEvents");
            throw null;
        }
    }

    public final void onAttachedToEngine(a aVar) {
        i.e(aVar, "binding");
        this.f1739g = aVar.f1964a;
        f fVar = aVar.f1965b;
        this.f1740h = fVar;
        this.f1741i = new r(this);
        new q(fVar, "xyz.luan/audioplayers").b(new b(this, 0));
        new q(fVar, "xyz.luan/audioplayers.global").b(new b(this, 1));
        this.f1738f = new r(new C0.f(fVar, "xyz.luan/audioplayers.global/events"));
    }

    public final void onDetachedFromEngine(a aVar) {
        i.e(aVar, "binding");
        ConcurrentHashMap concurrentHashMap = this.f1742j;
        Collection<p> values = concurrentHashMap.values();
        i.d(values, "<get-values>(...)");
        for (p pVar : values) {
            pVar.e();
            pVar.f1834b.E();
        }
        concurrentHashMap.clear();
        r rVar = this.f1741i;
        if (rVar != null) {
            HashMap hashMap = (HashMap) rVar.f161h;
            for (Map.Entry value : hashMap.entrySet()) {
                m mVar = (m) value.getValue();
                mVar.f1828a.release();
                mVar.f1829b.clear();
                mVar.f1830c.clear();
            }
            hashMap.clear();
            r rVar2 = this.f1738f;
            if (rVar2 != null) {
                rVar2.E();
            } else {
                i.g("globalEvents");
                throw null;
            }
        } else {
            i.g("soundPoolManager");
            throw null;
        }
    }
}
