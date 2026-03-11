package s1;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: s1.C  reason: case insensitive filesystem */
public final class C0430C {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f4491d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    public final String f4492a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4493b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4494c;

    public C0430C(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !f4491d.matcher(str3).matches()) {
            throw new IllegalArgumentException("Invalid topic name: " + str3 + " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}.");
        }
        this.f4492a = str3;
        this.f4493b = str;
        this.f4494c = str + "!" + str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0430C)) {
            return false;
        }
        C0430C c3 = (C0430C) obj;
        if (!this.f4492a.equals(c3.f4492a) || !this.f4493b.equals(c3.f4493b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4493b, this.f4492a});
    }
}
