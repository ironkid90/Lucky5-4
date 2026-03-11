package io.flutter.embedding.engine.renderer;

import S1.C0079e;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f3309a;

    /* renamed from: b  reason: collision with root package name */
    public Surface f3310b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3311c = false;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f3312d = new Handler();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f3313e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f3314f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final C0079e f3315g;

    public h(FlutterJNI flutterJNI) {
        new AtomicLong(0);
        C0079e eVar = new C0079e(3, this);
        this.f3315g = eVar;
        this.f3309a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(eVar);
    }

    public final void a(i iVar) {
        this.f3309a.addIsDisplayingFlutterUiListener(iVar);
        if (this.f3311c) {
            iVar.b();
        }
    }

    public final void b(int i3) {
        Iterator it = this.f3313e.iterator();
        while (it.hasNext()) {
            n nVar = (n) ((WeakReference) it.next()).get();
            if (nVar != null) {
                nVar.onTrimMemory(i3);
            } else {
                it.remove();
            }
        }
    }

    public final void c(i iVar) {
        this.f3309a.removeIsDisplayingFlutterUiListener(iVar);
    }

    public final void d() {
        Iterator it = this.f3314f.iterator();
        while (it.hasNext()) {
            ((FlutterRenderer$ImageReaderSurfaceProducer) it.next()).getClass();
        }
    }

    public final void e() {
        if (this.f3310b != null) {
            this.f3309a.onSurfaceDestroyed();
            if (this.f3311c) {
                this.f3315g.a();
            }
            this.f3311c = false;
            this.f3310b = null;
        }
    }
}
