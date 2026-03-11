package f0;

import A2.i;
import S1.m;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import d0.C0148j;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import z.a;

/* renamed from: f0.f  reason: case insensitive filesystem */
public final class C0165f implements a, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2952a;

    /* renamed from: b  reason: collision with root package name */
    public final ReentrantLock f2953b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    public C0148j f2954c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f2955d = new LinkedHashSet();

    public C0165f(Context context) {
        this.f2952a = context;
    }

    /* renamed from: a */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        i.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f2953b;
        reentrantLock.lock();
        try {
            this.f2954c = C0164e.b(this.f2952a, windowLayoutInfo);
            for (a accept : this.f2955d) {
                accept.accept(this.f2954c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(m mVar) {
        ReentrantLock reentrantLock = this.f2953b;
        reentrantLock.lock();
        try {
            C0148j jVar = this.f2954c;
            if (jVar != null) {
                mVar.accept(jVar);
            }
            this.f2955d.add(mVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f2955d.isEmpty();
    }

    public final void d(m mVar) {
        ReentrantLock reentrantLock = this.f2953b;
        reentrantLock.lock();
        try {
            this.f2955d.remove(mVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
