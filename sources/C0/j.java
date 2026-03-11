package C0;

import java.util.concurrent.Executor;

public final /* synthetic */ class j implements Executor {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ j f132g = new j(0);

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ j f133h = new j(1);

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f134f;

    public /* synthetic */ j(int i3) {
        this.f134f = i3;
    }

    public final void execute(Runnable runnable) {
        switch (this.f134f) {
            case 0:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
