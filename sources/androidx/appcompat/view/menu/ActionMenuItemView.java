package androidx.appcompat.view.menu;

import M0.a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import e.C0153a;
import i.C0199a;
import i.C0200b;
import i.C0206h;
import i.C0207i;
import i.C0208j;
import i.C0214p;
import j.C0245j;
import j.C0254t;

public class ActionMenuItemView extends C0254t implements C0214p, View.OnClickListener, C0245j {

    /* renamed from: j  reason: collision with root package name */
    public C0208j f2076j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f2077k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f2078l;

    /* renamed from: m  reason: collision with root package name */
    public C0206h f2079m;

    /* renamed from: n  reason: collision with root package name */
    public C0199a f2080n;

    /* renamed from: o  reason: collision with root package name */
    public C0200b f2081o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2082p = e();

    /* renamed from: q  reason: collision with root package name */
    public boolean f2083q;

    /* renamed from: r  reason: collision with root package name */
    public final int f2084r;

    /* renamed from: s  reason: collision with root package name */
    public int f2085s;

    /* renamed from: t  reason: collision with root package name */
    public final int f2086t;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0153a.f2919c, 0, 0);
        this.f2084r = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f2086t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2085s = -1;
        setSaveEnabled(false);
    }

    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean b() {
        if (TextUtils.isEmpty(getText()) || this.f2076j.getIcon() != null) {
            return false;
        }
        return true;
    }

    public final void c(C0208j jVar) {
        int i3;
        this.f2076j = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitleCondensed());
        setId(jVar.f3173a);
        if (jVar.isVisible()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        setVisibility(i3);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f2080n == null) {
            this.f2080n = new C0199a(this);
        }
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (i3 >= 480 || ((i3 >= 640 && i4 >= 480) || configuration.orientation == 2)) {
            return true;
        }
        return false;
    }

    public final void f() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.f2077k);
        if (this.f2078l != null && ((this.f2076j.f3196y & 4) != 4 || (!this.f2082p && !this.f2083q))) {
            z3 = false;
        }
        boolean z5 = z4 & z3;
        CharSequence charSequence3 = null;
        if (z5) {
            charSequence = this.f2077k;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f2076j.f3189q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z5) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f2076j.f3177e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.f2076j.f3190r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z5) {
                charSequence3 = this.f2076j.f3177e;
            }
            a.Q(this, charSequence3);
            return;
        }
        a.Q(this, charSequence5);
    }

    public C0208j getItemData() {
        return this.f2076j;
    }

    public final void onClick(View view) {
        C0206h hVar = this.f2079m;
        if (hVar != null) {
            hVar.a(this.f2076j);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2082p = e();
        f();
    }

    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i6 = this.f2085s) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i3, i4);
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f2084r;
        if (mode == Integer.MIN_VALUE) {
            i5 = Math.min(size, i7);
        } else {
            i5 = i7;
        }
        if (mode != 1073741824 && i7 > 0 && measuredWidth < i5) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), i4);
        }
        if (isEmpty && this.f2078l != null) {
            super.setPadding((getMeasuredWidth() - this.f2078l.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0199a aVar;
        if (!this.f2076j.hasSubMenu() || (aVar = this.f2080n) == null || !aVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f2083q != z3) {
            this.f2083q = z3;
            C0208j jVar = this.f2076j;
            if (jVar != null) {
                C0207i iVar = jVar.f3186n;
                iVar.f3161k = true;
                iVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2078l = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i3 = this.f2086t;
            if (intrinsicWidth > i3) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i3) / ((float) intrinsicWidth)));
                intrinsicWidth = i3;
            }
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i3) / ((float) intrinsicHeight)));
            } else {
                i3 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i3);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        f();
    }

    public void setItemInvoker(C0206h hVar) {
        this.f2079m = hVar;
    }

    public final void setPadding(int i3, int i4, int i5, int i6) {
        this.f2085s = i3;
        super.setPadding(i3, i4, i5, i6);
    }

    public void setPopupCallback(C0200b bVar) {
        this.f2081o = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2077k = charSequence;
        f();
    }
}
