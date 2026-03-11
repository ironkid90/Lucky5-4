package androidx.preference;

import D0.g;
import Q.a;
import Q.b;
import a.C0094a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.ai9poker.app.R;

public class ListPreference extends DialogPreference {

    /* renamed from: m  reason: collision with root package name */
    public final CharSequence[] f2561m;

    /* renamed from: n  reason: collision with root package name */
    public final String f2562n;

    public ListPreference(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f1289d, i3, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f2561m = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (g.f206h == null) {
                g.f206h = new g(5, false);
            }
            this.f2569l = g.f206h;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b.f1291f, i3, 0);
        this.f2562n = C0094a.A(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    public final CharSequence a() {
        a aVar = this.f2569l;
        if (aVar != null) {
            return aVar.d(this);
        }
        CharSequence a2 = super.a();
        String str = this.f2562n;
        if (str == null) {
            return a2;
        }
        String format = String.format(str, new Object[]{""});
        if (TextUtils.equals(format, a2)) {
            return a2;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    public final Object c(TypedArray typedArray, int i3) {
        return typedArray.getString(i3);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0094a.u(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
