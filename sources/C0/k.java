package C0;

import W0.b;
import W0.c;
import W0.d;
import W0.e;
import W0.h;
import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class k implements c, e, d, b {

    /* renamed from: f  reason: collision with root package name */
    public final CountDownLatch f135f;

    public /* synthetic */ k(CountDownLatch countDownLatch) {
        this.f135f = countDownLatch;
    }

    public void b() {
        this.f135f.countDown();
    }

    public void c(Exception exc) {
        this.f135f.countDown();
    }

    public void d(Object obj) {
        this.f135f.countDown();
    }

    public void p(h hVar) {
        this.f135f.countDown();
    }

    public /* synthetic */ k() {
        this.f135f = new CountDownLatch(1);
    }
}
