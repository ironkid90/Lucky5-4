package i2;

import c2.p;
import java.util.concurrent.CountDownLatch;

/* renamed from: i2.b  reason: case insensitive filesystem */
public final class C0221b implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f3236a;

    public C0221b(CountDownLatch countDownLatch) {
        this.f3236a = countDownLatch;
    }

    public final void a(String str, String str2, Object obj) {
        this.f3236a.countDown();
    }

    public final void b(Object obj) {
        this.f3236a.countDown();
    }

    public final void c() {
        this.f3236a.countDown();
    }
}
