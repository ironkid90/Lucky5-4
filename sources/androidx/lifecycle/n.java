package androidx.lifecycle;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final p f2519a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2520b;

    /* renamed from: c  reason: collision with root package name */
    public int f2521c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ o f2522d;

    public n(o oVar, p pVar) {
        this.f2522d = oVar;
        this.f2519a = pVar;
    }

    public final void a(boolean z3) {
        int i3;
        if (z3 != this.f2520b) {
            this.f2520b = z3;
            if (z3) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            o oVar = this.f2522d;
            int i4 = oVar.f2528c;
            oVar.f2528c = i3 + i4;
            if (!oVar.f2529d) {
                oVar.f2529d = true;
                while (true) {
                    try {
                        int i5 = oVar.f2528c;
                        if (i4 == i5) {
                            break;
                        }
                        i4 = i5;
                    } finally {
                        oVar.f2529d = false;
                    }
                }
            }
            if (this.f2520b) {
                oVar.b(this);
            }
        }
    }
}
