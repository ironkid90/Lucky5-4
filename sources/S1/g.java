package S1;

import C0.r;
import F0.h;
import L1.l;
import T1.b;
import T1.c;
import T1.e;
import T1.i;
import U1.a;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import b2.C0129a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m2.C0332a;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public C0078d f1449a;

    /* renamed from: b  reason: collision with root package name */
    public c f1450b;

    /* renamed from: c  reason: collision with root package name */
    public o f1451c;

    /* renamed from: d  reason: collision with root package name */
    public f f1452d;

    /* renamed from: e  reason: collision with root package name */
    public l f1453e;

    /* renamed from: f  reason: collision with root package name */
    public f f1454f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1455g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1456h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1457i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1458j;

    /* renamed from: k  reason: collision with root package name */
    public Integer f1459k;

    /* renamed from: l  reason: collision with root package name */
    public final C0079e f1460l = new C0079e(0, this);

    public g(C0078d dVar) {
        this.f1449a = dVar;
        this.f1457i = false;
    }

    public final void a(T1.g gVar) {
        String c3 = this.f1449a.c();
        if (c3 == null || c3.isEmpty()) {
            c3 = (String) ((W1.f) C0.f.O().f128h).f1915d.f1900c;
        }
        a aVar = new a(c3, this.f1449a.f());
        String g2 = this.f1449a.g();
        if (g2 == null) {
            C0078d dVar = this.f1449a;
            dVar.getClass();
            g2 = d(dVar.getIntent());
            if (g2 == null) {
                g2 = "/";
            }
        }
        gVar.f1719b = aVar;
        gVar.f1720c = g2;
        gVar.f1721d = (List) this.f1449a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (!this.f1449a.j()) {
            C0078d dVar = this.f1449a;
            dVar.getClass();
            Log.w("FlutterActivity", "FlutterActivity " + dVar + " connection to the engine " + dVar.f1442g.f1450b + " evicted by another attaching activity");
            g gVar = dVar.f1442g;
            if (gVar != null) {
                gVar.e();
                dVar.f1442g.f();
                return;
            }
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f1449a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    public final void c() {
        if (this.f1449a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z3;
        Uri data;
        C0078d dVar = this.f1449a;
        dVar.getClass();
        try {
            Bundle h3 = dVar.h();
            if (h3 == null || !h3.containsKey("flutter_deeplinking_enabled")) {
                z3 = true;
            } else {
                z3 = h3.getBoolean("flutter_deeplinking_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            z3 = false;
        }
        if (!z3 || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public final void e() {
        c();
        if (this.f1454f != null) {
            this.f1451c.getViewTreeObserver().removeOnPreDrawListener(this.f1454f);
            this.f1454f = null;
        }
        o oVar = this.f1451c;
        if (oVar != null) {
            oVar.a();
            o oVar2 = this.f1451c;
            oVar2.f1490k.remove(this.f1460l);
        }
    }

    public final void f() {
        if (this.f1458j) {
            c();
            this.f1449a.getClass();
            this.f1449a.getClass();
            C0078d dVar = this.f1449a;
            dVar.getClass();
            if (dVar.isChangingConfigurations()) {
                e eVar = this.f1450b.f1683d;
                if (eVar.f()) {
                    C0332a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        eVar.f1715g = true;
                        for (Z1.a onDetachedFromActivityForConfigChanges : eVar.f1712d.values()) {
                            onDetachedFromActivityForConfigChanges.onDetachedFromActivityForConfigChanges();
                        }
                        eVar.d();
                        Trace.endSection();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f1450b.f1683d.c();
            }
            f fVar = this.f1452d;
            if (fVar != null) {
                ((r) fVar.f3381d).f161h = null;
                this.f1452d = null;
            }
            l lVar = this.f1453e;
            if (lVar != null) {
                ((h) lVar.f966c).f322g = null;
                lVar.f965b = null;
                this.f1453e = null;
            }
            this.f1449a.getClass();
            c cVar = this.f1450b;
            if (cVar != null) {
                C0129a aVar = cVar.f1686g;
                aVar.a(1, aVar.f2704c);
            }
            if (this.f1449a.j()) {
                c cVar2 = this.f1450b;
                Iterator it = cVar2.v.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).b();
                }
                e eVar2 = cVar2.f1683d;
                eVar2.e();
                HashMap hashMap = eVar2.f1709a;
                Iterator it2 = new HashSet(hashMap.keySet()).iterator();
                while (it2.hasNext()) {
                    Class cls = (Class) it2.next();
                    Y1.b bVar = (Y1.b) hashMap.get(cls);
                    if (bVar != null) {
                        C0332a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (bVar instanceof Z1.a) {
                                if (eVar2.f()) {
                                    ((Z1.a) bVar).onDetachedFromActivity();
                                }
                                eVar2.f1712d.remove(cls);
                            }
                            bVar.onDetachedFromEngine(eVar2.f1711c);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
                hashMap.clear();
                while (true) {
                    io.flutter.plugin.platform.l lVar2 = cVar2.f1698s;
                    SparseArray sparseArray = lVar2.f3406p;
                    if (sparseArray.size() <= 0) {
                        break;
                    }
                    lVar2.f3415z.i(sparseArray.keyAt(0));
                }
                while (true) {
                    k kVar = cVar2.f1699t;
                    SparseArray sparseArray2 = kVar.f3389l;
                    if (sparseArray2.size() <= 0) {
                        break;
                    }
                    kVar.f3395r.d(sparseArray2.keyAt(0));
                }
                cVar2.f1682c.f1759f.setPlatformMessageHandler((U1.k) null);
                FlutterJNI flutterJNI = cVar2.f1680a;
                flutterJNI.removeEngineLifecycleListener(cVar2.f1702x);
                flutterJNI.setDeferredComponentManager((V1.a) null);
                flutterJNI.detachFromNativeAndReleaseResources();
                C0.f.O().getClass();
                c.f1679z.remove(Long.valueOf(cVar2.f1701w));
                if (this.f1449a.e() != null) {
                    if (i.f1726c == null) {
                        i.f1726c = new i(1);
                    }
                    i iVar = i.f1726c;
                    iVar.f1727a.remove(this.f1449a.e());
                }
                this.f1450b = null;
            }
            this.f1458j = false;
            return;
        }
        return;
        throw th;
        throw th;
    }
}
