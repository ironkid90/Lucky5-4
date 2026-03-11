package s1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: s1.d  reason: case insensitive filesystem */
public final class C0443d extends FilterInputStream {

    /* renamed from: f  reason: collision with root package name */
    public long f4553f = 1048577;

    /* renamed from: g  reason: collision with root package name */
    public long f4554g = -1;

    public C0443d(InputStream inputStream) {
        super(inputStream);
    }

    public final int available() {
        return (int) Math.min((long) this.in.available(), this.f4553f);
    }

    public final synchronized void mark(int i3) {
        this.in.mark(i3);
        this.f4554g = this.f4553f;
    }

    public final int read() {
        if (this.f4553f == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f4553f--;
        }
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f4554g != -1) {
            this.in.reset();
            this.f4553f = this.f4554g;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j3) {
        long skip = this.in.skip(Math.min(j3, this.f4553f));
        this.f4553f -= skip;
        return skip;
    }

    public final int read(byte[] bArr, int i3, int i4) {
        long j3 = this.f4553f;
        if (j3 == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i3, (int) Math.min((long) i4, j3));
        if (read != -1) {
            this.f4553f -= (long) read;
        }
        return read;
    }
}
