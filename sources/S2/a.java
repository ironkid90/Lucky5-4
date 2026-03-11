package S2;

import A2.h;
import A2.i;
import R2.l;
import R2.p;
import R2.s;
import j1.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import p2.C0363c;
import q2.C0401d;
import q2.o;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f1527a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final LinkedHashMap a(ArrayList arrayList) {
        List<d> list;
        String str = l.f1393g;
        l a2 = e.a("/", false);
        LinkedHashMap linkedHashMap = new LinkedHashMap(o.a0(1));
        o.b0(linkedHashMap, new C0363c[]{new C0363c(a2, new d(a2))});
        e eVar = new e(0);
        if (arrayList.size() <= 1) {
            list = C0401d.h0(arrayList);
        } else {
            Object[] array = arrayList.toArray(new Object[0]);
            i.e(array, "<this>");
            if (array.length > 1) {
                Arrays.sort(array, eVar);
            }
            list = Arrays.asList(array);
            i.d(list, "asList(...)");
        }
        for (d dVar : list) {
            if (((d) linkedHashMap.put(dVar.f1535a, dVar)) == null) {
                while (true) {
                    l lVar = dVar.f1535a;
                    l c3 = lVar.c();
                    if (c3 == null) {
                        break;
                    }
                    d dVar2 = (d) linkedHashMap.get(c3);
                    if (dVar2 != null) {
                        dVar2.f1540f.add(lVar);
                        break;
                    }
                    d dVar3 = new d(c3);
                    linkedHashMap.put(c3, dVar3);
                    dVar3.f1540f.add(lVar);
                    dVar = dVar3;
                }
            }
        }
        return linkedHashMap;
    }

    public static final String b(int i3) {
        android.support.v4.media.session.a.i(16);
        String num = Integer.toString(i3, 16);
        i.d(num, "toString(this, checkRadix(radix))");
        return "0x".concat(num);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: A2.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: A2.n} */
    /* JADX WARNING: type inference failed for: r12v1, types: [java.lang.Object, A2.p] */
    /* JADX WARNING: type inference failed for: r13v1, types: [java.lang.Object, A2.p] */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, A2.p] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final S2.d c(R2.p r23) {
        /*
            r8 = r23
            int r0 = r23.a()
            r1 = 33639248(0x2014b50, float:9.499037E-38)
            if (r0 != r1) goto L_0x015b
            r0 = 4
            r8.g(r0)
            short r0 = r23.c()
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r0 & r1
            r0 = r0 & 1
            if (r0 != 0) goto L_0x0143
            short r0 = r23.c()
            r10 = r0 & r1
            short r0 = r23.c()
            r2 = r0 & r1
            short r3 = r23.c()
            r4 = r3 & r1
            r5 = -1
            r9 = 0
            if (r2 != r5) goto L_0x0036
            r0 = 0
        L_0x0034:
            r11 = r0
            goto L_0x006b
        L_0x0036:
            java.util.GregorianCalendar r5 = new java.util.GregorianCalendar
            r5.<init>()
            r6 = 14
            r5.set(r6, r9)
            int r6 = r4 >> 9
            r6 = r6 & 127(0x7f, float:1.78E-43)
            int r12 = r6 + 1980
            int r4 = r4 >> 5
            r4 = r4 & 15
            r14 = r3 & 31
            int r3 = r2 >> 11
            r15 = r3 & 31
            int r2 = r2 >> 5
            r16 = r2 & 63
            r0 = r0 & 31
            int r17 = r0 << 1
            int r13 = r4 + -1
            r11 = r5
            r11.set(r12, r13, r14, r15, r16, r17)
            java.util.Date r0 = r5.getTime()
            long r2 = r0.getTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L_0x0034
        L_0x006b:
            r23.a()
            A2.p r12 = new A2.p
            r12.<init>()
            int r0 = r23.a()
            long r2 = (long) r0
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            r12.f85f = r2
            A2.p r13 = new A2.p
            r13.<init>()
            int r0 = r23.a()
            long r2 = (long) r0
            long r2 = r2 & r4
            r13.f85f = r2
            short r0 = r23.c()
            r0 = r0 & r1
            short r2 = r23.c()
            r14 = r2 & r1
            short r2 = r23.c()
            r15 = r2 & r1
            r1 = 8
            r8.g(r1)
            A2.p r7 = new A2.p
            r7.<init>()
            int r1 = r23.a()
            long r1 = (long) r1
            long r1 = r1 & r4
            r7.f85f = r1
            long r0 = (long) r0
            java.lang.String r6 = r8.d(r0)
            r0 = 2
            int r0 = H2.l.f0(r6, r9, r9, r0)
            if (r0 >= 0) goto L_0x013b
            long r0 = r13.f85f
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r16 = 0
            r1 = 8
            if (r0 != 0) goto L_0x00ca
            long r2 = (long) r1
            r18 = r10
            goto L_0x00ce
        L_0x00ca:
            r18 = r10
            r2 = r16
        L_0x00ce:
            long r9 = r12.f85f
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00d6
            long r9 = (long) r1
            long r2 = r2 + r9
        L_0x00d6:
            long r9 = r7.f85f
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00de
            long r0 = (long) r1
            long r2 = r2 + r0
        L_0x00de:
            r9 = r2
            A2.n r5 = new A2.n
            r5.<init>()
            S2.f r4 = new S2.f
            r0 = r4
            r1 = r5
            r2 = r9
            r19 = r11
            r11 = r4
            r4 = r13
            r20 = r13
            r13 = r5
            r5 = r23
            r21 = r6
            r6 = r12
            r22 = r7
            r0.<init>(r1, r2, r4, r5, r6, r7)
            d(r8, r14, r11)
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x010e
            boolean r0 = r13.f83f
            if (r0 == 0) goto L_0x0106
            goto L_0x010e
        L_0x0106:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "bad zip: zip64 extra required but absent"
            r0.<init>(r1)
            throw r0
        L_0x010e:
            long r0 = (long) r15
            java.lang.String r5 = r8.d(r0)
            java.lang.String r0 = R2.l.f1393g
            java.lang.String r0 = "/"
            r1 = 0
            R2.l r1 = j1.e.a(r0, r1)
            r2 = r21
            R2.l r3 = r1.d(r2)
            boolean r4 = r2.endsWith(r0)
            S2.d r0 = new S2.d
            long r6 = r12.f85f
            r1 = r20
            long r8 = r1.f85f
            r1 = r22
            long r12 = r1.f85f
            r2 = r0
            r10 = r18
            r11 = r19
            r2.<init>(r3, r4, r5, r6, r8, r10, r11, r12)
            return r0
        L_0x013b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "bad zip: filename contains 0x00"
            r0.<init>(r1)
            throw r0
        L_0x0143:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "unsupported zip: general purpose bit flag="
            r1.<init>(r3)
            java.lang.String r2 = b(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x015b:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "bad zip: expected "
            r3.<init>(r4)
            java.lang.String r1 = b(r1)
            r3.append(r1)
            java.lang.String r1 = " but was "
            r3.append(r1)
            java.lang.String r0 = b(r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.a.c(R2.p):S2.d");
    }

    public static final void d(p pVar, int i3, z2.p pVar2) {
        long j3 = (long) i3;
        while (j3 != 0) {
            if (j3 >= 4) {
                short c3 = pVar.c() & 65535;
                long c4 = ((long) pVar.c()) & 65535;
                long j4 = j3 - ((long) 4);
                if (j4 >= c4) {
                    pVar.e(c4);
                    R2.a aVar = pVar.f1401g;
                    long j5 = aVar.f1367g;
                    pVar2.i(Integer.valueOf(c3), Long.valueOf(c4));
                    long j6 = (aVar.f1367g + c4) - j5;
                    int i4 = (j6 > 0 ? 1 : (j6 == 0 ? 0 : -1));
                    if (i4 >= 0) {
                        if (i4 > 0) {
                            aVar.i(j6);
                        }
                        j3 = j4 - c4;
                    } else {
                        throw new IOException(h.e("unsupported zip: too many bytes processed for ", c3));
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    public static final int e(s sVar, int i3) {
        int i4;
        i.e(sVar, "<this>");
        int i5 = i3 + 1;
        int length = sVar.f1413j.length;
        int[] iArr = sVar.f1414k;
        i.e(iArr, "<this>");
        int i6 = length - 1;
        int i7 = 0;
        while (true) {
            if (i7 <= i6) {
                i4 = (i7 + i6) >>> 1;
                int i8 = iArr[i4];
                if (i8 >= i5) {
                    if (i8 <= i5) {
                        break;
                    }
                    i6 = i4 - 1;
                } else {
                    i7 = i4 + 1;
                }
            } else {
                i4 = (-i7) - 1;
                break;
            }
        }
        if (i4 >= 0) {
            return i4;
        }
        return ~i4;
    }
}
