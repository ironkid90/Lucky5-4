package F0;

import B.m;
import C0.e;
import C0.f;
import C0.r;
import E0.a;
import E0.c;
import E0.d;
import E0.g;
import G0.i;
import G0.o;
import I0.b;
import android.app.PendingIntent;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import n.C0336c;
import n.C0337d;

public final class l implements c, d {

    /* renamed from: c  reason: collision with root package name */
    public final LinkedList f326c = new LinkedList();

    /* renamed from: d  reason: collision with root package name */
    public final a f327d;

    /* renamed from: e  reason: collision with root package name */
    public final a f328e;

    /* renamed from: f  reason: collision with root package name */
    public final r f329f;

    /* renamed from: g  reason: collision with root package name */
    public final HashSet f330g = new HashSet();

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f331h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public final int f332i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f333j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f334k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public D0.a f335l = null;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ d f336m;

    public l(d dVar, I0.c cVar) {
        this.f336m = dVar;
        Looper looper = dVar.f319m.getLooper();
        cVar.getClass();
        f fVar = new f(1, false);
        Set emptySet = Collections.emptySet();
        if (((C0336c) fVar.f128h) == null) {
            fVar.f128h = new C0336c(0);
        }
        ((C0336c) fVar.f128h).addAll(emptySet);
        Context context = cVar.f697a;
        fVar.f129i = context.getClass().getName();
        fVar.f127g = context.getPackageName();
        f fVar2 = new f((Set) (C0336c) fVar.f128h, (String) fVar.f127g, (String) fVar.f129i);
        b bVar = (b) cVar.f699c.f160g;
        o.e(bVar);
        Context context2 = cVar.f697a;
        i iVar = cVar.f700d;
        bVar.getClass();
        I0.d dVar2 = new I0.d(context2, looper, fVar2, iVar, this, this);
        String str = cVar.f698b;
        if (str != null) {
            dVar2.f2848r = str;
        }
        this.f327d = dVar2;
        this.f328e = cVar.f701e;
        this.f329f = new r(4);
        this.f332i = cVar.f702f;
    }

    public final void a(int i3) {
        Looper myLooper = Looper.myLooper();
        d dVar = this.f336m;
        if (myLooper == dVar.f319m.getLooper()) {
            i(i3);
        } else {
            dVar.f319m.post(new k(this, i3));
        }
    }

    public final void b() {
        Looper myLooper = Looper.myLooper();
        d dVar = this.f336m;
        if (myLooper == dVar.f319m.getLooper()) {
            h();
        } else {
            dVar.f319m.post(new e(2, (Object) this));
        }
    }

    public final void c(D0.a aVar) {
        o(aVar, (RuntimeException) null);
    }

    public final void d(D0.a aVar) {
        HashSet hashSet = this.f330g;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else if (it.next() == null) {
            if (o.g(aVar, D0.a.f188e)) {
                this.f327d.d();
            }
            throw null;
        } else {
            throw new ClassCastException();
        }
    }

    public final void e(Status status) {
        o.a(this.f336m.f319m);
        f(status, (RuntimeException) null, false);
    }

    public final void f(Status status, RuntimeException runtimeException, boolean z3) {
        boolean z4;
        o.a(this.f336m.f319m);
        boolean z5 = true;
        if (status != null) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (runtimeException != null) {
            z5 = false;
        }
        if (z4 != z5) {
            Iterator it = this.f326c.iterator();
            while (it.hasNext()) {
                q qVar = (q) it.next();
                if (!z3 || qVar.f348a == 2) {
                    if (status != null) {
                        qVar.c(status);
                    } else {
                        qVar.d(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void g() {
        LinkedList linkedList = this.f326c;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            q qVar = (q) arrayList.get(i3);
            if (this.f327d.c()) {
                if (k(qVar)) {
                    linkedList.remove(qVar);
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public final void h() {
        d dVar = this.f336m;
        o.a(dVar.f319m);
        this.f335l = null;
        d(D0.a.f188e);
        if (this.f333j) {
            O0.e eVar = dVar.f319m;
            a aVar = this.f328e;
            eVar.removeMessages(11, aVar);
            dVar.f319m.removeMessages(9, aVar);
            this.f333j = false;
        }
        Iterator it = this.f331h.values().iterator();
        if (!it.hasNext()) {
            g();
            j();
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public final void i(int i3) {
        d dVar = this.f336m;
        o.a(dVar.f319m);
        this.f335l = null;
        this.f333j = true;
        String g2 = this.f327d.g();
        r rVar = this.f329f;
        rVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i3 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i3 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (g2 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(g2);
        }
        rVar.K(true, new Status(20, sb.toString(), (PendingIntent) null, (D0.a) null));
        O0.e eVar = dVar.f319m;
        a aVar = this.f328e;
        eVar.sendMessageDelayed(Message.obtain(eVar, 9, aVar), 5000);
        O0.e eVar2 = dVar.f319m;
        eVar2.sendMessageDelayed(Message.obtain(eVar2, 11, aVar), 120000);
        ((SparseIntArray) dVar.f313g.f160g).clear();
        Iterator it = this.f331h.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void j() {
        d dVar = this.f336m;
        O0.e eVar = dVar.f319m;
        a aVar = this.f328e;
        eVar.removeMessages(12, aVar);
        O0.e eVar2 = dVar.f319m;
        eVar2.sendMessageDelayed(eVar2.obtainMessage(12, aVar), dVar.f307a);
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [java.lang.Object, n.k] */
    public final boolean k(q qVar) {
        D0.c cVar;
        if (qVar == null) {
            a aVar = this.f327d;
            qVar.f(this.f329f, aVar.l());
            try {
                qVar.e(this);
            } catch (DeadObjectException unused) {
                a(1);
                aVar.k("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        D0.c[] b3 = qVar.b(this);
        if (b3 != null && b3.length != 0) {
            D0.c[] b4 = this.f327d.b();
            if (b4 == null) {
                b4 = new D0.c[0];
            }
            ? obj = new Object();
            if (r6 == 0) {
                obj.f4089f = C0337d.f4061a;
                obj.f4090g = C0337d.f4062b;
            } else {
                obj.a(r6);
            }
            obj.f4091h = 0;
            for (D0.c cVar2 : b4) {
                obj.put(cVar2.f196a, Long.valueOf(cVar2.a()));
            }
            int length = b3.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                cVar = b3[i3];
                Long l3 = (Long) obj.getOrDefault(cVar.f196a, (Object) null);
                if (l3 == null || l3.longValue() < cVar.a()) {
                    break;
                }
                i3++;
            }
        }
        cVar = null;
        if (cVar == null) {
            a aVar2 = this.f327d;
            qVar.f(this.f329f, aVar2.l());
            try {
                qVar.e(this);
            } catch (DeadObjectException unused2) {
                a(1);
                aVar2.k("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Log.w("GoogleApiManager", this.f327d.getClass().getName() + " could not execute call because it requires feature (" + cVar.f196a + ", " + cVar.a() + ").");
        if (!this.f336m.f320n || !qVar.a(this)) {
            qVar.d(new g(cVar));
            return true;
        }
        m mVar = new m(this.f328e, cVar);
        int indexOf = this.f334k.indexOf(mVar);
        if (indexOf >= 0) {
            m mVar2 = (m) this.f334k.get(indexOf);
            this.f336m.f319m.removeMessages(15, mVar2);
            O0.e eVar = this.f336m.f319m;
            Message obtain = Message.obtain(eVar, 15, mVar2);
            this.f336m.getClass();
            eVar.sendMessageDelayed(obtain, 5000);
        } else {
            this.f334k.add(mVar);
            O0.e eVar2 = this.f336m.f319m;
            Message obtain2 = Message.obtain(eVar2, 15, mVar);
            this.f336m.getClass();
            eVar2.sendMessageDelayed(obtain2, 5000);
            O0.e eVar3 = this.f336m.f319m;
            Message obtain3 = Message.obtain(eVar3, 16, mVar);
            this.f336m.getClass();
            eVar3.sendMessageDelayed(obtain3, 120000);
            D0.a aVar3 = new D0.a(2, (PendingIntent) null);
            if (!l(aVar3)) {
                this.f336m.a(aVar3, this.f332i);
            }
        }
        return false;
    }

    public final boolean l(D0.a aVar) {
        synchronized (d.f305q) {
            this.f336m.getClass();
        }
        return false;
    }

    public final void m() {
        d dVar = this.f336m;
        o.a(dVar.f319m);
        a aVar = this.f327d;
        if (!aVar.c() && !aVar.a()) {
            try {
                r rVar = dVar.f313g;
                Context context = dVar.f311e;
                rVar.getClass();
                o.e(context);
                int n3 = aVar.n();
                SparseIntArray sparseIntArray = (SparseIntArray) rVar.f160g;
                int i3 = sparseIntArray.get(n3, -1);
                if (i3 == -1) {
                    i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= sparseIntArray.size()) {
                            i3 = -1;
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i4);
                        if (keyAt > n3 && sparseIntArray.get(keyAt) == 0) {
                            break;
                        }
                        i4++;
                    }
                    if (i3 == -1) {
                        i3 = ((D0.d) rVar.f161h).b(context, n3);
                    }
                    sparseIntArray.put(n3, i3);
                }
                if (i3 != 0) {
                    D0.a aVar2 = new D0.a(i3, (PendingIntent) null);
                    Log.w("GoogleApiManager", "The service for " + aVar.getClass().getName() + " is not available: " + aVar2.toString());
                    o(aVar2, (RuntimeException) null);
                    return;
                }
                n nVar = new n(dVar, aVar, this.f328e);
                if (!aVar.l()) {
                    try {
                        aVar.i(nVar);
                    } catch (SecurityException e2) {
                        o(new D0.a(10), e2);
                    }
                } else {
                    o.e((Object) null);
                    throw null;
                }
            } catch (IllegalStateException e3) {
                o(new D0.a(10), e3);
            }
        }
    }

    public final void n(q qVar) {
        o.a(this.f336m.f319m);
        boolean c3 = this.f327d.c();
        LinkedList linkedList = this.f326c;
        if (!c3) {
            linkedList.add(qVar);
            D0.a aVar = this.f335l;
            if (aVar == null || aVar.f190b == 0 || aVar.f191c == null) {
                m();
            } else {
                o(aVar, (RuntimeException) null);
            }
        } else if (k(qVar)) {
            j();
        } else {
            linkedList.add(qVar);
        }
    }

    public final void o(D0.a aVar, RuntimeException runtimeException) {
        o.a(this.f336m.f319m);
        o.a(this.f336m.f319m);
        this.f335l = null;
        ((SparseIntArray) this.f336m.f313g.f160g).clear();
        d(aVar);
        if ((this.f327d instanceof I0.d) && aVar.f190b != 24) {
            d dVar = this.f336m;
            dVar.f308b = true;
            O0.e eVar = dVar.f319m;
            eVar.sendMessageDelayed(eVar.obtainMessage(19), 300000);
        }
        if (aVar.f190b == 4) {
            e(d.f304p);
        } else if (this.f326c.isEmpty()) {
            this.f335l = aVar;
        } else if (runtimeException != null) {
            o.a(this.f336m.f319m);
            f((Status) null, runtimeException, false);
        } else if (this.f336m.f320n) {
            f(d.b(this.f328e, aVar), (RuntimeException) null, true);
            if (!this.f326c.isEmpty() && !l(aVar) && !this.f336m.a(aVar, this.f332i)) {
                if (aVar.f190b == 18) {
                    this.f333j = true;
                }
                if (this.f333j) {
                    O0.e eVar2 = this.f336m.f319m;
                    Message obtain = Message.obtain(eVar2, 9, this.f328e);
                    this.f336m.getClass();
                    eVar2.sendMessageDelayed(obtain, 5000);
                    return;
                }
                e(d.b(this.f328e, aVar));
            }
        } else {
            e(d.b(this.f328e, aVar));
        }
    }

    public final void p() {
        o.a(this.f336m.f319m);
        Status status = d.f303o;
        e(status);
        this.f329f.K(false, status);
        for (g gVar : (g[]) this.f331h.keySet().toArray(new g[0])) {
            n(new x(new W0.i()));
        }
        d(new D0.a(4));
        a aVar = this.f327d;
        if (aVar.c()) {
            aVar.f(new m(2, (Object) this));
        }
    }
}
