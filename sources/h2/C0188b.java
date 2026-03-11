package h2;

import F0.c;
import W0.i;
import X0.g;
import java.util.HashMap;

/* renamed from: h2.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0188b implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3059f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f3060g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Boolean f3061h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ i f3062i;

    public /* synthetic */ C0188b(String str, Boolean bool, i iVar, int i3) {
        this.f3059f = i3;
        this.f3060g = str;
        this.f3061h = bool;
        this.f3062i = iVar;
    }

    public final void run() {
        i iVar = this.f3062i;
        Boolean bool = this.f3061h;
        String str = this.f3060g;
        switch (this.f3059f) {
            case 0:
                HashMap hashMap = C0191e.f3070h;
                try {
                    g e2 = g.e(str);
                    boolean booleanValue = bool.booleanValue();
                    e2.a();
                    if (e2.f1940e.compareAndSet(!booleanValue, booleanValue)) {
                        boolean z3 = c.f298j.f299f.get();
                        if (booleanValue && z3) {
                            e2.j(true);
                        } else if (!booleanValue && z3) {
                            e2.j(false);
                        }
                    }
                    iVar.b((Object) null);
                    return;
                } catch (Exception e3) {
                    iVar.a(e3);
                    return;
                }
            default:
                HashMap hashMap2 = C0191e.f3070h;
                try {
                    g.e(str).k(bool);
                    iVar.b((Object) null);
                    return;
                } catch (Exception e4) {
                    iVar.a(e4);
                    return;
                }
        }
    }
}
