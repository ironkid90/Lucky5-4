package R2;

import A2.i;
import S2.a;
import a.C0094a;
import java.io.Serializable;
import java.util.Arrays;

public class b implements Serializable, Comparable {

    /* renamed from: i  reason: collision with root package name */
    public static final b f1368i = new b(new byte[0]);

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f1369f;

    /* renamed from: g  reason: collision with root package name */
    public transient int f1370g;

    /* renamed from: h  reason: collision with root package name */
    public transient String f1371h;

    public b(byte[] bArr) {
        i.e(bArr, "data");
        this.f1369f = bArr;
    }

    public static int e(b bVar, b bVar2) {
        bVar.getClass();
        i.e(bVar2, "other");
        return bVar.d(bVar2.f1369f, 0);
    }

    public static int i(b bVar, b bVar2) {
        bVar.getClass();
        i.e(bVar2, "other");
        return bVar.h(bVar2.f1369f, -1234567890);
    }

    public static /* synthetic */ b m(b bVar, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i3 = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = -1234567890;
        }
        return bVar.l(i3, i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r0 < r1) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r7 < r8) goto L_0x002a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compareTo(R2.b r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            A2.i.e(r10, r0)
            int r0 = r9.b()
            int r1 = r10.b()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002e
            byte r7 = r9.g(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.g(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x002c
        L_0x002a:
            r3 = r5
            goto L_0x0034
        L_0x002c:
            r3 = r6
            goto L_0x0034
        L_0x002e:
            if (r0 != r1) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            if (r0 >= r1) goto L_0x002c
            goto L_0x002a
        L_0x0034:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.b.compareTo(R2.b):int");
    }

    public int b() {
        return this.f1369f.length;
    }

    public String c() {
        byte[] bArr = this.f1369f;
        char[] cArr = new char[(bArr.length * 2)];
        int i3 = 0;
        for (byte b3 : bArr) {
            int i4 = i3 + 1;
            char[] cArr2 = a.f1527a;
            cArr[i3] = cArr2[(b3 >> 4) & 15];
            i3 += 2;
            cArr[i4] = cArr2[b3 & 15];
        }
        return new String(cArr);
    }

    public int d(byte[] bArr, int i3) {
        i.e(bArr, "other");
        byte[] bArr2 = this.f1369f;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i3, 0);
        if (max <= length) {
            while (!C0094a.d(max, 0, bArr.length, bArr2, bArr)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int b3 = bVar.b();
            byte[] bArr = this.f1369f;
            if (b3 == bArr.length && bVar.k(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte[] f() {
        return this.f1369f;
    }

    public byte g(int i3) {
        return this.f1369f[i3];
    }

    public int h(byte[] bArr, int i3) {
        i.e(bArr, "other");
        if (i3 == -1234567890) {
            i3 = b();
        }
        byte[] bArr2 = this.f1369f;
        for (int min = Math.min(i3, bArr2.length - bArr.length); -1 < min; min--) {
            if (C0094a.d(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public int hashCode() {
        int i3 = this.f1370g;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = Arrays.hashCode(this.f1369f);
        this.f1370g = hashCode;
        return hashCode;
    }

    public boolean j(int i3, b bVar, int i4) {
        i.e(bVar, "other");
        return bVar.k(0, this.f1369f, i3, i4);
    }

    public boolean k(int i3, byte[] bArr, int i4, int i5) {
        i.e(bArr, "other");
        if (i3 >= 0) {
            byte[] bArr2 = this.f1369f;
            if (i3 > bArr2.length - i5 || i4 < 0 || i4 > bArr.length - i5 || !C0094a.d(i3, i4, i5, bArr2, bArr)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public b l(int i3, int i4) {
        if (i4 == -1234567890) {
            i4 = b();
        }
        if (i3 >= 0) {
            byte[] bArr = this.f1369f;
            if (i4 > bArr.length) {
                throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
            } else if (i4 - i3 < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            } else if (i3 == 0 && i4 == bArr.length) {
                return this;
            } else {
                android.support.v4.media.session.a.l(i4, bArr.length);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i3, i4);
                i.d(copyOfRange, "copyOfRange(...)");
                return new b(copyOfRange);
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    public final String n() {
        String str = this.f1371h;
        if (str != null) {
            return str;
        }
        byte[] f3 = f();
        i.e(f3, "<this>");
        String str2 = new String(f3, H2.a.f485a);
        this.f1371h = str2;
        return str2;
    }

    public void o(a aVar, int i3) {
        i.e(aVar, "buffer");
        aVar.n(this.f1369f, 0, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0124, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0130, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x015c, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0163, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x016a, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x019b, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x019e, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01a1, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01a4, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007a, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008b, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00b6, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c8, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e8, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00f0, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0120, code lost:
        if (r6 == 64) goto L_0x01a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r17 = this;
            r0 = r17
            byte[] r1 = r0.f1369f
            int r2 = r1.length
            if (r2 != 0) goto L_0x000b
            java.lang.String r1 = "[size=0]"
            goto L_0x0275
        L_0x000b:
            int r2 = r1.length
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x000f:
            r8 = 64
            if (r4 >= r2) goto L_0x01a6
            byte r9 = r1[r4]
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 160(0xa0, float:2.24E-43)
            r14 = 127(0x7f, float:1.78E-43)
            r15 = 32
            r10 = 13
            r11 = 10
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r9 < 0) goto L_0x006f
            int r16 = r6 + 1
            if (r6 != r8) goto L_0x002c
            goto L_0x01a6
        L_0x002c:
            if (r9 == r11) goto L_0x003a
            if (r9 == r10) goto L_0x003a
            if (r9 < 0) goto L_0x0035
            if (r9 >= r15) goto L_0x0035
            goto L_0x003c
        L_0x0035:
            if (r14 > r9) goto L_0x003a
            if (r9 >= r13) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r9 != r12) goto L_0x003f
        L_0x003c:
            r5 = -1
            goto L_0x01a6
        L_0x003f:
            if (r9 >= r3) goto L_0x0043
            r6 = 1
            goto L_0x0044
        L_0x0043:
            r6 = 2
        L_0x0044:
            int r5 = r5 + r6
            int r4 = r4 + 1
        L_0x0047:
            r6 = r16
            if (r4 >= r2) goto L_0x000f
            byte r9 = r1[r4]
            if (r9 < 0) goto L_0x000f
            int r4 = r4 + 1
            int r16 = r6 + 1
            if (r6 != r8) goto L_0x0057
            goto L_0x01a6
        L_0x0057:
            if (r9 == r11) goto L_0x0065
            if (r9 == r10) goto L_0x0065
            if (r9 < 0) goto L_0x0060
            if (r9 >= r15) goto L_0x0060
            goto L_0x0067
        L_0x0060:
            if (r14 > r9) goto L_0x0065
            if (r9 >= r13) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            if (r9 != r12) goto L_0x0068
        L_0x0067:
            goto L_0x003c
        L_0x0068:
            if (r9 >= r3) goto L_0x006c
            r6 = 1
            goto L_0x006d
        L_0x006c:
            r6 = 2
        L_0x006d:
            int r5 = r5 + r6
            goto L_0x0047
        L_0x006f:
            int r7 = r9 >> 5
            r3 = -2
            r12 = 128(0x80, float:1.794E-43)
            if (r7 != r3) goto L_0x00ba
            int r3 = r4 + 1
            if (r2 > r3) goto L_0x007e
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x007e:
            byte r3 = r1[r3]
            r7 = r3 & 192(0xc0, float:2.69E-43)
            if (r7 != r12) goto L_0x00b6
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r7 = r9 << 6
            r3 = r3 ^ r7
            if (r3 >= r12) goto L_0x008f
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x008f:
            int r7 = r6 + 1
            if (r6 != r8) goto L_0x0095
            goto L_0x01a6
        L_0x0095:
            if (r3 == r11) goto L_0x00a3
            if (r3 == r10) goto L_0x00a3
            if (r3 < 0) goto L_0x009e
            if (r3 >= r15) goto L_0x009e
            goto L_0x00a8
        L_0x009e:
            if (r14 > r3) goto L_0x00a3
            if (r3 >= r13) goto L_0x00a3
            goto L_0x00a8
        L_0x00a3:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x00a9
        L_0x00a8:
            goto L_0x003c
        L_0x00a9:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x00af
            r10 = 1
            goto L_0x00b0
        L_0x00af:
            r10 = 2
        L_0x00b0:
            int r5 = r5 + r10
            int r4 = r4 + 2
        L_0x00b3:
            r6 = r7
            goto L_0x000f
        L_0x00b6:
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x00ba:
            int r7 = r9 >> 4
            r13 = 57344(0xe000, float:8.0356E-41)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r7 != r3) goto L_0x0128
            int r3 = r4 + 2
            if (r2 > r3) goto L_0x00cc
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x00cc:
            int r7 = r4 + 1
            byte r7 = r1[r7]
            r15 = r7 & 192(0xc0, float:2.69E-43)
            if (r15 != r12) goto L_0x0124
            byte r3 = r1[r3]
            r15 = r3 & 192(0xc0, float:2.69E-43)
            if (r15 != r12) goto L_0x0120
            r12 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r12
            int r7 = r7 << 6
            r3 = r3 ^ r7
            int r7 = r9 << 12
            r3 = r3 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r3 >= r7) goto L_0x00ec
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x00ec:
            if (r14 > r3) goto L_0x00f4
            if (r3 >= r13) goto L_0x00f4
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x00f4:
            int r7 = r6 + 1
            if (r6 != r8) goto L_0x00fa
            goto L_0x01a6
        L_0x00fa:
            if (r3 == r11) goto L_0x010e
            if (r3 == r10) goto L_0x010e
            if (r3 < 0) goto L_0x0105
            r6 = 32
            if (r3 >= r6) goto L_0x0105
            goto L_0x0113
        L_0x0105:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 > r3) goto L_0x010e
            r6 = 160(0xa0, float:2.24E-43)
            if (r3 >= r6) goto L_0x010e
            goto L_0x0113
        L_0x010e:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x0115
        L_0x0113:
            goto L_0x003c
        L_0x0115:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x011b
            r10 = 1
            goto L_0x011c
        L_0x011b:
            r10 = 2
        L_0x011c:
            int r5 = r5 + r10
            int r4 = r4 + 3
            goto L_0x00b3
        L_0x0120:
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x0124:
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x0128:
            int r7 = r9 >> 3
            if (r7 != r3) goto L_0x01a4
            int r3 = r4 + 3
            if (r2 > r3) goto L_0x0134
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x0134:
            int r7 = r4 + 1
            byte r7 = r1[r7]
            r15 = r7 & 192(0xc0, float:2.69E-43)
            if (r15 != r12) goto L_0x01a1
            int r15 = r4 + 2
            byte r15 = r1[r15]
            r10 = r15 & 192(0xc0, float:2.69E-43)
            if (r10 != r12) goto L_0x019e
            byte r3 = r1[r3]
            r10 = r3 & 192(0xc0, float:2.69E-43)
            if (r10 != r12) goto L_0x019b
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r10
            int r10 = r15 << 6
            r3 = r3 ^ r10
            int r7 = r7 << 12
            r3 = r3 ^ r7
            int r7 = r9 << 18
            r3 = r3 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r7) goto L_0x015f
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x015f:
            if (r14 > r3) goto L_0x0166
            if (r3 >= r13) goto L_0x0166
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x0166:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r7) goto L_0x016d
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x016d:
            int r7 = r6 + 1
            if (r6 != r8) goto L_0x0172
            goto L_0x01a6
        L_0x0172:
            if (r3 == r11) goto L_0x0188
            r6 = 13
            if (r3 == r6) goto L_0x0188
            if (r3 < 0) goto L_0x017f
            r6 = 32
            if (r3 >= r6) goto L_0x017f
            goto L_0x018d
        L_0x017f:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 > r3) goto L_0x0188
            r6 = 160(0xa0, float:2.24E-43)
            if (r3 >= r6) goto L_0x0188
            goto L_0x018d
        L_0x0188:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x018f
        L_0x018d:
            goto L_0x003c
        L_0x018f:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x0195
            r10 = 1
            goto L_0x0196
        L_0x0195:
            r10 = 2
        L_0x0196:
            int r5 = r5 + r10
            int r4 = r4 + 4
            goto L_0x00b3
        L_0x019b:
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x019e:
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x01a1:
            if (r6 != r8) goto L_0x003c
            goto L_0x01a6
        L_0x01a4:
            if (r6 != r8) goto L_0x003c
        L_0x01a6:
            java.lang.String r2 = "…]"
            java.lang.String r3 = "[size="
            r4 = 93
            r6 = -1
            if (r5 != r6) goto L_0x021f
            int r5 = r1.length
            if (r5 > r8) goto L_0x01c9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[hex="
            r1.<init>(r2)
            java.lang.String r2 = r17.c()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L_0x0275
        L_0x01c9:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            int r3 = r1.length
            r4.append(r3)
            java.lang.String r3 = " hex="
            r4.append(r3)
            int r3 = r1.length
            if (r8 > r3) goto L_0x0201
            int r3 = r1.length
            if (r8 != r3) goto L_0x01df
            r3 = r0
            goto L_0x01f2
        L_0x01df:
            R2.b r3 = new R2.b
            int r5 = r1.length
            android.support.v4.media.session.a.l(r8, r5)
            r5 = 0
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r5, r8)
            java.lang.String r5 = "copyOfRange(...)"
            A2.i.d(r1, r5)
            r3.<init>(r1)
        L_0x01f2:
            java.lang.String r1 = r3.c()
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            goto L_0x0275
        L_0x0201:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "endIndex > length("
            r2.<init>(r3)
            int r1 = r1.length
            r2.append(r1)
            r1 = 41
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x021f:
            java.lang.String r6 = r17.n()
            r7 = 0
            java.lang.String r7 = r6.substring(r7, r5)
            java.lang.String r8 = "this as java.lang.String…ing(startIndex, endIndex)"
            A2.i.d(r7, r8)
            java.lang.String r8 = "\\"
            java.lang.String r9 = "\\\\"
            java.lang.String r7 = H2.l.j0(r7, r8, r9)
            java.lang.String r8 = "\n"
            java.lang.String r9 = "\\n"
            java.lang.String r7 = H2.l.j0(r7, r8, r9)
            java.lang.String r8 = "\r"
            java.lang.String r9 = "\\r"
            java.lang.String r7 = H2.l.j0(r7, r8, r9)
            int r6 = r6.length()
            if (r5 >= r6) goto L_0x0264
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            int r1 = r1.length
            r4.append(r1)
            java.lang.String r1 = " text="
            r4.append(r1)
            r4.append(r7)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            goto L_0x0275
        L_0x0264:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[text="
            r1.<init>(r2)
            r1.append(r7)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
        L_0x0275:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.b.toString():java.lang.String");
    }
}
