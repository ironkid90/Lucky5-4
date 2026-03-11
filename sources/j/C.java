package j;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import e.C0153a;

public class C extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public final float f3574a;

    /* renamed from: b  reason: collision with root package name */
    public int f3575b;

    public C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3575b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0153a.f2926j);
        this.f3574a = obtainStyledAttributes.getFloat(3, 0.0f);
        this.f3575b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public C(int i3) {
        super(i3, -2);
        this.f3575b = -1;
        this.f3574a = 0.0f;
    }

    public C(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3575b = -1;
    }
}
