package R2;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

public final class h implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1387f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1388g;

    /* renamed from: h  reason: collision with root package name */
    public int f1389h;

    /* renamed from: i  reason: collision with root package name */
    public final ReentrantLock f1390i = new ReentrantLock();

    /* renamed from: j  reason: collision with root package name */
    public final RandomAccessFile f1391j;

    public h(boolean z3, RandomAccessFile randomAccessFile) {
        this.f1387f = z3;
        this.f1391j = randomAccessFile;
    }

    /* JADX INFO: finally extract failed */
    public static c b(h hVar) {
        if (hVar.f1387f) {
            ReentrantLock reentrantLock = hVar.f1390i;
            reentrantLock.lock();
            try {
                if (!hVar.f1388g) {
                    hVar.f1389h++;
                    reentrantLock.unlock();
                    return new c(hVar, 0);
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } else {
            throw new IllegalStateException("file handle is read-only");
        }
    }

    public final void a() {
        if (this.f1387f) {
            ReentrantLock reentrantLock = this.f1390i;
            reentrantLock.lock();
            try {
                if (!this.f1388g) {
                    synchronized (this) {
                        this.f1391j.getFD().sync();
                    }
                    return;
                }
                throw new IllegalStateException("closed");
            } finally {
                reentrantLock.unlock();
            }
        } else {
            throw new IllegalStateException("file handle is read-only");
        }
    }

    public final long c() {
        long length;
        ReentrantLock reentrantLock = this.f1390i;
        reentrantLock.lock();
        try {
            if (!this.f1388g) {
                synchronized (this) {
                    length = this.f1391j.length();
                }
                return length;
            }
            throw new IllegalStateException("closed");
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void close() {
        ReentrantLock reentrantLock = this.f1390i;
        reentrantLock.lock();
        try {
            if (!this.f1388g) {
                this.f1388g = true;
                if (this.f1389h != 0) {
                    reentrantLock.unlock();
                    return;
                }
                reentrantLock.unlock();
                synchronized (this) {
                    this.f1391j.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public final d d(long j3) {
        ReentrantLock reentrantLock = this.f1390i;
        reentrantLock.lock();
        try {
            if (!this.f1388g) {
                this.f1389h++;
                reentrantLock.unlock();
                return new d(this, j3);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
