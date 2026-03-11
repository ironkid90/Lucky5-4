package U2;

import A2.t;
import B2.a;
import C0.r;
import V2.d;
import android.media.SoundPool;
import java.util.List;
import java.util.Map;
import q2.l;

public final /* synthetic */ class i implements SoundPool.OnLoadCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f1808a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f1809b;

    public /* synthetic */ i(r rVar, m mVar) {
        this.f1808a = rVar;
        this.f1809b = mVar;
    }

    public final void onLoadComplete(SoundPool soundPool, int i3, int i4) {
        d dVar;
        r rVar = this.f1808a;
        m mVar = this.f1809b;
        ((T2.d) rVar.f160g).b("Loaded " + i3);
        l lVar = (l) mVar.f1829b.get(Integer.valueOf(i3));
        if (lVar != null) {
            dVar = lVar.f1827m;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            Map map = mVar.f1829b;
            Integer num = lVar.f1823i;
            if (!(map instanceof a)) {
                map.remove(num);
                synchronized (mVar.f1830c) {
                    List<l> list = (List) mVar.f1830c.get(dVar);
                    if (list == null) {
                        list = l.f4396f;
                    }
                    for (l lVar2 : list) {
                        lVar2.f1820f.c("Marking " + lVar2 + " as loaded");
                        lVar2.f1820f.h(true);
                        p pVar = lVar2.f1820f;
                        if (pVar.f1846n) {
                            pVar.c("Delayed start of " + lVar2);
                            lVar2.b();
                        }
                    }
                }
                return;
            }
            t.e(map, "kotlin.collections.MutableMap");
            throw null;
        }
    }
}
