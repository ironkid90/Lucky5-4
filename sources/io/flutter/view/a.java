package io.flutter.view;

import T1.k;
import T1.l;

public final class a implements k, l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f3441a;

    public /* synthetic */ a(Object obj) {
        this.f3441a = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v43, resolved type: io.flutter.view.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.nio.ByteBuffer r17, java.lang.String[] r18, java.nio.ByteBuffer[] r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r19
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r2)
            int r2 = r1.length
            r4 = 0
        L_0x000b:
            if (r4 >= r2) goto L_0x0017
            r5 = r1[r4]
            java.nio.ByteOrder r6 = java.nio.ByteOrder.LITTLE_ENDIAN
            r5.order(r6)
            int r4 = r4 + 1
            goto L_0x000b
        L_0x0017:
            r4 = r16
            java.lang.Object r2 = r4.f3441a
            io.flutter.view.g r2 = (io.flutter.view.g) r2
            r2.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0025:
            boolean r6 = r17.hasRemaining()
            r7 = 16
            r9 = 1
            r10 = 14
            io.flutter.plugin.platform.i r11 = r2.f3531e
            r12 = 0
            if (r6 == 0) goto L_0x01cd
            int r6 = r17.getInt()
            io.flutter.view.f r6 = r2.b(r6)
            r6.f3479E = r9
            java.lang.String r13 = r6.f3518r
            r6.f3484K = r13
            java.lang.String r13 = r6.f3516p
            r6.f3485L = r13
            long r13 = r6.f3503c
            r6.f3480F = r13
            int r13 = r6.f3504d
            r6.f3481G = r13
            int r13 = r6.f3507g
            r6.f3482H = r13
            int r13 = r6.f3508h
            r6.f3483I = r13
            float r13 = r6.f3512l
            r6.J = r13
            long r13 = r17.getLong()
            r6.f3503c = r13
            int r13 = r17.getInt()
            r6.f3504d = r13
            int r13 = r17.getInt()
            r6.f3505e = r13
            int r13 = r17.getInt()
            r6.f3506f = r13
            int r13 = r17.getInt()
            r6.f3507g = r13
            int r13 = r17.getInt()
            r6.f3508h = r13
            int r13 = r17.getInt()
            r6.f3509i = r13
            int r13 = r17.getInt()
            r6.f3510j = r13
            int r13 = r17.getInt()
            r6.f3511k = r13
            float r13 = r17.getFloat()
            r6.f3512l = r13
            float r13 = r17.getFloat()
            r6.f3513m = r13
            float r13 = r17.getFloat()
            r6.f3514n = r13
            java.lang.String r13 = io.flutter.view.g.c(r17, r18)
            r6.f3515o = r13
            java.lang.String r13 = io.flutter.view.g.c(r17, r18)
            r6.f3516p = r13
            java.util.ArrayList r13 = io.flutter.view.f.C(r0, r1)
            r6.f3517q = r13
            java.lang.String r13 = io.flutter.view.g.c(r17, r18)
            r6.f3518r = r13
            java.util.ArrayList r13 = io.flutter.view.f.C(r0, r1)
            r6.f3519s = r13
            java.lang.String r13 = io.flutter.view.g.c(r17, r18)
            r6.f3520t = r13
            java.util.ArrayList r13 = io.flutter.view.f.C(r0, r1)
            r6.f3521u = r13
            java.lang.String r13 = io.flutter.view.g.c(r17, r18)
            r6.v = r13
            java.util.ArrayList r13 = io.flutter.view.f.C(r0, r1)
            r6.f3522w = r13
            java.lang.String r13 = io.flutter.view.g.c(r17, r18)
            r6.f3523x = r13
            java.util.ArrayList r13 = io.flutter.view.f.C(r0, r1)
            r6.f3524y = r13
            java.lang.String r13 = io.flutter.view.g.c(r17, r18)
            r6.f3525z = r13
            java.lang.String r13 = io.flutter.view.g.c(r17, r18)
            r6.f3475A = r13
            java.lang.String r13 = io.flutter.view.g.c(r17, r18)
            r6.f3476B = r13
            int r13 = r17.getInt()
            r6.f3477C = r13
            r17.getInt()
            float r13 = r17.getFloat()
            r6.f3486M = r13
            float r13 = r17.getFloat()
            r6.f3487N = r13
            float r13 = r17.getFloat()
            r6.f3488O = r13
            float r13 = r17.getFloat()
            r6.f3489P = r13
            float[] r13 = r6.f3490Q
            if (r13 != 0) goto L_0x011e
            float[] r13 = new float[r7]
            r6.f3490Q = r13
        L_0x011e:
            r13 = 0
        L_0x011f:
            if (r13 >= r7) goto L_0x012c
            float[] r14 = r6.f3490Q
            float r15 = r17.getFloat()
            r14[r13] = r15
            int r13 = r13 + 1
            goto L_0x011f
        L_0x012c:
            r6.f3497X = r9
            r6.Z = r9
            int r7 = r17.getInt()
            java.util.ArrayList r13 = r6.f3492S
            r13.clear()
            java.util.ArrayList r14 = r6.f3493T
            r14.clear()
            r15 = 0
        L_0x013f:
            io.flutter.view.g r3 = r6.f3499a
            if (r15 >= r7) goto L_0x0153
            int r8 = r17.getInt()
            io.flutter.view.f r3 = r3.b(r8)
            r3.f3491R = r6
            r13.add(r3)
            int r15 = r15 + 1
            goto L_0x013f
        L_0x0153:
            r8 = 0
        L_0x0154:
            if (r8 >= r7) goto L_0x0166
            int r13 = r17.getInt()
            io.flutter.view.f r13 = r3.b(r13)
            r13.f3491R = r6
            r14.add(r13)
            int r8 = r8 + 1
            goto L_0x0154
        L_0x0166:
            int r7 = r17.getInt()
            if (r7 != 0) goto L_0x016f
            r6.f3494U = r12
            goto L_0x01a3
        L_0x016f:
            java.util.ArrayList r8 = r6.f3494U
            if (r8 != 0) goto L_0x017b
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r7)
            r6.f3494U = r8
            goto L_0x017e
        L_0x017b:
            r8.clear()
        L_0x017e:
            r8 = 0
        L_0x017f:
            if (r8 >= r7) goto L_0x01a3
            int r12 = r17.getInt()
            io.flutter.view.e r12 = r3.a(r12)
            int r13 = r12.f3472c
            if (r13 != r9) goto L_0x0190
            r6.f3495V = r12
            goto L_0x019b
        L_0x0190:
            r14 = 2
            if (r13 != r14) goto L_0x0196
            r6.f3496W = r12
            goto L_0x019b
        L_0x0196:
            java.util.ArrayList r13 = r6.f3494U
            r13.add(r12)
        L_0x019b:
            java.util.ArrayList r13 = r6.f3494U
            r13.add(r12)
            int r8 = r8 + 1
            goto L_0x017f
        L_0x01a3:
            boolean r3 = r6.D(r10)
            if (r3 == 0) goto L_0x01ab
            goto L_0x0025
        L_0x01ab:
            r3 = 6
            boolean r3 = r6.D(r3)
            if (r3 == 0) goto L_0x01b4
            r2.f3539m = r6
        L_0x01b4:
            boolean r3 = r6.f3479E
            if (r3 == 0) goto L_0x01bb
            r5.add(r6)
        L_0x01bb:
            int r3 = r6.f3509i
            r7 = -1
            if (r3 == r7) goto L_0x0025
            boolean r3 = r11.c(r3)
            if (r3 != 0) goto L_0x0025
            int r3 = r6.f3509i
            r11.d(r3)
            goto L_0x0025
        L_0x01cd:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashMap r1 = r2.f3533g
            r3 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            java.lang.Object r6 = r1.get(r6)
            io.flutter.view.f r6 = (io.flutter.view.f) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r6 == 0) goto L_0x01f1
            float[] r13 = new float[r7]
            android.opengl.Matrix.setIdentityM(r13, r3)
            r6.H(r13, r0, r3)
            r6.z(r8)
        L_0x01f1:
            java.util.Iterator r3 = r8.iterator()
            r6 = r12
        L_0x01f6:
            boolean r13 = r3.hasNext()
            java.util.ArrayList r14 = r2.f3542p
            if (r13 == 0) goto L_0x0212
            java.lang.Object r13 = r3.next()
            io.flutter.view.f r13 = (io.flutter.view.f) r13
            int r15 = r13.f3501b
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            boolean r14 = r14.contains(r15)
            if (r14 != 0) goto L_0x01f6
            r6 = r13
            goto L_0x01f6
        L_0x0212:
            if (r6 != 0) goto L_0x0226
            boolean r3 = r8.isEmpty()
            if (r3 != 0) goto L_0x0226
            int r3 = r8.size()
            int r3 = r3 - r9
            java.lang.Object r3 = r8.get(r3)
            r6 = r3
            io.flutter.view.f r6 = (io.flutter.view.f) r6
        L_0x0226:
            if (r6 == 0) goto L_0x0262
            int r3 = r6.f3501b
            int r13 = r2.f3543q
            if (r3 != r13) goto L_0x0238
            int r3 = r8.size()
            int r13 = r14.size()
            if (r3 == r13) goto L_0x0262
        L_0x0238:
            int r3 = r6.f3501b
            r2.f3543q = r3
            java.lang.String r3 = r6.B()
            if (r3 != 0) goto L_0x0244
            java.lang.String r3 = " "
        L_0x0244:
            int r13 = android.os.Build.VERSION.SDK_INT
            r15 = 28
            if (r13 < r15) goto L_0x0250
            S1.o r6 = r2.f3527a
            r6.setAccessibilityPaneTitle(r3)
            goto L_0x0262
        L_0x0250:
            int r6 = r6.f3501b
            r13 = 32
            android.view.accessibility.AccessibilityEvent r6 = r2.d(r6, r13)
            java.util.List r13 = r6.getText()
            r13.add(r3)
            r2.h(r6)
        L_0x0262:
            r14.clear()
            java.util.Iterator r3 = r8.iterator()
        L_0x0269:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x027f
            java.lang.Object r6 = r3.next()
            io.flutter.view.f r6 = (io.flutter.view.f) r6
            int r6 = r6.f3501b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14.add(r6)
            goto L_0x0269
        L_0x027f:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0287:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x02ed
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            io.flutter.view.f r3 = (io.flutter.view.f) r3
            boolean r6 = r0.contains(r3)
            if (r6 != 0) goto L_0x02eb
            r3.f3491R = r12
            int r6 = r3.f3509i
            r8 = 65536(0x10000, float:9.18355E-41)
            r13 = -1
            if (r6 == r13) goto L_0x02c8
            java.lang.Integer r6 = r2.f3536j
            if (r6 == 0) goto L_0x02c8
            io.flutter.view.AccessibilityViewEmbedder r13 = r2.f3530d
            int r6 = r6.intValue()
            android.view.View r6 = r13.platformViewOfNode(r6)
            int r13 = r3.f3509i
            r11.d(r13)
            if (r6 != 0) goto L_0x02c8
            java.lang.Integer r6 = r2.f3536j
            int r6 = r6.intValue()
            r2.g(r6, r8)
            r2.f3536j = r12
        L_0x02c8:
            int r6 = r3.f3509i
            r13 = -1
            if (r6 == r13) goto L_0x02d0
            r11.d(r6)
        L_0x02d0:
            io.flutter.view.f r6 = r2.f3535i
            if (r6 != r3) goto L_0x02db
            int r6 = r6.f3501b
            r2.g(r6, r8)
            r2.f3535i = r12
        L_0x02db:
            io.flutter.view.f r6 = r2.f3539m
            if (r6 != r3) goto L_0x02e1
            r2.f3539m = r12
        L_0x02e1:
            io.flutter.view.f r6 = r2.f3541o
            if (r6 != r3) goto L_0x02e7
            r2.f3541o = r12
        L_0x02e7:
            r1.remove()
            goto L_0x0287
        L_0x02eb:
            r13 = -1
            goto L_0x0287
        L_0x02ed:
            r0 = 2048(0x800, float:2.87E-42)
            r3 = 0
            android.view.accessibility.AccessibilityEvent r1 = r2.d(r3, r0)
            r1.setContentChangeTypes(r9)
            r2.h(r1)
            java.util.Iterator r1 = r5.iterator()
        L_0x02fe:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0513
            java.lang.Object r5 = r1.next()
            io.flutter.view.f r5 = (io.flutter.view.f) r5
            float r6 = r5.f3512l
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L_0x03bb
            float r6 = r5.J
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L_0x03bb
            float r6 = r5.J
            float r8 = r5.f3512l
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x03bb
            int r6 = r5.f3501b
            r8 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r6 = r2.d(r6, r8)
            float r8 = r5.f3512l
            float r11 = r5.f3513m
            boolean r13 = java.lang.Float.isInfinite(r11)
            r14 = 1203982336(0x47c35000, float:100000.0)
            if (r13 == 0) goto L_0x0340
            r11 = 1200142336(0x4788b800, float:70000.0)
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x033f
            r8 = r11
        L_0x033f:
            r11 = r14
        L_0x0340:
            float r13 = r5.f3514n
            boolean r13 = java.lang.Float.isInfinite(r13)
            if (r13 == 0) goto L_0x0353
            float r11 = r11 + r14
            r13 = -947341312(0xffffffffc788b800, float:-70000.0)
            int r15 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x0351
            r8 = r13
        L_0x0351:
            float r8 = r8 + r14
            goto L_0x0357
        L_0x0353:
            float r13 = r5.f3514n
            float r11 = r11 - r13
            float r8 = r8 - r13
        L_0x0357:
            io.flutter.view.d r13 = io.flutter.view.d.SCROLL_UP
            boolean r13 = io.flutter.view.f.y(r5, r13)
            if (r13 != 0) goto L_0x0381
            io.flutter.view.d r13 = io.flutter.view.d.SCROLL_DOWN
            boolean r13 = io.flutter.view.f.y(r5, r13)
            if (r13 == 0) goto L_0x0368
            goto L_0x0381
        L_0x0368:
            io.flutter.view.d r13 = io.flutter.view.d.SCROLL_LEFT
            boolean r13 = io.flutter.view.f.y(r5, r13)
            if (r13 != 0) goto L_0x0378
            io.flutter.view.d r13 = io.flutter.view.d.SCROLL_RIGHT
            boolean r13 = io.flutter.view.f.y(r5, r13)
            if (r13 == 0) goto L_0x0389
        L_0x0378:
            int r8 = (int) r8
            r6.setScrollX(r8)
            int r8 = (int) r11
            r6.setMaxScrollX(r8)
            goto L_0x0389
        L_0x0381:
            int r8 = (int) r8
            r6.setScrollY(r8)
            int r8 = (int) r11
            r6.setMaxScrollY(r8)
        L_0x0389:
            int r8 = r5.f3510j
            if (r8 <= 0) goto L_0x03b8
            r6.setItemCount(r8)
            int r8 = r5.f3511k
            r6.setFromIndex(r8)
            java.util.ArrayList r8 = r5.f3493T
            java.util.Iterator r8 = r8.iterator()
            r11 = r3
        L_0x039c:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x03b1
            java.lang.Object r13 = r8.next()
            io.flutter.view.f r13 = (io.flutter.view.f) r13
            boolean r13 = r13.D(r10)
            if (r13 != 0) goto L_0x039c
            int r11 = r11 + 1
            goto L_0x039c
        L_0x03b1:
            int r8 = r5.f3511k
            int r8 = r8 + r11
            int r8 = r8 - r9
            r6.setToIndex(r8)
        L_0x03b8:
            r2.h(r6)
        L_0x03bb:
            boolean r6 = r5.D(r7)
            if (r6 == 0) goto L_0x03e0
            java.lang.String r6 = r5.f3516p
            if (r6 != 0) goto L_0x03ca
            java.lang.String r8 = r5.f3485L
            if (r8 != 0) goto L_0x03ca
            goto L_0x03e0
        L_0x03ca:
            if (r6 == 0) goto L_0x03d4
            java.lang.String r8 = r5.f3485L
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x03e0
        L_0x03d4:
            int r6 = r5.f3501b
            android.view.accessibility.AccessibilityEvent r6 = r2.d(r6, r0)
            r6.setContentChangeTypes(r9)
            r2.h(r6)
        L_0x03e0:
            io.flutter.view.f r6 = r2.f3535i
            r13 = 0
            if (r6 == 0) goto L_0x0416
            int r6 = r6.f3501b
            int r8 = r5.f3501b
            if (r6 != r8) goto L_0x0416
            r18 = r1
            long r0 = r5.f3480F
            r6 = 3
            int r8 = A2.h.d(r6)
            long r3 = (long) r8
            long r0 = r0 & r3
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x03fc
            goto L_0x0418
        L_0x03fc:
            boolean r0 = r5.D(r6)
            if (r0 == 0) goto L_0x0418
            int r0 = r5.f3501b
            r1 = 4
            android.view.accessibility.AccessibilityEvent r0 = r2.d(r0, r1)
            java.util.List r1 = r0.getText()
            java.lang.String r3 = r5.f3516p
            r1.add(r3)
            r2.h(r0)
            goto L_0x0418
        L_0x0416:
            r18 = r1
        L_0x0418:
            io.flutter.view.f r0 = r2.f3539m
            if (r0 == 0) goto L_0x0436
            int r1 = r0.f3501b
            int r3 = r5.f3501b
            if (r1 != r3) goto L_0x0436
            io.flutter.view.f r4 = r2.f3540n
            if (r4 == 0) goto L_0x042a
            int r4 = r4.f3501b
            if (r4 == r1) goto L_0x0436
        L_0x042a:
            r2.f3540n = r0
            r0 = 8
            android.view.accessibility.AccessibilityEvent r0 = r2.d(r3, r0)
            r2.h(r0)
            goto L_0x043a
        L_0x0436:
            if (r0 != 0) goto L_0x043a
            r2.f3540n = r12
        L_0x043a:
            io.flutter.view.f r0 = r2.f3539m
            if (r0 == 0) goto L_0x0508
            int r0 = r0.f3501b
            int r1 = r5.f3501b
            if (r0 != r1) goto L_0x0508
            long r0 = r5.f3480F
            r3 = 5
            int r4 = A2.h.d(r3)
            long r10 = (long) r4
            long r0 = r0 & r10
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0508
            boolean r0 = r5.D(r3)
            if (r0 == 0) goto L_0x0508
            io.flutter.view.f r0 = r2.f3535i
            if (r0 == 0) goto L_0x0463
            int r0 = r0.f3501b
            io.flutter.view.f r1 = r2.f3539m
            int r1 = r1.f3501b
            if (r0 != r1) goto L_0x0508
        L_0x0463:
            java.lang.String r0 = r5.f3484K
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x046a
            goto L_0x046b
        L_0x046a:
            r0 = r1
        L_0x046b:
            java.lang.String r3 = r5.f3518r
            if (r3 == 0) goto L_0x0470
            r1 = r3
        L_0x0470:
            int r3 = r5.f3501b
            android.view.accessibility.AccessibilityEvent r3 = r2.d(r3, r7)
            r3.setBeforeText(r0)
            java.util.List r4 = r3.getText()
            r4.add(r1)
            r4 = 0
        L_0x0481:
            int r8 = r0.length()
            if (r4 >= r8) goto L_0x049b
            int r8 = r1.length()
            if (r4 >= r8) goto L_0x049b
            char r8 = r0.charAt(r4)
            char r10 = r1.charAt(r4)
            if (r8 == r10) goto L_0x0498
            goto L_0x049b
        L_0x0498:
            int r4 = r4 + 1
            goto L_0x0481
        L_0x049b:
            int r8 = r0.length()
            if (r4 < r8) goto L_0x04a9
            int r8 = r1.length()
            if (r4 < r8) goto L_0x04a9
            r3 = r12
            goto L_0x04d4
        L_0x04a9:
            r3.setFromIndex(r4)
            int r8 = r0.length()
            int r8 = r8 - r9
            int r10 = r1.length()
            int r10 = r10 - r9
        L_0x04b6:
            if (r8 < r4) goto L_0x04ca
            if (r10 < r4) goto L_0x04ca
            char r11 = r0.charAt(r8)
            char r13 = r1.charAt(r10)
            if (r11 == r13) goto L_0x04c5
            goto L_0x04ca
        L_0x04c5:
            int r8 = r8 + -1
            int r10 = r10 + -1
            goto L_0x04b6
        L_0x04ca:
            int r8 = r8 - r4
            int r8 = r8 + r9
            r3.setRemovedCount(r8)
            int r10 = r10 - r4
            int r10 = r10 + r9
            r3.setAddedCount(r10)
        L_0x04d4:
            if (r3 == 0) goto L_0x04d9
            r2.h(r3)
        L_0x04d9:
            int r0 = r5.f3482H
            int r3 = r5.f3507g
            if (r0 != r3) goto L_0x04e5
            int r0 = r5.f3483I
            int r3 = r5.f3508h
            if (r0 == r3) goto L_0x0508
        L_0x04e5:
            int r0 = r5.f3501b
            r3 = 8192(0x2000, float:1.14794E-41)
            android.view.accessibility.AccessibilityEvent r0 = r2.d(r0, r3)
            java.util.List r3 = r0.getText()
            r3.add(r1)
            int r3 = r5.f3507g
            r0.setFromIndex(r3)
            int r3 = r5.f3508h
            r0.setToIndex(r3)
            int r1 = r1.length()
            r0.setItemCount(r1)
            r2.h(r0)
        L_0x0508:
            r4 = r16
            r1 = r18
            r0 = 2048(0x800, float:2.87E-42)
            r3 = 0
            r10 = 14
            goto L_0x02fe
        L_0x0513:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.a.a(java.nio.ByteBuffer, java.lang.String[], java.nio.ByteBuffer[]):void");
    }
}
