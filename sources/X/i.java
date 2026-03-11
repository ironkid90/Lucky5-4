package x;

import java.util.concurrent.ThreadFactory;

public final class i implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public String f4765a;

    /* renamed from: b  reason: collision with root package name */
    public int f4766b;

    public final Thread newThread(Runnable runnable) {
        return new h(runnable, this.f4765a, this.f4766b);
    }
}
