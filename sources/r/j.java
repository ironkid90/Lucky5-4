package R;

import android.os.Handler;
import android.os.Looper;

public abstract class j {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
