package io.flutter.plugins.firebase.messaging;

import C0.f;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import i2.C0228i;
import i2.C0229j;
import i2.C0233n;
import i2.C0234o;
import i2.C0235p;
import j1.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

public abstract class a extends Service {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f3429k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public static final HashMap f3430l = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public C0233n f3431f;

    /* renamed from: g  reason: collision with root package name */
    public C0235p f3432g;

    /* renamed from: h  reason: collision with root package name */
    public f f3433h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3434i = false;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f3435j = new ArrayList();

    public static C0235p b(Context context, ComponentName componentName, boolean z3, int i3, boolean z4) {
        C0235p iVar;
        e eVar = new e(11);
        HashMap hashMap = f3430l;
        C0235p pVar = (C0235p) hashMap.get(eVar);
        if (pVar == null) {
            if (Build.VERSION.SDK_INT < 26 || z4) {
                iVar = new C0228i(context, componentName);
            } else if (z3) {
                iVar = new C0234o(context, componentName, i3);
            } else {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            pVar = iVar;
            hashMap.put(eVar, pVar);
        }
        return pVar;
    }

    public final void a(boolean z3) {
        if (this.f3433h == null) {
            this.f3433h = new f(this);
            C0235p pVar = this.f3432g;
            if (pVar != null && z3) {
                pVar.d();
            }
            f fVar = this.f3433h;
            ((ExecutorService) fVar.f128h).execute(new C0.e(12, (Object) fVar));
        }
    }

    public final void c() {
        ArrayList arrayList = this.f3435j;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f3433h = null;
                    ArrayList arrayList2 = this.f3435j;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        a(false);
                    } else if (!this.f3434i) {
                        this.f3432g.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        C0233n nVar = this.f3431f;
        if (nVar != null) {
            return nVar.getBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3431f = new C0233n(this);
            this.f3432g = null;
        }
        this.f3432g = b(this, new ComponentName(this, getClass()), false, 0, true);
    }

    public final void onDestroy() {
        super.onDestroy();
        f fVar = this.f3433h;
        if (fVar != null) {
            ((a) fVar.f129i).c();
        }
        synchronized (this.f3435j) {
            this.f3434i = true;
            this.f3432g.c();
        }
    }

    public final int onStartCommand(Intent intent, int i3, int i4) {
        this.f3432g.e();
        synchronized (this.f3435j) {
            ArrayList arrayList = this.f3435j;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C0229j(this, intent, i4));
            a(true);
        }
        return 3;
    }
}
