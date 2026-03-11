package j$.time.format;

import j$.time.temporal.r;
import j$.time.temporal.w;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

final class g extends i {

    /* renamed from: g  reason: collision with root package name */
    private final boolean f5069g;

    g(r rVar, int i3, int i4, boolean z3, int i5) {
        super(rVar, i3, i4, z.NOT_NEGATIVE, i5);
        this.f5069g = z3;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Enum, j$.time.temporal.r] */
    /* access modifiers changed from: package-private */
    public final i c() {
        if (this.f5075e == -1) {
            return this;
        }
        return new g(this.f5071a, this.f5072b, this.f5073c, this.f5069g, -1);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Enum, j$.time.temporal.r] */
    /* access modifiers changed from: package-private */
    public final i d(int i3) {
        return new g(this.f5071a, this.f5072b, this.f5073c, this.f5069g, this.f5075e + i3);
    }

    /* access modifiers changed from: package-private */
    public final boolean b(q qVar) {
        return qVar.k() && this.f5072b == this.f5073c && !this.f5069g;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Enum, j$.time.temporal.r] */
    public final boolean p(t tVar, StringBuilder sb) {
        ? r02 = this.f5071a;
        Long e2 = tVar.e(r02);
        if (e2 == null) {
            return false;
        }
        w b3 = tVar.b();
        long longValue = e2.longValue();
        w C3 = r02.C();
        C3.b(longValue, r02);
        BigDecimal valueOf = BigDecimal.valueOf(C3.e());
        BigDecimal add = BigDecimal.valueOf(C3.d()).subtract(valueOf).add(BigDecimal.ONE);
        BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            bigDecimal = divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros();
        }
        int scale = bigDecimal.scale();
        boolean z3 = this.f5069g;
        int i3 = this.f5072b;
        if (scale != 0) {
            String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i3), this.f5073c), roundingMode).toPlainString().substring(2);
            b3.getClass();
            if (z3) {
                sb.append('.');
            }
            sb.append(substring);
            return true;
        } else if (i3 <= 0) {
            return true;
        } else {
            if (z3) {
                b3.getClass();
                sb.append('.');
            }
            for (int i4 = 0; i4 < i3; i4++) {
                b3.getClass();
                sb.append('0');
            }
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Enum, j$.time.temporal.r] */
    public final int r(q qVar, CharSequence charSequence, int i3) {
        int i4 = (qVar.k() || b(qVar)) ? this.f5072b : 0;
        int i5 = (qVar.k() || b(qVar)) ? this.f5073c : 9;
        int length = charSequence.length();
        if (i3 == length) {
            return i4 > 0 ? ~i3 : i3;
        }
        if (this.f5069g) {
            char charAt = charSequence.charAt(i3);
            qVar.f().getClass();
            if (charAt != '.') {
                return i4 > 0 ? ~i3 : i3;
            }
            i3++;
        }
        int i6 = i3;
        int i7 = i4 + i6;
        if (i7 > length) {
            return ~i6;
        }
        int min = Math.min(i5 + i6, length);
        int i8 = 0;
        int i9 = i6;
        while (true) {
            if (i9 >= min) {
                break;
            }
            int i10 = i9 + 1;
            int a2 = qVar.f().a(charSequence.charAt(i9));
            if (a2 >= 0) {
                i8 = (i8 * 10) + a2;
                i9 = i10;
            } else if (i10 < i7) {
                return ~i6;
            }
        }
        BigDecimal movePointLeft = new BigDecimal(i8).movePointLeft(i9 - i6);
        ? r5 = this.f5071a;
        w C3 = r5.C();
        BigDecimal valueOf = BigDecimal.valueOf(C3.e());
        return qVar.n(r5, movePointLeft.multiply(BigDecimal.valueOf(C3.d()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact(), i6, i9);
    }

    public final String toString() {
        String str = this.f5069g ? ",DecimalPoint" : "";
        return "Fraction(" + this.f5071a + "," + this.f5072b + "," + this.f5073c + str + ")";
    }
}
