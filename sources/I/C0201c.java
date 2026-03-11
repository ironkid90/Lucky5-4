package i;

import android.view.View;
import android.view.ViewTreeObserver;
import j.L;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: i.c  reason: case insensitive filesystem */
public final class C0201c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3113f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0209k f3114g;

    public /* synthetic */ C0201c(C0209k kVar, int i3) {
        this.f3113f = i3;
        this.f3114g = kVar;
    }

    public final void onGlobalLayout() {
        switch (this.f3113f) {
            case 0:
                C0204f fVar = (C0204f) this.f3114g;
                if (fVar.i()) {
                    ArrayList arrayList = fVar.f3131m;
                    if (arrayList.size() > 0 && !((C0203e) arrayList.get(0)).f3117a.f3619z) {
                        View view = fVar.f3138t;
                        if (view == null || !view.isShown()) {
                            fVar.dismiss();
                            return;
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C0203e) it.next()).f3117a.c();
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                C0216r rVar = (C0216r) this.f3114g;
                if (rVar.i()) {
                    L l3 = rVar.f3217m;
                    if (!l3.f3619z) {
                        View view2 = rVar.f3222r;
                        if (view2 == null || !view2.isShown()) {
                            rVar.dismiss();
                            return;
                        } else {
                            l3.c();
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
