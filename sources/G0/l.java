package G0;

import android.os.Bundle;
import com.google.android.gms.common.internal.a;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f426a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f427b = false;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f428c;

    /* renamed from: d  reason: collision with root package name */
    public final int f429d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f430e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f431f;

    public l(a aVar, int i3, Bundle bundle) {
        this.f431f = aVar;
        Boolean bool = Boolean.TRUE;
        this.f428c = aVar;
        this.f426a = bool;
        this.f429d = i3;
        this.f430e = bundle;
    }

    public abstract void a(D0.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f426a = null;
        }
        synchronized (this.f428c.f2841k) {
            this.f428c.f2841k.remove(this);
        }
    }
}
