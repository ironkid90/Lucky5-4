package H1;

import L.k;

public class a extends Exception {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(com.google.android.gms.common.api.Status r3) {
        /*
            r2 = this;
            int r0 = r3.f2826a
            java.lang.String r3 = r3.f2827b
            if (r3 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            java.lang.String r3 = ""
        L_0x0009:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.a.<init>(com.google.android.gms.common.api.Status):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(int i3) {
        super("The service is not started.");
        switch (i3) {
            case k.DOUBLE_FIELD_NUMBER /*7*/:
                super("wakelock requires a foreground activity");
                return;
            default:
                return;
        }
    }
}
