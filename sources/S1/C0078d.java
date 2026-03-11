package S1;

import B.m;
import T1.c;
import T1.d;
import T1.e;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import b2.C0129a;
import b2.h;
import c2.C0135c;
import c2.p;
import c2.q;
import c2.s;
import c2.t;
import c2.u;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.r;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import m2.C0332a;
import s1.C0464y;

/* renamed from: S1.d  reason: case insensitive filesystem */
public abstract class C0078d extends Activity implements j {

    /* renamed from: j  reason: collision with root package name */
    public static final int f1440j = View.generateViewId();

    /* renamed from: f  reason: collision with root package name */
    public boolean f1441f = false;

    /* renamed from: g  reason: collision with root package name */
    public g f1442g;

    /* renamed from: h  reason: collision with root package name */
    public final l f1443h;

    /* renamed from: i  reason: collision with root package name */
    public final OnBackInvokedCallback f1444i;

    public C0078d() {
        OnBackInvokedCallback onBackInvokedCallback;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 33) {
            onBackInvokedCallback = null;
        } else if (i3 >= 34) {
            onBackInvokedCallback = new C0077c(this);
        } else {
            onBackInvokedCallback = new C0076b(this);
        }
        this.f1444i = onBackInvokedCallback;
        this.f1443h = new l(this);
    }

    public final l b() {
        return this.f1443h;
    }

    public final String c() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public final int d() {
        if (!getIntent().hasExtra("background_mode")) {
            return 1;
        }
        String stringExtra = getIntent().getStringExtra("background_mode");
        if (stringExtra == null) {
            throw new NullPointerException("Name is null");
        } else if (stringExtra.equals("opaque")) {
            return 1;
        } else {
            if (stringExtra.equals("transparent")) {
                return 2;
            }
            throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.".concat(stringExtra));
        }
    }

    public final String e() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final String f() {
        String str;
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle h3 = h();
            if (h3 != null) {
                str = h3.getString("io.flutter.Entrypoint");
            } else {
                str = null;
            }
            if (str != null) {
                return str;
            }
            return "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public final String g() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle h3 = h();
            if (h3 != null) {
                return h3.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Bundle h() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final void i(boolean z3) {
        if (!z3 || this.f1441f) {
            if (!z3 && this.f1441f && Build.VERSION.SDK_INT >= 33) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f1444i);
                this.f1441f = false;
            }
        } else if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f1444i);
            this.f1441f = true;
        }
    }

    public final boolean j() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        if (e() != null || this.f1442g.f1455g) {
            return booleanExtra;
        }
        return getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean k() {
        if (getIntent().hasExtra("enable_state_restoration")) {
            return getIntent().getBooleanExtra("enable_state_restoration", false);
        }
        if (e() != null) {
            return false;
        }
        return true;
    }

    public final boolean l(String str) {
        g gVar = this.f1442g;
        if (gVar == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        } else if (gVar.f1458j) {
            return true;
        } else {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
            return false;
        }
    }

    public final void onActivityResult(int i3, int i4, Intent intent) {
        if (l("onActivityResult")) {
            g gVar = this.f1442g;
            gVar.c();
            if (gVar.f1450b != null) {
                Objects.toString(intent);
                e eVar = gVar.f1450b.f1683d;
                if (eVar.f()) {
                    C0332a.b("FlutterEngineConnectionRegistry#onActivityResult");
                    try {
                        d dVar = eVar.f1714f;
                        dVar.getClass();
                        Iterator it = new HashSet((HashSet) dVar.f1705c).iterator();
                        while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (!it.hasNext()) {
                                    Trace.endSection();
                                    return;
                                } else if (((s) it.next()).onActivityResult(i3, i4, intent) || z3) {
                                    z3 = true;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                    return;
                }
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
        } else {
            return;
        }
        throw th;
    }

    public final void onBackPressed() {
        if (l("onBackPressed")) {
            g gVar = this.f1442g;
            gVar.c();
            c cVar = gVar.f1450b;
            if (cVar != null) {
                ((q) cVar.f1688i.f100g).a("popRoute", (Object) null, (p) null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [L1.l, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v9, types: [android.view.View, io.flutter.embedding.engine.renderer.j] */
    /* JADX WARNING: type inference failed for: r1v27, types: [S1.l, android.view.TextureView] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            android.os.Bundle r0 = r14.h()     // Catch:{ NameNotFoundException -> 0x0013 }
            if (r0 == 0) goto L_0x001a
            java.lang.String r1 = "io.flutter.embedding.android.NormalTheme"
            r2 = -1
            int r0 = r0.getInt(r1, r2)     // Catch:{ NameNotFoundException -> 0x0013 }
            if (r0 == r2) goto L_0x001a
            r14.setTheme(r0)     // Catch:{ NameNotFoundException -> 0x0013 }
            goto L_0x001a
        L_0x0013:
            java.lang.String r0 = "FlutterActivity"
            java.lang.String r1 = "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme."
            android.util.Log.e(r0, r1)
        L_0x001a:
            super.onCreate(r15)
            if (r15 == 0) goto L_0x0028
            java.lang.String r0 = "enableOnBackInvokedCallbackState"
            boolean r0 = r15.getBoolean(r0)
            r14.i(r0)
        L_0x0028:
            S1.g r0 = new S1.g
            r0.<init>(r14)
            r14.f1442g = r0
            r0.c()
            T1.c r1 = r0.f1450b
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0119
            S1.d r1 = r0.f1449a
            java.lang.String r1 = r1.e()
            if (r1 == 0) goto L_0x0078
            T1.i r5 = T1.i.f1726c
            if (r5 != 0) goto L_0x004d
            T1.i r5 = new T1.i
            r6 = 1
            r5.<init>(r6)
            T1.i.f1726c = r5
        L_0x004d:
            T1.i r5 = T1.i.f1726c
            java.util.HashMap r5 = r5.f1727a
            java.lang.Object r5 = r5.get(r1)
            T1.c r5 = (T1.c) r5
            r0.f1450b = r5
            r0.f1455g = r3
            if (r5 == 0) goto L_0x005f
            goto L_0x0119
        L_0x005f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "The requested cached FlutterEngine did not exist in the FlutterEngineCache: '"
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = "'"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x0078:
            S1.d r1 = r0.f1449a
            r1.getClass()
            r0.f1450b = r4
            S1.d r1 = r0.f1449a
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r5 = "cached_engine_group_id"
            java.lang.String r1 = r1.getStringExtra(r5)
            if (r1 == 0) goto L_0x00e2
            T1.i r5 = T1.i.f1725b
            if (r5 != 0) goto L_0x00a7
            java.lang.Class<T1.i> r5 = T1.i.class
            monitor-enter(r5)
            T1.i r6 = T1.i.f1725b     // Catch:{ all -> 0x00a1 }
            if (r6 != 0) goto L_0x00a3
            T1.i r6 = new T1.i     // Catch:{ all -> 0x00a1 }
            r7 = 0
            r6.<init>(r7)     // Catch:{ all -> 0x00a1 }
            T1.i.f1725b = r6     // Catch:{ all -> 0x00a1 }
            goto L_0x00a3
        L_0x00a1:
            r15 = move-exception
            goto L_0x00a5
        L_0x00a3:
            monitor-exit(r5)     // Catch:{ all -> 0x00a1 }
            goto L_0x00a7
        L_0x00a5:
            monitor-exit(r5)     // Catch:{ all -> 0x00a1 }
            throw r15
        L_0x00a7:
            T1.i r5 = T1.i.f1725b
            java.util.HashMap r5 = r5.f1727a
            java.lang.Object r5 = r5.get(r1)
            T1.h r5 = (T1.h) r5
            if (r5 == 0) goto L_0x00c9
            T1.g r1 = new T1.g
            S1.d r6 = r0.f1449a
            r6.getClass()
            r1.<init>(r6)
            r0.a(r1)
            T1.c r1 = r5.a(r1)
            r0.f1450b = r1
            r0.f1455g = r2
            goto L_0x0119
        L_0x00c9:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '"
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = "'"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x00e2:
            T1.h r1 = new T1.h
            S1.d r5 = r0.f1449a
            r5.getClass()
            S1.d r6 = r0.f1449a
            android.content.Intent r6 = r6.getIntent()
            u1.c r6 = u1.C0496c.a(r6)
            java.lang.String[] r6 = r6.b()
            r1.<init>(r5, r6)
            T1.g r5 = new T1.g
            S1.d r6 = r0.f1449a
            r6.getClass()
            r5.<init>(r6)
            r5.f1722e = r2
            S1.d r6 = r0.f1449a
            boolean r6 = r6.k()
            r5.f1723f = r6
            r0.a(r5)
            T1.c r1 = r1.a(r5)
            r0.f1450b = r1
            r0.f1455g = r2
        L_0x0119:
            S1.d r1 = r0.f1449a
            r1.getClass()
            T1.c r1 = r0.f1450b
            T1.e r1 = r1.f1683d
            S1.d r5 = r0.f1449a
            androidx.lifecycle.l r5 = r5.f1443h
            r1.getClass()
            java.lang.String r6 = "FlutterEngineConnectionRegistry#attachToActivity"
            m2.C0332a.b(r6)
            S1.g r6 = r1.f1713e     // Catch:{ all -> 0x0136 }
            if (r6 == 0) goto L_0x0139
            r6.b()     // Catch:{ all -> 0x0136 }
            goto L_0x0139
        L_0x0136:
            r15 = move-exception
            goto L_0x04df
        L_0x0139:
            r1.e()     // Catch:{ all -> 0x0136 }
            r1.f1713e = r0     // Catch:{ all -> 0x0136 }
            S1.d r6 = r0.f1449a     // Catch:{ all -> 0x0136 }
            r6.getClass()     // Catch:{ all -> 0x0136 }
            r1.b(r6, r5)     // Catch:{ all -> 0x0136 }
            android.os.Trace.endSection()
            S1.d r1 = r0.f1449a
            r1.getClass()
            S1.d r5 = r0.f1449a
            T1.c r6 = r0.f1450b
            r5.getClass()
            io.flutter.plugin.platform.f r7 = new io.flutter.plugin.platform.f
            C0.r r6 = r6.f1691l
            r7.<init>(r5, r6, r5)
            r0.f1452d = r7
            S1.d r5 = r0.f1449a
            T1.c r6 = r0.f1450b
            r5.getClass()
            L1.l r5 = new L1.l
            F0.h r6 = r6.f1693n
            int r7 = f1440j
            r5.<init>()
            r5.f965b = r1
            r5.f964a = r7
            r5.f966c = r6
            r6.f322g = r5
            r0.f1453e = r5
            S1.d r1 = r0.f1449a
            T1.c r5 = r0.f1450b
            com.ai9poker.app.MainActivity r1 = (com.ai9poker.app.MainActivity) r1
            r1.getClass()
            java.lang.String r6 = "flutterEngine"
            A2.i.e(r5, r6)
            S1.g r1 = r1.f1442g
            boolean r1 = r1.f1455g
            if (r1 == 0) goto L_0x018d
            goto L_0x0190
        L_0x018d:
            M0.a.L(r5)
        L_0x0190:
            r0.f1458j = r3
            S1.g r0 = r14.f1442g
            r0.c()
            if (r15 == 0) goto L_0x01a5
            java.lang.String r1 = "plugins"
            r15.getBundle(r1)
            java.lang.String r1 = "framework"
            byte[] r15 = r15.getByteArray(r1)
            goto L_0x01a6
        L_0x01a5:
            r15 = r4
        L_0x01a6:
            S1.d r1 = r0.f1449a
            boolean r1 = r1.k()
            if (r1 == 0) goto L_0x01dc
            T1.c r1 = r0.f1450b
            b2.g r1 = r1.f1690k
            r1.f2739e = r3
            b2.f r5 = r1.f2738d
            if (r5 == 0) goto L_0x01c4
            java.util.HashMap r6 = b2.g.a(r15)
            r5.b(r6)
            r1.f2738d = r4
            r1.f2736b = r15
            goto L_0x01dc
        L_0x01c4:
            boolean r5 = r1.f2740f
            if (r5 == 0) goto L_0x01da
            java.util.HashMap r5 = b2.g.a(r15)
            b2.f r6 = new b2.f
            r7 = 0
            r6.<init>(r7, r1, r15)
            c2.q r15 = r1.f2737c
            java.lang.String r1 = "push"
            r15.a(r1, r5, r6)
            goto L_0x01dc
        L_0x01da:
            r1.f2736b = r15
        L_0x01dc:
            S1.d r15 = r0.f1449a
            r15.getClass()
            T1.c r15 = r0.f1450b
            T1.e r15 = r15.f1683d
            boolean r0 = r15.f()
            if (r0 == 0) goto L_0x021b
            java.lang.String r0 = "FlutterEngineConnectionRegistry#onRestoreInstanceState"
            m2.C0332a.b(r0)
            T1.d r15 = r15.f1714f     // Catch:{ all -> 0x0211 }
            java.lang.Object r15 = r15.f1708f     // Catch:{ all -> 0x0211 }
            java.util.HashSet r15 = (java.util.HashSet) r15     // Catch:{ all -> 0x0211 }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ all -> 0x0211 }
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0211 }
            if (r0 != 0) goto L_0x0204
            android.os.Trace.endSection()
            goto L_0x0222
        L_0x0204:
            java.lang.Object r15 = r15.next()     // Catch:{ all -> 0x0211 }
            if (r15 != 0) goto L_0x020b
            throw r4     // Catch:{ all -> 0x0211 }
        L_0x020b:
            java.lang.ClassCastException r15 = new java.lang.ClassCastException     // Catch:{ all -> 0x0211 }
            r15.<init>()     // Catch:{ all -> 0x0211 }
            throw r15     // Catch:{ all -> 0x0211 }
        L_0x0211:
            r15 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x0216 }
            goto L_0x021a
        L_0x0216:
            r0 = move-exception
            r15.addSuppressed(r0)
        L_0x021a:
            throw r15
        L_0x021b:
            java.lang.String r15 = "FlutterEngineCxnRegstry"
            java.lang.String r0 = "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached."
            android.util.Log.e(r15, r0)
        L_0x0222:
            androidx.lifecycle.l r15 = r14.f1443h
            androidx.lifecycle.d r0 = androidx.lifecycle.d.ON_CREATE
            r15.d(r0)
            int r15 = r14.d()
            r0 = 2
            if (r15 != r0) goto L_0x023c
            android.view.Window r15 = r14.getWindow()
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r1.<init>(r2)
            r15.setBackgroundDrawable(r1)
        L_0x023c:
            S1.g r15 = r14.f1442g
            int r1 = r14.d()
            if (r1 != r3) goto L_0x0245
            r0 = r3
        L_0x0245:
            if (r0 != r3) goto L_0x0249
            r0 = r3
            goto L_0x024a
        L_0x0249:
            r0 = r2
        L_0x024a:
            r15.c()
            S1.d r1 = r15.f1449a
            int r1 = r1.d()
            if (r1 != r3) goto L_0x027c
            S1.j r1 = new S1.j
            S1.d r5 = r15.f1449a
            r5.getClass()
            S1.d r6 = r15.f1449a
            int r6 = r6.d()
            if (r6 != r3) goto L_0x0266
            r6 = r2
            goto L_0x0267
        L_0x0266:
            r6 = r3
        L_0x0267:
            r1.<init>(r5, r6)
            S1.d r5 = r15.f1449a
            r5.getClass()
            S1.o r5 = new S1.o
            S1.d r6 = r15.f1449a
            r6.getClass()
            r5.<init>((S1.C0078d) r6, (S1.j) r1)
            r15.f1451c = r5
            goto L_0x02b3
        L_0x027c:
            S1.l r1 = new S1.l
            S1.d r5 = r15.f1449a
            r5.getClass()
            r6 = 0
            r1.<init>(r5, r6)
            r5 = 0
            r1.f1473f = r5
            r1.f1474g = r5
            S1.k r5 = new S1.k
            r5.<init>(r1)
            r1.setSurfaceTextureListener(r5)
            S1.d r5 = r15.f1449a
            int r5 = r5.d()
            if (r5 != r3) goto L_0x029e
            r5 = r3
            goto L_0x029f
        L_0x029e:
            r5 = r2
        L_0x029f:
            r1.setOpaque(r5)
            S1.d r5 = r15.f1449a
            r5.getClass()
            S1.o r5 = new S1.o
            S1.d r6 = r15.f1449a
            r6.getClass()
            r5.<init>((S1.C0078d) r6, (S1.l) r1)
            r15.f1451c = r5
        L_0x02b3:
            S1.o r1 = r15.f1451c
            S1.e r5 = r15.f1460l
            java.util.HashSet r1 = r1.f1490k
            r1.add(r5)
            S1.d r1 = r15.f1449a
            r1.getClass()
            S1.o r1 = r15.f1451c
            T1.c r11 = r15.f1450b
            r1.getClass()
            java.util.Objects.toString(r11)
            boolean r5 = r1.c()
            if (r5 == 0) goto L_0x02da
            T1.c r5 = r1.f1492m
            if (r11 != r5) goto L_0x02d7
            goto L_0x045c
        L_0x02d7:
            r1.a()
        L_0x02da:
            r1.f1492m = r11
            io.flutter.embedding.engine.renderer.h r5 = r11.f1681b
            boolean r6 = r5.f3311c
            r1.f1491l = r6
            android.view.View r6 = r1.f1488i
            r6.b(r5)
            S1.e r12 = r1.f1482A
            r5.a(r12)
            c2.n r5 = new c2.n
            T1.c r6 = r1.f1492m
            F0.h r6 = r6.f1687h
            r5.<init>((S1.o) r1, (F0.h) r6)
            r1.f1494o = r5
            io.flutter.plugin.editing.j r13 = new io.flutter.plugin.editing.j
            T1.c r5 = r1.f1492m
            C0.r r7 = r5.f1697r
            io.flutter.plugin.platform.l r9 = r5.f1698s
            io.flutter.plugin.platform.k r10 = r5.f1699t
            F0.h r8 = r5.f1692m
            r5 = r13
            r6 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            r1.f1495p = r13
            android.content.Context r5 = r1.getContext()     // Catch:{ Exception -> 0x0324 }
            java.lang.String r6 = "textservices"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch:{ Exception -> 0x0324 }
            android.view.textservice.TextServicesManager r5 = (android.view.textservice.TextServicesManager) r5     // Catch:{ Exception -> 0x0324 }
            r1.v = r5     // Catch:{ Exception -> 0x0324 }
            io.flutter.plugin.editing.h r6 = new io.flutter.plugin.editing.h     // Catch:{ Exception -> 0x0324 }
            T1.c r7 = r1.f1492m     // Catch:{ Exception -> 0x0324 }
            F0.h r7 = r7.f1695p     // Catch:{ Exception -> 0x0324 }
            r6.<init>(r5, r7)     // Catch:{ Exception -> 0x0324 }
            r1.f1496q = r6     // Catch:{ Exception -> 0x0324 }
            goto L_0x032b
        L_0x0324:
            java.lang.String r5 = "FlutterView"
            java.lang.String r6 = "TextServicesManager not supported by device, spell check disabled."
            android.util.Log.e(r5, r6)
        L_0x032b:
            c2.n r5 = new c2.n
            io.flutter.plugin.editing.j r6 = r1.f1495p
            android.view.inputmethod.InputMethodManager r6 = r6.f3357b
            T1.c r7 = r1.f1492m
            F0.h r7 = r7.f1692m
            r5.<init>((S1.o) r1, (android.view.inputmethod.InputMethodManager) r6, (F0.h) r7)
            T1.c r5 = r1.f1492m
            d2.b r5 = r5.f1684e
            r1.f1497r = r5
            C0.f r5 = new C0.f
            r5.<init>((S1.o) r1)
            r1.f1498s = r5
            S1.a r5 = new S1.a
            T1.c r6 = r1.f1492m
            io.flutter.embedding.engine.renderer.h r6 = r6.f1681b
            r5.<init>(r6, r2)
            r1.f1499t = r5
            io.flutter.view.g r13 = new io.flutter.view.g
            android.content.Context r5 = r1.getContext()
            java.lang.String r6 = "accessibility"
            java.lang.Object r5 = r5.getSystemService(r6)
            r8 = r5
            android.view.accessibility.AccessibilityManager r8 = (android.view.accessibility.AccessibilityManager) r8
            android.content.Context r5 = r1.getContext()
            android.content.ContentResolver r9 = r5.getContentResolver()
            c2.n r10 = r11.f1700u
            C0.f r7 = r11.f1685f
            r5 = r13
            r6 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            r1.f1500u = r13
            F0.h r5 = r1.f1503y
            r13.f3544r = r5
            android.view.accessibility.AccessibilityManager r5 = r13.f3529c
            boolean r5 = r5.isEnabled()
            io.flutter.view.g r6 = r1.f1500u
            android.view.accessibility.AccessibilityManager r6 = r6.f3529c
            boolean r6 = r6.isTouchExplorationEnabled()
            T1.c r7 = r1.f1492m
            io.flutter.embedding.engine.renderer.h r7 = r7.f1681b
            io.flutter.embedding.engine.FlutterJNI r7 = r7.f3309a
            boolean r7 = r7.getIsSoftwareRenderingEnabled()
            if (r7 != 0) goto L_0x039b
            if (r5 != 0) goto L_0x0396
            if (r6 != 0) goto L_0x0396
            r5 = r3
            goto L_0x0397
        L_0x0396:
            r5 = r2
        L_0x0397:
            r1.setWillNotDraw(r5)
            goto L_0x039e
        L_0x039b:
            r1.setWillNotDraw(r2)
        L_0x039e:
            T1.c r5 = r1.f1492m
            io.flutter.plugin.platform.l r6 = r5.f1698s
            io.flutter.view.g r7 = r1.f1500u
            io.flutter.plugin.platform.a r6 = r6.f3403m
            r6.f3372a = r7
            S1.a r6 = new S1.a
            io.flutter.embedding.engine.renderer.h r5 = r5.f1681b
            r6.<init>(r5, r3)
            T1.c r5 = r1.f1492m
            io.flutter.plugin.platform.k r6 = r5.f1699t
            io.flutter.view.g r7 = r1.f1500u
            io.flutter.plugin.platform.a r6 = r6.f3388k
            r6.f3372a = r7
            S1.a r6 = new S1.a
            io.flutter.embedding.engine.renderer.h r5 = r5.f1681b
            r6.<init>(r5, r3)
            io.flutter.plugin.editing.j r5 = r1.f1495p
            android.view.inputmethod.InputMethodManager r5 = r5.f3357b
            r5.restartInput(r1)
            r1.d()
            android.content.Context r5 = r1.getContext()
            android.content.ContentResolver r5 = r5.getContentResolver()
            java.lang.String r6 = "show_password"
            android.net.Uri r6 = android.provider.Settings.System.getUriFor(r6)
            G.a r7 = r1.f1504z
            r5.registerContentObserver(r6, r2, r7)
            r1.e()
            io.flutter.plugin.platform.l r5 = r11.f1698s
            r5.f3398h = r1
            r6 = r2
        L_0x03e5:
            android.util.SparseArray r7 = r5.f3409s
            int r8 = r7.size()
            if (r6 >= r8) goto L_0x03fb
            java.lang.Object r7 = r7.valueAt(r6)
            io.flutter.plugin.platform.h r7 = (io.flutter.plugin.platform.h) r7
            S1.o r8 = r5.f3398h
            r8.addView(r7)
            int r6 = r6 + 1
            goto L_0x03e5
        L_0x03fb:
            r6 = r2
        L_0x03fc:
            android.util.SparseArray r7 = r5.f3407q
            int r8 = r7.size()
            if (r6 >= r8) goto L_0x0418
            java.lang.Object r7 = r7.valueAt(r6)
            if (r7 != 0) goto L_0x0412
            S1.o r7 = r5.f3398h
            r7.addView(r4)
            int r6 = r6 + 1
            goto L_0x03fc
        L_0x0412:
            java.lang.ClassCastException r15 = new java.lang.ClassCastException
            r15.<init>()
            throw r15
        L_0x0418:
            android.util.SparseArray r5 = r5.f3406p
            int r6 = r5.size()
            if (r6 > 0) goto L_0x04d2
            io.flutter.plugin.platform.k r5 = r11.f1699t
            r5.f3385h = r1
            r6 = r2
        L_0x0425:
            android.util.SparseArray r7 = r5.f3390m
            int r8 = r7.size()
            if (r6 >= r8) goto L_0x0441
            java.lang.Object r7 = r7.valueAt(r6)
            if (r7 != 0) goto L_0x043b
            S1.o r7 = r5.f3385h
            r7.addView(r4)
            int r6 = r6 + 1
            goto L_0x0425
        L_0x043b:
            java.lang.ClassCastException r15 = new java.lang.ClassCastException
            r15.<init>()
            throw r15
        L_0x0441:
            android.util.SparseArray r4 = r5.f3389l
            int r5 = r4.size()
            if (r5 > 0) goto L_0x04c5
            java.util.HashSet r2 = r1.f1493n
            java.util.Iterator r2 = r2.iterator()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x04b8
            boolean r1 = r1.f1491l
            if (r1 == 0) goto L_0x045c
            r12.b()
        L_0x045c:
            S1.o r1 = r15.f1451c
            int r2 = f1440j
            r1.setId(r2)
            if (r0 == 0) goto L_0x0495
            S1.o r0 = r15.f1451c
            S1.d r1 = r15.f1449a
            int r1 = r1.d()
            if (r1 != r3) goto L_0x048d
            S1.f r1 = r15.f1454f
            if (r1 == 0) goto L_0x047c
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            S1.f r2 = r15.f1454f
            r1.removeOnPreDrawListener(r2)
        L_0x047c:
            S1.f r1 = new S1.f
            r1.<init>(r15, r0)
            r15.f1454f = r1
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            S1.f r1 = r15.f1454f
            r0.addOnPreDrawListener(r1)
            goto L_0x0495
        L_0x048d:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`."
            r15.<init>(r0)
            throw r15
        L_0x0495:
            S1.o r15 = r15.f1451c
            r14.setContentView(r15)
            android.view.Window r15 = r14.getWindow()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r15.addFlags(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 >= r1) goto L_0x04ae
            r0 = 1073741824(0x40000000, float:2.0)
            r15.setStatusBarColor(r0)
        L_0x04ae:
            android.view.View r15 = r15.getDecorView()
            r0 = 1280(0x500, float:1.794E-42)
            r15.setSystemUiVisibility(r0)
            return
        L_0x04b8:
            java.lang.Object r15 = r2.next()
            r15.getClass()
            java.lang.ClassCastException r15 = new java.lang.ClassCastException
            r15.<init>()
            throw r15
        L_0x04c5:
            java.lang.Object r15 = r4.valueAt(r2)
            r15.getClass()
            java.lang.ClassCastException r15 = new java.lang.ClassCastException
            r15.<init>()
            throw r15
        L_0x04d2:
            java.lang.Object r15 = r5.valueAt(r2)
            r15.getClass()
            java.lang.ClassCastException r15 = new java.lang.ClassCastException
            r15.<init>()
            throw r15
        L_0x04df:
            android.os.Trace.endSection()     // Catch:{ all -> 0x04e3 }
            goto L_0x04e7
        L_0x04e3:
            r0 = move-exception
            r15.addSuppressed(r0)
        L_0x04e7:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.C0078d.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        super.onDestroy();
        if (l("onDestroy")) {
            this.f1442g.e();
            this.f1442g.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f1444i);
            this.f1441f = false;
        }
        g gVar = this.f1442g;
        if (gVar != null) {
            gVar.f1449a = null;
            gVar.f1450b = null;
            gVar.f1451c = null;
            gVar.f1452d = null;
            gVar.f1453e = null;
            this.f1442g = null;
        }
        this.f1443h.d(androidx.lifecycle.d.ON_DESTROY);
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (l("onNewIntent")) {
            g gVar = this.f1442g;
            gVar.c();
            c cVar = gVar.f1450b;
            if (cVar != null) {
                e eVar = cVar.f1683d;
                if (eVar.f()) {
                    C0332a.b("FlutterEngineConnectionRegistry#onNewIntent");
                    try {
                        Iterator it = ((HashSet) eVar.f1714f.f1706d).iterator();
                        while (it.hasNext()) {
                            ((t) it.next()).onNewIntent(intent);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
                }
                String d3 = gVar.d(intent);
                if (d3 != null && !d3.isEmpty()) {
                    m mVar = gVar.f1450b.f1688i;
                    mVar.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("location", d3);
                    ((q) mVar.f100g).a("pushRouteInformation", hashMap, (p) null);
                    return;
                }
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        return;
        throw th;
    }

    public final void onPause() {
        super.onPause();
        if (l("onPause")) {
            g gVar = this.f1442g;
            gVar.c();
            gVar.f1449a.getClass();
            c cVar = gVar.f1450b;
            if (cVar != null) {
                C0129a aVar = cVar.f1686g;
                aVar.a(3, aVar.f2704c);
            }
        }
        this.f1443h.d(androidx.lifecycle.d.ON_PAUSE);
    }

    public final void onPostResume() {
        super.onPostResume();
        if (l("onPostResume")) {
            g gVar = this.f1442g;
            gVar.c();
            if (gVar.f1450b != null) {
                f fVar = gVar.f1452d;
                if (fVar != null) {
                    fVar.c();
                }
                Iterator it = gVar.f1450b.f1698s.f3404n.values().iterator();
                if (it.hasNext()) {
                    ((r) it.next()).getClass();
                    throw null;
                }
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        if (l("onRequestPermissionsResult")) {
            g gVar = this.f1442g;
            gVar.c();
            if (gVar.f1450b != null) {
                Arrays.toString(strArr);
                Arrays.toString(iArr);
                e eVar = gVar.f1450b.f1683d;
                if (eVar.f()) {
                    C0332a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
                    try {
                        Iterator it = ((HashSet) eVar.f1714f.f1704b).iterator();
                        while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (!it.hasNext()) {
                                    Trace.endSection();
                                    return;
                                } else if (((u) it.next()).onRequestPermissionsResult(i3, strArr, iArr) || z3) {
                                    z3 = true;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                    return;
                }
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
        } else {
            return;
        }
        throw th;
    }

    public final void onResume() {
        super.onResume();
        this.f1443h.d(androidx.lifecycle.d.ON_RESUME);
        if (l("onResume")) {
            g gVar = this.f1442g;
            gVar.c();
            gVar.f1450b.f1681b.d();
            gVar.f1449a.getClass();
            c cVar = gVar.f1450b;
            if (cVar != null) {
                C0129a aVar = cVar.f1686g;
                aVar.a(2, aVar.f2704c);
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (l("onSaveInstanceState")) {
            g gVar = this.f1442g;
            gVar.c();
            if (gVar.f1449a.k()) {
                bundle.putByteArray("framework", gVar.f1450b.f1690k.f2736b);
            }
            gVar.f1449a.getClass();
            Bundle bundle2 = new Bundle();
            e eVar = gVar.f1450b.f1683d;
            if (eVar.f()) {
                C0332a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) eVar.f1714f.f1708f).iterator();
                    if (!it.hasNext()) {
                        Trace.endSection();
                    } else if (it.next() == null) {
                        throw null;
                    } else {
                        throw new ClassCastException();
                    }
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            }
            bundle.putBundle("plugins", bundle2);
            if (gVar.f1449a.e() != null && !gVar.f1449a.j()) {
                bundle.putBoolean("enableOnBackInvokedCallbackState", gVar.f1449a.f1441f);
                return;
            }
            return;
        }
        return;
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r6 = this;
            super.onStart()
            androidx.lifecycle.l r0 = r6.f1443h
            androidx.lifecycle.d r1 = androidx.lifecycle.d.ON_START
            r0.d(r1)
            java.lang.String r0 = "onStart"
            boolean r0 = r6.l(r0)
            if (r0 == 0) goto L_0x00c2
            S1.g r0 = r6.f1442g
            r0.c()
            S1.d r1 = r0.f1449a
            java.lang.String r1 = r1.e()
            if (r1 == 0) goto L_0x0021
            goto L_0x00b5
        L_0x0021:
            T1.c r1 = r0.f1450b
            U1.b r1 = r1.f1682c
            boolean r1 = r1.f1764k
            if (r1 == 0) goto L_0x002b
            goto L_0x00b5
        L_0x002b:
            S1.d r1 = r0.f1449a
            java.lang.String r1 = r1.g()
            if (r1 != 0) goto L_0x0044
            S1.d r1 = r0.f1449a
            r1.getClass()
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r1 = r0.d(r1)
            if (r1 != 0) goto L_0x0044
            java.lang.String r1 = "/"
        L_0x0044:
            S1.d r2 = r0.f1449a
            r2.getClass()
            r3 = 0
            android.os.Bundle r2 = r2.h()     // Catch:{ NameNotFoundException -> 0x0057 }
            if (r2 == 0) goto L_0x0057
            java.lang.String r4 = "io.flutter.EntrypointUri"
            java.lang.String r2 = r2.getString(r4)     // Catch:{ NameNotFoundException -> 0x0057 }
            goto L_0x0058
        L_0x0057:
            r2 = r3
        L_0x0058:
            S1.d r4 = r0.f1449a
            r4.f()
            T1.c r4 = r0.f1450b
            B.m r4 = r4.f1688i
            java.lang.Object r4 = r4.f100g
            c2.q r4 = (c2.q) r4
            java.lang.String r5 = "setInitialRoute"
            r4.a(r5, r1, r3)
            S1.d r1 = r0.f1449a
            java.lang.String r1 = r1.c()
            if (r1 == 0) goto L_0x0078
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0086
        L_0x0078:
            C0.f r1 = C0.f.O()
            java.lang.Object r1 = r1.f128h
            W1.f r1 = (W1.f) r1
            W1.b r1 = r1.f1915d
            java.lang.Object r1 = r1.f1900c
            java.lang.String r1 = (java.lang.String) r1
        L_0x0086:
            if (r2 != 0) goto L_0x0094
            U1.a r2 = new U1.a
            S1.d r3 = r0.f1449a
            java.lang.String r3 = r3.f()
            r2.<init>(r1, r3)
            goto L_0x00a0
        L_0x0094:
            U1.a r3 = new U1.a
            S1.d r4 = r0.f1449a
            java.lang.String r4 = r4.f()
            r3.<init>(r1, r2, r4)
            r2 = r3
        L_0x00a0:
            T1.c r1 = r0.f1450b
            U1.b r1 = r1.f1682c
            S1.d r3 = r0.f1449a
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r4 = "dart_entrypoint_args"
            java.io.Serializable r3 = r3.getSerializableExtra(r4)
            java.util.List r3 = (java.util.List) r3
            r1.c(r2, r3)
        L_0x00b5:
            java.lang.Integer r1 = r0.f1459k
            if (r1 == 0) goto L_0x00c2
            S1.o r0 = r0.f1451c
            int r1 = r1.intValue()
            r0.setVisibility(r1)
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.C0078d.onStart():void");
    }

    public final void onStop() {
        super.onStop();
        if (l("onStop")) {
            g gVar = this.f1442g;
            gVar.c();
            gVar.f1449a.getClass();
            c cVar = gVar.f1450b;
            if (cVar != null) {
                C0129a aVar = cVar.f1686g;
                aVar.a(5, aVar.f2704c);
            }
            gVar.f1459k = Integer.valueOf(gVar.f1451c.getVisibility());
            gVar.f1451c.setVisibility(8);
            c cVar2 = gVar.f1450b;
            if (cVar2 != null) {
                cVar2.f1681b.b(40);
            }
        }
        this.f1443h.d(androidx.lifecycle.d.ON_STOP);
    }

    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        if (l("onTrimMemory")) {
            g gVar = this.f1442g;
            gVar.c();
            c cVar = gVar.f1450b;
            if (cVar != null) {
                if (gVar.f1457i && i3 >= 10) {
                    FlutterJNI flutterJNI = cVar.f1682c.f1759f;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    h hVar = gVar.f1450b.f1696q;
                    hVar.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    ((C0464y) hVar.f2743g).k(hashMap, (C0135c) null);
                }
                gVar.f1450b.f1681b.b(i3);
                io.flutter.plugin.platform.l lVar = gVar.f1450b.f1698s;
                if (i3 < 40) {
                    lVar.getClass();
                    return;
                }
                Iterator it = lVar.f3404n.values().iterator();
                if (it.hasNext()) {
                    ((r) it.next()).getClass();
                    throw null;
                }
            }
        }
    }

    public final void onUserLeaveHint() {
        if (l("onUserLeaveHint")) {
            g gVar = this.f1442g;
            gVar.c();
            c cVar = gVar.f1450b;
            if (cVar != null) {
                e eVar = cVar.f1683d;
                if (eVar.f()) {
                    C0332a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
                    try {
                        Iterator it = ((HashSet) eVar.f1714f.f1707e).iterator();
                        if (!it.hasNext()) {
                            Trace.endSection();
                            return;
                        } else if (it.next() == null) {
                            throw null;
                        } else {
                            throw new ClassCastException();
                        }
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                    return;
                }
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
        } else {
            return;
        }
        throw th;
    }

    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (l("onWindowFocusChanged")) {
            g gVar = this.f1442g;
            gVar.c();
            gVar.f1449a.getClass();
            c cVar = gVar.f1450b;
            if (cVar != null) {
                C0129a aVar = cVar.f1686g;
                if (z3) {
                    aVar.a(aVar.f2702a, true);
                } else {
                    aVar.a(aVar.f2702a, false);
                }
            }
        }
    }
}
