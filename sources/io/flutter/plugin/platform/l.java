package io.flutter.plugin.platform;

import C0.r;
import C0.u;
import S1.o;
import T1.c;
import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import d2.C0152a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.h;
import io.flutter.plugin.editing.j;
import io.flutter.view.g;
import java.util.HashMap;
import java.util.HashSet;

public final class l implements i {

    /* renamed from: f  reason: collision with root package name */
    public final C0152a f3396f = new C0152a();

    /* renamed from: g  reason: collision with root package name */
    public Activity f3397g;

    /* renamed from: h  reason: collision with root package name */
    public o f3398h;

    /* renamed from: i  reason: collision with root package name */
    public FlutterJNI f3399i = null;

    /* renamed from: j  reason: collision with root package name */
    public h f3400j;

    /* renamed from: k  reason: collision with root package name */
    public j f3401k;

    /* renamed from: l  reason: collision with root package name */
    public F0.h f3402l;

    /* renamed from: m  reason: collision with root package name */
    public final a f3403m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public final HashMap f3404n = new HashMap();

    /* renamed from: o  reason: collision with root package name */
    public final HashMap f3405o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    public final SparseArray f3406p = new SparseArray();

    /* renamed from: q  reason: collision with root package name */
    public final SparseArray f3407q = new SparseArray();

    /* renamed from: r  reason: collision with root package name */
    public final SparseArray f3408r = new SparseArray();

    /* renamed from: s  reason: collision with root package name */
    public final SparseArray f3409s = new SparseArray();

    /* renamed from: t  reason: collision with root package name */
    public int f3410t = 0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3411u = false;
    public boolean v = true;

    /* renamed from: w  reason: collision with root package name */
    public final HashSet f3412w = new HashSet();

    /* renamed from: x  reason: collision with root package name */
    public final HashSet f3413x = new HashSet();

    /* renamed from: y  reason: collision with root package name */
    public final r f3414y;

    /* renamed from: z  reason: collision with root package name */
    public final b2.h f3415z = new b2.h(8, this);

    /* JADX WARNING: type inference failed for: r0v6, types: [io.flutter.plugin.platform.a, java.lang.Object] */
    public l() {
        if (r.f158i == null) {
            r.f158i = new r(14);
        }
        this.f3414y = r.f158i;
    }

    public static void e(l lVar, u uVar) {
        lVar.getClass();
        int i3 = uVar.f173b;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalStateException("Trying to create a view with unknown direction value: " + i3 + "(view id: " + uVar.f172a + ")");
        }
    }

    public final void a() {
        this.f3403m.f3372a = null;
    }

    public final void b(g gVar) {
        this.f3403m.f3372a = gVar;
    }

    public final boolean c(int i3) {
        return this.f3404n.containsKey(Integer.valueOf(i3));
    }

    public final void d(int i3) {
        if (c(i3)) {
            ((r) this.f3404n.get(Integer.valueOf(i3))).getClass();
        } else if (this.f3406p.get(i3) != null) {
            throw new ClassCastException();
        }
    }

    public final void f() {
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f3408r;
            if (i3 < sparseArray.size()) {
                b bVar = (b) sparseArray.valueAt(i3);
                bVar.c();
                bVar.f1461f.close();
                i3++;
            } else {
                return;
            }
        }
    }

    public final void g(boolean z3) {
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f3408r;
            if (i3 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i3);
            b bVar = (b) sparseArray.valueAt(i3);
            if (this.f3412w.contains(Integer.valueOf(keyAt))) {
                c cVar = this.f3398h.f1492m;
                if (cVar != null) {
                    bVar.b(cVar.f1681b);
                }
                z3 &= bVar.e();
            } else {
                if (!this.f3411u) {
                    bVar.c();
                }
                bVar.setVisibility(8);
                this.f3398h.removeView(bVar);
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f3407q;
            if (i4 < sparseArray2.size()) {
                int keyAt2 = sparseArray2.keyAt(i4);
                View view = (View) sparseArray2.get(keyAt2);
                if (!this.f3413x.contains(Integer.valueOf(keyAt2)) || (!z3 && this.v)) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                }
                i4++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.j] */
    public final void h() {
        if (this.v && !this.f3411u) {
            o oVar = this.f3398h;
            oVar.f1488i.a();
            S1.h hVar = oVar.f1487h;
            if (hVar == null) {
                S1.h hVar2 = new S1.h(oVar.getContext(), oVar.getWidth(), oVar.getHeight(), 1);
                oVar.f1487h = hVar2;
                oVar.addView(hVar2);
            } else {
                hVar.g(oVar.getWidth(), oVar.getHeight());
            }
            oVar.f1489j = oVar.f1488i;
            S1.h hVar3 = oVar.f1487h;
            oVar.f1488i = hVar3;
            c cVar = oVar.f1492m;
            if (cVar != null) {
                hVar3.b(cVar.f1681b);
            }
            this.f3411u = true;
        }
    }

    public final int i(double d3) {
        return (int) Math.round(d3 * ((double) this.f3397g.getResources().getDisplayMetrics().density));
    }
}
