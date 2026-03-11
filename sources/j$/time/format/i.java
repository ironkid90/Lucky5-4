package j$.time.format;

import j$.time.temporal.r;

class i implements f {

    /* renamed from: f  reason: collision with root package name */
    static final long[] f5070f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* renamed from: a  reason: collision with root package name */
    final Enum f5071a;

    /* renamed from: b  reason: collision with root package name */
    final int f5072b;

    /* renamed from: c  reason: collision with root package name */
    final int f5073c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final z f5074d;

    /* renamed from: e  reason: collision with root package name */
    final int f5075e;

    i(r rVar, int i3, int i4, z zVar) {
        this.f5071a = (Enum) rVar;
        this.f5072b = i3;
        this.f5073c = i4;
        this.f5074d = zVar;
        this.f5075e = 0;
    }

    protected i(r rVar, int i3, int i4, z zVar, int i5) {
        this.f5071a = (Enum) rVar;
        this.f5072b = i3;
        this.f5073c = i4;
        this.f5074d = zVar;
        this.f5075e = i5;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Enum, j$.time.temporal.r] */
    /* access modifiers changed from: package-private */
    public i c() {
        if (this.f5075e == -1) {
            return this;
        }
        return new i(this.f5071a, this.f5072b, this.f5073c, this.f5074d, -1);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Enum, j$.time.temporal.r] */
    /* access modifiers changed from: package-private */
    public i d(int i3) {
        ? r12 = this.f5071a;
        int i4 = this.f5073c;
        z zVar = this.f5074d;
        return new i(r12, this.f5072b, i4, zVar, this.f5075e + i3);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Enum, j$.time.temporal.r, java.lang.Object] */
    public boolean p(t tVar, StringBuilder sb) {
        ? r02 = this.f5071a;
        Long e2 = tVar.e(r02);
        if (e2 == null) {
            return false;
        }
        long longValue = e2.longValue();
        w b3 = tVar.b();
        String l3 = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
        int length = l3.length();
        int i3 = this.f5073c;
        if (length <= i3) {
            b3.getClass();
            int i4 = (longValue > 0 ? 1 : (longValue == 0 ? 0 : -1));
            int i5 = this.f5072b;
            z zVar = this.f5074d;
            if (i4 >= 0) {
                int i6 = c.f5065a[zVar.ordinal()];
                if (i6 != 1) {
                    if (i6 == 2) {
                        sb.append('+');
                    }
                } else if (i5 < 19 && longValue >= f5070f[i5]) {
                    sb.append('+');
                }
            } else {
                int i7 = c.f5065a[zVar.ordinal()];
                if (i7 == 1 || i7 == 2 || i7 == 3) {
                    sb.append('-');
                } else if (i7 == 4) {
                    throw new RuntimeException("Field " + r02 + " cannot be printed as the value " + longValue + " cannot be negative according to the SignStyle");
                }
            }
            for (int i8 = 0; i8 < i5 - l3.length(); i8++) {
                sb.append('0');
            }
            sb.append(l3);
            return true;
        }
        throw new RuntimeException("Field " + r02 + " cannot be printed as the value " + longValue + " exceeds the maximum print width of " + i3);
    }

    /* access modifiers changed from: package-private */
    public boolean b(q qVar) {
        int i3 = this.f5075e;
        return i3 == -1 || (i3 > 0 && this.f5072b == this.f5073c && this.f5074d == z.NOT_NEGATIVE);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Enum, j$.time.temporal.r] */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0137, code lost:
        if (r3 <= r8) goto L_0x010e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int r(j$.time.format.q r21, java.lang.CharSequence r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r23
            int r2 = r22.length()
            if (r1 != r2) goto L_0x000c
            int r1 = ~r1
            return r1
        L_0x000c:
            char r3 = r22.charAt(r23)
            j$.time.format.w r4 = r21.f()
            r4.getClass()
            r4 = 1
            r5 = 43
            int r6 = r0.f5073c
            j$.time.format.z r7 = r0.f5074d
            int r8 = r0.f5072b
            r9 = 0
            if (r3 != r5) goto L_0x0039
            boolean r3 = r21.k()
            if (r8 != r6) goto L_0x002b
            r5 = r4
            goto L_0x002c
        L_0x002b:
            r5 = r9
        L_0x002c:
            boolean r3 = r7.p(r4, r3, r5)
            if (r3 != 0) goto L_0x0034
            int r1 = ~r1
            return r1
        L_0x0034:
            int r1 = r1 + 1
            r5 = r4
            r3 = r9
            goto L_0x0068
        L_0x0039:
            j$.time.format.w r5 = r21.f()
            r5.getClass()
            r5 = 45
            if (r3 != r5) goto L_0x005a
            boolean r3 = r21.k()
            if (r8 != r6) goto L_0x004c
            r5 = r4
            goto L_0x004d
        L_0x004c:
            r5 = r9
        L_0x004d:
            boolean r3 = r7.p(r9, r3, r5)
            if (r3 != 0) goto L_0x0055
            int r1 = ~r1
            return r1
        L_0x0055:
            int r1 = r1 + 1
            r3 = r4
            r5 = r9
            goto L_0x0068
        L_0x005a:
            j$.time.format.z r3 = j$.time.format.z.ALWAYS
            if (r7 != r3) goto L_0x0066
            boolean r3 = r21.k()
            if (r3 == 0) goto L_0x0066
            int r1 = ~r1
            return r1
        L_0x0066:
            r3 = r9
            r5 = r3
        L_0x0068:
            boolean r10 = r21.k()
            if (r10 != 0) goto L_0x0077
            boolean r10 = r20.b(r21)
            if (r10 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r10 = r4
            goto L_0x0078
        L_0x0077:
            r10 = r8
        L_0x0078:
            int r11 = r1 + r10
            if (r11 <= r2) goto L_0x007e
            int r1 = ~r1
            return r1
        L_0x007e:
            boolean r12 = r21.k()
            if (r12 != 0) goto L_0x008d
            boolean r12 = r20.b(r21)
            if (r12 == 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            r6 = 9
        L_0x008d:
            int r12 = r0.f5075e
            int r13 = java.lang.Math.max(r12, r9)
            int r13 = r13 + r6
        L_0x0094:
            r6 = 2
            r16 = 0
            if (r9 >= r6) goto L_0x00f7
            int r13 = r13 + r1
            int r6 = java.lang.Math.min(r13, r2)
            r13 = r1
            r17 = 0
        L_0x00a1:
            if (r13 >= r6) goto L_0x00e4
            int r19 = r13 + 1
            r14 = r22
            char r15 = r14.charAt(r13)
            j$.time.format.w r4 = r21.f()
            int r4 = r4.a(r15)
            if (r4 >= 0) goto L_0x00b9
            if (r13 >= r11) goto L_0x00e4
            int r1 = ~r1
            return r1
        L_0x00b9:
            int r13 = r19 - r1
            r15 = 18
            if (r13 <= r15) goto L_0x00d9
            if (r16 != 0) goto L_0x00c5
            java.math.BigInteger r16 = java.math.BigInteger.valueOf(r17)
        L_0x00c5:
            r13 = r16
            java.math.BigInteger r15 = java.math.BigInteger.TEN
            java.math.BigInteger r13 = r13.multiply(r15)
            long r14 = (long) r4
            java.math.BigInteger r4 = java.math.BigInteger.valueOf(r14)
            java.math.BigInteger r4 = r13.add(r4)
            r16 = r4
            goto L_0x00e0
        L_0x00d9:
            r13 = 10
            long r17 = r17 * r13
            long r13 = (long) r4
            long r17 = r17 + r13
        L_0x00e0:
            r13 = r19
            r4 = 1
            goto L_0x00a1
        L_0x00e4:
            if (r12 <= 0) goto L_0x00f2
            if (r9 != 0) goto L_0x00f2
            int r13 = r13 - r1
            int r13 = r13 - r12
            int r13 = java.lang.Math.max(r10, r13)
            int r9 = r9 + 1
            r4 = 1
            goto L_0x0094
        L_0x00f2:
            r2 = r16
            r9 = r17
            goto L_0x00fc
        L_0x00f7:
            r13 = r1
            r2 = r16
            r9 = 0
        L_0x00fc:
            if (r3 == 0) goto L_0x0129
            if (r2 == 0) goto L_0x0118
            java.math.BigInteger r3 = java.math.BigInteger.ZERO
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0112
            boolean r3 = r21.k()
            if (r3 == 0) goto L_0x0112
        L_0x010e:
            r3 = 1
        L_0x010f:
            int r1 = r1 - r3
            int r1 = ~r1
            return r1
        L_0x0112:
            java.math.BigInteger r2 = r2.negate()
        L_0x0116:
            r4 = r9
            goto L_0x013e
        L_0x0118:
            r3 = 1
            r4 = 0
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0126
            boolean r4 = r21.k()
            if (r4 == 0) goto L_0x0126
            goto L_0x010f
        L_0x0126:
            long r3 = -r9
            r4 = r3
            goto L_0x013e
        L_0x0129:
            j$.time.format.z r3 = j$.time.format.z.EXCEEDS_PAD
            if (r7 != r3) goto L_0x0116
            boolean r3 = r21.k()
            if (r3 == 0) goto L_0x0116
            int r3 = r13 - r1
            if (r5 == 0) goto L_0x013a
            if (r3 > r8) goto L_0x0116
            goto L_0x010e
        L_0x013a:
            if (r3 <= r8) goto L_0x0116
            int r1 = ~r1
            return r1
        L_0x013e:
            java.lang.Enum r3 = r0.f5071a
            if (r2 == 0) goto L_0x015f
            int r4 = r2.bitLength()
            r5 = 63
            if (r4 <= r5) goto L_0x0152
            java.math.BigInteger r4 = java.math.BigInteger.TEN
            java.math.BigInteger r2 = r2.divide(r4)
            int r13 = r13 + -1
        L_0x0152:
            r7 = r13
            long r4 = r2.longValue()
            r2 = r21
            r6 = r1
            int r1 = r2.n(r3, r4, r6, r7)
            return r1
        L_0x015f:
            r2 = r21
            r6 = r1
            r7 = r13
            int r1 = r2.n(r3, r4, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.i.r(j$.time.format.q, java.lang.CharSequence, int):int");
    }

    public String toString() {
        Enum enumR = this.f5071a;
        int i3 = this.f5073c;
        z zVar = this.f5074d;
        int i4 = this.f5072b;
        if (i4 == 1 && i3 == 19 && zVar == z.NORMAL) {
            return "Value(" + enumR + ")";
        } else if (i4 == i3 && zVar == z.NOT_NEGATIVE) {
            return "Value(" + enumR + "," + i4 + ")";
        } else {
            return "Value(" + enumR + "," + i4 + "," + i3 + "," + zVar + ")";
        }
    }
}
