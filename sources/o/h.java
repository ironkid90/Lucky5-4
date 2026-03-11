package o;

import M0.a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class h implements Future {

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f4131i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f4132j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f4133k;

    /* renamed from: l  reason: collision with root package name */
    public static final Object f4134l = new Object();

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f4135f;

    /* renamed from: g  reason: collision with root package name */
    public volatile d f4136g;

    /* renamed from: h  reason: collision with root package name */
    public volatile g f4137h;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: o.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: o.e} */
    /* JADX WARNING: type inference failed for: r2v3, types: [M0.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<o.g> r0 = o.g.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f4131i = r1
            java.lang.Class<o.h> r1 = o.h.class
            java.lang.String r2 = r1.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            f4132j = r2
            o.e r2 = new o.e     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r4 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r3, r4)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "h"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<o.d> r0 = o.d.class
            java.lang.String r3 = "g"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r3 = "f"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0048 }
            r0 = 0
            goto L_0x004e
        L_0x0048:
            r0 = move-exception
            o.f r2 = new o.f
            r2.<init>()
        L_0x004e:
            f4133k = r2
            if (r0 == 0) goto L_0x005b
            java.util.logging.Logger r1 = f4132j
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x005b:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f4134l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.h.<clinit>():void");
    }

    public static void c(h hVar) {
        g gVar;
        d dVar;
        do {
            gVar = hVar.f4137h;
        } while (!f4133k.d(hVar, gVar, g.f4128c));
        while (gVar != null) {
            Thread thread = gVar.f4129a;
            if (thread != null) {
                gVar.f4129a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f4130b;
        }
        hVar.b();
        do {
            dVar = hVar.f4136g;
        } while (!f4133k.b(hVar, dVar));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f4122a;
            dVar.f4122a = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            dVar2 = dVar2.f4122a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f4132j.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", e2);
            }
        }
    }

    public static Object d(Object obj) {
        if (obj instanceof C0350a) {
            CancellationException cancellationException = ((C0350a) obj).f4119b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        } else if (obj instanceof C0352c) {
            throw new ExecutionException(((C0352c) obj).f4120a);
        } else if (obj == f4134l) {
            return null;
        } else {
            return obj;
        }
    }

    public static Object e(h hVar) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = hVar.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        String str;
        try {
            Object e2 = e(this);
            sb.append("SUCCESS, result=[");
            if (e2 == this) {
                str = "this future";
            } else {
                str = String.valueOf(e2);
            }
            sb.append(str);
            sb.append("]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final boolean cancel(boolean z3) {
        C0350a aVar;
        Object obj = this.f4135f;
        if (obj != null) {
            return false;
        }
        if (f4131i) {
            aVar = new C0350a(z3, new CancellationException("Future.cancel() was called."));
        } else if (z3) {
            aVar = C0350a.f4116c;
        } else {
            aVar = C0350a.f4117d;
        }
        if (!f4133k.c(this, obj, aVar)) {
            return false;
        }
        c(this);
        return true;
    }

    public final void f(g gVar) {
        gVar.f4129a = null;
        while (true) {
            g gVar2 = this.f4137h;
            if (gVar2 != g.f4128c) {
                g gVar3 = null;
                while (gVar2 != null) {
                    g gVar4 = gVar2.f4130b;
                    if (gVar2.f4129a != null) {
                        gVar3 = gVar2;
                    } else if (gVar3 != null) {
                        gVar3.f4130b = gVar4;
                        if (gVar3.f4129a == null) {
                        }
                    } else if (!f4133k.d(this, gVar2, gVar4)) {
                    }
                    gVar2 = gVar4;
                }
                return;
            }
            return;
        }
    }

    public final Object get(long j3, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f4135f;
            if (obj != null) {
                return d(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                g gVar = this.f4137h;
                g gVar2 = g.f4128c;
                if (gVar != gVar2) {
                    g gVar3 = new g();
                    do {
                        a aVar = f4133k;
                        aVar.F(gVar3, gVar);
                        if (aVar.d(this, gVar, gVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f4135f;
                                    if (obj2 != null) {
                                        return d(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    f(gVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            f(gVar3);
                        } else {
                            gVar = this.f4137h;
                        }
                    } while (gVar != gVar2);
                }
                return d(this.f4135f);
            }
            while (nanos > 0) {
                Object obj3 = this.f4135f;
                if (obj3 != null) {
                    return d(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String hVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j4 = -nanos;
                long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit.toNanos(convert);
                int i3 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z3 = i3 == 0 || nanos2 > 1000;
                if (i3 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z3) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z3) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + hVar);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f4135f instanceof C0350a;
    }

    public final boolean isDone() {
        if (this.f4135f != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f4135f instanceof C0350a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4135f;
            if (obj2 != null) {
                return d(obj2);
            }
            g gVar = this.f4137h;
            g gVar2 = g.f4128c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    a aVar = f4133k;
                    aVar.F(gVar3, gVar);
                    if (aVar.d(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4135f;
                            } else {
                                f(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return d(obj);
                    }
                    gVar = this.f4137h;
                } while (gVar != gVar2);
            }
            return d(this.f4135f);
        }
        throw new InterruptedException();
    }

    public void b() {
    }
}
