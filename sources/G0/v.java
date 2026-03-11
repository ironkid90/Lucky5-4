package G0;

import android.net.Uri;
import java.util.Arrays;

public final class v {

    /* renamed from: d  reason: collision with root package name */
    public static final Uri f448d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    public final String f449a;

    /* renamed from: b  reason: collision with root package name */
    public final String f450b = "com.google.android.gms";

    /* renamed from: c  reason: collision with root package name */
    public final boolean f451c;

    public v(String str, boolean z3) {
        o.b(str);
        this.f449a = str;
        o.b("com.google.android.gms");
        this.f451c = z3;
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent a(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ConnectionStatusConfig"
            r1 = 0
            java.lang.String r2 = r6.f449a
            if (r2 == 0) goto L_0x005a
            boolean r3 = r6.f451c
            if (r3 == 0) goto L_0x004c
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "serviceActionBundleKey"
            r3.putString(r4, r2)
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0022 }
            android.net.Uri r4 = f448d     // Catch:{ IllegalArgumentException -> 0x0022 }
            java.lang.String r5 = "serviceIntentCall"
            android.os.Bundle r7 = r7.call(r4, r5, r1, r3)     // Catch:{ IllegalArgumentException -> 0x0022 }
            goto L_0x0031
        L_0x0022:
            r7 = move-exception
            java.lang.String r3 = "Dynamic intent resolution failed: "
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r3.concat(r7)
            android.util.Log.w(r0, r7)
            r7 = r1
        L_0x0031:
            if (r7 != 0) goto L_0x0034
            goto L_0x003d
        L_0x0034:
            java.lang.String r1 = "serviceResponseIntentKey"
            android.os.Parcelable r7 = r7.getParcelable(r1)
            r1 = r7
            android.content.Intent r1 = (android.content.Intent) r1
        L_0x003d:
            if (r1 != 0) goto L_0x004c
            java.lang.String r7 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Dynamic lookup for intent failed for action: "
            java.lang.String r7 = r3.concat(r7)
            android.util.Log.w(r0, r7)
        L_0x004c:
            if (r1 != 0) goto L_0x0063
            android.content.Intent r7 = new android.content.Intent
            r7.<init>(r2)
            java.lang.String r0 = r6.f450b
            android.content.Intent r7 = r7.setPackage(r0)
            return r7
        L_0x005a:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            android.content.Intent r1 = r7.setComponent(r1)
        L_0x0063:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.v.a(android.content.Context):android.content.Intent");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (!o.g(this.f449a, vVar.f449a) || !o.g(this.f450b, vVar.f450b) || !o.g((Object) null, (Object) null) || this.f451c != vVar.f451c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f449a, this.f450b, null, 4225, Boolean.valueOf(this.f451c)});
    }

    public final String toString() {
        String str = this.f449a;
        if (str != null) {
            return str;
        }
        o.e((Object) null);
        throw null;
    }
}
