package d0;

import K2.i;
import L.b;
import M0.a;
import S1.m;
import android.app.Activity;
import e0.C0154a;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;
import z2.p;

/* renamed from: d0.i  reason: case insensitive filesystem */
public final class C0147i extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public int f2902j;

    /* renamed from: k  reason: collision with root package name */
    public /* synthetic */ Object f2903k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ C0140b f2904l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Activity f2905m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0147i(C0140b bVar, Activity activity, C0420d dVar) {
        super(2, dVar);
        this.f2904l = bVar;
        this.f2905m = activity;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        C0147i iVar = new C0147i(this.f2904l, this.f2905m, dVar);
        iVar.f2903k = obj;
        return iVar;
    }

    public final Object i(Object obj, Object obj2) {
        return ((C0147i) c((K2.p) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [R.d, java.lang.Object] */
    public final Object l(Object obj) {
        Object obj2 = C0466a.f4632f;
        int i3 = this.f2902j;
        if (i3 == 0) {
            a.V(obj);
            K2.p pVar = (K2.p) this.f2903k;
            m mVar = new m(1, pVar);
            C0140b bVar = this.f2904l;
            ((C0154a) bVar.f2888g).b(this.f2905m, new Object(), mVar);
            b bVar2 = new b(1, bVar, mVar);
            this.f2902j = 1;
            if (i.b(pVar, bVar2, this) == obj2) {
                return obj2;
            }
        } else if (i3 == 1) {
            a.V(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C0368h.f4194a;
    }
}
