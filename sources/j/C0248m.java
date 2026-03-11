package j;

import C0.f;
import U.d;
import a.C0094a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.ai9poker.app.R;
import f.C0159a;

/* renamed from: j.m  reason: case insensitive filesystem */
public abstract class C0248m extends AutoCompleteTextView {

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f3729h = {16843126};

    /* renamed from: f  reason: collision with root package name */
    public final C0249n f3730f;

    /* renamed from: g  reason: collision with root package name */
    public final C0253s f3731g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0248m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        h0.a(context);
        f P3 = f.P(getContext(), attributeSet, f3729h, R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) P3.f127g).hasValue(0)) {
            setDropDownBackgroundDrawable(P3.I(0));
        }
        P3.T();
        C0249n nVar = new C0249n(this);
        this.f3730f = nVar;
        nVar.b(attributeSet, R.attr.autoCompleteTextViewStyle);
        C0253s sVar = new C0253s(this);
        this.f3731g = sVar;
        sVar.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        sVar.b();
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0249n nVar = this.f3730f;
        if (nVar != null) {
            nVar.a();
        }
        C0253s sVar = this.f3731g;
        if (sVar != null) {
            sVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar;
        C0249n nVar = this.f3730f;
        if (nVar == null || (dVar = nVar.f3736e) == null) {
            return null;
        }
        return (ColorStateList) dVar.f1754c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar;
        C0249n nVar = this.f3730f;
        if (nVar == null || (dVar = nVar.f3736e) == null) {
            return null;
        }
        return (PorterDuff.Mode) dVar.f1755d;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0249n nVar = this.f3730f;
        if (nVar != null) {
            nVar.f3734c = -1;
            nVar.d((ColorStateList) null);
            nVar.a();
        }
    }

    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0249n nVar = this.f3730f;
        if (nVar != null) {
            nVar.c(i3);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0094a.P(callback, this));
    }

    public void setDropDownBackgroundResource(int i3) {
        setDropDownBackgroundDrawable(C0159a.a(getContext(), i3));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0249n nVar = this.f3730f;
        if (nVar != null) {
            nVar.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0249n nVar = this.f3730f;
        if (nVar != null) {
            nVar.f(mode);
        }
    }

    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C0253s sVar = this.f3731g;
        if (sVar != null) {
            sVar.e(context, i3);
        }
    }
}
