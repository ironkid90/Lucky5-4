package I;

import M0.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p2.C0368h;
import r2.C0420d;
import t2.C0488f;
import z2.p;

/* renamed from: I.g  reason: case insensitive filesystem */
public final class C0031g extends C0488f implements p {

    /* renamed from: j  reason: collision with root package name */
    public Iterator f622j;

    /* renamed from: k  reason: collision with root package name */
    public Object f623k;

    /* renamed from: l  reason: collision with root package name */
    public int f624l;

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f625m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ List f626n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ArrayList f627o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0031g(List list, ArrayList arrayList, C0420d dVar) {
        super(2, dVar);
        this.f626n = list;
        this.f627o = arrayList;
    }

    public final C0420d c(Object obj, C0420d dVar) {
        C0031g gVar = new C0031g(this.f626n, this.f627o, dVar);
        gVar.f625m = obj;
        return gVar;
    }

    public final Object i(Object obj, Object obj2) {
        return ((C0031g) c(obj, (C0420d) obj2)).l(C0368h.f4194a);
    }

    public final Object l(Object obj) {
        List list;
        Iterator it;
        int i3 = this.f624l;
        if (i3 == 0) {
            a.V(obj);
            obj = this.f625m;
            it = this.f626n.iterator();
            list = this.f627o;
        } else if (i3 == 1) {
            Object obj2 = this.f623k;
            Iterator it2 = this.f622j;
            List list2 = (List) this.f625m;
            a.V(obj);
            if (!((Boolean) obj).booleanValue()) {
                obj = obj2;
                it = it2;
                list = list2;
            } else {
                list2.add(new C0488f(1, (C0420d) null));
                this.f625m = list2;
                this.f622j = it2;
                this.f623k = null;
                this.f624l = 2;
                throw null;
            }
        } else if (i3 == 2) {
            it = this.f622j;
            list = (List) this.f625m;
            a.V(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() == null) {
            this.f625m = list;
            this.f622j = it;
            this.f623k = obj;
            this.f624l = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
