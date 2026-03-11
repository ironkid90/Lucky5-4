package androidx.preference;

import Q.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;

public abstract class PreferenceGroup extends Preference {
    public PreferenceGroup(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        new Handler(Looper.getMainLooper());
        new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f1292g, i3, 0);
        obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1) && obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE)) != Integer.MAX_VALUE && TextUtils.isEmpty(this.f2567j)) {
            Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
        }
        obtainStyledAttributes.recycle();
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
