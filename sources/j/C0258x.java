package j;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import u.f;
import u.g;

/* renamed from: j.x  reason: case insensitive filesystem */
public abstract class C0258x {

    /* renamed from: a  reason: collision with root package name */
    public static final Rect f3811a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public static final Class f3812b;

    static {
        try {
            f3812b = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    public static boolean a(Drawable drawable) {
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable a2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!a(a2)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof f) {
            ((g) ((f) drawable)).getClass();
            return a((Drawable) null);
        } else if (drawable instanceof C0259y) {
            return a(((C0259y) drawable).f3813f);
        } else {
            if (drawable instanceof ScaleDrawable) {
                return a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Rect b(android.graphics.drawable.Drawable r11) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x0028
            android.graphics.Insets r11 = r11.getOpticalInsets()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            int r1 = r11.left
            r0.left = r1
            int r1 = r11.right
            r0.right = r1
            int r1 = r11.top
            r0.top = r1
            int r11 = r11.bottom
            r0.bottom = r11
            return r0
        L_0x0028:
            java.lang.Class r0 = f3812b
            if (r0 == 0) goto L_0x00c1
            boolean r1 = r11 instanceof u.f     // Catch:{ Exception -> 0x00ba }
            if (r1 == 0) goto L_0x0039
            u.f r11 = (u.f) r11     // Catch:{ Exception -> 0x00ba }
            u.g r11 = (u.g) r11     // Catch:{ Exception -> 0x00ba }
            r1 = 0
            r11.getClass()     // Catch:{ Exception -> 0x00ba }
            r11 = r1
        L_0x0039:
            java.lang.Class r1 = r11.getClass()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r2 = "getOpticalInsets"
            r3 = 0
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch:{ Exception -> 0x00ba }
            java.lang.Object r11 = r1.invoke(r11, r3)     // Catch:{ Exception -> 0x00ba }
            if (r11 == 0) goto L_0x00c1
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ Exception -> 0x00ba }
            r1.<init>()     // Catch:{ Exception -> 0x00ba }
            java.lang.reflect.Field[] r0 = r0.getFields()     // Catch:{ Exception -> 0x00ba }
            int r2 = r0.length     // Catch:{ Exception -> 0x00ba }
            r3 = 0
            r4 = r3
        L_0x0056:
            if (r4 >= r2) goto L_0x00b9
            r5 = r0[r4]     // Catch:{ Exception -> 0x00ba }
            java.lang.String r6 = r5.getName()     // Catch:{ Exception -> 0x00ba }
            int r7 = r6.hashCode()     // Catch:{ Exception -> 0x00ba }
            r8 = 1
            r9 = 3
            r10 = 2
            switch(r7) {
                case -1383228885: goto L_0x0087;
                case 115029: goto L_0x007d;
                case 3317767: goto L_0x0073;
                case 108511772: goto L_0x0069;
                default: goto L_0x0068;
            }     // Catch:{ Exception -> 0x00ba }
        L_0x0068:
            goto L_0x0091
        L_0x0069:
            java.lang.String r7 = "right"
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x00ba }
            if (r6 == 0) goto L_0x0091
            r6 = r10
            goto L_0x0092
        L_0x0073:
            java.lang.String r7 = "left"
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x00ba }
            if (r6 == 0) goto L_0x0091
            r6 = r3
            goto L_0x0092
        L_0x007d:
            java.lang.String r7 = "top"
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x00ba }
            if (r6 == 0) goto L_0x0091
            r6 = r8
            goto L_0x0092
        L_0x0087:
            java.lang.String r7 = "bottom"
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x00ba }
            if (r6 == 0) goto L_0x0091
            r6 = r9
            goto L_0x0092
        L_0x0091:
            r6 = -1
        L_0x0092:
            if (r6 == 0) goto L_0x00b0
            if (r6 == r8) goto L_0x00a9
            if (r6 == r10) goto L_0x00a2
            if (r6 == r9) goto L_0x009b
            goto L_0x00b6
        L_0x009b:
            int r5 = r5.getInt(r11)     // Catch:{ Exception -> 0x00ba }
            r1.bottom = r5     // Catch:{ Exception -> 0x00ba }
            goto L_0x00b6
        L_0x00a2:
            int r5 = r5.getInt(r11)     // Catch:{ Exception -> 0x00ba }
            r1.right = r5     // Catch:{ Exception -> 0x00ba }
            goto L_0x00b6
        L_0x00a9:
            int r5 = r5.getInt(r11)     // Catch:{ Exception -> 0x00ba }
            r1.top = r5     // Catch:{ Exception -> 0x00ba }
            goto L_0x00b6
        L_0x00b0:
            int r5 = r5.getInt(r11)     // Catch:{ Exception -> 0x00ba }
            r1.left = r5     // Catch:{ Exception -> 0x00ba }
        L_0x00b6:
            int r4 = r4 + 1
            goto L_0x0056
        L_0x00b9:
            return r1
        L_0x00ba:
            java.lang.String r11 = "DrawableUtils"
            java.lang.String r0 = "Couldn't obtain the optical insets. Ignoring."
            android.util.Log.e(r11, r0)
        L_0x00c1:
            android.graphics.Rect r11 = f3811a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0258x.b(android.graphics.drawable.Drawable):android.graphics.Rect");
    }

    public static PorterDuff.Mode c(int i3, PorterDuff.Mode mode) {
        if (i3 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i3 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i3 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i3) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
