package C0;

import L1.f;
import L1.q;
import W0.p;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import java.util.concurrent.CountDownLatch;
import x.c;
import x.d;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f136f = 2;

    /* renamed from: g  reason: collision with root package name */
    public Object f137g;

    /* renamed from: h  reason: collision with root package name */
    public Object f138h;

    /* renamed from: i  reason: collision with root package name */
    public Object f139i;

    public /* synthetic */ l() {
    }

    public final void run() {
        p pVar;
        int i3;
        Object obj;
        switch (this.f136f) {
            case 0:
                a aVar = (a) this.f138h;
                Intent intent = aVar.f107a;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                Integer num = null;
                if (TextUtils.isEmpty(stringExtra)) {
                    pVar = a.r((Object) null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = aVar.f107a;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = aVar.f107a;
                    if (intent3.hasExtra("google.product_id")) {
                        num = Integer.valueOf(intent3.getIntExtra("google.product_id", 0));
                    }
                    if (num != null) {
                        bundle.putInt("google.product_id", num.intValue());
                    }
                    bundle.putBoolean("supports_message_handled", true);
                    t a2 = t.a((Context) this.f137g);
                    synchronized (a2) {
                        i3 = a2.f171d;
                        a2.f171d = i3 + 1;
                    }
                    pVar = a2.b(new s(i3, 2, bundle, 0));
                }
                pVar.g(j.f132g, new k((CountDownLatch) this.f139i));
                return;
            case 1:
                synchronized (q.f990k) {
                    q.a((q) this.f139i, (f) this.f137g);
                }
                ((b2.f) this.f138h).b((Object) null);
                return;
            default:
                try {
                    obj = ((c) this.f137g).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f139i).post(new n(14, (d) this.f138h, obj));
                return;
        }
    }

    public /* synthetic */ l(Context context, a aVar, CountDownLatch countDownLatch) {
        this.f137g = context;
        this.f138h = aVar;
        this.f139i = countDownLatch;
    }

    public l(q qVar, f fVar, b2.f fVar2) {
        this.f139i = qVar;
        this.f137g = fVar;
        this.f138h = fVar2;
    }
}
