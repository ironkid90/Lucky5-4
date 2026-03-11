package g0;

import A2.i;
import A2.j;
import androidx.window.sidecar.SidecarDisplayFeature;
import z2.l;

/* renamed from: g0.e  reason: case insensitive filesystem */
public final class C0173e extends j implements l {

    /* renamed from: g  reason: collision with root package name */
    public static final C0173e f2964g = new j(1);

    /* renamed from: b */
    public final Boolean j(SidecarDisplayFeature sidecarDisplayFeature) {
        boolean z3;
        i.e(sidecarDisplayFeature, "$this$require");
        if (sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}
