package L1;

import M1.c;
import M1.e;
import a.C0094a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class f {

    /* renamed from: n  reason: collision with root package name */
    public static Boolean f932n;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f933a;

    /* renamed from: b  reason: collision with root package name */
    public final String f934b;

    /* renamed from: c  reason: collision with root package name */
    public final int f935c;

    /* renamed from: d  reason: collision with root package name */
    public final int f936d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f937e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f938f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f939g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public j f940h;

    /* renamed from: i  reason: collision with root package name */
    public SQLiteDatabase f941i;

    /* renamed from: j  reason: collision with root package name */
    public int f942j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f943k = 0;

    /* renamed from: l  reason: collision with root package name */
    public Integer f944l;

    /* renamed from: m  reason: collision with root package name */
    public int f945m = 0;

    public f(Context context, String str, int i3, boolean z3, int i4) {
        this.f937e = context;
        this.f934b = str;
        this.f933a = z3;
        this.f935c = i3;
        this.f936d = i4;
    }

    public static HashMap c(Cursor cursor, Integer num) {
        Object obj;
        HashMap hashMap = null;
        ArrayList arrayList = null;
        int i3 = 0;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                arrayList = new ArrayList();
                hashMap = new HashMap();
                i3 = cursor.getColumnCount();
                hashMap.put("columns", Arrays.asList(cursor.getColumnNames()));
                hashMap.put("rows", arrayList);
            }
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                int type = cursor.getType(i4);
                if (type == 1) {
                    obj = Long.valueOf(cursor.getLong(i4));
                } else if (type == 2) {
                    obj = Double.valueOf(cursor.getDouble(i4));
                } else if (type == 3) {
                    obj = cursor.getString(i4);
                } else if (type != 4) {
                    obj = null;
                } else {
                    obj = cursor.getBlob(i4);
                }
                arrayList2.add(obj);
            }
            arrayList.add(arrayList2);
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        if (hashMap == null) {
            return new HashMap();
        }
        return hashMap;
    }

    public final void a() {
        HashMap hashMap = this.f939g;
        if (!hashMap.isEmpty() && a.a(this.f936d)) {
            Log.d("Sqflite", h() + hashMap.size() + " cursor(s) are left opened");
        }
        this.f941i.close();
    }

    public final void b(m mVar) {
        try {
            int i3 = mVar.f967a;
            if (a.b(this.f936d)) {
                Log.d("Sqflite", h() + "closing cursor " + i3);
            }
            this.f939g.remove(Integer.valueOf(i3));
            mVar.f969c.close();
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(a.C0094a r11) {
        /*
            r10 = this;
            boolean r0 = r10.g(r11)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r11.y()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0014
            r11.b(r2)
            return r3
        L_0x0014:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r10.f941i     // Catch:{ Exception -> 0x00be, all -> 0x00bc }
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch:{ Exception -> 0x00be, all -> 0x00bc }
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L_0x009b
            int r5 = r0.getCount()     // Catch:{ Exception -> 0x0062 }
            if (r5 <= 0) goto L_0x009b
            boolean r5 = r0.moveToFirst()     // Catch:{ Exception -> 0x0062 }
            if (r5 == 0) goto L_0x009b
            int r5 = r0.getInt(r1)     // Catch:{ Exception -> 0x0062 }
            int r6 = r10.f936d
            if (r5 != 0) goto L_0x006b
            boolean r5 = L1.a.a(r6)     // Catch:{ Exception -> 0x0062 }
            if (r5 == 0) goto L_0x0064
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0062 }
            r5.<init>()     // Catch:{ Exception -> 0x0062 }
            java.lang.String r6 = r10.h()     // Catch:{ Exception -> 0x0062 }
            r5.append(r6)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r6 = "no changes (id was "
            r5.append(r6)     // Catch:{ Exception -> 0x0062 }
            long r6 = r0.getLong(r3)     // Catch:{ Exception -> 0x0062 }
            r5.append(r6)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0062 }
            android.util.Log.d(r4, r5)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0064
        L_0x005f:
            r11 = move-exception
            r2 = r0
            goto L_0x00cb
        L_0x0062:
            r2 = move-exception
            goto L_0x00c2
        L_0x0064:
            r11.b(r2)     // Catch:{ Exception -> 0x0062 }
            r0.close()
            return r3
        L_0x006b:
            long r7 = r0.getLong(r3)     // Catch:{ Exception -> 0x0062 }
            boolean r2 = L1.a.a(r6)     // Catch:{ Exception -> 0x0062 }
            if (r2 == 0) goto L_0x0090
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0062 }
            r2.<init>()     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = r10.h()     // Catch:{ Exception -> 0x0062 }
            r2.append(r5)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = "inserted "
            r2.append(r5)     // Catch:{ Exception -> 0x0062 }
            r2.append(r7)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0062 }
            android.util.Log.d(r4, r2)     // Catch:{ Exception -> 0x0062 }
        L_0x0090:
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0062 }
            r11.b(r2)     // Catch:{ Exception -> 0x0062 }
            r0.close()
            return r3
        L_0x009b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0062 }
            r5.<init>()     // Catch:{ Exception -> 0x0062 }
            java.lang.String r6 = r10.h()     // Catch:{ Exception -> 0x0062 }
            r5.append(r6)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r6 = "fail to read changes for Insert"
            r5.append(r6)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0062 }
            android.util.Log.e(r4, r5)     // Catch:{ Exception -> 0x0062 }
            r11.b(r2)     // Catch:{ Exception -> 0x0062 }
            if (r0 == 0) goto L_0x00bb
            r0.close()
        L_0x00bb:
            return r3
        L_0x00bc:
            r11 = move-exception
            goto L_0x00cb
        L_0x00be:
            r0 = move-exception
            r9 = r2
            r2 = r0
            r0 = r9
        L_0x00c2:
            r10.i(r2, r11)     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x00ca
            r0.close()
        L_0x00ca:
            return r1
        L_0x00cb:
            if (r2 == 0) goto L_0x00d0
            r2.close()
        L_0x00d0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.f.d(a.a):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f A[Catch:{ all -> 0x0088 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(a.C0094a r9) {
        /*
            r8 = this;
            java.lang.String r0 = "cursorPageSize"
            java.lang.Object r0 = r9.t(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            L1.r r1 = new L1.r
            java.lang.String r2 = "sql"
            java.lang.Object r2 = r9.t(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "arguments"
            java.lang.Object r3 = r9.t(r3)
            java.util.List r3 = (java.util.List) r3
            r1.<init>(r2, r3)
            int r3 = r8.f936d
            boolean r3 = L1.a.a(r3)
            if (r3 == 0) goto L_0x003d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r8.h()
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Sqflite"
            android.util.Log.d(r4, r3)
        L_0x003d:
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r8.f941i     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
            L1.c r5 = new L1.c     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
            java.lang.String[] r1 = L1.a.f925a     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
            android.database.Cursor r1 = r4.rawQueryWithFactory(r5, r2, r1, r3)     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
            java.util.HashMap r2 = c(r1, r0)     // Catch:{ Exception -> 0x008a }
            r4 = 1
            if (r0 == 0) goto L_0x008c
            boolean r5 = r1.isLast()     // Catch:{ Exception -> 0x008a }
            if (r5 != 0) goto L_0x008c
            boolean r5 = r1.isAfterLast()     // Catch:{ Exception -> 0x008a }
            if (r5 != 0) goto L_0x008c
            int r5 = r8.f945m     // Catch:{ Exception -> 0x008a }
            int r5 = r5 + r4
            r8.f945m = r5     // Catch:{ Exception -> 0x008a }
            java.lang.String r6 = "cursorId"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x008a }
            r2.put(r6, r7)     // Catch:{ Exception -> 0x008a }
            L1.m r6 = new L1.m     // Catch:{ Exception -> 0x008a }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x008a }
            r6.<init>(r5, r0, r1)     // Catch:{ Exception -> 0x008a }
            java.util.HashMap r0 = r8.f939g     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            r0.put(r3, r6)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            r3 = r6
            goto L_0x008c
        L_0x0080:
            r3 = r6
            goto L_0x00ab
        L_0x0082:
            r3 = r6
            goto L_0x009a
        L_0x0084:
            r9 = move-exception
            goto L_0x0080
        L_0x0086:
            r0 = move-exception
            goto L_0x0082
        L_0x0088:
            r9 = move-exception
            goto L_0x00ab
        L_0x008a:
            r0 = move-exception
            goto L_0x009a
        L_0x008c:
            r9.b(r2)     // Catch:{ Exception -> 0x008a }
            if (r3 != 0) goto L_0x0094
            r1.close()
        L_0x0094:
            return r4
        L_0x0095:
            r9 = move-exception
            r1 = r3
            goto L_0x00ab
        L_0x0098:
            r0 = move-exception
            r1 = r3
        L_0x009a:
            r8.i(r0, r9)     // Catch:{ all -> 0x0088 }
            if (r3 == 0) goto L_0x00a2
            r8.b(r3)     // Catch:{ all -> 0x0088 }
        L_0x00a2:
            if (r3 != 0) goto L_0x00a9
            if (r1 == 0) goto L_0x00a9
            r1.close()
        L_0x00a9:
            r9 = 0
            return r9
        L_0x00ab:
            if (r3 != 0) goto L_0x00b2
            if (r1 == 0) goto L_0x00b2
            r1.close()
        L_0x00b2:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.f.e(a.a):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(a.C0094a r8) {
        /*
            r7 = this;
            boolean r0 = r7.g(r8)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r8.y()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0014
            r8.b(r3)
            return r2
        L_0x0014:
            android.database.sqlite.SQLiteDatabase r0 = r7.f941i     // Catch:{ Exception -> 0x0088 }
            java.lang.String r4 = "SELECT changes()"
            android.database.Cursor r0 = r0.rawQuery(r4, r3)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L_0x0065
            int r5 = r0.getCount()     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            if (r5 <= 0) goto L_0x0065
            boolean r5 = r0.moveToFirst()     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            if (r5 == 0) goto L_0x0065
            int r3 = r0.getInt(r1)     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            int r5 = r7.f936d     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            boolean r5 = L1.a.a(r5)     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            if (r5 == 0) goto L_0x005a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            r5.<init>()     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            java.lang.String r6 = r7.h()     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            r5.append(r6)     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            java.lang.String r6 = "changed "
            r5.append(r6)     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            r5.append(r3)     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            android.util.Log.d(r4, r5)     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            goto L_0x005a
        L_0x0054:
            r8 = move-exception
            r3 = r0
            goto L_0x0092
        L_0x0057:
            r2 = move-exception
            r3 = r0
            goto L_0x0089
        L_0x005a:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            r8.b(r3)     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            r0.close()
            return r2
        L_0x0065:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            r5.<init>()     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            java.lang.String r6 = r7.h()     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            r5.append(r6)     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            java.lang.String r6 = "fail to read changes for Update/Delete"
            r5.append(r6)     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            android.util.Log.e(r4, r5)     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            r8.b(r3)     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            if (r0 == 0) goto L_0x0085
            r0.close()
        L_0x0085:
            return r2
        L_0x0086:
            r8 = move-exception
            goto L_0x0092
        L_0x0088:
            r2 = move-exception
        L_0x0089:
            r7.i(r2, r8)     // Catch:{ all -> 0x0086 }
            if (r3 == 0) goto L_0x0091
            r3.close()
        L_0x0091:
            return r1
        L_0x0092:
            if (r3 == 0) goto L_0x0097
            r3.close()
        L_0x0097:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.f.f(a.a):boolean");
    }

    public final boolean g(C0094a aVar) {
        Boolean bool;
        String str = (String) aVar.t("sql");
        r rVar = new r(str, (List) aVar.t("arguments"));
        if (a.a(this.f936d)) {
            Log.d("Sqflite", h() + rVar);
        }
        Object t3 = aVar.t("inTransaction");
        if (t3 instanceof Boolean) {
            bool = (Boolean) t3;
        } else {
            bool = null;
        }
        try {
            SQLiteDatabase sQLiteDatabase = this.f941i;
            ArrayList arrayList = new ArrayList();
            List<Object> list = rVar.f1000b;
            if (list != null) {
                for (Object a2 : list) {
                    arrayList.add(r.a(a2));
                }
            }
            sQLiteDatabase.execSQL(str, arrayList.toArray(new Object[0]));
            synchronized (this) {
                if (Boolean.TRUE.equals(bool)) {
                    this.f942j++;
                } else if (Boolean.FALSE.equals(bool)) {
                    this.f942j--;
                }
            }
            return true;
        } catch (Exception e2) {
            i(e2, aVar);
            return false;
        } catch (Throwable th) {
            while (true) {
            }
            throw th;
        }
    }

    public final String h() {
        StringBuilder sb = new StringBuilder("[");
        Thread currentThread = Thread.currentThread();
        sb.append(this.f935c + "," + currentThread.getName() + "(" + currentThread.getId() + ")");
        sb.append("] ");
        return sb.toString();
    }

    public final void i(Exception exc, C0094a aVar) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            aVar.a("open_failed " + this.f934b, (HashMap) null);
        } else if (exc instanceof SQLException) {
            String message = exc.getMessage();
            String str = (String) aVar.t("sql");
            Object obj = (List) aVar.t("arguments");
            if (obj == null) {
                obj = new ArrayList();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("sql", str);
            hashMap.put("arguments", obj);
            aVar.a(message, hashMap);
        } else {
            String message2 = exc.getMessage();
            String str2 = (String) aVar.t("sql");
            Object obj2 = (List) aVar.t("arguments");
            if (obj2 == null) {
                obj2 = new ArrayList();
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("sql", str2);
            hashMap2.put("arguments", obj2);
            aVar.a(message2, hashMap2);
        }
    }

    public final synchronized boolean j() {
        boolean z3;
        if (this.f942j > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return z3;
    }

    public final void k() {
        int i3;
        ApplicationInfo applicationInfo;
        if (f932n == null) {
            Context context = this.f937e;
            boolean z3 = false;
            try {
                String packageName = context.getPackageName();
                if (Build.VERSION.SDK_INT >= 33) {
                    applicationInfo = context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128));
                } else {
                    applicationInfo = context.getPackageManager().getApplicationInfo(packageName, 128);
                }
                if (applicationInfo.metaData.getBoolean("com.tekartik.sqflite.wal_enabled", false)) {
                    z3 = true;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            f932n = Boolean.valueOf(z3);
            if (z3 && a.b(this.f936d)) {
                Log.d("Sqflite", h() + "[sqflite] WAL enabled");
            }
        }
        if (f932n.booleanValue()) {
            i3 = 805306368;
        } else {
            i3 = 268435456;
        }
        this.f941i = SQLiteDatabase.openDatabase(this.f934b, (SQLiteDatabase.CursorFactory) null, i3);
    }

    public final void l(c cVar, Runnable runnable) {
        Integer num = (Integer) cVar.t("transactionId");
        Integer num2 = this.f944l;
        if (num2 == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f938f;
        if (num == null || (!num.equals(num2) && num.intValue() != -1)) {
            arrayList.add(new e(runnable));
            return;
        }
        runnable.run();
        if (this.f944l == null && !arrayList.isEmpty()) {
            this.f940h.d(this, new d(0, (Object) this));
        }
    }
}
