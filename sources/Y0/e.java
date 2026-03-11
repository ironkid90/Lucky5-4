package y0;

import B0.a;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import o0.C0356d;
import r0.i;

public final /* synthetic */ class e implements g {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f4818f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ i f4819g;

    public /* synthetic */ e(long j3, i iVar) {
        this.f4818f = j3;
        this.f4819g = iVar;
    }

    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f4818f));
        i iVar = this.f4819g;
        String str = iVar.f4426a;
        C0356d dVar = iVar.f4428c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f4426a);
            contentValues.put("priority", Integer.valueOf(a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }
}
