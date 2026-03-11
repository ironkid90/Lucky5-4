package F0;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import n.k;

public final class z extends Fragment implements f {

    /* renamed from: f  reason: collision with root package name */
    public final Map f362f = Collections.synchronizedMap(new k());

    static {
        new WeakHashMap();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f362f.values()) {
            lifecycleCallback.getClass();
        }
    }

    public final void onActivityResult(int i3, int i4, Intent intent) {
        super.onActivityResult(i3, i4, intent);
        for (LifecycleCallback lifecycleCallback : this.f362f.values()) {
            lifecycleCallback.getClass();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        for (Map.Entry entry : this.f362f.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle.getBundle((String) entry.getKey());
            }
            lifecycleCallback.getClass();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        for (LifecycleCallback lifecycleCallback : this.f362f.values()) {
            lifecycleCallback.getClass();
        }
    }

    public final void onResume() {
        super.onResume();
        for (LifecycleCallback lifecycleCallback : this.f362f.values()) {
            lifecycleCallback.getClass();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f362f.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).getClass();
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        for (LifecycleCallback lifecycleCallback : this.f362f.values()) {
            lifecycleCallback.getClass();
        }
    }

    public final void onStop() {
        super.onStop();
        for (LifecycleCallback lifecycleCallback : this.f362f.values()) {
            lifecycleCallback.getClass();
        }
    }
}
