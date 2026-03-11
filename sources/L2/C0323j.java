package l2;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import io.flutter.plugins.urllauncher.WebViewActivity;

/* renamed from: l2.j  reason: case insensitive filesystem */
public final class C0323j extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f4017a;

    public C0323j(WebViewActivity webViewActivity) {
        this.f4017a = webViewActivity;
    }

    public final boolean onCreateWindow(WebView webView, boolean z3, boolean z4, Message message) {
        C0322i iVar = new C0322i(this);
        WebView webView2 = new WebView(this.f4017a.f3439h.getContext());
        webView2.setWebViewClient(iVar);
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
