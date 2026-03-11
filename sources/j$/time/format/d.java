package j$.time.format;

final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final char f5066a;

    d(char c3) {
        this.f5066a = c3;
    }

    public final boolean p(t tVar, StringBuilder sb) {
        sb.append(this.f5066a);
        return true;
    }

    public final int r(q qVar, CharSequence charSequence, int i3) {
        if (i3 == charSequence.length()) {
            return ~i3;
        }
        char charAt = charSequence.charAt(i3);
        char c3 = this.f5066a;
        return (charAt == c3 || (!qVar.j() && (Character.toUpperCase(charAt) == Character.toUpperCase(c3) || Character.toLowerCase(charAt) == Character.toLowerCase(c3)))) ? i3 + 1 : ~i3;
    }

    public final String toString() {
        char c3 = this.f5066a;
        if (c3 == '\'') {
            return "''";
        }
        return "'" + c3 + "'";
    }
}
