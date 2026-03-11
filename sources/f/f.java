package F;

import C0.e;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import j.C0260z;

public final class f implements View.OnTouchListener {

    /* renamed from: r  reason: collision with root package name */
    public static final int f270r = ViewConfiguration.getTapTimeout();

    /* renamed from: a  reason: collision with root package name */
    public final a f271a;

    /* renamed from: b  reason: collision with root package name */
    public final AccelerateInterpolator f272b = new AccelerateInterpolator();

    /* renamed from: c  reason: collision with root package name */
    public final ListView f273c;

    /* renamed from: d  reason: collision with root package name */
    public e f274d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f275e;

    /* renamed from: f  reason: collision with root package name */
    public final float[] f276f;

    /* renamed from: g  reason: collision with root package name */
    public final int f277g;

    /* renamed from: h  reason: collision with root package name */
    public final int f278h;

    /* renamed from: i  reason: collision with root package name */
    public final float[] f279i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f280j;

    /* renamed from: k  reason: collision with root package name */
    public final float[] f281k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f282l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f283m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f284n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f285o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f286p;

    /* renamed from: q  reason: collision with root package name */
    public final C0260z f287q;

    /* JADX WARNING: type inference failed for: r1v0, types: [F.a, java.lang.Object] */
    public f(C0260z zVar) {
        ? obj = new Object();
        obj.f264e = Long.MIN_VALUE;
        obj.f266g = -1;
        obj.f265f = 0;
        this.f271a = obj;
        float[] fArr = {0.0f, 0.0f};
        this.f275e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f276f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f279i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f280j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f281k = fArr5;
        this.f273c = zVar;
        float f3 = Resources.getSystem().getDisplayMetrics().density;
        float f4 = ((float) ((int) ((1575.0f * f3) + 0.5f))) / 1000.0f;
        fArr5[0] = f4;
        fArr5[1] = f4;
        float f5 = ((float) ((int) ((f3 * 315.0f) + 0.5f))) / 1000.0f;
        fArr4[0] = f5;
        fArr4[1] = f5;
        this.f277g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f278h = f270r;
        obj.f260a = 500;
        obj.f261b = 500;
        this.f287q = zVar;
    }

    public static float b(float f3, float f4, float f5) {
        if (f3 > f5) {
            return f5;
        }
        if (f3 < f4) {
            return f4;
        }
        return f3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f275e
            r0 = r0[r4]
            float[] r1 = r3.f276f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f272b
            if (r6 >= 0) goto L_0x0025
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L_0x002d
        L_0x0025:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0036
            float r5 = r0.getInterpolation(r5)
        L_0x002d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L_0x0037
        L_0x0036:
            r5 = r2
        L_0x0037:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003c
            return r2
        L_0x003c:
            float[] r0 = r3.f279i
            r0 = r0[r4]
            float[] r1 = r3.f280j
            r1 = r1[r4]
            float[] r2 = r3.f281k
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L_0x0051
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L_0x0051:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: F.f.a(int, float, float, float):float");
    }

    public final float c(float f3, float f4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        int i3 = this.f277g;
        if (i3 == 0 || i3 == 1) {
            if (f3 < f4) {
                if (f3 >= 0.0f) {
                    return 1.0f - (f3 / f4);
                }
                if (!this.f285o || i3 != 1) {
                    return 0.0f;
                }
                return 1.0f;
            }
        } else if (i3 == 2 && f3 < 0.0f) {
            return f3 / (-f4);
        }
        return 0.0f;
    }

    public final void d() {
        int i3 = 0;
        if (this.f283m) {
            this.f285o = false;
            return;
        }
        a aVar = this.f271a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i4 = (int) (currentAnimationTimeMillis - aVar.f264e);
        int i5 = aVar.f261b;
        if (i4 > i5) {
            i3 = i5;
        } else if (i4 >= 0) {
            i3 = i4;
        }
        aVar.f268i = i3;
        aVar.f267h = aVar.a(currentAnimationTimeMillis);
        aVar.f266g = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r2 = r8.f287q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r8 = this;
            F.a r0 = r8.f271a
            float r1 = r0.f263d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f262c
            java.lang.Math.abs(r0)
            r0 = 0
            if (r1 == 0) goto L_0x004a
            j.z r2 = r8.f287q
            int r3 = r2.getCount()
            if (r3 != 0) goto L_0x001b
            goto L_0x004a
        L_0x001b:
            int r4 = r2.getChildCount()
            int r5 = r2.getFirstVisiblePosition()
            int r6 = r5 + r4
            r7 = 1
            if (r1 <= 0) goto L_0x003a
            if (r6 < r3) goto L_0x0049
            int r4 = r4 - r7
            android.view.View r1 = r2.getChildAt(r4)
            int r1 = r1.getBottom()
            int r2 = r2.getHeight()
            if (r1 > r2) goto L_0x0049
            goto L_0x004a
        L_0x003a:
            if (r1 >= 0) goto L_0x004a
            if (r5 > 0) goto L_0x0049
            android.view.View r1 = r2.getChildAt(r0)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = r7
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F.f.e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r1 != 3) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            r0 = 1
            boolean r1 = r7.f286p
            r2 = 0
            if (r1 != 0) goto L_0x0007
            return r2
        L_0x0007:
            int r1 = r9.getActionMasked()
            if (r1 == 0) goto L_0x001a
            if (r1 == r0) goto L_0x0016
            r3 = 2
            if (r1 == r3) goto L_0x001e
            r8 = 3
            if (r1 == r8) goto L_0x0016
            goto L_0x007b
        L_0x0016:
            r7.d()
            goto L_0x007b
        L_0x001a:
            r7.f284n = r0
            r7.f282l = r2
        L_0x001e:
            float r1 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f273c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r1 = r7.a(r2, r1, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r0, r9, r8, r3)
            F.a r9 = r7.f271a
            r9.f262c = r1
            r9.f263d = r8
            boolean r8 = r7.f285o
            if (r8 != 0) goto L_0x007b
            boolean r8 = r7.e()
            if (r8 == 0) goto L_0x007b
            C0.e r8 = r7.f274d
            if (r8 != 0) goto L_0x005f
            C0.e r8 = new C0.e
            r8.<init>((int) r0, (java.lang.Object) r7)
            r7.f274d = r8
        L_0x005f:
            r7.f285o = r0
            r7.f283m = r0
            boolean r8 = r7.f282l
            if (r8 != 0) goto L_0x0074
            int r8 = r7.f278h
            if (r8 <= 0) goto L_0x0074
            C0.e r9 = r7.f274d
            long r5 = (long) r8
            java.lang.reflect.Field r8 = A.A.f0a
            r4.postOnAnimationDelayed(r9, r5)
            goto L_0x0079
        L_0x0074:
            C0.e r8 = r7.f274d
            r8.run()
        L_0x0079:
            r7.f282l = r0
        L_0x007b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: F.f.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
