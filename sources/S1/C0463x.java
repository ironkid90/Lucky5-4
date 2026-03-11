package s1;

import D0.j;
import H0.a;
import a.C0094a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b2.h;
import java.util.Map;
import n.C0335b;
import n.k;

/* renamed from: s1.x  reason: case insensitive filesystem */
public final class C0463x extends a {
    public static final Parcelable.Creator<C0463x> CREATOR = new j(25);

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f4618a;

    /* renamed from: b  reason: collision with root package name */
    public C0335b f4619b;

    /* renamed from: c  reason: collision with root package name */
    public C0462w f4620c;

    public C0463x(Bundle bundle) {
        this.f4618a = bundle;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [n.b, n.k] */
    public final Map a() {
        if (this.f4619b == null) {
            ? kVar = new k();
            Bundle bundle = this.f4618a;
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!next.startsWith("google.") && !next.startsWith("gcm.") && !next.equals("from") && !next.equals("message_type") && !next.equals("collapse_key")) {
                        kVar.put(next, str);
                    }
                }
            }
            this.f4619b = kVar;
        }
        return this.f4619b;
    }

    public final String b() {
        Bundle bundle = this.f4618a;
        String string = bundle.getString("google.message_id");
        if (string == null) {
            return bundle.getString("message_id");
        }
        return string;
    }

    public final C0462w c() {
        if (this.f4620c == null) {
            Bundle bundle = this.f4618a;
            if (h.y(bundle)) {
                this.f4620c = new C0462w(new h(bundle));
            }
        }
        return this.f4620c;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int W2 = C0094a.W(parcel, 20293);
        C0094a.R(parcel, 2, this.f4618a);
        C0094a.X(parcel, W2);
    }
}
