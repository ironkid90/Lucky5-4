package s1;

import T1.d;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: s1.E  reason: case insensitive filesystem */
public final /* synthetic */ class C0432E implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f4497a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ScheduledThreadPoolExecutor f4498b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f4499c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0458s f4500d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f4501e;

    public /* synthetic */ C0432E(Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, FirebaseMessaging firebaseMessaging, C0458s sVar, d dVar) {
        this.f4497a = context;
        this.f4498b = scheduledThreadPoolExecutor;
        this.f4499c = firebaseMessaging;
        this.f4500d = sVar;
        this.f4501e = dVar;
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [s1.D, java.lang.Object] */
    public final Object call() {
        C0431D d3;
        Context context = this.f4497a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f4498b;
        FirebaseMessaging firebaseMessaging = this.f4499c;
        C0458s sVar = this.f4500d;
        d dVar = this.f4501e;
        synchronized (C0431D.class) {
            try {
                WeakReference weakReference = C0431D.f4495b;
                if (weakReference != null) {
                    d3 = (C0431D) weakReference.get();
                } else {
                    d3 = null;
                }
                if (d3 == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                    ? obj = new Object();
                    synchronized (obj) {
                        obj.f4496a = C0465z.a(sharedPreferences, scheduledThreadPoolExecutor);
                    }
                    C0431D.f4495b = new WeakReference(obj);
                    d3 = obj;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return new C0433F(firebaseMessaging, sVar, d3, dVar, context, scheduledThreadPoolExecutor);
    }
}
