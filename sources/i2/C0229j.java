package i2;

import android.content.Intent;
import io.flutter.plugins.firebase.messaging.a;

/* renamed from: i2.j  reason: case insensitive filesystem */
public final class C0229j implements C0230k {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f3265a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3266b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f3267c;

    public C0229j(a aVar, Intent intent, int i3) {
        this.f3267c = aVar;
        this.f3265a = intent;
        this.f3266b = i3;
    }

    public final void a() {
        this.f3267c.stopSelf(this.f3266b);
    }

    public final Intent getIntent() {
        return this.f3265a;
    }
}
