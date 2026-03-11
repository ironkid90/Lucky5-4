package g0;

import A2.i;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import q2.l;

/* renamed from: g0.a  reason: case insensitive filesystem */
public abstract class C0169a {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        i.e(sidecarDeviceState, "sidecarDeviceState");
        try {
            return sidecarDeviceState.posture;
        } catch (NoSuchFieldError unused) {
            try {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", (Class[]) null).invoke(sidecarDeviceState, (Object[]) null);
                i.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) invoke).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        i.e(sidecarDeviceState, "sidecarDeviceState");
        int a2 = a(sidecarDeviceState);
        if (a2 < 0 || a2 > 4) {
            return 0;
        }
        return a2;
    }

    public static List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        l lVar = l.f4396f;
        i.e(sidecarWindowLayoutInfo, "info");
        try {
            List list = sidecarWindowLayoutInfo.displayFeatures;
            if (list == null) {
                return lVar;
            }
            return list;
        } catch (NoSuchFieldError unused) {
            try {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", (Class[]) null).invoke(sidecarWindowLayoutInfo, (Object[]) null);
                i.c(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) invoke;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return lVar;
            }
        }
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i3) {
        try {
            sidecarDeviceState.posture = i3;
        } catch (NoSuchFieldError unused) {
            try {
                SidecarDeviceState.class.getMethod("setPosture", new Class[]{Integer.TYPE}).invoke(sidecarDeviceState, new Object[]{Integer.valueOf(i3)});
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
    }
}
