package X0;

import C0.r;
import G0.o;
import K0.c;
import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f1946a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1947b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1948c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1949d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1950e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1951f;

    /* renamed from: g  reason: collision with root package name */
    public final String f1952g;

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z3;
        int i3 = c.f859a;
        if (str == null || str.trim().isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            this.f1947b = str;
            this.f1946a = str2;
            this.f1948c = str3;
            this.f1949d = str4;
            this.f1950e = str5;
            this.f1951f = str6;
            this.f1952g = str7;
            return;
        }
        throw new IllegalStateException("ApplicationId must be set.");
    }

    public static h a(Context context) {
        r rVar = new r(context);
        String I3 = rVar.I("google_app_id");
        if (TextUtils.isEmpty(I3)) {
            return null;
        }
        return new h(I3, rVar.I("google_api_key"), rVar.I("firebase_database_url"), rVar.I("ga_trackingId"), rVar.I("gcm_defaultSenderId"), rVar.I("google_storage_bucket"), rVar.I("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!o.g(this.f1947b, hVar.f1947b) || !o.g(this.f1946a, hVar.f1946a) || !o.g(this.f1948c, hVar.f1948c) || !o.g(this.f1949d, hVar.f1949d) || !o.g(this.f1950e, hVar.f1950e) || !o.g(this.f1951f, hVar.f1951f) || !o.g(this.f1952g, hVar.f1952g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1947b, this.f1946a, this.f1948c, this.f1949d, this.f1950e, this.f1951f, this.f1952g});
    }

    public final String toString() {
        r rVar = new r((Object) this);
        rVar.B(this.f1947b, "applicationId");
        rVar.B(this.f1946a, "apiKey");
        rVar.B(this.f1948c, "databaseUrl");
        rVar.B(this.f1950e, "gcmSenderId");
        rVar.B(this.f1951f, "storageBucket");
        rVar.B(this.f1952g, "projectId");
        return rVar.toString();
    }
}
