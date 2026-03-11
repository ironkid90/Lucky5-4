package n1;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: n1.c  reason: case insensitive filesystem */
public final class C0347c {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f4111c = {"*", "FCM", "GCM", ""};

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f4112a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4113b;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        if (r1.isEmpty() != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0347c(X0.g r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.a()
            java.lang.String r0 = "com.google.android.gms.appid"
            r1 = 0
            android.content.Context r2 = r4.f1936a
            android.content.SharedPreferences r0 = r2.getSharedPreferences(r0, r1)
            r3.f4112a = r0
            r4.a()
            X0.h r0 = r4.f1938c
            java.lang.String r1 = r0.f1950e
            if (r1 == 0) goto L_0x001b
            goto L_0x0048
        L_0x001b:
            r4.a()
            java.lang.String r4 = "1:"
            java.lang.String r1 = r0.f1947b
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L_0x0031
            java.lang.String r4 = "2:"
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L_0x0031
            goto L_0x0048
        L_0x0031:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r1.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L_0x003e
        L_0x003c:
            r1 = r2
            goto L_0x0048
        L_0x003e:
            r0 = 1
            r1 = r4[r0]
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x0048
            goto L_0x003c
        L_0x0048:
            r3.f4113b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C0347c.<init>(X0.g):void");
    }

    public final String a() {
        String str;
        PublicKey publicKey;
        synchronized (this.f4112a) {
            str = null;
            String string = this.f4112a.getString("|S||P|", (String) null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e2) {
                Log.w("ContentValues", "Invalid key stored " + e2);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
        }
        return str;
    }
}
