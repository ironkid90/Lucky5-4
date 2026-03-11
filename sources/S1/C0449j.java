package s1;

import A.C0002c;
import K0.b;
import R.d;
import S1.r;
import W0.p;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.session.a;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import n.k;

/* renamed from: s1.j  reason: case insensitive filesystem */
public final class C0449j {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f4567c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static C0439L f4568d;

    /* renamed from: a  reason: collision with root package name */
    public final Object f4569a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4570b;

    public C0449j(ExecutorService executorService) {
        this.f4570b = new k();
        this.f4569a = executorService;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public static p a(Context context, Intent intent, boolean z3) {
        C0439L l3;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f4567c) {
            try {
                if (f4568d == null) {
                    f4568d = new C0439L(context);
                }
                l3 = f4568d;
            } finally {
                while (true) {
                }
            }
        }
        if (!z3) {
            return l3.b(intent).h(new Object(), new C0002c(15));
        }
        if (C0464y.e().h(context)) {
            synchronized (C0436I.f4523b) {
                try {
                    C0436I.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        C0436I.f4524c.a(C0436I.f4522a);
                    }
                    l3.b(intent).f(new r(9, intent));
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            l3.b(intent);
        }
        return a.r(-1);
    }

    public p b(Intent intent) {
        boolean z3;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z4 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean b3 = b.b();
        Context context = (Context) this.f4569a;
        if (!b3 || context.getApplicationInfo().targetSdkVersion < 26) {
            z3 = false;
        } else {
            z3 = true;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z4 = true;
        }
        if (z3 && !z4) {
            return a(context, intent, z4);
        }
        d dVar = (d) this.f4570b;
        return a.g(dVar, new C0447h(context, intent)).i(dVar, new C0448i(context, intent, z4));
    }

    public C0449j(Context context) {
        this.f4569a = context;
        this.f4570b = new Object();
    }
}
