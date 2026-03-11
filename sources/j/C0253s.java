package j;

import C0.f;
import C0.u;
import U.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import e.C0153a;

/* renamed from: j.s  reason: case insensitive filesystem */
public final class C0253s {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f3780a;

    /* renamed from: b  reason: collision with root package name */
    public d f3781b;

    /* renamed from: c  reason: collision with root package name */
    public d f3782c;

    /* renamed from: d  reason: collision with root package name */
    public d f3783d;

    /* renamed from: e  reason: collision with root package name */
    public d f3784e;

    /* renamed from: f  reason: collision with root package name */
    public d f3785f;

    /* renamed from: g  reason: collision with root package name */
    public d f3786g;

    /* renamed from: h  reason: collision with root package name */
    public d f3787h;

    /* renamed from: i  reason: collision with root package name */
    public final C0255u f3788i;

    /* renamed from: j  reason: collision with root package name */
    public int f3789j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f3790k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f3791l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3792m;

    public C0253s(TextView textView) {
        this.f3780a = textView;
        this.f3788i = new C0255u(textView);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, U.d] */
    public static d c(Context context, C0250o oVar, int i3) {
        ColorStateList f3;
        synchronized (oVar) {
            f3 = oVar.f3742a.f(context, i3);
        }
        if (f3 == null) {
            return null;
        }
        ? obj = new Object();
        obj.f1753b = true;
        obj.f1754c = f3;
        return obj;
    }

    public final void a(Drawable drawable, d dVar) {
        if (drawable != null && dVar != null) {
            C0250o.c(drawable, dVar, this.f3780a.getDrawableState());
        }
    }

    public final void b() {
        d dVar = this.f3781b;
        TextView textView = this.f3780a;
        if (!(dVar == null && this.f3782c == null && this.f3783d == null && this.f3784e == null)) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f3781b);
            a(compoundDrawables[1], this.f3782c);
            a(compoundDrawables[2], this.f3783d);
            a(compoundDrawables[3], this.f3784e);
        }
        if (this.f3785f != null || this.f3786g != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f3785f);
            a(compoundDrawablesRelative[2], this.f3786g);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0331, code lost:
        if (r3 != null) goto L_0x0338;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(android.util.AttributeSet r24, int r25) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            r2 = r25
            r3 = 1
            android.widget.TextView r4 = r1.f3780a
            android.content.Context r5 = r4.getContext()
            android.graphics.PorterDuff$Mode r6 = j.C0250o.f3740b
            java.lang.Class<j.o> r6 = j.C0250o.class
            monitor-enter(r6)
            j.o r7 = j.C0250o.f3741c     // Catch:{ all -> 0x001a }
            if (r7 != 0) goto L_0x001d
            j.C0250o.b()     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r0 = move-exception
            goto L_0x038e
        L_0x001d:
            j.o r7 = j.C0250o.f3741c     // Catch:{ all -> 0x001a }
            monitor-exit(r6)
            int[] r6 = e.C0153a.f2922f
            C0.f r6 = C0.f.P(r5, r0, r6, r2)
            java.lang.Object r8 = r6.f127g
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            r9 = 0
            r10 = -1
            int r11 = r8.getResourceId(r9, r10)
            r12 = 3
            boolean r13 = r8.hasValue(r12)
            if (r13 == 0) goto L_0x0041
            int r13 = r8.getResourceId(r12, r9)
            U.d r13 = c(r5, r7, r13)
            r1.f3781b = r13
        L_0x0041:
            boolean r13 = r8.hasValue(r3)
            if (r13 == 0) goto L_0x0051
            int r13 = r8.getResourceId(r3, r9)
            U.d r13 = c(r5, r7, r13)
            r1.f3782c = r13
        L_0x0051:
            r13 = 4
            boolean r14 = r8.hasValue(r13)
            if (r14 == 0) goto L_0x0062
            int r14 = r8.getResourceId(r13, r9)
            U.d r14 = c(r5, r7, r14)
            r1.f3783d = r14
        L_0x0062:
            r14 = 2
            boolean r15 = r8.hasValue(r14)
            if (r15 == 0) goto L_0x0073
            int r15 = r8.getResourceId(r14, r9)
            U.d r15 = c(r5, r7, r15)
            r1.f3784e = r15
        L_0x0073:
            int r15 = android.os.Build.VERSION.SDK_INT
            r12 = 5
            boolean r17 = r8.hasValue(r12)
            if (r17 == 0) goto L_0x0086
            int r3 = r8.getResourceId(r12, r9)
            U.d r3 = c(r5, r7, r3)
            r1.f3785f = r3
        L_0x0086:
            r3 = 6
            boolean r18 = r8.hasValue(r3)
            if (r18 == 0) goto L_0x0097
            int r8 = r8.getResourceId(r3, r9)
            U.d r8 = c(r5, r7, r8)
            r1.f3786g = r8
        L_0x0097:
            r6.T()
            android.text.method.TransformationMethod r6 = r4.getTransformationMethod()
            boolean r6 = r6 instanceof android.text.method.PasswordTransformationMethod
            int[] r8 = e.C0153a.f2935s
            r3 = 26
            r14 = 15
            r13 = 13
            r12 = 14
            if (r11 == r10) goto L_0x00ec
            C0.f r10 = new C0.f
            android.content.res.TypedArray r11 = r5.obtainStyledAttributes(r11, r8)
            r10.<init>((android.content.Context) r5, (android.content.res.TypedArray) r11)
            if (r6 != 0) goto L_0x00c6
            boolean r19 = r11.hasValue(r12)
            if (r19 == 0) goto L_0x00c6
            boolean r19 = r11.getBoolean(r12, r9)
            r20 = r19
            r19 = 1
            goto L_0x00ca
        L_0x00c6:
            r19 = r9
            r20 = r19
        L_0x00ca:
            r1.f(r5, r10)
            boolean r21 = r11.hasValue(r14)
            if (r21 == 0) goto L_0x00d8
            java.lang.String r21 = r11.getString(r14)
            goto L_0x00da
        L_0x00d8:
            r21 = 0
        L_0x00da:
            if (r15 < r3) goto L_0x00e7
            boolean r22 = r11.hasValue(r13)
            if (r22 == 0) goto L_0x00e7
            java.lang.String r11 = r11.getString(r13)
            goto L_0x00e8
        L_0x00e7:
            r11 = 0
        L_0x00e8:
            r10.T()
            goto L_0x00f3
        L_0x00ec:
            r19 = r9
            r20 = r19
            r11 = 0
            r21 = 0
        L_0x00f3:
            C0.f r10 = new C0.f
            android.content.res.TypedArray r8 = r5.obtainStyledAttributes(r0, r8, r2, r9)
            r10.<init>((android.content.Context) r5, (android.content.res.TypedArray) r8)
            if (r6 != 0) goto L_0x010d
            boolean r22 = r8.hasValue(r12)
            if (r22 == 0) goto L_0x010d
            boolean r20 = r8.getBoolean(r12, r9)
            r12 = r20
            r19 = 1
            goto L_0x010f
        L_0x010d:
            r12 = r20
        L_0x010f:
            boolean r22 = r8.hasValue(r14)
            if (r22 == 0) goto L_0x0119
            java.lang.String r21 = r8.getString(r14)
        L_0x0119:
            if (r15 < r3) goto L_0x0125
            boolean r3 = r8.hasValue(r13)
            if (r3 == 0) goto L_0x0125
            java.lang.String r11 = r8.getString(r13)
        L_0x0125:
            r3 = 28
            if (r15 < r3) goto L_0x013a
            boolean r3 = r8.hasValue(r9)
            if (r3 == 0) goto L_0x013a
            r3 = -1
            int r8 = r8.getDimensionPixelSize(r9, r3)
            if (r8 != 0) goto L_0x013a
            r3 = 0
            r4.setTextSize(r9, r3)
        L_0x013a:
            r1.f(r5, r10)
            r10.T()
            if (r6 != 0) goto L_0x0149
            if (r19 == 0) goto L_0x0149
            android.widget.TextView r3 = r1.f3780a
            r3.setAllCaps(r12)
        L_0x0149:
            android.graphics.Typeface r3 = r1.f3791l
            if (r3 == 0) goto L_0x015b
            int r6 = r1.f3790k
            r8 = -1
            if (r6 != r8) goto L_0x0158
            int r6 = r1.f3789j
            r4.setTypeface(r3, r6)
            goto L_0x015b
        L_0x0158:
            r4.setTypeface(r3)
        L_0x015b:
            if (r11 == 0) goto L_0x0160
            r4.setFontVariationSettings(r11)
        L_0x0160:
            if (r21 == 0) goto L_0x0169
            android.os.LocaleList r3 = android.os.LocaleList.forLanguageTags(r21)
            r4.setTextLocales(r3)
        L_0x0169:
            int[] r3 = e.C0153a.f2923g
            j.u r6 = r1.f3788i
            android.content.Context r8 = r6.f3809j
            android.content.res.TypedArray r2 = r8.obtainStyledAttributes(r0, r3, r2, r9)
            r10 = 5
            boolean r11 = r2.hasValue(r10)
            if (r11 == 0) goto L_0x0180
            int r10 = r2.getInt(r10, r9)
            r6.f3800a = r10
        L_0x0180:
            r10 = 4
            boolean r11 = r2.hasValue(r10)
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r11 == 0) goto L_0x018f
            float r10 = r2.getDimension(r10, r12)
        L_0x018d:
            r11 = 2
            goto L_0x0191
        L_0x018f:
            r10 = r12
            goto L_0x018d
        L_0x0191:
            boolean r14 = r2.hasValue(r11)
            if (r14 == 0) goto L_0x019d
            float r14 = r2.getDimension(r11, r12)
        L_0x019b:
            r11 = 1
            goto L_0x019f
        L_0x019d:
            r14 = r12
            goto L_0x019b
        L_0x019f:
            boolean r15 = r2.hasValue(r11)
            if (r15 == 0) goto L_0x01ab
            float r15 = r2.getDimension(r11, r12)
        L_0x01a9:
            r11 = 3
            goto L_0x01ad
        L_0x01ab:
            r15 = r12
            goto L_0x01a9
        L_0x01ad:
            boolean r16 = r2.hasValue(r11)
            if (r16 == 0) goto L_0x01e4
            int r13 = r2.getResourceId(r11, r9)
            if (r13 <= 0) goto L_0x01e4
            android.content.res.Resources r11 = r2.getResources()
            android.content.res.TypedArray r11 = r11.obtainTypedArray(r13)
            int r13 = r11.length()
            int[] r9 = new int[r13]
            if (r13 <= 0) goto L_0x01e1
            r12 = 0
        L_0x01ca:
            if (r12 >= r13) goto L_0x01d8
            r1 = -1
            int r19 = r11.getDimensionPixelSize(r12, r1)
            r9[r12] = r19
            r1 = 1
            int r12 = r12 + r1
            r1 = r23
            goto L_0x01ca
        L_0x01d8:
            int[] r1 = j.C0255u.b(r9)
            r6.f3805f = r1
            r6.h()
        L_0x01e1:
            r11.recycle()
        L_0x01e4:
            r2.recycle()
            int r1 = r6.f3800a
            r2 = 1065353216(0x3f800000, float:1.0)
            r9 = 1
            if (r1 != r9) goto L_0x021e
            boolean r1 = r6.f3806g
            if (r1 != 0) goto L_0x021b
            android.content.res.Resources r1 = r8.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r9 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r9 != 0) goto L_0x0208
            r9 = 1094713344(0x41400000, float:12.0)
            r11 = 2
            float r14 = android.util.TypedValue.applyDimension(r11, r9, r1)
            goto L_0x0209
        L_0x0208:
            r11 = 2
        L_0x0209:
            int r9 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r9 != 0) goto L_0x0213
            r9 = 1121976320(0x42e00000, float:112.0)
            float r15 = android.util.TypedValue.applyDimension(r11, r9, r1)
        L_0x0213:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0218
            r10 = r2
        L_0x0218:
            r6.i(r14, r15, r10)
        L_0x021b:
            r6.g()
        L_0x021e:
            boolean r1 = F.b.f269a
            if (r1 == 0) goto L_0x024f
            int r1 = r6.f3800a
            if (r1 == 0) goto L_0x024f
            int[] r1 = r6.f3805f
            int r8 = r1.length
            if (r8 <= 0) goto L_0x024f
            int r8 = r4.getAutoSizeStepGranularity()
            float r8 = (float) r8
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x024c
            float r1 = r6.f3803d
            int r1 = java.lang.Math.round(r1)
            float r8 = r6.f3804e
            int r8 = java.lang.Math.round(r8)
            float r6 = r6.f3802c
            int r6 = java.lang.Math.round(r6)
            r4.setAutoSizeTextTypeUniformWithConfiguration(r1, r8, r6, 0)
            goto L_0x024f
        L_0x024c:
            r4.setAutoSizeTextTypeUniformWithPresetSizes(r1, 0)
        L_0x024f:
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r0, r3)
            r1 = 8
            r3 = -1
            int r1 = r0.getResourceId(r1, r3)
            if (r1 == r3) goto L_0x0263
            android.graphics.drawable.Drawable r1 = r7.a(r5, r1)
        L_0x0260:
            r6 = 13
            goto L_0x0265
        L_0x0263:
            r1 = 0
            goto L_0x0260
        L_0x0265:
            int r6 = r0.getResourceId(r6, r3)
            if (r6 == r3) goto L_0x0270
            android.graphics.drawable.Drawable r6 = r7.a(r5, r6)
            goto L_0x0271
        L_0x0270:
            r6 = 0
        L_0x0271:
            r8 = 9
            int r8 = r0.getResourceId(r8, r3)
            if (r8 == r3) goto L_0x027f
            android.graphics.drawable.Drawable r8 = r7.a(r5, r8)
        L_0x027d:
            r9 = 6
            goto L_0x0281
        L_0x027f:
            r8 = 0
            goto L_0x027d
        L_0x0281:
            int r9 = r0.getResourceId(r9, r3)
            if (r9 == r3) goto L_0x028c
            android.graphics.drawable.Drawable r9 = r7.a(r5, r9)
            goto L_0x028d
        L_0x028c:
            r9 = 0
        L_0x028d:
            r10 = 10
            int r10 = r0.getResourceId(r10, r3)
            if (r10 == r3) goto L_0x029a
            android.graphics.drawable.Drawable r10 = r7.a(r5, r10)
            goto L_0x029b
        L_0x029a:
            r10 = 0
        L_0x029b:
            r11 = 7
            int r11 = r0.getResourceId(r11, r3)
            if (r11 == r3) goto L_0x02a7
            android.graphics.drawable.Drawable r3 = r7.a(r5, r11)
            goto L_0x02a8
        L_0x02a7:
            r3 = 0
        L_0x02a8:
            if (r10 != 0) goto L_0x02f7
            if (r3 == 0) goto L_0x02ad
            goto L_0x02f7
        L_0x02ad:
            if (r1 != 0) goto L_0x02b5
            if (r6 != 0) goto L_0x02b5
            if (r8 != 0) goto L_0x02b5
            if (r9 == 0) goto L_0x0316
        L_0x02b5:
            android.graphics.drawable.Drawable[] r3 = r4.getCompoundDrawablesRelative()
            r7 = 0
            r10 = r3[r7]
            if (r10 != 0) goto L_0x02e3
            r11 = 2
            r12 = r3[r11]
            if (r12 == 0) goto L_0x02c4
            goto L_0x02e3
        L_0x02c4:
            android.graphics.drawable.Drawable[] r3 = r4.getCompoundDrawables()
            if (r1 == 0) goto L_0x02cb
            goto L_0x02cd
        L_0x02cb:
            r1 = r3[r7]
        L_0x02cd:
            if (r6 == 0) goto L_0x02d0
            goto L_0x02d3
        L_0x02d0:
            r6 = 1
            r6 = r3[r6]
        L_0x02d3:
            if (r8 == 0) goto L_0x02d6
            goto L_0x02d9
        L_0x02d6:
            r7 = 2
            r8 = r3[r7]
        L_0x02d9:
            if (r9 == 0) goto L_0x02dc
            goto L_0x02df
        L_0x02dc:
            r7 = 3
            r9 = r3[r7]
        L_0x02df:
            r4.setCompoundDrawablesWithIntrinsicBounds(r1, r6, r8, r9)
            goto L_0x0316
        L_0x02e3:
            if (r6 == 0) goto L_0x02e7
        L_0x02e5:
            r1 = 2
            goto L_0x02eb
        L_0x02e7:
            r1 = 1
            r6 = r3[r1]
            goto L_0x02e5
        L_0x02eb:
            r1 = r3[r1]
            if (r9 == 0) goto L_0x02f0
            goto L_0x02f3
        L_0x02f0:
            r7 = 3
            r9 = r3[r7]
        L_0x02f3:
            r4.setCompoundDrawablesRelativeWithIntrinsicBounds(r10, r6, r1, r9)
            goto L_0x0316
        L_0x02f7:
            android.graphics.drawable.Drawable[] r1 = r4.getCompoundDrawablesRelative()
            if (r10 == 0) goto L_0x02fe
            goto L_0x0301
        L_0x02fe:
            r7 = 0
            r10 = r1[r7]
        L_0x0301:
            if (r6 == 0) goto L_0x0304
            goto L_0x0307
        L_0x0304:
            r6 = 1
            r6 = r1[r6]
        L_0x0307:
            if (r3 == 0) goto L_0x030a
            goto L_0x030d
        L_0x030a:
            r3 = 2
            r3 = r1[r3]
        L_0x030d:
            if (r9 == 0) goto L_0x0310
            goto L_0x0313
        L_0x0310:
            r7 = 3
            r9 = r1[r7]
        L_0x0313:
            r4.setCompoundDrawablesRelativeWithIntrinsicBounds(r10, r6, r3, r9)
        L_0x0316:
            r1 = 11
            boolean r3 = r0.hasValue(r1)
            if (r3 == 0) goto L_0x033b
            boolean r3 = r0.hasValue(r1)
            if (r3 == 0) goto L_0x0334
            r3 = 0
            int r3 = r0.getResourceId(r1, r3)
            if (r3 == 0) goto L_0x0334
            java.lang.Object r6 = f.C0159a.f2941a
            android.content.res.ColorStateList r3 = r5.getColorStateList(r3)
            if (r3 == 0) goto L_0x0334
            goto L_0x0338
        L_0x0334:
            android.content.res.ColorStateList r3 = r0.getColorStateList(r1)
        L_0x0338:
            F.l.f(r4, r3)
        L_0x033b:
            r1 = 12
            boolean r3 = r0.hasValue(r1)
            if (r3 == 0) goto L_0x0353
            r3 = -1
            int r1 = r0.getInt(r1, r3)
            r5 = 0
            android.graphics.PorterDuff$Mode r1 = j.C0258x.c(r1, r5)
            F.l.g(r4, r1)
        L_0x0350:
            r1 = 14
            goto L_0x0355
        L_0x0353:
            r3 = -1
            goto L_0x0350
        L_0x0355:
            int r1 = r0.getDimensionPixelSize(r1, r3)
            r5 = 17
            int r5 = r0.getDimensionPixelSize(r5, r3)
            r6 = 18
            int r6 = r0.getDimensionPixelSize(r6, r3)
            r0.recycle()
            if (r1 == r3) goto L_0x036d
            a.C0094a.J(r4, r1)
        L_0x036d:
            if (r5 == r3) goto L_0x0372
            a.C0094a.K(r4, r5)
        L_0x0372:
            if (r6 == r3) goto L_0x038d
            if (r6 < 0) goto L_0x0387
            android.text.TextPaint r0 = r4.getPaint()
            r1 = 0
            int r0 = r0.getFontMetricsInt(r1)
            if (r6 == r0) goto L_0x038d
            int r6 = r6 - r0
            float r0 = (float) r6
            r4.setLineSpacing(r0, r2)
            goto L_0x038d
        L_0x0387:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x038d:
            return
        L_0x038e:
            monitor-exit(r6)     // Catch:{ all -> 0x001a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0253s.d(android.util.AttributeSet, int):void");
    }

    public final void e(Context context, int i3) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, C0153a.f2935s);
        f fVar = new f(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f3780a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, fVar);
        if (i4 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        fVar.T();
        Typeface typeface = this.f3791l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f3789j);
        }
    }

    public final void f(Context context, f fVar) {
        String string;
        boolean z3;
        boolean z4;
        int i3 = this.f3789j;
        TypedArray typedArray = (TypedArray) fVar.f127g;
        this.f3789j = typedArray.getInt(2, i3);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int i5 = typedArray.getInt(11, -1);
            this.f3790k = i5;
            if (i5 != -1) {
                this.f3789j &= 2;
            }
        }
        int i6 = 10;
        boolean z5 = false;
        if (typedArray.hasValue(10) || typedArray.hasValue(12)) {
            this.f3791l = null;
            if (typedArray.hasValue(12)) {
                i6 = 12;
            }
            int i7 = this.f3790k;
            int i8 = this.f3789j;
            if (!context.isRestricted()) {
                try {
                    Typeface J = fVar.J(i6, this.f3789j, new u(this, i7, i8));
                    if (J != null) {
                        if (i4 < 28 || this.f3790k == -1) {
                            this.f3791l = J;
                        } else {
                            Typeface create = Typeface.create(J, 0);
                            int i9 = this.f3790k;
                            if ((this.f3789j & 2) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            this.f3791l = Typeface.create(create, i9, z4);
                        }
                    }
                    if (this.f3791l == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.f3792m = z3;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f3791l == null && (string = typedArray.getString(i6)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f3790k == -1) {
                    this.f3791l = Typeface.create(string, this.f3789j);
                    return;
                }
                Typeface create2 = Typeface.create(string, 0);
                int i10 = this.f3790k;
                if ((this.f3789j & 2) != 0) {
                    z5 = true;
                }
                this.f3791l = Typeface.create(create2, i10, z5);
            }
        } else if (typedArray.hasValue(1)) {
            this.f3792m = false;
            int i11 = typedArray.getInt(1, 1);
            if (i11 == 1) {
                this.f3791l = Typeface.SANS_SERIF;
            } else if (i11 == 2) {
                this.f3791l = Typeface.SERIF;
            } else if (i11 == 3) {
                this.f3791l = Typeface.MONOSPACE;
            }
        }
    }
}
