package com.google.android.gms.common.api;

import A2.h;
import C0.r;
import D0.j;
import H0.a;
import L.k;
import a.C0094a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new j(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f2826a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2827b;

    /* renamed from: c  reason: collision with root package name */
    public final PendingIntent f2828c;

    /* renamed from: d  reason: collision with root package name */
    public final D0.a f2829d;

    public Status(int i3, String str, PendingIntent pendingIntent, D0.a aVar) {
        this.f2826a = i3;
        this.f2827b = str;
        this.f2828c = pendingIntent;
        this.f2829d = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (com.google.android.gms.common.api.Status) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.common.api.Status
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.google.android.gms.common.api.Status r4 = (com.google.android.gms.common.api.Status) r4
            int r0 = r4.f2826a
            int r2 = r3.f2826a
            if (r2 != r0) goto L_0x002e
            java.lang.String r0 = r3.f2827b
            java.lang.String r2 = r4.f2827b
            boolean r0 = G0.o.g(r0, r2)
            if (r0 == 0) goto L_0x002e
            android.app.PendingIntent r0 = r3.f2828c
            android.app.PendingIntent r2 = r4.f2828c
            boolean r0 = G0.o.g(r0, r2)
            if (r0 == 0) goto L_0x002e
            D0.a r0 = r3.f2829d
            D0.a r4 = r4.f2829d
            boolean r4 = G0.o.g(r0, r4)
            if (r4 == 0) goto L_0x002e
            r4 = 1
            return r4
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.Status.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2826a), this.f2827b, this.f2828c, this.f2829d});
    }

    public final String toString() {
        r rVar = new r((Object) this);
        String str = this.f2827b;
        if (str == null) {
            int i3 = this.f2826a;
            switch (i3) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case k.FLOAT_FIELD_NUMBER:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case k.INTEGER_FIELD_NUMBER:
                    str = "SERVICE_DISABLED";
                    break;
                case k.LONG_FIELD_NUMBER:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case k.STRING_FIELD_NUMBER:
                    str = "INVALID_ACCOUNT";
                    break;
                case k.STRING_SET_FIELD_NUMBER:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case k.DOUBLE_FIELD_NUMBER:
                    str = "NETWORK_ERROR";
                    break;
                case k.BYTES_FIELD_NUMBER:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
                default:
                    str = h.e("unknown status code: ", i3);
                    break;
            }
        }
        rVar.B(str, "statusCode");
        rVar.B(this.f2828c, "resolution");
        return rVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int W2 = C0094a.W(parcel, 20293);
        C0094a.Y(parcel, 1, 4);
        parcel.writeInt(this.f2826a);
        C0094a.U(parcel, 2, this.f2827b);
        C0094a.T(parcel, 3, this.f2828c, i3);
        C0094a.T(parcel, 4, this.f2829d, i3);
        C0094a.X(parcel, W2);
    }
}
