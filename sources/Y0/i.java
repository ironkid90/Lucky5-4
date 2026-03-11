package y0;

import A0.a;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import o0.C0355c;
import s1.C0454o;
import u0.c;
import z0.C0523b;
import z0.C0524c;

public final class i implements d, C0524c, c {

    /* renamed from: k  reason: collision with root package name */
    public static final C0355c f4823k = new C0355c("proto");

    /* renamed from: f  reason: collision with root package name */
    public final k f4824f;

    /* renamed from: g  reason: collision with root package name */
    public final a f4825g;

    /* renamed from: h  reason: collision with root package name */
    public final a f4826h;

    /* renamed from: i  reason: collision with root package name */
    public final C0519a f4827i;

    /* renamed from: j  reason: collision with root package name */
    public final o2.a f4828j;

    public i(a aVar, a aVar2, C0519a aVar3, k kVar, o2.a aVar4) {
        this.f4824f = kVar;
        this.f4825g = aVar;
        this.f4826h = aVar2;
        this.f4827i = aVar3;
        this.f4828j = aVar4;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, r0.i iVar) {
        Long l3;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{iVar.f4426a, String.valueOf(B0.a.a(iVar.f4428c))}));
        byte[] bArr = iVar.f4427b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null);
        try {
            if (!query.moveToNext()) {
                l3 = null;
            } else {
                l3 = Long.valueOf(query.getLong(0));
            }
            return l3;
        } finally {
            query.close();
        }
    }

    public static String h(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f4815a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object i(Cursor cursor, g gVar) {
        try {
            return gVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        k kVar = this.f4824f;
        Objects.requireNonNull(kVar);
        a aVar = this.f4826h;
        long c3 = aVar.c();
        while (true) {
            try {
                return kVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e2) {
                if (aVar.c() < ((long) this.f4827i.f4812c) + c3) {
                    SystemClock.sleep(50);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e2);
                }
            }
        }
    }

    public final Object c(g gVar) {
        SQLiteDatabase a2 = a();
        a2.beginTransaction();
        try {
            Object apply = gVar.apply(a2);
            a2.setTransactionSuccessful();
            return apply;
        } finally {
            a2.endTransaction();
        }
    }

    public final void close() {
        this.f4824f.close();
    }

    public final ArrayList d(SQLiteDatabase sQLiteDatabase, r0.i iVar, int i3) {
        ArrayList arrayList = new ArrayList();
        Long b3 = b(sQLiteDatabase, iVar);
        if (b3 == null) {
            return arrayList;
        }
        i(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{b3.toString()}, (String) null, (String) null, (String) null, String.valueOf(i3)), new C0454o(this, arrayList, iVar, 2));
        return arrayList;
    }

    public final void e(long j3, c cVar, String str) {
        c(new x0.i(j3, str, cVar));
    }

    public final Object g(C0523b bVar) {
        SQLiteDatabase a2 = a();
        a aVar = this.f4826h;
        long c3 = aVar.c();
        while (true) {
            try {
                a2.beginTransaction();
                try {
                    Object b3 = bVar.b();
                    a2.setTransactionSuccessful();
                    return b3;
                } finally {
                    a2.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e2) {
                if (aVar.c() < ((long) this.f4827i.f4812c) + c3) {
                    SystemClock.sleep(50);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e2);
                }
            }
        }
    }
}
