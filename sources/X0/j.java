package x0;

import A0.a;
import android.content.Context;
import java.util.concurrent.Executor;
import s0.f;
import y0.c;
import y0.d;
import z0.C0524c;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4792a;

    /* renamed from: b  reason: collision with root package name */
    public final f f4793b;

    /* renamed from: c  reason: collision with root package name */
    public final d f4794c;

    /* renamed from: d  reason: collision with root package name */
    public final C0512d f4795d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f4796e;

    /* renamed from: f  reason: collision with root package name */
    public final C0524c f4797f;

    /* renamed from: g  reason: collision with root package name */
    public final a f4798g;

    /* renamed from: h  reason: collision with root package name */
    public final a f4799h;

    /* renamed from: i  reason: collision with root package name */
    public final c f4800i;

    public j(Context context, f fVar, d dVar, C0512d dVar2, Executor executor, C0524c cVar, a aVar, a aVar2, c cVar2) {
        this.f4792a = context;
        this.f4793b = fVar;
        this.f4794c = dVar;
        this.f4795d = dVar2;
        this.f4796e = executor;
        this.f4797f = cVar;
        this.f4798g = aVar;
        this.f4799h = aVar2;
        this.f4800i = cVar2;
    }

    /* JADX WARNING: type inference failed for: r2v51, types: [j.r0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v35, types: [j.r0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v21, types: [T1.d, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x03a2 A[Catch:{ IOException -> 0x03ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03ed A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0384 A[Catch:{ IOException -> 0x03ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0394 A[Catch:{ IOException -> 0x03ad }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(r0.i r46, int r47) {
        /*
            r45 = this;
            r7 = r45
            r8 = r46
            r9 = 1
            r1 = 0
            s0.f r0 = r7.f4793b
            java.lang.String r2 = r8.f4426a
            s0.g r2 = r0.a(r2)
            r5 = 0
        L_0x0010:
            x0.h r0 = new x0.h
            r0.<init>(r7, r8, r1)
            z0.c r10 = r7.f4797f
            y0.i r10 = (y0.i) r10
            java.lang.Object r0 = r10.g(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x047a
            x0.h r0 = new x0.h
            r0.<init>(r7, r8, r9)
            java.lang.Object r0 = r10.g(r0)
            r11 = r0
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r0 = r11.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L_0x003c
            return
        L_0x003c:
            r0 = 3
            r13 = -1
            byte[] r15 = r8.f4427b
            if (r2 != 0) goto L_0x0054
            java.lang.String r4 = "Uploader"
            java.lang.String r12 = "Unknown backend for %s, deleting event batch for it..."
            a.C0094a.l(r4, r12, r8)
            s0.a r4 = new s0.a
            r4.<init>(r13, r0)
            r32 = r2
        L_0x0051:
            r1 = 2
            goto L_0x03e9
        L_0x0054:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r12 = r11.iterator()
        L_0x005d:
            boolean r16 = r12.hasNext()
            if (r16 == 0) goto L_0x0071
            java.lang.Object r16 = r12.next()
            r3 = r16
            y0.b r3 = (y0.b) r3
            r0.h r3 = r3.f4817c
            r4.add(r3)
            goto L_0x005d
        L_0x0071:
            if (r15 == 0) goto L_0x0075
            r3 = r9
            goto L_0x0076
        L_0x0075:
            r3 = r1
        L_0x0076:
            java.lang.String r12 = "proto"
            if (r3 == 0) goto L_0x00e2
            y0.c r3 = r7.f4800i
            java.util.Objects.requireNonNull(r3)
            S1.r r9 = new S1.r
            r0 = 12
            r9.<init>(r0, r3)
            java.lang.Object r0 = r10.g(r9)
            u0.a r0 = (u0.a) r0
            T1.d r3 = new T1.d
            r3.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r3.f1708f = r9
            A0.a r9 = r7.f4798g
            long r17 = r9.c()
            java.lang.Long r9 = java.lang.Long.valueOf(r17)
            r3.f1706d = r9
            A0.a r9 = r7.f4799h
            long r17 = r9.c()
            java.lang.Long r9 = java.lang.Long.valueOf(r17)
            r3.f1707e = r9
            java.lang.String r9 = "GDT_CLIENT_METRICS"
            r3.f1703a = r9
            r0.k r9 = new r0.k
            o0.c r13 = new o0.c
            r13.<init>(r12)
            r0.getClass()
            C0.f r14 = r0.m.f4438a
            r14.getClass()
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r14.C(r0, r1)     // Catch:{ IOException -> 0x00cb }
        L_0x00cb:
            byte[] r0 = r1.toByteArray()
            r9.<init>(r13, r0)
            r3.f1705c = r9
            r0.h r0 = r3.j()
            r1 = r2
            p0.d r1 = (p0.d) r1
            r0.h r0 = r1.a(r0)
            r4.add(r0)
        L_0x00e2:
            r0 = r2
            p0.d r0 = (p0.d) r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r3 = r4.iterator()
        L_0x00ee:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0118
            java.lang.Object r4 = r3.next()
            r0.h r4 = (r0.h) r4
            java.lang.String r9 = r4.f4420a
            boolean r13 = r1.containsKey(r9)
            if (r13 != 0) goto L_0x010e
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r13.add(r4)
            r1.put(r9, r13)
            goto L_0x00ee
        L_0x010e:
            java.lang.Object r9 = r1.get(r9)
            java.util.List r9 = (java.util.List) r9
            r9.add(r4)
            goto L_0x00ee
        L_0x0118:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0125:
            boolean r4 = r1.hasNext()
            java.lang.String r14 = "CctTransportBackend"
            if (r4 == 0) goto L_0x0345
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r20 = r4.getValue()
            r9 = r20
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            java.lang.Object r9 = r9.get(r13)
            r0.h r9 = (r0.h) r9
            q0.w r19 = q0.w.f4383f
            A0.a r13 = r0.f4183f
            long r23 = r13.c()
            A0.a r13 = r0.f4182e
            long r25 = r13.c()
            java.lang.String r13 = "sdk-version"
            int r13 = r9.b(r13)
            java.lang.Integer r28 = java.lang.Integer.valueOf(r13)
            java.lang.String r13 = "model"
            java.lang.String r29 = r9.a(r13)
            java.lang.String r13 = "hardware"
            java.lang.String r30 = r9.a(r13)
            java.lang.String r13 = "device"
            java.lang.String r31 = r9.a(r13)
            java.lang.String r13 = "product"
            java.lang.String r32 = r9.a(r13)
            java.lang.String r13 = "os-uild"
            java.lang.String r33 = r9.a(r13)
            java.lang.String r13 = "manufacturer"
            java.lang.String r34 = r9.a(r13)
            java.lang.String r13 = "fingerprint"
            java.lang.String r35 = r9.a(r13)
            java.lang.String r13 = "country"
            java.lang.String r37 = r9.a(r13)
            java.lang.String r13 = "locale"
            java.lang.String r36 = r9.a(r13)
            java.lang.String r13 = "mcc_mnc"
            java.lang.String r38 = r9.a(r13)
            java.lang.String r13 = "application_build"
            java.lang.String r39 = r9.a(r13)
            q0.h r9 = new q0.h
            r27 = r9
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            q0.j r13 = new q0.j
            r13.<init>(r9)
            java.lang.Object r9 = r4.getKey()     // Catch:{ NumberFormatException -> 0x01bb }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x01bb }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x01bb }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ NumberFormatException -> 0x01bb }
            r28 = r9
            r29 = 0
            goto L_0x01c5
        L_0x01bb:
            java.lang.Object r9 = r4.getKey()
            java.lang.String r9 = (java.lang.String) r9
            r29 = r9
            r28 = 0
        L_0x01c5:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x01d4:
            boolean r21 = r4.hasNext()
            if (r21 == 0) goto L_0x0325
            java.lang.Object r21 = r4.next()
            r31 = r1
            r1 = r21
            r0.h r1 = (r0.h) r1
            r32 = r2
            r0.k r2 = r1.f4422c
            r21 = r4
            o0.c r4 = r2.f4435a
            o0.c r8 = new o0.c
            r8.<init>(r12)
            boolean r8 = r4.equals(r8)
            byte[] r2 = r2.f4436b
            if (r8 == 0) goto L_0x0203
            j.r0 r4 = new j.r0
            r4.<init>()
            r4.f3776i = r2
            r33 = r12
            goto L_0x0225
        L_0x0203:
            o0.c r8 = new o0.c
            r33 = r12
            java.lang.String r12 = "json"
            r8.<init>(r12)
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x0303
            java.lang.String r4 = new java.lang.String
            java.lang.String r8 = "UTF-8"
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r8)
            r4.<init>(r2, r8)
            j.r0 r2 = new j.r0
            r2.<init>()
            r2.f3777j = r4
            r4 = r2
        L_0x0225:
            long r7 = r1.f4423d
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r4.f3773f = r2
            long r7 = r1.f4424e
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r4.f3775h = r2
            java.util.HashMap r2 = r1.f4425f
            java.lang.String r7 = "tz-offset"
            java.lang.Object r2 = r2.get(r7)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0244
            r7 = 0
            goto L_0x024c
        L_0x0244:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r7 = r2.longValue()
        L_0x024c:
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r4.f3778k = r2
            java.lang.String r2 = "net-type"
            int r2 = r1.b(r2)
            android.util.SparseArray r7 = q0.u.f4381f
            java.lang.Object r2 = r7.get(r2)
            q0.u r2 = (q0.u) r2
            java.lang.String r7 = "mobile-subtype"
            int r7 = r1.b(r7)
            android.util.SparseArray r8 = q0.t.f4379f
            java.lang.Object r7 = r8.get(r7)
            q0.t r7 = (q0.t) r7
            q0.n r8 = new q0.n
            r8.<init>(r2, r7)
            r4.f3779l = r8
            java.lang.Integer r1 = r1.f4421b
            if (r1 == 0) goto L_0x027b
            r4.f3774g = r1
        L_0x027b:
            java.lang.Object r1 = r4.f3773f
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 != 0) goto L_0x0284
            java.lang.String r1 = " eventTimeMs"
            goto L_0x0286
        L_0x0284:
            java.lang.String r1 = ""
        L_0x0286:
            java.lang.Object r2 = r4.f3775h
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 != 0) goto L_0x0292
            java.lang.String r2 = " eventUptimeMs"
            java.lang.String r1 = r1.concat(r2)
        L_0x0292:
            java.lang.Object r2 = r4.f3778k
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 != 0) goto L_0x02a9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " timezoneOffsetSeconds"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x02a9:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x02f7
            q0.k r1 = new q0.k
            java.lang.Object r2 = r4.f3773f
            java.lang.Long r2 = (java.lang.Long) r2
            long r35 = r2.longValue()
            java.lang.Object r2 = r4.f3774g
            r37 = r2
            java.lang.Integer r37 = (java.lang.Integer) r37
            java.lang.Object r2 = r4.f3775h
            java.lang.Long r2 = (java.lang.Long) r2
            long r38 = r2.longValue()
            java.lang.Object r2 = r4.f3776i
            r40 = r2
            byte[] r40 = (byte[]) r40
            java.lang.Object r2 = r4.f3777j
            r41 = r2
            java.lang.String r41 = (java.lang.String) r41
            java.lang.Object r2 = r4.f3778k
            java.lang.Long r2 = (java.lang.Long) r2
            long r42 = r2.longValue()
            java.lang.Object r2 = r4.f3779l
            r44 = r2
            q0.n r44 = (q0.n) r44
            r34 = r1
            r34.<init>(r35, r37, r38, r40, r41, r42, r44)
            r9.add(r1)
        L_0x02e9:
            r7 = r45
            r8 = r46
            r4 = r21
            r1 = r31
            r2 = r32
            r12 = r33
            goto L_0x01d4
        L_0x02f7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0303:
            java.lang.String r1 = a.C0094a.B(r14)
            r2 = 5
            boolean r7 = android.util.Log.isLoggable(r1, r2)
            if (r7 == 0) goto L_0x02e9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Received event of unsupported encoding "
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r4 = ". Skipping..."
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            android.util.Log.w(r1, r4)
            goto L_0x02e9
        L_0x0325:
            r31 = r1
            r32 = r2
            r33 = r12
            q0.l r1 = new q0.l
            r22 = r1
            r27 = r13
            r30 = r9
            r22.<init>(r23, r25, r27, r28, r29, r30)
            r3.add(r1)
            r7 = r45
            r8 = r46
            r1 = r31
            r2 = r32
            r12 = r33
            goto L_0x0125
        L_0x0345:
            r32 = r2
            r2 = 5
            q0.i r1 = new q0.i
            r1.<init>(r3)
            java.net.URL r3 = r0.f4181d
            if (r15 == 0) goto L_0x036f
            p0.a r4 = p0.C0360a.a(r15)     // Catch:{ IllegalArgumentException -> 0x0364 }
            java.lang.String r7 = r4.f4171b     // Catch:{ IllegalArgumentException -> 0x0364 }
            if (r7 == 0) goto L_0x035a
            goto L_0x035b
        L_0x035a:
            r7 = 0
        L_0x035b:
            java.lang.String r4 = r4.f4170a     // Catch:{ IllegalArgumentException -> 0x0364 }
            if (r4 == 0) goto L_0x0370
            java.net.URL r3 = p0.d.b(r4)     // Catch:{ IllegalArgumentException -> 0x0364 }
            goto L_0x0370
        L_0x0364:
            s0.a r0 = new s0.a
            r1 = 3
            r2 = -1
            r0.<init>(r2, r1)
        L_0x036c:
            r4 = r0
            goto L_0x0051
        L_0x036f:
            r7 = 0
        L_0x0370:
            p0.b r4 = new p0.b     // Catch:{ IOException -> 0x03ad }
            r4.<init>(r3, r1, r7)     // Catch:{ IOException -> 0x03ad }
            S1.r r1 = new S1.r     // Catch:{ IOException -> 0x03ad }
            r3 = 7
            r1.<init>(r3, r0)     // Catch:{ IOException -> 0x03ad }
            r13 = r2
        L_0x037c:
            p0.c r0 = r1.c(r4)     // Catch:{ IOException -> 0x03ad }
            java.net.URL r2 = r0.f4176b     // Catch:{ IOException -> 0x03ad }
            if (r2 == 0) goto L_0x0394
            java.lang.String r3 = "Following redirect to: %s"
            a.C0094a.l(r14, r3, r2)     // Catch:{ IOException -> 0x03ad }
            p0.b r3 = new p0.b     // Catch:{ IOException -> 0x03ad }
            q0.i r7 = r4.f4173b     // Catch:{ IOException -> 0x03ad }
            java.lang.String r4 = r4.f4174c     // Catch:{ IOException -> 0x03ad }
            r3.<init>(r2, r7, r4)     // Catch:{ IOException -> 0x03ad }
            r4 = r3
            goto L_0x0395
        L_0x0394:
            r4 = 0
        L_0x0395:
            if (r4 == 0) goto L_0x039c
            int r13 = r13 + -1
            r2 = 1
            if (r13 >= r2) goto L_0x037c
        L_0x039c:
            int r1 = r0.f4175a     // Catch:{ IOException -> 0x03ad }
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L_0x03af
            long r0 = r0.f4177c     // Catch:{ IOException -> 0x03ad }
            s0.a r2 = new s0.a     // Catch:{ IOException -> 0x03ad }
            r3 = 1
            r2.<init>(r0, r3)     // Catch:{ IOException -> 0x03ad }
            r4 = r2
            goto L_0x0051
        L_0x03ad:
            r0 = move-exception
            goto L_0x03db
        L_0x03af:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 >= r0) goto L_0x03d2
            r0 = 404(0x194, float:5.66E-43)
            if (r1 != r0) goto L_0x03b8
            goto L_0x03d2
        L_0x03b8:
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x03c9
            s0.a r0 = new s0.a     // Catch:{ IOException -> 0x03c5 }
            r1 = -1
            r3 = 4
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x03ad }
            goto L_0x036c
        L_0x03c5:
            r0 = move-exception
            r1 = -1
            goto L_0x03db
        L_0x03c9:
            r1 = -1
            s0.a r0 = new s0.a     // Catch:{ IOException -> 0x03ad }
            r3 = 3
            r0.<init>(r1, r3)     // Catch:{ IOException -> 0x03ad }
            goto L_0x036c
        L_0x03d2:
            s0.a r0 = new s0.a     // Catch:{ IOException -> 0x03ad }
            r1 = 2
            r2 = -1
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x03ad }
            goto L_0x036c
        L_0x03db:
            java.lang.String r1 = "Could not make request to the backend"
            a.C0094a.q(r14, r1, r0)
            s0.a r0 = new s0.a
            r1 = 2
            r2 = -1
            r0.<init>(r2, r1)
            r4 = r0
        L_0x03e9:
            int r0 = r4.f4470a
            if (r0 != r1) goto L_0x0406
            b1.b r0 = new b1.b
            r1 = r0
            r2 = r45
            r3 = r11
            r4 = r46
            r1.<init>(r2, r3, r4, r5)
            r10.g(r0)
            r1 = 1
            int r0 = r47 + 1
            x0.d r3 = r2.f4795d
            r7 = r46
            r3.a(r7, r0, r1)
            return
        L_0x0406:
            r1 = 1
            r2 = r45
            r7 = r46
            i2.e r3 = new i2.e
            r8 = 6
            r3.<init>(r8, r2, r11)
            r10.g(r3)
            if (r0 != r1) goto L_0x042a
            long r0 = r4.f4471b
            long r5 = java.lang.Math.max(r5, r0)
            if (r15 == 0) goto L_0x0428
            S1.r r0 = new S1.r
            r1 = 14
            r0.<init>(r1, r2)
            r10.g(r0)
        L_0x0428:
            r4 = 1
            goto L_0x0472
        L_0x042a:
            r1 = 4
            if (r0 != r1) goto L_0x0428
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r1 = r11.iterator()
        L_0x0436:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0469
            java.lang.Object r3 = r1.next()
            y0.b r3 = (y0.b) r3
            r0.h r3 = r3.f4817c
            java.lang.String r3 = r3.f4420a
            boolean r4 = r0.containsKey(r3)
            if (r4 != 0) goto L_0x0455
            r4 = 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r0.put(r3, r8)
            goto L_0x0436
        L_0x0455:
            r4 = 1
            java.lang.Object r8 = r0.get(r3)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            int r8 = r8 + r4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.put(r3, r8)
            goto L_0x0436
        L_0x0469:
            r4 = 1
            i2.e r1 = new i2.e
            r1.<init>(r2, r0)
            r10.g(r1)
        L_0x0472:
            r9 = r4
            r8 = r7
            r1 = 0
            r7 = r2
            r2 = r32
            goto L_0x0010
        L_0x047a:
            r2 = r7
            r7 = r8
            x0.i r0 = new x0.i
            r0.<init>(r5, r2, r7)
            r10.g(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.j.a(r0.i, int):void");
    }
}
