package r0;

import java.util.Arrays;
import o0.C0355c;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final C0355c f4435a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f4436b;

    public k(C0355c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f4435a = cVar;
            this.f4436b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!this.f4435a.equals(kVar.f4435a)) {
            return false;
        }
        return Arrays.equals(this.f4436b, kVar.f4436b);
    }

    public final int hashCode() {
        return ((this.f4435a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4436b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f4435a + ", bytes=[...]}";
    }
}
