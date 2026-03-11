package j$.time.temporal;

public final /* synthetic */ class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5177a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f5178b;

    public /* synthetic */ o(int i3, int i4) {
        this.f5177a = i4;
        this.f5178b = i3;
    }

    public final m c(m mVar) {
        switch (this.f5177a) {
            case 0:
                int i3 = mVar.i(a.DAY_OF_WEEK);
                int i4 = this.f5178b;
                if (i3 == i4) {
                    return mVar;
                }
                int i5 = i3 - i4;
                return mVar.d((long) (i5 >= 0 ? 7 - i5 : -i5), b.DAYS);
            default:
                int i6 = mVar.i(a.DAY_OF_WEEK);
                int i7 = this.f5178b;
                if (i6 == i7) {
                    return mVar;
                }
                int i8 = i7 - i6;
                return mVar.e((long) (i8 >= 0 ? 7 - i8 : -i8), b.DAYS);
        }
    }
}
