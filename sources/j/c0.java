package j;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

public final class c0 extends TouchDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final View f3656a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f3657b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f3658c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f3659d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3660e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3661f;

    public c0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f3660e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f3657b = rect3;
        Rect rect4 = new Rect();
        this.f3659d = rect4;
        Rect rect5 = new Rect();
        this.f3658c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i3 = -scaledTouchSlop;
        rect4.inset(i3, i3);
        rect5.set(rect2);
        this.f3656a = view;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            float r0 = r9.getX()
            int r0 = (int) r0
            float r1 = r9.getY()
            int r1 = (int) r1
            int r2 = r9.getAction()
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 == r5) goto L_0x0023
            if (r2 == r3) goto L_0x0023
            r6 = 3
            if (r2 == r6) goto L_0x001b
            goto L_0x003e
        L_0x001b:
            boolean r2 = r8.f3661f
            r8.f3661f = r4
        L_0x001f:
            r7 = r5
            r5 = r2
            r2 = r7
            goto L_0x0040
        L_0x0023:
            boolean r2 = r8.f3661f
            if (r2 == 0) goto L_0x001f
            android.graphics.Rect r6 = r8.f3659d
            boolean r6 = r6.contains(r0, r1)
            if (r6 != 0) goto L_0x001f
            r5 = r2
            r2 = r4
            goto L_0x0040
        L_0x0032:
            android.graphics.Rect r2 = r8.f3657b
            boolean r2 = r2.contains(r0, r1)
            if (r2 == 0) goto L_0x003e
            r8.f3661f = r5
            r2 = r5
            goto L_0x0040
        L_0x003e:
            r2 = r5
            r5 = r4
        L_0x0040:
            if (r5 == 0) goto L_0x006d
            android.graphics.Rect r4 = r8.f3658c
            android.view.View r5 = r8.f3656a
            if (r2 == 0) goto L_0x005e
            boolean r2 = r4.contains(r0, r1)
            if (r2 != 0) goto L_0x005e
            int r0 = r5.getWidth()
            int r0 = r0 / r3
            float r0 = (float) r0
            int r1 = r5.getHeight()
            int r1 = r1 / r3
            float r1 = (float) r1
            r9.setLocation(r0, r1)
            goto L_0x0069
        L_0x005e:
            int r2 = r4.left
            int r0 = r0 - r2
            float r0 = (float) r0
            int r2 = r4.top
            int r1 = r1 - r2
            float r1 = (float) r1
            r9.setLocation(r0, r1)
        L_0x0069:
            boolean r4 = r5.dispatchTouchEvent(r9)
        L_0x006d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j.c0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
