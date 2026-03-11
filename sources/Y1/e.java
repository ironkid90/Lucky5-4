package y1;

import D1.a;
import E1.b;
import E1.c;
import w1.k;
import w1.r;

public final class e extends r {

    /* renamed from: a  reason: collision with root package name */
    public r f4842a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f4843b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f4844c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f4845d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a f4846e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f f4847f;

    public e(f fVar, boolean z3, boolean z4, k kVar, a aVar) {
        this.f4847f = fVar;
        this.f4843b = z3;
        this.f4844c = z4;
        this.f4845d = kVar;
        this.f4846e = aVar;
    }

    public final Object a(b bVar) {
        if (this.f4843b) {
            bVar.B();
            return null;
        }
        r rVar = this.f4842a;
        if (rVar == null) {
            rVar = this.f4845d.d(this.f4847f, this.f4846e);
            this.f4842a = rVar;
        }
        return rVar.a(bVar);
    }

    public final void b(c cVar, Object obj) {
        if (this.f4844c) {
            cVar.j();
            return;
        }
        r rVar = this.f4842a;
        if (rVar == null) {
            rVar = this.f4845d.d(this.f4847f, this.f4846e);
            this.f4842a = rVar;
        }
        rVar.b(cVar, obj);
    }
}
