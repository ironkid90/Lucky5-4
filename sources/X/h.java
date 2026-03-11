package x;

import android.os.Process;

public final class h extends Thread {

    /* renamed from: f  reason: collision with root package name */
    public final int f4764f;

    public h(Runnable runnable, String str, int i3) {
        super(runnable, str);
        this.f4764f = i3;
    }

    public final void run() {
        Process.setThreadPriority(this.f4764f);
        super.run();
    }
}
