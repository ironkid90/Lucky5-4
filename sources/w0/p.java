package W0;

import F0.v;
import G0.o;
import K2.l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class p extends h {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1888a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final v f1889b = new v();

    /* renamed from: c  reason: collision with root package name */
    public boolean f1890c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f1891d;

    /* renamed from: e  reason: collision with root package name */
    public Object f1892e;

    /* renamed from: f  reason: collision with root package name */
    public Exception f1893f;

    public final p a(Executor executor, e eVar) {
        this.f1889b.d(new l(executor, eVar));
        o();
        return this;
    }

    public final Exception b() {
        Exception exc;
        synchronized (this.f1888a) {
            exc = this.f1893f;
        }
        return exc;
    }

    public final Object c() {
        Object obj;
        synchronized (this.f1888a) {
            try {
                if (!this.f1890c) {
                    throw new IllegalStateException("Task is not yet complete");
                } else if (!this.f1891d) {
                    Exception exc = this.f1893f;
                    if (exc == null) {
                        obj = this.f1892e;
                    } else {
                        throw new RuntimeException(exc);
                    }
                } else {
                    throw new CancellationException("Task is already canceled.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean d() {
        boolean z3;
        synchronized (this.f1888a) {
            z3 = this.f1890c;
        }
        return z3;
    }

    public final boolean e() {
        boolean z3;
        synchronized (this.f1888a) {
            try {
                z3 = false;
                if (this.f1890c && !this.f1891d && this.f1893f == null) {
                    z3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public final p f(c cVar) {
        this.f1889b.d(new l((Executor) j.f1876a, cVar));
        o();
        return this;
    }

    public final p g(Executor executor, c cVar) {
        this.f1889b.d(new l(executor, cVar));
        o();
        return this;
    }

    public final p h(Executor executor, a aVar) {
        p pVar = new p();
        this.f1889b.d(new k(executor, aVar, pVar, 0));
        o();
        return pVar;
    }

    public final p i(Executor executor, a aVar) {
        p pVar = new p();
        this.f1889b.d(new k(executor, aVar, pVar, 1));
        o();
        return pVar;
    }

    public final p j(Executor executor, g gVar) {
        p pVar = new p();
        this.f1889b.d(new l(executor, gVar, pVar));
        o();
        return pVar;
    }

    public final void k(Exception exc) {
        o.f(exc, "Exception must not be null");
        synchronized (this.f1888a) {
            n();
            this.f1890c = true;
            this.f1893f = exc;
        }
        this.f1889b.e(this);
    }

    public final void l(Object obj) {
        synchronized (this.f1888a) {
            n();
            this.f1890c = true;
            this.f1892e = obj;
        }
        this.f1889b.e(this);
    }

    public final void m() {
        synchronized (this.f1888a) {
            try {
                if (!this.f1890c) {
                    this.f1890c = true;
                    this.f1891d = true;
                    this.f1889b.e(this);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void n() {
        IllegalStateException illegalStateException;
        String str;
        if (this.f1890c) {
            int i3 = l.f904f;
            if (d()) {
                Exception b3 = b();
                if (b3 != null) {
                    str = "failure";
                } else if (e()) {
                    str = "result ".concat(String.valueOf(c()));
                } else if (this.f1891d) {
                    str = "cancellation";
                } else {
                    str = "unknown issue";
                }
                illegalStateException = new IllegalStateException("Complete with: ".concat(str), b3);
            } else {
                illegalStateException = new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            throw illegalStateException;
        }
    }

    public final void o() {
        synchronized (this.f1888a) {
            try {
                if (this.f1890c) {
                    this.f1889b.e(this);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
