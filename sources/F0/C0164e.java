package f0;

import A.H;
import A.J;
import A.K;
import A.L;
import A.V;
import A2.i;
import a0.b;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import d0.C0140b;
import d0.C0141c;
import d0.C0148j;
import d0.C0149k;
import d0.C0151m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: f0.e  reason: case insensitive filesystem */
public abstract class C0164e {
    public static C0141c a(C0149k kVar, FoldingFeature foldingFeature) {
        C0140b bVar;
        C0140b bVar2;
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = C0140b.f2885l;
        } else if (type != 2) {
            return null;
        } else {
            bVar = C0140b.f2886m;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = C0140b.f2883j;
        } else if (state != 2) {
            return null;
        } else {
            bVar2 = C0140b.f2884k;
        }
        Rect bounds = foldingFeature.getBounds();
        i.d(bounds, "oemFeature.bounds");
        b bVar3 = new b(bounds);
        Rect c3 = kVar.f2907a.c();
        if (bVar3.a() == 0 && bVar3.b() == 0) {
            return null;
        }
        if (bVar3.b() != c3.width() && bVar3.a() != c3.height()) {
            return null;
        }
        if (bVar3.b() < c3.width() && bVar3.a() < c3.height()) {
            return null;
        }
        if (bVar3.b() == c3.width() && bVar3.a() == c3.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        i.d(bounds2, "oemFeature.bounds");
        return new C0141c(new b(bounds2), bVar, bVar2);
    }

    public static C0148j b(Context context, WindowLayoutInfo windowLayoutInfo) {
        C0149k kVar;
        L l3;
        i.e(windowLayoutInfo, "info");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            int i4 = C0151m.f2910b;
            if (i3 >= 30) {
                WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
                V a2 = V.a(windowManager.getCurrentWindowMetrics().getWindowInsets(), (View) null);
                Rect f3 = windowManager.getCurrentWindowMetrics().getBounds();
                i.d(f3, "wm.currentWindowMetrics.bounds");
                kVar = new C0149k(f3, a2);
            } else {
                Context context2 = context;
                while (context2 instanceof ContextWrapper) {
                    boolean z3 = context2 instanceof Activity;
                    if (!z3 && !(context2 instanceof InputMethodService)) {
                        ContextWrapper contextWrapper = (ContextWrapper) context2;
                        if (contextWrapper.getBaseContext() != null) {
                            context2 = contextWrapper.getBaseContext();
                            i.d(context2, "iterator.baseContext");
                        }
                    }
                    if (z3) {
                        kVar = C0151m.a((Activity) context);
                    } else if (context2 instanceof InputMethodService) {
                        Object systemService = context.getSystemService("window");
                        i.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                        i.d(defaultDisplay, "wm.defaultDisplay");
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        Rect rect = new Rect(0, 0, point.x, point.y);
                        int i5 = Build.VERSION.SDK_INT;
                        if (i5 >= 30) {
                            l3 = new K();
                        } else if (i5 >= 29) {
                            l3 = new J();
                        } else {
                            l3 = new H();
                        }
                        V b3 = l3.b();
                        i.d(b3, "Builder().build()");
                        kVar = new C0149k(rect, b3);
                    } else {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                }
                throw new IllegalArgumentException("Context " + context + " is not a UiContext");
            }
            return c(kVar, windowLayoutInfo);
        } else if (i3 < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        } else {
            int i6 = C0151m.f2910b;
            return c(C0151m.a((Activity) context), windowLayoutInfo);
        }
    }

    public static C0148j c(C0149k kVar, WindowLayoutInfo windowLayoutInfo) {
        C0141c cVar;
        i.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        i.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                i.d(foldingFeature, "feature");
                cVar = a(kVar, foldingFeature);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return new C0148j(arrayList);
    }
}
