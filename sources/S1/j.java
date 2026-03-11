package S1;

import android.graphics.Region;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.h;

public final class j extends SurfaceView implements io.flutter.embedding.engine.renderer.j {

    /* renamed from: f  reason: collision with root package name */
    public boolean f1468f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1469g = false;

    /* renamed from: h  reason: collision with root package name */
    public h f1470h;

    /* renamed from: i  reason: collision with root package name */
    public final E f1471i;

    public j(C0078d dVar, boolean z3) {
        super(dVar, (AttributeSet) null);
        E e2 = new E(new i(this), this, this.f1470h);
        this.f1471i = e2;
        if (z3) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(e2);
    }

    public final void a() {
        if (this.f1470h == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f1469g = true;
        }
    }

    public final void b(h hVar) {
        h hVar2 = this.f1470h;
        if (hVar2 != null) {
            hVar2.e();
        }
        this.f1470h = hVar;
        this.f1471i.f1431e.p(hVar);
        d();
    }

    public final void c() {
        if (this.f1470h != null) {
            if (getWindowToken() != null) {
                h hVar = this.f1470h;
                if (hVar != null) {
                    hVar.e();
                } else {
                    throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                }
            }
            this.f1471i.f1431e.m();
            this.f1470h = null;
            return;
        }
        Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    public final void d() {
        if (this.f1470h == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f1471i.f1431e.a();
        if (this.f1468f) {
            e();
        }
        this.f1469g = false;
    }

    public final void e() {
        if (this.f1470h == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        h hVar = this.f1470h;
        Surface surface = getHolder().getSurface();
        boolean z3 = this.f1469g;
        if (!z3) {
            hVar.e();
        }
        hVar.f3310b = surface;
        FlutterJNI flutterJNI = hVar.f3309a;
        if (z3) {
            flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            flutterJNI.onSurfaceCreated(surface);
        }
    }

    public final boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i3 = iArr[0];
        Region region2 = region;
        region2.op(i3, iArr[1], (getRight() + i3) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    public h getAttachedRenderer() {
        return this.f1470h;
    }
}
