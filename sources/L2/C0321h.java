package l2;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: l2.h  reason: case insensitive filesystem */
public final class C0321h extends WebViewClient {
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.loadUrl(webResourceRequest.getUrl().toString());
        return false;
    }
}
