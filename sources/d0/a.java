package D0;

import C0.r;
import L.k;
import a.C0094a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class a extends H0.a {
    public static final Parcelable.Creator<a> CREATOR = new j(0);

    /* renamed from: e  reason: collision with root package name */
    public static final a f188e = new a(0);

    /* renamed from: a  reason: collision with root package name */
    public final int f189a;

    /* renamed from: b  reason: collision with root package name */
    public final int f190b;

    /* renamed from: c  reason: collision with root package name */
    public final PendingIntent f191c;

    /* renamed from: d  reason: collision with root package name */
    public final String f192d;

    public a(int i3, int i4, PendingIntent pendingIntent, String str) {
        this.f189a = i3;
        this.f190b = i4;
        this.f191c = pendingIntent;
        this.f192d = str;
    }

    public static String a(int i3) {
        if (i3 == 99) {
            return "UNFINISHED";
        }
        if (i3 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i3) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case k.FLOAT_FIELD_NUMBER /*2*/:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case k.INTEGER_FIELD_NUMBER /*3*/:
                return "SERVICE_DISABLED";
            case k.LONG_FIELD_NUMBER /*4*/:
                return "SIGN_IN_REQUIRED";
            case k.STRING_FIELD_NUMBER /*5*/:
                return "INVALID_ACCOUNT";
            case k.STRING_SET_FIELD_NUMBER /*6*/:
                return "RESOLUTION_REQUIRED";
            case k.DOUBLE_FIELD_NUMBER /*7*/:
                return "NETWORK_ERROR";
            case k.BYTES_FIELD_NUMBER /*8*/:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i3) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i3 + ")";
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (D0.a) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof D0.a
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            D0.a r5 = (D0.a) r5
            int r1 = r5.f190b
            int r3 = r4.f190b
            if (r3 != r1) goto L_0x0027
            android.app.PendingIntent r1 = r4.f191c
            android.app.PendingIntent r3 = r5.f191c
            boolean r1 = G0.o.g(r1, r3)
            if (r1 == 0) goto L_0x0027
            java.lang.String r1 = r4.f192d
            java.lang.String r5 = r5.f192d
            boolean r5 = G0.o.g(r1, r5)
            if (r5 == 0) goto L_0x0027
            return r0
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f190b), this.f191c, this.f192d});
    }

    public final String toString() {
        r rVar = new r((Object) this);
        rVar.B(a(this.f190b), "statusCode");
        rVar.B(this.f191c, "resolution");
        rVar.B(this.f192d, "message");
        return rVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int W2 = C0094a.W(parcel, 20293);
        C0094a.Y(parcel, 1, 4);
        parcel.writeInt(this.f189a);
        C0094a.Y(parcel, 2, 4);
        parcel.writeInt(this.f190b);
        C0094a.T(parcel, 3, this.f191c, i3);
        C0094a.U(parcel, 4, this.f192d);
        C0094a.X(parcel, W2);
    }

    public a(int i3) {
        this(1, i3, (PendingIntent) null, (String) null);
    }

    public a(int i3, PendingIntent pendingIntent) {
        this(1, i3, pendingIntent, (String) null);
    }
}
