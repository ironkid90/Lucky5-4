package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: androidx.datastore.preferences.protobuf.h  reason: case insensitive filesystem */
public final class C0104h extends C0106j {

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f2427c;

    /* renamed from: d  reason: collision with root package name */
    public int f2428d;

    /* renamed from: e  reason: collision with root package name */
    public int f2429e;

    /* renamed from: f  reason: collision with root package name */
    public int f2430f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2431g;

    /* renamed from: h  reason: collision with root package name */
    public int f2432h;

    /* renamed from: i  reason: collision with root package name */
    public int f2433i = Integer.MAX_VALUE;

    public C0104h(byte[] bArr, int i3, int i4, boolean z3) {
        this.f2427c = bArr;
        this.f2428d = i4 + i3;
        this.f2430f = i3;
        this.f2431g = i3;
    }

    public final long A() {
        int i3 = this.f2430f;
        if (this.f2428d - i3 >= 8) {
            this.f2430f = i3 + 8;
            byte[] bArr = this.f2427c;
            return ((((long) bArr[i3 + 7]) & 255) << 56) | (((long) bArr[i3]) & 255) | ((((long) bArr[i3 + 1]) & 255) << 8) | ((((long) bArr[i3 + 2]) & 255) << 16) | ((((long) bArr[i3 + 3]) & 255) << 24) | ((((long) bArr[i3 + 4]) & 255) << 32) | ((((long) bArr[i3 + 5]) & 255) << 40) | ((((long) bArr[i3 + 6]) & 255) << 48);
        }
        throw A.e();
    }

    public final int B() {
        byte b3;
        byte b4;
        int i3 = this.f2430f;
        int i4 = this.f2428d;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.f2427c;
            byte b5 = bArr[i3];
            if (b5 >= 0) {
                this.f2430f = i5;
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
                this.f2430f = i6;
                return b3;
            }
        }
        return (int) D();
    }

    public final long C() {
        long j3;
        long j4;
        long j5;
        long j6;
        int i3 = this.f2430f;
        int i4 = this.f2428d;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.f2427c;
            byte b3 = bArr[i3];
            if (b3 >= 0) {
                this.f2430f = i5;
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
                this.f2430f = i6;
                return j3;
            }
        }
        return D();
    }

    public final long D() {
        long j3 = 0;
        int i3 = 0;
        while (i3 < 64) {
            int i4 = this.f2430f;
            if (i4 != this.f2428d) {
                this.f2430f = i4 + 1;
                byte b3 = this.f2427c[i4];
                j3 |= ((long) (b3 & Byte.MAX_VALUE)) << i3;
                if ((b3 & 128) == 0) {
                    return j3;
                }
                i3 += 7;
            } else {
                throw A.e();
            }
        }
        throw A.c();
    }

    public final void E() {
        int i3 = this.f2428d + this.f2429e;
        this.f2428d = i3;
        int i4 = i3 - this.f2431g;
        int i5 = this.f2433i;
        if (i4 > i5) {
            int i6 = i4 - i5;
            this.f2429e = i6;
            this.f2428d = i3 - i6;
            return;
        }
        this.f2429e = 0;
    }

    public final void F(int i3) {
        if (i3 >= 0) {
            int i4 = this.f2428d;
            int i5 = this.f2430f;
            if (i3 <= i4 - i5) {
                this.f2430f = i5 + i3;
                return;
            }
        }
        if (i3 < 0) {
            throw A.d();
        }
        throw A.e();
    }

    public final void a(int i3) {
        if (this.f2432h != i3) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        return this.f2430f - this.f2431g;
    }

    public final boolean c() {
        if (this.f2430f == this.f2428d) {
            return true;
        }
        return false;
    }

    public final void d(int i3) {
        this.f2433i = i3;
        E();
    }

    public final int e(int i3) {
        if (i3 >= 0) {
            int b3 = b() + i3;
            if (b3 >= 0) {
                int i4 = this.f2433i;
                if (b3 <= i4) {
                    this.f2433i = b3;
                    E();
                    return i4;
                }
                throw A.e();
            }
            throw new IOException("Failed to parse the message.");
        }
        throw A.d();
    }

    public final boolean f() {
        if (C() != 0) {
            return true;
        }
        return false;
    }

    public final C0103g g() {
        byte[] bArr;
        int B3 = B();
        byte[] bArr2 = this.f2427c;
        if (B3 > 0) {
            int i3 = this.f2428d;
            int i4 = this.f2430f;
            if (B3 <= i3 - i4) {
                C0103g c3 = C0103g.c(bArr2, i4, B3);
                this.f2430f += B3;
                return c3;
            }
        }
        if (B3 == 0) {
            return C0103g.f2423h;
        }
        if (B3 > 0) {
            int i5 = this.f2428d;
            int i6 = this.f2430f;
            if (B3 <= i5 - i6) {
                int i7 = B3 + i6;
                this.f2430f = i7;
                bArr = Arrays.copyOfRange(bArr2, i6, i7);
                C0103g gVar = C0103g.f2423h;
                return new C0103g(bArr);
            }
        }
        if (B3 > 0) {
            throw A.e();
        } else if (B3 == 0) {
            bArr = C0120y.f2498b;
            C0103g gVar2 = C0103g.f2423h;
            return new C0103g(bArr);
        } else {
            throw A.d();
        }
    }

    public final double h() {
        return Double.longBitsToDouble(A());
    }

    public final int i() {
        return B();
    }

    public final int j() {
        return z();
    }

    public final long k() {
        return A();
    }

    public final float l() {
        return Float.intBitsToFloat(z());
    }

    public final int m() {
        return B();
    }

    public final long n() {
        return C();
    }

    public final int o() {
        return z();
    }

    public final long p() {
        return A();
    }

    public final int q() {
        int B3 = B();
        return (-(B3 & 1)) ^ (B3 >>> 1);
    }

    public final long r() {
        long C3 = C();
        return (-(C3 & 1)) ^ (C3 >>> 1);
    }

    public final String s() {
        int B3 = B();
        if (B3 > 0) {
            int i3 = this.f2428d;
            int i4 = this.f2430f;
            if (B3 <= i3 - i4) {
                String str = new String(this.f2427c, i4, B3, C0120y.f2497a);
                this.f2430f += B3;
                return str;
            }
        }
        if (B3 == 0) {
            return "";
        }
        if (B3 < 0) {
            throw A.d();
        }
        throw A.e();
    }

    public final String t() {
        int B3 = B();
        if (B3 > 0) {
            int i3 = this.f2428d;
            int i4 = this.f2430f;
            if (B3 <= i3 - i4) {
                String m3 = l0.f2456a.m(this.f2427c, i4, B3);
                this.f2430f += B3;
                return m3;
            }
        }
        if (B3 == 0) {
            return "";
        }
        if (B3 <= 0) {
            throw A.d();
        }
        throw A.e();
    }

    public final int u() {
        if (c()) {
            this.f2432h = 0;
            return 0;
        }
        int B3 = B();
        this.f2432h = B3;
        if ((B3 >>> 3) != 0) {
            return B3;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public final int v() {
        return B();
    }

    public final long w() {
        return C();
    }

    public final boolean x(int i3) {
        int i4 = i3 & 7;
        int i5 = 0;
        if (i4 == 0) {
            int i6 = this.f2428d - this.f2430f;
            byte[] bArr = this.f2427c;
            if (i6 >= 10) {
                while (i5 < 10) {
                    int i7 = this.f2430f;
                    this.f2430f = i7 + 1;
                    if (bArr[i7] < 0) {
                        i5++;
                    }
                }
                throw A.c();
            }
            while (i5 < 10) {
                int i8 = this.f2430f;
                if (i8 != this.f2428d) {
                    this.f2430f = i8 + 1;
                    if (bArr[i8] < 0) {
                        i5++;
                    }
                } else {
                    throw A.e();
                }
            }
            throw A.c();
            return true;
        } else if (i4 == 1) {
            F(8);
            return true;
        } else if (i4 == 2) {
            F(B());
            return true;
        } else if (i4 == 3) {
            y();
            a(((i3 >>> 3) << 3) | 4);
            return true;
        } else if (i4 == 4) {
            return false;
        } else {
            if (i4 == 5) {
                F(4);
                return true;
            }
            throw A.b();
        }
    }

    public final int z() {
        int i3 = this.f2430f;
        if (this.f2428d - i3 >= 4) {
            this.f2430f = i3 + 4;
            byte[] bArr = this.f2427c;
            return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
        }
        throw A.e();
    }
}
