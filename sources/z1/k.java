package z1;

import A2.h;
import E1.b;
import E1.c;
import L.j;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import w1.l;
import w1.m;
import w1.o;
import w1.p;
import w1.q;
import w1.r;
import y1.i;

public final class k extends r {

    /* renamed from: b  reason: collision with root package name */
    public static final j f4905b = new j(new k(0), 0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4906a;

    public /* synthetic */ k(int i3) {
        this.f4906a = i3;
    }

    public static m c(b bVar) {
        if (bVar instanceof f) {
            f fVar = (f) bVar;
            int w3 = fVar.w();
            if (w3 == 5 || w3 == 2 || w3 == 4 || w3 == 10) {
                throw new IllegalStateException("Unexpected " + h.l(w3) + " when reading a JsonElement.");
            }
            m mVar = (m) fVar.F();
            fVar.B();
            return mVar;
        }
        int b3 = j.b(bVar.w());
        o oVar = o.f4741f;
        if (b3 == 0) {
            l lVar = new l();
            bVar.a();
            while (bVar.j()) {
                m c3 = c(bVar);
                if (c3 == null) {
                    c3 = oVar;
                }
                lVar.f4740f.add(c3);
            }
            bVar.e();
            return lVar;
        } else if (b3 == 2) {
            p pVar = new p();
            bVar.b();
            while (bVar.j()) {
                String q3 = bVar.q();
                m c4 = c(bVar);
                if (c4 == null) {
                    c4 = oVar;
                }
                pVar.f4742f.put(q3, c4);
            }
            bVar.g();
            return pVar;
        } else if (b3 == 5) {
            return new q(bVar.u());
        } else {
            if (b3 == 6) {
                return new q((Number) new y1.h(bVar.u()));
            }
            if (b3 == 7) {
                return new q(Boolean.valueOf(bVar.m()));
            }
            if (b3 == 8) {
                bVar.s();
                return oVar;
            }
            throw new IllegalArgumentException();
        }
    }

    public static void d(c cVar, m mVar) {
        if (mVar == null || (mVar instanceof o)) {
            cVar.j();
            return;
        }
        boolean z3 = mVar instanceof q;
        if (!z3) {
            boolean z4 = mVar instanceof l;
            if (z4) {
                cVar.b();
                if (z4) {
                    Iterator it = ((l) mVar).f4740f.iterator();
                    while (it.hasNext()) {
                        d(cVar, (m) it.next());
                    }
                    cVar.e();
                    return;
                }
                throw new IllegalStateException("Not a JSON Array: " + mVar);
            } else if (mVar instanceof p) {
                cVar.c();
                Iterator it2 = ((y1.j) mVar.b().f4742f.entrySet()).iterator();
                while (((i) it2).hasNext()) {
                    y1.k b3 = ((i) it2).b();
                    cVar.h((String) b3.getKey());
                    d(cVar, (m) b3.getValue());
                }
                cVar.g();
            } else {
                throw new IllegalArgumentException("Couldn't write " + mVar.getClass());
            }
        } else if (z3) {
            q qVar = (q) mVar;
            Serializable serializable = qVar.f4743f;
            if (serializable instanceof Number) {
                cVar.o(qVar.d());
            } else if (serializable instanceof Boolean) {
                cVar.q(qVar.a());
            } else {
                cVar.p(qVar.c());
            }
        } else {
            throw new IllegalStateException("Not a JSON Primitive: " + mVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ed, code lost:
        if (r10.o() != 0) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00fb, code lost:
        if (java.lang.Integer.parseInt(r1) != 0) goto L_0x00f1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0103 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(E1.b r10) {
        /*
            r9 = this;
            int r0 = r9.f4906a
            switch(r0) {
                case 0: goto L_0x03a9;
                case 1: goto L_0x0368;
                case 2: goto L_0x034b;
                case 3: goto L_0x0334;
                case 4: goto L_0x031e;
                case 5: goto L_0x02f0;
                case 6: goto L_0x02d1;
                case 7: goto L_0x02b2;
                case 8: goto L_0x0293;
                case 9: goto L_0x027b;
                case 10: goto L_0x0263;
                case 11: goto L_0x025b;
                case 12: goto L_0x023b;
                case 13: goto L_0x0214;
                case 14: goto L_0x01fe;
                case 15: goto L_0x01e8;
                case 16: goto L_0x01df;
                case 17: goto L_0x0172;
                case 18: goto L_0x011f;
                case 19: goto L_0x011a;
                case 20: goto L_0x00b5;
                case 21: goto L_0x008f;
                case 22: goto L_0x0079;
                case 23: goto L_0x005b;
                case 24: goto L_0x003d;
                case 25: goto L_0x0020;
                case 26: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            boolean r10 = r10.m()
            r0.<init>(r10)
            return r0
        L_0x000f:
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger     // Catch:{ NumberFormatException -> 0x0019 }
            int r10 = r10.o()     // Catch:{ NumberFormatException -> 0x0019 }
            r0.<init>(r10)     // Catch:{ NumberFormatException -> 0x0019 }
            return r0
        L_0x0019:
            r10 = move-exception
            w1.n r0 = new w1.n
            r0.<init>(r10)
            throw r0
        L_0x0020:
            int r0 = r10.w()
            r1 = 9
            if (r0 != r1) goto L_0x002d
            r10.s()
            r10 = 0
            goto L_0x0035
        L_0x002d:
            int r10 = r10.o()     // Catch:{ NumberFormatException -> 0x0036 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x0036 }
        L_0x0035:
            return r10
        L_0x0036:
            r10 = move-exception
            w1.n r0 = new w1.n
            r0.<init>(r10)
            throw r0
        L_0x003d:
            int r0 = r10.w()
            r1 = 9
            if (r0 != r1) goto L_0x004a
            r10.s()
            r10 = 0
            goto L_0x0053
        L_0x004a:
            int r10 = r10.o()     // Catch:{ NumberFormatException -> 0x0054 }
            short r10 = (short) r10     // Catch:{ NumberFormatException -> 0x0054 }
            java.lang.Short r10 = java.lang.Short.valueOf(r10)     // Catch:{ NumberFormatException -> 0x0054 }
        L_0x0053:
            return r10
        L_0x0054:
            r10 = move-exception
            w1.n r0 = new w1.n
            r0.<init>(r10)
            throw r0
        L_0x005b:
            int r0 = r10.w()
            r1 = 9
            if (r0 != r1) goto L_0x0068
            r10.s()
            r10 = 0
            goto L_0x0071
        L_0x0068:
            int r10 = r10.o()     // Catch:{ NumberFormatException -> 0x0072 }
            byte r10 = (byte) r10     // Catch:{ NumberFormatException -> 0x0072 }
            java.lang.Byte r10 = java.lang.Byte.valueOf(r10)     // Catch:{ NumberFormatException -> 0x0072 }
        L_0x0071:
            return r10
        L_0x0072:
            r10 = move-exception
            w1.n r0 = new w1.n
            r0.<init>(r10)
            throw r0
        L_0x0079:
            int r0 = r10.w()
            r1 = 9
            if (r0 != r1) goto L_0x0086
            r10.s()
            r10 = 0
            goto L_0x008e
        L_0x0086:
            java.lang.String r10 = r10.u()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
        L_0x008e:
            return r10
        L_0x008f:
            int r0 = r10.w()
            r1 = 9
            if (r0 != r1) goto L_0x009c
            r10.s()
            r10 = 0
            goto L_0x00b4
        L_0x009c:
            r1 = 6
            if (r0 != r1) goto L_0x00ac
            java.lang.String r10 = r10.u()
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            goto L_0x00b4
        L_0x00ac:
            boolean r10 = r10.m()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
        L_0x00b4:
            return r10
        L_0x00b5:
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            r10.a()
            int r1 = r10.w()
            r2 = 0
            r3 = r2
        L_0x00c3:
            r4 = 2
            if (r1 == r4) goto L_0x0116
            int r4 = L.j.b(r1)
            r5 = 5
            r6 = 1
            if (r4 == r5) goto L_0x00f3
            r5 = 6
            if (r4 == r5) goto L_0x00e9
            r5 = 7
            if (r4 != r5) goto L_0x00d9
            boolean r1 = r10.m()
            goto L_0x00fe
        L_0x00d9:
            w1.n r10 = new w1.n
            java.lang.String r0 = A2.h.l(r1)
            java.lang.String r1 = "Invalid bitset value type: "
            java.lang.String r0 = r1.concat(r0)
            r10.<init>(r0)
            throw r10
        L_0x00e9:
            int r1 = r10.o()
            if (r1 == 0) goto L_0x00f0
            goto L_0x00f1
        L_0x00f0:
            r6 = r2
        L_0x00f1:
            r1 = r6
            goto L_0x00fe
        L_0x00f3:
            java.lang.String r1 = r10.u()
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x010a }
            if (r1 == 0) goto L_0x00f0
            goto L_0x00f1
        L_0x00fe:
            if (r1 == 0) goto L_0x0103
            r0.set(r3)
        L_0x0103:
            int r3 = r3 + 1
            int r1 = r10.w()
            goto L_0x00c3
        L_0x010a:
            w1.n r10 = new w1.n
            java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
            java.lang.String r0 = A2.h.g(r0, r1)
            r10.<init>(r0)
            throw r10
        L_0x0116:
            r10.e()
            return r0
        L_0x011a:
            w1.m r10 = c(r10)
            return r10
        L_0x011f:
            int r0 = r10.w()
            r1 = 9
            r2 = 0
            if (r0 != r1) goto L_0x012c
            r10.s()
            goto L_0x0171
        L_0x012c:
            java.lang.String r10 = r10.u()
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            java.lang.String r1 = "_"
            r0.<init>(r10, r1)
            boolean r10 = r0.hasMoreElements()
            if (r10 == 0) goto L_0x0142
            java.lang.String r10 = r0.nextToken()
            goto L_0x0143
        L_0x0142:
            r10 = r2
        L_0x0143:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L_0x014e
            java.lang.String r1 = r0.nextToken()
            goto L_0x014f
        L_0x014e:
            r1 = r2
        L_0x014f:
            boolean r3 = r0.hasMoreElements()
            if (r3 == 0) goto L_0x0159
            java.lang.String r2 = r0.nextToken()
        L_0x0159:
            if (r1 != 0) goto L_0x0163
            if (r2 != 0) goto L_0x0163
            java.util.Locale r2 = new java.util.Locale
            r2.<init>(r10)
            goto L_0x0171
        L_0x0163:
            if (r2 != 0) goto L_0x016b
            java.util.Locale r2 = new java.util.Locale
            r2.<init>(r10, r1)
            goto L_0x0171
        L_0x016b:
            java.util.Locale r0 = new java.util.Locale
            r0.<init>(r10, r1, r2)
            r2 = r0
        L_0x0171:
            return r2
        L_0x0172:
            int r0 = r10.w()
            r1 = 9
            if (r0 != r1) goto L_0x0180
            r10.s()
            r10 = 0
            goto L_0x01de
        L_0x0180:
            r10.b()
            r0 = 0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x018a:
            int r0 = r10.w()
            r1 = 4
            if (r0 == r1) goto L_0x01d5
            java.lang.String r0 = r10.q()
            int r1 = r10.o()
            java.lang.String r8 = "year"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x01a3
            r2 = r1
            goto L_0x018a
        L_0x01a3:
            java.lang.String r8 = "month"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x01ad
            r3 = r1
            goto L_0x018a
        L_0x01ad:
            java.lang.String r8 = "dayOfMonth"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x01b7
            r4 = r1
            goto L_0x018a
        L_0x01b7:
            java.lang.String r8 = "hourOfDay"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x01c1
            r5 = r1
            goto L_0x018a
        L_0x01c1:
            java.lang.String r8 = "minute"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x01cb
            r6 = r1
            goto L_0x018a
        L_0x01cb:
            java.lang.String r8 = "second"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x018a
            r7 = r1
            goto L_0x018a
        L_0x01d5:
            r10.g()
            java.util.GregorianCalendar r10 = new java.util.GregorianCalendar
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L_0x01de:
            return r10
        L_0x01df:
            java.lang.String r10 = r10.u()
            java.util.Currency r10 = java.util.Currency.getInstance(r10)
            return r10
        L_0x01e8:
            int r0 = r10.w()
            r1 = 9
            if (r0 != r1) goto L_0x01f5
            r10.s()
            r10 = 0
            goto L_0x01fd
        L_0x01f5:
            java.lang.String r10 = r10.u()
            java.util.UUID r10 = java.util.UUID.fromString(r10)
        L_0x01fd:
            return r10
        L_0x01fe:
            int r0 = r10.w()
            r1 = 9
            if (r0 != r1) goto L_0x020b
            r10.s()
            r10 = 0
            goto L_0x0213
        L_0x020b:
            java.lang.String r10 = r10.u()
            java.net.InetAddress r10 = java.net.InetAddress.getByName(r10)
        L_0x0213:
            return r10
        L_0x0214:
            int r0 = r10.w()
            r1 = 9
            r2 = 0
            if (r0 != r1) goto L_0x0221
            r10.s()
            goto L_0x0233
        L_0x0221:
            java.lang.String r10 = r10.u()     // Catch:{ URISyntaxException -> 0x0234 }
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r10)     // Catch:{ URISyntaxException -> 0x0234 }
            if (r0 == 0) goto L_0x022e
            goto L_0x0233
        L_0x022e:
            java.net.URI r2 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0234 }
            r2.<init>(r10)     // Catch:{ URISyntaxException -> 0x0234 }
        L_0x0233:
            return r2
        L_0x0234:
            r10 = move-exception
            w1.n r0 = new w1.n
            r0.<init>(r10)
            throw r0
        L_0x023b:
            int r0 = r10.w()
            r1 = 9
            r2 = 0
            if (r0 != r1) goto L_0x0248
            r10.s()
            goto L_0x025a
        L_0x0248:
            java.lang.String r10 = r10.u()
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0255
            goto L_0x025a
        L_0x0255:
            java.net.URL r2 = new java.net.URL
            r2.<init>(r10)
        L_0x025a:
            return r2
        L_0x025b:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?"
            r10.<init>(r0)
            throw r10
        L_0x0263:
            int r0 = r10.w()
            r1 = 9
            if (r0 != r1) goto L_0x0270
            r10.s()
            r10 = 0
            goto L_0x027a
        L_0x0270:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r10 = r10.u()
            r0.<init>(r10)
            r10 = r0
        L_0x027a:
            return r10
        L_0x027b:
            int r0 = r10.w()
            r1 = 9
            if (r0 != r1) goto L_0x0288
            r10.s()
            r10 = 0
            goto L_0x0292
        L_0x0288:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r10 = r10.u()
            r0.<init>(r10)
            r10 = r0
        L_0x0292:
            return r10
        L_0x0293:
            int r0 = r10.w()
            r1 = 9
            if (r0 != r1) goto L_0x02a0
            r10.s()
            r10 = 0
            goto L_0x02aa
        L_0x02a0:
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ NumberFormatException -> 0x02ab }
            java.lang.String r10 = r10.u()     // Catch:{ NumberFormatException -> 0x02ab }
            r0.<init>(r10)     // Catch:{ NumberFormatException -> 0x02ab }
            r10 = r0
        L_0x02aa:
            return r10
        L_0x02ab:
            r10 = move-exception
            w1.n r0 = new w1.n
            r0.<init>(r10)
            throw r0
        L_0x02b2:
            int r0 = r10.w()
            r1 = 9
            if (r0 != r1) goto L_0x02bf
            r10.s()
            r10 = 0
            goto L_0x02c9
        L_0x02bf:
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x02ca }
            java.lang.String r10 = r10.u()     // Catch:{ NumberFormatException -> 0x02ca }
            r0.<init>(r10)     // Catch:{ NumberFormatException -> 0x02ca }
            r10 = r0
        L_0x02c9:
            return r10
        L_0x02ca:
            r10 = move-exception
            w1.n r0 = new w1.n
            r0.<init>(r10)
            throw r0
        L_0x02d1:
            int r0 = r10.w()
            r1 = 9
            if (r0 != r1) goto L_0x02de
            r10.s()
            r10 = 0
            goto L_0x02ef
        L_0x02de:
            r1 = 8
            if (r0 != r1) goto L_0x02eb
            boolean r10 = r10.m()
            java.lang.String r10 = java.lang.Boolean.toString(r10)
            goto L_0x02ef
        L_0x02eb:
            java.lang.String r10 = r10.u()
        L_0x02ef:
            return r10
        L_0x02f0:
            int r0 = r10.w()
            r1 = 9
            if (r0 != r1) goto L_0x02fd
            r10.s()
            r10 = 0
            goto L_0x0311
        L_0x02fd:
            java.lang.String r10 = r10.u()
            int r0 = r10.length()
            r1 = 1
            if (r0 != r1) goto L_0x0312
            r0 = 0
            char r10 = r10.charAt(r0)
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
        L_0x0311:
            return r10
        L_0x0312:
            w1.n r0 = new w1.n
            java.lang.String r1 = "Expecting character, got: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        L_0x031e:
            int r0 = r10.w()
            r1 = 9
            if (r0 != r1) goto L_0x032b
            r10.s()
            r10 = 0
            goto L_0x0333
        L_0x032b:
            double r0 = r10.n()
            java.lang.Double r10 = java.lang.Double.valueOf(r0)
        L_0x0333:
            return r10
        L_0x0334:
            int r0 = r10.w()
            r1 = 9
            if (r0 != r1) goto L_0x0341
            r10.s()
            r10 = 0
            goto L_0x034a
        L_0x0341:
            double r0 = r10.n()
            float r10 = (float) r0
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
        L_0x034a:
            return r10
        L_0x034b:
            int r0 = r10.w()
            r1 = 9
            if (r0 != r1) goto L_0x0358
            r10.s()
            r10 = 0
            goto L_0x0360
        L_0x0358:
            long r0 = r10.p()     // Catch:{ NumberFormatException -> 0x0361 }
            java.lang.Long r10 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0361 }
        L_0x0360:
            return r10
        L_0x0361:
            r10 = move-exception
            w1.n r0 = new w1.n
            r0.<init>(r10)
            throw r0
        L_0x0368:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.a()
        L_0x0370:
            boolean r1 = r10.j()
            if (r1 == 0) goto L_0x0389
            int r1 = r10.o()     // Catch:{ NumberFormatException -> 0x0382 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0382 }
            r0.add(r1)     // Catch:{ NumberFormatException -> 0x0382 }
            goto L_0x0370
        L_0x0382:
            r10 = move-exception
            w1.n r0 = new w1.n
            r0.<init>(r10)
            throw r0
        L_0x0389:
            r10.e()
            int r10 = r0.size()
            java.util.concurrent.atomic.AtomicIntegerArray r1 = new java.util.concurrent.atomic.AtomicIntegerArray
            r1.<init>(r10)
            r2 = 0
        L_0x0396:
            if (r2 >= r10) goto L_0x03a8
            java.lang.Object r3 = r0.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.set(r2, r3)
            int r2 = r2 + 1
            goto L_0x0396
        L_0x03a8:
            return r1
        L_0x03a9:
            int r0 = r10.w()
            int r1 = L.j.b(r0)
            r2 = 5
            if (r1 == r2) goto L_0x03d0
            r2 = 6
            if (r1 == r2) goto L_0x03d0
            r2 = 8
            if (r1 != r2) goto L_0x03c0
            r10.s()
            r10 = 0
            goto L_0x03da
        L_0x03c0:
            w1.n r10 = new w1.n
            java.lang.String r0 = A2.h.l(r0)
            java.lang.String r1 = "Expecting number, got: "
            java.lang.String r0 = r1.concat(r0)
            r10.<init>(r0)
            throw r10
        L_0x03d0:
            y1.h r0 = new y1.h
            java.lang.String r10 = r10.u()
            r0.<init>(r10)
            r10 = r0
        L_0x03da:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.k.a(E1.b):java.lang.Object");
    }

    public final void b(c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        switch (this.f4906a) {
            case 0:
                cVar.o((Number) obj);
                return;
            case 1:
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                cVar.b();
                int length = atomicIntegerArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    cVar.m((long) atomicIntegerArray.get(i3));
                }
                cVar.e();
                return;
            case L.k.FLOAT_FIELD_NUMBER:
                cVar.o((Number) obj);
                return;
            case L.k.INTEGER_FIELD_NUMBER:
                cVar.o((Number) obj);
                return;
            case L.k.LONG_FIELD_NUMBER:
                cVar.o((Number) obj);
                return;
            case L.k.STRING_FIELD_NUMBER:
                Character ch = (Character) obj;
                if (ch == null) {
                    str = null;
                } else {
                    str = String.valueOf(ch);
                }
                cVar.p(str);
                return;
            case L.k.STRING_SET_FIELD_NUMBER:
                cVar.p((String) obj);
                return;
            case L.k.DOUBLE_FIELD_NUMBER:
                cVar.o((BigDecimal) obj);
                return;
            case L.k.BYTES_FIELD_NUMBER:
                cVar.o((BigInteger) obj);
                return;
            case 9:
                StringBuilder sb = (StringBuilder) obj;
                if (sb == null) {
                    str2 = null;
                } else {
                    str2 = sb.toString();
                }
                cVar.p(str2);
                return;
            case 10:
                StringBuffer stringBuffer = (StringBuffer) obj;
                if (stringBuffer == null) {
                    str3 = null;
                } else {
                    str3 = stringBuffer.toString();
                }
                cVar.p(str3);
                return;
            case 11:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 12:
                URL url = (URL) obj;
                if (url == null) {
                    str4 = null;
                } else {
                    str4 = url.toExternalForm();
                }
                cVar.p(str4);
                return;
            case 13:
                URI uri = (URI) obj;
                if (uri == null) {
                    str5 = null;
                } else {
                    str5 = uri.toASCIIString();
                }
                cVar.p(str5);
                return;
            case 14:
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress == null) {
                    str6 = null;
                } else {
                    str6 = inetAddress.getHostAddress();
                }
                cVar.p(str6);
                return;
            case 15:
                UUID uuid = (UUID) obj;
                if (uuid == null) {
                    str7 = null;
                } else {
                    str7 = uuid.toString();
                }
                cVar.p(str7);
                return;
            case 16:
                cVar.p(((Currency) obj).getCurrencyCode());
                return;
            case 17:
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    cVar.j();
                    return;
                }
                cVar.c();
                cVar.h("year");
                cVar.m((long) calendar.get(1));
                cVar.h("month");
                cVar.m((long) calendar.get(2));
                cVar.h("dayOfMonth");
                cVar.m((long) calendar.get(5));
                cVar.h("hourOfDay");
                cVar.m((long) calendar.get(11));
                cVar.h("minute");
                cVar.m((long) calendar.get(12));
                cVar.h("second");
                cVar.m((long) calendar.get(13));
                cVar.g();
                return;
            case 18:
                Locale locale = (Locale) obj;
                if (locale == null) {
                    str8 = null;
                } else {
                    str8 = locale.toString();
                }
                cVar.p(str8);
                return;
            case 19:
                d(cVar, (m) obj);
                return;
            case 20:
                BitSet bitSet = (BitSet) obj;
                cVar.b();
                int length2 = bitSet.length();
                for (int i4 = 0; i4 < length2; i4++) {
                    cVar.m(bitSet.get(i4) ? 1 : 0);
                }
                cVar.e();
                return;
            case 21:
                cVar.n((Boolean) obj);
                return;
            case 22:
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    str9 = "null";
                } else {
                    str9 = bool.toString();
                }
                cVar.p(str9);
                return;
            case 23:
                cVar.o((Number) obj);
                return;
            case 24:
                cVar.o((Number) obj);
                return;
            case 25:
                cVar.o((Number) obj);
                return;
            case 26:
                cVar.m((long) ((AtomicInteger) obj).get());
                return;
            default:
                cVar.q(((AtomicBoolean) obj).get());
                return;
        }
    }
}
