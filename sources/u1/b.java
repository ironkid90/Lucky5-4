package U1;

import B.m;
import F0.h;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import c2.C0136d;
import c2.C0137e;
import c2.f;
import c2.k;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.FlutterCallbackInformation;
import j1.e;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import m2.C0332a;

public final class b implements f {

    /* renamed from: f  reason: collision with root package name */
    public final FlutterJNI f1759f;

    /* renamed from: g  reason: collision with root package name */
    public final AssetManager f1760g;

    /* renamed from: h  reason: collision with root package name */
    public final long f1761h;

    /* renamed from: i  reason: collision with root package name */
    public final j f1762i;

    /* renamed from: j  reason: collision with root package name */
    public final h f1763j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1764k = false;

    public b(FlutterJNI flutterJNI, AssetManager assetManager, long j3) {
        m mVar = new m(17, (Object) this);
        this.f1759f = flutterJNI;
        this.f1760g = assetManager;
        this.f1761h = j3;
        j jVar = new j(flutterJNI);
        this.f1762i = jVar;
        jVar.l("flutter/isolate", mVar, (e) null);
        this.f1763j = new h(14, (Object) jVar);
        if (flutterJNI.isAttached()) {
            this.f1764k = true;
        }
    }

    public final void a(C0.f fVar) {
        if (this.f1764k) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        C0332a.b("DartExecutor#executeDartCallback");
        try {
            Objects.toString(fVar);
            FlutterCallbackInformation flutterCallbackInformation = (FlutterCallbackInformation) fVar.f129i;
            this.f1759f.runBundleAndSnapshotFromLibrary((String) fVar.f127g, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, (AssetManager) fVar.f128h, (List<String>) null, this.f1761h);
            this.f1764k = true;
            Trace.endSection();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final void b(String str, ByteBuffer byteBuffer) {
        this.f1763j.b(str, byteBuffer);
    }

    public final void c(a aVar, List list) {
        if (this.f1764k) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        C0332a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(aVar);
            this.f1759f.runBundleAndSnapshotFromLibrary(aVar.f1756a, aVar.f1758c, aVar.f1757b, this.f1760g, list, this.f1761h);
            this.f1764k = true;
            Trace.endSection();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final e j(k kVar) {
        return ((j) this.f1763j.f322g).j(kVar);
    }

    public final void l(String str, C0136d dVar, e eVar) {
        this.f1763j.l(str, dVar, eVar);
    }

    public final void q(String str, C0136d dVar) {
        this.f1763j.q(str, dVar);
    }

    public final void r(String str, ByteBuffer byteBuffer, C0137e eVar) {
        this.f1763j.r(str, byteBuffer, eVar);
    }
}
