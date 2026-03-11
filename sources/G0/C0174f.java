package g0;

import A2.h;
import A2.i;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import d0.C0141c;
import d0.C0148j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q2.l;

/* renamed from: g0.f  reason: case insensitive filesystem */
public final class C0174f {

    /* renamed from: a  reason: collision with root package name */
    public final int f2965a = 3;

    public C0174f() {
        h.k("verificationMode", 3);
    }

    public static boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (i.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        if (C0169a.b(sidecarDeviceState) == C0169a.b(sidecarDeviceState2)) {
            return true;
        }
        return false;
    }

    public static boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (i.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return i.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (!b((SidecarDisplayFeature) list.get(i3), (SidecarDisplayFeature) list2.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (i.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        return c(C0169a.c(sidecarWindowLayoutInfo), C0169a.c(sidecarWindowLayoutInfo2));
    }

    public final C0148j e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        i.e(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new C0148j(l.f4396f);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        C0169a.d(sidecarDeviceState2, C0169a.b(sidecarDeviceState));
        return new C0148j(f(C0169a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList f(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0141c g2 = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (g2 != null) {
                arrayList.add(g2);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        if (r6 == 4) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final d0.C0141c g(androidx.window.sidecar.SidecarDisplayFeature r5, androidx.window.sidecar.SidecarDeviceState r6) {
        /*
            r4 = this;
            java.lang.String r0 = "feature"
            A2.i.e(r5, r0)
            int r0 = r4.f2965a
            a0.h r0 = a0.C0095a.a(r0, r5)
            g0.b r1 = g0.C0170b.f2961g
            java.lang.String r2 = "Type must be either TYPE_FOLD or TYPE_HINGE"
            a0.g r0 = r0.d(r2, r1)
            g0.c r1 = g0.C0171c.f2962g
            java.lang.String r2 = "Feature bounds must not be 0"
            a0.g r0 = r0.d(r2, r1)
            g0.d r1 = g0.C0172d.f2963g
            java.lang.String r2 = "TYPE_FOLD must have 0 area"
            a0.g r0 = r0.d(r2, r1)
            g0.e r1 = g0.C0173e.f2964g
            java.lang.String r2 = "Feature be pinned to either left or top"
            a0.g r0 = r0.d(r2, r1)
            java.lang.Object r0 = r0.a()
            androidx.window.sidecar.SidecarDisplayFeature r0 = (androidx.window.sidecar.SidecarDisplayFeature) r0
            r1 = 0
            if (r0 != 0) goto L_0x0035
            return r1
        L_0x0035:
            int r0 = r0.getType()
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L_0x0043
            if (r0 == r2) goto L_0x0040
            return r1
        L_0x0040:
            d0.b r0 = d0.C0140b.f2886m
            goto L_0x0045
        L_0x0043:
            d0.b r0 = d0.C0140b.f2885l
        L_0x0045:
            int r6 = g0.C0169a.b(r6)
            if (r6 == 0) goto L_0x006e
            if (r6 == r3) goto L_0x006e
            if (r6 == r2) goto L_0x0058
            d0.b r2 = d0.C0140b.f2883j
            r3 = 3
            if (r6 == r3) goto L_0x005a
            r3 = 4
            if (r6 == r3) goto L_0x006e
            goto L_0x005a
        L_0x0058:
            d0.b r2 = d0.C0140b.f2884k
        L_0x005a:
            d0.c r6 = new d0.c
            a0.b r1 = new a0.b
            android.graphics.Rect r5 = r5.getRect()
            java.lang.String r3 = "feature.rect"
            A2.i.d(r5, r3)
            r1.<init>(r5)
            r6.<init>(r1, r0, r2)
            return r6
        L_0x006e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C0174f.g(androidx.window.sidecar.SidecarDisplayFeature, androidx.window.sidecar.SidecarDeviceState):d0.c");
    }
}
