package j1;

import W0.p;
import X0.c;
import android.content.Context;
import android.support.v4.media.session.a;
import java.util.Set;
import java.util.concurrent.Executor;
import l1.C0313a;
import w.e;

public final class d implements f, g {

    /* renamed from: a  reason: collision with root package name */
    public final c f3842a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f3843b;

    /* renamed from: c  reason: collision with root package name */
    public final C0313a f3844c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f3845d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f3846e;

    public d(Context context, String str, Set set, C0313a aVar, Executor executor) {
        this.f3842a = new c(context, str);
        this.f3845d = set;
        this.f3846e = executor;
        this.f3844c = aVar;
        this.f3843b = context;
    }

    public final p a() {
        if (!e.a(this.f3843b)) {
            return a.r("");
        }
        return a.g(this.f3846e, new c(this, 0));
    }

    public final void b() {
        if (this.f3845d.size() <= 0) {
            a.r((Object) null);
        } else if (!e.a(this.f3843b)) {
            a.r((Object) null);
        } else {
            a.g(this.f3846e, new c(this, 1));
        }
    }
}
