package o1;

import L.j;

/* renamed from: o1.a  reason: case insensitive filesystem */
public final class C0358a {

    /* renamed from: a  reason: collision with root package name */
    public final String f4146a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4147b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4148c;

    /* renamed from: d  reason: collision with root package name */
    public final b f4149d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4150e;

    public C0358a(String str, String str2, String str3, b bVar, int i3) {
        this.f4146a = str;
        this.f4147b = str2;
        this.f4148c = str3;
        this.f4149d = bVar;
        this.f4150e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0358a)) {
            return false;
        }
        C0358a aVar = (C0358a) obj;
        String str = this.f4146a;
        if (str != null ? str.equals(aVar.f4146a) : aVar.f4146a == null) {
            String str2 = this.f4147b;
            if (str2 != null ? str2.equals(aVar.f4147b) : aVar.f4147b == null) {
                String str3 = this.f4148c;
                if (str3 != null ? str3.equals(aVar.f4148c) : aVar.f4148c == null) {
                    b bVar = this.f4149d;
                    if (bVar != null ? bVar.equals(aVar.f4149d) : aVar.f4149d == null) {
                        int i3 = this.f4150e;
                        if (i3 == 0) {
                            if (aVar.f4150e == 0) {
                                return true;
                            }
                        } else if (j.a(i3, aVar.f4150e)) {
                            return true;
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
        int i6;
        int i7 = 0;
        String str = this.f4146a;
        if (str == null) {
            i3 = 0;
        } else {
            i3 = str.hashCode();
        }
        int i8 = (i3 ^ 1000003) * 1000003;
        String str2 = this.f4147b;
        if (str2 == null) {
            i4 = 0;
        } else {
            i4 = str2.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        String str3 = this.f4148c;
        if (str3 == null) {
            i5 = 0;
        } else {
            i5 = str3.hashCode();
        }
        int i10 = (i9 ^ i5) * 1000003;
        b bVar = this.f4149d;
        if (bVar == null) {
            i6 = 0;
        } else {
            i6 = bVar.hashCode();
        }
        int i11 = (i10 ^ i6) * 1000003;
        int i12 = this.f4150e;
        if (i12 != 0) {
            i7 = j.b(i12);
        }
        return i7 ^ i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f4146a);
        sb.append(", fid=");
        sb.append(this.f4147b);
        sb.append(", refreshToken=");
        sb.append(this.f4148c);
        sb.append(", authToken=");
        sb.append(this.f4149d);
        sb.append(", responseCode=");
        int i3 = this.f4150e;
        if (i3 == 1) {
            str = "OK";
        } else if (i3 != 2) {
            str = "null";
        } else {
            str = "BAD_CONFIG";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
