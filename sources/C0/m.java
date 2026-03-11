package C0;

import L0.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s1.C0449j;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FirebaseInstanceIdReceiver f140f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Intent f141g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Context f142h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f143i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f144j;

    public /* synthetic */ m(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z3, BroadcastReceiver.PendingResult pendingResult) {
        this.f140f = firebaseInstanceIdReceiver;
        this.f141g = intent;
        this.f142h = context;
        this.f143i = z3;
        this.f144j = pendingResult;
    }

    public final void run() {
        Intent intent;
        int i3;
        int i4;
        FirebaseInstanceIdReceiver firebaseInstanceIdReceiver = this.f140f;
        Intent intent2 = this.f141g;
        Context context = this.f142h;
        boolean z3 = this.f143i;
        BroadcastReceiver.PendingResult pendingResult = this.f144j;
        firebaseInstanceIdReceiver.getClass();
        try {
            Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
            Executor executor = null;
            if (parcelableExtra instanceof Intent) {
                intent = (Intent) parcelableExtra;
            } else {
                intent = null;
            }
            if (intent != null) {
                i3 = FirebaseInstanceIdReceiver.a(intent);
            } else if (intent2.getExtras() == null) {
                i3 = 500;
            } else {
                a aVar = new a(intent2);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (FirebaseInstanceIdReceiver.class) {
                    SoftReference softReference = FirebaseInstanceIdReceiver.f2858b;
                    if (softReference != null) {
                        executor = (Executor) softReference.get();
                    }
                    if (executor == null) {
                        ThreadPoolExecutor threadPoolExecutor = r11;
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("pscm-ack-executor"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                        FirebaseInstanceIdReceiver.f2858b = new SoftReference(executor);
                    }
                }
                executor.execute(new l(context, aVar, countDownLatch));
                try {
                    i4 = ((Integer) android.support.v4.media.session.a.d(new C0449j(context).b(intent2))).intValue();
                } catch (InterruptedException | ExecutionException e2) {
                    Log.e("FirebaseMessaging", "Failed to send message to service.", e2);
                    i4 = 500;
                }
                try {
                    if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1), TimeUnit.MILLISECONDS)) {
                        Log.w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e3) {
                    Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e3.toString()));
                }
                i3 = i4;
            }
            if (z3 && pendingResult != null) {
                pendingResult.setResultCode(i3);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th;
        }
    }
}
