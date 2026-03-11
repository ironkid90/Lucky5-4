package j;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import i.C0208j;

public final class j0 implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3716f = 0;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f3717g;

    public j0(o0 o0Var) {
        this.f3717g = o0Var;
        o0Var.f3743a.getContext();
    }

    public final void onClick(View view) {
        C0208j jVar;
        switch (this.f3716f) {
            case 0:
                k0 k0Var = ((Toolbar) this.f3717g).f2257N;
                if (k0Var == null) {
                    jVar = null;
                } else {
                    jVar = k0Var.f3725g;
                }
                if (jVar != null) {
                    jVar.collapseActionView();
                    return;
                }
                return;
            default:
                o0 o0Var = (o0) this.f3717g;
                if (o0Var.f3753k != null) {
                    o0Var.getClass();
                    return;
                }
                return;
        }
    }

    public j0(Toolbar toolbar) {
        this.f3717g = toolbar;
    }
}
