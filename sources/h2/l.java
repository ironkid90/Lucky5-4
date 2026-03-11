package H2;

import A2.i;
import E2.a;
import E2.c;
import G2.f;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import q2.C0403f;

public abstract class l extends j {
    public static boolean b0(String str, String str2) {
        if (e0(2, str, str2, false) >= 0) {
            return true;
        }
        return false;
    }

    public static final int c0(CharSequence charSequence) {
        i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int d0(int i3, String str, String str2, boolean z3) {
        char upperCase;
        char upperCase2;
        i.e(str2, "string");
        if (!z3) {
            return str.indexOf(str2, i3);
        }
        int length = str.length();
        if (i3 < 0) {
            i3 = 0;
        }
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        a aVar = new a(i3, length, 1);
        int i4 = aVar.f254h;
        int i5 = aVar.f253g;
        int i6 = aVar.f252f;
        if (str == null || str2 == null) {
            if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
                loop1:
                while (true) {
                    int length3 = str2.length();
                    i.e(str, "other");
                    if (i6 >= 0 && str2.length() - length3 >= 0 && i6 <= str.length() - length3) {
                        int i7 = 0;
                        while (i7 < length3) {
                            char charAt = str2.charAt(i7);
                            char charAt2 = str.charAt(i6 + i7);
                            if (charAt == charAt2 || (z3 && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                                i7++;
                            }
                        }
                        break loop1;
                    }
                    if (i6 == i5) {
                        break;
                    }
                    i6 += i4;
                }
            }
            return -1;
        }
        if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
            while (true) {
                if (!i0(0, i6, str2.length(), str2, str, z3)) {
                    if (i6 == i5) {
                        break;
                    }
                    i6 += i4;
                } else {
                    break;
                }
            }
        }
        return -1;
        return i6;
    }

    public static /* synthetic */ int e0(int i3, String str, String str2, boolean z3) {
        if ((i3 & 4) != 0) {
            z3 = false;
        }
        return d0(0, str, str2, z3);
    }

    public static int f0(String str, char c3, boolean z3, int i3) {
        if ((i3 & 4) != 0) {
            z3 = false;
        }
        if (!z3) {
            return str.indexOf(c3, 0);
        }
        return g0(str, new char[]{c3}, 0, z3);
    }

    public static final int g0(CharSequence charSequence, char[] cArr, int i3, boolean z3) {
        char upperCase;
        char upperCase2;
        i.e(charSequence, "<this>");
        if (z3 || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i3 < 0) {
                i3 = 0;
            }
            int c0 = c0(charSequence);
            if (i3 > c0) {
                return -1;
            }
            loop0:
            while (true) {
                char charAt = charSequence.charAt(i3);
                int length = cArr.length;
                int i4 = 0;
                while (i4 < length) {
                    char c3 = cArr[i4];
                    if (c3 != charAt && (!z3 || !((upperCase = Character.toUpperCase(c3)) == (upperCase2 = Character.toUpperCase(charAt)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                        i4++;
                    }
                }
                if (i3 == c0) {
                    return -1;
                }
                i3++;
            }
            return i3;
        }
        int length2 = cArr.length;
        if (length2 == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length2 == 1) {
            return ((String) charSequence).indexOf(cArr[0], i3);
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static boolean h0(CharSequence charSequence) {
        i.e(charSequence, "<this>");
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            char charAt = charSequence.charAt(i3);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean i0(int i3, int i4, int i5, String str, String str2, boolean z3) {
        i.e(str, "<this>");
        i.e(str2, "other");
        if (!z3) {
            return str.regionMatches(i3, str2, i4, i5);
        }
        return str.regionMatches(z3, i3, str2, i4, i5);
    }

    public static String j0(String str, String str2, String str3) {
        int d02 = d0(0, str, str2, false);
        if (d02 < 0) {
            return str;
        }
        int length = str2.length();
        int i3 = 1;
        if (length >= 1) {
            i3 = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            int i4 = 0;
            do {
                sb.append(str, i4, d02);
                sb.append(str3);
                i4 = d02 + length;
                if (d02 >= str.length() || (d02 = d0(d02 + i3, str, str2, false)) <= 0) {
                    sb.append(str, i4, str.length());
                    String sb2 = sb.toString();
                    i.d(sb2, "toString(...)");
                }
                sb.append(str, i4, d02);
                sb.append(str3);
                i4 = d02 + length;
                break;
            } while ((d02 = d0(d02 + i3, str, str2, false)) <= 0);
            sb.append(str, i4, str.length());
            String sb22 = sb.toString();
            i.d(sb22, "toString(...)");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    public static List k0(String str, char[] cArr) {
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            int d02 = d0(0, str, valueOf, false);
            if (d02 == -1) {
                return M0.a.A(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i3 = 0;
            do {
                arrayList.add(str.subSequence(i3, d02).toString());
                i3 = valueOf.length() + d02;
                d02 = d0(i3, str, valueOf, false);
            } while (d02 != -1);
            arrayList.add(str.subSequence(i3, str.length()).toString());
            return arrayList;
        }
        c cVar = new c(str, 0, 0, new k(cArr, false));
        ArrayList arrayList2 = new ArrayList(C0403f.c0(new f(cVar)));
        b bVar = new b(cVar);
        while (bVar.hasNext()) {
            c cVar2 = (c) bVar.next();
            arrayList2.add(str.subSequence(cVar2.f252f, cVar2.f253g + 1).toString());
        }
        return arrayList2;
    }

    public static String l0(String str, String str2) {
        i.e(str2, "delimiter");
        int e02 = e0(6, str, str2, false);
        if (e02 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + e02, str.length());
        i.d(substring, "substring(...)");
        return substring;
    }

    public static Long m0(String str) {
        boolean z3;
        Long valueOf;
        String str2 = str;
        android.support.v4.media.session.a.i(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str2.charAt(0);
        long j3 = -9223372036854775807L;
        if (charAt < '0') {
            z3 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z3 = false;
                i3 = 1;
            } else if (charAt != '-') {
                return null;
            } else {
                j3 = Long.MIN_VALUE;
                i3 = 1;
            }
        } else {
            z3 = false;
        }
        long j4 = -256204778801521550L;
        long j5 = 0;
        long j6 = -256204778801521550L;
        while (i3 < length) {
            int digit = Character.digit(str2.charAt(i3), 10);
            if (digit < 0) {
                return null;
            }
            if (j5 < j6) {
                if (j6 != j4) {
                    return null;
                }
                j6 = j3 / ((long) 10);
                if (j5 < j6) {
                    return null;
                }
            }
            long j7 = j5 * ((long) 10);
            long j8 = (long) digit;
            if (j7 < j3 + j8) {
                return null;
            }
            j5 = j7 - j8;
            i3++;
            j4 = -256204778801521550L;
        }
        if (z3) {
            valueOf = Long.valueOf(j5);
        } else {
            valueOf = Long.valueOf(-j5);
        }
        return valueOf;
    }
}
