package io.flutter.plugin.platform;

import B.m;
import C0.r;
import S1.o;
import android.app.Activity;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import d2.C0152a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.g;
import java.util.ArrayList;

public final class k implements i {

    /* renamed from: f  reason: collision with root package name */
    public C0152a f3383f;

    /* renamed from: g  reason: collision with root package name */
    public Activity f3384g;

    /* renamed from: h  reason: collision with root package name */
    public o f3385h;

    /* renamed from: i  reason: collision with root package name */
    public FlutterJNI f3386i = null;

    /* renamed from: j  reason: collision with root package name */
    public m f3387j;

    /* renamed from: k  reason: collision with root package name */
    public final a f3388k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public final SparseArray f3389l = new SparseArray();

    /* renamed from: m  reason: collision with root package name */
    public final SparseArray f3390m = new SparseArray();

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f3391n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f3392o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public Surface f3393p = null;

    /* renamed from: q  reason: collision with root package name */
    public SurfaceControl f3394q = null;

    /* renamed from: r  reason: collision with root package name */
    public final C0152a f3395r = new C0152a(6, this);

    /* JADX WARNING: type inference failed for: r0v2, types: [io.flutter.plugin.platform.a, java.lang.Object] */
    public k() {
        if (r.f158i == null) {
            r.f158i = new r(14);
        }
    }

    public final void a() {
        this.f3388k.f3372a = null;
    }

    public final void b(g gVar) {
        this.f3388k.f3372a = gVar;
    }

    public final boolean c(int i3) {
        return false;
    }

    public final void d(int i3) {
        if (this.f3389l.get(i3) != null) {
            throw new ClassCastException();
        }
    }
}
