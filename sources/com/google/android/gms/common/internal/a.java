package com.google.android.gms.common.internal;

import B.m;
import C0.f;
import D0.c;
import D0.e;
import E0.d;
import F0.h;
import F0.l;
import G0.A;
import G0.n;
import G0.o;
import G0.p;
import G0.q;
import G0.r;
import G0.s;
import G0.t;
import G0.u;
import G0.v;
import G0.y;
import G0.z;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a implements E0.a {

    /* renamed from: x  reason: collision with root package name */
    public static final c[] f2830x = new c[0];

    /* renamed from: a  reason: collision with root package name */
    public volatile String f2831a;

    /* renamed from: b  reason: collision with root package name */
    public z f2832b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f2833c;

    /* renamed from: d  reason: collision with root package name */
    public final y f2834d;

    /* renamed from: e  reason: collision with root package name */
    public final p f2835e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f2836f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f2837g;

    /* renamed from: h  reason: collision with root package name */
    public n f2838h;

    /* renamed from: i  reason: collision with root package name */
    public F0.n f2839i;

    /* renamed from: j  reason: collision with root package name */
    public IInterface f2840j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f2841k;

    /* renamed from: l  reason: collision with root package name */
    public r f2842l;

    /* renamed from: m  reason: collision with root package name */
    public int f2843m;

    /* renamed from: n  reason: collision with root package name */
    public final h f2844n;

    /* renamed from: o  reason: collision with root package name */
    public final m f2845o;

    /* renamed from: p  reason: collision with root package name */
    public final int f2846p;

    /* renamed from: q  reason: collision with root package name */
    public final String f2847q;

    /* renamed from: r  reason: collision with root package name */
    public volatile String f2848r;

    /* renamed from: s  reason: collision with root package name */
    public D0.a f2849s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2850t;

    /* renamed from: u  reason: collision with root package name */
    public volatile u f2851u;
    public final AtomicInteger v;

    /* renamed from: w  reason: collision with root package name */
    public final Set f2852w;

    public a(Context context, Looper looper, int i3, f fVar, E0.c cVar, d dVar) {
        synchronized (y.f459g) {
            try {
                if (y.f460h == null) {
                    y.f460h = new y(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        y yVar = y.f460h;
        Object obj = D0.d.f199b;
        o.e(cVar);
        o.e(dVar);
        h hVar = new h(1, (Object) cVar);
        m mVar = new m(3, (Object) dVar);
        this.f2831a = null;
        this.f2836f = new Object();
        this.f2837g = new Object();
        this.f2841k = new ArrayList();
        this.f2843m = 1;
        this.f2849s = null;
        this.f2850t = false;
        this.f2851u = null;
        this.v = new AtomicInteger(0);
        o.f(context, "Context must not be null");
        this.f2833c = context;
        o.f(looper, "Looper must not be null");
        o.f(yVar, "Supervisor must not be null");
        this.f2834d = yVar;
        this.f2835e = new p(this, looper);
        this.f2846p = i3;
        this.f2844n = hVar;
        this.f2845o = mVar;
        this.f2847q = (String) fVar.f127g;
        Set<Scope> set = (Set) fVar.f128h;
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f2852w = set;
    }

    public static /* bridge */ /* synthetic */ boolean u(a aVar, int i3, int i4, IInterface iInterface) {
        synchronized (aVar.f2836f) {
            try {
                if (aVar.f2843m != i3) {
                    return false;
                }
                aVar.v(i4, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a() {
        boolean z3;
        synchronized (this.f2836f) {
            int i3 = this.f2843m;
            z3 = true;
            if (i3 != 2) {
                if (i3 != 3) {
                    z3 = false;
                }
            }
        }
        return z3;
    }

    public final c[] b() {
        u uVar = this.f2851u;
        if (uVar == null) {
            return null;
        }
        return uVar.f445b;
    }

    public final boolean c() {
        boolean z3;
        synchronized (this.f2836f) {
            if (this.f2843m == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    public final void d() {
        if (!c() || this.f2832b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void e(G0.d dVar, Set set) {
        Set set2 = set;
        Bundle q3 = q();
        String str = this.f2848r;
        int i3 = e.f201a;
        Scope[] scopeArr = G0.c.f386o;
        Bundle bundle = new Bundle();
        int i4 = this.f2846p;
        c[] cVarArr = G0.c.f387p;
        G0.c cVar = r3;
        G0.c cVar2 = new G0.c(6, i4, i3, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, cVarArr, cVarArr, true, 0, false, str);
        G0.c cVar3 = cVar;
        cVar3.f391d = this.f2833c.getPackageName();
        cVar3.f394g = q3;
        if (set2 != null) {
            cVar3.f393f = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (l()) {
            cVar3.f395h = new Account("<<default account>>", "com.google");
            if (dVar != null) {
                cVar3.f392e = ((A) dVar).f378c;
            }
        }
        cVar3.f396i = f2830x;
        cVar3.f397j = p();
        try {
            synchronized (this.f2837g) {
                n nVar = this.f2838h;
                if (nVar != null) {
                    nVar.a(new q(this, this.v.get()), cVar3);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            int i5 = this.v.get();
            p pVar = this.f2835e;
            pVar.sendMessage(pVar.obtainMessage(6, i5, 3));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException | RuntimeException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            int i6 = this.v.get();
            s sVar = new s(this, 8, (IBinder) null, (Bundle) null);
            p pVar2 = this.f2835e;
            pVar2.sendMessage(pVar2.obtainMessage(1, i6, -1, sVar));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void f(m mVar) {
        ((l) mVar.f100g).f336m.f319m.post(new C0.e(3, (Object) mVar));
    }

    public final String g() {
        return this.f2831a;
    }

    public final Set h() {
        if (l()) {
            return this.f2852w;
        }
        return Collections.emptySet();
    }

    public final void i(F0.n nVar) {
        this.f2839i = nVar;
        v(2, (IInterface) null);
    }

    public final void j() {
        this.v.incrementAndGet();
        synchronized (this.f2841k) {
            try {
                int size = this.f2841k.size();
                for (int i3 = 0; i3 < size; i3++) {
                    G0.l lVar = (G0.l) this.f2841k.get(i3);
                    synchronized (lVar) {
                        lVar.f426a = null;
                    }
                }
                this.f2841k.clear();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        synchronized (this.f2837g) {
            this.f2838h = null;
        }
        v(1, (IInterface) null);
    }

    public final void k(String str) {
        this.f2831a = str;
        j();
    }

    public boolean l() {
        return false;
    }

    public abstract IInterface o(IBinder iBinder);

    public abstract c[] p();

    public abstract Bundle q();

    public abstract String r();

    public abstract String s();

    public abstract boolean t();

    public final void v(int i3, IInterface iInterface) {
        boolean z3;
        z zVar;
        boolean z4 = false;
        if (i3 != 4) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (iInterface != null) {
            z4 = true;
        }
        if (z3 == z4) {
            synchronized (this.f2836f) {
                try {
                    this.f2843m = i3;
                    this.f2840j = iInterface;
                    if (i3 == 1) {
                        r rVar = this.f2842l;
                        if (rVar != null) {
                            y yVar = this.f2834d;
                            String str = (String) this.f2832b.f469b;
                            o.e(str);
                            this.f2832b.getClass();
                            if (this.f2847q == null) {
                                this.f2833c.getClass();
                            }
                            yVar.a(str, rVar, this.f2832b.f468a);
                            this.f2842l = null;
                        }
                    } else if (i3 == 2 || i3 == 3) {
                        r rVar2 = this.f2842l;
                        if (!(rVar2 == null || (zVar = this.f2832b) == null)) {
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) zVar.f469b) + " on com.google.android.gms");
                            y yVar2 = this.f2834d;
                            String str2 = (String) this.f2832b.f469b;
                            o.e(str2);
                            this.f2832b.getClass();
                            if (this.f2847q == null) {
                                this.f2833c.getClass();
                            }
                            yVar2.a(str2, rVar2, this.f2832b.f468a);
                            this.v.incrementAndGet();
                        }
                        r rVar3 = new r(this, this.v.get());
                        this.f2842l = rVar3;
                        String s3 = s();
                        boolean t3 = t();
                        this.f2832b = new z(s3, t3);
                        if (t3) {
                            if (n() < 17895000) {
                                throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f2832b.f469b)));
                            }
                        }
                        y yVar3 = this.f2834d;
                        String str3 = (String) this.f2832b.f469b;
                        o.e(str3);
                        this.f2832b.getClass();
                        String str4 = this.f2847q;
                        if (str4 == null) {
                            str4 = this.f2833c.getClass().getName();
                        }
                        if (!yVar3.b(new v(str3, this.f2832b.f468a), rVar3, str4)) {
                            Log.w("GmsClient", "unable to connect to service: " + ((String) this.f2832b.f469b) + " on com.google.android.gms");
                            int i4 = this.v.get();
                            t tVar = new t(this, 16);
                            p pVar = this.f2835e;
                            pVar.sendMessage(pVar.obtainMessage(7, i4, -1, tVar));
                        }
                    } else if (i3 == 4) {
                        o.e(iInterface);
                        System.currentTimeMillis();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
