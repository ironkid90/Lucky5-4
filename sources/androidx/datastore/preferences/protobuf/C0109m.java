package androidx.datastore.preferences.protobuf;

import a.C0094a;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.m  reason: case insensitive filesystem */
public final class C0109m extends C0094a {

    /* renamed from: q  reason: collision with root package name */
    public static final Logger f2457q = Logger.getLogger(C0109m.class.getName());

    /* renamed from: r  reason: collision with root package name */
    public static final boolean f2458r = i0.f2446d;

    /* renamed from: l  reason: collision with root package name */
    public F f2459l;

    /* renamed from: m  reason: collision with root package name */
    public final byte[] f2460m;

    /* renamed from: n  reason: collision with root package name */
    public final int f2461n;

    /* renamed from: o  reason: collision with root package name */
    public int f2462o;

    /* renamed from: p  reason: collision with root package name */
    public final OutputStream f2463p;

    public C0109m(OutputStream outputStream, int i3) {
        super(10);
        if (i3 >= 0) {
            int max = Math.max(i3, 20);
            this.f2460m = new byte[max];
            this.f2461n = max;
            if (outputStream != null) {
                this.f2463p = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public static int e0(int i3) {
        return u0(i3) + 1;
    }

    public static int f0(int i3, C0103g gVar) {
        int u02 = u0(i3);
        int size = gVar.size();
        return w0(size) + size + u02;
    }

    public static int g0(int i3) {
        return u0(i3) + 8;
    }

    public static int h0(int i3, int i4) {
        return y0((long) i4) + u0(i3);
    }

    public static int i0(int i3) {
        return u0(i3) + 4;
    }

    public static int j0(int i3) {
        return u0(i3) + 8;
    }

    public static int k0(int i3) {
        return u0(i3) + 4;
    }

    public static int l0(int i3, C0097a aVar, W w3) {
        return aVar.a(w3) + (u0(i3) * 2);
    }

    public static int m0(int i3, int i4) {
        return y0((long) i4) + u0(i3);
    }

    public static int n0(long j3, int i3) {
        return y0(j3) + u0(i3);
    }

    public static int o0(int i3) {
        return u0(i3) + 4;
    }

    public static int p0(int i3) {
        return u0(i3) + 8;
    }

    public static int q0(int i3, int i4) {
        return w0((i4 >> 31) ^ (i4 << 1)) + u0(i3);
    }

    public static int r0(long j3, int i3) {
        return y0((j3 >> 63) ^ (j3 << 1)) + u0(i3);
    }

    public static int s0(String str, int i3) {
        return t0(str) + u0(i3);
    }

    public static int t0(String str) {
        int i3;
        try {
            i3 = l0.a(str);
        } catch (k0 unused) {
            i3 = str.getBytes(C0120y.f2497a).length;
        }
        return w0(i3) + i3;
    }

    public static int u0(int i3) {
        return w0(i3 << 3);
    }

    public static int v0(int i3, int i4) {
        return w0(i4) + u0(i3);
    }

    public static int w0(int i3) {
        return (352 - (Integer.numberOfLeadingZeros(i3) * 9)) >>> 6;
    }

    public static int x0(long j3, int i3) {
        return y0(j3) + u0(i3);
    }

    public static int y0(long j3) {
        return (640 - (Long.numberOfLeadingZeros(j3) * 9)) >>> 6;
    }

    public final void A0(int i3) {
        if (this.f2461n - this.f2462o < i3) {
            z0();
        }
    }

    public final void B0(byte b3) {
        if (this.f2462o == this.f2461n) {
            z0();
        }
        int i3 = this.f2462o;
        this.f2462o = i3 + 1;
        this.f2460m[i3] = b3;
    }

    public final void C0(byte[] bArr, int i3, int i4) {
        int i5 = this.f2462o;
        int i6 = this.f2461n;
        int i7 = i6 - i5;
        byte[] bArr2 = this.f2460m;
        if (i7 >= i4) {
            System.arraycopy(bArr, i3, bArr2, i5, i4);
            this.f2462o += i4;
            return;
        }
        System.arraycopy(bArr, i3, bArr2, i5, i7);
        int i8 = i3 + i7;
        int i9 = i4 - i7;
        this.f2462o = i6;
        z0();
        if (i9 <= i6) {
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            this.f2462o = i9;
            return;
        }
        this.f2463p.write(bArr, i8, i9);
    }

    public final void D0(int i3, boolean z3) {
        A0(11);
        b0(i3, 0);
        byte b3 = z3 ? (byte) 1 : 0;
        int i4 = this.f2462o;
        this.f2462o = i4 + 1;
        this.f2460m[i4] = b3;
    }

    public final void E0(int i3, C0103g gVar) {
        O0(i3, 2);
        F0(gVar);
    }

    public final void F0(C0103g gVar) {
        Q0(gVar.size());
        S(gVar.f2426g, gVar.e(), gVar.size());
    }

    public final void G0(int i3, int i4) {
        A0(14);
        b0(i3, 5);
        Z(i4);
    }

    public final void H0(int i3) {
        A0(4);
        Z(i3);
    }

    public final void I0(long j3, int i3) {
        A0(18);
        b0(i3, 1);
        a0(j3);
    }

    public final void J0(long j3) {
        A0(8);
        a0(j3);
    }

    public final void K0(int i3, int i4) {
        A0(20);
        b0(i3, 0);
        if (i4 >= 0) {
            c0(i4);
        } else {
            d0((long) i4);
        }
    }

    public final void L0(int i3) {
        if (i3 >= 0) {
            Q0(i3);
        } else {
            S0((long) i3);
        }
    }

    public final void M0(String str, int i3) {
        O0(i3, 2);
        N0(str);
    }

    public final void N0(String str) {
        int i3;
        try {
            int length = str.length() * 3;
            int w02 = w0(length);
            int i4 = w02 + length;
            int i5 = this.f2461n;
            if (i4 > i5) {
                byte[] bArr = new byte[length];
                int r3 = l0.f2456a.r(str, bArr, 0, length);
                Q0(r3);
                C0(bArr, 0, r3);
                return;
            }
            if (i4 > i5 - this.f2462o) {
                z0();
            }
            int w03 = w0(str.length());
            i3 = this.f2462o;
            byte[] bArr2 = this.f2460m;
            if (w03 == w02) {
                int i6 = i3 + w03;
                this.f2462o = i6;
                int r4 = l0.f2456a.r(str, bArr2, i6, i5 - i6);
                this.f2462o = i3;
                c0((r4 - i3) - w03);
                this.f2462o = r4;
                return;
            }
            int a2 = l0.a(str);
            c0(a2);
            this.f2462o = l0.f2456a.r(str, bArr2, this.f2462o, a2);
        } catch (k0 e2) {
            this.f2462o = i3;
            throw e2;
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw new C0108l(e3);
        } catch (k0 e4) {
            f2457q.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e4);
            byte[] bytes = str.getBytes(C0120y.f2497a);
            try {
                Q0(bytes.length);
                S(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e5) {
                throw new C0108l(e5);
            }
        }
    }

    public final void O0(int i3, int i4) {
        Q0((i3 << 3) | i4);
    }

    public final void P0(int i3, int i4) {
        A0(20);
        b0(i3, 0);
        c0(i4);
    }

    public final void Q0(int i3) {
        A0(5);
        c0(i3);
    }

    public final void R0(long j3, int i3) {
        A0(20);
        b0(i3, 0);
        d0(j3);
    }

    public final void S(byte[] bArr, int i3, int i4) {
        C0(bArr, i3, i4);
    }

    public final void S0(long j3) {
        A0(10);
        d0(j3);
    }

    public final void Z(int i3) {
        int i4 = this.f2462o;
        int i5 = i4 + 1;
        this.f2462o = i5;
        byte[] bArr = this.f2460m;
        bArr[i4] = (byte) (i3 & 255);
        int i6 = i4 + 2;
        this.f2462o = i6;
        bArr[i5] = (byte) ((i3 >> 8) & 255);
        int i7 = i4 + 3;
        this.f2462o = i7;
        bArr[i6] = (byte) ((i3 >> 16) & 255);
        this.f2462o = i4 + 4;
        bArr[i7] = (byte) ((i3 >> 24) & 255);
    }

    public final void a0(long j3) {
        int i3 = this.f2462o;
        int i4 = i3 + 1;
        this.f2462o = i4;
        byte[] bArr = this.f2460m;
        bArr[i3] = (byte) ((int) (j3 & 255));
        int i5 = i3 + 2;
        this.f2462o = i5;
        bArr[i4] = (byte) ((int) ((j3 >> 8) & 255));
        int i6 = i3 + 3;
        this.f2462o = i6;
        bArr[i5] = (byte) ((int) ((j3 >> 16) & 255));
        int i7 = i3 + 4;
        this.f2462o = i7;
        bArr[i6] = (byte) ((int) (255 & (j3 >> 24)));
        int i8 = i3 + 5;
        this.f2462o = i8;
        bArr[i7] = (byte) (((int) (j3 >> 32)) & 255);
        int i9 = i3 + 6;
        this.f2462o = i9;
        bArr[i8] = (byte) (((int) (j3 >> 40)) & 255);
        int i10 = i3 + 7;
        this.f2462o = i10;
        bArr[i9] = (byte) (((int) (j3 >> 48)) & 255);
        this.f2462o = i3 + 8;
        bArr[i10] = (byte) (((int) (j3 >> 56)) & 255);
    }

    public final void b0(int i3, int i4) {
        c0((i3 << 3) | i4);
    }

    public final void c0(int i3) {
        boolean z3 = f2458r;
        byte[] bArr = this.f2460m;
        if (z3) {
            while ((i3 & -128) != 0) {
                int i4 = this.f2462o;
                this.f2462o = i4 + 1;
                i0.j(bArr, (long) i4, (byte) ((i3 | 128) & 255));
                i3 >>>= 7;
            }
            int i5 = this.f2462o;
            this.f2462o = i5 + 1;
            i0.j(bArr, (long) i5, (byte) i3);
            return;
        }
        while ((i3 & -128) != 0) {
            int i6 = this.f2462o;
            this.f2462o = i6 + 1;
            bArr[i6] = (byte) ((i3 | 128) & 255);
            i3 >>>= 7;
        }
        int i7 = this.f2462o;
        this.f2462o = i7 + 1;
        bArr[i7] = (byte) i3;
    }

    public final void d0(long j3) {
        boolean z3 = f2458r;
        byte[] bArr = this.f2460m;
        if (z3) {
            while ((j3 & -128) != 0) {
                int i3 = this.f2462o;
                this.f2462o = i3 + 1;
                i0.j(bArr, (long) i3, (byte) ((((int) j3) | 128) & 255));
                j3 >>>= 7;
            }
            int i4 = this.f2462o;
            this.f2462o = i4 + 1;
            i0.j(bArr, (long) i4, (byte) ((int) j3));
            return;
        }
        while ((j3 & -128) != 0) {
            int i5 = this.f2462o;
            this.f2462o = i5 + 1;
            bArr[i5] = (byte) ((((int) j3) | 128) & 255);
            j3 >>>= 7;
        }
        int i6 = this.f2462o;
        this.f2462o = i6 + 1;
        bArr[i6] = (byte) ((int) j3);
    }

    public final void z0() {
        this.f2463p.write(this.f2460m, 0, this.f2462o);
        this.f2462o = 0;
    }
}
