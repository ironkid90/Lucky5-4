package C0;

import P0.a;
import W0.i;
import W0.p;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import n.k;

public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static int f108h;

    /* renamed from: i  reason: collision with root package name */
    public static PendingIntent f109i;

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f110j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: a  reason: collision with root package name */
    public final k f111a = new k();

    /* renamed from: b  reason: collision with root package name */
    public final Context f112b;

    /* renamed from: c  reason: collision with root package name */
    public final u f113c;

    /* renamed from: d  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f114d;

    /* renamed from: e  reason: collision with root package name */
    public final Messenger f115e;

    /* renamed from: f  reason: collision with root package name */
    public Messenger f116f;

    /* renamed from: g  reason: collision with root package name */
    public i f117g;

    public b(Context context) {
        this.f112b = context;
        this.f113c = new u(context);
        this.f115e = new Messenger(new g(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f114d = scheduledThreadPoolExecutor;
    }

    public final p a(Bundle bundle) {
        String num;
        synchronized (b.class) {
            int i3 = f108h;
            f108h = i3 + 1;
            num = Integer.toString(i3);
        }
        i iVar = new i();
        synchronized (this.f111a) {
            this.f111a.put(num, iVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f113c.d() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f112b;
        synchronized (b.class) {
            try {
                if (f109i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f109i = PendingIntent.getBroadcast(context, 0, intent2, a.f1240a);
                }
                intent.putExtra("app", f109i);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        intent.putExtra("kid", "|ID|" + num + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f115e);
        if (!(this.f116f == null && this.f117g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f116f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f117g.f131a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            iVar.f1875a.g(j.f133h, new f((Object) this, (Object) num, (Object) this.f114d.schedule(new e(0, (Object) iVar), 30, TimeUnit.SECONDS), 0));
            return iVar.f1875a;
        }
        if (this.f113c.d() == 2) {
            this.f112b.sendBroadcast(intent);
        } else {
            this.f112b.startService(intent);
        }
        iVar.f1875a.g(j.f133h, new f((Object) this, (Object) num, (Object) this.f114d.schedule(new e(0, (Object) iVar), 30, TimeUnit.SECONDS), 0));
        return iVar.f1875a;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.f111a) {
            try {
                i iVar = (i) this.f111a.remove(str);
                if (iVar == null) {
                    Log.w("Rpc", "Missing callback for " + str);
                    return;
                }
                iVar.b(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
