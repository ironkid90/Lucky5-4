package j$.time.format;

import java.util.ArrayList;

final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private final f[] f5067a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5068b;

    e(ArrayList arrayList, boolean z3) {
        this((f[]) arrayList.toArray(new f[arrayList.size()]), z3);
    }

    e(f[] fVarArr, boolean z3) {
        this.f5067a = fVarArr;
        this.f5068b = z3;
    }

    public final e a() {
        if (!this.f5068b) {
            return this;
        }
        return new e(this.f5067a, false);
    }

    public final boolean p(t tVar, StringBuilder sb) {
        int length = sb.length();
        boolean z3 = this.f5068b;
        if (z3) {
            tVar.g();
        }
        try {
            for (f p3 : this.f5067a) {
                if (!p3.p(tVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (z3) {
                tVar.a();
            }
            return true;
        } finally {
            if (z3) {
                tVar.a();
            }
        }
    }

    public final int r(q qVar, CharSequence charSequence, int i3) {
        boolean z3 = this.f5068b;
        f[] fVarArr = this.f5067a;
        if (z3) {
            qVar.q();
            int i4 = i3;
            for (f r3 : fVarArr) {
                i4 = r3.r(qVar, charSequence, i4);
                if (i4 < 0) {
                    qVar.e(false);
                    return i3;
                }
            }
            qVar.e(true);
            return i4;
        }
        for (f r4 : fVarArr) {
            i3 = r4.r(qVar, charSequence, i3);
            if (i3 < 0) {
                break;
            }
        }
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        f[] fVarArr = this.f5067a;
        if (fVarArr != null) {
            boolean z3 = this.f5068b;
            sb.append(z3 ? "[" : "(");
            for (f append : fVarArr) {
                sb.append(append);
            }
            sb.append(z3 ? "]" : ")");
        }
        return sb.toString();
    }
}
