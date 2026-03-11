package b1;

import F0.h;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class d implements h {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f2677f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ g f2678g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Runnable f2679h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ long f2680i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ long f2681j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f2682k;

    public /* synthetic */ d(g gVar, Runnable runnable, long j3, long j4, TimeUnit timeUnit, int i3) {
        this.f2677f = i3;
        this.f2678g = gVar;
        this.f2679h = runnable;
        this.f2680i = j3;
        this.f2681j = j4;
        this.f2682k = timeUnit;
    }

    public final ScheduledFuture a(h hVar) {
        switch (this.f2677f) {
            case 0:
                g gVar = this.f2678g;
                gVar.getClass();
                return gVar.f2691g.scheduleAtFixedRate(new e(gVar, this.f2679h, hVar, 0), this.f2680i, this.f2681j, this.f2682k);
            default:
                g gVar2 = this.f2678g;
                gVar2.getClass();
                return gVar2.f2691g.scheduleWithFixedDelay(new e(gVar2, this.f2679h, hVar, 2), this.f2680i, this.f2681j, this.f2682k);
        }
    }
}
