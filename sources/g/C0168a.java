package g;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: g.a  reason: case insensitive filesystem */
public final class C0168a implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    public Locale f2960a;

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f2960a);
        }
        return null;
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z3, int i3, Rect rect) {
    }
}
