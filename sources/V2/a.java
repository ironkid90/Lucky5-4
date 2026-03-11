package V2;

import A2.i;
import android.media.MediaDataSource;

public final class a extends MediaDataSource {

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f1871f;

    public a(byte[] bArr) {
        this.f1871f = bArr;
    }

    public final synchronized void close() {
    }

    public final synchronized long getSize() {
        return (long) this.f1871f.length;
    }

    public final synchronized int readAt(long j3, byte[] bArr, int i3, int i4) {
        i.e(bArr, "buffer");
        byte[] bArr2 = this.f1871f;
        if (j3 >= ((long) bArr2.length)) {
            return -1;
        }
        long j4 = (long) i4;
        long j5 = j3 + j4;
        if (j5 > ((long) bArr2.length)) {
            j4 -= j5 - ((long) bArr2.length);
        }
        int i5 = (int) j4;
        System.arraycopy(bArr2, (int) j3, bArr, i3, i5);
        return i5;
    }
}
