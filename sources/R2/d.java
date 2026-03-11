package R2;

import A2.i;
import java.util.concurrent.locks.ReentrantLock;

public final class d implements t {

    /* renamed from: f  reason: collision with root package name */
    public final h f1375f;

    /* renamed from: g  reason: collision with root package name */
    public long f1376g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1377h;

    public d(h hVar, long j3) {
        i.e(hVar, "fileHandle");
        this.f1375f = hVar;
        this.f1376g = j3;
    }

    public final void close() {
        if (!this.f1377h) {
            this.f1377h = true;
            h hVar = this.f1375f;
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

    public final long f(a aVar, long j3) {
        long j4;
        long j5;
        int i3;
        int i4;
        a aVar2 = aVar;
        long j6 = j3;
        if (!this.f1377h) {
            h hVar = this.f1375f;
            long j7 = this.f1376g;
            hVar.getClass();
            if (j6 >= 0) {
                long j8 = j6 + j7;
                long j9 = j7;
                while (true) {
                    if (j9 >= j8) {
                        break;
                    }
                    q k3 = aVar2.k(1);
                    byte[] bArr = k3.f1403a;
                    int i5 = k3.f1405c;
                    int min = (int) Math.min(j8 - j9, (long) (8192 - i5));
                    synchronized (hVar) {
                        i.e(bArr, "array");
                        hVar.f1391j.seek(j9);
                        i3 = 0;
                        while (true) {
                            if (i3 >= min) {
                                break;
                            }
                            int read = hVar.f1391j.read(bArr, i5, min - i3);
                            if (read != -1) {
                                i3 += read;
                            } else if (i3 == 0) {
                                i4 = -1;
                                i3 = -1;
                            }
                        }
                        i4 = -1;
                    }
                    if (i3 == i4) {
                        if (k3.f1404b == k3.f1405c) {
                            aVar2.f1366f = k3.a();
                            r.a(k3);
                        }
                        if (j7 == j9) {
                            j5 = -1;
                            j4 = -1;
                        }
                    } else {
                        k3.f1405c += i3;
                        long j10 = (long) i3;
                        j9 += j10;
                        aVar2.f1367g += j10;
                    }
                }
                j4 = j9 - j7;
                j5 = -1;
                if (j4 != j5) {
                    this.f1376g += j4;
                }
                return j4;
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j6).toString());
        }
        throw new IllegalStateException("closed");
    }
}
