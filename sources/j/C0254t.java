package j;

import A2.h;
import F.b;
import F.l;
import U.d;
import a.C0094a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import c2.n;
import f.C0159a;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import t.C0470d;
import y.C0517a;
import y.C0518b;

/* renamed from: j.t  reason: case insensitive filesystem */
public class C0254t extends TextView implements b {

    /* renamed from: f  reason: collision with root package name */
    public final C0249n f3794f;

    /* renamed from: g  reason: collision with root package name */
    public final C0253s f3795g;

    /* renamed from: h  reason: collision with root package name */
    public final n f3796h;

    /* renamed from: i  reason: collision with root package name */
    public Future f3797i;

    public C0254t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public final void d() {
        Future future = this.f3797i;
        if (future != null) {
            try {
                this.f3797i = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                } else if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                } else {
                    C0094a.C(this);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0249n nVar = this.f3794f;
        if (nVar != null) {
            nVar.a();
        }
        C0253s sVar = this.f3795g;
        if (sVar != null) {
            sVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f269a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0253s sVar = this.f3795g;
        if (sVar != null) {
            return Math.round(sVar.f3788i.f3804e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f269a) {
            return super.getAutoSizeMinTextSize();
        }
        C0253s sVar = this.f3795g;
        if (sVar != null) {
            return Math.round(sVar.f3788i.f3803d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f269a) {
            return super.getAutoSizeStepGranularity();
        }
        C0253s sVar = this.f3795g;
        if (sVar != null) {
            return Math.round(sVar.f3788i.f3802c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f269a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0253s sVar = this.f3795g;
        if (sVar != null) {
            return sVar.f3788i.f3805f;
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!b.f269a) {
            C0253s sVar = this.f3795g;
            if (sVar != null) {
                return sVar.f3788i.f3800a;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar;
        C0249n nVar = this.f3794f;
        if (nVar == null || (dVar = nVar.f3736e) == null) {
            return null;
        }
        return (ColorStateList) dVar.f1754c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar;
        C0249n nVar = this.f3794f;
        if (nVar == null || (dVar = nVar.f3736e) == null) {
            return null;
        }
        return (PorterDuff.Mode) dVar.f1755d;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        d dVar = this.f3795g.f3787h;
        if (dVar != null) {
            return (ColorStateList) dVar.f1754c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        d dVar = this.f3795g.f3787h;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f1755d;
        }
        return null;
    }

    public CharSequence getText() {
        d();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        n nVar;
        if (Build.VERSION.SDK_INT >= 28 || (nVar = this.f3796h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) nVar.f2790h;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((C0254t) nVar.f2789g).getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }

    public C0517a getTextMetricsParamsCompat() {
        return C0094a.C(this);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        C0253s sVar = this.f3795g;
        if (sVar != null && !b.f269a) {
            sVar.f3788i.a();
        }
    }

    public void onMeasure(int i3, int i4) {
        d();
        super.onMeasure(i3, i4);
    }

    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
        C0253s sVar = this.f3795g;
        if (sVar != null && !b.f269a) {
            C0255u uVar = sVar.f3788i;
            if (uVar.f3800a != 0) {
                uVar.a();
            }
        }
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i4, int i5, int i6) {
        if (b.f269a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, i5, i6);
            return;
        }
        C0253s sVar = this.f3795g;
        if (sVar != null) {
            C0255u uVar = sVar.f3788i;
            DisplayMetrics displayMetrics = uVar.f3809j.getResources().getDisplayMetrics();
            uVar.i(TypedValue.applyDimension(i6, (float) i3, displayMetrics), TypedValue.applyDimension(i6, (float) i4, displayMetrics), TypedValue.applyDimension(i6, (float) i5, displayMetrics));
            if (uVar.g()) {
                uVar.a();
            }
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        if (b.f269a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
            return;
        }
        C0253s sVar = this.f3795g;
        if (sVar != null) {
            C0255u uVar = sVar.f3788i;
            uVar.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i3 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = uVar.f3809j.getResources().getDisplayMetrics();
                    for (int i4 = 0; i4 < length; i4++) {
                        iArr2[i4] = Math.round(TypedValue.applyDimension(i3, (float) iArr[i4], displayMetrics));
                    }
                }
                uVar.f3805f = C0255u.b(iArr2);
                if (!uVar.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                uVar.f3806g = false;
            }
            if (uVar.g()) {
                uVar.a();
            }
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i3) {
        if (b.f269a) {
            super.setAutoSizeTextTypeWithDefaults(i3);
            return;
        }
        C0253s sVar = this.f3795g;
        if (sVar != null) {
            C0255u uVar = sVar.f3788i;
            if (i3 == 0) {
                uVar.f3800a = 0;
                uVar.f3803d = -1.0f;
                uVar.f3804e = -1.0f;
                uVar.f3802c = -1.0f;
                uVar.f3805f = new int[0];
                uVar.f3801b = false;
            } else if (i3 == 1) {
                DisplayMetrics displayMetrics = uVar.f3809j.getResources().getDisplayMetrics();
                uVar.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (uVar.g()) {
                    uVar.a();
                }
            } else {
                uVar.getClass();
                throw new IllegalArgumentException(h.e("Unknown auto-size text type: ", i3));
            }
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0249n nVar = this.f3794f;
        if (nVar != null) {
            nVar.f3734c = -1;
            nVar.d((ColorStateList) null);
            nVar.a();
        }
    }

    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0249n nVar = this.f3794f;
        if (nVar != null) {
            nVar.c(i3);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0253s sVar = this.f3795g;
        if (sVar != null) {
            sVar.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0253s sVar = this.f3795g;
        if (sVar != null) {
            sVar.b();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0253s sVar = this.f3795g;
        if (sVar != null) {
            sVar.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0253s sVar = this.f3795g;
        if (sVar != null) {
            sVar.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0094a.P(callback, this));
    }

    public void setFirstBaselineToTopHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i3);
        } else {
            C0094a.J(this, i3);
        }
    }

    public void setLastBaselineToBottomHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i3);
        } else {
            C0094a.K(this, i3);
        }
    }

    public void setLineHeight(int i3) {
        if (i3 >= 0) {
            int fontMetricsInt = getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
            if (i3 != fontMetricsInt) {
                setLineSpacing((float) (i3 - fontMetricsInt), 1.0f);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setPrecomputedText(C0518b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        C0094a.C(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0249n nVar = this.f3794f;
        if (nVar != null) {
            nVar.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0249n nVar = this.f3794f;
        if (nVar != null) {
            nVar.f(mode);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, U.d] */
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        boolean z3;
        C0253s sVar = this.f3795g;
        if (sVar.f3787h == null) {
            sVar.f3787h = new Object();
        }
        d dVar = sVar.f3787h;
        dVar.f1754c = colorStateList;
        if (colorStateList != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        dVar.f1753b = z3;
        sVar.f3781b = dVar;
        sVar.f3782c = dVar;
        sVar.f3783d = dVar;
        sVar.f3784e = dVar;
        sVar.f3785f = dVar;
        sVar.f3786g = dVar;
        sVar.b();
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, U.d] */
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        boolean z3;
        C0253s sVar = this.f3795g;
        if (sVar.f3787h == null) {
            sVar.f3787h = new Object();
        }
        d dVar = sVar.f3787h;
        dVar.f1755d = mode;
        if (mode != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        dVar.f1752a = z3;
        sVar.f3781b = dVar;
        sVar.f3782c = dVar;
        sVar.f3783d = dVar;
        sVar.f3784e = dVar;
        sVar.f3785f = dVar;
        sVar.f3786g = dVar;
        sVar.b();
    }

    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C0253s sVar = this.f3795g;
        if (sVar != null) {
            sVar.e(context, i3);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        n nVar;
        if (Build.VERSION.SDK_INT >= 28 || (nVar = this.f3796h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            nVar.f2790h = textClassifier;
        }
    }

    public void setTextFuture(Future<C0518b> future) {
        this.f3797i = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0517a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.f4806b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i3 = 1;
        if (!(textDirectionHeuristic2 == textDirectionHeuristic3 || textDirectionHeuristic2 == (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR))) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i3 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i3 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i3 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i3 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i3 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i3 = 7;
            }
        }
        setTextDirection(i3);
        getPaint().set(aVar.f4805a);
        l.e(this, aVar.f4807c);
        l.h(this, aVar.f4808d);
    }

    public final void setTextSize(int i3, float f3) {
        boolean z3 = b.f269a;
        if (z3) {
            super.setTextSize(i3, f3);
            return;
        }
        C0253s sVar = this.f3795g;
        if (sVar != null && !z3) {
            C0255u uVar = sVar.f3788i;
            if (uVar.f3800a == 0) {
                uVar.f(i3, f3);
            }
        }
    }

    public final void setTypeface(Typeface typeface, int i3) {
        Typeface typeface2;
        if (typeface == null || i3 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            C0094a aVar = C0470d.f4640a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i3);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0254t(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        h0.a(context);
        C0249n nVar = new C0249n(this);
        this.f3794f = nVar;
        nVar.b(attributeSet, i3);
        C0253s sVar = new C0253s(this);
        this.f3795g = sVar;
        sVar.d(attributeSet, i3);
        sVar.b();
        n nVar2 = new n(6);
        nVar2.f2789g = this;
        this.f3796h = nVar2;
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a2 = i3 != 0 ? C0159a.a(context, i3) : null;
        Drawable a3 = i4 != 0 ? C0159a.a(context, i4) : null;
        Drawable a4 = i5 != 0 ? C0159a.a(context, i5) : null;
        if (i6 != 0) {
            drawable = C0159a.a(context, i6);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(a2, a3, a4, drawable);
        C0253s sVar = this.f3795g;
        if (sVar != null) {
            sVar.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a2 = i3 != 0 ? C0159a.a(context, i3) : null;
        Drawable a3 = i4 != 0 ? C0159a.a(context, i4) : null;
        Drawable a4 = i5 != 0 ? C0159a.a(context, i5) : null;
        if (i6 != 0) {
            drawable = C0159a.a(context, i6);
        }
        setCompoundDrawablesWithIntrinsicBounds(a2, a3, a4, drawable);
        C0253s sVar = this.f3795g;
        if (sVar != null) {
            sVar.b();
        }
    }
}
