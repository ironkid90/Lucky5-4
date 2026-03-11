package E1;

import A2.h;
import L.k;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class b implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    public final Reader f227f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f228g = false;

    /* renamed from: h  reason: collision with root package name */
    public final char[] f229h = new char[1024];

    /* renamed from: i  reason: collision with root package name */
    public int f230i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f231j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f232k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f233l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f234m = 0;

    /* renamed from: n  reason: collision with root package name */
    public long f235n;

    /* renamed from: o  reason: collision with root package name */
    public int f236o;

    /* renamed from: p  reason: collision with root package name */
    public String f237p;

    /* renamed from: q  reason: collision with root package name */
    public int[] f238q;

    /* renamed from: r  reason: collision with root package name */
    public int f239r;

    /* renamed from: s  reason: collision with root package name */
    public String[] f240s;

    /* renamed from: t  reason: collision with root package name */
    public int[] f241t;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, E1.a] */
    static {
        a.f226a = new Object();
    }

    public b(Reader reader) {
        int[] iArr = new int[32];
        this.f238q = iArr;
        this.f239r = 1;
        iArr[0] = 6;
        this.f240s = new String[32];
        this.f241t = new int[32];
        if (reader != null) {
            this.f227f = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    public final void A() {
        char c3;
        do {
            if (this.f230i < this.f231j || h(1)) {
                int i3 = this.f230i;
                int i4 = i3 + 1;
                this.f230i = i4;
                c3 = this.f229h[i3];
                if (c3 == 10) {
                    this.f232k++;
                    this.f233l = i4;
                    return;
                }
            } else {
                return;
            }
        } while (c3 != 13);
    }

    public void B() {
        int i3;
        int i4 = 0;
        do {
            int i5 = this.f234m;
            if (i5 == 0) {
                i5 = d();
            }
            if (i5 == 3) {
                x(1);
            } else if (i5 == 1) {
                x(3);
            } else {
                if (i5 == 4) {
                    this.f239r--;
                } else if (i5 == 2) {
                    this.f239r--;
                } else if (i5 == 14 || i5 == 10) {
                    while (true) {
                        i3 = 0;
                        while (true) {
                            int i6 = this.f230i + i3;
                            if (i6 < this.f231j) {
                                char c3 = this.f229h[i6];
                                if (!(c3 == 9 || c3 == 10 || c3 == 12 || c3 == 13 || c3 == ' ')) {
                                    if (c3 != '#') {
                                        if (c3 != ',') {
                                            if (!(c3 == '/' || c3 == '=')) {
                                                if (!(c3 == '{' || c3 == '}' || c3 == ':')) {
                                                    if (c3 != ';') {
                                                        switch (c3) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i3++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.f230i = i6;
                                if (!h(1)) {
                                }
                            }
                        }
                    }
                    c();
                    this.f230i += i3;
                    this.f234m = 0;
                } else if (i5 == 8 || i5 == 12) {
                    z('\'');
                    this.f234m = 0;
                } else if (i5 == 9 || i5 == 13) {
                    z('\"');
                    this.f234m = 0;
                } else {
                    if (i5 == 16) {
                        this.f230i += this.f236o;
                    }
                    this.f234m = 0;
                }
                i4--;
                this.f234m = 0;
            }
            i4++;
            this.f234m = 0;
        } while (i4 != 0);
        int[] iArr = this.f241t;
        int i7 = this.f239r;
        int i8 = i7 - 1;
        iArr[i8] = iArr[i8] + 1;
        this.f240s[i7 - 1] = "null";
    }

    public final void C(String str) {
        throw new IOException(str + l());
    }

    public void a() {
        int i3 = this.f234m;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 3) {
            x(1);
            this.f241t[this.f239r - 1] = 0;
            this.f234m = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + h.l(w()) + l());
    }

    public void b() {
        int i3 = this.f234m;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 1) {
            x(3);
            this.f234m = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + h.l(w()) + l());
    }

    public final void c() {
        if (!this.f228g) {
            C("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    public void close() {
        this.f234m = 0;
        this.f238q[0] = 8;
        this.f239r = 1;
        this.f227f.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0198, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0211, code lost:
        if (k(r1) != false) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0214, code lost:
        if (r8 != 2) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0216, code lost:
        if (r11 == false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x021c, code lost:
        if (r14 != Long.MIN_VALUE) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x021e, code lost:
        if (r16 == 0) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0221, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0225, code lost:
        if (r14 != 0) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0227, code lost:
        if (r16 != 0) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0229, code lost:
        if (r16 == 0) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x022c, code lost:
        r14 = -r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x022d, code lost:
        r0.f235n = r14;
        r0.f230i += r10;
        r10 = 15;
        r0.f234m = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0239, code lost:
        if (r8 == r1) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x023c, code lost:
        if (r8 == 4) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x023f, code lost:
        if (r8 != 7) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0241, code lost:
        r0.f236o = r10;
        r10 = 16;
        r0.f234m = 16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0155 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d() {
        /*
            r20 = this;
            r0 = r20
            int[] r1 = r0.f238q
            int r2 = r0.f239r
            r3 = 1
            int r2 = r2 - r3
            r4 = r1[r2]
            char[] r5 = r0.f229h
            r6 = 0
            r11 = 39
            r12 = 6
            r13 = 3
            r14 = 93
            r15 = 59
            r7 = 44
            r10 = 4
            r8 = 2
            r9 = 5
            if (r4 != r3) goto L_0x0021
            r1[r2] = r8
        L_0x001e:
            r1 = 0
            goto L_0x00dc
        L_0x0021:
            if (r4 != r8) goto L_0x003a
            int r1 = r0.r(r3)
            if (r1 == r7) goto L_0x001e
            if (r1 == r15) goto L_0x0036
            if (r1 != r14) goto L_0x0030
            r0.f234m = r10
            return r10
        L_0x0030:
            java.lang.String r1 = "Unterminated array"
            r0.C(r1)
            throw r6
        L_0x0036:
            r20.c()
            goto L_0x001e
        L_0x003a:
            r8 = 125(0x7d, float:1.75E-43)
            if (r4 == r13) goto L_0x0040
            if (r4 != r9) goto L_0x0043
        L_0x0040:
            r3 = r10
            goto L_0x02d0
        L_0x0043:
            if (r4 != r10) goto L_0x0074
            r1[r2] = r9
            int r1 = r0.r(r3)
            r2 = 58
            if (r1 == r2) goto L_0x001e
            r2 = 61
            if (r1 != r2) goto L_0x006e
            r20.c()
            int r1 = r0.f230i
            int r2 = r0.f231j
            if (r1 < r2) goto L_0x0062
            boolean r1 = r0.h(r3)
            if (r1 == 0) goto L_0x001e
        L_0x0062:
            int r1 = r0.f230i
            char r2 = r5[r1]
            r8 = 62
            if (r2 != r8) goto L_0x001e
            int r1 = r1 + r3
            r0.f230i = r1
            goto L_0x001e
        L_0x006e:
            java.lang.String r1 = "Expected ':'"
            r0.C(r1)
            throw r6
        L_0x0074:
            if (r4 != r12) goto L_0x00be
            boolean r1 = r0.f228g
            if (r1 == 0) goto L_0x00b4
            r0.r(r3)
            int r1 = r0.f230i
            int r2 = r1 + -1
            r0.f230i = r2
            int r6 = r1 + 4
            int r10 = r0.f231j
            if (r6 <= r10) goto L_0x0090
            boolean r6 = r0.h(r9)
            if (r6 != 0) goto L_0x0090
            goto L_0x00b4
        L_0x0090:
            char r2 = r5[r2]
            r6 = 41
            if (r2 != r6) goto L_0x00b4
            char r2 = r5[r1]
            if (r2 != r14) goto L_0x00b4
            int r2 = r1 + 1
            char r2 = r5[r2]
            if (r2 != r8) goto L_0x00b4
            int r2 = r1 + 2
            char r2 = r5[r2]
            if (r2 != r11) goto L_0x00b4
            int r1 = r1 + 3
            char r1 = r5[r1]
            r2 = 10
            if (r1 == r2) goto L_0x00af
            goto L_0x00b4
        L_0x00af:
            int r1 = r0.f230i
            int r1 = r1 + r9
            r0.f230i = r1
        L_0x00b4:
            int[] r1 = r0.f238q
            int r2 = r0.f239r
            int r2 = r2 - r3
            r6 = 7
            r1[r2] = r6
            goto L_0x001e
        L_0x00be:
            r6 = 7
            if (r4 != r6) goto L_0x00d7
            r1 = 0
            int r2 = r0.r(r1)
            r6 = -1
            if (r2 != r6) goto L_0x00ce
            r1 = 17
            r0.f234m = r1
            return r1
        L_0x00ce:
            r20.c()
            int r2 = r0.f230i
            int r2 = r2 - r3
            r0.f230i = r2
            goto L_0x00dc
        L_0x00d7:
            r1 = 0
            r2 = 8
            if (r4 == r2) goto L_0x02c8
        L_0x00dc:
            int r2 = r0.r(r3)
            r6 = 34
            if (r2 == r6) goto L_0x02c3
            if (r2 == r11) goto L_0x02bb
            if (r2 == r7) goto L_0x02a1
            if (r2 == r15) goto L_0x02a1
            r6 = 91
            if (r2 == r6) goto L_0x029e
            if (r2 == r14) goto L_0x0297
            r4 = 123(0x7b, float:1.72E-43)
            if (r2 == r4) goto L_0x0293
            int r2 = r0.f230i
            int r2 = r2 - r3
            r0.f230i = r2
            char r2 = r5[r2]
            r4 = 116(0x74, float:1.63E-43)
            if (r2 == r4) goto L_0x0124
            r4 = 84
            if (r2 != r4) goto L_0x0104
            goto L_0x0124
        L_0x0104:
            r4 = 102(0x66, float:1.43E-43)
            if (r2 == r4) goto L_0x011e
            r4 = 70
            if (r2 != r4) goto L_0x010d
            goto L_0x011e
        L_0x010d:
            r4 = 110(0x6e, float:1.54E-43)
            if (r2 == r4) goto L_0x0118
            r4 = 78
            if (r2 != r4) goto L_0x0116
            goto L_0x0118
        L_0x0116:
            r6 = r1
            goto L_0x0177
        L_0x0118:
            java.lang.String r2 = "null"
            java.lang.String r4 = "NULL"
            r6 = 7
            goto L_0x0129
        L_0x011e:
            java.lang.String r2 = "false"
            java.lang.String r4 = "FALSE"
            r6 = r12
            goto L_0x0129
        L_0x0124:
            java.lang.String r2 = "true"
            java.lang.String r4 = "TRUE"
            r6 = r9
        L_0x0129:
            int r7 = r2.length()
            r8 = r3
        L_0x012e:
            if (r8 >= r7) goto L_0x0155
            int r10 = r0.f230i
            int r10 = r10 + r8
            int r11 = r0.f231j
            if (r10 < r11) goto L_0x0140
            int r10 = r8 + 1
            boolean r10 = r0.h(r10)
            if (r10 != 0) goto L_0x0140
            goto L_0x0116
        L_0x0140:
            int r10 = r0.f230i
            int r10 = r10 + r8
            char r10 = r5[r10]
            char r11 = r2.charAt(r8)
            if (r10 == r11) goto L_0x0152
            char r11 = r4.charAt(r8)
            if (r10 == r11) goto L_0x0152
            goto L_0x0116
        L_0x0152:
            int r8 = r8 + 1
            goto L_0x012e
        L_0x0155:
            int r2 = r0.f230i
            int r2 = r2 + r7
            int r4 = r0.f231j
            if (r2 < r4) goto L_0x0164
            int r2 = r7 + 1
            boolean r2 = r0.h(r2)
            if (r2 == 0) goto L_0x0170
        L_0x0164:
            int r2 = r0.f230i
            int r2 = r2 + r7
            char r2 = r5[r2]
            boolean r2 = r0.k(r2)
            if (r2 == 0) goto L_0x0170
            goto L_0x0116
        L_0x0170:
            int r2 = r0.f230i
            int r2 = r2 + r7
            r0.f230i = r2
            r0.f234m = r6
        L_0x0177:
            if (r6 == 0) goto L_0x017a
            return r6
        L_0x017a:
            int r2 = r0.f230i
            int r4 = r0.f231j
            r6 = 0
            r8 = r1
            r10 = r8
            r16 = r10
            r11 = r3
            r14 = r6
        L_0x0186:
            int r1 = r2 + r10
            if (r1 != r4) goto L_0x01a1
            int r1 = r5.length
            if (r10 != r1) goto L_0x0190
        L_0x018d:
            r10 = 0
            goto L_0x0277
        L_0x0190:
            int r1 = r10 + 1
            boolean r1 = r0.h(r1)
            if (r1 != 0) goto L_0x019b
        L_0x0198:
            r1 = 2
            goto L_0x0214
        L_0x019b:
            int r1 = r0.f230i
            int r2 = r0.f231j
            r4 = r2
            r2 = r1
        L_0x01a1:
            int r1 = r2 + r10
            char r1 = r5[r1]
            r12 = 43
            if (r1 == r12) goto L_0x0269
            r12 = 69
            if (r1 == r12) goto L_0x025e
            r12 = 101(0x65, float:1.42E-43)
            if (r1 == r12) goto L_0x025e
            r12 = 45
            if (r1 == r12) goto L_0x0250
            r12 = 46
            if (r1 == r12) goto L_0x0248
            r12 = 48
            if (r1 < r12) goto L_0x020d
            r12 = 57
            if (r1 <= r12) goto L_0x01c2
            goto L_0x020d
        L_0x01c2:
            if (r8 == r3) goto L_0x01c6
            if (r8 != 0) goto L_0x01ca
        L_0x01c6:
            r17 = r4
            r3 = 6
            goto L_0x0206
        L_0x01ca:
            r12 = 2
            if (r8 != r12) goto L_0x01f6
            int r12 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r12 != 0) goto L_0x01d2
            goto L_0x018d
        L_0x01d2:
            r18 = 10
            long r18 = r18 * r14
            int r1 = r1 + -48
            r17 = r4
            long r3 = (long) r1
            long r18 = r18 - r3
            r3 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r1 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x01ef
            if (r1 != 0) goto L_0x01ed
            int r1 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r1 >= 0) goto L_0x01ed
            goto L_0x01ef
        L_0x01ed:
            r1 = 0
            goto L_0x01f0
        L_0x01ef:
            r1 = 1
        L_0x01f0:
            r11 = r11 & r1
            r14 = r18
            r3 = 6
            goto L_0x026f
        L_0x01f6:
            r17 = r4
            if (r8 != r13) goto L_0x01fe
            r3 = 6
            r8 = 4
            goto L_0x026f
        L_0x01fe:
            r3 = 6
            if (r8 == r9) goto L_0x0203
            if (r8 != r3) goto L_0x026f
        L_0x0203:
            r8 = 7
            goto L_0x026f
        L_0x0206:
            int r1 = r1 + -48
            int r1 = -r1
            long r14 = (long) r1
            r8 = 2
            goto L_0x026f
        L_0x020d:
            boolean r1 = r0.k(r1)
            if (r1 != 0) goto L_0x018d
            goto L_0x0198
        L_0x0214:
            if (r8 != r1) goto L_0x0239
            if (r11 == 0) goto L_0x0221
            r1 = -9223372036854775808
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0223
            if (r16 == 0) goto L_0x0221
            goto L_0x0223
        L_0x0221:
            r1 = 2
            goto L_0x0239
        L_0x0223:
            int r1 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0229
            if (r16 != 0) goto L_0x0221
        L_0x0229:
            if (r16 == 0) goto L_0x022c
            goto L_0x022d
        L_0x022c:
            long r14 = -r14
        L_0x022d:
            r0.f235n = r14
            int r1 = r0.f230i
            int r1 = r1 + r10
            r0.f230i = r1
            r10 = 15
            r0.f234m = r10
            goto L_0x0277
        L_0x0239:
            if (r8 == r1) goto L_0x0241
            r1 = 4
            if (r8 == r1) goto L_0x0241
            r1 = 7
            if (r8 != r1) goto L_0x018d
        L_0x0241:
            r0.f236o = r10
            r10 = 16
            r0.f234m = r10
            goto L_0x0277
        L_0x0248:
            r17 = r4
            r1 = 2
            r3 = 6
            if (r8 != r1) goto L_0x018d
            r8 = r13
            goto L_0x026f
        L_0x0250:
            r17 = r4
            r1 = 2
            r3 = 6
            if (r8 != 0) goto L_0x025a
            r8 = 1
            r16 = 1
            goto L_0x026f
        L_0x025a:
            if (r8 != r9) goto L_0x018d
        L_0x025c:
            r8 = r3
            goto L_0x026f
        L_0x025e:
            r17 = r4
            r1 = 2
            r3 = 6
            if (r8 == r1) goto L_0x0267
            r1 = 4
            if (r8 != r1) goto L_0x018d
        L_0x0267:
            r8 = r9
            goto L_0x026f
        L_0x0269:
            r17 = r4
            r3 = 6
            if (r8 != r9) goto L_0x018d
            goto L_0x025c
        L_0x026f:
            int r10 = r10 + 1
            r12 = r3
            r4 = r17
            r3 = 1
            goto L_0x0186
        L_0x0277:
            if (r10 == 0) goto L_0x027a
            return r10
        L_0x027a:
            int r1 = r0.f230i
            char r1 = r5[r1]
            boolean r1 = r0.k(r1)
            if (r1 == 0) goto L_0x028c
            r20.c()
            r1 = 10
            r0.f234m = r1
            return r1
        L_0x028c:
            java.lang.String r1 = "Expected value"
            r0.C(r1)
            r1 = 0
            throw r1
        L_0x0293:
            r1 = r3
            r0.f234m = r1
            return r1
        L_0x0297:
            r1 = r3
            if (r4 != r1) goto L_0x02a2
            r2 = 4
            r0.f234m = r2
            return r2
        L_0x029e:
            r0.f234m = r13
            return r13
        L_0x02a1:
            r1 = r3
        L_0x02a2:
            if (r4 == r1) goto L_0x02af
            r2 = 2
            if (r4 != r2) goto L_0x02a8
            goto L_0x02af
        L_0x02a8:
            java.lang.String r1 = "Unexpected value"
            r0.C(r1)
            r1 = 0
            throw r1
        L_0x02af:
            r20.c()
            int r2 = r0.f230i
            int r2 = r2 - r1
            r0.f230i = r2
            r1 = 7
            r0.f234m = r1
            return r1
        L_0x02bb:
            r20.c()
            r1 = 8
            r0.f234m = r1
            return r1
        L_0x02c3:
            r1 = 9
            r0.f234m = r1
            return r1
        L_0x02c8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x02d0:
            r1[r2] = r3
            if (r4 != r9) goto L_0x02ed
            r1 = 1
            int r2 = r0.r(r1)
            if (r2 == r7) goto L_0x02ed
            if (r2 == r15) goto L_0x02ea
            if (r2 != r8) goto L_0x02e3
            r1 = 2
            r0.f234m = r1
            return r1
        L_0x02e3:
            java.lang.String r1 = "Unterminated object"
            r0.C(r1)
            r1 = 0
            throw r1
        L_0x02ea:
            r20.c()
        L_0x02ed:
            r1 = 1
            int r2 = r0.r(r1)
            r3 = 34
            if (r2 == r3) goto L_0x0328
            if (r2 == r11) goto L_0x0320
            java.lang.String r3 = "Expected name"
            if (r2 == r8) goto L_0x0315
            r20.c()
            int r4 = r0.f230i
            int r4 = r4 - r1
            r0.f230i = r4
            char r1 = (char) r2
            boolean r1 = r0.k(r1)
            if (r1 == 0) goto L_0x0310
            r1 = 14
            r0.f234m = r1
            return r1
        L_0x0310:
            r0.C(r3)
            r1 = 0
            throw r1
        L_0x0315:
            r1 = 0
            if (r4 == r9) goto L_0x031c
            r2 = 2
            r0.f234m = r2
            return r2
        L_0x031c:
            r0.C(r3)
            throw r1
        L_0x0320:
            r20.c()
            r1 = 12
            r0.f234m = r1
            return r1
        L_0x0328:
            r1 = 13
            r0.f234m = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.b.d():int");
    }

    public void e() {
        int i3 = this.f234m;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 4) {
            int i4 = this.f239r;
            this.f239r = i4 - 1;
            int[] iArr = this.f241t;
            int i5 = i4 - 2;
            iArr[i5] = iArr[i5] + 1;
            this.f234m = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + h.l(w()) + l());
    }

    public void g() {
        int i3 = this.f234m;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 2) {
            int i4 = this.f239r;
            int i5 = i4 - 1;
            this.f239r = i5;
            this.f240s[i5] = null;
            int[] iArr = this.f241t;
            int i6 = i4 - 2;
            iArr[i6] = iArr[i6] + 1;
            this.f234m = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + h.l(w()) + l());
    }

    public final boolean h(int i3) {
        int i4;
        int i5;
        int i6 = this.f233l;
        int i7 = this.f230i;
        this.f233l = i6 - i7;
        int i8 = this.f231j;
        char[] cArr = this.f229h;
        if (i8 != i7) {
            int i9 = i8 - i7;
            this.f231j = i9;
            System.arraycopy(cArr, i7, cArr, 0, i9);
        } else {
            this.f231j = 0;
        }
        this.f230i = 0;
        do {
            int i10 = this.f231j;
            int read = this.f227f.read(cArr, i10, cArr.length - i10);
            if (read == -1) {
                return false;
            }
            i4 = this.f231j + read;
            this.f231j = i4;
            if (this.f232k == 0 && (i5 = this.f233l) == 0 && i4 > 0 && cArr[0] == 65279) {
                this.f230i++;
                this.f233l = i5 + 1;
                i3++;
                continue;
            }
        } while (i4 < i3);
        return true;
    }

    public String i() {
        StringBuilder sb = new StringBuilder("$");
        int i3 = this.f239r;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = this.f238q[i4];
            if (i5 == 1 || i5 == 2) {
                sb.append('[');
                sb.append(this.f241t[i4]);
                sb.append(']');
            } else if (i5 == 3 || i5 == 4 || i5 == 5) {
                sb.append('.');
                String str = this.f240s[i4];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public boolean j() {
        int i3 = this.f234m;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 2 || i3 == 4) {
            return false;
        }
        return true;
    }

    public final boolean k(char c3) {
        if (c3 == 9 || c3 == 10 || c3 == 12 || c3 == 13 || c3 == ' ') {
            return false;
        }
        if (c3 != '#') {
            if (c3 == ',') {
                return false;
            }
            if (!(c3 == '/' || c3 == '=')) {
                if (c3 == '{' || c3 == '}' || c3 == ':') {
                    return false;
                }
                if (c3 != ';') {
                    switch (c3) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        c();
        return false;
    }

    /* access modifiers changed from: package-private */
    public final String l() {
        return " at line " + (this.f232k + 1) + " column " + ((this.f230i - this.f233l) + 1) + " path " + i();
    }

    public boolean m() {
        int i3 = this.f234m;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 5) {
            this.f234m = 0;
            int[] iArr = this.f241t;
            int i4 = this.f239r - 1;
            iArr[i4] = iArr[i4] + 1;
            return true;
        } else if (i3 == 6) {
            this.f234m = 0;
            int[] iArr2 = this.f241t;
            int i5 = this.f239r - 1;
            iArr2[i5] = iArr2[i5] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + h.l(w()) + l());
        }
    }

    public double n() {
        char c3;
        int i3 = this.f234m;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 15) {
            this.f234m = 0;
            int[] iArr = this.f241t;
            int i4 = this.f239r - 1;
            iArr[i4] = iArr[i4] + 1;
            return (double) this.f235n;
        }
        if (i3 == 16) {
            this.f237p = new String(this.f229h, this.f230i, this.f236o);
            this.f230i += this.f236o;
        } else if (i3 == 8 || i3 == 9) {
            if (i3 == 8) {
                c3 = '\'';
            } else {
                c3 = '\"';
            }
            this.f237p = t(c3);
        } else if (i3 == 10) {
            this.f237p = v();
        } else if (i3 != 11) {
            throw new IllegalStateException("Expected a double but was " + h.l(w()) + l());
        }
        this.f234m = 11;
        double parseDouble = Double.parseDouble(this.f237p);
        if (this.f228g || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f237p = null;
            this.f234m = 0;
            int[] iArr2 = this.f241t;
            int i5 = this.f239r - 1;
            iArr2[i5] = iArr2[i5] + 1;
            return parseDouble;
        }
        throw new IOException("JSON forbids NaN and infinities: " + parseDouble + l());
    }

    public int o() {
        char c3;
        int i3 = this.f234m;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 15) {
            long j3 = this.f235n;
            int i4 = (int) j3;
            if (j3 == ((long) i4)) {
                this.f234m = 0;
                int[] iArr = this.f241t;
                int i5 = this.f239r - 1;
                iArr[i5] = iArr[i5] + 1;
                return i4;
            }
            throw new NumberFormatException("Expected an int but was " + this.f235n + l());
        }
        if (i3 == 16) {
            this.f237p = new String(this.f229h, this.f230i, this.f236o);
            this.f230i += this.f236o;
        } else if (i3 == 8 || i3 == 9 || i3 == 10) {
            if (i3 == 10) {
                this.f237p = v();
            } else {
                if (i3 == 8) {
                    c3 = '\'';
                } else {
                    c3 = '\"';
                }
                this.f237p = t(c3);
            }
            try {
                int parseInt = Integer.parseInt(this.f237p);
                this.f234m = 0;
                int[] iArr2 = this.f241t;
                int i6 = this.f239r - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + h.l(w()) + l());
        }
        this.f234m = 11;
        double parseDouble = Double.parseDouble(this.f237p);
        int i7 = (int) parseDouble;
        if (((double) i7) == parseDouble) {
            this.f237p = null;
            this.f234m = 0;
            int[] iArr3 = this.f241t;
            int i8 = this.f239r - 1;
            iArr3[i8] = iArr3[i8] + 1;
            return i7;
        }
        throw new NumberFormatException("Expected an int but was " + this.f237p + l());
    }

    public long p() {
        char c3;
        int i3 = this.f234m;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 15) {
            this.f234m = 0;
            int[] iArr = this.f241t;
            int i4 = this.f239r - 1;
            iArr[i4] = iArr[i4] + 1;
            return this.f235n;
        }
        if (i3 == 16) {
            this.f237p = new String(this.f229h, this.f230i, this.f236o);
            this.f230i += this.f236o;
        } else if (i3 == 8 || i3 == 9 || i3 == 10) {
            if (i3 == 10) {
                this.f237p = v();
            } else {
                if (i3 == 8) {
                    c3 = '\'';
                } else {
                    c3 = '\"';
                }
                this.f237p = t(c3);
            }
            try {
                long parseLong = Long.parseLong(this.f237p);
                this.f234m = 0;
                int[] iArr2 = this.f241t;
                int i5 = this.f239r - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + h.l(w()) + l());
        }
        this.f234m = 11;
        double parseDouble = Double.parseDouble(this.f237p);
        long j3 = (long) parseDouble;
        if (((double) j3) == parseDouble) {
            this.f237p = null;
            this.f234m = 0;
            int[] iArr3 = this.f241t;
            int i6 = this.f239r - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return j3;
        }
        throw new NumberFormatException("Expected a long but was " + this.f237p + l());
    }

    public String q() {
        String str;
        int i3 = this.f234m;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 14) {
            str = v();
        } else if (i3 == 12) {
            str = t('\'');
        } else if (i3 == 13) {
            str = t('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + h.l(w()) + l());
        }
        this.f234m = 0;
        this.f240s[this.f239r - 1] = str;
        return str;
    }

    public final int r(boolean z3) {
        int i3 = this.f230i;
        int i4 = this.f231j;
        while (true) {
            if (i3 == i4) {
                this.f230i = i3;
                if (h(1)) {
                    i3 = this.f230i;
                    i4 = this.f231j;
                } else if (!z3) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + l());
                }
            }
            int i5 = i3 + 1;
            char[] cArr = this.f229h;
            char c3 = cArr[i3];
            if (c3 == 10) {
                this.f232k++;
                this.f233l = i5;
            } else if (!(c3 == ' ' || c3 == 13 || c3 == 9)) {
                if (c3 == '/') {
                    this.f230i = i5;
                    if (i5 == i4) {
                        this.f230i = i3;
                        boolean h3 = h(2);
                        this.f230i++;
                        if (!h3) {
                            return c3;
                        }
                    }
                    c();
                    int i6 = this.f230i;
                    char c4 = cArr[i6];
                    if (c4 == '*') {
                        this.f230i = i6 + 1;
                        while (true) {
                            if (this.f230i + 2 <= this.f231j || h(2)) {
                                int i7 = this.f230i;
                                if (cArr[i7] != 10) {
                                    int i8 = 0;
                                    while (i8 < 2) {
                                        if (cArr[this.f230i + i8] == "*/".charAt(i8)) {
                                            i8++;
                                        }
                                    }
                                    i3 = this.f230i + 2;
                                    i4 = this.f231j;
                                    break;
                                }
                                this.f232k++;
                                this.f233l = i7 + 1;
                                this.f230i++;
                            } else {
                                C("Unterminated comment");
                                throw null;
                            }
                        }
                    } else if (c4 != '/') {
                        return c3;
                    } else {
                        this.f230i = i6 + 1;
                        A();
                        i3 = this.f230i;
                        i4 = this.f231j;
                    }
                } else if (c3 == '#') {
                    this.f230i = i5;
                    c();
                    A();
                    i3 = this.f230i;
                    i4 = this.f231j;
                } else {
                    this.f230i = i5;
                    return c3;
                }
            }
            i3 = i5;
        }
    }

    public void s() {
        int i3 = this.f234m;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 7) {
            this.f234m = 0;
            int[] iArr = this.f241t;
            int i4 = this.f239r - 1;
            iArr[i4] = iArr[i4] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + h.l(w()) + l());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        r10.f230i = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r1 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (r1 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        r1.append(r5, r3, r2 - r3);
        r10.f230i = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String t(char r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r10.f230i
            int r3 = r10.f231j
        L_0x0006:
            r4 = r3
            r3 = r2
        L_0x0008:
            char[] r5 = r10.f229h
            r6 = 1
            r7 = 16
            if (r2 >= r4) goto L_0x005b
            int r8 = r2 + 1
            char r2 = r5[r2]
            if (r2 != r11) goto L_0x0029
            r10.f230i = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L_0x0021
            java.lang.String r11 = new java.lang.String
            r11.<init>(r5, r3, r8)
            return r11
        L_0x0021:
            r1.append(r5, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L_0x0029:
            r9 = 92
            if (r2 != r9) goto L_0x004e
            r10.f230i = r8
            int r8 = r8 - r3
            int r2 = r8 + -1
            if (r1 != 0) goto L_0x003f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r7)
            r1.<init>(r4)
        L_0x003f:
            r1.append(r5, r3, r2)
            char r2 = r10.y()
            r1.append(r2)
            int r2 = r10.f230i
            int r3 = r10.f231j
            goto L_0x0006
        L_0x004e:
            r5 = 10
            if (r2 != r5) goto L_0x0059
            int r2 = r10.f232k
            int r2 = r2 + r6
            r10.f232k = r2
            r10.f233l = r8
        L_0x0059:
            r2 = r8
            goto L_0x0008
        L_0x005b:
            if (r1 != 0) goto L_0x006b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r7)
            r4.<init>(r1)
            r1 = r4
        L_0x006b:
            int r4 = r2 - r3
            r1.append(r5, r3, r4)
            r10.f230i = r2
            boolean r2 = r10.h(r6)
            if (r2 == 0) goto L_0x0079
            goto L_0x0002
        L_0x0079:
            java.lang.String r11 = "Unterminated string"
            r10.C(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.b.t(char):java.lang.String");
    }

    public String toString() {
        return getClass().getSimpleName() + l();
    }

    public String u() {
        String str;
        int i3 = this.f234m;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 10) {
            str = v();
        } else if (i3 == 8) {
            str = t('\'');
        } else if (i3 == 9) {
            str = t('\"');
        } else if (i3 == 11) {
            str = this.f237p;
            this.f237p = null;
        } else if (i3 == 15) {
            str = Long.toString(this.f235n);
        } else if (i3 == 16) {
            str = new String(this.f229h, this.f230i, this.f236o);
            this.f230i += this.f236o;
        } else {
            throw new IllegalStateException("Expected a string but was " + h.l(w()) + l());
        }
        this.f234m = 0;
        int[] iArr = this.f241t;
        int i4 = this.f239r - 1;
        iArr[i4] = iArr[i4] + 1;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String v() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r1
        L_0x0003:
            int r3 = r7.f230i
            int r4 = r3 + r2
            int r5 = r7.f231j
            char[] r6 = r7.f229h
            if (r4 >= r5) goto L_0x004e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005a
            r4 = 10
            if (r3 == r4) goto L_0x005a
            r4 = 12
            if (r3 == r4) goto L_0x005a
            r4 = 13
            if (r3 == r4) goto L_0x005a
            r4 = 32
            if (r3 == r4) goto L_0x005a
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005a
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005a
            r4 = 58
            if (r3 == r4) goto L_0x005a
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005a;
                case 92: goto L_0x004a;
                case 93: goto L_0x005a;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r7.c()
            goto L_0x005a
        L_0x004e:
            int r3 = r6.length
            if (r2 >= r3) goto L_0x005c
            int r3 = r2 + 1
            boolean r3 = r7.h(r3)
            if (r3 == 0) goto L_0x005a
            goto L_0x0003
        L_0x005a:
            r1 = r2
            goto L_0x007a
        L_0x005c:
            if (r0 != 0) goto L_0x0069
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L_0x0069:
            int r3 = r7.f230i
            r0.append(r6, r3, r2)
            int r3 = r7.f230i
            int r3 = r3 + r2
            r7.f230i = r3
            r2 = 1
            boolean r2 = r7.h(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007a:
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f230i
            r0.<init>(r6, r2, r1)
            goto L_0x008d
        L_0x0084:
            int r2 = r7.f230i
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L_0x008d:
            int r2 = r7.f230i
            int r2 = r2 + r1
            r7.f230i = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.b.v():java.lang.String");
    }

    public int w() {
        int i3 = this.f234m;
        if (i3 == 0) {
            i3 = d();
        }
        switch (i3) {
            case 1:
                return 3;
            case k.FLOAT_FIELD_NUMBER /*2*/:
                return 4;
            case k.INTEGER_FIELD_NUMBER /*3*/:
                return 1;
            case k.LONG_FIELD_NUMBER /*4*/:
                return 2;
            case k.STRING_FIELD_NUMBER /*5*/:
            case k.STRING_SET_FIELD_NUMBER /*6*/:
                return 8;
            case k.DOUBLE_FIELD_NUMBER /*7*/:
                return 9;
            case k.BYTES_FIELD_NUMBER /*8*/:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void x(int i3) {
        int i4 = this.f239r;
        int[] iArr = this.f238q;
        if (i4 == iArr.length) {
            int i5 = i4 * 2;
            this.f238q = Arrays.copyOf(iArr, i5);
            this.f241t = Arrays.copyOf(this.f241t, i5);
            this.f240s = (String[]) Arrays.copyOf(this.f240s, i5);
        }
        int[] iArr2 = this.f238q;
        int i6 = this.f239r;
        this.f239r = i6 + 1;
        iArr2[i6] = i3;
    }

    public final char y() {
        int i3;
        if (this.f230i != this.f231j || h(1)) {
            int i4 = this.f230i;
            int i5 = i4 + 1;
            this.f230i = i5;
            char[] cArr = this.f229h;
            char c3 = cArr[i4];
            if (c3 == 10) {
                this.f232k++;
                this.f233l = i5;
            } else if (!(c3 == '\"' || c3 == '\'' || c3 == '/' || c3 == '\\')) {
                if (c3 == 'b') {
                    return 8;
                }
                if (c3 == 'f') {
                    return 12;
                }
                if (c3 == 'n') {
                    return 10;
                }
                if (c3 == 'r') {
                    return 13;
                }
                if (c3 == 't') {
                    return 9;
                }
                if (c3 != 'u') {
                    C("Invalid escape sequence");
                    throw null;
                } else if (i4 + 5 <= this.f231j || h(4)) {
                    int i6 = this.f230i;
                    int i7 = i6 + 4;
                    char c4 = 0;
                    while (i6 < i7) {
                        char c5 = cArr[i6];
                        char c6 = (char) (c4 << 4);
                        if (c5 >= '0' && c5 <= '9') {
                            i3 = c5 - '0';
                        } else if (c5 >= 'a' && c5 <= 'f') {
                            i3 = c5 - 'W';
                        } else if (c5 < 'A' || c5 > 'F') {
                            throw new NumberFormatException("\\u".concat(new String(cArr, this.f230i, 4)));
                        } else {
                            i3 = c5 - '7';
                        }
                        c4 = (char) (i3 + c6);
                        i6++;
                    }
                    this.f230i += 4;
                    return c4;
                } else {
                    C("Unterminated escape sequence");
                    throw null;
                }
            }
            return c3;
        }
        C("Unterminated escape sequence");
        throw null;
    }

    public final void z(char c3) {
        do {
            int i3 = this.f230i;
            int i4 = this.f231j;
            while (i3 < i4) {
                int i5 = i3 + 1;
                char c4 = this.f229h[i3];
                if (c4 == c3) {
                    this.f230i = i5;
                    return;
                } else if (c4 == '\\') {
                    this.f230i = i5;
                    y();
                    i3 = this.f230i;
                    i4 = this.f231j;
                } else {
                    if (c4 == 10) {
                        this.f232k++;
                        this.f233l = i5;
                    }
                    i3 = i5;
                }
            }
            this.f230i = i3;
        } while (h(1));
        C("Unterminated string");
        throw null;
    }
}
