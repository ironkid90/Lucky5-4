package s1;

import W0.e;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.media.session.a;

/* renamed from: s1.v  reason: case insensitive filesystem */
public final /* synthetic */ class C0461v implements e {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f4598f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f4599g;

    public /* synthetic */ C0461v(Context context, boolean z3) {
        this.f4598f = context;
        this.f4599g = z3;
    }

    public final void d(Object obj) {
        Void voidR = (Void) obj;
        SharedPreferences.Editor edit = a.u(this.f4598f).edit();
        edit.putBoolean("proxy_retention", this.f4599g);
        edit.apply();
    }
}
