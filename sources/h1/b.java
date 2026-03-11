package h1;

import java.io.OutputStream;

public final class b extends OutputStream {

    /* renamed from: f  reason: collision with root package name */
    public long f3037f;

    public final void write(int i3) {
        this.f3037f++;
    }

    public final void write(byte[] bArr) {
        this.f3037f += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i3, int i4) {
        int i5;
        if (i3 < 0 || i3 > bArr.length || i4 < 0 || (i5 = i3 + i4) > bArr.length || i5 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f3037f += (long) i4;
    }
}
