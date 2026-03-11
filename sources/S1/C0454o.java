package s1;

import W0.g;
import W0.p;
import a.C0094a;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.media.session.a;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import d2.C0152a;
import r0.h;
import w0.C0500a;
import y0.i;
import z0.C0523b;

/* renamed from: s1.o  reason: case insensitive filesystem */
public final /* synthetic */ class C0454o implements g, C0523b, y0.g {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4578f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f4579g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f4580h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f4581i;

    public /* synthetic */ C0454o(Object obj, Object obj2, Object obj3, int i3) {
        this.f4578f = i3;
        this.f4579g = obj;
        this.f4580h = obj2;
        this.f4581i = obj3;
    }

    public p a(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f4579g;
        String str = (String) this.f4580h;
        C0428A a2 = (C0428A) this.f4581i;
        String str2 = (String) obj;
        C0152a d3 = FirebaseMessaging.d(firebaseMessaging.f2864b);
        String e2 = firebaseMessaging.e();
        String a3 = firebaseMessaging.f2871i.a();
        synchronized (d3) {
            String a4 = C0428A.a(str2, a3, System.currentTimeMillis());
            if (a4 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) d3.f2912g).edit();
                edit.putString(C0152a.c(e2, str), a4);
                edit.commit();
            }
        }
        if (a2 == null || !str2.equals(a2.f4485a)) {
            X0.g gVar = firebaseMessaging.f2863a;
            gVar.a();
            if ("[DEFAULT]".equals(gVar.f1937b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    gVar.a();
                    sb.append(gVar.f1937b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new C0449j(firebaseMessaging.f2864b).b(intent);
            }
        }
        return a.r(str2);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r6v1, types: [T1.d, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x007a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r26) {
        /*
            r25 = this;
            r1 = r25
            java.lang.String r0 = "bytes"
            java.lang.String r3 = "PRAGMA page_size"
            java.lang.String r4 = "PRAGMA page_count"
            r6 = 5
            r7 = 4
            r8 = 3
            u0.c r9 = u0.c.CACHE_FULL
            r10 = 2
            java.lang.Object r11 = r1.f4581i
            r12 = 0
            java.lang.Object r13 = r1.f4580h
            java.lang.Object r14 = r1.f4579g
            r15 = 1
            int r2 = r1.f4578f
            switch(r2) {
                case 2: goto L_0x02b4;
                case 3: goto L_0x0144;
                default: goto L_0x001b;
            }
        L_0x001b:
            r0 = r26
            android.database.Cursor r0 = (android.database.Cursor) r0
            y0.i r14 = (y0.i) r14
            r14.getClass()
        L_0x0024:
            boolean r2 = r0.moveToNext()
            r5 = r13
            java.util.HashMap r5 = (java.util.HashMap) r5
            if (r2 == 0) goto L_0x008e
            java.lang.String r2 = r0.getString(r12)
            int r12 = r0.getInt(r15)
            u0.c r16 = u0.c.REASON_UNKNOWN
            if (r12 != 0) goto L_0x003d
        L_0x0039:
            r12 = r9
            r6 = r16
            goto L_0x0068
        L_0x003d:
            if (r12 != r15) goto L_0x0042
            u0.c r16 = u0.c.MESSAGE_TOO_OLD
            goto L_0x0039
        L_0x0042:
            if (r12 != r10) goto L_0x0047
            r6 = r9
            r12 = r6
            goto L_0x0068
        L_0x0047:
            if (r12 != r8) goto L_0x004c
            u0.c r16 = u0.c.PAYLOAD_TOO_BIG
            goto L_0x0039
        L_0x004c:
            if (r12 != r7) goto L_0x0051
            u0.c r16 = u0.c.MAX_RETRIES_REACHED
            goto L_0x0039
        L_0x0051:
            if (r12 != r6) goto L_0x0056
            u0.c r16 = u0.c.INVALID_PAYLOD
            goto L_0x0039
        L_0x0056:
            r6 = 6
            if (r12 != r6) goto L_0x005c
            u0.c r16 = u0.c.SERVER_ERROR
            goto L_0x0039
        L_0x005c:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            java.lang.String r12 = "SQLiteEventStore"
            java.lang.String r7 = "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN"
            a.C0094a.l(r12, r7, r6)
            goto L_0x0039
        L_0x0068:
            long r8 = r0.getLong(r10)
            boolean r16 = r5.containsKey(r2)
            if (r16 != 0) goto L_0x007a
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.put(r2, r7)
        L_0x007a:
            java.lang.Object r2 = r5.get(r2)
            java.util.List r2 = (java.util.List) r2
            u0.d r5 = new u0.d
            r5.<init>(r8, r6)
            r2.add(r5)
            r9 = r12
            r6 = 5
            r7 = 4
            r8 = 3
            r12 = 0
            goto L_0x0024
        L_0x008e:
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0096:
            boolean r2 = r0.hasNext()
            r5 = r11
            s1.y r5 = (s1.C0464y) r5
            if (r2 == 0) goto L_0x00c9
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            int r6 = u0.e.f4706c
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Object r6 = r2.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            u0.e r7 = new u0.e
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r7.<init>(r6, r2)
            java.lang.Object r2 = r5.f4624h
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r7)
            goto L_0x0096
        L_0x00c9:
            A0.a r0 = r14.f4825g
            long r6 = r0.c()
            android.database.sqlite.SQLiteDatabase r2 = r14.a()
            r2.beginTransaction()
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x013f }
            java.lang.String r8 = "SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1"
            android.database.Cursor r0 = r2.rawQuery(r8, r0)     // Catch:{ all -> 0x013f }
            y0.f r8 = new y0.f     // Catch:{ all -> 0x013f }
            r8.<init>(r6)     // Catch:{ all -> 0x013f }
            java.lang.Object r0 = y0.i.i(r0, r8)     // Catch:{ all -> 0x013f }
            u0.g r0 = (u0.g) r0     // Catch:{ all -> 0x013f }
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x013f }
            r2.endTransaction()
            r5.f4623g = r0
            android.database.sqlite.SQLiteDatabase r0 = r14.a()
            android.database.sqlite.SQLiteStatement r0 = r0.compileStatement(r4)
            long r6 = r0.simpleQueryForLong()
            android.database.sqlite.SQLiteDatabase r0 = r14.a()
            android.database.sqlite.SQLiteStatement r0 = r0.compileStatement(r3)
            long r2 = r0.simpleQueryForLong()
            long r2 = r2 * r6
            y0.a r0 = y0.C0519a.f4809f
            u0.f r4 = new u0.f
            long r6 = r0.f4810a
            r4.<init>(r2, r6)
            u0.b r0 = new u0.b
            r0.<init>(r4)
            r5.f4625i = r0
            o2.a r0 = r14.f4828j
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r5.f4622f = r0
            u0.a r0 = new u0.a
            java.lang.Object r2 = r5.f4623g
            u0.g r2 = (u0.g) r2
            java.lang.Object r3 = r5.f4624h
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            java.lang.Object r4 = r5.f4625i
            u0.b r4 = (u0.b) r4
            java.lang.Object r5 = r5.f4622f
            java.lang.String r5 = (java.lang.String) r5
            r0.<init>(r2, r3, r4, r5)
            return r0
        L_0x013f:
            r0 = move-exception
            r2.endTransaction()
            throw r0
        L_0x0144:
            r12 = r9
            r2 = r26
            android.database.sqlite.SQLiteDatabase r2 = (android.database.sqlite.SQLiteDatabase) r2
            y0.i r14 = (y0.i) r14
            android.database.sqlite.SQLiteDatabase r5 = r14.a()
            android.database.sqlite.SQLiteStatement r4 = r5.compileStatement(r4)
            long r4 = r4.simpleQueryForLong()
            android.database.sqlite.SQLiteDatabase r6 = r14.a()
            android.database.sqlite.SQLiteStatement r3 = r6.compileStatement(r3)
            long r6 = r3.simpleQueryForLong()
            long r6 = r6 * r4
            y0.a r3 = r14.f4827i
            long r4 = r3.f4810a
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r0.h r13 = (r0.h) r13
            java.lang.String r5 = r13.f4420a
            if (r4 < 0) goto L_0x017d
            r2 = 1
            r14.e(r2, r12, r5)
            r2 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L_0x02b3
        L_0x017d:
            r0.i r11 = (r0.i) r11
            java.lang.Long r4 = y0.i.b(r2, r11)
            if (r4 == 0) goto L_0x018a
            long r6 = r4.longValue()
            goto L_0x01c4
        L_0x018a:
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.String r6 = "backend_name"
            java.lang.String r7 = r11.f4426a
            r4.put(r6, r7)
            o0.d r6 = r11.f4428c
            int r6 = B0.a.a(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "priority"
            r4.put(r7, r6)
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.String r8 = "next_request_ms"
            r4.put(r8, r7)
            byte[] r7 = r11.f4427b
            if (r7 == 0) goto L_0x01bc
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r6)
            java.lang.String r6 = "extras"
            r4.put(r6, r7)
        L_0x01bc:
            java.lang.String r6 = "transport_contexts"
            r7 = 0
            long r8 = r2.insert(r6, r7, r4)
            r6 = r8
        L_0x01c4:
            r0.k r4 = r13.f4422c
            byte[] r8 = r4.f4436b
            int r9 = r8.length
            int r3 = r3.f4814e
            if (r9 > r3) goto L_0x01cf
            r9 = r15
            goto L_0x01d0
        L_0x01cf:
            r9 = 0
        L_0x01d0:
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.String r7 = "context_id"
            r10.put(r7, r6)
            java.lang.String r6 = "transport_name"
            r10.put(r6, r5)
            long r5 = r13.f4423d
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "timestamp_ms"
            r10.put(r6, r5)
            long r5 = r13.f4424e
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "uptime_ms"
            r10.put(r6, r5)
            o0.c r4 = r4.f4435a
            java.lang.String r4 = r4.f4141a
            java.lang.String r5 = "payload_encoding"
            r10.put(r5, r4)
            java.lang.String r4 = "code"
            java.lang.Integer r5 = r13.f4421b
            r10.put(r4, r5)
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.String r6 = "num_attempts"
            r10.put(r6, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)
            java.lang.String r6 = "inline"
            r10.put(r6, r5)
            if (r9 == 0) goto L_0x0220
            r4 = r8
            goto L_0x0222
        L_0x0220:
            byte[] r4 = new byte[r4]
        L_0x0222:
            java.lang.String r5 = "payload"
            r10.put(r5, r4)
            java.lang.String r4 = "events"
            r5 = 0
            long r6 = r2.insert(r4, r5, r10)
            java.lang.String r4 = "event_id"
            if (r9 != 0) goto L_0x026c
            int r5 = r8.length
            double r9 = (double) r5
            double r11 = (double) r3
            double r9 = r9 / r11
            double r9 = java.lang.Math.ceil(r9)
            int r5 = (int) r9
            r9 = r15
        L_0x023c:
            if (r9 > r5) goto L_0x026c
            int r10 = r9 + -1
            int r10 = r10 * r3
            int r11 = r9 * r3
            int r12 = r8.length
            int r11 = java.lang.Math.min(r11, r12)
            byte[] r10 = java.util.Arrays.copyOfRange(r8, r10, r11)
            android.content.ContentValues r11 = new android.content.ContentValues
            r11.<init>()
            java.lang.Long r12 = java.lang.Long.valueOf(r6)
            r11.put(r4, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            java.lang.String r14 = "sequence_num"
            r11.put(r14, r12)
            r11.put(r0, r10)
            java.lang.String r10 = "event_payloads"
            r12 = 0
            r2.insert(r10, r12, r11)
            int r9 = r9 + r15
            goto L_0x023c
        L_0x026c:
            java.util.HashMap r0 = r13.f4425f
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x027a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x02af
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            r5.put(r4, r8)
            java.lang.Object r8 = r3.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "name"
            r5.put(r9, r8)
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r8 = "value"
            r5.put(r8, r3)
            java.lang.String r3 = "event_metadata"
            r8 = 0
            r2.insert(r3, r8, r5)
            goto L_0x027a
        L_0x02af:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
        L_0x02b3:
            return r0
        L_0x02b4:
            r2 = r26
            android.database.Cursor r2 = (android.database.Cursor) r2
            y0.i r14 = (y0.i) r14
            r14.getClass()
        L_0x02bd:
            boolean r3 = r2.moveToNext()
            if (r3 == 0) goto L_0x03ce
            r3 = 0
            long r4 = r2.getLong(r3)
            r3 = 7
            int r3 = r2.getInt(r3)
            if (r3 == 0) goto L_0x02d1
            r3 = r15
            goto L_0x02d2
        L_0x02d1:
            r3 = 0
        L_0x02d2:
            T1.d r6 = new T1.d
            r6.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r6.f1708f = r7
            java.lang.String r7 = r2.getString(r15)
            if (r7 == 0) goto L_0x03c6
            r6.f1703a = r7
            long r7 = r2.getLong(r10)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r6.f1706d = r7
            r7 = 3
            long r8 = r2.getLong(r7)
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6.f1707e = r8
            if (r3 == 0) goto L_0x0320
            r0.k r3 = new r0.k
            r8 = 4
            java.lang.String r9 = r2.getString(r8)
            if (r9 != 0) goto L_0x030a
            o0.c r8 = y0.i.f4823k
        L_0x0308:
            r9 = 5
            goto L_0x0310
        L_0x030a:
            o0.c r8 = new o0.c
            r8.<init>(r9)
            goto L_0x0308
        L_0x0310:
            byte[] r12 = r2.getBlob(r9)
            r3.<init>(r8, r12)
            r6.f1705c = r3
            r19 = r0
            r0 = r15
            r1 = 6
            r8 = 0
            goto L_0x0397
        L_0x0320:
            r9 = 5
            r0.k r3 = new r0.k
            r8 = 4
            java.lang.String r12 = r2.getString(r8)
            if (r12 != 0) goto L_0x032d
            o0.c r12 = y0.i.f4823k
            goto L_0x0333
        L_0x032d:
            o0.c r7 = new o0.c
            r7.<init>(r12)
            r12 = r7
        L_0x0333:
            android.database.sqlite.SQLiteDatabase r17 = r14.a()
            java.lang.String[] r19 = new java.lang.String[]{r0}
            java.lang.String r7 = java.lang.String.valueOf(r4)
            java.lang.String[] r21 = new java.lang.String[]{r7}
            r23 = 0
            java.lang.String r24 = "sequence_num"
            java.lang.String r18 = "event_payloads"
            java.lang.String r20 = "event_id = ?"
            r22 = 0
            android.database.Cursor r7 = r17.query(r18, r19, r20, r21, r22, r23, r24)
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x03c1 }
            r8.<init>()     // Catch:{ all -> 0x03c1 }
            r9 = 0
        L_0x0357:
            boolean r17 = r7.moveToNext()     // Catch:{ all -> 0x03c1 }
            if (r17 == 0) goto L_0x036a
            r10 = 0
            byte[] r15 = r7.getBlob(r10)     // Catch:{ all -> 0x03c1 }
            r8.add(r15)     // Catch:{ all -> 0x03c1 }
            int r10 = r15.length     // Catch:{ all -> 0x03c1 }
            int r9 = r9 + r10
            r10 = 2
            r15 = 1
            goto L_0x0357
        L_0x036a:
            byte[] r9 = new byte[r9]     // Catch:{ all -> 0x03c1 }
            r19 = r0
            r10 = 0
            r15 = 0
        L_0x0370:
            int r0 = r8.size()     // Catch:{ all -> 0x03c1 }
            if (r10 >= r0) goto L_0x038c
            java.lang.Object r0 = r8.get(r10)     // Catch:{ all -> 0x03c1 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x03c1 }
            int r1 = r0.length     // Catch:{ all -> 0x03c1 }
            r26 = r8
            r8 = 0
            java.lang.System.arraycopy(r0, r8, r9, r15, r1)     // Catch:{ all -> 0x03c1 }
            int r0 = r0.length     // Catch:{ all -> 0x03c1 }
            int r15 = r15 + r0
            r0 = 1
            int r10 = r10 + r0
            r1 = r25
            r8 = r26
            goto L_0x0370
        L_0x038c:
            r0 = 1
            r8 = 0
            r7.close()
            r3.<init>(r12, r9)
            r6.f1705c = r3
            r1 = 6
        L_0x0397:
            boolean r3 = r2.isNull(r1)
            if (r3 != 0) goto L_0x03a7
            int r3 = r2.getInt(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.f1704b = r3
        L_0x03a7:
            r0.h r3 = r6.j()
            y0.b r6 = new y0.b
            r7 = r11
            r0.i r7 = (r0.i) r7
            r6.<init>(r4, r7, r3)
            r3 = r13
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r6)
            r1 = r25
            r15 = r0
            r0 = r19
            r10 = 2
            goto L_0x02bd
        L_0x03c1:
            r0 = move-exception
            r7.close()
            throw r0
        L_0x03c6:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null transportName"
            r0.<init>(r1)
            throw r0
        L_0x03ce:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.C0454o.apply(java.lang.Object):java.lang.Object");
    }

    public Object b() {
        C0500a aVar = (C0500a) this.f4579g;
        i iVar = (i) aVar.f4726d;
        iVar.getClass();
        r0.i iVar2 = (r0.i) this.f4580h;
        h hVar = (h) this.f4581i;
        String B3 = C0094a.B("SQLiteEventStore");
        if (Log.isLoggable(B3, 3)) {
            Log.d(B3, "Storing event with priority=" + iVar2.f4428c + ", name=" + hVar.f4420a + " for destination " + iVar2.f4426a);
        }
        ((Long) iVar.c(new C0454o(iVar, hVar, iVar2, 3))).getClass();
        aVar.f4723a.a(iVar2, 1, false);
        return null;
    }
}
