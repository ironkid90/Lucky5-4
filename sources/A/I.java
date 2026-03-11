package A;

import android.view.Surface;
import android.view.SurfaceControl;
import android.view.WindowInsets;

public abstract /* synthetic */ class I {
    public static /* synthetic */ Surface e(SurfaceControl surfaceControl) {
        return new Surface(surfaceControl);
    }

    public static /* synthetic */ SurfaceControl.Builder f() {
        return new SurfaceControl.Builder();
    }

    public static /* synthetic */ SurfaceControl.Transaction g() {
        return new SurfaceControl.Transaction();
    }

    public static /* bridge */ /* synthetic */ SurfaceControl.Transaction i(Object obj) {
        return (SurfaceControl.Transaction) obj;
    }

    public static /* synthetic */ WindowInsets.Builder j() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder k(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void n() {
        /*
            android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A.I.n():void");
    }
}
