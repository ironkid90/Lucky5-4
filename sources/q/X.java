package q;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import java.util.Set;

public abstract class X {
    public static void a(Z z3, Intent intent, Map<String, Uri> map) {
        RemoteInput.addDataResultToIntent(Z.a(z3), intent, map);
    }

    public static Set<String> b(Object obj) {
        return ((RemoteInput) obj).getAllowedDataTypes();
    }

    public static Map<String, Uri> c(Intent intent, String str) {
        return RemoteInput.getDataResultsFromIntent(intent, str);
    }

    public static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z3) {
        return builder.setAllowDataType(str, z3);
    }
}
