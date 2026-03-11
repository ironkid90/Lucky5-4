package androidx.preference;

import android.content.res.TypedArray;

public class EditTextPreference extends DialogPreference {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903182(0x7f03008e, float:1.7413175E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = a.C0094a.u(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = Q.b.f1288c
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = r4.getBoolean(r2, r2)
            boolean r5 = r4.getBoolean(r2, r5)
            if (r5 == 0) goto L_0x002e
            j1.e r5 = j1.e.f3847g
            if (r5 != 0) goto L_0x002a
            j1.e r5 = new j1.e
            r0 = 4
            r5.<init>((int) r0)
            j1.e.f3847g = r5
        L_0x002a:
            j1.e r5 = j1.e.f3847g
            r3.f2569l = r5
        L_0x002e:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final Object c(TypedArray typedArray, int i3) {
        return typedArray.getString(i3);
    }
}
