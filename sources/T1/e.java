package T1;

import B.m;
import F0.h;
import S1.C0078d;
import S1.g;
import U1.b;
import Y1.a;
import android.content.Context;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.lifecycle.l;
import c2.n;
import d2.C0152a;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import io.flutter.plugin.platform.k;
import java.util.HashMap;
import java.util.HashSet;
import m2.C0332a;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1709a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final c f1710b;

    /* renamed from: c  reason: collision with root package name */
    public final a f1711c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f1712d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public g f1713e;

    /* renamed from: f  reason: collision with root package name */
    public d f1714f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1715g = false;

    public e(Context context, c cVar) {
        new HashMap();
        new HashMap();
        new HashMap();
        this.f1710b = cVar;
        b bVar = cVar.f1682c;
        C0152a aVar = cVar.f1698s.f3396f;
        this.f1711c = new a(context, bVar);
    }

    public final void a(Y1.b bVar) {
        C0332a.b("FlutterEngineConnectionRegistry#add ".concat(bVar.getClass().getSimpleName()));
        try {
            Class<?> cls = bVar.getClass();
            HashMap hashMap = this.f1709a;
            if (hashMap.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + bVar + ") but it was already registered with this FlutterEngine (" + this.f1710b + ").");
                Trace.endSection();
                return;
            }
            bVar.toString();
            hashMap.put(bVar.getClass(), bVar);
            bVar.onAttachedToEngine(this.f1711c);
            if (bVar instanceof Z1.a) {
                Z1.a aVar = (Z1.a) bVar;
                this.f1712d.put(bVar.getClass(), aVar);
                if (f()) {
                    aVar.onAttachedToActivity(this.f1714f);
                }
            }
            Trace.endSection();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [T1.d, java.lang.Object] */
    public final void b(C0078d dVar, l lVar) {
        ? obj = new Object();
        obj.f1704b = new HashSet();
        obj.f1705c = new HashSet();
        obj.f1706d = new HashSet();
        obj.f1707e = new HashSet();
        new HashSet();
        obj.f1708f = new HashSet();
        obj.f1703a = dVar;
        new HiddenLifecycleReference(lVar);
        this.f1714f = obj;
        if (dVar.getIntent() != null) {
            dVar.getIntent().getBooleanExtra("enable-software-rendering", false);
        }
        c cVar = this.f1710b;
        cVar.f1698s.getClass();
        n nVar = cVar.f1700u;
        io.flutter.plugin.platform.l lVar2 = (io.flutter.plugin.platform.l) nVar.f2789g;
        if (lVar2.f3397g == null) {
            lVar2.f3397g = dVar;
            lVar2.f3400j = cVar.f1681b;
            b bVar = cVar.f1682c;
            lVar2.f3402l = new h(bVar, 23);
            k kVar = (k) nVar.f2790h;
            if (kVar.f3384g == null) {
                kVar.f3384g = dVar;
                m mVar = new m(bVar, 27);
                kVar.f3387j = mVar;
                mVar.f100g = kVar.f3395r;
                lVar2.f3402l.f322g = nVar;
                for (Z1.a aVar : this.f1712d.values()) {
                    if (this.f1715g) {
                        aVar.onReattachedToActivityForConfigChanges(this.f1714f);
                    } else {
                        aVar.onAttachedToActivity(this.f1714f);
                    }
                }
                this.f1715g = false;
                return;
            }
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }

    public final void c() {
        if (f()) {
            C0332a.b("FlutterEngineConnectionRegistry#detachFromActivity");
            try {
                for (Z1.a onDetachedFromActivity : this.f1712d.values()) {
                    onDetachedFromActivity.onDetachedFromActivity();
                }
                d();
                Trace.endSection();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        throw th;
    }

    public final void d() {
        c cVar = this.f1710b;
        io.flutter.plugin.platform.l lVar = cVar.f1698s;
        h hVar = lVar.f3402l;
        if (hVar != null) {
            hVar.f322g = null;
        }
        lVar.f();
        lVar.f3402l = null;
        lVar.f3397g = null;
        lVar.f3400j = null;
        k kVar = cVar.f1699t;
        m mVar = kVar.f3387j;
        if (mVar != null) {
            mVar.f100g = null;
        }
        Surface surface = kVar.f3393p;
        if (surface != null) {
            surface.release();
            kVar.f3393p = null;
            kVar.f3394q = null;
        }
        kVar.f3387j = null;
        kVar.f3384g = null;
        this.f1713e = null;
        this.f1714f = null;
    }

    public final void e() {
        if (f()) {
            c();
        }
    }

    public final boolean f() {
        if (this.f1713e != null) {
            return true;
        }
        return false;
    }
}
