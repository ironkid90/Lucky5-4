package j$.time.format;

import java.text.ParsePosition;
import java.util.Iterator;
import java.util.Set;

class l {

    /* renamed from: a  reason: collision with root package name */
    protected String f5082a;

    /* renamed from: b  reason: collision with root package name */
    protected String f5083b;

    /* renamed from: c  reason: collision with root package name */
    protected char f5084c;

    /* renamed from: d  reason: collision with root package name */
    protected l f5085d;

    /* renamed from: e  reason: collision with root package name */
    protected l f5086e;

    /* synthetic */ l(String str, String str2, l lVar, int i3) {
        this(str, str2, lVar);
    }

    /* access modifiers changed from: protected */
    public boolean b(char c3, char c4) {
        return c3 == c4;
    }

    private l(String str, String str2, l lVar) {
        this.f5082a = str;
        this.f5083b = str2;
        this.f5085d = lVar;
        if (str.isEmpty()) {
            this.f5084c = 65535;
        } else {
            this.f5084c = this.f5082a.charAt(0);
        }
    }

    public static l e(Set set, q qVar) {
        l lVar = qVar.j() ? new l("", (String) null, (l) null) : new l("", (String) null, (l) null);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            lVar.a(str, str);
        }
        return lVar;
    }

    public final String c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!f(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f5082a.length() + index;
        l lVar = this.f5085d;
        if (lVar != null && length2 != length) {
            while (true) {
                if (!b(lVar.f5084c, charSequence.charAt(length2))) {
                    lVar = lVar.f5086e;
                    if (lVar == null) {
                        break;
                    }
                } else {
                    parsePosition.setIndex(length2);
                    String c3 = lVar.c(charSequence, parsePosition);
                    if (c3 != null) {
                        return c3;
                    }
                }
            }
        }
        parsePosition.setIndex(length2);
        return this.f5083b;
    }

    /* access modifiers changed from: protected */
    public l d(String str, String str2, l lVar) {
        return new l(str, str2, lVar);
    }

    /* access modifiers changed from: protected */
    public boolean f(CharSequence charSequence, int i3, int i4) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f5082a, i3);
        }
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
            if (!b(this.f5082a.charAt(i5), charSequence.charAt(i3))) {
                return false;
            }
            i3 = i8;
            length = i6;
            i5 = i7;
        }
    }

    private boolean a(String str, String str2) {
        int i3 = 0;
        while (i3 < str.length() && i3 < this.f5082a.length() && b(str.charAt(i3), this.f5082a.charAt(i3))) {
            i3++;
        }
        if (i3 != this.f5082a.length()) {
            l d3 = d(this.f5082a.substring(i3), this.f5083b, this.f5085d);
            this.f5082a = str.substring(0, i3);
            this.f5085d = d3;
            if (i3 < str.length()) {
                this.f5085d.f5086e = d(str.substring(i3), str2, (l) null);
                this.f5083b = null;
            } else {
                this.f5083b = str2;
            }
            return true;
        } else if (i3 < str.length()) {
            String substring = str.substring(i3);
            for (l lVar = this.f5085d; lVar != null; lVar = lVar.f5086e) {
                if (b(lVar.f5084c, substring.charAt(0))) {
                    return lVar.a(substring, str2);
                }
            }
            l d4 = d(substring, str2, (l) null);
            d4.f5086e = this.f5085d;
            this.f5085d = d4;
            return true;
        } else {
            this.f5083b = str2;
            return true;
        }
    }
}
