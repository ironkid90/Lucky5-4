package H2;

import A2.i;
import p2.C0363c;
import z2.p;

public final /* synthetic */ class k implements p {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ char[] f501f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f502g;

    public /* synthetic */ k(char[] cArr, boolean z3) {
        this.f501f = cArr;
        this.f502g = z3;
    }

    public final Object i(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Integer) obj2).intValue();
        i.e(charSequence, "$this$DelimitedRangesSequence");
        int g02 = l.g0(charSequence, this.f501f, intValue, this.f502g);
        if (g02 < 0) {
            return null;
        }
        return new C0363c(Integer.valueOf(g02), 1);
    }
}
