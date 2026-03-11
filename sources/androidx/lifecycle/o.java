package androidx.lifecycle;

import C0.e;
import android.os.Looper;
import java.util.Map;
import k.C0268a;
import k.C0271d;
import l.C0307c;
import l.C0308d;
import l.C0310f;

public class o {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f2523k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public static o f2524l;

    /* renamed from: m  reason: collision with root package name */
    public static o f2525m;

    /* renamed from: a  reason: collision with root package name */
    public final Object f2526a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final C0310f f2527b = new C0310f();

    /* renamed from: c  reason: collision with root package name */
    public int f2528c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2529d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f2530e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f2531f;

    /* renamed from: g  reason: collision with root package name */
    public int f2532g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2533h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2534i;

    /* renamed from: j  reason: collision with root package name */
    public final e f2535j;

    public o() {
        Object obj = f2523k;
        this.f2531f = obj;
        this.f2535j = new e(10, (Object) this);
        this.f2530e = obj;
        this.f2532g = -1;
    }

    public static void a(String str) {
        C0268a.b0().f3858d.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    public final void b(n nVar) {
        int i3;
        int i4;
        if (this.f2533h) {
            this.f2534i = true;
            return;
        }
        this.f2533h = true;
        do {
            this.f2534i = false;
            if (nVar == null) {
                C0310f fVar = this.f2527b;
                fVar.getClass();
                C0308d dVar = new C0308d(fVar);
                fVar.f4000h.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    n nVar2 = (n) ((Map.Entry) dVar.next()).getValue();
                    if (nVar2.f2520b && nVar2.f2521c < (i3 = this.f2532g)) {
                        nVar2.f2521c = i3;
                        nVar2.f2519a.s(this.f2530e);
                    }
                    if (this.f2534i) {
                        break;
                    }
                }
            } else {
                if (nVar.f2520b && nVar.f2521c < (i4 = this.f2532g)) {
                    nVar.f2521c = i4;
                    nVar.f2519a.s(this.f2530e);
                }
                nVar = null;
            }
        } while (this.f2534i);
        this.f2533h = false;
    }

    public final void c(p pVar) {
        Object obj;
        a("observeForever");
        n nVar = new n(this, pVar);
        C0310f fVar = this.f2527b;
        C0307c a2 = fVar.a(pVar);
        if (a2 != null) {
            obj = a2.f3992g;
        } else {
            C0307c cVar = new C0307c(pVar, nVar);
            fVar.f4001i++;
            C0307c cVar2 = fVar.f3999g;
            if (cVar2 == null) {
                fVar.f3998f = cVar;
                fVar.f3999g = cVar;
            } else {
                cVar2.f3993h = cVar;
                cVar.f3994i = cVar2;
                fVar.f3999g = cVar;
            }
            obj = null;
        }
        if (((n) obj) == null) {
            nVar.a(true);
        }
    }

    public final void d(Object obj) {
        boolean z3;
        synchronized (this.f2526a) {
            if (this.f2531f == f2523k) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f2531f = obj;
        }
        if (z3) {
            C0268a b02 = C0268a.b0();
            e eVar = this.f2535j;
            C0271d dVar = b02.f3858d;
            if (dVar.f3861e == null) {
                synchronized (dVar.f3860d) {
                    try {
                        if (dVar.f3861e == null) {
                            dVar.f3861e = C0271d.b0(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            dVar.f3861e.post(eVar);
        }
    }

    public final void e(p pVar) {
        a("removeObserver");
        n nVar = (n) this.f2527b.b(pVar);
        if (nVar != null) {
            nVar.a(false);
        }
    }
}
