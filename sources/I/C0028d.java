package I;

import M0.a;
import a.C0094a;
import java.util.List;
import p2.C0368h;
import r2.C0420d;
import s2.C0466a;
import t2.C0488f;
import z2.p;

/* renamed from: I.d  reason: case insensitive filesystem */
public final class C0028d extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public int f612j;

    /* renamed from: k  reason: collision with root package name */
    public /* synthetic */ Object f613k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ List f614l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0028d(List list, C0420d dVar) {
        super(2, dVar);
        this.f614l = list;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        C0028d dVar2 = new C0028d(this.f614l, dVar);
        dVar2.f613k = obj;
        return dVar2;
    }

    public final Object i(Object obj, Object obj2) {
        return ((C0028d) c((C0035k) obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        C0466a aVar = C0466a.f4632f;
        int i3 = this.f612j;
        if (i3 == 0) {
            a.V(obj);
            this.f612j = 1;
            if (C0094a.c(this.f614l, (C0035k) this.f613k, this) == aVar) {
                return aVar;
            }
        } else if (i3 == 1) {
            a.V(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C0368h.f4194a;
    }
}
