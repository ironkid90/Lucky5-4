package x0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import u0.c;
import y0.e;
import y0.g;
import z0.C0523b;

public final /* synthetic */ class i implements C0523b, g {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f4789f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f4790g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f4791h;

    public /* synthetic */ i(long j3, Object obj, Object obj2) {
        this.f4790g = obj;
        this.f4791h = obj2;
        this.f4789f = j3;
    }

    /* JADX INFO: finally extract failed */
    public Object apply(Object obj) {
        boolean z3;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i3 = ((c) this.f4791h).f4703f;
        String num = Integer.toString(i3);
        String str = (String) this.f4790g;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, num});
        try {
            if (rawQuery.getCount() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            rawQuery.close();
            long j3 = this.f4789f;
            if (!z3) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i3));
                contentValues.put("events_dropped_count", Long.valueOf(j3));
                sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
            } else {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j3 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i3)});
            }
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public Object b() {
        j jVar = (j) this.f4790g;
        y0.i iVar = (y0.i) jVar.f4794c;
        iVar.getClass();
        iVar.c(new e(jVar.f4798g.c() + this.f4789f, (r0.i) this.f4791h));
        return null;
    }
}
