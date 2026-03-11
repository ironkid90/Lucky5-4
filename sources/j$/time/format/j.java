package j$.time.format;

import L.k;
import j$.time.temporal.a;

final class j implements f {

    /* renamed from: d  reason: collision with root package name */
    static final String[] f5076d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* renamed from: e  reason: collision with root package name */
    static final j f5077e = new j("+HH:MM:ss", "Z");

    /* renamed from: f  reason: collision with root package name */
    static final j f5078f = new j("+HH:MM:ss", "0");

    /* renamed from: a  reason: collision with root package name */
    private final String f5079a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5080b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5081c;

    j(String str, String str2) {
        int i3 = 0;
        while (true) {
            String[] strArr = f5076d;
            if (i3 >= 22) {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            } else if (strArr[i3].equals(str)) {
                this.f5080b = i3;
                this.f5081c = i3 % 11;
                this.f5079a = str2;
                return;
            } else {
                i3++;
            }
        }
    }

    public final boolean p(t tVar, StringBuilder sb) {
        String str;
        Long e2 = tVar.e(a.OFFSET_SECONDS);
        boolean z3 = false;
        if (e2 == null) {
            return false;
        }
        int intExact = Math.toIntExact(e2.longValue());
        String str2 = this.f5079a;
        if (intExact == 0) {
            sb.append(str2);
        } else {
            int abs = Math.abs((intExact / 3600) % 100);
            int abs2 = Math.abs((intExact / 60) % 60);
            int abs3 = Math.abs(intExact % 60);
            int length = sb.length();
            if (intExact < 0) {
                str = "-";
            } else {
                str = "+";
            }
            sb.append(str);
            if (this.f5080b >= 11 && abs < 10) {
                sb.append((char) (abs + 48));
            } else {
                a(false, abs, sb);
            }
            int i3 = this.f5081c;
            if ((i3 >= 3 && i3 <= 8) || ((i3 >= 9 && abs3 > 0) || (i3 >= 1 && abs2 > 0))) {
                a(i3 > 0 && i3 % 2 == 0, abs2, sb);
                abs += abs2;
                if (i3 == 7 || i3 == 8 || (i3 >= 5 && abs3 > 0)) {
                    if (i3 > 0 && i3 % 2 == 0) {
                        z3 = true;
                    }
                    a(z3, abs3, sb);
                    abs += abs3;
                }
            }
            if (abs == 0) {
                sb.setLength(length);
                sb.append(str2);
            }
        }
        return true;
    }

    private static void a(boolean z3, int i3, StringBuilder sb) {
        sb.append(z3 ? ":" : "");
        sb.append((char) ((i3 / 10) + 48));
        sb.append((char) ((i3 % 10) + 48));
    }

    public final int r(q qVar, CharSequence charSequence, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        CharSequence charSequence2 = charSequence;
        int i8 = i3;
        int length = charSequence.length();
        int length2 = this.f5079a.length();
        if (length2 == 0) {
            if (i8 == length) {
                return qVar.n(a.OFFSET_SECONDS, 0, i3, i3);
            }
        } else if (i8 == length) {
            return ~i8;
        } else {
            if (qVar.r(charSequence, i3, this.f5079a, 0, length2)) {
                return qVar.n(a.OFFSET_SECONDS, 0, i3, i8 + length2);
            }
        }
        char charAt = charSequence.charAt(i3);
        if (charAt == '+' || charAt == '-') {
            int i9 = charAt == '-' ? -1 : 1;
            int i10 = this.f5081c;
            boolean z3 = i10 > 0 && i10 % 2 == 0;
            int i11 = this.f5080b;
            boolean z4 = i11 < 11;
            int[] iArr = new int[4];
            iArr[0] = i8 + 1;
            if (!qVar.k()) {
                if (z4) {
                    if (z3 || (i11 == 0 && length > (i7 = i8 + 3) && charSequence2.charAt(i7) == ':')) {
                        i11 = 10;
                    } else {
                        i11 = 9;
                    }
                } else if (z3 || (i11 == 11 && length > (i6 = i8 + 3) && (charSequence2.charAt(i8 + 2) == ':' || charSequence2.charAt(i6) == ':'))) {
                    i11 = 21;
                } else {
                    i11 = 20;
                }
                z3 = true;
            }
            switch (i11) {
                case 0:
                case 11:
                    c(charSequence2, z4, iArr);
                    break;
                case 1:
                case k.FLOAT_FIELD_NUMBER:
                case 13:
                    c(charSequence2, z4, iArr);
                    d(charSequence2, z3, false, iArr);
                    break;
                case k.INTEGER_FIELD_NUMBER:
                case k.LONG_FIELD_NUMBER:
                case 15:
                    c(charSequence2, z4, iArr);
                    d(charSequence2, z3, true, iArr);
                    break;
                case k.STRING_FIELD_NUMBER:
                case k.STRING_SET_FIELD_NUMBER:
                case 17:
                    c(charSequence2, z4, iArr);
                    d(charSequence2, z3, true, iArr);
                    b(charSequence2, z3, 3, iArr);
                    break;
                case k.DOUBLE_FIELD_NUMBER:
                case k.BYTES_FIELD_NUMBER:
                case 19:
                    c(charSequence2, z4, iArr);
                    d(charSequence2, z3, true, iArr);
                    if (!b(charSequence2, z3, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                        break;
                    }
                    break;
                case 9:
                case 10:
                case 21:
                    c(charSequence2, z4, iArr);
                    if (b(charSequence2, z3, 2, iArr)) {
                        b(charSequence2, z3, 3, iArr);
                        break;
                    }
                    break;
                case 12:
                    e(charSequence2, 1, 4, iArr);
                    break;
                case 14:
                    e(charSequence2, 3, 4, iArr);
                    break;
                case 16:
                    e(charSequence2, 3, 6, iArr);
                    break;
                case 18:
                    e(charSequence2, 5, 6, iArr);
                    break;
                case 20:
                    e(charSequence2, 1, 6, iArr);
                    break;
            }
            int i12 = iArr[0];
            if (i12 > 0) {
                int i13 = iArr[1];
                if (i13 > 23 || (i4 = iArr[2]) > 59 || (i5 = iArr[3]) > 59) {
                    throw new RuntimeException("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                return qVar.n(a.OFFSET_SECONDS, ((((long) i4) * 60) + (((long) i13) * 3600) + ((long) i5)) * ((long) i9), i3, i12);
            }
        }
        if (length2 != 0) {
            return ~i8;
        }
        return qVar.n(a.OFFSET_SECONDS, 0, i3, i3);
    }

    private static void c(CharSequence charSequence, boolean z3, int[] iArr) {
        if (!z3) {
            e(charSequence, 1, 2, iArr);
        } else if (!b(charSequence, false, 1, iArr)) {
            iArr[0] = ~iArr[0];
        }
    }

    private static void d(CharSequence charSequence, boolean z3, boolean z4, int[] iArr) {
        if (!b(charSequence, z3, 2, iArr) && z4) {
            iArr[0] = ~iArr[0];
        }
    }

    private static boolean b(CharSequence charSequence, boolean z3, int i3, int[] iArr) {
        int i4;
        int i5 = iArr[0];
        if (i5 < 0) {
            return true;
        }
        if (z3 && i3 != 1) {
            int i6 = i5 + 1;
            if (i6 > charSequence.length() || charSequence.charAt(i5) != ':') {
                return false;
            }
            i5 = i6;
        }
        int i7 = i5 + 2;
        if (i7 > charSequence.length()) {
            return false;
        }
        int i8 = i5 + 1;
        char charAt = charSequence.charAt(i5);
        char charAt2 = charSequence.charAt(i8);
        if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9' || (i4 = (charAt2 - '0') + ((charAt - '0') * 10)) < 0 || i4 > 59) {
            return false;
        }
        iArr[i3] = i4;
        iArr[0] = i7;
        return true;
    }

    private static void e(CharSequence charSequence, int i3, int i4, int[] iArr) {
        int i5;
        char charAt;
        int i6 = iArr[0];
        char[] cArr = new char[i4];
        int i7 = 0;
        int i8 = 0;
        while (i7 < i4 && (i5 = i6 + 1) <= charSequence.length() && (charAt = charSequence.charAt(i6)) >= '0' && charAt <= '9') {
            cArr[i7] = charAt;
            i8++;
            i7++;
            i6 = i5;
        }
        if (i8 < i3) {
            iArr[0] = ~iArr[0];
            return;
        }
        switch (i8) {
            case 1:
                iArr[1] = cArr[0] - '0';
                break;
            case k.FLOAT_FIELD_NUMBER:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                break;
            case k.INTEGER_FIELD_NUMBER:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                break;
            case k.LONG_FIELD_NUMBER:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                break;
            case k.STRING_FIELD_NUMBER:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                iArr[3] = (cArr[4] - '0') + ((cArr[3] - '0') * 10);
                break;
            case k.STRING_SET_FIELD_NUMBER:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                iArr[3] = (cArr[5] - '0') + ((cArr[4] - '0') * 10);
                break;
        }
        iArr[0] = i6;
    }

    public final String toString() {
        String replace = this.f5079a.replace("'", "''");
        String str = f5076d[this.f5080b];
        return "Offset(" + str + ",'" + replace + "')";
    }
}
