package androidx.preference;

import Q.b;
import a.C0094a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.ai9poker.app.R;

public abstract class DialogPreference extends Preference {
    public DialogPreference(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f1287b, i3, 0);
        C0094a.A(obtainStyledAttributes, 9, 0);
        C0094a.A(obtainStyledAttributes, 8, 1);
        if (obtainStyledAttributes.getDrawable(6) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        C0094a.A(obtainStyledAttributes, 11, 3);
        C0094a.A(obtainStyledAttributes, 10, 4);
        obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0094a.u(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
