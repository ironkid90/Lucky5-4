package androidx.preference;

import Q.a;
import Q.b;
import a.C0094a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.ai9poker.app.R;

public class Preference implements Comparable<Preference> {

    /* renamed from: f  reason: collision with root package name */
    public final Context f2563f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2564g;

    /* renamed from: h  reason: collision with root package name */
    public final CharSequence f2565h;

    /* renamed from: i  reason: collision with root package name */
    public final CharSequence f2566i;

    /* renamed from: j  reason: collision with root package name */
    public final String f2567j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f2568k;

    /* renamed from: l  reason: collision with root package name */
    public a f2569l;

    public Preference(Context context, AttributeSet attributeSet, int i3) {
        this.f2564g = Integer.MAX_VALUE;
        this.f2563f = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f1291f, i3, 0);
        obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.f2567j = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f2565h = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f2566i = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f2564g = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        if (obtainStyledAttributes.getString(22) == null) {
            obtainStyledAttributes.getString(13);
        }
        obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z3 = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        C0094a.A(obtainStyledAttributes, 19, 10);
        obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z3));
        obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z3));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f2568k = c(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f2568k = c(obtainStyledAttributes, 11);
        }
        obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        if (obtainStyledAttributes.hasValue(32)) {
            obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    public CharSequence a() {
        a aVar = this.f2569l;
        if (aVar != null) {
            return aVar.d(this);
        }
        return this.f2566i;
    }

    public void b() {
    }

    public Object c(TypedArray typedArray, int i3) {
        return null;
    }

    public final int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i3 = preference.f2564g;
        int i4 = this.f2564g;
        if (i4 != i3) {
            return i4 - i3;
        }
        CharSequence charSequence = preference.f2565h;
        CharSequence charSequence2 = this.f2565h;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f2565h;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence a2 = a();
        if (!TextUtils.isEmpty(a2)) {
            sb.append(a2);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0094a.u(context, R.attr.preferenceStyle, 16842894));
    }
}
