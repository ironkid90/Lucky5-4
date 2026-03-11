package R2;

import A2.i;
import a.C0094a;
import java.io.Closeable;
import java.io.Flushable;
import java.util.concurrent.locks.ReentrantLock;

public final class c implements Closeable, Flushable {

    /* renamed from: f  reason: collision with root package name */
    public final h f1372f;

    /* renamed from: g  reason: collision with root package name */
    public long f1373g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1374h;

    public c(h hVar, long j3) {
        i.e(hVar, "fileHandle");
        this.f1372f = hVar;
        this.f1373g = j3;
    }

    public final void a(a aVar, long j3) {
        if (!this.f1374h) {
            h hVar = this.f1372f;
            long j4 = this.f1373g;
            hVar.getClass();
            C0094a.e(aVar.f1367g, 0, j3);
            long j5 = j4 + j3;
            while (j4 < j5) {
                q qVar = aVar.f1366f;
                i.b(qVar);
                int min = (int) Math.min(j5 - j4, (long) (qVar.f1405c - qVar.f1404b));
                byte[] bArr = qVar.f1403a;
                int i3 = qVar.f1404b;
                synchronized (hVar) {
                    i.e(bArr, "array");
                    hVar.f1391j.seek(j4);
                    hVar.f1391j.write(bArr, i3, min);
                }
                int i4 = qVar.f1404b + min;
                qVar.f1404b = i4;
                long j6 = (long) min;
                j4 += j6;
                aVar.f1367g -= j6;
                if (i4 == qVar.f1405c) {
                    aVar.f1366f = qVar.a();
                    r.a(qVar);
                }
            }
            this.f1373g += j3;
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void close() {
        if (!this.f1374h) {
            this.f1374h = true;
            h hVar = this.f1372f;
            ReentrantLock reentrantLock = hVar.f1390i;
            reentrantLock.lock();
            try {
                int i3 = hVar.f1389h - 1;
                hVar.f1389h = i3;
                if (i3 != 0 || !hVar.f1388g) {
                    reentrantLock.unlock();
                    return;
                }
                synchronized (hVar) {
                    hVar.f1391j.close();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void flush() {
        if (!this.f1374h) {
            h hVar = this.f1372f;
            synchronized (hVar) {
                hVar.f1391j.getFD().sync();
            }
            return;
        }
        throw new IllegalStateException("closed");
    }
}
