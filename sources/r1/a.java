package R1;

import java.util.concurrent.ThreadFactory;

public final class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public int f1365a;

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder sb = new StringBuilder("flutter-worker-");
        int i3 = this.f1365a;
        this.f1365a = i3 + 1;
        sb.append(i3);
        thread.setName(sb.toString());
        return thread;
    }
}
