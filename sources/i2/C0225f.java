package i2;

import android.support.v4.media.session.a;
import androidx.lifecycle.p;
import s1.C0463x;

/* renamed from: i2.f  reason: case insensitive filesystem */
public final /* synthetic */ class C0225f implements p {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3246f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0226g f3247g;

    public /* synthetic */ C0225f(C0226g gVar, int i3) {
        this.f3246f = i3;
        this.f3247g = gVar;
    }

    public final void s(Object obj) {
        switch (this.f3246f) {
            case 0:
                C0226g gVar = this.f3247g;
                gVar.getClass();
                gVar.f3249g.a("Messaging#onMessage", a.A((C0463x) obj), (c2.p) null);
                return;
            default:
                this.f3247g.f3249g.a("Messaging#onTokenRefresh", (String) obj, (c2.p) null);
                return;
        }
    }
}
