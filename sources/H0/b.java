package H0;

import java.util.Arrays;

public class b extends RuntimeException {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(java.lang.String r3, android.os.Parcel r4) {
        /*
            r2 = this;
            int r0 = r4.dataPosition()
            int r4 = r4.dataSize()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " Parcel: pos="
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = " size="
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.b.<init>(java.lang.String, android.os.Parcel):void");
    }

    public b(String str, String[] strArr, String[] strArr2) {
        super("Could not find '" + str + "'. Looked for: " + Arrays.toString(strArr) + ", but only found: " + Arrays.toString(strArr2) + ".");
    }
}
