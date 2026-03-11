package z1;

import B1.b;
import c2.n;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import w1.C0502a;
import w1.g;
import w1.s;
import y1.f;

public final class o implements s {

    /* renamed from: f  reason: collision with root package name */
    public final n f4920f;

    /* renamed from: g  reason: collision with root package name */
    public final g f4921g;

    /* renamed from: h  reason: collision with root package name */
    public final f f4922h;

    /* renamed from: i  reason: collision with root package name */
    public final C0526b f4923i;

    /* renamed from: j  reason: collision with root package name */
    public final b f4924j = b.f103a;

    public o(n nVar, f fVar, C0526b bVar) {
        C0502a aVar = g.f4728f;
        this.f4920f = nVar;
        this.f4921g = aVar;
        this.f4922h = fVar;
        this.f4923i = bVar;
    }

    public final boolean a(Field field, boolean z3) {
        List list;
        Class<?> type = field.getType();
        f fVar = this.f4922h;
        fVar.getClass();
        if (!f.b(type)) {
            fVar.a(z3);
            if ((field.getModifiers() & 136) == 0 && !field.isSynthetic() && !f.b(field.getType())) {
                if (z3) {
                    list = fVar.f4849f;
                } else {
                    list = fVar.f4850g;
                }
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01b1, code lost:
        r27 = r7;
        r6 = new D1.a(y1.d.k(r1, r27, r27.getGenericSuperclass(), new java.util.HashMap()));
        r7 = r6.f220a;
        r0 = r33;
        r11 = r34;
        r12 = r12;
        r8 = r8;
        r9 = r9;
        r10 = r10;
        r13 = r13;
        r15 = r15;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0191 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0175 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final w1.r create(w1.k r34, D1.a r35) {
        /*
            r33 = this;
            r0 = r33
            r11 = r34
            r12 = r35
            java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
            java.lang.Class r1 = r12.f220a
            boolean r2 = r13.isAssignableFrom(r1)
            r14 = 0
            if (r2 != 0) goto L_0x0012
            return r14
        L_0x0012:
            c2.n r15 = r0.f4920f
            y1.m r10 = r15.i(r12)
            z1.n r9 = new z1.n
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            boolean r2 = r1.isInterface()
            if (r2 == 0) goto L_0x002a
        L_0x0025:
            r13 = r8
            r14 = r9
            r15 = r10
            goto L_0x01e0
        L_0x002a:
            r7 = r1
            r6 = r12
        L_0x002c:
            if (r7 == r13) goto L_0x0025
            java.lang.reflect.Field[] r5 = r7.getDeclaredFields()
            int r4 = r5.length
            r3 = 0
            r2 = r3
        L_0x0035:
            java.lang.reflect.Type r1 = r6.f221b
            if (r2 >= r4) goto L_0x01b1
            r14 = r5[r2]
            r16 = r13
            r13 = 1
            boolean r17 = r0.a(r14, r13)
            boolean r18 = r0.a(r14, r3)
            if (r17 != 0) goto L_0x005d
            if (r18 != 0) goto L_0x005d
            r21 = r2
            r19 = r3
            r22 = r4
            r30 = r5
            r31 = r6
            r27 = r7
            r13 = r8
            r14 = r9
            r23 = r15
            r15 = r10
            goto L_0x0175
        L_0x005d:
            B1.b r3 = r0.f4924j
            r3.a(r14)
            java.lang.reflect.Type r3 = r14.getGenericType()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.lang.reflect.Type r13 = y1.d.k(r1, r7, r3, r13)
            java.lang.Class<x1.b> r1 = x1.b.class
            java.lang.annotation.Annotation r1 = r14.getAnnotation(r1)
            x1.b r1 = (x1.b) r1
            if (r1 != 0) goto L_0x008b
            w1.g r1 = r0.f4921g
            java.lang.String r1 = r1.b(r14)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r21 = r2
        L_0x0085:
            r22 = r4
            r20 = 1
            r4 = r1
            goto L_0x00bd
        L_0x008b:
            java.lang.String r3 = r1.value()
            java.lang.String[] r1 = r1.alternate()
            r21 = r2
            int r2 = r1.length
            if (r2 != 0) goto L_0x009d
            java.util.List r1 = java.util.Collections.singletonList(r3)
            goto L_0x0085
        L_0x009d:
            java.util.ArrayList r2 = new java.util.ArrayList
            r22 = r4
            int r4 = r1.length
            r20 = 1
            int r4 = r4 + 1
            r2.<init>(r4)
            r2.add(r3)
            int r3 = r1.length
            r4 = 0
        L_0x00ae:
            if (r4 >= r3) goto L_0x00bc
            r23 = r3
            r3 = r1[r4]
            r2.add(r3)
            int r4 = r4 + 1
            r3 = r23
            goto L_0x00ae
        L_0x00bc:
            r4 = r2
        L_0x00bd:
            int r3 = r4.size()
            r1 = 0
            r2 = 0
        L_0x00c3:
            if (r2 >= r3) goto L_0x0165
            java.lang.Object r23 = r4.get(r2)
            r12 = r23
            java.lang.String r12 = (java.lang.String) r12
            r23 = r9
            if (r2 == 0) goto L_0x00d3
            r17 = 0
        L_0x00d3:
            D1.a r9 = new D1.a
            r9.<init>(r13)
            r24 = r1
            java.lang.Class r1 = r9.f220a
            if (r1 == 0) goto L_0x00e7
            boolean r1 = r1.isPrimitive()
            if (r1 == 0) goto L_0x00e7
            r25 = r20
            goto L_0x00e9
        L_0x00e7:
            r25 = 0
        L_0x00e9:
            java.lang.Class<x1.a> r1 = x1.a.class
            java.lang.annotation.Annotation r1 = r14.getAnnotation(r1)
            x1.a r1 = (x1.a) r1
            r26 = r2
            if (r1 == 0) goto L_0x00ff
            z1.b r2 = r0.f4923i
            r2.getClass()
            w1.r r1 = z1.C0526b.a(r15, r11, r9, r1)
            goto L_0x0100
        L_0x00ff:
            r1 = 0
        L_0x0100:
            if (r1 == 0) goto L_0x0105
            r27 = r20
            goto L_0x0107
        L_0x0105:
            r27 = 0
        L_0x0107:
            if (r1 != 0) goto L_0x010d
            w1.r r1 = r11.c(r9)
        L_0x010d:
            r28 = r1
            z1.m r2 = new z1.m
            r0 = r24
            r1 = r2
            r11 = r2
            r24 = r26
            r2 = r12
            r26 = r3
            r19 = 0
            r3 = r17
            r29 = r4
            r4 = r18
            r30 = r5
            r5 = r14
            r31 = r6
            r6 = r27
            r27 = r7
            r7 = r28
            r28 = r13
            r13 = r8
            r8 = r34
            r32 = r14
            r14 = r23
            r23 = r15
            r15 = r10
            r10 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r13.put(r12, r11)
            z1.m r1 = (z1.m) r1
            if (r0 != 0) goto L_0x0147
            goto L_0x0148
        L_0x0147:
            r1 = r0
        L_0x0148:
            int r2 = r24 + 1
            r0 = r33
            r11 = r34
            r12 = r35
            r8 = r13
            r9 = r14
            r10 = r15
            r15 = r23
            r3 = r26
            r7 = r27
            r13 = r28
            r4 = r29
            r5 = r30
            r6 = r31
            r14 = r32
            goto L_0x00c3
        L_0x0165:
            r0 = r1
            r30 = r5
            r31 = r6
            r27 = r7
            r13 = r8
            r14 = r9
            r23 = r15
            r19 = 0
            r15 = r10
            if (r0 != 0) goto L_0x0191
        L_0x0175:
            int r2 = r21 + 1
            r0 = r33
            r11 = r34
            r12 = r35
            r8 = r13
            r9 = r14
            r10 = r15
            r13 = r16
            r3 = r19
            r4 = r22
            r15 = r23
            r7 = r27
            r5 = r30
            r6 = r31
            r14 = 0
            goto L_0x0035
        L_0x0191:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = r35
            java.lang.reflect.Type r3 = r3.f221b
            r2.append(r3)
            java.lang.String r3 = " declares multiple JSON fields named "
            r2.append(r3)
            java.lang.String r0 = r0.f4909a
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x01b1:
            r27 = r7
            r14 = r9
            r3 = r12
            r16 = r13
            r23 = r15
            r13 = r8
            r15 = r10
            java.lang.reflect.Type r0 = r27.getGenericSuperclass()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r4 = r27
            java.lang.reflect.Type r0 = y1.d.k(r1, r4, r0, r2)
            D1.a r6 = new D1.a
            r6.<init>(r0)
            java.lang.Class r7 = r6.f220a
            r0 = r33
            r11 = r34
            r12 = r3
            r8 = r13
            r9 = r14
            r10 = r15
            r13 = r16
            r15 = r23
            r14 = 0
            goto L_0x002c
        L_0x01e0:
            r14.<init>(r15, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.o.create(w1.k, D1.a):w1.r");
    }
}
