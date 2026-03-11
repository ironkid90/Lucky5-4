package androidx.datastore.preferences.protobuf;

import A2.h;
import android.support.v4.media.session.a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.g  reason: case insensitive filesystem */
public class C0103g implements Iterable, Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final C0103g f2423h = new C0103g(C0120y.f2498b);

    /* renamed from: i  reason: collision with root package name */
    public static final C0101e f2424i;

    /* renamed from: f  reason: collision with root package name */
    public int f2425f = 0;

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f2426g;

    static {
        C0101e eVar;
        if (C0099c.a()) {
            eVar = new C0101e(1);
        } else {
            eVar = new C0101e(0);
        }
        f2424i = eVar;
    }

    public C0103g(byte[] bArr) {
        bArr.getClass();
        this.f2426g = bArr;
    }

    public static int b(int i3, int i4, int i5) {
        int i6 = i4 - i3;
        if ((i3 | i4 | i6 | (i5 - i4)) >= 0) {
            return i6;
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i3 + " < 0");
        } else if (i4 < i3) {
            throw new IndexOutOfBoundsException(h.f("Beginning index larger than ending index: ", i3, ", ", i4));
        } else {
            throw new IndexOutOfBoundsException(h.f("End index: ", i4, " >= ", i5));
        }
    }

    public static C0103g c(byte[] bArr, int i3, int i4) {
        byte[] bArr2;
        b(i3, i3 + i4, bArr.length);
        switch (f2424i.f2419a) {
            case 0:
                bArr2 = Arrays.copyOfRange(bArr, i3, i4 + i3);
                break;
            default:
                bArr2 = new byte[i4];
                System.arraycopy(bArr, i3, bArr2, 0, i4);
                break;
        }
        return new C0103g(bArr2);
    }

    public byte a(int i3) {
        return this.f2426g[i3];
    }

    public void d(byte[] bArr, int i3) {
        System.arraycopy(this.f2426g, 0, bArr, 0, i3);
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0103g) || size() != ((C0103g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0103g)) {
            return obj.equals(this);
        }
        C0103g gVar = (C0103g) obj;
        int i3 = this.f2425f;
        int i4 = gVar.f2425f;
        if (i3 != 0 && i4 != 0 && i3 != i4) {
            return false;
        }
        int size = size();
        if (size > gVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        } else if (size <= gVar.size()) {
            int e2 = e() + size;
            int e3 = e();
            int e4 = gVar.e();
            while (e3 < e2) {
                if (this.f2426g[e3] != gVar.f2426g[e4]) {
                    return false;
                }
                e3++;
                e4++;
            }
            return true;
        } else {
            throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + gVar.size());
        }
    }

    public byte f(int i3) {
        return this.f2426g[i3];
    }

    public final int hashCode() {
        int i3 = this.f2425f;
        if (i3 == 0) {
            int size = size();
            int e2 = e();
            int i4 = size;
            for (int i5 = e2; i5 < e2 + size; i5++) {
                i4 = (i4 * 31) + this.f2426g[i5];
            }
            if (i4 == 0) {
                i3 = 1;
            } else {
                i3 = i4;
            }
            this.f2425f = i3;
        }
        return i3;
    }

    public final Iterator iterator() {
        return new C0100d(this);
    }

    public int size() {
        return this.f2426g.length;
    }

    public final String toString() {
        String str;
        C0103g gVar;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            str = a.q(this);
        } else {
            StringBuilder sb = new StringBuilder();
            int b3 = b(0, 47, size());
            if (b3 == 0) {
                gVar = f2423h;
            } else {
                gVar = new C0102f(this.f2426g, e(), b3);
            }
            sb.append(a.q(gVar));
            sb.append("...");
            str = sb.toString();
        }
        return "<ByteString@" + hexString + " size=" + size + " contents=\"" + str + "\">";
    }
}
