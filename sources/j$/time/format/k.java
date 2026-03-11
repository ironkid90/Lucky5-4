package j$.time.format;

final class k extends l {
    /* access modifiers changed from: protected */
    public final l d(String str, String str2, l lVar) {
        return new l(str, str2, lVar, 0);
    }

    /* access modifiers changed from: protected */
    public final boolean b(char c3, char c4) {
        return q.b(c3, c4);
    }

    /* access modifiers changed from: protected */
    public final boolean f(CharSequence charSequence, int i3, int i4) {
        int length = this.f5082a.length();
        if (length > i4 - i3) {
            return false;
        }
        int i5 = 0;
        while (true) {
            int i6 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i7 = i5 + 1;
            int i8 = i3 + 1;
            if (!q.b(this.f5082a.charAt(i5), charSequence.charAt(i3))) {
                return false;
            }
            i3 = i8;
            length = i6;
            i5 = i7;
        }
    }
}
