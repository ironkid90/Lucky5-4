package l2;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: l2.i  reason: case insensitive filesystem */
public final class C0322i extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0323j f4016a;

    public C0322i(C0323j jVar) {
        this.f4016a = jVar;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f4016a.f4017a.f3439h.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f4016a.f4017a.f3439h.loadUrl(str);
        return true;
    }
}
