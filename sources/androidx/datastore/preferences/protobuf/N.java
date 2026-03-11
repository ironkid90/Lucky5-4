package androidx.datastore.preferences.protobuf;

import L.k;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

public final class N implements W {

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f2361n = new int[0];

    /* renamed from: o  reason: collision with root package name */
    public static final Unsafe f2362o = i0.i();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f2363a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f2364b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2365c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2366d;

    /* renamed from: e  reason: collision with root package name */
    public final C0097a f2367e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2368f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f2369g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2370h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2371i;

    /* renamed from: j  reason: collision with root package name */
    public final P f2372j;

    /* renamed from: k  reason: collision with root package name */
    public final C f2373k;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f2374l;

    /* renamed from: m  reason: collision with root package name */
    public final J f2375m;

    public N(int[] iArr, Object[] objArr, int i3, int i4, C0097a aVar, int[] iArr2, int i5, int i6, P p3, C c3, d0 d0Var, C0112p pVar, J j3) {
        this.f2363a = iArr;
        this.f2364b = objArr;
        this.f2365c = i3;
        this.f2366d = i4;
        this.f2368f = aVar instanceof C0118w;
        this.f2369g = iArr2;
        this.f2370h = i5;
        this.f2371i = i6;
        this.f2372j = p3;
        this.f2373k = c3;
        this.f2374l = d0Var;
        this.f2367e = aVar;
        this.f2375m = j3;
    }

    public static long A(long j3, Object obj) {
        return ((Long) i0.f2444b.h(j3, obj)).longValue();
    }

    public static Field G(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int L(int i3) {
        return (i3 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C0118w) {
            return ((C0118w) obj).i();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x026c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.datastore.preferences.protobuf.N x(androidx.datastore.preferences.protobuf.V r33, androidx.datastore.preferences.protobuf.P r34, androidx.datastore.preferences.protobuf.C r35, androidx.datastore.preferences.protobuf.d0 r36, androidx.datastore.preferences.protobuf.C0112p r37, androidx.datastore.preferences.protobuf.J r38) {
        /*
            java.lang.String r0 = r33.c()
            int r1 = r0.length()
            r2 = 0
            char r3 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r5) goto L_0x001d
            r3 = 1
        L_0x0013:
            int r6 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x001e
            r3 = r6
            goto L_0x0013
        L_0x001d:
            r6 = 1
        L_0x001e:
            int r3 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x003d
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x002a:
            int r9 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x003a
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r8
            r6 = r6 | r3
            int r8 = r8 + 13
            r3 = r9
            goto L_0x002a
        L_0x003a:
            int r3 = r3 << r8
            r6 = r6 | r3
            r3 = r9
        L_0x003d:
            if (r6 != 0) goto L_0x004b
            int[] r6 = f2361n
            r8 = r2
            r10 = r8
            r11 = r10
            r12 = r11
            r13 = r12
            r15 = r13
            r14 = r6
            r6 = r15
            goto L_0x0154
        L_0x004b:
            int r6 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x006a
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0057:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0067
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r3 = r3 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0057
        L_0x0067:
            int r6 = r6 << r8
            r3 = r3 | r6
            r6 = r9
        L_0x006a:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0089
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0076:
            int r10 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0086
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r10
            goto L_0x0076
        L_0x0086:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r10
        L_0x0089:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00a8
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0095:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00a5
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r8 = r8 | r9
            int r10 = r10 + 13
            r9 = r11
            goto L_0x0095
        L_0x00a5:
            int r9 = r9 << r10
            r8 = r8 | r9
            r9 = r11
        L_0x00a8:
            int r10 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00c7
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00b4:
            int r12 = r10 + 1
            char r10 = r0.charAt(r10)
            if (r10 < r5) goto L_0x00c4
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r9 = r9 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L_0x00b4
        L_0x00c4:
            int r10 = r10 << r11
            r9 = r9 | r10
            r10 = r12
        L_0x00c7:
            int r11 = r10 + 1
            char r10 = r0.charAt(r10)
            if (r10 < r5) goto L_0x00e6
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00d3:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00e3
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00d3
        L_0x00e3:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        L_0x00e6:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x0105
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00f2:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0102
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00f2
        L_0x0102:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x0105:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0124
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x0111:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0121
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x0111
        L_0x0121:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0124:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0145
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0130:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0141
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0130
        L_0x0141:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0145:
            int r15 = r13 + r11
            int r15 = r15 + r12
            int[] r12 = new int[r15]
            int r15 = r3 * 2
            int r15 = r15 + r6
            r6 = r3
            r3 = r14
            r14 = r12
            r12 = r8
            r8 = r15
            r15 = r13
            r13 = r9
        L_0x0154:
            sun.misc.Unsafe r9 = f2362o
            java.lang.Object[] r16 = r33.b()
            androidx.datastore.preferences.protobuf.a r17 = r33.a()
            java.lang.Class r2 = r17.getClass()
            int r7 = r10 * 3
            int[] r7 = new int[r7]
            int r10 = r10 * 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            int r19 = r15 + r11
            r21 = r15
            r22 = r19
            r11 = 0
            r20 = 0
        L_0x0173:
            if (r3 >= r1) goto L_0x03ca
            int r23 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x019b
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x0183:
            int r25 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0195
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r23
            r3 = r3 | r4
            int r23 = r23 + 13
            r4 = r25
            goto L_0x0183
        L_0x0195:
            int r4 = r4 << r23
            r3 = r3 | r4
            r4 = r25
            goto L_0x019d
        L_0x019b:
            r4 = r23
        L_0x019d:
            int r23 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ca
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r5 = r23
            r23 = 13
        L_0x01ab:
            int r26 = r5 + 1
            char r5 = r0.charAt(r5)
            r27 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01c4
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r23
            r4 = r4 | r1
            int r23 = r23 + 13
            r5 = r26
            r1 = r27
            goto L_0x01ab
        L_0x01c4:
            int r1 = r5 << r23
            r4 = r4 | r1
            r1 = r26
            goto L_0x01ce
        L_0x01ca:
            r27 = r1
            r1 = r23
        L_0x01ce:
            r5 = r4 & 255(0xff, float:3.57E-43)
            r23 = r15
            r15 = r4 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x01db
            int r15 = r11 + 1
            r14[r11] = r20
            r11 = r15
        L_0x01db:
            r15 = 51
            if (r5 < r15) goto L_0x0288
            int r15 = r1 + 1
            char r1 = r0.charAt(r1)
            r26 = r11
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r11) goto L_0x020a
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r30 = 13
        L_0x01f0:
            int r31 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r11) goto L_0x0205
            r11 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r30
            r1 = r1 | r11
            int r30 = r30 + 13
            r15 = r31
            r11 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01f0
        L_0x0205:
            int r11 = r15 << r30
            r1 = r1 | r11
            r15 = r31
        L_0x020a:
            int r11 = r5 + -51
            r30 = r15
            r15 = 9
            if (r11 == r15) goto L_0x0237
            r15 = 17
            if (r11 != r15) goto L_0x0217
            goto L_0x0237
        L_0x0217:
            r15 = 12
            if (r11 != r15) goto L_0x0244
            int r11 = r33.d()
            r15 = 1
            boolean r11 = L.j.a(r11, r15)
            if (r11 != 0) goto L_0x022a
            r11 = r4 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x0244
        L_0x022a:
            int r11 = r20 / 3
            int r11 = r11 * 2
            int r11 = r11 + r15
            int r15 = r8 + 1
            r8 = r16[r8]
            r10[r11] = r8
        L_0x0235:
            r8 = r15
            goto L_0x0244
        L_0x0237:
            int r11 = r20 / 3
            int r11 = r11 * 2
            r15 = 1
            int r11 = r11 + r15
            int r15 = r8 + 1
            r8 = r16[r8]
            r10[r11] = r8
            goto L_0x0235
        L_0x0244:
            int r1 = r1 * 2
            r11 = r16[r1]
            boolean r15 = r11 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x0250
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
        L_0x024e:
            r15 = r12
            goto L_0x0259
        L_0x0250:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = G(r2, r11)
            r16[r1] = r11
            goto L_0x024e
        L_0x0259:
            long r11 = r9.objectFieldOffset(r11)
            int r11 = (int) r11
            int r1 = r1 + 1
            r12 = r16[r1]
            r28 = r8
            boolean r8 = r12 instanceof java.lang.reflect.Field
            if (r8 == 0) goto L_0x026c
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
        L_0x026a:
            r1 = r11
            goto L_0x0275
        L_0x026c:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = G(r2, r12)
            r16[r1] = r12
            goto L_0x026a
        L_0x0275:
            long r11 = r9.objectFieldOffset(r12)
            int r8 = (int) r11
            r11 = r1
            r25 = r30
            r1 = 0
            r30 = r13
            r32 = r28
            r28 = r15
            r15 = r32
            goto L_0x0387
        L_0x0288:
            r26 = r11
            r15 = r12
            int r11 = r8 + 1
            r12 = r16[r8]
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = G(r2, r12)
            r30 = r13
            r13 = 9
            if (r5 == r13) goto L_0x029f
            r13 = 17
            if (r5 != r13) goto L_0x02a4
        L_0x029f:
            r28 = r15
            r15 = 1
            goto L_0x030c
        L_0x02a4:
            r13 = 27
            if (r5 == r13) goto L_0x02ac
            r13 = 49
            if (r5 != r13) goto L_0x02b0
        L_0x02ac:
            r28 = r15
            r15 = 1
            goto L_0x0300
        L_0x02b0:
            r13 = 12
            if (r5 == r13) goto L_0x02e6
            r13 = 30
            if (r5 == r13) goto L_0x02e6
            r13 = 44
            if (r5 != r13) goto L_0x02bd
            goto L_0x02e6
        L_0x02bd:
            r13 = 50
            if (r5 != r13) goto L_0x02dd
            int r13 = r21 + 1
            r14[r21] = r20
            int r21 = r20 / 3
            int r21 = r21 * 2
            int r28 = r8 + 2
            r11 = r16[r11]
            r10[r21] = r11
            r11 = r4 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x02e1
            int r21 = r21 + 1
            int r11 = r8 + 3
            r8 = r16[r28]
            r10[r21] = r8
            r21 = r13
        L_0x02dd:
            r28 = r15
            r15 = 1
            goto L_0x0317
        L_0x02e1:
            r21 = r13
            r11 = r28
            goto L_0x02dd
        L_0x02e6:
            int r13 = r33.d()
            r28 = r15
            r15 = 1
            if (r13 == r15) goto L_0x02f3
            r13 = r4 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0317
        L_0x02f3:
            int r13 = r20 / 3
            int r13 = r13 * 2
            int r13 = r13 + r15
            int r8 = r8 + 2
            r11 = r16[r11]
            r10[r13] = r11
        L_0x02fe:
            r11 = r8
            goto L_0x0317
        L_0x0300:
            int r13 = r20 / 3
            int r13 = r13 * 2
            int r13 = r13 + r15
            int r8 = r8 + 2
            r11 = r16[r11]
            r10[r13] = r11
            goto L_0x02fe
        L_0x030c:
            int r8 = r20 / 3
            int r8 = r8 * 2
            int r8 = r8 + r15
            java.lang.Class r13 = r12.getType()
            r10[r8] = r13
        L_0x0317:
            long r12 = r9.objectFieldOffset(r12)
            int r8 = (int) r12
            r12 = r4 & 4096(0x1000, float:5.74E-42)
            if (r12 == 0) goto L_0x036d
            r12 = 17
            if (r5 > r12) goto L_0x036d
            int r12 = r1 + 1
            char r1 = r0.charAt(r1)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r13) goto L_0x034a
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r24 = 13
        L_0x0333:
            int r25 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r13) goto L_0x0345
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r24
            r1 = r1 | r12
            int r24 = r24 + 13
            r12 = r25
            goto L_0x0333
        L_0x0345:
            int r12 = r12 << r24
            r1 = r1 | r12
            r12 = r25
        L_0x034a:
            int r24 = r6 * 2
            int r25 = r1 / 32
            int r25 = r25 + r24
            r13 = r16[r25]
            boolean r15 = r13 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x035c
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
        L_0x0358:
            r15 = r11
            r25 = r12
            goto L_0x0365
        L_0x035c:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = G(r2, r13)
            r16[r25] = r13
            goto L_0x0358
        L_0x0365:
            long r11 = r9.objectFieldOffset(r13)
            int r11 = (int) r11
            int r1 = r1 % 32
            goto L_0x0374
        L_0x036d:
            r15 = r11
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r25 = r1
            r1 = 0
        L_0x0374:
            r12 = 18
            if (r5 < r12) goto L_0x0382
            r12 = 49
            if (r5 > r12) goto L_0x0382
            int r12 = r22 + 1
            r14[r22] = r8
            r22 = r12
        L_0x0382:
            r32 = r11
            r11 = r8
            r8 = r32
        L_0x0387:
            int r12 = r20 + 1
            r7[r20] = r3
            int r3 = r20 + 2
            r13 = r4 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0394
            r13 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0395
        L_0x0394:
            r13 = 0
        L_0x0395:
            r29 = r0
            r0 = r4 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x039e
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x039f
        L_0x039e:
            r0 = 0
        L_0x039f:
            r0 = r0 | r13
            r4 = r4 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x03a7
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x03a8
        L_0x03a7:
            r4 = 0
        L_0x03a8:
            r0 = r0 | r4
            int r4 = r5 << 20
            r0 = r0 | r4
            r0 = r0 | r11
            r7[r12] = r0
            int r20 = r20 + 3
            int r0 = r1 << 20
            r0 = r0 | r8
            r7[r3] = r0
            r8 = r15
            r15 = r23
            r3 = r25
            r11 = r26
            r1 = r27
            r12 = r28
            r0 = r29
            r13 = r30
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0173
        L_0x03ca:
            r28 = r12
            r30 = r13
            r23 = r15
            androidx.datastore.preferences.protobuf.N r0 = new androidx.datastore.preferences.protobuf.N
            androidx.datastore.preferences.protobuf.a r13 = r33.a()
            r8 = r0
            r9 = r7
            r11 = r28
            r12 = r30
            r16 = r19
            r17 = r34
            r18 = r35
            r19 = r36
            r20 = r37
            r21 = r38
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.x(androidx.datastore.preferences.protobuf.V, androidx.datastore.preferences.protobuf.P, androidx.datastore.preferences.protobuf.C, androidx.datastore.preferences.protobuf.d0, androidx.datastore.preferences.protobuf.p, androidx.datastore.preferences.protobuf.J):androidx.datastore.preferences.protobuf.N");
    }

    public static long y(int i3) {
        return (long) (i3 & 1048575);
    }

    public static int z(long j3, Object obj) {
        return ((Integer) i0.f2444b.h(j3, obj)).intValue();
    }

    public final int B(int i3) {
        if (i3 < this.f2365c || i3 > this.f2366d) {
            return -1;
        }
        int[] iArr = this.f2363a;
        int length = (iArr.length / 3) - 1;
        int i4 = 0;
        while (i4 <= length) {
            int i5 = (length + i4) >>> 1;
            int i6 = i5 * 3;
            int i7 = iArr[i6];
            if (i3 == i7) {
                return i6;
            }
            if (i3 < i7) {
                length = i5 - 1;
            } else {
                i4 = i5 + 1;
            }
        }
        return -1;
    }

    public final void C(Object obj, long j3, C0107k kVar, W w3, C0111o oVar) {
        int u3;
        this.f2373k.getClass();
        C0119x b3 = C.b(j3, obj);
        int i3 = kVar.f2453b;
        if ((i3 & 7) == 3) {
            do {
                C0118w g2 = w3.g();
                kVar.b(g2, w3, oVar);
                w3.h(g2);
                ((U) b3).add(g2);
                C0106j jVar = kVar.f2452a;
                if (!jVar.c() && kVar.f2455d == 0) {
                    u3 = jVar.u();
                } else {
                    return;
                }
            } while (u3 == i3);
            kVar.f2455d = u3;
            return;
        }
        throw A.b();
    }

    public final void D(Object obj, int i3, C0107k kVar, W w3, C0111o oVar) {
        int u3;
        this.f2373k.getClass();
        C0119x b3 = C.b((long) (i3 & 1048575), obj);
        int i4 = kVar.f2453b;
        if ((i4 & 7) == 2) {
            do {
                C0118w g2 = w3.g();
                kVar.c(g2, w3, oVar);
                w3.h(g2);
                ((U) b3).add(g2);
                C0106j jVar = kVar.f2452a;
                if (!jVar.c() && kVar.f2455d == 0) {
                    u3 = jVar.u();
                } else {
                    return;
                }
            } while (u3 == i4);
            kVar.f2455d = u3;
            return;
        }
        throw A.b();
    }

    public final void E(int i3, C0107k kVar, Object obj) {
        boolean z3;
        if ((536870912 & i3) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            kVar.w(2);
            i0.o((long) (i3 & 1048575), obj, kVar.f2452a.t());
        } else if (this.f2368f) {
            kVar.w(2);
            i0.o((long) (i3 & 1048575), obj, kVar.f2452a.s());
        } else {
            i0.o((long) (i3 & 1048575), obj, kVar.e());
        }
    }

    public final void F(int i3, C0107k kVar, Object obj) {
        boolean z3;
        if ((536870912 & i3) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C c3 = this.f2373k;
        if (z3) {
            c3.getClass();
            kVar.s(C.b((long) (i3 & 1048575), obj), true);
            return;
        }
        c3.getClass();
        kVar.s(C.b((long) (i3 & 1048575), obj), false);
    }

    public final void H(int i3, Object obj) {
        int i4 = this.f2363a[i3 + 2];
        long j3 = (long) (1048575 & i4);
        if (j3 != 1048575) {
            i0.m(obj, j3, (1 << (i4 >>> 20)) | i0.f2444b.f(j3, obj));
        }
    }

    public final void I(Object obj, int i3, int i4) {
        i0.m(obj, (long) (this.f2363a[i4 + 2] & 1048575), i3);
    }

    public final void J(Object obj, int i3, C0097a aVar) {
        f2362o.putObject(obj, (long) (M(i3) & 1048575), aVar);
        H(i3, obj);
    }

    public final void K(Object obj, int i3, int i4, C0097a aVar) {
        f2362o.putObject(obj, (long) (M(i4) & 1048575), aVar);
        I(obj, i3, i4);
    }

    public final int M(int i3) {
        return this.f2363a[i3 + 1];
    }

    public final void N(Object obj, F f3) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Object obj2 = obj;
        F f4 = f3;
        int[] iArr = this.f2363a;
        int length = iArr.length;
        Unsafe unsafe = f2362o;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            int M3 = M(i11);
            int i12 = iArr[i11];
            int L3 = L(M3);
            if (L3 <= 17) {
                int i13 = iArr[i11 + 2];
                int i14 = i13 & i8;
                if (i14 != i9) {
                    if (i14 == i8) {
                        i3 = 0;
                    } else {
                        i3 = unsafe.getInt(obj2, (long) i14);
                    }
                    i9 = i14;
                }
                i6 = i9;
                i5 = i3;
                i4 = 1 << (i13 >>> 20);
            } else {
                i6 = i9;
                i5 = i3;
                i4 = 0;
            }
            long j3 = (long) (M3 & i8);
            switch (L3) {
                case 0:
                    i7 = i6;
                    long j4 = j3;
                    if (!o(obj, i11, i7, i5, i4)) {
                        break;
                    } else {
                        f4.c(i12, i0.f2444b.d(j4, obj2));
                        continue;
                    }
                case 1:
                    i7 = i6;
                    long j5 = j3;
                    if (o(obj, i11, i7, i5, i4)) {
                        f4.g(i12, i0.f2444b.e(j5, obj2));
                        break;
                    } else {
                        continue;
                    }
                case k.FLOAT_FIELD_NUMBER:
                    i7 = i6;
                    long j6 = j3;
                    if (o(obj, i11, i7, i5, i4)) {
                        f4.j(unsafe.getLong(obj2, j6), i12);
                        break;
                    } else {
                        continue;
                    }
                case k.INTEGER_FIELD_NUMBER:
                    i7 = i6;
                    long j7 = j3;
                    if (o(obj, i11, i7, i5, i4)) {
                        f4.q(unsafe.getLong(obj2, j7), i12);
                        break;
                    } else {
                        continue;
                    }
                case k.LONG_FIELD_NUMBER:
                    i7 = i6;
                    long j8 = j3;
                    if (o(obj, i11, i7, i5, i4)) {
                        f4.i(i12, unsafe.getInt(obj2, j8));
                        break;
                    } else {
                        continue;
                    }
                case k.STRING_FIELD_NUMBER:
                    i7 = i6;
                    long j9 = j3;
                    if (o(obj, i11, i7, i5, i4)) {
                        f4.f(unsafe.getLong(obj2, j9), i12);
                        break;
                    } else {
                        continue;
                    }
                case k.STRING_SET_FIELD_NUMBER:
                    i7 = i6;
                    long j10 = j3;
                    if (o(obj, i11, i7, i5, i4)) {
                        f4.e(i12, unsafe.getInt(obj2, j10));
                        break;
                    } else {
                        continue;
                    }
                case k.DOUBLE_FIELD_NUMBER:
                    i7 = i6;
                    long j11 = j3;
                    if (o(obj, i11, i7, i5, i4)) {
                        f4.a(i12, i0.f2444b.c(j11, obj2));
                        break;
                    } else {
                        continue;
                    }
                case k.BYTES_FIELD_NUMBER:
                    i7 = i6;
                    long j12 = j3;
                    if (o(obj, i11, i7, i5, i4)) {
                        Object object = unsafe.getObject(obj2, j12);
                        if (!(object instanceof String)) {
                            f4.b(i12, (C0103g) object);
                            break;
                        } else {
                            ((C0109m) f4.f2351a).M0((String) object, i12);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    i7 = i6;
                    long j13 = j3;
                    if (o(obj, i11, i7, i5, i4)) {
                        f4.k(i12, unsafe.getObject(obj2, j13), m(i11));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    i7 = i6;
                    long j14 = j3;
                    if (o(obj, i11, i7, i5, i4)) {
                        f4.b(i12, (C0103g) unsafe.getObject(obj2, j14));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    i7 = i6;
                    long j15 = j3;
                    if (o(obj, i11, i7, i5, i4)) {
                        f4.p(i12, unsafe.getInt(obj2, j15));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    i7 = i6;
                    long j16 = j3;
                    if (o(obj, i11, i7, i5, i4)) {
                        f4.d(i12, unsafe.getInt(obj2, j16));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    i7 = i6;
                    long j17 = j3;
                    if (o(obj, i11, i7, i5, i4)) {
                        f4.l(i12, unsafe.getInt(obj2, j17));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    i7 = i6;
                    long j18 = j3;
                    if (o(obj, i11, i7, i5, i4)) {
                        f4.m(unsafe.getLong(obj2, j18), i12);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    i7 = i6;
                    long j19 = j3;
                    if (o(obj, i11, i7, i5, i4)) {
                        f4.n(i12, unsafe.getInt(obj2, j19));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    i7 = i6;
                    long j20 = j3;
                    if (o(obj, i11, i7, i5, i4)) {
                        f4.o(unsafe.getLong(obj2, j20), i12);
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    i7 = i6;
                    long j21 = j3;
                    if (o(obj, i11, i6, i5, i4)) {
                        f4.h(i12, unsafe.getObject(obj2, j21), m(i11));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    X.E(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, false);
                    break;
                case 19:
                    X.I(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, false);
                    break;
                case 20:
                    X.L(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, false);
                    break;
                case 21:
                    X.T(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, false);
                    break;
                case 22:
                    X.K(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, false);
                    break;
                case 23:
                    X.H(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, false);
                    break;
                case 24:
                    X.G(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, false);
                    break;
                case 25:
                    X.C(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, false);
                    break;
                case 26:
                    X.R(iArr[i11], (List) unsafe.getObject(obj2, j3), f4);
                    break;
                case 27:
                    X.M(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, m(i11));
                    break;
                case 28:
                    X.D(iArr[i11], (List) unsafe.getObject(obj2, j3), f4);
                    break;
                case 29:
                    X.S(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, false);
                    break;
                case 30:
                    X.F(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, false);
                    break;
                case 31:
                    X.N(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, false);
                    break;
                case 32:
                    X.O(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, false);
                    break;
                case 33:
                    X.P(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, false);
                    break;
                case 34:
                    X.Q(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, false);
                    break;
                case 35:
                    X.E(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, true);
                    break;
                case 36:
                    X.I(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, true);
                    break;
                case 37:
                    X.L(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, true);
                    break;
                case 38:
                    X.T(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, true);
                    break;
                case 39:
                    X.K(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, true);
                    break;
                case 40:
                    X.H(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, true);
                    break;
                case 41:
                    X.G(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, true);
                    break;
                case 42:
                    X.C(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, true);
                    break;
                case 43:
                    X.S(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, true);
                    break;
                case 44:
                    X.F(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, true);
                    break;
                case 45:
                    X.N(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, true);
                    break;
                case 46:
                    X.O(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, true);
                    break;
                case 47:
                    X.P(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, true);
                    break;
                case 48:
                    X.Q(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, true);
                    break;
                case 49:
                    X.J(iArr[i11], (List) unsafe.getObject(obj2, j3), f4, m(i11));
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj2, j3);
                    if (object2 != null) {
                        int i15 = 2;
                        Object obj3 = this.f2364b[(i11 / 3) * 2];
                        this.f2375m.getClass();
                        G g2 = ((H) obj3).f2355a;
                        C0109m mVar = (C0109m) f4.f2351a;
                        mVar.getClass();
                        for (Map.Entry entry : ((I) object2).entrySet()) {
                            mVar.O0(i12, i15);
                            mVar.Q0(H.a(g2, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            r.b(mVar, g2.f2352a, 1, key);
                            r.b(mVar, g2.f2353b, 2, value);
                            i15 = 2;
                        }
                        break;
                    }
                    break;
                case 51:
                    if (q(obj2, i12, i11)) {
                        f4.c(i12, ((Double) i0.f2444b.h(j3, obj2)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (q(obj2, i12, i11)) {
                        f4.g(i12, ((Float) i0.f2444b.h(j3, obj2)).floatValue());
                        break;
                    }
                    break;
                case 53:
                    if (q(obj2, i12, i11)) {
                        f4.j(A(j3, obj2), i12);
                        break;
                    }
                    break;
                case 54:
                    if (q(obj2, i12, i11)) {
                        f4.q(A(j3, obj2), i12);
                        break;
                    }
                    break;
                case 55:
                    if (q(obj2, i12, i11)) {
                        f4.i(i12, z(j3, obj2));
                        break;
                    }
                    break;
                case 56:
                    if (q(obj2, i12, i11)) {
                        f4.f(A(j3, obj2), i12);
                        break;
                    }
                    break;
                case 57:
                    if (q(obj2, i12, i11)) {
                        f4.e(i12, z(j3, obj2));
                        break;
                    }
                    break;
                case 58:
                    if (q(obj2, i12, i11)) {
                        f4.a(i12, ((Boolean) i0.f2444b.h(j3, obj2)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (q(obj2, i12, i11)) {
                        Object object3 = unsafe.getObject(obj2, j3);
                        if (!(object3 instanceof String)) {
                            f4.b(i12, (C0103g) object3);
                            break;
                        } else {
                            ((C0109m) f4.f2351a).M0((String) object3, i12);
                            break;
                        }
                    }
                    break;
                case 60:
                    if (q(obj2, i12, i11)) {
                        f4.k(i12, unsafe.getObject(obj2, j3), m(i11));
                        break;
                    }
                    break;
                case 61:
                    if (q(obj2, i12, i11)) {
                        f4.b(i12, (C0103g) unsafe.getObject(obj2, j3));
                        break;
                    }
                    break;
                case 62:
                    if (q(obj2, i12, i11)) {
                        f4.p(i12, z(j3, obj2));
                        break;
                    }
                    break;
                case 63:
                    if (q(obj2, i12, i11)) {
                        f4.d(i12, z(j3, obj2));
                        break;
                    }
                    break;
                case 64:
                    if (q(obj2, i12, i11)) {
                        f4.l(i12, z(j3, obj2));
                        break;
                    }
                    break;
                case 65:
                    if (q(obj2, i12, i11)) {
                        f4.m(A(j3, obj2), i12);
                        break;
                    }
                    break;
                case 66:
                    if (q(obj2, i12, i11)) {
                        f4.n(i12, z(j3, obj2));
                        break;
                    }
                    break;
                case 67:
                    if (q(obj2, i12, i11)) {
                        f4.o(A(j3, obj2), i12);
                        break;
                    }
                    break;
                case 68:
                    if (q(obj2, i12, i11)) {
                        f4.h(i12, unsafe.getObject(obj2, j3), m(i11));
                        break;
                    }
                    break;
            }
            i7 = i6;
            i11 += 3;
            i9 = i7;
            i10 = i5;
            i8 = 1048575;
        }
        this.f2374l.getClass();
        ((C0118w) obj2).unknownFields.d(f4);
    }

    public final boolean a(Object obj) {
        int i3;
        int i4;
        Object obj2 = obj;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < this.f2370h) {
            int i8 = this.f2369g[i7];
            int[] iArr = this.f2363a;
            int i9 = iArr[i8];
            int M3 = M(i8);
            int i10 = iArr[i8 + 2];
            int i11 = i10 & 1048575;
            int i12 = 1 << (i10 >>> 20);
            if (i11 != i5) {
                if (i11 != 1048575) {
                    i6 = f2362o.getInt(obj2, (long) i11);
                }
                i3 = i6;
                i4 = i11;
            } else {
                i4 = i5;
                i3 = i6;
            }
            if ((268435456 & M3) != 0 && !o(obj, i8, i4, i3, i12)) {
                return false;
            }
            int L3 = L(M3);
            if (L3 != 9 && L3 != 17) {
                if (L3 != 27) {
                    if (L3 == 60 || L3 == 68) {
                        if (q(obj2, i9, i8)) {
                            if (!m(i8).a(i0.f2444b.h((long) (M3 & 1048575), obj2))) {
                                return false;
                            }
                        } else {
                            continue;
                        }
                    } else if (L3 != 49) {
                        if (L3 != 50) {
                            continue;
                        } else {
                            Object h3 = i0.f2444b.h((long) (M3 & 1048575), obj2);
                            this.f2375m.getClass();
                            I i13 = (I) h3;
                            if (i13.isEmpty()) {
                                continue;
                            } else {
                                if (((H) this.f2364b[(i8 / 3) * 2]).f2355a.f2353b.f2473f != r0.MESSAGE) {
                                    continue;
                                } else {
                                    W w3 = null;
                                    for (Object next : i13.values()) {
                                        if (w3 == null) {
                                            w3 = T.f2381c.a(next.getClass());
                                        }
                                        if (!w3.a(next)) {
                                            return false;
                                        }
                                    }
                                    continue;
                                }
                            }
                        }
                    }
                }
                List list = (List) i0.f2444b.h((long) (M3 & 1048575), obj2);
                if (list.isEmpty()) {
                    continue;
                } else {
                    W m3 = m(i8);
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        if (!m3.a(list.get(i14))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (o(obj, i8, i4, i3, i12)) {
                if (!m(i8).a(i0.f2444b.h((long) (M3 & 1048575), obj2))) {
                    return false;
                }
            } else {
                continue;
            }
            i7++;
            i5 = i4;
            i6 = i3;
        }
        return true;
    }

    public final void b(Object obj, C0107k kVar, C0111o oVar) {
        oVar.getClass();
        if (p(obj)) {
            r(this.f2374l, obj, kVar, oVar);
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public final void c(Object obj, Object obj2) {
        if (p(obj)) {
            obj2.getClass();
            int i3 = 0;
            while (true) {
                int[] iArr = this.f2363a;
                if (i3 < iArr.length) {
                    int M3 = M(i3);
                    long j3 = (long) (1048575 & M3);
                    int i4 = iArr[i3];
                    switch (L(M3)) {
                        case 0:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                h0 h0Var = i0.f2444b;
                                h0Var.l(obj, j3, h0Var.d(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case 1:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                h0 h0Var2 = i0.f2444b;
                                h0Var2.m(obj, j3, h0Var2.e(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case k.FLOAT_FIELD_NUMBER:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                i0.n(obj, j3, i0.f2444b.g(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case k.INTEGER_FIELD_NUMBER:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                i0.n(obj, j3, i0.f2444b.g(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case k.LONG_FIELD_NUMBER:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                i0.m(obj, j3, i0.f2444b.f(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case k.STRING_FIELD_NUMBER:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                i0.n(obj, j3, i0.f2444b.g(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case k.STRING_SET_FIELD_NUMBER:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                i0.m(obj, j3, i0.f2444b.f(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case k.DOUBLE_FIELD_NUMBER:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                h0 h0Var3 = i0.f2444b;
                                h0Var3.j(obj, j3, h0Var3.c(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case k.BYTES_FIELD_NUMBER:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                i0.o(j3, obj, i0.f2444b.h(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case 9:
                            t(i3, obj, obj2);
                            break;
                        case 10:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                i0.o(j3, obj, i0.f2444b.h(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case 11:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                i0.m(obj, j3, i0.f2444b.f(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case 12:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                i0.m(obj, j3, i0.f2444b.f(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case 13:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                i0.m(obj, j3, i0.f2444b.f(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case 14:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                i0.n(obj, j3, i0.f2444b.g(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case 15:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                i0.m(obj, j3, i0.f2444b.f(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case 16:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                i0.n(obj, j3, i0.f2444b.g(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case 17:
                            t(i3, obj, obj2);
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f2373k.getClass();
                            h0 h0Var4 = i0.f2444b;
                            C0119x xVar = (C0119x) h0Var4.h(j3, obj);
                            C0119x xVar2 = (C0119x) h0Var4.h(j3, obj2);
                            U u3 = (U) xVar;
                            int i5 = u3.f2386h;
                            int i6 = ((U) xVar2).f2386h;
                            if (i5 > 0 && i6 > 0) {
                                if (!((C0098b) xVar).f2407f) {
                                    xVar = u3.c(i6 + i5);
                                }
                                ((C0098b) xVar).addAll(xVar2);
                            }
                            if (i5 > 0) {
                                xVar2 = xVar;
                            }
                            i0.o(j3, obj, xVar2);
                            break;
                        case 50:
                            Class cls = X.f2391a;
                            h0 h0Var5 = i0.f2444b;
                            Object h3 = h0Var5.h(j3, obj);
                            Object h4 = h0Var5.h(j3, obj2);
                            this.f2375m.getClass();
                            i0.o(j3, obj, J.b(h3, h4));
                            break;
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            if (!q(obj2, i4, i3)) {
                                break;
                            } else {
                                i0.o(j3, obj, i0.f2444b.h(j3, obj2));
                                I(obj, i4, i3);
                                break;
                            }
                        case 60:
                            u(i3, obj, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (!q(obj2, i4, i3)) {
                                break;
                            } else {
                                i0.o(j3, obj, i0.f2444b.h(j3, obj2));
                                I(obj, i4, i3);
                                break;
                            }
                        case 68:
                            u(i3, obj, obj2);
                            break;
                    }
                    i3 += 3;
                } else {
                    X.A(this.f2374l, obj, obj2);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    public final void d(Object obj, F f3) {
        f3.getClass();
        N(obj, f3);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00df, code lost:
        if (r4 != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e1, code lost:
        r8 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e2, code lost:
        r3 = r8 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0198, code lost:
        r3 = (r3 * 53) + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        r3 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0216, code lost:
        if (r4 != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0278, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(androidx.datastore.preferences.protobuf.C0118w r12) {
        /*
            r11 = this;
            int[] r0 = r11.f2363a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x0005:
            if (r2 >= r1) goto L_0x027c
            int r4 = r11.M(r2)
            r5 = r0[r2]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r4
            long r6 = (long) r6
            int r4 = L(r4)
            r8 = 1237(0x4d5, float:1.733E-42)
            r9 = 1231(0x4cf, float:1.725E-42)
            r10 = 37
            switch(r4) {
                case 0: goto L_0x0266;
                case 1: goto L_0x0258;
                case 2: goto L_0x024a;
                case 3: goto L_0x023c;
                case 4: goto L_0x0232;
                case 5: goto L_0x0224;
                case 6: goto L_0x021a;
                case 7: goto L_0x020c;
                case 8: goto L_0x01fc;
                case 9: goto L_0x01ef;
                case 10: goto L_0x01e1;
                case 11: goto L_0x01d7;
                case 12: goto L_0x01cd;
                case 13: goto L_0x01c3;
                case 14: goto L_0x01b5;
                case 15: goto L_0x01ab;
                case 16: goto L_0x019d;
                case 17: goto L_0x018c;
                case 18: goto L_0x017e;
                case 19: goto L_0x017e;
                case 20: goto L_0x017e;
                case 21: goto L_0x017e;
                case 22: goto L_0x017e;
                case 23: goto L_0x017e;
                case 24: goto L_0x017e;
                case 25: goto L_0x017e;
                case 26: goto L_0x017e;
                case 27: goto L_0x017e;
                case 28: goto L_0x017e;
                case 29: goto L_0x017e;
                case 30: goto L_0x017e;
                case 31: goto L_0x017e;
                case 32: goto L_0x017e;
                case 33: goto L_0x017e;
                case 34: goto L_0x017e;
                case 35: goto L_0x017e;
                case 36: goto L_0x017e;
                case 37: goto L_0x017e;
                case 38: goto L_0x017e;
                case 39: goto L_0x017e;
                case 40: goto L_0x017e;
                case 41: goto L_0x017e;
                case 42: goto L_0x017e;
                case 43: goto L_0x017e;
                case 44: goto L_0x017e;
                case 45: goto L_0x017e;
                case 46: goto L_0x017e;
                case 47: goto L_0x017e;
                case 48: goto L_0x017e;
                case 49: goto L_0x017e;
                case 50: goto L_0x0170;
                case 51: goto L_0x0152;
                case 52: goto L_0x0138;
                case 53: goto L_0x0126;
                case 54: goto L_0x0114;
                case 55: goto L_0x0106;
                case 56: goto L_0x00f4;
                case 57: goto L_0x00e6;
                case 58: goto L_0x00c9;
                case 59: goto L_0x00b3;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008d;
                case 62: goto L_0x0080;
                case 63: goto L_0x0073;
                case 64: goto L_0x0066;
                case 65: goto L_0x0055;
                case 66: goto L_0x0048;
                case 67: goto L_0x0037;
                case 68: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0278
        L_0x0021:
            boolean r4 = r11.q(r12, r5, r2)
            if (r4 == 0) goto L_0x0278
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            java.lang.Object r4 = r4.h(r6, r12)
            int r3 = r3 * 53
            int r4 = r4.hashCode()
        L_0x0033:
            int r4 = r4 + r3
            r3 = r4
            goto L_0x0278
        L_0x0037:
            boolean r4 = r11.q(r12, r5, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            long r4 = A(r6, r12)
            int r4 = androidx.datastore.preferences.protobuf.C0120y.b(r4)
            goto L_0x0033
        L_0x0048:
            boolean r4 = r11.q(r12, r5, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            int r4 = z(r6, r12)
            goto L_0x0033
        L_0x0055:
            boolean r4 = r11.q(r12, r5, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            long r4 = A(r6, r12)
            int r4 = androidx.datastore.preferences.protobuf.C0120y.b(r4)
            goto L_0x0033
        L_0x0066:
            boolean r4 = r11.q(r12, r5, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            int r4 = z(r6, r12)
            goto L_0x0033
        L_0x0073:
            boolean r4 = r11.q(r12, r5, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            int r4 = z(r6, r12)
            goto L_0x0033
        L_0x0080:
            boolean r4 = r11.q(r12, r5, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            int r4 = z(r6, r12)
            goto L_0x0033
        L_0x008d:
            boolean r4 = r11.q(r12, r5, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            java.lang.Object r4 = r4.h(r6, r12)
            int r4 = r4.hashCode()
            goto L_0x0033
        L_0x00a0:
            boolean r4 = r11.q(r12, r5, r2)
            if (r4 == 0) goto L_0x0278
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            java.lang.Object r4 = r4.h(r6, r12)
            int r3 = r3 * 53
            int r4 = r4.hashCode()
            goto L_0x0033
        L_0x00b3:
            boolean r4 = r11.q(r12, r5, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            java.lang.Object r4 = r4.h(r6, r12)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.hashCode()
            goto L_0x0033
        L_0x00c9:
            boolean r4 = r11.q(r12, r5, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            java.lang.Object r4 = r4.h(r6, r12)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.nio.charset.Charset r5 = androidx.datastore.preferences.protobuf.C0120y.f2497a
            if (r4 == 0) goto L_0x00e2
        L_0x00e1:
            r8 = r9
        L_0x00e2:
            int r8 = r8 + r3
            r3 = r8
            goto L_0x0278
        L_0x00e6:
            boolean r4 = r11.q(r12, r5, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            int r4 = z(r6, r12)
            goto L_0x0033
        L_0x00f4:
            boolean r4 = r11.q(r12, r5, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            long r4 = A(r6, r12)
            int r4 = androidx.datastore.preferences.protobuf.C0120y.b(r4)
            goto L_0x0033
        L_0x0106:
            boolean r4 = r11.q(r12, r5, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            int r4 = z(r6, r12)
            goto L_0x0033
        L_0x0114:
            boolean r4 = r11.q(r12, r5, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            long r4 = A(r6, r12)
            int r4 = androidx.datastore.preferences.protobuf.C0120y.b(r4)
            goto L_0x0033
        L_0x0126:
            boolean r4 = r11.q(r12, r5, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            long r4 = A(r6, r12)
            int r4 = androidx.datastore.preferences.protobuf.C0120y.b(r4)
            goto L_0x0033
        L_0x0138:
            boolean r4 = r11.q(r12, r5, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            java.lang.Object r4 = r4.h(r6, r12)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            int r4 = java.lang.Float.floatToIntBits(r4)
            goto L_0x0033
        L_0x0152:
            boolean r4 = r11.q(r12, r5, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            java.lang.Object r4 = r4.h(r6, r12)
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            long r4 = java.lang.Double.doubleToLongBits(r4)
            int r4 = androidx.datastore.preferences.protobuf.C0120y.b(r4)
            goto L_0x0033
        L_0x0170:
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            java.lang.Object r4 = r4.h(r6, r12)
            int r4 = r4.hashCode()
            goto L_0x0033
        L_0x017e:
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            java.lang.Object r4 = r4.h(r6, r12)
            int r4 = r4.hashCode()
            goto L_0x0033
        L_0x018c:
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            java.lang.Object r4 = r4.h(r6, r12)
            if (r4 == 0) goto L_0x0198
            int r10 = r4.hashCode()
        L_0x0198:
            int r3 = r3 * 53
            int r3 = r3 + r10
            goto L_0x0278
        L_0x019d:
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            long r4 = r4.g(r6, r12)
            int r4 = androidx.datastore.preferences.protobuf.C0120y.b(r4)
            goto L_0x0033
        L_0x01ab:
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            int r4 = r4.f(r6, r12)
            goto L_0x0033
        L_0x01b5:
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            long r4 = r4.g(r6, r12)
            int r4 = androidx.datastore.preferences.protobuf.C0120y.b(r4)
            goto L_0x0033
        L_0x01c3:
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            int r4 = r4.f(r6, r12)
            goto L_0x0033
        L_0x01cd:
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            int r4 = r4.f(r6, r12)
            goto L_0x0033
        L_0x01d7:
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            int r4 = r4.f(r6, r12)
            goto L_0x0033
        L_0x01e1:
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            java.lang.Object r4 = r4.h(r6, r12)
            int r4 = r4.hashCode()
            goto L_0x0033
        L_0x01ef:
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            java.lang.Object r4 = r4.h(r6, r12)
            if (r4 == 0) goto L_0x0198
            int r10 = r4.hashCode()
            goto L_0x0198
        L_0x01fc:
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            java.lang.Object r4 = r4.h(r6, r12)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.hashCode()
            goto L_0x0033
        L_0x020c:
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            boolean r4 = r4.c(r6, r12)
            java.nio.charset.Charset r5 = androidx.datastore.preferences.protobuf.C0120y.f2497a
            if (r4 == 0) goto L_0x00e2
            goto L_0x00e1
        L_0x021a:
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            int r4 = r4.f(r6, r12)
            goto L_0x0033
        L_0x0224:
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            long r4 = r4.g(r6, r12)
            int r4 = androidx.datastore.preferences.protobuf.C0120y.b(r4)
            goto L_0x0033
        L_0x0232:
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            int r4 = r4.f(r6, r12)
            goto L_0x0033
        L_0x023c:
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            long r4 = r4.g(r6, r12)
            int r4 = androidx.datastore.preferences.protobuf.C0120y.b(r4)
            goto L_0x0033
        L_0x024a:
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            long r4 = r4.g(r6, r12)
            int r4 = androidx.datastore.preferences.protobuf.C0120y.b(r4)
            goto L_0x0033
        L_0x0258:
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            float r4 = r4.e(r6, r12)
            int r4 = java.lang.Float.floatToIntBits(r4)
            goto L_0x0033
        L_0x0266:
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            double r4 = r4.d(r6, r12)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            int r4 = androidx.datastore.preferences.protobuf.C0120y.b(r4)
            goto L_0x0033
        L_0x0278:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x027c:
            int r3 = r3 * 53
            androidx.datastore.preferences.protobuf.d0 r0 = r11.f2374l
            r0.getClass()
            androidx.datastore.preferences.protobuf.c0 r12 = r12.unknownFields
            int r12 = r12.hashCode()
            int r12 = r12 + r3
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.e(androidx.datastore.preferences.protobuf.w):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f6, code lost:
        r12 = r0 + r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a8, code lost:
        r12 = r12 + ((r2 + r1) + r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int f(androidx.datastore.preferences.protobuf.C0118w r17) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            sun.misc.Unsafe r8 = f2362o
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r10
            r1 = 0
            r11 = 0
            r12 = 0
        L_0x000d:
            int[] r2 = r6.f2363a
            int r3 = r2.length
            if (r11 >= r3) goto L_0x0547
            int r3 = r6.M(r11)
            int r4 = L(r3)
            r13 = r2[r11]
            int r5 = r11 + 2
            r2 = r2[r5]
            r5 = r2 & r10
            r14 = 17
            if (r4 > r14) goto L_0x003c
            if (r5 == r0) goto L_0x0033
            if (r5 != r10) goto L_0x002c
            r1 = 0
            goto L_0x0032
        L_0x002c:
            long r0 = (long) r5
            int r0 = r8.getInt(r7, r0)
            r1 = r0
        L_0x0032:
            r0 = r5
        L_0x0033:
            int r2 = r2 >>> 20
            r5 = 1
            int r2 = r5 << r2
            r14 = r0
            r15 = r1
            r5 = r2
            goto L_0x003f
        L_0x003c:
            r14 = r0
            r15 = r1
            r5 = 0
        L_0x003f:
            r0 = r3 & r10
            long r2 = (long) r0
            androidx.datastore.preferences.protobuf.s r0 = androidx.datastore.preferences.protobuf.C0114s.DOUBLE_LIST_PACKED
            int r0 = r0.a()
            if (r4 < r0) goto L_0x0050
            androidx.datastore.preferences.protobuf.s r0 = androidx.datastore.preferences.protobuf.C0114s.SINT64_LIST_PACKED
            int r0 = r0.a()
        L_0x0050:
            switch(r4) {
                case 0: goto L_0x052b;
                case 1: goto L_0x0518;
                case 2: goto L_0x0500;
                case 3: goto L_0x04e8;
                case 4: goto L_0x04d0;
                case 5: goto L_0x04bd;
                case 6: goto L_0x04aa;
                case 7: goto L_0x0497;
                case 8: goto L_0x0471;
                case 9: goto L_0x0455;
                case 10: goto L_0x043b;
                case 11: goto L_0x0423;
                case 12: goto L_0x040b;
                case 13: goto L_0x03f8;
                case 14: goto L_0x03e5;
                case 15: goto L_0x03cd;
                case 16: goto L_0x03b5;
                case 17: goto L_0x0396;
                case 18: goto L_0x038a;
                case 19: goto L_0x037e;
                case 20: goto L_0x0372;
                case 21: goto L_0x0366;
                case 22: goto L_0x035a;
                case 23: goto L_0x034e;
                case 24: goto L_0x0342;
                case 25: goto L_0x0336;
                case 26: goto L_0x032a;
                case 27: goto L_0x031a;
                case 28: goto L_0x030e;
                case 29: goto L_0x0302;
                case 30: goto L_0x02f6;
                case 31: goto L_0x02ea;
                case 32: goto L_0x02de;
                case 33: goto L_0x02d2;
                case 34: goto L_0x02c6;
                case 35: goto L_0x02b0;
                case 36: goto L_0x029a;
                case 37: goto L_0x0284;
                case 38: goto L_0x026e;
                case 39: goto L_0x0258;
                case 40: goto L_0x0242;
                case 41: goto L_0x022c;
                case 42: goto L_0x0216;
                case 43: goto L_0x0201;
                case 44: goto L_0x01ec;
                case 45: goto L_0x01d7;
                case 46: goto L_0x01c2;
                case 47: goto L_0x01ad;
                case 48: goto L_0x0194;
                case 49: goto L_0x0184;
                case 50: goto L_0x016d;
                case 51: goto L_0x0161;
                case 52: goto L_0x0155;
                case 53: goto L_0x0145;
                case 54: goto L_0x0135;
                case 55: goto L_0x0125;
                case 56: goto L_0x0119;
                case 57: goto L_0x010d;
                case 58: goto L_0x0101;
                case 59: goto L_0x00e2;
                case 60: goto L_0x00cf;
                case 61: goto L_0x00be;
                case 62: goto L_0x00af;
                case 63: goto L_0x00a0;
                case 64: goto L_0x0095;
                case 65: goto L_0x008a;
                case 66: goto L_0x007b;
                case 67: goto L_0x006c;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x053e
        L_0x0055:
            boolean r0 = r6.q(r7, r13, r11)
            if (r0 == 0) goto L_0x053e
            java.lang.Object r0 = r8.getObject(r7, r2)
            androidx.datastore.preferences.protobuf.a r0 = (androidx.datastore.preferences.protobuf.C0097a) r0
            androidx.datastore.preferences.protobuf.W r1 = r6.m(r11)
            int r0 = androidx.datastore.preferences.protobuf.C0109m.l0(r13, r0, r1)
        L_0x0069:
            int r12 = r12 + r0
            goto L_0x053e
        L_0x006c:
            boolean r0 = r6.q(r7, r13, r11)
            if (r0 == 0) goto L_0x053e
            long r0 = A(r2, r7)
            int r0 = androidx.datastore.preferences.protobuf.C0109m.r0(r0, r13)
            goto L_0x0069
        L_0x007b:
            boolean r0 = r6.q(r7, r13, r11)
            if (r0 == 0) goto L_0x053e
            int r0 = z(r2, r7)
            int r0 = androidx.datastore.preferences.protobuf.C0109m.q0(r13, r0)
            goto L_0x0069
        L_0x008a:
            boolean r0 = r6.q(r7, r13, r11)
            if (r0 == 0) goto L_0x053e
            int r0 = androidx.datastore.preferences.protobuf.C0109m.p0(r13)
            goto L_0x0069
        L_0x0095:
            boolean r0 = r6.q(r7, r13, r11)
            if (r0 == 0) goto L_0x053e
            int r0 = androidx.datastore.preferences.protobuf.C0109m.o0(r13)
            goto L_0x0069
        L_0x00a0:
            boolean r0 = r6.q(r7, r13, r11)
            if (r0 == 0) goto L_0x053e
            int r0 = z(r2, r7)
            int r0 = androidx.datastore.preferences.protobuf.C0109m.h0(r13, r0)
            goto L_0x0069
        L_0x00af:
            boolean r0 = r6.q(r7, r13, r11)
            if (r0 == 0) goto L_0x053e
            int r0 = z(r2, r7)
            int r0 = androidx.datastore.preferences.protobuf.C0109m.v0(r13, r0)
            goto L_0x0069
        L_0x00be:
            boolean r0 = r6.q(r7, r13, r11)
            if (r0 == 0) goto L_0x053e
            java.lang.Object r0 = r8.getObject(r7, r2)
            androidx.datastore.preferences.protobuf.g r0 = (androidx.datastore.preferences.protobuf.C0103g) r0
            int r0 = androidx.datastore.preferences.protobuf.C0109m.f0(r13, r0)
            goto L_0x0069
        L_0x00cf:
            boolean r0 = r6.q(r7, r13, r11)
            if (r0 == 0) goto L_0x053e
            java.lang.Object r0 = r8.getObject(r7, r2)
            androidx.datastore.preferences.protobuf.W r1 = r6.m(r11)
            int r0 = androidx.datastore.preferences.protobuf.X.o(r13, r0, r1)
            goto L_0x0069
        L_0x00e2:
            boolean r0 = r6.q(r7, r13, r11)
            if (r0 == 0) goto L_0x053e
            java.lang.Object r0 = r8.getObject(r7, r2)
            boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.C0103g
            if (r1 == 0) goto L_0x00fa
            androidx.datastore.preferences.protobuf.g r0 = (androidx.datastore.preferences.protobuf.C0103g) r0
            int r0 = androidx.datastore.preferences.protobuf.C0109m.f0(r13, r0)
        L_0x00f6:
            int r0 = r0 + r12
            r12 = r0
            goto L_0x053e
        L_0x00fa:
            java.lang.String r0 = (java.lang.String) r0
            int r0 = androidx.datastore.preferences.protobuf.C0109m.s0(r0, r13)
            goto L_0x00f6
        L_0x0101:
            boolean r0 = r6.q(r7, r13, r11)
            if (r0 == 0) goto L_0x053e
            int r0 = androidx.datastore.preferences.protobuf.C0109m.e0(r13)
            goto L_0x0069
        L_0x010d:
            boolean r0 = r6.q(r7, r13, r11)
            if (r0 == 0) goto L_0x053e
            int r0 = androidx.datastore.preferences.protobuf.C0109m.i0(r13)
            goto L_0x0069
        L_0x0119:
            boolean r0 = r6.q(r7, r13, r11)
            if (r0 == 0) goto L_0x053e
            int r0 = androidx.datastore.preferences.protobuf.C0109m.j0(r13)
            goto L_0x0069
        L_0x0125:
            boolean r0 = r6.q(r7, r13, r11)
            if (r0 == 0) goto L_0x053e
            int r0 = z(r2, r7)
            int r0 = androidx.datastore.preferences.protobuf.C0109m.m0(r13, r0)
            goto L_0x0069
        L_0x0135:
            boolean r0 = r6.q(r7, r13, r11)
            if (r0 == 0) goto L_0x053e
            long r0 = A(r2, r7)
            int r0 = androidx.datastore.preferences.protobuf.C0109m.x0(r0, r13)
            goto L_0x0069
        L_0x0145:
            boolean r0 = r6.q(r7, r13, r11)
            if (r0 == 0) goto L_0x053e
            long r0 = A(r2, r7)
            int r0 = androidx.datastore.preferences.protobuf.C0109m.n0(r0, r13)
            goto L_0x0069
        L_0x0155:
            boolean r0 = r6.q(r7, r13, r11)
            if (r0 == 0) goto L_0x053e
            int r0 = androidx.datastore.preferences.protobuf.C0109m.k0(r13)
            goto L_0x0069
        L_0x0161:
            boolean r0 = r6.q(r7, r13, r11)
            if (r0 == 0) goto L_0x053e
            int r0 = androidx.datastore.preferences.protobuf.C0109m.g0(r13)
            goto L_0x0069
        L_0x016d:
            java.lang.Object r0 = r8.getObject(r7, r2)
            int r1 = r11 / 3
            int r1 = r1 * 2
            java.lang.Object[] r2 = r6.f2364b
            r1 = r2[r1]
            androidx.datastore.preferences.protobuf.J r2 = r6.f2375m
            r2.getClass()
            int r0 = androidx.datastore.preferences.protobuf.J.a(r13, r0, r1)
            goto L_0x0069
        L_0x0184:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            androidx.datastore.preferences.protobuf.W r1 = r6.m(r11)
            int r0 = androidx.datastore.preferences.protobuf.X.j(r13, r0, r1)
            goto L_0x0069
        L_0x0194:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.t(r0)
            if (r0 <= 0) goto L_0x053e
            int r1 = androidx.datastore.preferences.protobuf.C0109m.u0(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0)
        L_0x01a8:
            int r2 = r2 + r1
            int r2 = r2 + r0
            int r12 = r12 + r2
            goto L_0x053e
        L_0x01ad:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.r(r0)
            if (r0 <= 0) goto L_0x053e
            int r1 = androidx.datastore.preferences.protobuf.C0109m.u0(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0)
            goto L_0x01a8
        L_0x01c2:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.i(r0)
            if (r0 <= 0) goto L_0x053e
            int r1 = androidx.datastore.preferences.protobuf.C0109m.u0(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0)
            goto L_0x01a8
        L_0x01d7:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.g(r0)
            if (r0 <= 0) goto L_0x053e
            int r1 = androidx.datastore.preferences.protobuf.C0109m.u0(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0)
            goto L_0x01a8
        L_0x01ec:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.e(r0)
            if (r0 <= 0) goto L_0x053e
            int r1 = androidx.datastore.preferences.protobuf.C0109m.u0(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0)
            goto L_0x01a8
        L_0x0201:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.w(r0)
            if (r0 <= 0) goto L_0x053e
            int r1 = androidx.datastore.preferences.protobuf.C0109m.u0(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0)
            goto L_0x01a8
        L_0x0216:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.b(r0)
            if (r0 <= 0) goto L_0x053e
            int r1 = androidx.datastore.preferences.protobuf.C0109m.u0(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0)
            goto L_0x01a8
        L_0x022c:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.g(r0)
            if (r0 <= 0) goto L_0x053e
            int r1 = androidx.datastore.preferences.protobuf.C0109m.u0(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0)
            goto L_0x01a8
        L_0x0242:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.i(r0)
            if (r0 <= 0) goto L_0x053e
            int r1 = androidx.datastore.preferences.protobuf.C0109m.u0(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0)
            goto L_0x01a8
        L_0x0258:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.l(r0)
            if (r0 <= 0) goto L_0x053e
            int r1 = androidx.datastore.preferences.protobuf.C0109m.u0(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0)
            goto L_0x01a8
        L_0x026e:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.y(r0)
            if (r0 <= 0) goto L_0x053e
            int r1 = androidx.datastore.preferences.protobuf.C0109m.u0(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0)
            goto L_0x01a8
        L_0x0284:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.n(r0)
            if (r0 <= 0) goto L_0x053e
            int r1 = androidx.datastore.preferences.protobuf.C0109m.u0(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0)
            goto L_0x01a8
        L_0x029a:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.g(r0)
            if (r0 <= 0) goto L_0x053e
            int r1 = androidx.datastore.preferences.protobuf.C0109m.u0(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0)
            goto L_0x01a8
        L_0x02b0:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.i(r0)
            if (r0 <= 0) goto L_0x053e
            int r1 = androidx.datastore.preferences.protobuf.C0109m.u0(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0109m.w0(r0)
            goto L_0x01a8
        L_0x02c6:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.s(r13, r0)
            goto L_0x0069
        L_0x02d2:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.q(r13, r0)
            goto L_0x0069
        L_0x02de:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.h(r13, r0)
            goto L_0x0069
        L_0x02ea:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.f(r13, r0)
            goto L_0x0069
        L_0x02f6:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.d(r13, r0)
            goto L_0x0069
        L_0x0302:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.v(r13, r0)
            goto L_0x0069
        L_0x030e:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.c(r13, r0)
            goto L_0x0069
        L_0x031a:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            androidx.datastore.preferences.protobuf.W r1 = r6.m(r11)
            int r0 = androidx.datastore.preferences.protobuf.X.p(r13, r0, r1)
            goto L_0x0069
        L_0x032a:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.u(r13, r0)
            goto L_0x0069
        L_0x0336:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.a(r13, r0)
            goto L_0x0069
        L_0x0342:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.f(r13, r0)
            goto L_0x0069
        L_0x034e:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.h(r13, r0)
            goto L_0x0069
        L_0x035a:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.k(r13, r0)
            goto L_0x0069
        L_0x0366:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.x(r13, r0)
            goto L_0x0069
        L_0x0372:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.m(r13, r0)
            goto L_0x0069
        L_0x037e:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.f(r13, r0)
            goto L_0x0069
        L_0x038a:
            java.lang.Object r0 = r8.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.X.h(r13, r0)
            goto L_0x0069
        L_0x0396:
            r0 = r16
            r1 = r17
            r3 = r2
            r2 = r11
            r9 = r3
            r3 = r14
            r4 = r15
            boolean r0 = r0.o(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x053e
            java.lang.Object r0 = r8.getObject(r7, r9)
            androidx.datastore.preferences.protobuf.a r0 = (androidx.datastore.preferences.protobuf.C0097a) r0
            androidx.datastore.preferences.protobuf.W r1 = r6.m(r11)
            int r0 = androidx.datastore.preferences.protobuf.C0109m.l0(r13, r0, r1)
            goto L_0x0069
        L_0x03b5:
            r9 = r2
            r0 = r16
            r1 = r17
            r2 = r11
            r3 = r14
            r4 = r15
            boolean r0 = r0.o(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x053e
            long r0 = r8.getLong(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C0109m.r0(r0, r13)
            goto L_0x0069
        L_0x03cd:
            r9 = r2
            r0 = r16
            r1 = r17
            r2 = r11
            r3 = r14
            r4 = r15
            boolean r0 = r0.o(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x053e
            int r0 = r8.getInt(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C0109m.q0(r13, r0)
            goto L_0x0069
        L_0x03e5:
            r0 = r16
            r1 = r17
            r2 = r11
            r3 = r14
            r4 = r15
            boolean r0 = r0.o(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x053e
            int r0 = androidx.datastore.preferences.protobuf.C0109m.p0(r13)
            goto L_0x0069
        L_0x03f8:
            r0 = r16
            r1 = r17
            r2 = r11
            r3 = r14
            r4 = r15
            boolean r0 = r0.o(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x053e
            int r0 = androidx.datastore.preferences.protobuf.C0109m.o0(r13)
            goto L_0x0069
        L_0x040b:
            r9 = r2
            r0 = r16
            r1 = r17
            r2 = r11
            r3 = r14
            r4 = r15
            boolean r0 = r0.o(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x053e
            int r0 = r8.getInt(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C0109m.h0(r13, r0)
            goto L_0x0069
        L_0x0423:
            r9 = r2
            r0 = r16
            r1 = r17
            r2 = r11
            r3 = r14
            r4 = r15
            boolean r0 = r0.o(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x053e
            int r0 = r8.getInt(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C0109m.v0(r13, r0)
            goto L_0x0069
        L_0x043b:
            r9 = r2
            r0 = r16
            r1 = r17
            r2 = r11
            r3 = r14
            r4 = r15
            boolean r0 = r0.o(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x053e
            java.lang.Object r0 = r8.getObject(r7, r9)
            androidx.datastore.preferences.protobuf.g r0 = (androidx.datastore.preferences.protobuf.C0103g) r0
            int r0 = androidx.datastore.preferences.protobuf.C0109m.f0(r13, r0)
            goto L_0x0069
        L_0x0455:
            r9 = r2
            r0 = r16
            r1 = r17
            r2 = r11
            r3 = r14
            r4 = r15
            boolean r0 = r0.o(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x053e
            java.lang.Object r0 = r8.getObject(r7, r9)
            androidx.datastore.preferences.protobuf.W r1 = r6.m(r11)
            int r0 = androidx.datastore.preferences.protobuf.X.o(r13, r0, r1)
            goto L_0x0069
        L_0x0471:
            r9 = r2
            r0 = r16
            r1 = r17
            r2 = r11
            r3 = r14
            r4 = r15
            boolean r0 = r0.o(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x053e
            java.lang.Object r0 = r8.getObject(r7, r9)
            boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.C0103g
            if (r1 == 0) goto L_0x048f
            androidx.datastore.preferences.protobuf.g r0 = (androidx.datastore.preferences.protobuf.C0103g) r0
            int r0 = androidx.datastore.preferences.protobuf.C0109m.f0(r13, r0)
            goto L_0x00f6
        L_0x048f:
            java.lang.String r0 = (java.lang.String) r0
            int r0 = androidx.datastore.preferences.protobuf.C0109m.s0(r0, r13)
            goto L_0x00f6
        L_0x0497:
            r0 = r16
            r1 = r17
            r2 = r11
            r3 = r14
            r4 = r15
            boolean r0 = r0.o(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x053e
            int r0 = androidx.datastore.preferences.protobuf.C0109m.e0(r13)
            goto L_0x0069
        L_0x04aa:
            r0 = r16
            r1 = r17
            r2 = r11
            r3 = r14
            r4 = r15
            boolean r0 = r0.o(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x053e
            int r0 = androidx.datastore.preferences.protobuf.C0109m.i0(r13)
            goto L_0x0069
        L_0x04bd:
            r0 = r16
            r1 = r17
            r2 = r11
            r3 = r14
            r4 = r15
            boolean r0 = r0.o(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x053e
            int r0 = androidx.datastore.preferences.protobuf.C0109m.j0(r13)
            goto L_0x0069
        L_0x04d0:
            r9 = r2
            r0 = r16
            r1 = r17
            r2 = r11
            r3 = r14
            r4 = r15
            boolean r0 = r0.o(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x053e
            int r0 = r8.getInt(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C0109m.m0(r13, r0)
            goto L_0x0069
        L_0x04e8:
            r9 = r2
            r0 = r16
            r1 = r17
            r2 = r11
            r3 = r14
            r4 = r15
            boolean r0 = r0.o(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x053e
            long r0 = r8.getLong(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C0109m.x0(r0, r13)
            goto L_0x0069
        L_0x0500:
            r9 = r2
            r0 = r16
            r1 = r17
            r2 = r11
            r3 = r14
            r4 = r15
            boolean r0 = r0.o(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x053e
            long r0 = r8.getLong(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C0109m.n0(r0, r13)
            goto L_0x0069
        L_0x0518:
            r0 = r16
            r1 = r17
            r2 = r11
            r3 = r14
            r4 = r15
            boolean r0 = r0.o(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x053e
            int r0 = androidx.datastore.preferences.protobuf.C0109m.k0(r13)
            goto L_0x0069
        L_0x052b:
            r0 = r16
            r1 = r17
            r2 = r11
            r3 = r14
            r4 = r15
            boolean r0 = r0.o(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x053e
            int r0 = androidx.datastore.preferences.protobuf.C0109m.g0(r13)
            goto L_0x0069
        L_0x053e:
            int r11 = r11 + 3
            r0 = r14
            r1 = r15
            r10 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000d
        L_0x0547:
            androidx.datastore.preferences.protobuf.d0 r0 = r6.f2374l
            r0.getClass()
            androidx.datastore.preferences.protobuf.c0 r0 = r7.unknownFields
            int r0 = r0.b()
            int r0 = r0 + r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.f(androidx.datastore.preferences.protobuf.w):int");
    }

    public final C0118w g() {
        this.f2372j.getClass();
        return ((C0118w) this.f2367e).k();
    }

    public final void h(Object obj) {
        if (p(obj)) {
            if (obj instanceof C0118w) {
                C0118w wVar = (C0118w) obj;
                wVar.d();
                wVar.c();
                wVar.j();
            }
            int[] iArr = this.f2363a;
            int length = iArr.length;
            for (int i3 = 0; i3 < length; i3 += 3) {
                int M3 = M(i3);
                long j3 = (long) (1048575 & M3);
                int L3 = L(M3);
                if (L3 != 9) {
                    if (L3 == 60 || L3 == 68) {
                        if (q(obj, iArr[i3], i3)) {
                            m(i3).h(f2362o.getObject(obj, j3));
                        }
                    } else {
                        switch (L3) {
                            case 17:
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f2373k.getClass();
                                C.a(j3, obj);
                                continue;
                            case 50:
                                Unsafe unsafe = f2362o;
                                Object object = unsafe.getObject(obj, j3);
                                if (object != null) {
                                    this.f2375m.getClass();
                                    J.c(object);
                                    unsafe.putObject(obj, j3, object);
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
                if (n(i3, obj)) {
                    m(i3).h(f2362o.getObject(obj, j3));
                }
            }
            this.f2374l.getClass();
            d0.b(obj);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0074, code lost:
        if (androidx.datastore.preferences.protobuf.X.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008a, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009e, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b4, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c8, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dc, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f0, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0108, code lost:
        if (androidx.datastore.preferences.protobuf.X.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0120, code lost:
        if (androidx.datastore.preferences.protobuf.X.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0138, code lost:
        if (androidx.datastore.preferences.protobuf.X.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014c, code lost:
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0160, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0176, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018a, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019f, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b4, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01cf, code lost:
        if (java.lang.Float.floatToIntBits(r5.e(r7, r12)) == java.lang.Float.floatToIntBits(r5.e(r7, r13))) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ec, code lost:
        if (java.lang.Double.doubleToLongBits(r5.d(r7, r12)) == java.lang.Double.doubleToLongBits(r5.d(r7, r13))) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
        if (androidx.datastore.preferences.protobuf.X.B(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        r4 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(androidx.datastore.preferences.protobuf.C0118w r12, java.lang.Object r13) {
        /*
            r11 = this;
            int[] r0 = r11.f2363a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x0005:
            r4 = 1
            if (r3 >= r1) goto L_0x01f5
            int r5 = r11.M(r3)
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r5 & r6
            long r7 = (long) r7
            int r5 = L(r5)
            switch(r5) {
                case 0: goto L_0x01d2;
                case 1: goto L_0x01b7;
                case 2: goto L_0x01a2;
                case 3: goto L_0x018d;
                case 4: goto L_0x017a;
                case 5: goto L_0x0164;
                case 6: goto L_0x0150;
                case 7: goto L_0x013c;
                case 8: goto L_0x0124;
                case 9: goto L_0x010c;
                case 10: goto L_0x00f4;
                case 11: goto L_0x00e0;
                case 12: goto L_0x00cc;
                case 13: goto L_0x00b8;
                case 14: goto L_0x00a2;
                case 15: goto L_0x008e;
                case 16: goto L_0x0078;
                case 17: goto L_0x0060;
                case 18: goto L_0x0050;
                case 19: goto L_0x0050;
                case 20: goto L_0x0050;
                case 21: goto L_0x0050;
                case 22: goto L_0x0050;
                case 23: goto L_0x0050;
                case 24: goto L_0x0050;
                case 25: goto L_0x0050;
                case 26: goto L_0x0050;
                case 27: goto L_0x0050;
                case 28: goto L_0x0050;
                case 29: goto L_0x0050;
                case 30: goto L_0x0050;
                case 31: goto L_0x0050;
                case 32: goto L_0x0050;
                case 33: goto L_0x0050;
                case 34: goto L_0x0050;
                case 35: goto L_0x0050;
                case 36: goto L_0x0050;
                case 37: goto L_0x0050;
                case 38: goto L_0x0050;
                case 39: goto L_0x0050;
                case 40: goto L_0x0050;
                case 41: goto L_0x0050;
                case 42: goto L_0x0050;
                case 43: goto L_0x0050;
                case 44: goto L_0x0050;
                case 45: goto L_0x0050;
                case 46: goto L_0x0050;
                case 47: goto L_0x0050;
                case 48: goto L_0x0050;
                case 49: goto L_0x0050;
                case 50: goto L_0x0040;
                case 51: goto L_0x001b;
                case 52: goto L_0x001b;
                case 53: goto L_0x001b;
                case 54: goto L_0x001b;
                case 55: goto L_0x001b;
                case 56: goto L_0x001b;
                case 57: goto L_0x001b;
                case 58: goto L_0x001b;
                case 59: goto L_0x001b;
                case 60: goto L_0x001b;
                case 61: goto L_0x001b;
                case 62: goto L_0x001b;
                case 63: goto L_0x001b;
                case 64: goto L_0x001b;
                case 65: goto L_0x001b;
                case 66: goto L_0x001b;
                case 67: goto L_0x001b;
                case 68: goto L_0x001b;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x01ee
        L_0x001b:
            int r5 = r3 + 2
            r5 = r0[r5]
            r5 = r5 & r6
            long r5 = (long) r5
            androidx.datastore.preferences.protobuf.h0 r9 = androidx.datastore.preferences.protobuf.i0.f2444b
            int r10 = r9.f(r5, r12)
            int r5 = r9.f(r5, r13)
            if (r10 != r5) goto L_0x003d
            java.lang.Object r5 = r9.h(r7, r12)
            java.lang.Object r6 = r9.h(r7, r13)
            boolean r5 = androidx.datastore.preferences.protobuf.X.B(r5, r6)
            if (r5 == 0) goto L_0x003d
            goto L_0x01ee
        L_0x003d:
            r4 = r2
            goto L_0x01ee
        L_0x0040:
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            java.lang.Object r5 = r4.h(r7, r12)
            java.lang.Object r4 = r4.h(r7, r13)
            boolean r4 = androidx.datastore.preferences.protobuf.X.B(r5, r4)
            goto L_0x01ee
        L_0x0050:
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b
            java.lang.Object r5 = r4.h(r7, r12)
            java.lang.Object r4 = r4.h(r7, r13)
            boolean r4 = androidx.datastore.preferences.protobuf.X.B(r5, r4)
            goto L_0x01ee
        L_0x0060:
            boolean r5 = r11.j(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            androidx.datastore.preferences.protobuf.h0 r5 = androidx.datastore.preferences.protobuf.i0.f2444b
            java.lang.Object r6 = r5.h(r7, r12)
            java.lang.Object r5 = r5.h(r7, r13)
            boolean r5 = androidx.datastore.preferences.protobuf.X.B(r6, r5)
            if (r5 == 0) goto L_0x003d
            goto L_0x01ee
        L_0x0078:
            boolean r5 = r11.j(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            androidx.datastore.preferences.protobuf.h0 r5 = androidx.datastore.preferences.protobuf.i0.f2444b
            long r9 = r5.g(r7, r12)
            long r5 = r5.g(r7, r13)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x003d
            goto L_0x01ee
        L_0x008e:
            boolean r5 = r11.j(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            androidx.datastore.preferences.protobuf.h0 r5 = androidx.datastore.preferences.protobuf.i0.f2444b
            int r6 = r5.f(r7, r12)
            int r5 = r5.f(r7, r13)
            if (r6 != r5) goto L_0x003d
            goto L_0x01ee
        L_0x00a2:
            boolean r5 = r11.j(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            androidx.datastore.preferences.protobuf.h0 r5 = androidx.datastore.preferences.protobuf.i0.f2444b
            long r9 = r5.g(r7, r12)
            long r5 = r5.g(r7, r13)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x003d
            goto L_0x01ee
        L_0x00b8:
            boolean r5 = r11.j(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            androidx.datastore.preferences.protobuf.h0 r5 = androidx.datastore.preferences.protobuf.i0.f2444b
            int r6 = r5.f(r7, r12)
            int r5 = r5.f(r7, r13)
            if (r6 != r5) goto L_0x003d
            goto L_0x01ee
        L_0x00cc:
            boolean r5 = r11.j(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            androidx.datastore.preferences.protobuf.h0 r5 = androidx.datastore.preferences.protobuf.i0.f2444b
            int r6 = r5.f(r7, r12)
            int r5 = r5.f(r7, r13)
            if (r6 != r5) goto L_0x003d
            goto L_0x01ee
        L_0x00e0:
            boolean r5 = r11.j(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            androidx.datastore.preferences.protobuf.h0 r5 = androidx.datastore.preferences.protobuf.i0.f2444b
            int r6 = r5.f(r7, r12)
            int r5 = r5.f(r7, r13)
            if (r6 != r5) goto L_0x003d
            goto L_0x01ee
        L_0x00f4:
            boolean r5 = r11.j(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            androidx.datastore.preferences.protobuf.h0 r5 = androidx.datastore.preferences.protobuf.i0.f2444b
            java.lang.Object r6 = r5.h(r7, r12)
            java.lang.Object r5 = r5.h(r7, r13)
            boolean r5 = androidx.datastore.preferences.protobuf.X.B(r6, r5)
            if (r5 == 0) goto L_0x003d
            goto L_0x01ee
        L_0x010c:
            boolean r5 = r11.j(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            androidx.datastore.preferences.protobuf.h0 r5 = androidx.datastore.preferences.protobuf.i0.f2444b
            java.lang.Object r6 = r5.h(r7, r12)
            java.lang.Object r5 = r5.h(r7, r13)
            boolean r5 = androidx.datastore.preferences.protobuf.X.B(r6, r5)
            if (r5 == 0) goto L_0x003d
            goto L_0x01ee
        L_0x0124:
            boolean r5 = r11.j(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            androidx.datastore.preferences.protobuf.h0 r5 = androidx.datastore.preferences.protobuf.i0.f2444b
            java.lang.Object r6 = r5.h(r7, r12)
            java.lang.Object r5 = r5.h(r7, r13)
            boolean r5 = androidx.datastore.preferences.protobuf.X.B(r6, r5)
            if (r5 == 0) goto L_0x003d
            goto L_0x01ee
        L_0x013c:
            boolean r5 = r11.j(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            androidx.datastore.preferences.protobuf.h0 r5 = androidx.datastore.preferences.protobuf.i0.f2444b
            boolean r6 = r5.c(r7, r12)
            boolean r5 = r5.c(r7, r13)
            if (r6 != r5) goto L_0x003d
            goto L_0x01ee
        L_0x0150:
            boolean r5 = r11.j(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            androidx.datastore.preferences.protobuf.h0 r5 = androidx.datastore.preferences.protobuf.i0.f2444b
            int r6 = r5.f(r7, r12)
            int r5 = r5.f(r7, r13)
            if (r6 != r5) goto L_0x003d
            goto L_0x01ee
        L_0x0164:
            boolean r5 = r11.j(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            androidx.datastore.preferences.protobuf.h0 r5 = androidx.datastore.preferences.protobuf.i0.f2444b
            long r9 = r5.g(r7, r12)
            long r5 = r5.g(r7, r13)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x003d
            goto L_0x01ee
        L_0x017a:
            boolean r5 = r11.j(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            androidx.datastore.preferences.protobuf.h0 r5 = androidx.datastore.preferences.protobuf.i0.f2444b
            int r6 = r5.f(r7, r12)
            int r5 = r5.f(r7, r13)
            if (r6 != r5) goto L_0x003d
            goto L_0x01ee
        L_0x018d:
            boolean r5 = r11.j(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            androidx.datastore.preferences.protobuf.h0 r5 = androidx.datastore.preferences.protobuf.i0.f2444b
            long r9 = r5.g(r7, r12)
            long r5 = r5.g(r7, r13)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x003d
            goto L_0x01ee
        L_0x01a2:
            boolean r5 = r11.j(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            androidx.datastore.preferences.protobuf.h0 r5 = androidx.datastore.preferences.protobuf.i0.f2444b
            long r9 = r5.g(r7, r12)
            long r5 = r5.g(r7, r13)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x003d
            goto L_0x01ee
        L_0x01b7:
            boolean r5 = r11.j(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            androidx.datastore.preferences.protobuf.h0 r5 = androidx.datastore.preferences.protobuf.i0.f2444b
            float r6 = r5.e(r7, r12)
            int r6 = java.lang.Float.floatToIntBits(r6)
            float r5 = r5.e(r7, r13)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r6 != r5) goto L_0x003d
            goto L_0x01ee
        L_0x01d2:
            boolean r5 = r11.j(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            androidx.datastore.preferences.protobuf.h0 r5 = androidx.datastore.preferences.protobuf.i0.f2444b
            double r9 = r5.d(r7, r12)
            long r9 = java.lang.Double.doubleToLongBits(r9)
            double r5 = r5.d(r7, r13)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x003d
        L_0x01ee:
            if (r4 != 0) goto L_0x01f1
            return r2
        L_0x01f1:
            int r3 = r3 + 3
            goto L_0x0005
        L_0x01f5:
            androidx.datastore.preferences.protobuf.d0 r0 = r11.f2374l
            r0.getClass()
            androidx.datastore.preferences.protobuf.c0 r12 = r12.unknownFields
            androidx.datastore.preferences.protobuf.w r13 = (androidx.datastore.preferences.protobuf.C0118w) r13
            androidx.datastore.preferences.protobuf.c0 r13 = r13.unknownFields
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0207
            return r2
        L_0x0207:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.i(androidx.datastore.preferences.protobuf.w, java.lang.Object):boolean");
    }

    public final boolean j(C0118w wVar, Object obj, int i3) {
        if (n(i3, wVar) == n(i3, obj)) {
            return true;
        }
        return false;
    }

    public final void k(int i3, Object obj, Object obj2) {
        int i4 = this.f2363a[i3];
        if (i0.f2444b.h((long) (M(i3) & 1048575), obj) != null) {
            l(i3);
        }
    }

    public final void l(int i3) {
        if (this.f2364b[((i3 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final W m(int i3) {
        int i4 = (i3 / 3) * 2;
        Object[] objArr = this.f2364b;
        W w3 = (W) objArr[i4];
        if (w3 != null) {
            return w3;
        }
        W a2 = T.f2381c.a((Class) objArr[i4 + 1]);
        objArr[i4] = a2;
        return a2;
    }

    public final boolean n(int i3, Object obj) {
        int i4 = this.f2363a[i3 + 2];
        long j3 = (long) (i4 & 1048575);
        if (j3 == 1048575) {
            int M3 = M(i3);
            long j4 = (long) (M3 & 1048575);
            switch (L(M3)) {
                case 0:
                    if (Double.doubleToRawLongBits(i0.f2444b.d(j4, obj)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(i0.f2444b.e(j4, obj)) != 0) {
                        return true;
                    }
                    return false;
                case k.FLOAT_FIELD_NUMBER:
                    if (i0.f2444b.g(j4, obj) != 0) {
                        return true;
                    }
                    return false;
                case k.INTEGER_FIELD_NUMBER:
                    if (i0.f2444b.g(j4, obj) != 0) {
                        return true;
                    }
                    return false;
                case k.LONG_FIELD_NUMBER:
                    if (i0.f2444b.f(j4, obj) != 0) {
                        return true;
                    }
                    return false;
                case k.STRING_FIELD_NUMBER:
                    if (i0.f2444b.g(j4, obj) != 0) {
                        return true;
                    }
                    return false;
                case k.STRING_SET_FIELD_NUMBER:
                    if (i0.f2444b.f(j4, obj) != 0) {
                        return true;
                    }
                    return false;
                case k.DOUBLE_FIELD_NUMBER:
                    return i0.f2444b.c(j4, obj);
                case k.BYTES_FIELD_NUMBER:
                    Object h3 = i0.f2444b.h(j4, obj);
                    if (h3 instanceof String) {
                        return !((String) h3).isEmpty();
                    }
                    if (h3 instanceof C0103g) {
                        return !C0103g.f2423h.equals(h3);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (i0.f2444b.h(j4, obj) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    return !C0103g.f2423h.equals(i0.f2444b.h(j4, obj));
                case 11:
                    if (i0.f2444b.f(j4, obj) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (i0.f2444b.f(j4, obj) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (i0.f2444b.f(j4, obj) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (i0.f2444b.g(j4, obj) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (i0.f2444b.f(j4, obj) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (i0.f2444b.g(j4, obj) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (i0.f2444b.h(j4, obj) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i4 >>> 20)) & i0.f2444b.f(j3, obj)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean o(Object obj, int i3, int i4, int i5, int i6) {
        if (i4 == 1048575) {
            return n(i3, obj);
        }
        if ((i5 & i6) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q(Object obj, int i3, int i4) {
        if (i0.f2444b.f((long) (this.f2363a[i4 + 2] & 1048575), obj) == i3) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: androidx.datastore.preferences.protobuf.W} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: androidx.datastore.preferences.protobuf.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: androidx.datastore.preferences.protobuf.W} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: androidx.datastore.preferences.protobuf.W} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: androidx.datastore.preferences.protobuf.W} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: androidx.datastore.preferences.protobuf.W} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: androidx.datastore.preferences.protobuf.W} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: androidx.datastore.preferences.protobuf.W} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: androidx.datastore.preferences.protobuf.W} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: androidx.datastore.preferences.protobuf.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: androidx.datastore.preferences.protobuf.W} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: androidx.datastore.preferences.protobuf.W} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: androidx.datastore.preferences.protobuf.W} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: androidx.datastore.preferences.protobuf.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: androidx.datastore.preferences.protobuf.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: androidx.datastore.preferences.protobuf.W} */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:69|68|66|126|127|(1:129)|130|(5:147|132|(1:134)|154|(2:136|162)(1:163))|137|150|144) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
        r18 = r14;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x025d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:126:0x0644 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0649 A[Catch:{ all -> 0x025d }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0670 A[LOOP:5: B:139:0x066e->B:140:0x0670, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x067a  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0654 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(androidx.datastore.preferences.protobuf.d0 r20, java.lang.Object r21, androidx.datastore.preferences.protobuf.C0107k r22, androidx.datastore.preferences.protobuf.C0111o r23) {
        /*
            r19 = this;
            r8 = r19
            r9 = r20
            r10 = r21
            r0 = r22
            r11 = r23
            int[] r12 = r8.f2369g
            int r13 = r8.f2371i
            int r14 = r8.f2370h
            r1 = 0
            r15 = r1
        L_0x0012:
            int r1 = r22.a()     // Catch:{ all -> 0x00b0 }
            int r7 = r8.B(r1)     // Catch:{ all -> 0x00b0 }
            r6 = 0
            if (r7 >= 0) goto L_0x005f
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0037
        L_0x0022:
            if (r14 >= r13) goto L_0x002c
            r0 = r12[r14]
            r8.k(r0, r10, r15)
            int r14 = r14 + 1
            goto L_0x0022
        L_0x002c:
            if (r15 == 0) goto L_0x0036
            r20.getClass()
            r0 = r10
            androidx.datastore.preferences.protobuf.w r0 = (androidx.datastore.preferences.protobuf.C0118w) r0
            r0.unknownFields = r15
        L_0x0036:
            return
        L_0x0037:
            r20.getClass()     // Catch:{ all -> 0x00b0 }
            if (r15 != 0) goto L_0x0046
            androidx.datastore.preferences.protobuf.c0 r1 = androidx.datastore.preferences.protobuf.d0.a(r21)     // Catch:{ all -> 0x00b0 }
            r15 = r1
            goto L_0x0046
        L_0x0042:
            r18 = r14
            goto L_0x066c
        L_0x0046:
            boolean r1 = androidx.datastore.preferences.protobuf.d0.c(r6, r0, r15)     // Catch:{ all -> 0x00b0 }
            if (r1 == 0) goto L_0x004d
            goto L_0x0012
        L_0x004d:
            if (r14 >= r13) goto L_0x0057
            r0 = r12[r14]
            r8.k(r0, r10, r15)
            int r14 = r14 + 1
            goto L_0x004d
        L_0x0057:
            if (r15 == 0) goto L_0x005e
            r0 = r10
            androidx.datastore.preferences.protobuf.w r0 = (androidx.datastore.preferences.protobuf.C0118w) r0
            r0.unknownFields = r15
        L_0x005e:
            return
        L_0x005f:
            int r3 = r8.M(r7)     // Catch:{ all -> 0x00b0 }
            int r2 = L(r3)     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.j r4 = r0.f2452a
            androidx.datastore.preferences.protobuf.C r5 = r8.f2373k
            switch(r2) {
                case 0: goto L_0x0627;
                case 1: goto L_0x060f;
                case 2: goto L_0x05fa;
                case 3: goto L_0x05e4;
                case 4: goto L_0x05ce;
                case 5: goto L_0x05b7;
                case 6: goto L_0x05a0;
                case 7: goto L_0x0588;
                case 8: goto L_0x057d;
                case 9: goto L_0x0564;
                case 10: goto L_0x0551;
                case 11: goto L_0x053b;
                case 12: goto L_0x0522;
                case 13: goto L_0x050b;
                case 14: goto L_0x04f4;
                case 15: goto L_0x04de;
                case 16: goto L_0x04c8;
                case 17: goto L_0x04af;
                case 18: goto L_0x049c;
                case 19: goto L_0x0489;
                case 20: goto L_0x0476;
                case 21: goto L_0x0463;
                case 22: goto L_0x0450;
                case 23: goto L_0x043d;
                case 24: goto L_0x042a;
                case 25: goto L_0x0417;
                case 26: goto L_0x040f;
                case 27: goto L_0x03fb;
                case 28: goto L_0x03e8;
                case 29: goto L_0x03d5;
                case 30: goto L_0x03bc;
                case 31: goto L_0x03a9;
                case 32: goto L_0x0396;
                case 33: goto L_0x0383;
                case 34: goto L_0x0370;
                case 35: goto L_0x035d;
                case 36: goto L_0x034a;
                case 37: goto L_0x0337;
                case 38: goto L_0x0324;
                case 39: goto L_0x0311;
                case 40: goto L_0x02fe;
                case 41: goto L_0x02eb;
                case 42: goto L_0x02d8;
                case 43: goto L_0x02c5;
                case 44: goto L_0x02ac;
                case 45: goto L_0x0299;
                case 46: goto L_0x0286;
                case 47: goto L_0x0273;
                case 48: goto L_0x0260;
                case 49: goto L_0x0244;
                case 50: goto L_0x0226;
                case 51: goto L_0x020e;
                case 52: goto L_0x01f6;
                case 53: goto L_0x01df;
                case 54: goto L_0x01c8;
                case 55: goto L_0x01b1;
                case 56: goto L_0x0199;
                case 57: goto L_0x0181;
                case 58: goto L_0x016a;
                case 59: goto L_0x0162;
                case 60: goto L_0x014c;
                case 61: goto L_0x013c;
                case 62: goto L_0x0125;
                case 63: goto L_0x010c;
                case 64: goto L_0x00f5;
                case 65: goto L_0x00de;
                case 66: goto L_0x00c8;
                case 67: goto L_0x00b2;
                case 68: goto L_0x0098;
                default: goto L_0x006e;
            }
        L_0x006e:
            if (r15 != 0) goto L_0x007d
            r20.getClass()     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.c0 r15 = androidx.datastore.preferences.protobuf.d0.a(r21)     // Catch:{ z -> 0x0078 }
            goto L_0x007d
        L_0x0078:
            r18 = r14
            r14 = r6
            goto L_0x0644
        L_0x007d:
            r20.getClass()     // Catch:{ z -> 0x0078 }
            boolean r1 = androidx.datastore.preferences.protobuf.d0.c(r6, r0, r15)     // Catch:{ z -> 0x0078 }
            if (r1 != 0) goto L_0x00ac
        L_0x0086:
            if (r14 >= r13) goto L_0x0090
            r0 = r12[r14]
            r8.k(r0, r10, r15)
            int r14 = r14 + 1
            goto L_0x0086
        L_0x0090:
            if (r15 == 0) goto L_0x0097
            r0 = r10
            androidx.datastore.preferences.protobuf.w r0 = (androidx.datastore.preferences.protobuf.C0118w) r0
            r0.unknownFields = r15
        L_0x0097:
            return
        L_0x0098:
            java.lang.Object r2 = r8.w(r10, r1, r7)     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.a r2 = (androidx.datastore.preferences.protobuf.C0097a) r2     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.W r3 = r8.m(r7)     // Catch:{ z -> 0x0078 }
            r4 = 3
            r0.w(r4)     // Catch:{ z -> 0x0078 }
            r0.b(r2, r3, r11)     // Catch:{ z -> 0x0078 }
            r8.K(r10, r1, r7, r2)     // Catch:{ z -> 0x0078 }
        L_0x00ac:
            r18 = r14
            goto L_0x0668
        L_0x00b0:
            r0 = move-exception
            goto L_0x0042
        L_0x00b2:
            long r2 = y(r3)     // Catch:{ z -> 0x0078 }
            r0.w(r6)     // Catch:{ z -> 0x0078 }
            long r4 = r4.r()     // Catch:{ z -> 0x0078 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.i0.o(r2, r10, r4)     // Catch:{ z -> 0x0078 }
            r8.I(r10, r1, r7)     // Catch:{ z -> 0x0078 }
            goto L_0x00ac
        L_0x00c8:
            long r2 = y(r3)     // Catch:{ z -> 0x0078 }
            r0.w(r6)     // Catch:{ z -> 0x0078 }
            int r4 = r4.q()     // Catch:{ z -> 0x0078 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.i0.o(r2, r10, r4)     // Catch:{ z -> 0x0078 }
            r8.I(r10, r1, r7)     // Catch:{ z -> 0x0078 }
            goto L_0x00ac
        L_0x00de:
            long r2 = y(r3)     // Catch:{ z -> 0x0078 }
            r5 = 1
            r0.w(r5)     // Catch:{ z -> 0x0078 }
            long r4 = r4.p()     // Catch:{ z -> 0x0078 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.i0.o(r2, r10, r4)     // Catch:{ z -> 0x0078 }
            r8.I(r10, r1, r7)     // Catch:{ z -> 0x0078 }
            goto L_0x00ac
        L_0x00f5:
            long r2 = y(r3)     // Catch:{ z -> 0x0078 }
            r5 = 5
            r0.w(r5)     // Catch:{ z -> 0x0078 }
            int r4 = r4.o()     // Catch:{ z -> 0x0078 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.i0.o(r2, r10, r4)     // Catch:{ z -> 0x0078 }
            r8.I(r10, r1, r7)     // Catch:{ z -> 0x0078 }
            goto L_0x00ac
        L_0x010c:
            r0.w(r6)     // Catch:{ z -> 0x0078 }
            int r2 = r4.i()     // Catch:{ z -> 0x0078 }
            r8.l(r7)     // Catch:{ z -> 0x0078 }
            long r3 = y(r3)     // Catch:{ z -> 0x0078 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.i0.o(r3, r10, r2)     // Catch:{ z -> 0x0078 }
            r8.I(r10, r1, r7)     // Catch:{ z -> 0x0078 }
            goto L_0x00ac
        L_0x0125:
            long r2 = y(r3)     // Catch:{ z -> 0x0078 }
            r0.w(r6)     // Catch:{ z -> 0x0078 }
            int r4 = r4.v()     // Catch:{ z -> 0x0078 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.i0.o(r2, r10, r4)     // Catch:{ z -> 0x0078 }
            r8.I(r10, r1, r7)     // Catch:{ z -> 0x0078 }
            goto L_0x00ac
        L_0x013c:
            long r2 = y(r3)     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.g r4 = r22.e()     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.i0.o(r2, r10, r4)     // Catch:{ z -> 0x0078 }
            r8.I(r10, r1, r7)     // Catch:{ z -> 0x0078 }
            goto L_0x00ac
        L_0x014c:
            java.lang.Object r2 = r8.w(r10, r1, r7)     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.a r2 = (androidx.datastore.preferences.protobuf.C0097a) r2     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.W r3 = r8.m(r7)     // Catch:{ z -> 0x0078 }
            r4 = 2
            r0.w(r4)     // Catch:{ z -> 0x0078 }
            r0.c(r2, r3, r11)     // Catch:{ z -> 0x0078 }
            r8.K(r10, r1, r7, r2)     // Catch:{ z -> 0x0078 }
            goto L_0x00ac
        L_0x0162:
            r8.E(r3, r0, r10)     // Catch:{ z -> 0x0078 }
            r8.I(r10, r1, r7)     // Catch:{ z -> 0x0078 }
            goto L_0x00ac
        L_0x016a:
            long r2 = y(r3)     // Catch:{ z -> 0x0078 }
            r0.w(r6)     // Catch:{ z -> 0x0078 }
            boolean r4 = r4.f()     // Catch:{ z -> 0x0078 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.i0.o(r2, r10, r4)     // Catch:{ z -> 0x0078 }
            r8.I(r10, r1, r7)     // Catch:{ z -> 0x0078 }
            goto L_0x00ac
        L_0x0181:
            long r2 = y(r3)     // Catch:{ z -> 0x0078 }
            r5 = 5
            r0.w(r5)     // Catch:{ z -> 0x0078 }
            int r4 = r4.j()     // Catch:{ z -> 0x0078 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.i0.o(r2, r10, r4)     // Catch:{ z -> 0x0078 }
            r8.I(r10, r1, r7)     // Catch:{ z -> 0x0078 }
            goto L_0x00ac
        L_0x0199:
            long r2 = y(r3)     // Catch:{ z -> 0x0078 }
            r5 = 1
            r0.w(r5)     // Catch:{ z -> 0x0078 }
            long r4 = r4.k()     // Catch:{ z -> 0x0078 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.i0.o(r2, r10, r4)     // Catch:{ z -> 0x0078 }
            r8.I(r10, r1, r7)     // Catch:{ z -> 0x0078 }
            goto L_0x00ac
        L_0x01b1:
            long r2 = y(r3)     // Catch:{ z -> 0x0078 }
            r0.w(r6)     // Catch:{ z -> 0x0078 }
            int r4 = r4.m()     // Catch:{ z -> 0x0078 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.i0.o(r2, r10, r4)     // Catch:{ z -> 0x0078 }
            r8.I(r10, r1, r7)     // Catch:{ z -> 0x0078 }
            goto L_0x00ac
        L_0x01c8:
            long r2 = y(r3)     // Catch:{ z -> 0x0078 }
            r0.w(r6)     // Catch:{ z -> 0x0078 }
            long r4 = r4.w()     // Catch:{ z -> 0x0078 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.i0.o(r2, r10, r4)     // Catch:{ z -> 0x0078 }
            r8.I(r10, r1, r7)     // Catch:{ z -> 0x0078 }
            goto L_0x00ac
        L_0x01df:
            long r2 = y(r3)     // Catch:{ z -> 0x0078 }
            r0.w(r6)     // Catch:{ z -> 0x0078 }
            long r4 = r4.n()     // Catch:{ z -> 0x0078 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.i0.o(r2, r10, r4)     // Catch:{ z -> 0x0078 }
            r8.I(r10, r1, r7)     // Catch:{ z -> 0x0078 }
            goto L_0x00ac
        L_0x01f6:
            long r2 = y(r3)     // Catch:{ z -> 0x0078 }
            r5 = 5
            r0.w(r5)     // Catch:{ z -> 0x0078 }
            float r4 = r4.l()     // Catch:{ z -> 0x0078 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.i0.o(r2, r10, r4)     // Catch:{ z -> 0x0078 }
            r8.I(r10, r1, r7)     // Catch:{ z -> 0x0078 }
            goto L_0x00ac
        L_0x020e:
            long r2 = y(r3)     // Catch:{ z -> 0x0078 }
            r5 = 1
            r0.w(r5)     // Catch:{ z -> 0x0078 }
            double r4 = r4.h()     // Catch:{ z -> 0x0078 }
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.i0.o(r2, r10, r4)     // Catch:{ z -> 0x0078 }
            r8.I(r10, r1, r7)     // Catch:{ z -> 0x0078 }
            goto L_0x00ac
        L_0x0226:
            int r1 = r7 / 3
            r2 = 2
            int r1 = r1 * r2
            java.lang.Object[] r2 = r8.f2364b     // Catch:{ z -> 0x0242 }
            r4 = r2[r1]     // Catch:{ z -> 0x0242 }
            r1 = r19
            r2 = r21
            r3 = r7
            r5 = r23
            r7 = r6
            r6 = r22
            r1.s(r2, r3, r4, r5, r6)     // Catch:{ z -> 0x023d }
            goto L_0x00ac
        L_0x023d:
            r18 = r14
            r14 = r7
            goto L_0x0644
        L_0x0242:
            r7 = r6
            goto L_0x023d
        L_0x0244:
            long r3 = y(r3)     // Catch:{ z -> 0x0078 }
            androidx.datastore.preferences.protobuf.W r7 = r8.m(r7)     // Catch:{ z -> 0x0078 }
            r1 = r19
            r2 = r21
            r5 = r22
            r18 = r14
            r14 = r6
            r6 = r7
            r7 = r23
            r1.C(r2, r3, r5, r6, r7)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x025d:
            r0 = move-exception
            goto L_0x066c
        L_0x0260:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.r(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x0273:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.q(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x0286:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.p(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x0299:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.o(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x02ac:
            r18 = r14
            r14 = r6
            long r2 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r2 = androidx.datastore.preferences.protobuf.C.b(r2, r10)     // Catch:{ z -> 0x0644 }
            r0.h(r2)     // Catch:{ z -> 0x0644 }
            r8.l(r7)     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.X.z(r10, r1, r2, r15, r9)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x02c5:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.t(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x02d8:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.d(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x02eb:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.j(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x02fe:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.k(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x0311:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.m(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x0324:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.u(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x0337:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.n(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x034a:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.l(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x035d:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.g(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x0370:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.r(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x0383:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.q(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x0396:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.p(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x03a9:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.o(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x03bc:
            r18 = r14
            r14 = r6
            long r2 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r2 = androidx.datastore.preferences.protobuf.C.b(r2, r10)     // Catch:{ z -> 0x0644 }
            r0.h(r2)     // Catch:{ z -> 0x0644 }
            r8.l(r7)     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.X.z(r10, r1, r2, r15, r9)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x03d5:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.t(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x03e8:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.f(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x03fb:
            r18 = r14
            r14 = r6
            androidx.datastore.preferences.protobuf.W r5 = r8.m(r7)     // Catch:{ z -> 0x0644 }
            r1 = r19
            r2 = r21
            r4 = r22
            r6 = r23
            r1.D(r2, r3, r4, r5, r6)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x040f:
            r18 = r14
            r14 = r6
            r8.F(r3, r0, r10)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x0417:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.d(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x042a:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.j(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x043d:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.k(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x0450:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.m(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x0463:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.u(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x0476:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.n(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x0489:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.l(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x049c:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r5.getClass()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.x r1 = androidx.datastore.preferences.protobuf.C.b(r1, r10)     // Catch:{ z -> 0x0644 }
            r0.g(r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x04af:
            r18 = r14
            r14 = r6
            java.lang.Object r1 = r8.v(r7, r10)     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.a r1 = (androidx.datastore.preferences.protobuf.C0097a) r1     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.W r2 = r8.m(r7)     // Catch:{ z -> 0x0644 }
            r3 = 3
            r0.w(r3)     // Catch:{ z -> 0x0644 }
            r0.b(r1, r2, r11)     // Catch:{ z -> 0x0644 }
            r8.J(r10, r7, r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x04c8:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r0.w(r14)     // Catch:{ z -> 0x0644 }
            long r3 = r4.r()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.i0.n(r10, r1, r3)     // Catch:{ z -> 0x0644 }
            r8.H(r7, r10)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x04de:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r0.w(r14)     // Catch:{ z -> 0x0644 }
            int r3 = r4.q()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.i0.m(r10, r1, r3)     // Catch:{ z -> 0x0644 }
            r8.H(r7, r10)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x04f4:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r3 = 1
            r0.w(r3)     // Catch:{ z -> 0x0644 }
            long r3 = r4.p()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.i0.n(r10, r1, r3)     // Catch:{ z -> 0x0644 }
            r8.H(r7, r10)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x050b:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r3 = 5
            r0.w(r3)     // Catch:{ z -> 0x0644 }
            int r3 = r4.o()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.i0.m(r10, r1, r3)     // Catch:{ z -> 0x0644 }
            r8.H(r7, r10)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x0522:
            r18 = r14
            r14 = r6
            r0.w(r14)     // Catch:{ z -> 0x0644 }
            int r1 = r4.i()     // Catch:{ z -> 0x0644 }
            r8.l(r7)     // Catch:{ z -> 0x0644 }
            long r2 = y(r3)     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.i0.m(r10, r2, r1)     // Catch:{ z -> 0x0644 }
            r8.H(r7, r10)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x053b:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r0.w(r14)     // Catch:{ z -> 0x0644 }
            int r3 = r4.v()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.i0.m(r10, r1, r3)     // Catch:{ z -> 0x0644 }
            r8.H(r7, r10)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x0551:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.g r3 = r22.e()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.i0.o(r1, r10, r3)     // Catch:{ z -> 0x0644 }
            r8.H(r7, r10)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x0564:
            r18 = r14
            r14 = r6
            java.lang.Object r1 = r8.v(r7, r10)     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.a r1 = (androidx.datastore.preferences.protobuf.C0097a) r1     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.W r2 = r8.m(r7)     // Catch:{ z -> 0x0644 }
            r3 = 2
            r0.w(r3)     // Catch:{ z -> 0x0644 }
            r0.c(r1, r2, r11)     // Catch:{ z -> 0x0644 }
            r8.J(r10, r7, r1)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x057d:
            r18 = r14
            r14 = r6
            r8.E(r3, r0, r10)     // Catch:{ z -> 0x0644 }
            r8.H(r7, r10)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x0588:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r0.w(r14)     // Catch:{ z -> 0x0644 }
            boolean r3 = r4.f()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b     // Catch:{ z -> 0x0644 }
            r4.j(r10, r1, r3)     // Catch:{ z -> 0x0644 }
            r8.H(r7, r10)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x05a0:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r3 = 5
            r0.w(r3)     // Catch:{ z -> 0x0644 }
            int r3 = r4.j()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.i0.m(r10, r1, r3)     // Catch:{ z -> 0x0644 }
            r8.H(r7, r10)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x05b7:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r3 = 1
            r0.w(r3)     // Catch:{ z -> 0x0644 }
            long r3 = r4.k()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.i0.n(r10, r1, r3)     // Catch:{ z -> 0x0644 }
            r8.H(r7, r10)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x05ce:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r0.w(r14)     // Catch:{ z -> 0x0644 }
            int r3 = r4.m()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.i0.m(r10, r1, r3)     // Catch:{ z -> 0x0644 }
            r8.H(r7, r10)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x05e4:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r0.w(r14)     // Catch:{ z -> 0x0644 }
            long r3 = r4.w()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.i0.n(r10, r1, r3)     // Catch:{ z -> 0x0644 }
            r8.H(r7, r10)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x05fa:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r0.w(r14)     // Catch:{ z -> 0x0644 }
            long r3 = r4.n()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.i0.n(r10, r1, r3)     // Catch:{ z -> 0x0644 }
            r8.H(r7, r10)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x060f:
            r18 = r14
            r14 = r6
            long r1 = y(r3)     // Catch:{ z -> 0x0644 }
            r3 = 5
            r0.w(r3)     // Catch:{ z -> 0x0644 }
            float r3 = r4.l()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.h0 r4 = androidx.datastore.preferences.protobuf.i0.f2444b     // Catch:{ z -> 0x0644 }
            r4.m(r10, r1, r3)     // Catch:{ z -> 0x0644 }
            r8.H(r7, r10)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x0627:
            r18 = r14
            r14 = r6
            long r5 = y(r3)     // Catch:{ z -> 0x0644 }
            r1 = 1
            r0.w(r1)     // Catch:{ z -> 0x0644 }
            double r16 = r4.h()     // Catch:{ z -> 0x0644 }
            androidx.datastore.preferences.protobuf.h0 r1 = androidx.datastore.preferences.protobuf.i0.f2444b     // Catch:{ z -> 0x0644 }
            r2 = r21
            r3 = r5
            r5 = r16
            r1.l(r2, r3, r5)     // Catch:{ z -> 0x0644 }
            r8.H(r7, r10)     // Catch:{ z -> 0x0644 }
            goto L_0x0668
        L_0x0644:
            r20.getClass()     // Catch:{ all -> 0x025d }
            if (r15 != 0) goto L_0x064e
            androidx.datastore.preferences.protobuf.c0 r1 = androidx.datastore.preferences.protobuf.d0.a(r21)     // Catch:{ all -> 0x025d }
            r15 = r1
        L_0x064e:
            boolean r1 = androidx.datastore.preferences.protobuf.d0.c(r14, r0, r15)     // Catch:{ all -> 0x025d }
            if (r1 != 0) goto L_0x0668
            r14 = r18
        L_0x0656:
            if (r14 >= r13) goto L_0x0660
            r0 = r12[r14]
            r8.k(r0, r10, r15)
            int r14 = r14 + 1
            goto L_0x0656
        L_0x0660:
            if (r15 == 0) goto L_0x0667
            r0 = r10
            androidx.datastore.preferences.protobuf.w r0 = (androidx.datastore.preferences.protobuf.C0118w) r0
            r0.unknownFields = r15
        L_0x0667:
            return
        L_0x0668:
            r14 = r18
            goto L_0x0012
        L_0x066c:
            r14 = r18
        L_0x066e:
            if (r14 >= r13) goto L_0x0678
            r1 = r12[r14]
            r8.k(r1, r10, r15)
            int r14 = r14 + 1
            goto L_0x066e
        L_0x0678:
            if (r15 == 0) goto L_0x0682
            r20.getClass()
            r1 = r10
            androidx.datastore.preferences.protobuf.w r1 = (androidx.datastore.preferences.protobuf.C0118w) r1
            r1.unknownFields = r15
        L_0x0682:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.r(androidx.datastore.preferences.protobuf.d0, java.lang.Object, androidx.datastore.preferences.protobuf.k, androidx.datastore.preferences.protobuf.o):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r13.x() != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        throw new java.io.IOException(r7);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x008c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(java.lang.Object r9, int r10, java.lang.Object r11, androidx.datastore.preferences.protobuf.C0111o r12, androidx.datastore.preferences.protobuf.C0107k r13) {
        /*
            r8 = this;
            int r10 = r8.M(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            androidx.datastore.preferences.protobuf.h0 r10 = androidx.datastore.preferences.protobuf.i0.f2444b
            java.lang.Object r10 = r10.h(r0, r9)
            androidx.datastore.preferences.protobuf.J r2 = r8.f2375m
            if (r10 != 0) goto L_0x0020
            r2.getClass()
            androidx.datastore.preferences.protobuf.I r10 = androidx.datastore.preferences.protobuf.I.f2356g
            androidx.datastore.preferences.protobuf.I r10 = r10.b()
            androidx.datastore.preferences.protobuf.i0.o(r0, r9, r10)
            goto L_0x0037
        L_0x0020:
            r2.getClass()
            r3 = r10
            androidx.datastore.preferences.protobuf.I r3 = (androidx.datastore.preferences.protobuf.I) r3
            boolean r3 = r3.f2357f
            if (r3 != 0) goto L_0x0037
            androidx.datastore.preferences.protobuf.I r3 = androidx.datastore.preferences.protobuf.I.f2356g
            androidx.datastore.preferences.protobuf.I r3 = r3.b()
            androidx.datastore.preferences.protobuf.J.b(r3, r10)
            androidx.datastore.preferences.protobuf.i0.o(r0, r9, r3)
            r10 = r3
        L_0x0037:
            r2.getClass()
            androidx.datastore.preferences.protobuf.I r10 = (androidx.datastore.preferences.protobuf.I) r10
            androidx.datastore.preferences.protobuf.H r11 = (androidx.datastore.preferences.protobuf.H) r11
            androidx.datastore.preferences.protobuf.G r9 = r11.f2355a
            r11 = 2
            r13.w(r11)
            androidx.datastore.preferences.protobuf.j r0 = r13.f2452a
            int r1 = r0.v()
            int r1 = r0.e(r1)
            java.lang.String r2 = ""
            L.k r3 = r9.f2354c
            r4 = r3
        L_0x0053:
            int r5 = r13.a()     // Catch:{ all -> 0x0077 }
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L_0x0099
            boolean r6 = r0.c()     // Catch:{ all -> 0x0077 }
            if (r6 == 0) goto L_0x0063
            goto L_0x0099
        L_0x0063:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L_0x0084
            if (r5 == r11) goto L_0x0079
            boolean r5 = r13.x()     // Catch:{ z -> 0x008c }
            if (r5 == 0) goto L_0x0071
            goto L_0x0053
        L_0x0071:
            androidx.datastore.preferences.protobuf.A r5 = new androidx.datastore.preferences.protobuf.A     // Catch:{ z -> 0x008c }
            r5.<init>(r7)     // Catch:{ z -> 0x008c }
            throw r5     // Catch:{ z -> 0x008c }
        L_0x0077:
            r9 = move-exception
            goto L_0x00a0
        L_0x0079:
            androidx.datastore.preferences.protobuf.o0 r5 = r9.f2353b     // Catch:{ z -> 0x008c }
            java.lang.Class r6 = r3.getClass()     // Catch:{ z -> 0x008c }
            java.lang.Object r4 = r13.i(r5, r6, r12)     // Catch:{ z -> 0x008c }
            goto L_0x0053
        L_0x0084:
            androidx.datastore.preferences.protobuf.m0 r5 = r9.f2352a     // Catch:{ z -> 0x008c }
            r6 = 0
            java.lang.Object r2 = r13.i(r5, r6, r6)     // Catch:{ z -> 0x008c }
            goto L_0x0053
        L_0x008c:
            boolean r5 = r13.x()     // Catch:{ all -> 0x0077 }
            if (r5 == 0) goto L_0x0093
            goto L_0x0053
        L_0x0093:
            androidx.datastore.preferences.protobuf.A r9 = new androidx.datastore.preferences.protobuf.A     // Catch:{ all -> 0x0077 }
            r9.<init>(r7)     // Catch:{ all -> 0x0077 }
            throw r9     // Catch:{ all -> 0x0077 }
        L_0x0099:
            r10.put(r2, r4)     // Catch:{ all -> 0x0077 }
            r0.d(r1)
            return
        L_0x00a0:
            r0.d(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.s(java.lang.Object, int, java.lang.Object, androidx.datastore.preferences.protobuf.o, androidx.datastore.preferences.protobuf.k):void");
    }

    public final void t(int i3, Object obj, Object obj2) {
        if (n(i3, obj2)) {
            long M3 = (long) (M(i3) & 1048575);
            Unsafe unsafe = f2362o;
            Object object = unsafe.getObject(obj2, M3);
            if (object != null) {
                W m3 = m(i3);
                if (!n(i3, obj)) {
                    if (!p(object)) {
                        unsafe.putObject(obj, M3, object);
                    } else {
                        C0118w g2 = m3.g();
                        m3.c(g2, object);
                        unsafe.putObject(obj, M3, g2);
                    }
                    H(i3, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, M3);
                if (!p(object2)) {
                    C0118w g3 = m3.g();
                    m3.c(g3, object2);
                    unsafe.putObject(obj, M3, g3);
                    object2 = g3;
                }
                m3.c(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.f2363a[i3] + " is present but null: " + obj2);
        }
    }

    public final void u(int i3, Object obj, Object obj2) {
        int[] iArr = this.f2363a;
        int i4 = iArr[i3];
        if (q(obj2, i4, i3)) {
            long M3 = (long) (M(i3) & 1048575);
            Unsafe unsafe = f2362o;
            Object object = unsafe.getObject(obj2, M3);
            if (object != null) {
                W m3 = m(i3);
                if (!q(obj, i4, i3)) {
                    if (!p(object)) {
                        unsafe.putObject(obj, M3, object);
                    } else {
                        C0118w g2 = m3.g();
                        m3.c(g2, object);
                        unsafe.putObject(obj, M3, g2);
                    }
                    I(obj, i4, i3);
                    return;
                }
                Object object2 = unsafe.getObject(obj, M3);
                if (!p(object2)) {
                    C0118w g3 = m3.g();
                    m3.c(g3, object2);
                    unsafe.putObject(obj, M3, g3);
                    object2 = g3;
                }
                m3.c(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + iArr[i3] + " is present but null: " + obj2);
        }
    }

    public final Object v(int i3, Object obj) {
        W m3 = m(i3);
        long M3 = (long) (M(i3) & 1048575);
        if (!n(i3, obj)) {
            return m3.g();
        }
        Object object = f2362o.getObject(obj, M3);
        if (p(object)) {
            return object;
        }
        C0118w g2 = m3.g();
        if (object != null) {
            m3.c(g2, object);
        }
        return g2;
    }

    public final Object w(Object obj, int i3, int i4) {
        W m3 = m(i4);
        if (!q(obj, i3, i4)) {
            return m3.g();
        }
        Object object = f2362o.getObject(obj, (long) (M(i4) & 1048575));
        if (p(object)) {
            return object;
        }
        C0118w g2 = m3.g();
        if (object != null) {
            m3.c(g2, object);
        }
        return g2;
    }
}
