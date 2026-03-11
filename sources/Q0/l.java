package q0;

import java.util.ArrayList;

public final class l extends s {

    /* renamed from: a  reason: collision with root package name */
    public final long f4368a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4369b;

    /* renamed from: c  reason: collision with root package name */
    public final j f4370c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f4371d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4372e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f4373f;

    public l(long j3, long j4, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f4383f;
        this.f4368a = j3;
        this.f4369b = j4;
        this.f4370c = jVar;
        this.f4371d = num;
        this.f4372e = str;
        this.f4373f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        if (this.f4368a == lVar.f4368a) {
            if (this.f4369b == lVar.f4369b) {
                if (this.f4370c.equals(lVar.f4370c)) {
                    Integer num = lVar.f4371d;
                    Integer num2 = this.f4371d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = lVar.f4372e;
                        String str2 = this.f4372e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (this.f4373f.equals(lVar.f4373f)) {
                                w wVar = w.f4383f;
                                if (wVar.equals(wVar)) {
                                    return true;
                                }
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
        long j3 = this.f4368a;
        long j4 = this.f4369b;
        int hashCode = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ this.f4370c.hashCode()) * 1000003;
        int i4 = 0;
        Integer num = this.f4371d;
        if (num == null) {
            i3 = 0;
        } else {
            i3 = num.hashCode();
        }
        int i5 = (hashCode ^ i3) * 1000003;
        String str = this.f4372e;
        if (str != null) {
            i4 = str.hashCode();
        }
        return ((((i5 ^ i4) * 1000003) ^ this.f4373f.hashCode()) * 1000003) ^ w.f4383f.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f4368a + ", requestUptimeMs=" + this.f4369b + ", clientInfo=" + this.f4370c + ", logSource=" + this.f4371d + ", logSourceName=" + this.f4372e + ", logEvents=" + this.f4373f + ", qosTier=" + w.f4383f + "}";
    }
}
