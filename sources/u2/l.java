package U2;

import A2.i;
import C0.r;
import I2.C;
import I2.C0071w;
import N2.e;
import N2.o;
import T2.a;
import T2.f;
import V2.c;
import V2.d;
import android.media.SoundPool;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r2.C0420d;

public final class l implements h {

    /* renamed from: f  reason: collision with root package name */
    public final p f1820f;

    /* renamed from: g  reason: collision with root package name */
    public final r f1821g;

    /* renamed from: h  reason: collision with root package name */
    public final e f1822h = C0071w.a(o.f1214a);

    /* renamed from: i  reason: collision with root package name */
    public Integer f1823i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f1824j;

    /* renamed from: k  reason: collision with root package name */
    public a f1825k;

    /* renamed from: l  reason: collision with root package name */
    public m f1826l;

    /* renamed from: m  reason: collision with root package name */
    public d f1827m;

    public l(p pVar, r rVar) {
        i.e(pVar, "wrappedPlayer");
        i.e(rVar, "soundPoolManager");
        this.f1820f = pVar;
        this.f1821g = rVar;
        P2.d dVar = C.f715a;
        a aVar = pVar.f1835c;
        this.f1825k = aVar;
        rVar.D(aVar);
        a aVar2 = this.f1825k;
        i.e(aVar2, "audioContext");
        m mVar = (m) ((HashMap) rVar.f161h).get(aVar2.a());
        if (mVar != null) {
            this.f1826l = mVar;
            return;
        }
        throw new IllegalStateException(("Could not create SoundPool " + this.f1825k).toString());
    }

    public final void a() {
        Integer num = this.f1824j;
        if (num != null) {
            this.f1826l.f1828a.pause(num.intValue());
        }
    }

    public final void b() {
        boolean z3;
        int i3;
        Integer num = this.f1824j;
        Integer num2 = this.f1823i;
        if (num != null) {
            this.f1826l.f1828a.resume(num.intValue());
        } else if (num2 != null) {
            SoundPool soundPool = this.f1826l.f1828a;
            int intValue = num2.intValue();
            p pVar = this.f1820f;
            float f3 = pVar.f1839g;
            if (pVar.f1842j == f.f1747g) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                i3 = -1;
            } else {
                i3 = 0;
            }
            this.f1824j = Integer.valueOf(soundPool.play(intValue, f3, f3, 0, i3, pVar.f1841i));
        }
    }

    public final void c(boolean z3) {
        int i3;
        Integer num = this.f1824j;
        if (num != null) {
            int intValue = num.intValue();
            SoundPool soundPool = this.f1826l.f1828a;
            if (z3) {
                i3 = -1;
            } else {
                i3 = 0;
            }
            soundPool.setLoop(intValue, i3);
        }
    }

    public final void d(d dVar) {
        Object obj;
        if (dVar != null) {
            synchronized (this.f1826l.f1830c) {
                try {
                    Map map = this.f1826l.f1830c;
                    Object obj2 = map.get(dVar);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        map.put(dVar, obj2);
                    }
                    List list = (List) obj2;
                    if (list.isEmpty()) {
                        obj = null;
                    } else {
                        obj = list.get(0);
                    }
                    l lVar = (l) obj;
                    if (lVar != null) {
                        boolean z3 = lVar.f1820f.f1845m;
                        this.f1820f.h(z3);
                        this.f1823i = lVar.f1823i;
                        p pVar = this.f1820f;
                        pVar.c("Reusing soundId " + this.f1823i + " for " + dVar + " is prepared=" + z3 + ' ' + this);
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        this.f1820f.h(false);
                        p pVar2 = this.f1820f;
                        pVar2.c("Fetching actual URL for " + dVar);
                        C0071w.h(this.f1822h, C.f716b, new k(dVar, this, this, currentTimeMillis, (C0420d) null), 2);
                    }
                    list.add(this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f1827m = dVar;
    }

    public final void e() {
        Integer num = this.f1824j;
        if (num != null) {
            this.f1826l.f1828a.stop(num.intValue());
            this.f1824j = null;
        }
    }

    public final /* bridge */ /* synthetic */ Integer i() {
        return null;
    }

    public final boolean j() {
        return false;
    }

    public final void k(c cVar) {
        i.e(cVar, "source");
        cVar.a(this);
    }

    public final void l(float f3) {
        Integer num = this.f1824j;
        if (num != null) {
            this.f1826l.f1828a.setRate(num.intValue(), f3);
        }
    }

    public final void n(int i3) {
        if (i3 == 0) {
            Integer num = this.f1824j;
            if (num != null) {
                int intValue = num.intValue();
                e();
                if (this.f1820f.f1846n) {
                    this.f1826l.f1828a.resume(intValue);
                    return;
                }
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("LOW_LATENCY mode does not support: seek");
    }

    public final void release() {
        Object obj;
        e();
        Integer num = this.f1823i;
        if (num != null) {
            int intValue = num.intValue();
            d dVar = this.f1827m;
            if (dVar != null) {
                synchronized (this.f1826l.f1830c) {
                    try {
                        List list = (List) this.f1826l.f1830c.get(dVar);
                        if (list != null) {
                            if (list.size() == 1) {
                                obj = list.get(0);
                            } else {
                                obj = null;
                            }
                            if (obj == this) {
                                this.f1826l.f1830c.remove(dVar);
                                this.f1826l.f1828a.unload(intValue);
                                this.f1826l.f1829b.remove(num);
                                this.f1820f.c("unloaded soundId " + intValue);
                            } else {
                                list.remove(this);
                            }
                            this.f1823i = null;
                            d((d) null);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void t(a aVar) {
        if (!this.f1825k.a().equals(aVar.a())) {
            release();
            r rVar = this.f1821g;
            rVar.D(aVar);
            m mVar = (m) ((HashMap) rVar.f161h).get(aVar.a());
            if (mVar != null) {
                this.f1826l = mVar;
            } else {
                throw new IllegalStateException(("Could not create SoundPool " + aVar).toString());
            }
        }
        this.f1825k = aVar;
    }

    public final void u(float f3, float f4) {
        Integer num = this.f1824j;
        if (num != null) {
            this.f1826l.f1828a.setVolume(num.intValue(), f3, f4);
        }
    }

    public final /* bridge */ /* synthetic */ Integer v() {
        return null;
    }

    public final void s() {
    }

    public final void w() {
    }
}
