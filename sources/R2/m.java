package R2;

import A2.i;
import java.io.IOException;
import java.io.OutputStream;

public final class m extends OutputStream {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ n f1395f;

    public m(n nVar) {
        this.f1395f = nVar;
    }

    public final void close() {
        this.f1395f.close();
    }

    public final void flush() {
        n nVar = this.f1395f;
        if (!nVar.f1398h) {
            nVar.flush();
        }
    }

    public final String toString() {
        return this.f1395f + ".outputStream()";
    }

    public final void write(int i3) {
        n nVar = this.f1395f;
        if (!nVar.f1398h) {
            nVar.f1397g.o((byte) i3);
            nVar.a();
            return;
        }
        throw new IOException("closed");
    }

    public final void write(byte[] bArr, int i3, int i4) {
        i.e(bArr, "data");
        n nVar = this.f1395f;
        if (!nVar.f1398h) {
            nVar.f1397g.n(bArr, i3, i4);
            nVar.a();
            return;
        }
        throw new IOException("closed");
    }
}
