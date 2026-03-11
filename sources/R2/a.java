package R2;

import A2.i;
import a.C0094a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import q2.C0400c;

public final class a implements t, ReadableByteChannel, Closeable, Flushable, WritableByteChannel, Cloneable, ByteChannel {

    /* renamed from: f  reason: collision with root package name */
    public q f1366f;

    /* renamed from: g  reason: collision with root package name */
    public long f1367g;

    public final byte a(long j3) {
        C0094a.e(this.f1367g, j3, 1);
        q qVar = this.f1366f;
        if (qVar != null) {
            long j4 = this.f1367g;
            if (j4 - j3 < j3) {
                while (j4 > j3) {
                    qVar = qVar.f1409g;
                    i.b(qVar);
                    j4 -= (long) (qVar.f1405c - qVar.f1404b);
                }
                return qVar.f1403a[(int) ((((long) qVar.f1404b) + j3) - j4)];
            }
            long j5 = 0;
            while (true) {
                int i3 = qVar.f1405c;
                int i4 = qVar.f1404b;
                long j6 = ((long) (i3 - i4)) + j5;
                if (j6 <= j3) {
                    qVar = qVar.f1408f;
                    i.b(qVar);
                    j5 = j6;
                } else {
                    return qVar.f1403a[(int) ((((long) i4) + j3) - j5)];
                }
            }
        } else {
            i.b((Object) null);
            throw null;
        }
    }

    public final long b(b bVar) {
        long j3;
        int i3;
        int i4;
        int i5;
        i.e(bVar, "targetBytes");
        q qVar = this.f1366f;
        if (qVar == null) {
            return -1;
        }
        long j4 = this.f1367g;
        long j5 = 0;
        int i6 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        byte[] bArr = bVar.f1369f;
        if (i6 < 0) {
            while (j4 > 0) {
                qVar = qVar.f1409g;
                i.b(qVar);
                j4 -= (long) (qVar.f1405c - qVar.f1404b);
            }
            if (bArr.length == 2) {
                byte b3 = bArr[0];
                byte b4 = bArr[1];
                while (j3 < this.f1367g) {
                    i4 = (int) ((((long) qVar.f1404b) + j5) - j3);
                    int i7 = qVar.f1405c;
                    while (i4 < i7) {
                        byte b5 = qVar.f1403a[i4];
                        if (!(b5 == b3 || b5 == b4)) {
                            i4++;
                        }
                    }
                    j5 = ((long) (qVar.f1405c - qVar.f1404b)) + j3;
                    qVar = qVar.f1408f;
                    i.b(qVar);
                    j4 = j5;
                }
                return -1;
            }
            while (j3 < this.f1367g) {
                i3 = (int) ((((long) qVar.f1404b) + j5) - j3);
                int i8 = qVar.f1405c;
                while (i3 < i8) {
                    byte b6 = qVar.f1403a[i3];
                    for (byte b7 : bArr) {
                        if (b6 == b7) {
                            i5 = qVar.f1404b;
                            return ((long) (i4 - i5)) + j3;
                        }
                    }
                    i3++;
                }
                j5 = ((long) (qVar.f1405c - qVar.f1404b)) + j3;
                qVar = qVar.f1408f;
                i.b(qVar);
                j4 = j5;
            }
            return -1;
        }
        j3 = 0;
        while (true) {
            long j6 = ((long) (qVar.f1405c - qVar.f1404b)) + j3;
            if (j6 > 0) {
                break;
            }
            qVar = qVar.f1408f;
            i.b(qVar);
            j3 = j6;
        }
        if (bArr.length == 2) {
            byte b8 = bArr[0];
            byte b9 = bArr[1];
            while (j3 < this.f1367g) {
                int i9 = (int) ((((long) qVar.f1404b) + j5) - j3);
                int i10 = qVar.f1405c;
                while (i4 < i10) {
                    byte b10 = qVar.f1403a[i4];
                    if (!(b10 == b8 || b10 == b9)) {
                        i9 = i4 + 1;
                    }
                }
                j5 = ((long) (qVar.f1405c - qVar.f1404b)) + j3;
                qVar = qVar.f1408f;
                i.b(qVar);
                j3 = j5;
            }
            return -1;
        }
        while (j3 < this.f1367g) {
            int i11 = (int) ((((long) qVar.f1404b) + j5) - j3);
            int i12 = qVar.f1405c;
            while (i3 < i12) {
                byte b11 = qVar.f1403a[i3];
                for (byte b12 : bArr) {
                    if (b11 == b12) {
                        i5 = qVar.f1404b;
                        return ((long) (i4 - i5)) + j3;
                    }
                }
                i11 = i3 + 1;
            }
            j5 = ((long) (qVar.f1405c - qVar.f1404b)) + j3;
            qVar = qVar.f1408f;
            i.b(qVar);
            j3 = j5;
        }
        return -1;
        i5 = qVar.f1404b;
        return ((long) (i4 - i5)) + j3;
    }

    public final boolean c(b bVar) {
        i.e(bVar, "bytes");
        byte[] bArr = bVar.f1369f;
        int length = bArr.length;
        if (length < 0 || this.f1367g < ((long) length) || bArr.length < length) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            if (a((long) i3) != bArr[i3]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [R2.a, java.lang.Object] */
    public final Object clone() {
        ? obj = new Object();
        if (this.f1367g != 0) {
            q qVar = this.f1366f;
            i.b(qVar);
            q c3 = qVar.c();
            obj.f1366f = c3;
            c3.f1409g = c3;
            c3.f1408f = c3;
            for (q qVar2 = qVar.f1408f; qVar2 != qVar; qVar2 = qVar2.f1408f) {
                q qVar3 = c3.f1409g;
                i.b(qVar3);
                i.b(qVar2);
                qVar3.b(qVar2.c());
            }
            obj.f1367g = this.f1367g;
        }
        return obj;
    }

    public final byte d() {
        if (this.f1367g != 0) {
            q qVar = this.f1366f;
            i.b(qVar);
            int i3 = qVar.f1404b;
            int i4 = qVar.f1405c;
            int i5 = i3 + 1;
            byte b3 = qVar.f1403a[i3];
            this.f1367g--;
            if (i5 == i4) {
                this.f1366f = qVar.a();
                r.a(qVar);
            } else {
                qVar.f1404b = i5;
            }
            return b3;
        }
        throw new EOFException();
    }

    public final byte[] e(long j3) {
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        } else if (this.f1367g >= j3) {
            int i3 = (int) j3;
            byte[] bArr = new byte[i3];
            int i4 = 0;
            while (i4 < i3) {
                int read = read(bArr, i4, i3 - i4);
                if (read != -1) {
                    i4 += read;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            if (r0 != r1) goto L_0x0009
        L_0x0006:
            r2 = 1
            goto L_0x0078
        L_0x0009:
            boolean r3 = r1 instanceof R2.a
            if (r3 != 0) goto L_0x0010
        L_0x000d:
            r2 = 0
            goto L_0x0078
        L_0x0010:
            long r5 = r0.f1367g
            R2.a r1 = (R2.a) r1
            long r7 = r1.f1367g
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x001b
            goto L_0x000d
        L_0x001b:
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0022
            goto L_0x0006
        L_0x0022:
            R2.q r3 = r0.f1366f
            A2.i.b(r3)
            R2.q r1 = r1.f1366f
            A2.i.b(r1)
            int r5 = r3.f1404b
            int r6 = r1.f1404b
            r9 = r7
        L_0x0031:
            long r11 = r0.f1367g
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0006
            int r11 = r3.f1405c
            int r11 = r11 - r5
            int r12 = r1.f1405c
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L_0x0043:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x005d
            int r15 = r5 + 1
            byte[] r2 = r3.f1403a
            byte r2 = r2[r5]
            int r5 = r6 + 1
            byte[] r4 = r1.f1403a
            byte r4 = r4[r6]
            if (r2 == r4) goto L_0x0056
            goto L_0x000d
        L_0x0056:
            r16 = 1
            long r13 = r13 + r16
            r6 = r5
            r5 = r15
            goto L_0x0043
        L_0x005d:
            int r2 = r3.f1405c
            if (r5 != r2) goto L_0x006a
            R2.q r2 = r3.f1408f
            A2.i.b(r2)
            int r3 = r2.f1404b
            r5 = r3
            r3 = r2
        L_0x006a:
            int r2 = r1.f1405c
            if (r6 != r2) goto L_0x0076
            R2.q r1 = r1.f1408f
            A2.i.b(r1)
            int r2 = r1.f1404b
            r6 = r2
        L_0x0076:
            long r9 = r9 + r11
            goto L_0x0031
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.a.equals(java.lang.Object):boolean");
    }

    public final long f(a aVar, long j3) {
        i.e(aVar, "sink");
        if (j3 >= 0) {
            long j4 = this.f1367g;
            if (j4 == 0) {
                return -1;
            }
            if (j3 > j4) {
                j3 = j4;
            }
            aVar.l(this, j3);
            return j3;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
    }

    public final b g(long j3) {
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        } else if (this.f1367g < j3) {
            throw new EOFException();
        } else if (j3 < 4096) {
            return new b(e(j3));
        } else {
            b j4 = j((int) j3);
            i(j3);
            return j4;
        }
    }

    public final int h() {
        if (this.f1367g >= 4) {
            q qVar = this.f1366f;
            i.b(qVar);
            int i3 = qVar.f1404b;
            int i4 = qVar.f1405c;
            if (((long) (i4 - i3)) < 4) {
                return ((d() & 255) << 24) | ((d() & 255) << 16) | ((d() & 255) << 8) | (d() & 255);
            }
            byte[] bArr = qVar.f1403a;
            byte b3 = ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3] & 255) << 24);
            int i5 = i3 + 3;
            int i6 = i3 + 4;
            byte b4 = b3 | ((bArr[i3 + 2] & 255) << 8) | (bArr[i5] & 255);
            this.f1367g -= 4;
            if (i6 == i4) {
                this.f1366f = qVar.a();
                r.a(qVar);
            } else {
                qVar.f1404b = i6;
            }
            return b4;
        }
        throw new EOFException();
    }

    public final int hashCode() {
        q qVar = this.f1366f;
        if (qVar == null) {
            return 0;
        }
        int i3 = 1;
        do {
            int i4 = qVar.f1405c;
            for (int i5 = qVar.f1404b; i5 < i4; i5++) {
                i3 = (i3 * 31) + qVar.f1403a[i5];
            }
            qVar = qVar.f1408f;
            i.b(qVar);
        } while (qVar != this.f1366f);
        return i3;
    }

    public final void i(long j3) {
        while (j3 > 0) {
            q qVar = this.f1366f;
            if (qVar != null) {
                int min = (int) Math.min(j3, (long) (qVar.f1405c - qVar.f1404b));
                long j4 = (long) min;
                this.f1367g -= j4;
                j3 -= j4;
                int i3 = qVar.f1404b + min;
                qVar.f1404b = i3;
                if (i3 == qVar.f1405c) {
                    this.f1366f = qVar.a();
                    r.a(qVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final boolean isOpen() {
        return true;
    }

    public final b j(int i3) {
        if (i3 == 0) {
            return b.f1368i;
        }
        C0094a.e(this.f1367g, 0, (long) i3);
        q qVar = this.f1366f;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            i.b(qVar);
            int i7 = qVar.f1405c;
            int i8 = qVar.f1404b;
            if (i7 != i8) {
                i5 += i7 - i8;
                i6++;
                qVar = qVar.f1408f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i6][];
        int[] iArr = new int[(i6 * 2)];
        q qVar2 = this.f1366f;
        int i9 = 0;
        while (i4 < i3) {
            i.b(qVar2);
            bArr[i9] = qVar2.f1403a;
            i4 += qVar2.f1405c - qVar2.f1404b;
            iArr[i9] = Math.min(i4, i3);
            iArr[i9 + i6] = qVar2.f1404b;
            qVar2.f1406d = true;
            i9++;
            qVar2 = qVar2.f1408f;
        }
        return new s(bArr, iArr);
    }

    public final q k(int i3) {
        if (i3 < 1 || i3 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        q qVar = this.f1366f;
        if (qVar == null) {
            q b3 = r.b();
            this.f1366f = b3;
            b3.f1409g = b3;
            b3.f1408f = b3;
            return b3;
        }
        q qVar2 = qVar.f1409g;
        i.b(qVar2);
        if (qVar2.f1405c + i3 <= 8192 && qVar2.f1407e) {
            return qVar2;
        }
        q b4 = r.b();
        qVar2.b(b4);
        return b4;
    }

    public final void l(a aVar, long j3) {
        q qVar;
        q qVar2;
        int i3;
        i.e(aVar, "source");
        if (aVar != this) {
            C0094a.e(aVar.f1367g, 0, j3);
            while (j3 > 0) {
                q qVar3 = aVar.f1366f;
                i.b(qVar3);
                int i4 = qVar3.f1405c;
                q qVar4 = aVar.f1366f;
                i.b(qVar4);
                int i5 = (j3 > ((long) (i4 - qVar4.f1404b)) ? 1 : (j3 == ((long) (i4 - qVar4.f1404b)) ? 0 : -1));
                int i6 = 0;
                if (i5 < 0) {
                    q qVar5 = this.f1366f;
                    if (qVar5 != null) {
                        qVar = qVar5.f1409g;
                    } else {
                        qVar = null;
                    }
                    if (qVar != null && qVar.f1407e) {
                        long j4 = ((long) qVar.f1405c) + j3;
                        if (qVar.f1406d) {
                            i3 = 0;
                        } else {
                            i3 = qVar.f1404b;
                        }
                        if (j4 - ((long) i3) <= 8192) {
                            q qVar6 = aVar.f1366f;
                            i.b(qVar6);
                            qVar6.d(qVar, (int) j3);
                            aVar.f1367g -= j3;
                            this.f1367g += j3;
                            return;
                        }
                    }
                    q qVar7 = aVar.f1366f;
                    i.b(qVar7);
                    int i7 = (int) j3;
                    if (i7 <= 0 || i7 > qVar7.f1405c - qVar7.f1404b) {
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                    if (i7 >= 1024) {
                        qVar2 = qVar7.c();
                    } else {
                        qVar2 = r.b();
                        int i8 = qVar7.f1404b;
                        C0400c.I(0, i8, i8 + i7, qVar7.f1403a, qVar2.f1403a);
                    }
                    qVar2.f1405c = qVar2.f1404b + i7;
                    qVar7.f1404b += i7;
                    q qVar8 = qVar7.f1409g;
                    i.b(qVar8);
                    qVar8.b(qVar2);
                    aVar.f1366f = qVar2;
                }
                q qVar9 = aVar.f1366f;
                i.b(qVar9);
                long j5 = (long) (qVar9.f1405c - qVar9.f1404b);
                aVar.f1366f = qVar9.a();
                q qVar10 = this.f1366f;
                if (qVar10 == null) {
                    this.f1366f = qVar9;
                    qVar9.f1409g = qVar9;
                    qVar9.f1408f = qVar9;
                } else {
                    q qVar11 = qVar10.f1409g;
                    i.b(qVar11);
                    qVar11.b(qVar9);
                    q qVar12 = qVar9.f1409g;
                    if (qVar12 != qVar9) {
                        i.b(qVar12);
                        if (qVar12.f1407e) {
                            int i9 = qVar9.f1405c - qVar9.f1404b;
                            q qVar13 = qVar9.f1409g;
                            i.b(qVar13);
                            int i10 = 8192 - qVar13.f1405c;
                            q qVar14 = qVar9.f1409g;
                            i.b(qVar14);
                            if (!qVar14.f1406d) {
                                q qVar15 = qVar9.f1409g;
                                i.b(qVar15);
                                i6 = qVar15.f1404b;
                            }
                            if (i9 <= i10 + i6) {
                                q qVar16 = qVar9.f1409g;
                                i.b(qVar16);
                                qVar9.d(qVar16, i9);
                                qVar9.a();
                                r.a(qVar9);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                aVar.f1367g -= j5;
                this.f1367g += j5;
                j3 -= j5;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public final void m(b bVar) {
        i.e(bVar, "byteString");
        bVar.o(this, bVar.b());
    }

    public final void n(byte[] bArr, int i3, int i4) {
        i.e(bArr, "source");
        long j3 = (long) i4;
        C0094a.e((long) bArr.length, (long) i3, j3);
        int i5 = i4 + i3;
        while (i3 < i5) {
            q k3 = k(1);
            int min = Math.min(i5 - i3, 8192 - k3.f1405c);
            int i6 = i3 + min;
            C0400c.I(k3.f1405c, i3, i6, bArr, k3.f1403a);
            k3.f1405c += min;
            i3 = i6;
        }
        this.f1367g += j3;
    }

    public final void o(int i3) {
        q k3 = k(1);
        int i4 = k3.f1405c;
        k3.f1405c = i4 + 1;
        k3.f1403a[i4] = (byte) i3;
        this.f1367g++;
    }

    public final void p(String str) {
        char c3;
        char charAt;
        i.e(str, "string");
        int length = str.length();
        if (length < 0) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + length + " < 0").toString());
        } else if (length <= str.length()) {
            int i3 = 0;
            while (i3 < length) {
                char charAt2 = str.charAt(i3);
                if (charAt2 < 128) {
                    q k3 = k(1);
                    int i4 = k3.f1405c - i3;
                    int min = Math.min(length, 8192 - i4);
                    int i5 = i3 + 1;
                    byte[] bArr = k3.f1403a;
                    bArr[i3 + i4] = (byte) charAt2;
                    while (true) {
                        i3 = i5;
                        if (i3 >= min || (charAt = str.charAt(i3)) >= 128) {
                            int i6 = k3.f1405c;
                            int i7 = (i4 + i3) - i6;
                            k3.f1405c = i6 + i7;
                            this.f1367g += (long) i7;
                        } else {
                            i5 = i3 + 1;
                            bArr[i3 + i4] = (byte) charAt;
                        }
                    }
                    int i62 = k3.f1405c;
                    int i72 = (i4 + i3) - i62;
                    k3.f1405c = i62 + i72;
                    this.f1367g += (long) i72;
                } else {
                    if (charAt2 < 2048) {
                        q k4 = k(2);
                        int i8 = k4.f1405c;
                        byte[] bArr2 = k4.f1403a;
                        bArr2[i8] = (byte) ((charAt2 >> 6) | 192);
                        bArr2[i8 + 1] = (byte) ((charAt2 & '?') | 128);
                        k4.f1405c = i8 + 2;
                        this.f1367g += 2;
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        q k5 = k(3);
                        int i9 = k5.f1405c;
                        byte[] bArr3 = k5.f1403a;
                        bArr3[i9] = (byte) ((charAt2 >> 12) | 224);
                        bArr3[i9 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                        bArr3[i9 + 2] = (byte) ((charAt2 & '?') | 128);
                        k5.f1405c = i9 + 3;
                        this.f1367g += 3;
                    } else {
                        int i10 = i3 + 1;
                        if (i10 < length) {
                            c3 = str.charAt(i10);
                        } else {
                            c3 = 0;
                        }
                        if (charAt2 > 56319 || 56320 > c3 || c3 >= 57344) {
                            o(63);
                            i3 = i10;
                        } else {
                            int i11 = (((charAt2 & 1023) << 10) | (c3 & 1023)) + 0;
                            q k6 = k(4);
                            int i12 = k6.f1405c;
                            byte[] bArr4 = k6.f1403a;
                            bArr4[i12] = (byte) ((i11 >> 18) | 240);
                            bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                            bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                            bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                            k6.f1405c = i12 + 4;
                            this.f1367g += 4;
                            i3 += 2;
                        }
                    }
                    i3++;
                }
            }
        } else {
            throw new IllegalArgumentException(("endIndex > string.length: " + length + " > " + str.length()).toString());
        }
    }

    public final int read(ByteBuffer byteBuffer) {
        i.e(byteBuffer, "sink");
        q qVar = this.f1366f;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), qVar.f1405c - qVar.f1404b);
        byteBuffer.put(qVar.f1403a, qVar.f1404b, min);
        int i3 = qVar.f1404b + min;
        qVar.f1404b = i3;
        this.f1367g -= (long) min;
        if (i3 == qVar.f1405c) {
            this.f1366f = qVar.a();
            r.a(qVar);
        }
        return min;
    }

    public final String toString() {
        long j3 = this.f1367g;
        if (j3 <= 2147483647L) {
            return j((int) j3).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f1367g).toString());
    }

    public final int write(ByteBuffer byteBuffer) {
        i.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i3 = remaining;
        while (i3 > 0) {
            q k3 = k(1);
            int min = Math.min(i3, 8192 - k3.f1405c);
            byteBuffer.get(k3.f1403a, k3.f1405c, min);
            i3 -= min;
            k3.f1405c += min;
        }
        this.f1367g += (long) remaining;
        return remaining;
    }

    public final int read(byte[] bArr, int i3, int i4) {
        i.e(bArr, "sink");
        C0094a.e((long) bArr.length, (long) i3, (long) i4);
        q qVar = this.f1366f;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(i4, qVar.f1405c - qVar.f1404b);
        int i5 = qVar.f1404b;
        C0400c.I(i3, i5, i5 + min, qVar.f1403a, bArr);
        int i6 = qVar.f1404b + min;
        qVar.f1404b = i6;
        this.f1367g -= (long) min;
        if (i6 == qVar.f1405c) {
            this.f1366f = qVar.a();
            r.a(qVar);
        }
        return min;
    }

    public final void close() {
    }

    public final void flush() {
    }
}
