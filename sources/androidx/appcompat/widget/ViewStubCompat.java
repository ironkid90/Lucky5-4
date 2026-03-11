package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.C0153a;
import j.t0;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: f  reason: collision with root package name */
    public int f2280f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f2281g;

    /* renamed from: h  reason: collision with root package name */
    public WeakReference f2282h;

    /* renamed from: i  reason: collision with root package name */
    public LayoutInflater f2283i;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0153a.v, 0, 0);
        this.f2281g = obtainStyledAttributes.getResourceId(2, -1);
        this.f2280f = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final void dispatchDraw(Canvas canvas) {
    }

    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f2281g;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2283i;
    }

    public int getLayoutResource() {
        return this.f2280f;
    }

    public final void onMeasure(int i3, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i3) {
        this.f2281g = i3;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2283i = layoutInflater;
    }

    public void setLayoutResource(int i3) {
        this.f2280f = i3;
    }

    public void setVisibility(int i3) {
        WeakReference weakReference = this.f2282h;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i3);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i3);
        if (i3 == 0 || i3 == 4) {
            ViewParent parent = getParent();
            if (!(parent instanceof ViewGroup)) {
                throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
            } else if (this.f2280f != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f2283i;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f2280f, viewGroup, false);
                int i4 = this.f2281g;
                if (i4 != -1) {
                    inflate.setId(i4);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f2282h = new WeakReference(inflate);
            } else {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
        }
    }

    public void setOnInflateListener(t0 t0Var) {
    }
}
