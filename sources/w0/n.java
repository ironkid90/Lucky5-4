package W0;

import java.util.concurrent.Executor;

public final class n implements Executor {
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
