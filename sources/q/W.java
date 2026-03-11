package q;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

public abstract class W {
    public static void a(Object obj, Intent intent, Bundle bundle) {
        RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
    }

    public static Bundle b(Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }
}
