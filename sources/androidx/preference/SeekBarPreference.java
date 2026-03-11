package androidx.preference;

import Q.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.ai9poker.app.R;

public class SeekBarPreference extends Preference {

    /* renamed from: m  reason: collision with root package name */
    public final int f2570m;

    /* renamed from: n  reason: collision with root package name */
    public final int f2571n;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f1294i, R.attr.seekBarPreferenceStyle, 0);
        int i3 = obtainStyledAttributes.getInt(3, 0);
        int i4 = obtainStyledAttributes.getInt(1, 100);
        i4 = i4 < i3 ? i3 : i4;
        if (i4 != this.f2570m) {
            this.f2570m = i4;
        }
        int i5 = obtainStyledAttributes.getInt(4, 0);
        if (i5 != this.f2571n) {
            this.f2571n = Math.min(this.f2570m - i3, Math.abs(i5));
        }
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    public final Object c(TypedArray typedArray, int i3) {
        return Integer.valueOf(typedArray.getInt(i3, 0));
    }
}
