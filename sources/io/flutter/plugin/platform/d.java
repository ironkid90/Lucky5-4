package io.flutter.plugin.platform;

import C0.r;
import c2.p;
import c2.q;
import java.util.Arrays;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f3374f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f3375g;

    public /* synthetic */ d(e eVar, int i3) {
        this.f3374f = eVar;
        this.f3375g = i3;
    }

    public final void run() {
        int i3 = this.f3375g & 4;
        f fVar = this.f3374f.f3377b;
        if (i3 == 0) {
            r rVar = (r) fVar.f3381d;
            rVar.getClass();
            ((q) rVar.f160g).a("SystemChrome.systemUIChange", Arrays.asList(new Boolean[]{Boolean.TRUE}), (p) null);
            return;
        }
        r rVar2 = (r) fVar.f3381d;
        rVar2.getClass();
        ((q) rVar2.f160g).a("SystemChrome.systemUIChange", Arrays.asList(new Boolean[]{Boolean.FALSE}), (p) null);
    }
}
