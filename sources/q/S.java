package q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import b.C0123b;
import b.C0124c;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class S implements Handler.Callback, ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4221a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f4222b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f4223c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public HashSet f4224d = new HashSet();

    public S(Context context) {
        this.f4221a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f4222b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(Q q3) {
        boolean z3;
        ArrayDeque arrayDeque;
        boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = q3.f4216a;
        if (isLoggable) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + q3.f4219d.size() + " queued tasks");
        }
        if (!q3.f4219d.isEmpty()) {
            if (q3.f4217b) {
                z3 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.f4221a;
                boolean bindService = context.bindService(component, this, 33);
                q3.f4217b = bindService;
                if (bindService) {
                    q3.f4220e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z3 = q3.f4217b;
            }
            if (!z3 || q3.f4218c == null) {
                b(q3);
                return;
            }
            while (true) {
                arrayDeque = q3.f4219d;
                O o3 = (O) arrayDeque.peek();
                if (o3 == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + o3);
                    }
                    o3.a(q3.f4218c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + componentName);
                    }
                } catch (RemoteException e2) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e2);
                }
            }
            if (!arrayDeque.isEmpty()) {
                b(q3);
            }
        }
    }

    public final void b(Q q3) {
        Handler handler = this.f4222b;
        ComponentName componentName = q3.f4216a;
        if (!handler.hasMessages(3, componentName)) {
            int i3 = q3.f4220e;
            int i4 = i3 + 1;
            q3.f4220e = i4;
            if (i4 > 6) {
                StringBuilder sb = new StringBuilder("Giving up on delivering ");
                ArrayDeque arrayDeque = q3.f4219d;
                sb.append(arrayDeque.size());
                sb.append(" tasks to ");
                sb.append(componentName);
                sb.append(" after ");
                sb.append(q3.f4220e);
                sb.append(" retries");
                Log.w("NotifManCompat", sb.toString());
                arrayDeque.clear();
                return;
            }
            int i5 = (1 << i3) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i5 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (long) i5);
        }
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [b.a, java.lang.Object] */
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i3 = message.what;
        C0124c cVar = null;
        if (i3 == 0) {
            O o3 = (O) message.obj;
            String string = Settings.Secure.getString(this.f4221a.getContentResolver(), "enabled_notification_listeners");
            synchronized (T.f4225c) {
                if (string != null) {
                    try {
                        if (!string.equals(T.f4226d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String unflattenFromString : split) {
                                ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                                if (unflattenFromString2 != null) {
                                    hashSet2.add(unflattenFromString2.getPackageName());
                                }
                            }
                            T.f4227e = hashSet2;
                            T.f4226d = string;
                        }
                    } finally {
                        while (true) {
                        }
                    }
                }
                hashSet = T.f4227e;
            }
            if (!hashSet.equals(this.f4224d)) {
                this.f4224d = hashSet;
                List<ResolveInfo> queryIntentServices = this.f4221a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo next : queryIntentServices) {
                    if (hashSet.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!this.f4223c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f4223c.put(componentName2, new Q(componentName2));
                    }
                }
                Iterator it2 = this.f4223c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        Q q3 = (Q) entry.getValue();
                        if (q3.f4217b) {
                            this.f4221a.unbindService(this);
                            q3.f4217b = false;
                        }
                        q3.f4218c = null;
                        it2.remove();
                    }
                }
            }
            for (Q q4 : this.f4223c.values()) {
                q4.f4219d.add(o3);
                a(q4);
            }
            return true;
        } else if (i3 == 1) {
            P p3 = (P) message.obj;
            ComponentName componentName3 = p3.f4214a;
            IBinder iBinder = p3.f4215b;
            Q q5 = (Q) this.f4223c.get(componentName3);
            if (q5 != null) {
                int i4 = C0123b.f2659c;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(C0124c.f2660a);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof C0124c)) {
                        ? obj = new Object();
                        obj.f2658c = iBinder;
                        cVar = obj;
                    } else {
                        cVar = (C0124c) queryLocalInterface;
                    }
                }
                q5.f4218c = cVar;
                q5.f4220e = 0;
                a(q5);
            }
            return true;
        } else if (i3 == 2) {
            Q q6 = (Q) this.f4223c.get((ComponentName) message.obj);
            if (q6 != null) {
                if (q6.f4217b) {
                    this.f4221a.unbindService(this);
                    q6.f4217b = false;
                }
                q6.f4218c = null;
            }
            return true;
        } else if (i3 != 3) {
            return false;
        } else {
            Q q7 = (Q) this.f4223c.get((ComponentName) message.obj);
            if (q7 != null) {
                a(q7);
            }
            return true;
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f4222b.obtainMessage(1, new P(componentName, iBinder)).sendToTarget();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f4222b.obtainMessage(2, componentName).sendToTarget();
    }
}
