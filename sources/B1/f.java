package b1;

import F0.h;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f2687a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f2688b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f2689c;

    public /* synthetic */ f(g gVar, Callable callable, h hVar) {
        this.f2687a = gVar;
        this.f2688b = callable;
        this.f2689c = hVar;
    }

    public final Object call() {
        g gVar = this.f2687a;
        gVar.getClass();
        return gVar.f2690f.submit(new L1.h(7, this.f2688b, this.f2689c));
    }
}
