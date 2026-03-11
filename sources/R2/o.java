package R2;

import A2.i;
import a.C0094a;
import java.io.IOException;
import java.io.InputStream;

public final class o extends InputStream {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p f1399f;

    public o(p pVar) {
        this.f1399f = pVar;
    }

    public final int available() {
        p pVar = this.f1399f;
        if (!pVar.f1402h) {
            return (int) Math.min(pVar.f1401g.f1367g, (long) Integer.MAX_VALUE);
        }
        throw new IOException("closed");
    }

    public final void close() {
        this.f1399f.close();
    }

    public final int read() {
        p pVar = this.f1399f;
        if (!pVar.f1402h) {
            a aVar = pVar.f1401g;
            if (aVar.f1367g == 0 && pVar.f1400f.f(aVar, 8192) == -1) {
                return -1;
            }
            return aVar.d() & 255;
        }
        throw new IOException("closed");
    }

    public final String toString() {
        return this.f1399f + ".inputStream()";
    }

    public final int read(byte[] bArr, int i3, int i4) {
        i.e(bArr, "data");
        p pVar = this.f1399f;
        if (!pVar.f1402h) {
            C0094a.e((long) bArr.length, (long) i3, (long) i4);
            a aVar = pVar.f1401g;
            if (aVar.f1367g == 0 && pVar.f1400f.f(aVar, 8192) == -1) {
                return -1;
            }
            return aVar.read(bArr, i3, i4);
        }
        throw new IOException("closed");
    }
}
