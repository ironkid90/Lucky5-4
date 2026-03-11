package S1;

import G0.z;
import P2.i;
import c2.f;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;

public final class v implements w {

    /* renamed from: f  reason: collision with root package name */
    public final f f1520f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f1521g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f1522h;

    /* renamed from: i  reason: collision with root package name */
    public final i f1523i;

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, S1.z] */
    public v(f fVar) {
        HashMap hashMap = new HashMap();
        this.f1522h = hashMap;
        this.f1523i = new i();
        this.f1520f = fVar;
        x xVar = A.f1420a;
        ? obj = new Object();
        obj.f1526a = false;
        z zVar = new z[]{obj}[0];
        zVar.getClass();
        hashMap.put(4294967556L, zVar);
    }

    public final void a(s sVar, z zVar) {
        t tVar;
        int i3;
        long j3;
        long j4;
        long j5;
        byte[] bArr = null;
        if (zVar == null) {
            tVar = null;
        } else {
            tVar = new t(zVar);
        }
        try {
            String str = sVar.f1513g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            if (bArr == null) {
                i3 = 0;
            } else {
                i3 = bArr.length;
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i3 + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong((long) i3);
            allocateDirect.putLong(sVar.f1507a);
            int i4 = sVar.f1508b;
            if (i4 == 1) {
                j3 = 0;
            } else if (i4 == 2) {
                j3 = 1;
            } else if (i4 == 3) {
                j3 = 2;
            } else {
                throw null;
            }
            allocateDirect.putLong(j3);
            allocateDirect.putLong(sVar.f1509c);
            allocateDirect.putLong(sVar.f1510d);
            if (sVar.f1511e) {
                j4 = 1;
            } else {
                j4 = 0;
            }
            allocateDirect.putLong(j4);
            int i5 = sVar.f1512f;
            if (i5 == 1) {
                j5 = 0;
            } else if (i5 == 2) {
                j5 = 1;
            } else if (i5 == 3) {
                j5 = 2;
            } else if (i5 == 4) {
                j5 = 3;
            } else if (i5 == 5) {
                j5 = 4;
            } else {
                throw null;
            }
            allocateDirect.putLong(j5);
            if (bArr != null) {
                allocateDirect.put(bArr);
            }
            this.f1520f.r("flutter/keydata", allocateDirect, tVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [S1.s, java.lang.Object] */
    public final void b(boolean z3, Long l3, Long l4, long j3) {
        int i3;
        ? obj = new Object();
        obj.f1507a = j3;
        if (z3) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        obj.f1508b = i3;
        obj.f1510d = l3.longValue();
        obj.f1509c = l4.longValue();
        obj.f1513g = null;
        obj.f1511e = true;
        obj.f1512f = 1;
        if (!(l4.longValue() == 0 || l3.longValue() == 0)) {
            if (!z3) {
                l3 = null;
            }
            c(l4, l3);
        }
        a(obj, (z) null);
    }

    public final void c(Long l3, Long l4) {
        HashMap hashMap = this.f1521g;
        if (l4 != null) {
            if (((Long) hashMap.put(l3, l4)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l3)) == null) {
            throw new AssertionError("The key was empty");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v30, types: [S1.s, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0378 A[LOOP:6: B:155:0x0372->B:157:0x0378, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.view.KeyEvent r30, G0.z r31) {
        /*
            r29 = this;
            r7 = r29
            r8 = r31
            int r0 = r30.getScanCode()
            r10 = 0
            if (r0 != 0) goto L_0x0015
            int r0 = r30.getKeyCode()
            if (r0 != 0) goto L_0x0015
            r0 = r10
            goto L_0x02f5
        L_0x0015:
            int r0 = r30.getScanCode()
            long r0 = (long) r0
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            r3 = 73014444032(0x1100000000, double:3.60739284464E-313)
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r2 != 0) goto L_0x0035
            int r0 = r30.getKeyCode()
            long r0 = (long) r0
            long r0 = r0 & r5
            long r0 = r0 | r3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0033:
            r12 = r0
            goto L_0x0050
        L_0x0035:
            S1.x r2 = S1.A.f1420a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r2.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x0044
            goto L_0x0033
        L_0x0044:
            int r0 = r30.getScanCode()
            long r0 = (long) r0
            long r0 = r0 & r5
            long r0 = r0 | r3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0033
        L_0x0050:
            S1.x r0 = S1.A.f1421b
            int r1 = r30.getKeyCode()
            long r1 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x0065
        L_0x0063:
            r13 = r0
            goto L_0x0071
        L_0x0065:
            int r0 = r30.getKeyCode()
            long r0 = (long) r0
            long r0 = r0 & r5
            long r0 = r0 | r3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0063
        L_0x0071:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            F0.y[] r15 = S1.A.f1422c
            int r6 = r15.length
            r3 = 0
        L_0x007a:
            java.util.HashMap r4 = r7.f1521g
            r1 = 2
            if (r3 >= r6) goto L_0x0213
            r0 = r15[r3]
            int r16 = r30.getMetaState()
            int r2 = r0.f360a
            r2 = r16 & r2
            if (r2 == 0) goto L_0x008e
            r16 = 1
            goto L_0x0090
        L_0x008e:
            r16 = 0
        L_0x0090:
            long r18 = r13.longValue()
            long r20 = r12.longValue()
            java.lang.Object r0 = r0.f361b
            r22 = r0
            S1.y[] r22 = (S1.y[]) r22
            boolean[] r2 = new boolean[r1]
            java.lang.Boolean[] r0 = new java.lang.Boolean[r1]
            r10 = 0
            r11 = 0
        L_0x00a4:
            if (r10 >= r1) goto L_0x019d
            r5 = r22[r10]
            r25 = r2
            long r1 = r5.f1524a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r1 = r4.containsKey(r1)
            r25[r10] = r1
            r26 = r10
            long r9 = r5.f1525b
            int r2 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r2 != 0) goto L_0x0175
            int r1 = r30.getRepeatCount()
            if (r1 <= 0) goto L_0x00c6
            r1 = 1
            goto L_0x00c7
        L_0x00c6:
            r1 = 0
        L_0x00c7:
            int r2 = r30.getAction()
            if (r2 == 0) goto L_0x00da
            r9 = 1
            if (r2 != r9) goto L_0x00d2
            r1 = 2
            goto L_0x00df
        L_0x00d2:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Unexpected event type"
            r0.<init>(r1)
            throw r0
        L_0x00da:
            if (r1 == 0) goto L_0x00de
            r1 = 3
            goto L_0x00df
        L_0x00de:
            r1 = 1
        L_0x00df:
            int r1 = L.j.b(r1)
            if (r1 == 0) goto L_0x014f
            r2 = 1
            if (r1 == r2) goto L_0x0138
            r2 = 2
            if (r1 == r2) goto L_0x00fb
            r24 = r0
            r9 = r2
            r28 = r4
            r23 = r6
            r27 = r15
            r17 = r25
            r15 = 0
            r25 = r3
            goto L_0x018c
        L_0x00fb:
            if (r16 != 0) goto L_0x011f
            S1.u r9 = new S1.u
            r10 = 1
            r24 = r0
            r0 = r9
            r11 = r2
            r1 = r29
            r17 = r25
            r2 = r5
            r25 = r3
            r5 = r4
            r3 = r20
            r28 = r5
            r27 = r15
            r15 = 0
            r5 = r30
            r23 = r6
            r6 = r10
            r0.<init>(r1, r2, r3, r5, r6)
            r14.add(r9)
            goto L_0x012d
        L_0x011f:
            r24 = r0
            r11 = r2
            r28 = r4
            r23 = r6
            r27 = r15
            r17 = r25
            r15 = 0
            r25 = r3
        L_0x012d:
            boolean r0 = r17[r26]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r24[r26] = r0
            r9 = r11
        L_0x0136:
            r11 = 1
            goto L_0x018c
        L_0x0138:
            r24 = r0
            r28 = r4
            r23 = r6
            r27 = r15
            r17 = r25
            r9 = 2
            r15 = 0
            r25 = r3
            boolean r0 = r17[r26]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r24[r26] = r0
            goto L_0x018c
        L_0x014f:
            r24 = r0
            r28 = r4
            r23 = r6
            r27 = r15
            r17 = r25
            r9 = 2
            r15 = 0
            r25 = r3
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r24[r26] = r0
            if (r16 != 0) goto L_0x0136
            S1.u r10 = new S1.u
            r6 = 0
            r0 = r10
            r1 = r29
            r2 = r5
            r3 = r20
            r5 = r30
            r0.<init>(r1, r2, r3, r5, r6)
            r14.add(r10)
            goto L_0x0136
        L_0x0175:
            r24 = r0
            r28 = r4
            r23 = r6
            r27 = r15
            r17 = r25
            r9 = 2
            r15 = 0
            r25 = r3
            if (r11 != 0) goto L_0x018a
            if (r1 == 0) goto L_0x0188
            goto L_0x018a
        L_0x0188:
            r5 = r15
            goto L_0x018b
        L_0x018a:
            r5 = 1
        L_0x018b:
            r11 = r5
        L_0x018c:
            int r10 = r26 + 1
            r1 = r9
            r2 = r17
            r6 = r23
            r0 = r24
            r3 = r25
            r15 = r27
            r4 = r28
            goto L_0x00a4
        L_0x019d:
            r24 = r0
            r9 = r1
            r17 = r2
            r25 = r3
            r23 = r6
            r27 = r15
            r15 = 0
            if (r16 == 0) goto L_0x01cd
            r5 = r15
        L_0x01ac:
            if (r5 >= r9) goto L_0x01c6
            r0 = r24[r5]
            if (r0 == 0) goto L_0x01b3
            goto L_0x01c3
        L_0x01b3:
            if (r11 == 0) goto L_0x01be
            boolean r0 = r17[r5]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r24[r5] = r0
            goto L_0x01c3
        L_0x01be:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r24[r5] = r0
            r11 = 1
        L_0x01c3:
            int r5 = r5 + 1
            goto L_0x01ac
        L_0x01c6:
            if (r11 != 0) goto L_0x01dc
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r24[r15] = r0
            goto L_0x01dc
        L_0x01cd:
            r5 = r15
        L_0x01ce:
            if (r5 >= r9) goto L_0x01dc
            r0 = r24[r5]
            if (r0 == 0) goto L_0x01d5
            goto L_0x01d9
        L_0x01d5:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r24[r5] = r0
        L_0x01d9:
            int r5 = r5 + 1
            goto L_0x01ce
        L_0x01dc:
            r6 = r15
        L_0x01dd:
            if (r6 >= r9) goto L_0x0209
            boolean r0 = r17[r6]
            r1 = r24[r6]
            boolean r1 = r1.booleanValue()
            if (r0 == r1) goto L_0x0206
            r0 = r22[r6]
            r1 = r24[r6]
            boolean r1 = r1.booleanValue()
            long r2 = r0.f1525b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r0.f1524a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            long r4 = r30.getEventTime()
            r0 = r29
            r0.b(r1, r2, r3, r4)
        L_0x0206:
            int r6 = r6 + 1
            goto L_0x01dd
        L_0x0209:
            int r3 = r25 + 1
            r6 = r23
            r15 = r27
            r10 = 0
            goto L_0x007a
        L_0x0213:
            r9 = r1
            r28 = r4
            r15 = 0
            java.util.HashMap r6 = r7.f1522h
            java.util.Collection r0 = r6.values()
            java.util.Iterator r10 = r0.iterator()
        L_0x0221:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x029b
            java.lang.Object r0 = r10.next()
            r11 = r0
            S1.z r11 = (S1.z) r11
            int r0 = r30.getMetaState()
            r11.getClass()
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x023c
            r5 = 1
            goto L_0x023d
        L_0x023c:
            r5 = r15
        L_0x023d:
            long r0 = r13.longValue()
            r2 = 4294967556(0x100000104, double:2.1219959194E-314)
            java.lang.Long r16 = java.lang.Long.valueOf(r2)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0251
        L_0x024e:
            r15 = r28
            goto L_0x0297
        L_0x0251:
            boolean r0 = r11.f1526a
            if (r0 == r5) goto L_0x024e
            r17 = 458809(0x70039, double:2.26682E-318)
            java.lang.Long r0 = java.lang.Long.valueOf(r17)
            r4 = r28
            boolean r19 = r4.containsKey(r0)
            r1 = r19 ^ 1
            if (r19 != 0) goto L_0x026c
            boolean r0 = r11.f1526a
            r2 = 1
            r0 = r0 ^ r2
            r11.f1526a = r0
        L_0x026c:
            java.lang.Long r3 = java.lang.Long.valueOf(r17)
            long r20 = r30.getEventTime()
            r0 = r29
            r2 = r16
            r15 = r4
            r4 = r20
            r0.b(r1, r2, r3, r4)
            if (r19 == 0) goto L_0x0286
            boolean r0 = r11.f1526a
            r1 = 1
            r0 = r0 ^ r1
            r11.f1526a = r0
        L_0x0286:
            java.lang.Long r3 = java.lang.Long.valueOf(r17)
            long r4 = r30.getEventTime()
            r0 = r29
            r1 = r19
            r2 = r16
            r0.b(r1, r2, r3, r4)
        L_0x0297:
            r28 = r15
            r15 = 0
            goto L_0x0221
        L_0x029b:
            r15 = r28
            int r0 = r30.getAction()
            if (r0 == 0) goto L_0x02ab
            r1 = 1
            if (r0 == r1) goto L_0x02a9
        L_0x02a6:
            r0 = 0
            goto L_0x02f5
        L_0x02a9:
            r10 = 0
            goto L_0x02ac
        L_0x02ab:
            r10 = 1
        L_0x02ac:
            java.lang.Object r0 = r15.get(r12)
            r2 = r0
            java.lang.Long r2 = (java.lang.Long) r2
            r11 = 0
            if (r10 == 0) goto L_0x02f2
            if (r2 != 0) goto L_0x02ba
        L_0x02b8:
            r2 = 1
            goto L_0x02ce
        L_0x02ba:
            int r0 = r30.getRepeatCount()
            if (r0 <= 0) goto L_0x02c2
            r2 = 3
            goto L_0x02ce
        L_0x02c2:
            r1 = 0
            long r4 = r30.getEventTime()
            r0 = r29
            r3 = r12
            r0.b(r1, r2, r3, r4)
            goto L_0x02b8
        L_0x02ce:
            P2.i r0 = r7.f1523i
            int r1 = r30.getUnicodeChar()
            java.lang.Character r0 = r0.a(r1)
            char r0 = r0.charValue()
            if (r0 == 0) goto L_0x02ed
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = ""
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x02ee
        L_0x02ed:
            r0 = r11
        L_0x02ee:
            r1 = r0
            r0 = 1
        L_0x02f0:
            r3 = 3
            goto L_0x030f
        L_0x02f2:
            if (r2 != 0) goto L_0x030b
            goto L_0x02a6
        L_0x02f5:
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            r4 = 0
            r1 = 1
            r0 = r29
            r0.b(r1, r2, r3, r4)
            r0 = 1
            r8.a(r0)
            goto L_0x0382
        L_0x030b:
            r0 = 1
            r2 = r9
            r1 = r11
            goto L_0x02f0
        L_0x030f:
            if (r2 == r3) goto L_0x0317
            if (r10 == 0) goto L_0x0314
            r11 = r13
        L_0x0314:
            r7.c(r12, r11)
        L_0x0317:
            if (r2 != r0) goto L_0x0326
            java.lang.Object r4 = r6.get(r13)
            S1.z r4 = (S1.z) r4
            if (r4 == 0) goto L_0x0326
            boolean r5 = r4.f1526a
            r5 = r5 ^ r0
            r4.f1526a = r5
        L_0x0326:
            S1.s r0 = new S1.s
            r0.<init>()
            int r4 = r30.getSource()
            r5 = 513(0x201, float:7.19E-43)
            if (r4 == r5) goto L_0x0350
            r5 = 1025(0x401, float:1.436E-42)
            if (r4 == r5) goto L_0x034d
            r3 = 16777232(0x1000010, float:2.3509932E-38)
            if (r4 == r3) goto L_0x0349
            r3 = 33554433(0x2000001, float:9.403956E-38)
            if (r4 == r3) goto L_0x0345
            r3 = 1
            r0.f1512f = r3
            goto L_0x0352
        L_0x0345:
            r3 = 5
            r0.f1512f = r3
            goto L_0x0352
        L_0x0349:
            r3 = 4
            r0.f1512f = r3
            goto L_0x0352
        L_0x034d:
            r0.f1512f = r3
            goto L_0x0352
        L_0x0350:
            r0.f1512f = r9
        L_0x0352:
            long r3 = r30.getEventTime()
            r0.f1507a = r3
            r0.f1508b = r2
            long r2 = r13.longValue()
            r0.f1510d = r2
            long r2 = r12.longValue()
            r0.f1509c = r2
            r0.f1513g = r1
            r1 = 0
            r0.f1511e = r1
            r7.a(r0, r8)
            java.util.Iterator r0 = r14.iterator()
        L_0x0372:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0382
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto L_0x0372
        L_0x0382:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.v.f(android.view.KeyEvent, G0.z):void");
    }
}
