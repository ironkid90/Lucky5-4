package L0;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f921a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadFactory f922b = Executors.defaultThreadFactory();

    public a(String str) {
        this.f921a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f922b.newThread(new b(runnable, 0));
        newThread.setName(this.f921a);
        return newThread;
    }
}
