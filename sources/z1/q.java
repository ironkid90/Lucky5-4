package z1;

import D1.a;
import E1.b;
import E1.c;
import com.dexterous.flutterlocalnotifications.models.ScheduleMode;
import l0.C0312b;
import w1.k;
import w1.m;
import w1.o;
import w1.r;
import y1.d;

public final class q extends r {

    /* renamed from: a  reason: collision with root package name */
    public final C0312b f4928a;

    /* renamed from: b  reason: collision with root package name */
    public final k f4929b;

    /* renamed from: c  reason: collision with root package name */
    public final a f4930c;

    /* renamed from: d  reason: collision with root package name */
    public final p f4931d;

    /* renamed from: e  reason: collision with root package name */
    public r f4932e;

    public q(C0312b bVar, k kVar, a aVar, p pVar) {
        this.f4928a = bVar;
        this.f4929b = kVar;
        this.f4930c = aVar;
        this.f4931d = pVar;
    }

    public final Object a(b bVar) {
        if (this.f4928a == null) {
            r rVar = this.f4932e;
            if (rVar == null) {
                rVar = this.f4929b.d(this.f4931d, this.f4930c);
                this.f4932e = rVar;
            }
            return rVar.a(bVar);
        }
        m j3 = d.j(bVar);
        j3.getClass();
        if (j3 instanceof o) {
            return null;
        }
        try {
            return ScheduleMode.valueOf(j3.c());
        } catch (Exception unused) {
            if (j3.a()) {
                return ScheduleMode.exactAllowWhileIdle;
            }
            return ScheduleMode.exact;
        }
    }

    public final void b(c cVar, Object obj) {
        r rVar = this.f4932e;
        if (rVar == null) {
            rVar = this.f4929b.d(this.f4931d, this.f4930c);
            this.f4932e = rVar;
        }
        rVar.b(cVar, obj);
    }
}
