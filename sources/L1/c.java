package L1;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.List;

public final /* synthetic */ class c implements SQLiteDatabase.CursorFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f929a;

    public /* synthetic */ c(r rVar) {
        this.f929a = rVar;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        long j3;
        List list = this.f929a.f1000b;
        if (list != null) {
            int size = list.size();
            int i3 = 0;
            while (i3 < size) {
                Object a2 = r.a(list.get(i3));
                int i4 = i3 + 1;
                if (a2 == null) {
                    sQLiteQuery.bindNull(i4);
                } else if (a2 instanceof byte[]) {
                    sQLiteQuery.bindBlob(i4, (byte[]) a2);
                } else if (a2 instanceof Double) {
                    sQLiteQuery.bindDouble(i4, ((Double) a2).doubleValue());
                } else if (a2 instanceof Integer) {
                    sQLiteQuery.bindLong(i4, (long) ((Integer) a2).intValue());
                } else if (a2 instanceof Long) {
                    sQLiteQuery.bindLong(i4, ((Long) a2).longValue());
                } else if (a2 instanceof String) {
                    sQLiteQuery.bindString(i4, (String) a2);
                } else if (a2 instanceof Boolean) {
                    if (((Boolean) a2).booleanValue()) {
                        j3 = 1;
                    } else {
                        j3 = 0;
                    }
                    sQLiteQuery.bindLong(i4, j3);
                } else {
                    throw new IllegalArgumentException("Could not bind " + a2 + " from index " + i3 + ": Supported types are null, byte[], double, long, boolean and String");
                }
                i3 = i4;
            }
        }
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
