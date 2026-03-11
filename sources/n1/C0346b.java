package n1;

import L.j;

/* renamed from: n1.b  reason: case insensitive filesystem */
public final class C0346b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4104a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4105b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4106c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4107d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4108e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4109f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4110g;

    public C0346b(String str, int i3, String str2, String str3, long j3, long j4, String str4) {
        this.f4104a = str;
        this.f4105b = i3;
        this.f4106c = str2;
        this.f4107d = str3;
        this.f4108e = j3;
        this.f4109f = j4;
        this.f4110g = str4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [n1.a, java.lang.Object] */
    public final C0345a a() {
        ? obj = new Object();
        obj.f4097a = this.f4104a;
        obj.f4098b = this.f4105b;
        obj.f4099c = this.f4106c;
        obj.f4100d = this.f4107d;
        obj.f4101e = Long.valueOf(this.f4108e);
        obj.f4102f = Long.valueOf(this.f4109f);
        obj.f4103g = this.f4110g;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0346b)) {
            return false;
        }
        C0346b bVar = (C0346b) obj;
        String str = this.f4104a;
        if (str != null ? str.equals(bVar.f4104a) : bVar.f4104a == null) {
            if (j.a(this.f4105b, bVar.f4105b)) {
                String str2 = bVar.f4106c;
                String str3 = this.f4106c;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = bVar.f4107d;
                    String str5 = this.f4107d;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.f4108e == bVar.f4108e && this.f4109f == bVar.f4109f) {
                            String str6 = bVar.f4110g;
                            String str7 = this.f4110g;
                            if (str7 == null) {
                                if (str6 == null) {
                                    return true;
                                }
                            } else if (str7.equals(str6)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        String str = this.f4104a;
        if (str == null) {
            i3 = 0;
        } else {
            i3 = str.hashCode();
        }
        int b3 = (((i3 ^ 1000003) * 1000003) ^ j.b(this.f4105b)) * 1000003;
        String str2 = this.f4106c;
        if (str2 == null) {
            i4 = 0;
        } else {
            i4 = str2.hashCode();
        }
        int i7 = (b3 ^ i4) * 1000003;
        String str3 = this.f4107d;
        if (str3 == null) {
            i5 = 0;
        } else {
            i5 = str3.hashCode();
        }
        long j3 = this.f4108e;
        long j4 = this.f4109f;
        int i8 = (((((i7 ^ i5) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        String str4 = this.f4110g;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        return i6 ^ i8;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f4104a);
        sb.append(", registrationStatus=");
        int i3 = this.f4105b;
        if (i3 == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i3 == 2) {
            str = "NOT_GENERATED";
        } else if (i3 == 3) {
            str = "UNREGISTERED";
        } else if (i3 == 4) {
            str = "REGISTERED";
        } else if (i3 != 5) {
            str = "null";
        } else {
            str = "REGISTER_ERROR";
        }
        sb.append(str);
        sb.append(", authToken=");
        sb.append(this.f4106c);
        sb.append(", refreshToken=");
        sb.append(this.f4107d);
        sb.append(", expiresInSecs=");
        sb.append(this.f4108e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f4109f);
        sb.append(", fisError=");
        sb.append(this.f4110g);
        sb.append("}");
        return sb.toString();
    }
}
