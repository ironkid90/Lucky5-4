package x0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import i2.C0224e;
import r0.i;
import z0.C0523b;

/* renamed from: x0.h  reason: case insensitive filesystem */
public final /* synthetic */ class C0516h implements C0523b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4786f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ j f4787g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ i f4788h;

    public /* synthetic */ C0516h(j jVar, i iVar, int i3) {
        this.f4786f = i3;
        this.f4787g = jVar;
        this.f4788h = iVar;
    }

    public final Object b() {
        Boolean bool;
        Cursor rawQuery;
        switch (this.f4786f) {
            case 0:
                i iVar = this.f4788h;
                y0.i iVar2 = (y0.i) this.f4787g.f4794c;
                SQLiteDatabase a2 = iVar2.a();
                a2.beginTransaction();
                try {
                    Long b3 = y0.i.b(a2, iVar);
                    if (b3 == null) {
                        bool = Boolean.FALSE;
                    } else {
                        rawQuery = iVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b3.toString()});
                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                        rawQuery.close();
                        bool = valueOf;
                    }
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return bool;
                } catch (Throwable th) {
                    a2.endTransaction();
                    throw th;
                }
            default:
                y0.i iVar3 = (y0.i) this.f4787g.f4794c;
                iVar3.getClass();
                return (Iterable) iVar3.c(new C0224e(8, iVar3, this.f4788h));
        }
    }
}
