package C0;

import android.util.Log;
import java.util.Objects;

public final class h extends ClassLoader {
    public final Class loadClass(String str, boolean z3) {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z3);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return i.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return i.class;
    }
}
