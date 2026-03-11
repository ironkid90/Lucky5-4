package i;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import j.B;
import j.C0241f;
import j.C0242g;
import j.C0243h;

/* renamed from: i.a  reason: case insensitive filesystem */
public final class C0199a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final float f3102a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3103b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3104c;

    /* renamed from: d  reason: collision with root package name */
    public final View f3105d;

    /* renamed from: e  reason: collision with root package name */
    public B f3106e;

    /* renamed from: f  reason: collision with root package name */
    public B f3107f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3108g;

    /* renamed from: h  reason: collision with root package name */
    public int f3109h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f3110i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f3111j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ View f3112k;

    public C0199a(View view) {
        this.f3110i = new int[2];
        this.f3105d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3102a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3103b = tapTimeout;
        this.f3104c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        B b3 = this.f3107f;
        View view = this.f3105d;
        if (b3 != null) {
            view.removeCallbacks(b3);
        }
        B b4 = this.f3106e;
        if (b4 != null) {
            view.removeCallbacks(b4);
        }
    }

    public final C0209k b() {
        C0241f fVar;
        switch (this.f3111j) {
            case 0:
                C0200b bVar = ((ActionMenuItemView) this.f3112k).f2081o;
                if (bVar == null || (fVar = ((C0242g) bVar).f3685a.f3713x) == null) {
                    return null;
                }
                return fVar.a();
            default:
                C0241f fVar2 = ((C0243h) this.f3112k).f3693h.f3712w;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.a();
        }
    }

    public final boolean c() {
        C0209k b3;
        switch (this.f3111j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f3112k;
                C0206h hVar = actionMenuItemView.f2079m;
                if (hVar == null || !hVar.a(actionMenuItemView.f2076j) || (b3 = b()) == null || !b3.i()) {
                    return false;
                }
                return true;
            default:
                ((C0243h) this.f3112k).f3693h.j();
                return true;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (r14 != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        if (r14 != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0086, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        if (r4 != 3) goto L_0x0121;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            r12 = this;
            boolean r13 = r12.f3108g
            android.view.View r0 = r12.f3105d
            r1 = 3
            r2 = 1
            r3 = 0
            if (r13 == 0) goto L_0x008c
            i.k r4 = r12.b()
            if (r4 == 0) goto L_0x005e
            boolean r5 = r4.i()
            if (r5 != 0) goto L_0x0016
            goto L_0x005e
        L_0x0016:
            android.widget.ListView r4 = r4.j()
            j.z r4 = (j.C0260z) r4
            if (r4 == 0) goto L_0x005e
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L_0x0025
            goto L_0x005e
        L_0x0025:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r14)
            int[] r6 = r12.f3110i
            r0.getLocationOnScreen(r6)
            r0 = r6[r3]
            float r0 = (float) r0
            r7 = r6[r2]
            float r7 = (float) r7
            r5.offsetLocation(r0, r7)
            r4.getLocationOnScreen(r6)
            r0 = r6[r3]
            int r0 = -r0
            float r0 = (float) r0
            r6 = r6[r2]
            int r6 = -r6
            float r6 = (float) r6
            r5.offsetLocation(r0, r6)
            int r0 = r12.f3109h
            boolean r0 = r4.b(r0, r5)
            r5.recycle()
            int r14 = r14.getActionMasked()
            if (r14 == r2) goto L_0x0058
            if (r14 == r1) goto L_0x0058
            r14 = r2
            goto L_0x0059
        L_0x0058:
            r14 = r3
        L_0x0059:
            if (r0 == 0) goto L_0x005e
            if (r14 == 0) goto L_0x005e
            goto L_0x0086
        L_0x005e:
            int r14 = r12.f3111j
            switch(r14) {
                case 1: goto L_0x0074;
                default: goto L_0x0063;
            }
        L_0x0063:
            i.k r14 = r12.b()
            if (r14 == 0) goto L_0x0072
            boolean r0 = r14.i()
            if (r0 == 0) goto L_0x0072
            r14.dismiss()
        L_0x0072:
            r14 = 1
            goto L_0x0084
        L_0x0074:
            android.view.View r14 = r12.f3112k
            j.h r14 = (j.C0243h) r14
            j.i r14 = r14.f3693h
            C0.n r0 = r14.f3714y
            if (r0 == 0) goto L_0x0080
            r14 = 0
            goto L_0x0084
        L_0x0080:
            r14.i()
            goto L_0x0072
        L_0x0084:
            if (r14 != 0) goto L_0x0089
        L_0x0086:
            r14 = r2
            goto L_0x0137
        L_0x0089:
            r14 = r3
            goto L_0x0137
        L_0x008c:
            boolean r4 = r0.isEnabled()
            if (r4 != 0) goto L_0x0094
            goto L_0x0121
        L_0x0094:
            int r4 = r14.getActionMasked()
            if (r4 == 0) goto L_0x00f3
            if (r4 == r2) goto L_0x00ef
            r5 = 2
            if (r4 == r5) goto L_0x00a3
            if (r4 == r1) goto L_0x00ef
            goto L_0x0121
        L_0x00a3:
            int r1 = r12.f3109h
            int r1 = r14.findPointerIndex(r1)
            if (r1 < 0) goto L_0x0121
            float r4 = r14.getX(r1)
            float r14 = r14.getY(r1)
            float r1 = r12.f3102a
            float r5 = -r1
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x00dd
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00dd
            int r5 = r0.getRight()
            int r6 = r0.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r1
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00dd
            int r4 = r0.getBottom()
            int r5 = r0.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r1
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x00dd
            goto L_0x0121
        L_0x00dd:
            r12.a()
            android.view.ViewParent r14 = r0.getParent()
            r14.requestDisallowInterceptTouchEvent(r2)
            boolean r14 = r12.c()
            if (r14 == 0) goto L_0x0121
            r14 = r2
            goto L_0x0122
        L_0x00ef:
            r12.a()
            goto L_0x0121
        L_0x00f3:
            int r14 = r14.getPointerId(r3)
            r12.f3109h = r14
            j.B r14 = r12.f3106e
            if (r14 != 0) goto L_0x0105
            j.B r14 = new j.B
            r1 = 0
            r14.<init>(r12, r1)
            r12.f3106e = r14
        L_0x0105:
            j.B r14 = r12.f3106e
            int r1 = r12.f3103b
            long r4 = (long) r1
            r0.postDelayed(r14, r4)
            j.B r14 = r12.f3107f
            if (r14 != 0) goto L_0x0119
            j.B r14 = new j.B
            r1 = 1
            r14.<init>(r12, r1)
            r12.f3107f = r14
        L_0x0119:
            j.B r14 = r12.f3107f
            int r1 = r12.f3104c
            long r4 = (long) r1
            r0.postDelayed(r14, r4)
        L_0x0121:
            r14 = r3
        L_0x0122:
            if (r14 == 0) goto L_0x0137
            long r6 = android.os.SystemClock.uptimeMillis()
            r8 = 3
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r6
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            r0.onTouchEvent(r1)
            r1.recycle()
        L_0x0137:
            r12.f3108g = r14
            if (r14 != 0) goto L_0x013f
            if (r13 == 0) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r2 = r3
        L_0x013f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0199a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f3108g = false;
        this.f3109h = -1;
        B b3 = this.f3106e;
        if (b3 != null) {
            this.f3105d.removeCallbacks(b3);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0199a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f3111j = 0;
        this.f3112k = actionMenuItemView;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0199a(C0243h hVar, C0243h hVar2) {
        this((View) hVar2);
        this.f3111j = 1;
        this.f3112k = hVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }
}
