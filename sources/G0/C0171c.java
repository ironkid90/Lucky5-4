package g0;

import A2.i;
import A2.j;
import androidx.window.sidecar.SidecarDisplayFeature;
import z2.l;

/* renamed from: g0.c  reason: case insensitive filesystem */
public final class C0171c extends j implements l {

    /* renamed from: g  reason: collision with root package name */
    public static final C0171c f2962g = new j(1);

    /* renamed from: b */
    public final Boolean j(SidecarDisplayFeature sidecarDisplayFeature) {
        boolean z3;
        i.e(sidecarDisplayFeature, "$this$require");
        if (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
