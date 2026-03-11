package g0;

import A2.i;
import A2.j;
import androidx.window.sidecar.SidecarDisplayFeature;
import z2.l;

/* renamed from: g0.d  reason: case insensitive filesystem */
public final class C0172d extends j implements l {

    /* renamed from: g  reason: collision with root package name */
    public static final C0172d f2963g = new j(1);

    /* renamed from: b */
    public final Boolean j(SidecarDisplayFeature sidecarDisplayFeature) {
        i.e(sidecarDisplayFeature, "$this$require");
        boolean z3 = true;
        if (!(sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0)) {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}
