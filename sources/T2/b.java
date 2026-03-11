package T2;

import A2.i;
import b2.f;
import c2.m;
import c2.o;
import c2.p;

public final /* synthetic */ class b implements o {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f1735f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d f1736g;

    public /* synthetic */ b(d dVar, int i3) {
        this.f1735f = i3;
        this.f1736g = dVar;
    }

    public final void onMethodCall(m mVar, p pVar) {
        switch (this.f1735f) {
            case 0:
                i.e(mVar, "call");
                d dVar = this.f1736g;
                c cVar = new c(2, dVar, d.class, "methodHandler", "methodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 0);
                f fVar = (f) pVar;
                dVar.getClass();
                try {
                    cVar.i(mVar, fVar);
                    return;
                } catch (Throwable th) {
                    fVar.a("Unexpected AndroidAudioError", th.getMessage(), th);
                    return;
                }
            default:
                i.e(mVar, "call");
                d dVar2 = this.f1736g;
                c cVar2 = new c(2, dVar2, d.class, "globalMethodHandler", "globalMethodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 1);
                f fVar2 = (f) pVar;
                dVar2.getClass();
                try {
                    cVar2.i(mVar, fVar2);
                    return;
                } catch (Throwable th2) {
                    fVar2.a("Unexpected AndroidAudioError", th2.getMessage(), th2);
                    return;
                }
        }
    }
}
