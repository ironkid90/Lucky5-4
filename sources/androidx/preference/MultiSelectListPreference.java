package androidx.preference;

import android.content.res.TypedArray;
import java.util.HashSet;

public class MultiSelectListPreference extends DialogPreference {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903157(0x7f030075, float:1.7413124E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = a.C0094a.u(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            int[] r1 = Q.b.f1290e
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 2
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L_0x0023
            r4.getTextArray(r2)
        L_0x0023:
            r5 = 3
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L_0x002e
            r5 = 1
            r4.getTextArray(r5)
        L_0x002e:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final Object c(TypedArray typedArray, int i3) {
        CharSequence[] textArray = typedArray.getTextArray(i3);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
