package i2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;

/* renamed from: i2.i  reason: case insensitive filesystem */
public final class C0228i extends C0235p {

    /* renamed from: d  reason: collision with root package name */
    public final Context f3260d;

    /* renamed from: e  reason: collision with root package name */
    public final PowerManager.WakeLock f3261e;

    /* renamed from: f  reason: collision with root package name */
    public final PowerManager.WakeLock f3262f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3263g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3264h;

    public C0228i(Context context, ComponentName componentName) {
        super(componentName);
        this.f3260d = context.getApplicationContext();
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
        this.f3261e = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
        this.f3262f = newWakeLock2;
        newWakeLock2.setReferenceCounted(false);
    }

    public final void a(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setComponent(this.f3275a);
        if (this.f3260d.startService(intent2) != null) {
            synchronized (this) {
                try {
                    if (!this.f3263g) {
                        this.f3263g = true;
                        if (!this.f3264h) {
                            this.f3261e.acquire(60000);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c() {
        synchronized (this) {
            try {
                if (this.f3264h) {
                    if (this.f3263g) {
                        this.f3261e.acquire(60000);
                    }
                    this.f3264h = false;
                    this.f3262f.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this) {
            try {
                if (!this.f3264h) {
                    this.f3264h = true;
                    this.f3262f.acquire(600000);
                    this.f3261e.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this) {
            this.f3263g = false;
        }
    }
}
