package androidx.appcompat.view.menu;

import C0.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import i.C0206h;
import i.C0208j;

public final class ExpandedMenuView extends ListView implements C0206h, AdapterView.OnItemClickListener {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f2087f = {16842964, 16843049};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        f P3 = f.P(context, attributeSet, f2087f, 16842868);
        TypedArray typedArray = (TypedArray) P3.f127g;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(P3.I(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(P3.I(1));
        }
        P3.T();
    }

    public final boolean a(C0208j jVar) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        C0208j jVar = (C0208j) getAdapter().getItem(i3);
        throw null;
    }
}
