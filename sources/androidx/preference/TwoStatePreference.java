package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public abstract class TwoStatePreference extends Preference {
    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final Object c(TypedArray typedArray, int i3) {
        return Boolean.valueOf(typedArray.getBoolean(i3, false));
    }
}
