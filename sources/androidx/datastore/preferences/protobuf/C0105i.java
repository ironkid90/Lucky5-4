package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.datastore.preferences.protobuf.i  reason: case insensitive filesystem */
public final class C0105i extends C0106j {

    /* renamed from: c  reason: collision with root package name */
    public final InputStream f2435c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f2436d;

    /* renamed from: e  reason: collision with root package name */
    public int f2437e;

    /* renamed from: f  reason: collision with root package name */
    public int f2438f;

    /* renamed from: g  reason: collision with root package name */
    public int f2439g;

    /* renamed from: h  reason: collision with root package name */
    public int f2440h;

    /* renamed from: i  reason: collision with root package name */
    public int f2441i;

    /* renamed from: j  reason: collision with root package name */
    public int f2442j = Integer.MAX_VALUE;

    public C0105i(InputStream inputStream) {
        Charset charset = C0120y.f2497a;
        this.f2435c = inputStream;
        this.f2436d = new byte[4096];
        this.f2437e = 0;
        this.f2439g = 0;
        this.f2441i = 0;
    }

    public final byte[] A(int i3) {
        if (i3 == 0) {
            return C0120y.f2498b;
        }
        if (i3 >= 0) {
            int i4 = this.f2441i;
            int i5 = this.f2439g;
            int i6 = i4 + i5 + i3;
            if (i6 - Integer.MAX_VALUE <= 0) {
                int i7 = this.f2442j;
                if (i6 <= i7) {
                    int i8 = this.f2437e - i5;
                    int i9 = i3 - i8;
                    InputStream inputStream = this.f2435c;
                    if (i9 >= 4096) {
                        try {
                            if (i9 > inputStream.available()) {
                                return null;
                            }
                        } catch (A e2) {
                            e2.f2335f = true;
                            throw e2;
                        }
                    }
                    byte[] bArr = new byte[i3];
                    System.arraycopy(this.f2436d, this.f2439g, bArr, 0, i8);
                    this.f2441i += this.f2437e;
                    this.f2439g = 0;
                    this.f2437e = 0;
                    while (i8 < i3) {
                        try {
                            int read = inputStream.read(bArr, i8, i3 - i8);
                            if (read != -1) {
                                this.f2441i += read;
                                i8 += read;
                            } else {
                                throw A.e();
                            }
                        } catch (A e3) {
                            e3.f2335f = true;
                            throw e3;
                        }
                    }
                    return bArr;
                }
                J((i7 - i4) - i5);
                throw A.e();
            }
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw A.d();
    }

    public final ArrayList B(int i3) {
        ArrayList arrayList = new ArrayList();
        while (i3 > 0) {
            int min = Math.min(i3, 4096);
            byte[] bArr = new byte[min];
            int i4 = 0;
            while (i4 < min) {
                int read = this.f2435c.read(bArr, i4, min - i4);
                if (read != -1) {
                    this.f2441i += read;
                    i4 += read;
                } else {
                    throw A.e();
                }
            }
            i3 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int C() {
        int i3 = this.f2439g;
        if (this.f2437e - i3 < 4) {
            I(4);
            i3 = this.f2439g;
        }
        this.f2439g = i3 + 4;
        byte[] bArr = this.f2436d;
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }

    public final long D() {
        int i3 = this.f2439g;
        if (this.f2437e - i3 < 8) {
            I(8);
            i3 = this.f2439g;
        }
        this.f2439g = i3 + 8;
        byte[] bArr = this.f2436d;
        return ((((long) bArr[i3 + 7]) & 255) << 56) | (((long) bArr[i3]) & 255) | ((((long) bArr[i3 + 1]) & 255) << 8) | ((((long) bArr[i3 + 2]) & 255) << 16) | ((((long) bArr[i3 + 3]) & 255) << 24) | ((((long) bArr[i3 + 4]) & 255) << 32) | ((((long) bArr[i3 + 5]) & 255) << 40) | ((((long) bArr[i3 + 6]) & 255) << 48);
    }

    public final int E() {
        byte b3;
        byte b4;
        int i3 = this.f2439g;
        int i4 = this.f2437e;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.f2436d;
            byte b5 = bArr[i3];
            if (b5 >= 0) {
                this.f2439g = i5;
                return b5;
            } else if (i4 - i5 >= 9) {
                int i6 = i3 + 2;
                byte b6 = (bArr[i5] << 7) ^ b5;
                if (b6 < 0) {
                    b3 = b6 ^ Byte.MIN_VALUE;
                } else {
                    int i7 = i3 + 3;
                    byte b7 = (bArr[i6] << 14) ^ b6;
                    if (b7 >= 0) {
                        b4 = b7 ^ 16256;
                    } else {
                        int i8 = i3 + 4;
                        byte b8 = b7 ^ (bArr[i7] << 21);
                        if (b8 < 0) {
                            b3 = -2080896 ^ b8;
                        } else {
                            i7 = i3 + 5;
                            byte b9 = bArr[i8];
                            byte b10 = (b8 ^ (b9 << 28)) ^ 266354560;
                            if (b9 < 0) {
                                i8 = i3 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i3 + 7;
                                    if (bArr[i8] < 0) {
                                        i8 = i3 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i3 + 9;
                                            if (bArr[i8] < 0) {
                                                int i9 = i3 + 10;
                                                if (bArr[i7] >= 0) {
                                                    byte b11 = b10;
                                                    i6 = i9;
                                                    b3 = b11;
                                                }
                                            }
                                        }
                                    }
                                }
                                b3 = b10;
                            }
                            b4 = b10;
                        }
                        i6 = i8;
                    }
                    i6 = i7;
                }
                this.f2439g = i6;
                return b3;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j3;
        long j4;
        long j5;
        long j6;
        int i3 = this.f2439g;
        int i4 = this.f2437e;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.f2436d;
            byte b3 = bArr[i3];
            if (b3 >= 0) {
                this.f2439g = i5;
                return (long) b3;
            } else if (i4 - i5 >= 9) {
                int i6 = i3 + 2;
                byte b4 = (bArr[i5] << 7) ^ b3;
                if (b4 < 0) {
                    j3 = (long) (b4 ^ Byte.MIN_VALUE);
                } else {
                    int i7 = i3 + 3;
                    byte b5 = (bArr[i6] << 14) ^ b4;
                    if (b5 >= 0) {
                        j3 = (long) (b5 ^ 16256);
                        i6 = i7;
                    } else {
                        int i8 = i3 + 4;
                        byte b6 = b5 ^ (bArr[i7] << 21);
                        if (b6 < 0) {
                            j6 = (long) (-2080896 ^ b6);
                        } else {
                            long j7 = (long) b6;
                            int i9 = i3 + 5;
                            long j8 = j7 ^ (((long) bArr[i8]) << 28);
                            if (j8 >= 0) {
                                j5 = 266354560;
                            } else {
                                i8 = i3 + 6;
                                long j9 = j8 ^ (((long) bArr[i9]) << 35);
                                if (j9 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i9 = i3 + 7;
                                    j8 = j9 ^ (((long) bArr[i8]) << 42);
                                    if (j8 >= 0) {
                                        j5 = 4363953127296L;
                                    } else {
                                        i8 = i3 + 8;
                                        j9 = j8 ^ (((long) bArr[i9]) << 49);
                                        if (j9 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i6 = i3 + 9;
                                            long j10 = (j9 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                int i10 = i3 + 10;
                                                if (((long) bArr[i6]) >= 0) {
                                                    i6 = i10;
                                                }
                                            }
                                            j3 = j10;
                                        }
                                    }
                                }
                                j6 = j4 ^ j9;
                            }
                            j3 = j5 ^ j8;
                        }
                        i6 = i8;
                        j3 = j6;
                    }
                }
                this.f2439g = i6;
                return j3;
            }
        }
        return G();
    }

    public final long G() {
        long j3 = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            if (this.f2439g == this.f2437e) {
                I(1);
            }
            int i4 = this.f2439g;
            this.f2439g = i4 + 1;
            byte b3 = this.f2436d[i4];
            j3 |= ((long) (b3 & Byte.MAX_VALUE)) << i3;
            if ((b3 & 128) == 0) {
                return j3;
            }
        }
        throw A.c();
    }

    public final void H() {
        int i3 = this.f2437e + this.f2438f;
        this.f2437e = i3;
        int i4 = this.f2441i + i3;
        int i5 = this.f2442j;
        if (i4 > i5) {
            int i6 = i4 - i5;
            this.f2438f = i6;
            this.f2437e = i3 - i6;
            return;
        }
        this.f2438f = 0;
    }

    public final void I(int i3) {
        if (K(i3)) {
            return;
        }
        if (i3 > (Integer.MAX_VALUE - this.f2441i) - this.f2439g) {
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw A.e();
    }

    public final void J(int i3) {
        int i4 = this.f2437e;
        int i5 = this.f2439g;
        if (i3 > i4 - i5 || i3 < 0) {
            InputStream inputStream = this.f2435c;
            if (i3 >= 0) {
                int i6 = this.f2441i;
                int i7 = i6 + i5;
                int i8 = i7 + i3;
                int i9 = this.f2442j;
                if (i8 <= i9) {
                    this.f2441i = i7;
                    int i10 = i4 - i5;
                    this.f2437e = 0;
                    this.f2439g = 0;
                    while (i10 < i3) {
                        long j3 = (long) (i3 - i10);
                        try {
                            long skip = inputStream.skip(j3);
                            int i11 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                            if (i11 < 0 || skip > j3) {
                                throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            } else if (i11 == 0) {
                                break;
                            } else {
                                i10 += (int) skip;
                            }
                        } catch (A e2) {
                            e2.f2335f = true;
                            throw e2;
                        } catch (Throwable th) {
                            this.f2441i += i10;
                            H();
                            throw th;
                        }
                    }
                    this.f2441i += i10;
                    H();
                    if (i10 < i3) {
                        int i12 = this.f2437e;
                        int i13 = i12 - this.f2439g;
                        this.f2439g = i12;
                        I(1);
                        while (true) {
                            int i14 = i3 - i13;
                            int i15 = this.f2437e;
                            if (i14 > i15) {
                                i13 += i15;
                                this.f2439g = i15;
                                I(1);
                            } else {
                                this.f2439g = i14;
                                return;
                            }
                        }
                    }
                } else {
                    J((i9 - i6) - i5);
                    throw A.e();
                }
            } else {
                throw A.d();
            }
        } else {
            this.f2439g = i5 + i3;
        }
    }

    public final boolean K(int i3) {
        int i4 = this.f2439g;
        int i5 = i4 + i3;
        int i6 = this.f2437e;
        if (i5 > i6) {
            int i7 = this.f2441i;
            if (i3 > (Integer.MAX_VALUE - i7) - i4 || i7 + i4 + i3 > this.f2442j) {
                return false;
            }
            byte[] bArr = this.f2436d;
            if (i4 > 0) {
                if (i6 > i4) {
                    System.arraycopy(bArr, i4, bArr, 0, i6 - i4);
                }
                this.f2441i += i4;
                this.f2437e -= i4;
                this.f2439g = 0;
            }
            int i8 = this.f2437e;
            int min = Math.min(bArr.length - i8, (Integer.MAX_VALUE - this.f2441i) - i8);
            InputStream inputStream = this.f2435c;
            try {
                int read = inputStream.read(bArr, i8, min);
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f2437e += read;
                    H();
                    if (this.f2437e >= i3) {
                        return true;
                    }
                    return K(i3);
                }
            } catch (A e2) {
                e2.f2335f = true;
                throw e2;
            }
        } else {
            throw new IllegalStateException("refillBuffer() called when " + i3 + " bytes were already available in buffer");
        }
    }

    public final void a(int i3) {
        if (this.f2440h != i3) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        return this.f2441i + this.f2439g;
    }

    public final boolean c() {
        if (this.f2439g != this.f2437e || K(1)) {
            return false;
        }
        return true;
    }

    public final void d(int i3) {
        this.f2442j = i3;
        H();
    }

    public final int e(int i3) {
        if (i3 >= 0) {
            int i4 = this.f2441i + this.f2439g + i3;
            if (i4 >= 0) {
                int i5 = this.f2442j;
                if (i4 <= i5) {
                    this.f2442j = i4;
                    H();
                    return i5;
                }
                throw A.e();
            }
            throw new IOException("Failed to parse the message.");
        }
        throw A.d();
    }

    public final boolean f() {
        if (F() != 0) {
            return true;
        }
        return false;
    }

    public final C0103g g() {
        int E3 = E();
        int i3 = this.f2437e;
        int i4 = this.f2439g;
        int i5 = i3 - i4;
        byte[] bArr = this.f2436d;
        if (E3 <= i5 && E3 > 0) {
            C0103g c3 = C0103g.c(bArr, i4, E3);
            this.f2439g += E3;
            return c3;
        } else if (E3 == 0) {
            return C0103g.f2423h;
        } else {
            if (E3 >= 0) {
                byte[] A3 = A(E3);
                if (A3 != null) {
                    return C0103g.c(A3, 0, A3.length);
                }
                int i6 = this.f2439g;
                int i7 = this.f2437e;
                int i8 = i7 - i6;
                this.f2441i += i7;
                this.f2439g = 0;
                this.f2437e = 0;
                ArrayList B3 = B(E3 - i8);
                byte[] bArr2 = new byte[E3];
                System.arraycopy(bArr, i6, bArr2, 0, i8);
                Iterator it = B3.iterator();
                while (it.hasNext()) {
                    byte[] bArr3 = (byte[]) it.next();
                    System.arraycopy(bArr3, 0, bArr2, i8, bArr3.length);
                    i8 += bArr3.length;
                }
                C0103g gVar = C0103g.f2423h;
                return new C0103g(bArr2);
            }
            throw A.d();
        }
    }

    public final double h() {
        return Double.longBitsToDouble(D());
    }

    public final int i() {
        return E();
    }

    public final int j() {
        return C();
    }

    public final long k() {
        return D();
    }

    public final float l() {
        return Float.intBitsToFloat(C());
    }

    public final int m() {
        return E();
    }

    public final long n() {
        return F();
    }

    public final int o() {
        return C();
    }

    public final long p() {
        return D();
    }

    public final int q() {
        int E3 = E();
        return (-(E3 & 1)) ^ (E3 >>> 1);
    }

    public final long r() {
        long F3 = F();
        return (-(F3 & 1)) ^ (F3 >>> 1);
    }

    public final String s() {
        int E3 = E();
        byte[] bArr = this.f2436d;
        if (E3 > 0) {
            int i3 = this.f2437e;
            int i4 = this.f2439g;
            if (E3 <= i3 - i4) {
                String str = new String(bArr, i4, E3, C0120y.f2497a);
                this.f2439g += E3;
                return str;
            }
        }
        if (E3 == 0) {
            return "";
        }
        if (E3 < 0) {
            throw A.d();
        } else if (E3 > this.f2437e) {
            return new String(z(E3), C0120y.f2497a);
        } else {
            I(E3);
            String str2 = new String(bArr, this.f2439g, E3, C0120y.f2497a);
            this.f2439g += E3;
            return str2;
        }
    }

    public final String t() {
        int E3 = E();
        int i3 = this.f2439g;
        int i4 = this.f2437e;
        int i5 = i4 - i3;
        byte[] bArr = this.f2436d;
        if (E3 <= i5 && E3 > 0) {
            this.f2439g = i3 + E3;
        } else if (E3 == 0) {
            return "";
        } else {
            if (E3 >= 0) {
                i3 = 0;
                if (E3 <= i4) {
                    I(E3);
                    this.f2439g = E3;
                } else {
                    bArr = z(E3);
                }
            } else {
                throw A.d();
            }
        }
        return l0.f2456a.m(bArr, i3, E3);
    }

    public final int u() {
        if (c()) {
            this.f2440h = 0;
            return 0;
        }
        int E3 = E();
        this.f2440h = E3;
        if ((E3 >>> 3) != 0) {
            return E3;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public final int v() {
        return E();
    }

    public final long w() {
        return F();
    }

    public final boolean x(int i3) {
        int i4 = i3 & 7;
        int i5 = 0;
        if (i4 == 0) {
            int i6 = this.f2437e - this.f2439g;
            byte[] bArr = this.f2436d;
            if (i6 >= 10) {
                while (i5 < 10) {
                    int i7 = this.f2439g;
                    this.f2439g = i7 + 1;
                    if (bArr[i7] < 0) {
                        i5++;
                    }
                }
                throw A.c();
            }
            while (i5 < 10) {
                if (this.f2439g == this.f2437e) {
                    I(1);
                }
                int i8 = this.f2439g;
                this.f2439g = i8 + 1;
                if (bArr[i8] < 0) {
                    i5++;
                }
            }
            throw A.c();
            return true;
        } else if (i4 == 1) {
            J(8);
            return true;
        } else if (i4 == 2) {
            J(E());
            return true;
        } else if (i4 == 3) {
            y();
            a(((i3 >>> 3) << 3) | 4);
            return true;
        } else if (i4 == 4) {
            return false;
        } else {
            if (i4 == 5) {
                J(4);
                return true;
            }
            throw A.b();
        }
    }

    public final byte[] z(int i3) {
        byte[] A3 = A(i3);
        if (A3 != null) {
            return A3;
        }
        int i4 = this.f2439g;
        int i5 = this.f2437e;
        int i6 = i5 - i4;
        this.f2441i += i5;
        this.f2439g = 0;
        this.f2437e = 0;
        ArrayList B3 = B(i3 - i6);
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f2436d, i4, bArr, 0, i6);
        Iterator it = B3.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i6, bArr2.length);
            i6 += bArr2.length;
        }
        return bArr;
    }
}
