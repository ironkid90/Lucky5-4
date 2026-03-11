package I2;

import A2.i;
import java.util.concurrent.locks.LockSupport;
import r2.C0425i;

/* renamed from: I2.c  reason: case insensitive filesystem */
public final class C0052c extends C0050a {

    /* renamed from: i  reason: collision with root package name */
    public final Thread f753i;

    /* renamed from: j  reason: collision with root package name */
    public final I f754j;

    public C0052c(C0425i iVar, Thread thread, I i3) {
        super(iVar, true);
        this.f753i = thread;
        this.f754j = i3;
    }

    public final void q(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f753i;
        if (!i.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
