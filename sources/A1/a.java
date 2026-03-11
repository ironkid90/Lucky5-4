package A1;

import j$.util.DesugarTimeZone;
import java.util.TimeZone;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f65a = DesugarTimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i3, char c3) {
        if (i3 >= str.length() || str.charAt(i3) != c3) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:94:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date b(java.lang.String r18, java.text.ParsePosition r19) {
        /*
            r1 = r18
            r2 = r19
            int r0 = r19.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            int r3 = r0 + 4
            int r4 = c(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r5 = 45
            boolean r6 = a(r1, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r7 = 5
            if (r6 == 0) goto L_0x0019
            int r3 = r0 + 5
        L_0x0019:
            int r0 = r3 + 2
            int r6 = c(r1, r3, r0)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            boolean r8 = a(r1, r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            if (r8 == 0) goto L_0x0027
            int r0 = r3 + 3
        L_0x0027:
            int r3 = r0 + 2
            int r8 = c(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r9 = 84
            boolean r9 = a(r1, r3, r9)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r10 = 1
            if (r9 != 0) goto L_0x004a
            int r11 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            if (r11 > r3) goto L_0x004a
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            int r6 = r6 - r10
            r0.<init>(r4, r6, r8)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r2.setIndex(r3)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            java.util.Date r0 = r0.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            return r0
        L_0x004a:
            r11 = 2
            r12 = 43
            r13 = 90
            if (r9 == 0) goto L_0x00ee
            int r3 = r0 + 3
            int r9 = r0 + 5
            int r3 = c(r1, r3, r9)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r15 = 58
            boolean r16 = a(r1, r9, r15)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            if (r16 == 0) goto L_0x0063
            int r9 = r0 + 6
        L_0x0063:
            int r0 = r9 + 2
            int r16 = c(r1, r9, r0)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            boolean r15 = a(r1, r0, r15)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            if (r15 == 0) goto L_0x0072
            int r9 = r9 + 3
            r0 = r9
        L_0x0072:
            int r9 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            if (r9 <= r0) goto L_0x00e4
            char r9 = r1.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            if (r9 == r13) goto L_0x00e4
            if (r9 == r12) goto L_0x00e4
            if (r9 == r5) goto L_0x00e4
            int r9 = r0 + 2
            int r15 = c(r1, r0, r9)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r14 = 59
            if (r15 <= r14) goto L_0x0092
            r14 = 63
            if (r15 >= r14) goto L_0x0092
            r15 = 59
        L_0x0092:
            r14 = 46
            boolean r14 = a(r1, r9, r14)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            if (r14 == 0) goto L_0x00de
            int r9 = r0 + 3
            int r14 = r0 + 4
        L_0x009e:
            int r7 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            if (r14 >= r7) goto L_0x00b6
            char r7 = r1.charAt(r14)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r5 = 48
            if (r7 < r5) goto L_0x00bb
            r5 = 57
            if (r7 <= r5) goto L_0x00b1
            goto L_0x00bb
        L_0x00b1:
            int r14 = r14 + 1
            r5 = 45
            goto L_0x009e
        L_0x00b6:
            int r5 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r14 = r5
        L_0x00bb:
            int r0 = r0 + 6
            int r0 = java.lang.Math.min(r14, r0)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            int r5 = c(r1, r9, r0)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            int r0 = r0 - r9
            if (r0 == r10) goto L_0x00ce
            if (r0 == r11) goto L_0x00cb
            goto L_0x00d0
        L_0x00cb:
            int r5 = r5 * 10
            goto L_0x00d0
        L_0x00ce:
            int r5 = r5 * 100
        L_0x00d0:
            r0 = r3
            r3 = r14
            r7 = r16
            goto L_0x00f2
        L_0x00d5:
            r0 = move-exception
            goto L_0x01e3
        L_0x00d8:
            r0 = move-exception
            goto L_0x01e3
        L_0x00db:
            r0 = move-exception
            goto L_0x01e3
        L_0x00de:
            r0 = r3
            r3 = r9
            r7 = r16
            r5 = 0
            goto L_0x00f2
        L_0x00e4:
            r7 = r16
            r5 = 0
            r15 = 0
            r17 = r3
            r3 = r0
            r0 = r17
            goto L_0x00f2
        L_0x00ee:
            r0 = 0
            r5 = 0
            r7 = 0
            r15 = 0
        L_0x00f2:
            int r9 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            if (r9 <= r3) goto L_0x01db
            char r9 = r1.charAt(r3)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            java.util.TimeZone r14 = f65a
            if (r9 != r13) goto L_0x0103
            int r3 = r3 + r10
            goto L_0x01aa
        L_0x0103:
            if (r9 == r12) goto L_0x0126
            r12 = 45
            if (r9 != r12) goto L_0x010a
            goto L_0x0126
        L_0x010a:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r3.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
        L_0x0126:
            java.lang.String r9 = r1.substring(r3)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            int r12 = r9.length()     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r13 = 5
            if (r12 < r13) goto L_0x0132
            goto L_0x0143
        L_0x0132:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r12.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r12.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            java.lang.String r9 = "00"
            r12.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            java.lang.String r9 = r12.toString()     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
        L_0x0143:
            int r12 = r9.length()     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            int r3 = r3 + r12
            java.lang.String r12 = "+0000"
            boolean r12 = r12.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            if (r12 != 0) goto L_0x01aa
            java.lang.String r12 = "+00:00"
            boolean r12 = r12.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            if (r12 == 0) goto L_0x0159
            goto L_0x01aa
        L_0x0159:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r12.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            java.lang.String r13 = "GMT"
            r12.append(r13)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r12.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            java.lang.String r9 = r12.toString()     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            java.util.TimeZone r14 = j$.util.DesugarTimeZone.getTimeZone(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            java.lang.String r12 = r14.getID()     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            boolean r13 = r12.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            if (r13 != 0) goto L_0x01aa
            java.lang.String r13 = ":"
            java.lang.String r11 = ""
            java.lang.String r11 = r12.replace(r13, r11)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            boolean r11 = r11.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            if (r11 == 0) goto L_0x0187
            goto L_0x01aa
        L_0x0187:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            java.lang.String r4 = "Mismatching time zone indicator: "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r3.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            java.lang.String r4 = r14.getID()     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
        L_0x01aa:
            java.util.GregorianCalendar r9 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r9.<init>(r14)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r11 = 0
            r9.setLenient(r11)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r9.set(r10, r4)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            int r6 = r6 - r10
            r4 = 2
            r9.set(r4, r6)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r4 = 5
            r9.set(r4, r8)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r4 = 11
            r9.set(r4, r0)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r0 = 12
            r9.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r0 = 13
            r9.set(r0, r15)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r0 = 14
            r9.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            r2.setIndex(r3)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            java.util.Date r0 = r9.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            return r0
        L_0x01db:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, IllegalArgumentException -> 0x00d5 }
        L_0x01e3:
            if (r1 != 0) goto L_0x01e7
            r1 = 0
            goto L_0x01fa
        L_0x01e7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\""
            r3.<init>(r4)
            r3.append(r1)
            r1 = 34
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L_0x01fa:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x0206
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0221
        L_0x0206:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "("
            r3.<init>(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x0221:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to parse date ["
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r19.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(String str, int i3, int i4) {
        int i5;
        int i6;
        if (i3 < 0 || i4 > str.length() || i3 > i4) {
            throw new NumberFormatException(str);
        }
        if (i3 < i4) {
            i6 = i3 + 1;
            int digit = Character.digit(str.charAt(i3), 10);
            if (digit >= 0) {
                i5 = -digit;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i3, i4));
            }
        } else {
            i5 = 0;
            i6 = i3;
        }
        while (i6 < i4) {
            int i7 = i6 + 1;
            int digit2 = Character.digit(str.charAt(i6), 10);
            if (digit2 >= 0) {
                i5 = (i5 * 10) - digit2;
                i6 = i7;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i3, i4));
            }
        }
        return -i5;
    }
}
