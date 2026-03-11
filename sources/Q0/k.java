package q0;

import java.util.Arrays;

public final class k extends r {

    /* renamed from: a  reason: collision with root package name */
    public final long f4361a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f4362b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4363c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f4364d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4365e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4366f;

    /* renamed from: g  reason: collision with root package name */
    public final n f4367g;

    public k(long j3, Integer num, long j4, byte[] bArr, String str, long j5, n nVar) {
        this.f4361a = j3;
        this.f4362b = num;
        this.f4363c = j4;
        this.f4364d = bArr;
        this.f4365e = str;
        this.f4366f = j5;
        this.f4367g = nVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        k kVar = (k) rVar;
        if (this.f4361a == kVar.f4361a && ((num = this.f4362b) != null ? num.equals(kVar.f4362b) : kVar.f4362b == null)) {
            if (this.f4363c == kVar.f4363c) {
                if (rVar instanceof k) {
                    bArr = ((k) rVar).f4364d;
                } else {
                    bArr = kVar.f4364d;
                }
                if (Arrays.equals(this.f4364d, bArr)) {
                    String str = kVar.f4365e;
                    String str2 = this.f4365e;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f4366f == kVar.f4366f) {
                            n nVar = kVar.f4367g;
                            n nVar2 = this.f4367g;
                            if (nVar2 == null) {
                                if (nVar == null) {
                                    return true;
                                }
                            } else if (nVar2.equals(nVar)) {
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
        long j3 = this.f4361a;
        int i5 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        int i6 = 0;
        Integer num = this.f4362b;
        if (num == null) {
            i3 = 0;
        } else {
            i3 = num.hashCode();
        }
        long j4 = this.f4363c;
        int hashCode = (((((i5 ^ i3) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f4364d)) * 1000003;
        String str = this.f4365e;
        if (str == null) {
            i4 = 0;
        } else {
            i4 = str.hashCode();
        }
        long j5 = this.f4366f;
        int i7 = (((hashCode ^ i4) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        n nVar = this.f4367g;
        if (nVar != null) {
            i6 = nVar.hashCode();
        }
        return i7 ^ i6;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f4361a + ", eventCode=" + this.f4362b + ", eventUptimeMs=" + this.f4363c + ", sourceExtension=" + Arrays.toString(this.f4364d) + ", sourceExtensionJsonProto3=" + this.f4365e + ", timezoneOffsetSeconds=" + this.f4366f + ", networkConnectionInfo=" + this.f4367g + "}";
    }
}
