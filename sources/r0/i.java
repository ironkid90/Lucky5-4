package r0;

import C0.f;
import android.util.Base64;
import java.util.Arrays;
import o0.C0356d;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f4426a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f4427b;

    /* renamed from: c  reason: collision with root package name */
    public final C0356d f4428c;

    public i(String str, byte[] bArr, C0356d dVar) {
        this.f4426a = str;
        this.f4427b = bArr;
        this.f4428c = dVar;
    }

    public static f a() {
        f fVar = new f(22, false);
        fVar.f129i = C0356d.f4142f;
        return fVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.f4426a.equals(iVar.f4426a) || !Arrays.equals(this.f4427b, iVar.f4427b) || !this.f4428c.equals(iVar.f4428c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f4426a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4427b)) * 1000003) ^ this.f4428c.hashCode();
    }

    public final String toString() {
        String str;
        byte[] bArr = this.f4427b;
        if (bArr == null) {
            str = "";
        } else {
            str = Base64.encodeToString(bArr, 2);
        }
        return "TransportContext(" + this.f4426a + ", " + this.f4428c + ", " + str + ")";
    }
}
