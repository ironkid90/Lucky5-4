package l2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.flutter.plugins.urllauncher.WebViewActivity;

/* renamed from: l2.g  reason: case insensitive filesystem */
public final class C0320g extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f4015a;

    public C0320g(WebViewActivity webViewActivity) {
        this.f4015a = webViewActivity;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("close action".equals(intent.getAction())) {
            this.f4015a.finish();
        }
    }
}
