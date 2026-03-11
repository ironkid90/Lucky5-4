package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import l2.C0320g;
import l2.C0321h;
import l2.C0323j;
import r.C0411d;
import r.C0413f;

public class WebViewActivity extends Activity {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f3436j = 0;

    /* renamed from: f  reason: collision with root package name */
    public final C0320g f3437f = new C0320g(this);

    /* renamed from: g  reason: collision with root package name */
    public final C0321h f3438g = new WebViewClient();

    /* renamed from: h  reason: collision with root package name */
    public WebView f3439h;

    /* renamed from: i  reason: collision with root package name */
    public final IntentFilter f3440i = new IntentFilter("close action");

    public final void onCreate(Bundle bundle) {
        Map map;
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f3439h = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        Bundle bundleExtra = intent.getBundleExtra("com.android.browser.headers");
        if (bundleExtra == null) {
            map = Collections.emptyMap();
        } else {
            HashMap hashMap = new HashMap();
            for (String next : bundleExtra.keySet()) {
                hashMap.put(next, bundleExtra.getString(next));
            }
            map = hashMap;
        }
        this.f3439h.loadUrl(stringExtra, map);
        this.f3439h.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f3439h.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f3439h.setWebViewClient(this.f3438g);
        this.f3439h.getSettings().setSupportMultipleWindows(true);
        this.f3439h.setWebChromeClient(new C0323j(this));
        IntentFilter intentFilter = this.f3440i;
        int i3 = Build.VERSION.SDK_INT;
        C0320g gVar = this.f3437f;
        if (i3 >= 33) {
            C0413f.a(this, gVar, intentFilter, (String) null, (Handler) null, 2);
        } else if (i3 >= 26) {
            C0411d.a(this, gVar, intentFilter, (String) null, (Handler) null, 2);
        } else {
            registerReceiver(gVar, intentFilter, (String) null, (Handler) null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f3437f);
    }

    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (i3 != 4 || !this.f3439h.canGoBack()) {
            return super.onKeyDown(i3, keyEvent);
        }
        this.f3439h.goBack();
        return true;
    }
}
