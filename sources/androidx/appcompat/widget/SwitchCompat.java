package androidx.appcompat.widget;

import A.A;
import a.C0094a;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import f.C0159a;
import g.C0168a;
import j.C0258x;
import j.f0;
import j.u0;
import java.lang.reflect.Field;
import u.C0489a;

public class SwitchCompat extends CompoundButton {

    /* renamed from: R  reason: collision with root package name */
    public static final f0 f2207R = new Property(Float.class, "thumbPos");

    /* renamed from: S  reason: collision with root package name */
    public static final int[] f2208S = {16842912};

    /* renamed from: A  reason: collision with root package name */
    public final VelocityTracker f2209A = VelocityTracker.obtain();

    /* renamed from: B  reason: collision with root package name */
    public final int f2210B;

    /* renamed from: C  reason: collision with root package name */
    public float f2211C;

    /* renamed from: D  reason: collision with root package name */
    public int f2212D;

    /* renamed from: E  reason: collision with root package name */
    public int f2213E;

    /* renamed from: F  reason: collision with root package name */
    public int f2214F;

    /* renamed from: G  reason: collision with root package name */
    public int f2215G;

    /* renamed from: H  reason: collision with root package name */
    public int f2216H;

    /* renamed from: I  reason: collision with root package name */
    public int f2217I;
    public int J;

    /* renamed from: K  reason: collision with root package name */
    public final TextPaint f2218K;

    /* renamed from: L  reason: collision with root package name */
    public final ColorStateList f2219L;

    /* renamed from: M  reason: collision with root package name */
    public StaticLayout f2220M;

    /* renamed from: N  reason: collision with root package name */
    public StaticLayout f2221N;

    /* renamed from: O  reason: collision with root package name */
    public final C0168a f2222O;

    /* renamed from: P  reason: collision with root package name */
    public ObjectAnimator f2223P;

    /* renamed from: Q  reason: collision with root package name */
    public final Rect f2224Q = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public Drawable f2225f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f2226g = null;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f2227h = null;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2228i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2229j = false;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f2230k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f2231l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f2232m = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2233n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2234o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f2235p;

    /* renamed from: q  reason: collision with root package name */
    public int f2236q;

    /* renamed from: r  reason: collision with root package name */
    public int f2237r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2238s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f2239t;

    /* renamed from: u  reason: collision with root package name */
    public CharSequence f2240u;
    public boolean v;

    /* renamed from: w  reason: collision with root package name */
    public int f2241w;

    /* renamed from: x  reason: collision with root package name */
    public final int f2242x;

    /* renamed from: y  reason: collision with root package name */
    public float f2243y;

    /* renamed from: z  reason: collision with root package name */
    public float f2244z;

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, g.a] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fe, code lost:
        if (r9 != null) goto L_0x0105;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchCompat(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r0 = 1
            r1 = 2130903365(0x7f030145, float:1.7413546E38)
            r12.<init>(r13, r14, r1)
            r2 = 0
            r12.f2226g = r2
            r12.f2227h = r2
            r3 = 0
            r12.f2228i = r3
            r12.f2229j = r3
            r12.f2231l = r2
            r12.f2232m = r2
            r12.f2233n = r3
            r12.f2234o = r3
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r12.f2209A = r4
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r12.f2224Q = r4
            android.text.TextPaint r4 = new android.text.TextPaint
            r4.<init>(r0)
            r12.f2218K = r4
            android.content.res.Resources r5 = r12.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            r4.density = r5
            int[] r5 = e.C0153a.f2934r
            C0.f r5 = C0.f.P(r13, r14, r5, r1)
            r6 = 2
            android.graphics.drawable.Drawable r7 = r5.I(r6)
            r12.f2225f = r7
            if (r7 == 0) goto L_0x004b
            r7.setCallback(r12)
        L_0x004b:
            r7 = 11
            android.graphics.drawable.Drawable r7 = r5.I(r7)
            r12.f2230k = r7
            if (r7 == 0) goto L_0x0058
            r7.setCallback(r12)
        L_0x0058:
            java.lang.Object r7 = r5.f127g
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            java.lang.CharSequence r8 = r7.getText(r3)
            r12.f2239t = r8
            java.lang.CharSequence r8 = r7.getText(r0)
            r12.f2240u = r8
            r8 = 3
            boolean r9 = r7.getBoolean(r8, r0)
            r12.v = r9
            r9 = 8
            int r9 = r7.getDimensionPixelSize(r9, r3)
            r12.f2235p = r9
            r9 = 5
            int r9 = r7.getDimensionPixelSize(r9, r3)
            r12.f2236q = r9
            r9 = 6
            int r9 = r7.getDimensionPixelSize(r9, r3)
            r12.f2237r = r9
            r9 = 4
            boolean r9 = r7.getBoolean(r9, r3)
            r12.f2238s = r9
            r9 = 9
            android.content.res.ColorStateList r9 = r5.H(r9)
            if (r9 == 0) goto L_0x0098
            r12.f2226g = r9
            r12.f2228i = r0
        L_0x0098:
            r9 = 10
            r10 = -1
            int r9 = r7.getInt(r9, r10)
            android.graphics.PorterDuff$Mode r9 = j.C0258x.c(r9, r2)
            android.graphics.PorterDuff$Mode r11 = r12.f2227h
            if (r11 == r9) goto L_0x00ab
            r12.f2227h = r9
            r12.f2229j = r0
        L_0x00ab:
            boolean r9 = r12.f2228i
            if (r9 != 0) goto L_0x00b3
            boolean r9 = r12.f2229j
            if (r9 == 0) goto L_0x00b6
        L_0x00b3:
            r12.a()
        L_0x00b6:
            r9 = 12
            android.content.res.ColorStateList r9 = r5.H(r9)
            if (r9 == 0) goto L_0x00c2
            r12.f2231l = r9
            r12.f2233n = r0
        L_0x00c2:
            r9 = 13
            int r9 = r7.getInt(r9, r10)
            android.graphics.PorterDuff$Mode r9 = j.C0258x.c(r9, r2)
            android.graphics.PorterDuff$Mode r11 = r12.f2232m
            if (r11 == r9) goto L_0x00d4
            r12.f2232m = r9
            r12.f2234o = r0
        L_0x00d4:
            boolean r9 = r12.f2233n
            if (r9 != 0) goto L_0x00dc
            boolean r9 = r12.f2234o
            if (r9 == 0) goto L_0x00df
        L_0x00dc:
            r12.b()
        L_0x00df:
            r9 = 7
            int r7 = r7.getResourceId(r9, r3)
            if (r7 == 0) goto L_0x0199
            int[] r9 = e.C0153a.f2935s
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r7, r9)
            boolean r9 = r7.hasValue(r8)
            if (r9 == 0) goto L_0x0101
            int r9 = r7.getResourceId(r8, r3)
            if (r9 == 0) goto L_0x0101
            java.lang.Object r11 = f.C0159a.f2941a
            android.content.res.ColorStateList r9 = r13.getColorStateList(r9)
            if (r9 == 0) goto L_0x0101
            goto L_0x0105
        L_0x0101:
            android.content.res.ColorStateList r9 = r7.getColorStateList(r8)
        L_0x0105:
            if (r9 == 0) goto L_0x010a
            r12.f2219L = r9
            goto L_0x0110
        L_0x010a:
            android.content.res.ColorStateList r9 = r12.getTextColors()
            r12.f2219L = r9
        L_0x0110:
            int r9 = r7.getDimensionPixelSize(r3, r3)
            if (r9 == 0) goto L_0x0125
            float r9 = (float) r9
            float r11 = r4.getTextSize()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x0125
            r4.setTextSize(r9)
            r12.requestLayout()
        L_0x0125:
            int r9 = r7.getInt(r0, r10)
            int r10 = r7.getInt(r6, r10)
            if (r9 == r0) goto L_0x013b
            if (r9 == r6) goto L_0x0138
            if (r9 == r8) goto L_0x0135
            r8 = r2
            goto L_0x013d
        L_0x0135:
            android.graphics.Typeface r8 = android.graphics.Typeface.MONOSPACE
            goto L_0x013d
        L_0x0138:
            android.graphics.Typeface r8 = android.graphics.Typeface.SERIF
            goto L_0x013d
        L_0x013b:
            android.graphics.Typeface r8 = android.graphics.Typeface.SANS_SERIF
        L_0x013d:
            r9 = 0
            if (r10 <= 0) goto L_0x016b
            if (r8 != 0) goto L_0x0147
            android.graphics.Typeface r8 = android.graphics.Typeface.defaultFromStyle(r10)
            goto L_0x014b
        L_0x0147:
            android.graphics.Typeface r8 = android.graphics.Typeface.create(r8, r10)
        L_0x014b:
            r12.setSwitchTypeface(r8)
            if (r8 == 0) goto L_0x0155
            int r8 = r8.getStyle()
            goto L_0x0156
        L_0x0155:
            r8 = r3
        L_0x0156:
            int r8 = ~r8
            r8 = r8 & r10
            r10 = r8 & 1
            if (r10 == 0) goto L_0x015d
            goto L_0x015e
        L_0x015d:
            r0 = r3
        L_0x015e:
            r4.setFakeBoldText(r0)
            r0 = r8 & 2
            if (r0 == 0) goto L_0x0167
            r9 = -1098907648(0xffffffffbe800000, float:-0.25)
        L_0x0167:
            r4.setTextSkewX(r9)
            goto L_0x0174
        L_0x016b:
            r4.setFakeBoldText(r3)
            r4.setTextSkewX(r9)
            r12.setSwitchTypeface(r8)
        L_0x0174:
            r0 = 14
            boolean r0 = r7.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x0194
            g.a r0 = new g.a
            android.content.Context r2 = r12.getContext()
            r0.<init>()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            java.util.Locale r2 = r2.locale
            r0.f2960a = r2
            r12.f2222O = r0
            goto L_0x0196
        L_0x0194:
            r12.f2222O = r2
        L_0x0196:
            r7.recycle()
        L_0x0199:
            j.s r0 = new j.s
            r0.<init>(r12)
            r0.d(r14, r1)
            r5.T()
            android.view.ViewConfiguration r13 = android.view.ViewConfiguration.get(r13)
            int r14 = r13.getScaledTouchSlop()
            r12.f2242x = r14
            int r13 = r13.getScaledMinimumFlingVelocity()
            r12.f2210B = r13
            r12.refreshDrawableState()
            boolean r13 = r12.isChecked()
            r12.setChecked(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private boolean getTargetCheckedState() {
        if (this.f2211C > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f3;
        if (u0.a(this)) {
            f3 = 1.0f - this.f2211C;
        } else {
            f3 = this.f2211C;
        }
        return (int) ((f3 * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f2230k;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f2224Q;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f2225f;
        if (drawable2 != null) {
            rect = C0258x.b(drawable2);
        } else {
            rect = C0258x.f3811a;
        }
        return ((((this.f2212D - this.f2214F) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    public final void a() {
        Drawable drawable = this.f2225f;
        if (drawable == null) {
            return;
        }
        if (this.f2228i || this.f2229j) {
            Drawable mutate = drawable.mutate();
            this.f2225f = mutate;
            if (this.f2228i) {
                C0489a.h(mutate, this.f2226g);
            }
            if (this.f2229j) {
                C0489a.i(this.f2225f, this.f2227h);
            }
            if (this.f2225f.isStateful()) {
                this.f2225f.setState(getDrawableState());
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f2230k;
        if (drawable == null) {
            return;
        }
        if (this.f2233n || this.f2234o) {
            Drawable mutate = drawable.mutate();
            this.f2230k = mutate;
            if (this.f2233n) {
                C0489a.h(mutate, this.f2231l);
            }
            if (this.f2234o) {
                C0489a.i(this.f2230k, this.f2232m);
            }
            if (this.f2230k.isStateful()) {
                this.f2230k.setState(getDrawableState());
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        int i3;
        C0168a aVar = this.f2222O;
        if (aVar != null) {
            charSequence = aVar.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f2218K;
        if (charSequence2 != null) {
            i3 = (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint));
        } else {
            i3 = 0;
        }
        return new StaticLayout(charSequence2, textPaint, i3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public final void draw(Canvas canvas) {
        Rect rect;
        int i3;
        int i4;
        int i5 = this.f2215G;
        int i6 = this.f2216H;
        int i7 = this.f2217I;
        int i8 = this.J;
        int thumbOffset = getThumbOffset() + i5;
        Drawable drawable = this.f2225f;
        if (drawable != null) {
            rect = C0258x.b(drawable);
        } else {
            rect = C0258x.f3811a;
        }
        Drawable drawable2 = this.f2230k;
        Rect rect2 = this.f2224Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i9 = rect2.left;
            thumbOffset += i9;
            if (rect != null) {
                int i10 = rect.left;
                if (i10 > i9) {
                    i5 += i10 - i9;
                }
                int i11 = rect.top;
                int i12 = rect2.top;
                if (i11 > i12) {
                    i3 = (i11 - i12) + i6;
                } else {
                    i3 = i6;
                }
                int i13 = rect.right;
                int i14 = rect2.right;
                if (i13 > i14) {
                    i7 -= i13 - i14;
                }
                int i15 = rect.bottom;
                int i16 = rect2.bottom;
                if (i15 > i16) {
                    i4 = i8 - (i15 - i16);
                    this.f2230k.setBounds(i5, i3, i7, i4);
                }
            } else {
                i3 = i6;
            }
            i4 = i8;
            this.f2230k.setBounds(i5, i3, i7, i4);
        }
        Drawable drawable3 = this.f2225f;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i17 = thumbOffset - rect2.left;
            int i18 = thumbOffset + this.f2214F + rect2.right;
            this.f2225f.setBounds(i17, i6, i18, i8);
            Drawable background = getBackground();
            if (background != null) {
                C0489a.f(background, i17, i6, i18, i8);
            }
        }
        super.draw(canvas);
    }

    public final void drawableHotspotChanged(float f3, float f4) {
        super.drawableHotspotChanged(f3, f4);
        Drawable drawable = this.f2225f;
        if (drawable != null) {
            C0489a.e(drawable, f3, f4);
        }
        Drawable drawable2 = this.f2230k;
        if (drawable2 != null) {
            C0489a.e(drawable2, f3, f4);
        }
    }

    public final void drawableStateChanged() {
        boolean z3;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2225f;
        if (drawable == null || !drawable.isStateful()) {
            z3 = false;
        } else {
            z3 = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f2230k;
        if (drawable2 != null && drawable2.isStateful()) {
            z3 |= drawable2.setState(drawableState);
        }
        if (z3) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!u0.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f2212D;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f2237r;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (u0.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f2212D;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f2237r;
        }
        return compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.v;
    }

    public boolean getSplitTrack() {
        return this.f2238s;
    }

    public int getSwitchMinWidth() {
        return this.f2236q;
    }

    public int getSwitchPadding() {
        return this.f2237r;
    }

    public CharSequence getTextOff() {
        return this.f2240u;
    }

    public CharSequence getTextOn() {
        return this.f2239t;
    }

    public Drawable getThumbDrawable() {
        return this.f2225f;
    }

    public int getThumbTextPadding() {
        return this.f2235p;
    }

    public ColorStateList getThumbTintList() {
        return this.f2226g;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f2227h;
    }

    public Drawable getTrackDrawable() {
        return this.f2230k;
    }

    public ColorStateList getTrackTintList() {
        return this.f2231l;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f2232m;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2225f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2230k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f2223P;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f2223P.end();
            this.f2223P = null;
        }
    }

    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2208S);
        }
        return onCreateDrawableState;
    }

    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        int i3;
        super.onDraw(canvas);
        Drawable drawable = this.f2230k;
        Rect rect = this.f2224Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i4 = this.f2216H;
        int i5 = this.J;
        int i6 = i4 + rect.top;
        int i7 = i5 - rect.bottom;
        Drawable drawable2 = this.f2225f;
        if (drawable != null) {
            if (!this.f2238s || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b3 = C0258x.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b3.left;
                rect.right -= b3.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            staticLayout = this.f2220M;
        } else {
            staticLayout = this.f2221N;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f2219L;
            TextPaint textPaint = this.f2218K;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i3 = bounds.left + bounds.right;
            } else {
                i3 = getWidth();
            }
            canvas.translate((float) ((i3 / 2) - (staticLayout.getWidth() / 2)), (float) (((i6 + i7) / 2) - (staticLayout.getHeight() / 2)));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (isChecked()) {
            charSequence = this.f2239t;
        } else {
            charSequence = this.f2240u;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        super.onLayout(z3, i3, i4, i5, i6);
        int i12 = 0;
        if (this.f2225f != null) {
            Drawable drawable = this.f2230k;
            Rect rect = this.f2224Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b3 = C0258x.b(this.f2225f);
            i7 = Math.max(0, b3.left - rect.left);
            i12 = Math.max(0, b3.right - rect.right);
        } else {
            i7 = 0;
        }
        if (u0.a(this)) {
            i9 = getPaddingLeft() + i7;
            i8 = ((this.f2212D + i9) - i7) - i12;
        } else {
            i8 = (getWidth() - getPaddingRight()) - i12;
            i9 = (i8 - this.f2212D) + i7 + i12;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i13 = this.f2213E;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i13 / 2);
            int i14 = height;
            i10 = i13 + height;
            i11 = i14;
        } else if (gravity != 80) {
            i11 = getPaddingTop();
            i10 = this.f2213E + i11;
        } else {
            i10 = getHeight() - getPaddingBottom();
            i11 = i10 - this.f2213E;
        }
        this.f2215G = i9;
        this.f2216H = i11;
        this.J = i10;
        this.f2217I = i8;
    }

    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (this.v) {
            if (this.f2220M == null) {
                this.f2220M = c(this.f2239t);
            }
            if (this.f2221N == null) {
                this.f2221N = c(this.f2240u);
            }
        }
        Drawable drawable = this.f2225f;
        int i8 = 0;
        Rect rect = this.f2224Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            i6 = (this.f2225f.getIntrinsicWidth() - rect.left) - rect.right;
            i5 = this.f2225f.getIntrinsicHeight();
        } else {
            i6 = 0;
            i5 = 0;
        }
        if (this.v) {
            i7 = (this.f2235p * 2) + Math.max(this.f2220M.getWidth(), this.f2221N.getWidth());
        } else {
            i7 = 0;
        }
        this.f2214F = Math.max(i7, i6);
        Drawable drawable2 = this.f2230k;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i8 = this.f2230k.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i9 = rect.left;
        int i10 = rect.right;
        Drawable drawable3 = this.f2225f;
        if (drawable3 != null) {
            Rect b3 = C0258x.b(drawable3);
            i9 = Math.max(i9, b3.left);
            i10 = Math.max(i10, b3.right);
        }
        int max = Math.max(this.f2236q, (this.f2214F * 2) + i9 + i10);
        int max2 = Math.max(i8, i5);
        this.f2212D = max;
        this.f2213E = max2;
        super.onMeasure(i3, i4);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f2239t;
        } else {
            charSequence = this.f2240u;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r1 != 3) goto L_0x0140;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            android.view.VelocityTracker r0 = r9.f2209A
            r0.addMovement(r10)
            int r1 = r10.getActionMasked()
            int r2 = r9.f2242x
            r3 = 1
            if (r1 == 0) goto L_0x00f4
            r4 = 3
            r5 = 0
            r6 = 2
            if (r1 == r3) goto L_0x008c
            if (r1 == r6) goto L_0x0019
            if (r1 == r4) goto L_0x008c
            goto L_0x0140
        L_0x0019:
            int r0 = r9.f2241w
            if (r0 == r3) goto L_0x005d
            if (r0 == r6) goto L_0x0021
            goto L_0x0140
        L_0x0021:
            float r10 = r10.getX()
            int r0 = r9.getThumbScrollRange()
            float r1 = r9.f2243y
            float r1 = r10 - r1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0034
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x003d
        L_0x0034:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x003a
            r1 = r2
            goto L_0x003d
        L_0x003a:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = r0
        L_0x003d:
            boolean r0 = j.u0.a(r9)
            if (r0 == 0) goto L_0x0044
            float r1 = -r1
        L_0x0044:
            float r0 = r9.f2211C
            float r1 = r1 + r0
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x004c
            goto L_0x0053
        L_0x004c:
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0052
            r5 = r2
            goto L_0x0053
        L_0x0052:
            r5 = r1
        L_0x0053:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x005c
            r9.f2243y = r10
            r9.setThumbPosition(r5)
        L_0x005c:
            return r3
        L_0x005d:
            float r0 = r10.getX()
            float r1 = r10.getY()
            float r4 = r9.f2243y
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            float r2 = (float) r2
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x007e
            float r4 = r9.f2244z
            float r4 = r1 - r4
            float r4 = java.lang.Math.abs(r4)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0140
        L_0x007e:
            r9.f2241w = r6
            android.view.ViewParent r10 = r9.getParent()
            r10.requestDisallowInterceptTouchEvent(r3)
            r9.f2243y = r0
            r9.f2244z = r1
            return r3
        L_0x008c:
            int r1 = r9.f2241w
            r2 = 0
            if (r1 != r6) goto L_0x00ee
            r9.f2241w = r2
            int r1 = r10.getAction()
            if (r1 != r3) goto L_0x00a1
            boolean r1 = r9.isEnabled()
            if (r1 == 0) goto L_0x00a1
            r1 = r3
            goto L_0x00a2
        L_0x00a1:
            r1 = r2
        L_0x00a2:
            boolean r6 = r9.isChecked()
            if (r1 == 0) goto L_0x00d4
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r1)
            float r0 = r0.getXVelocity()
            float r1 = java.lang.Math.abs(r0)
            int r7 = r9.f2210B
            float r7 = (float) r7
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x00cf
            boolean r1 = j.u0.a(r9)
            if (r1 == 0) goto L_0x00ca
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c8
        L_0x00c6:
            r0 = r3
            goto L_0x00d5
        L_0x00c8:
            r0 = r2
            goto L_0x00d5
        L_0x00ca:
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c8
            goto L_0x00c6
        L_0x00cf:
            boolean r0 = r9.getTargetCheckedState()
            goto L_0x00d5
        L_0x00d4:
            r0 = r6
        L_0x00d5:
            if (r0 == r6) goto L_0x00da
            r9.playSoundEffect(r2)
        L_0x00da:
            r9.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r10)
            r0.setAction(r4)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r10)
            return r3
        L_0x00ee:
            r9.f2241w = r2
            r0.clear()
            goto L_0x0140
        L_0x00f4:
            float r0 = r10.getX()
            float r1 = r10.getY()
            boolean r4 = r9.isEnabled()
            if (r4 == 0) goto L_0x0140
            android.graphics.drawable.Drawable r4 = r9.f2225f
            if (r4 != 0) goto L_0x0107
            goto L_0x0140
        L_0x0107:
            int r4 = r9.getThumbOffset()
            android.graphics.drawable.Drawable r5 = r9.f2225f
            android.graphics.Rect r6 = r9.f2224Q
            r5.getPadding(r6)
            int r5 = r9.f2216H
            int r5 = r5 - r2
            int r7 = r9.f2215G
            int r7 = r7 + r4
            int r7 = r7 - r2
            int r4 = r9.f2214F
            int r4 = r4 + r7
            int r8 = r6.left
            int r4 = r4 + r8
            int r6 = r6.right
            int r4 = r4 + r6
            int r4 = r4 + r2
            int r6 = r9.J
            int r6 = r6 + r2
            float r2 = (float) r7
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0140
            float r2 = (float) r4
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0140
            float r2 = (float) r5
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0140
            float r2 = (float) r6
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0140
            r9.f2241w = r3
            r9.f2243y = r0
            r9.f2244z = r1
        L_0x0140:
            boolean r10 = super.onTouchEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z3) {
        super.setChecked(z3);
        boolean isChecked = isChecked();
        float f3 = 0.0f;
        if (getWindowToken() != null) {
            Field field = A.f0a;
            if (isLaidOut()) {
                if (isChecked) {
                    f3 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f2207R, new float[]{f3});
                this.f2223P = ofFloat;
                ofFloat.setDuration(250);
                this.f2223P.setAutoCancel(true);
                this.f2223P.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f2223P;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f3 = 1.0f;
        }
        setThumbPosition(f3);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0094a.P(callback, this));
    }

    public void setShowText(boolean z3) {
        if (this.v != z3) {
            this.v = z3;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z3) {
        this.f2238s = z3;
        invalidate();
    }

    public void setSwitchMinWidth(int i3) {
        this.f2236q = i3;
        requestLayout();
    }

    public void setSwitchPadding(int i3) {
        this.f2237r = i3;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f2218K;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f2240u = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f2239t = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2225f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f2225f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f3) {
        this.f2211C = f3;
        invalidate();
    }

    public void setThumbResource(int i3) {
        setThumbDrawable(C0159a.a(getContext(), i3));
    }

    public void setThumbTextPadding(int i3) {
        this.f2235p = i3;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f2226g = colorStateList;
        this.f2228i = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f2227h = mode;
        this.f2229j = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2230k;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f2230k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i3) {
        setTrackDrawable(C0159a.a(getContext(), i3));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f2231l = colorStateList;
        this.f2233n = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f2232m = mode;
        this.f2234o = true;
        b();
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f2225f || drawable == this.f2230k) {
            return true;
        }
        return false;
    }
}
