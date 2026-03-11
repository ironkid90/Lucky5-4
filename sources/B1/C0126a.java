package b1;

import L1.h;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: b1.a  reason: case insensitive filesystem */
public final class C0126a implements ThreadFactory {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadFactory f2664e = Executors.defaultThreadFactory();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicLong f2665a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    public final String f2666b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2667c;

    /* renamed from: d  reason: collision with root package name */
    public final StrictMode.ThreadPolicy f2668d;

    public C0126a(String str, int i3, StrictMode.ThreadPolicy threadPolicy) {
        this.f2666b = str;
        this.f2667c = i3;
        this.f2668d = threadPolicy;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = f2664e.newThread(new h(6, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f2665a.getAndIncrement();
        newThread.setName(this.f2666b + " Thread #" + andIncrement);
        return newThread;
    }
}
