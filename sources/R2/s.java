package R2;

import A2.h;
import A2.i;
import S2.a;
import a.C0094a;
import java.util.Arrays;
import q2.C0400c;

public final class s extends b {

    /* renamed from: j  reason: collision with root package name */
    public final transient byte[][] f1413j;

    /* renamed from: k  reason: collision with root package name */
    public final transient int[] f1414k;

    public s(byte[][] bArr, int[] iArr) {
        super(b.f1368i.f1369f);
        this.f1413j = bArr;
        this.f1414k = iArr;
    }

    public final int b() {
        return this.f1414k[this.f1413j.length - 1];
    }

    public final String c() {
        return new b(p()).c();
    }

    public final int d(byte[] bArr, int i3) {
        i.e(bArr, "other");
        return new b(p()).d(bArr, i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.b() == b() && j(0, bVar, b())) {
                return true;
            }
        }
        return false;
    }

    public final byte[] f() {
        return p();
    }

    public final byte g(int i3) {
        int i4;
        byte[][] bArr = this.f1413j;
        int[] iArr = this.f1414k;
        C0094a.e((long) iArr[bArr.length - 1], (long) i3, 1);
        int e2 = a.e(this, i3);
        if (e2 == 0) {
            i4 = 0;
        } else {
            i4 = iArr[e2 - 1];
        }
        return bArr[e2][(i3 - i4) + iArr[bArr.length + e2]];
    }

    public final int h(byte[] bArr, int i3) {
        i.e(bArr, "other");
        return new b(p()).h(bArr, i3);
    }

    public final int hashCode() {
        int i3 = this.f1370g;
        if (i3 != 0) {
            return i3;
        }
        byte[][] bArr = this.f1413j;
        int length = bArr.length;
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (i4 < length) {
            int[] iArr = this.f1414k;
            int i7 = iArr[length + i4];
            int i8 = iArr[i4];
            byte[] bArr2 = bArr[i4];
            int i9 = (i8 - i6) + i7;
            while (i7 < i9) {
                i5 = (i5 * 31) + bArr2[i7];
                i7++;
            }
            i4++;
            i6 = i8;
        }
        this.f1370g = i5;
        return i5;
    }

    public final boolean j(int i3, b bVar, int i4) {
        int i5;
        i.e(bVar, "other");
        if (i3 < 0 || i3 > b() - i4) {
            return false;
        }
        int i6 = i4 + i3;
        int e2 = a.e(this, i3);
        int i7 = 0;
        while (i3 < i6) {
            int[] iArr = this.f1414k;
            if (e2 == 0) {
                i5 = 0;
            } else {
                i5 = iArr[e2 - 1];
            }
            byte[][] bArr = this.f1413j;
            int i8 = iArr[bArr.length + e2];
            int min = Math.min(i6, (iArr[e2] - i5) + i5) - i3;
            if (!bVar.k(i7, bArr[e2], (i3 - i5) + i8, min)) {
                return false;
            }
            i7 += min;
            i3 += min;
            e2++;
        }
        return true;
    }

    public final boolean k(int i3, byte[] bArr, int i4, int i5) {
        int i6;
        i.e(bArr, "other");
        if (i3 < 0 || i3 > b() - i5 || i4 < 0 || i4 > bArr.length - i5) {
            return false;
        }
        int i7 = i5 + i3;
        int e2 = a.e(this, i3);
        while (i3 < i7) {
            int[] iArr = this.f1414k;
            if (e2 == 0) {
                i6 = 0;
            } else {
                i6 = iArr[e2 - 1];
            }
            byte[][] bArr2 = this.f1413j;
            int i8 = iArr[bArr2.length + e2];
            int min = Math.min(i7, (iArr[e2] - i6) + i6) - i3;
            if (!C0094a.d((i3 - i6) + i8, i4, min, bArr2[e2], bArr)) {
                return false;
            }
            i4 += min;
            i3 += min;
            e2++;
        }
        return true;
    }

    public final b l(int i3, int i4) {
        if (i4 == -1234567890) {
            i4 = b();
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i3 + " < 0").toString());
        } else if (i4 <= b()) {
            int i5 = i4 - i3;
            if (i5 < 0) {
                throw new IllegalArgumentException(h.f("endIndex=", i4, " < beginIndex=", i3).toString());
            } else if (i3 == 0 && i4 == b()) {
                return this;
            } else {
                if (i3 == i4) {
                    return b.f1368i;
                }
                int e2 = a.e(this, i3);
                int e3 = a.e(this, i4 - 1);
                int i6 = e3 + 1;
                byte[][] bArr = this.f1413j;
                i.e(bArr, "<this>");
                android.support.v4.media.session.a.l(i6, bArr.length);
                Object[] copyOfRange = Arrays.copyOfRange(bArr, e2, i6);
                i.d(copyOfRange, "copyOfRange(...)");
                byte[][] bArr2 = (byte[][]) copyOfRange;
                int[] iArr = new int[(bArr2.length * 2)];
                int i7 = 0;
                int[] iArr2 = this.f1414k;
                if (e2 <= e3) {
                    int i8 = e2;
                    int i9 = 0;
                    while (true) {
                        iArr[i9] = Math.min(iArr2[i8] - i3, i5);
                        int i10 = i9 + 1;
                        iArr[i9 + bArr2.length] = iArr2[bArr.length + i8];
                        if (i8 == e3) {
                            break;
                        }
                        i8++;
                        i9 = i10;
                    }
                }
                if (e2 != 0) {
                    i7 = iArr2[e2 - 1];
                }
                int length = bArr2.length;
                iArr[length] = (i3 - i7) + iArr[length];
                return new s(bArr2, iArr);
            }
        } else {
            throw new IllegalArgumentException(("endIndex=" + i4 + " > length(" + b() + ')').toString());
        }
    }

    public final void o(a aVar, int i3) {
        int i4;
        i.e(aVar, "buffer");
        int e2 = a.e(this, 0);
        int i5 = 0;
        while (i5 < i3) {
            int[] iArr = this.f1414k;
            if (e2 == 0) {
                i4 = 0;
            } else {
                i4 = iArr[e2 - 1];
            }
            byte[][] bArr = this.f1413j;
            int i6 = iArr[bArr.length + e2];
            int min = Math.min(i3, (iArr[e2] - i4) + i4) - i5;
            int i7 = (i5 - i4) + i6;
            q qVar = new q(bArr[e2], i7, i7 + min, true);
            q qVar2 = aVar.f1366f;
            if (qVar2 == null) {
                qVar.f1409g = qVar;
                qVar.f1408f = qVar;
                aVar.f1366f = qVar;
            } else {
                q qVar3 = qVar2.f1409g;
                i.b(qVar3);
                qVar3.b(qVar);
            }
            i5 += min;
            e2++;
        }
        aVar.f1367g += (long) i3;
    }

    public final byte[] p() {
        byte[] bArr = new byte[b()];
        byte[][] bArr2 = this.f1413j;
        int length = bArr2.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            int[] iArr = this.f1414k;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            int i8 = i7 - i4;
            C0400c.I(i5, i6, i6 + i8, bArr2[i3], bArr);
            i5 += i8;
            i3++;
            i4 = i7;
        }
        return bArr;
    }

    public final String toString() {
        return new b(p()).toString();
    }
}
