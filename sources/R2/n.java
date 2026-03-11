package R2;

import A2.i;
import java.io.Closeable;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class n implements Closeable, Flushable, WritableByteChannel {

    /* renamed from: f  reason: collision with root package name */
    public final c f1396f;

    /* renamed from: g  reason: collision with root package name */
    public final a f1397g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public boolean f1398h;

    /* JADX WARNING: type inference failed for: r1v1, types: [R2.a, java.lang.Object] */
    public n(c cVar) {
        this.f1396f = cVar;
    }

    public final void a() {
        if (!this.f1398h) {
            a aVar = this.f1397g;
            long j3 = aVar.f1367g;
            if (j3 == 0) {
                j3 = 0;
            } else {
                q qVar = aVar.f1366f;
                i.b(qVar);
                q qVar2 = qVar.f1409g;
                i.b(qVar2);
                int i3 = qVar2.f1405c;
                if (i3 < 8192 && qVar2.f1407e) {
                    j3 -= (long) (i3 - qVar2.f1404b);
                }
            }
            if (j3 > 0) {
                this.f1396f.a(aVar, j3);
                return;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void close() {
        c cVar = this.f1396f;
        if (!this.f1398h) {
            try {
                a aVar = this.f1397g;
                long j3 = aVar.f1367g;
                if (j3 > 0) {
                    cVar.a(aVar, j3);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                cVar.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f1398h = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final void flush() {
        if (!this.f1398h) {
            a aVar = this.f1397g;
            long j3 = aVar.f1367g;
            int i3 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
            c cVar = this.f1396f;
            if (i3 > 0) {
                cVar.a(aVar, j3);
            }
            cVar.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final boolean isOpen() {
        return !this.f1398h;
    }

    public final String toString() {
        return "buffer(" + this.f1396f + ')';
    }

    public final int write(ByteBuffer byteBuffer) {
        i.e(byteBuffer, "source");
        if (!this.f1398h) {
            int write = this.f1397g.write(byteBuffer);
            a();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
