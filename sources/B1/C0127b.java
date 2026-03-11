package b1;

import F0.h;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import u0.c;
import x0.j;
import y0.e;
import y0.i;
import z0.C0523b;

/* renamed from: b1.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0127b implements h, C0523b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f2669f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f2670g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ long f2671h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f2672i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f2673j;

    public /* synthetic */ C0127b(g gVar, Object obj, long j3, TimeUnit timeUnit, int i3) {
        this.f2669f = i3;
        this.f2670g = gVar;
        this.f2673j = obj;
        this.f2671h = j3;
        this.f2672i = timeUnit;
    }

    public ScheduledFuture a(h hVar) {
        switch (this.f2669f) {
            case 0:
                g gVar = (g) this.f2670g;
                gVar.getClass();
                return gVar.f2691g.schedule(new e(gVar, (Runnable) this.f2673j, hVar, 1), this.f2671h, (TimeUnit) this.f2672i);
            default:
                g gVar2 = (g) this.f2670g;
                gVar2.getClass();
                return gVar2.f2691g.schedule(new f(gVar2, (Callable) this.f2673j, hVar), this.f2671h, (TimeUnit) this.f2672i);
        }
    }

    public Object b() {
        Cursor rawQuery;
        j jVar = (j) this.f2670g;
        i iVar = (i) jVar.f4794c;
        iVar.getClass();
        Iterable iterable = (Iterable) this.f2673j;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + i.h(iterable);
            SQLiteDatabase a2 = iVar.a();
            a2.beginTransaction();
            try {
                a2.compileStatement(str).execute();
                rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", (String[]) null);
                while (rawQuery.moveToNext()) {
                    iVar.e((long) rawQuery.getInt(0), c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                a2.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a2.setTransactionSuccessful();
                a2.endTransaction();
            } catch (Throwable th) {
                a2.endTransaction();
                throw th;
            }
        }
        iVar.c(new e(jVar.f4798g.c() + this.f2671h, (r0.i) this.f2672i));
        return null;
    }

    public /* synthetic */ C0127b(j jVar, Iterable iterable, r0.i iVar, long j3) {
        this.f2669f = 2;
        this.f2670g = jVar;
        this.f2673j = iterable;
        this.f2672i = iVar;
        this.f2671h = j3;
    }
}
