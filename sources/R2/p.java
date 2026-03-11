package R2;

import A2.i;
import H2.a;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

public final class p implements t, ReadableByteChannel {

    /* renamed from: f  reason: collision with root package name */
    public final t f1400f;

    /* renamed from: g  reason: collision with root package name */
    public final a f1401g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public boolean f1402h;

    /* JADX WARNING: type inference failed for: r2v1, types: [R2.a, java.lang.Object] */
    public p(t tVar) {
        i.e(tVar, "source");
        this.f1400f = tVar;
    }

    public final int a() {
        e(4);
        int h3 = this.f1401g.h();
        return ((h3 & 255) << 24) | ((-16777216 & h3) >>> 24) | ((16711680 & h3) >>> 8) | ((65280 & h3) << 8);
    }

    public final long b() {
        long j3;
        e(8);
        a aVar = this.f1401g;
        if (aVar.f1367g >= 8) {
            q qVar = aVar.f1366f;
            i.b(qVar);
            int i3 = qVar.f1404b;
            int i4 = qVar.f1405c;
            if (((long) (i4 - i3)) < 8) {
                j3 = ((((long) aVar.h()) & 4294967295L) << 32) | (4294967295L & ((long) aVar.h()));
            } else {
                byte[] bArr = qVar.f1403a;
                long j4 = ((((long) bArr[i3]) & 255) << 56) | ((((long) bArr[i3 + 1]) & 255) << 48) | ((((long) bArr[i3 + 2]) & 255) << 40);
                int i5 = i3 + 7;
                int i6 = i3 + 8;
                long j5 = j4 | ((((long) bArr[i3 + 3]) & 255) << 32) | ((((long) bArr[i3 + 4]) & 255) << 24) | ((((long) bArr[i3 + 5]) & 255) << 16) | ((((long) bArr[i3 + 6]) & 255) << 8) | (((long) bArr[i5]) & 255);
                aVar.f1367g -= 8;
                if (i6 == i4) {
                    aVar.f1366f = qVar.a();
                    r.a(qVar);
                } else {
                    qVar.f1404b = i6;
                }
                j3 = j5;
            }
            return ((j3 & 255) << 56) | ((-72057594037927936L & j3) >>> 56) | ((71776119061217280L & j3) >>> 40) | ((280375465082880L & j3) >>> 24) | ((1095216660480L & j3) >>> 8) | ((4278190080L & j3) << 8) | ((16711680 & j3) << 24) | ((65280 & j3) << 40);
        }
        throw new EOFException();
    }

    public final short c() {
        short s3;
        e(2);
        a aVar = this.f1401g;
        if (aVar.f1367g >= 2) {
            q qVar = aVar.f1366f;
            i.b(qVar);
            int i3 = qVar.f1404b;
            int i4 = qVar.f1405c;
            if (i4 - i3 < 2) {
                s3 = (short) ((aVar.d() & 255) | ((aVar.d() & 255) << 8));
            } else {
                int i5 = i3 + 1;
                byte[] bArr = qVar.f1403a;
                int i6 = i3 + 2;
                byte b3 = (bArr[i5] & 255) | ((bArr[i3] & 255) << 8);
                aVar.f1367g -= 2;
                if (i6 == i4) {
                    aVar.f1366f = qVar.a();
                    r.a(qVar);
                } else {
                    qVar.f1404b = i6;
                }
                s3 = (short) b3;
            }
            return (short) (((s3 & 255) << 8) | ((65280 & s3) >>> 8));
        }
        throw new EOFException();
    }

    public final void close() {
        if (!this.f1402h) {
            this.f1402h = true;
            this.f1400f.close();
            a aVar = this.f1401g;
            aVar.i(aVar.f1367g);
        }
    }

    public final String d(long j3) {
        e(j3);
        a aVar = this.f1401g;
        aVar.getClass();
        Charset charset = a.f485a;
        i.e(charset, "charset");
        int i3 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        } else if (aVar.f1367g < j3) {
            throw new EOFException();
        } else if (i3 == 0) {
            return "";
        } else {
            q qVar = aVar.f1366f;
            i.b(qVar);
            int i4 = qVar.f1404b;
            if (((long) i4) + j3 > ((long) qVar.f1405c)) {
                return new String(aVar.e(j3), charset);
            }
            int i5 = (int) j3;
            String str = new String(qVar.f1403a, i4, i5, charset);
            int i6 = qVar.f1404b + i5;
            qVar.f1404b = i6;
            aVar.f1367g -= j3;
            if (i6 == qVar.f1405c) {
                aVar.f1366f = qVar.a();
                r.a(qVar);
            }
            return str;
        }
    }

    public final void e(long j3) {
        a aVar;
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        } else if (!this.f1402h) {
            do {
                aVar = this.f1401g;
                if (aVar.f1367g >= j3) {
                    return;
                }
            } while (this.f1400f.f(aVar, 8192) != -1);
            throw new EOFException();
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final long f(a aVar, long j3) {
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        } else if (!this.f1402h) {
            a aVar2 = this.f1401g;
            if (aVar2.f1367g == 0 && this.f1400f.f(aVar2, 8192) == -1) {
                return -1;
            }
            return aVar2.f(aVar, Math.min(j3, aVar2.f1367g));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final void g(long j3) {
        if (!this.f1402h) {
            while (j3 > 0) {
                a aVar = this.f1401g;
                if (aVar.f1367g == 0 && this.f1400f.f(aVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j3, aVar.f1367g);
                aVar.i(min);
                j3 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final boolean isOpen() {
        return !this.f1402h;
    }

    public final int read(ByteBuffer byteBuffer) {
        i.e(byteBuffer, "sink");
        a aVar = this.f1401g;
        if (aVar.f1367g == 0 && this.f1400f.f(aVar, 8192) == -1) {
            return -1;
        }
        return aVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f1400f + ')';
    }
}
