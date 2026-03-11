package androidx.datastore.preferences.protobuf;

public final class V {

    /* renamed from: a  reason: collision with root package name */
    public final C0118w f2387a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2388b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f2389c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2390d;

    public V(C0118w wVar, String str, Object[] objArr) {
        this.f2387a = wVar;
        this.f2388b = str;
        this.f2389c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f2390d = charAt;
            return;
        }
        char c3 = charAt & 8191;
        int i3 = 1;
        int i4 = 13;
        while (true) {
            int i5 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                c3 |= (charAt2 & 8191) << i4;
                i4 += 13;
                i3 = i5;
            } else {
                this.f2390d = c3 | (charAt2 << i4);
                return;
            }
        }
    }

    public final C0097a a() {
        return this.f2387a;
    }

    public final Object[] b() {
        return this.f2389c;
    }

    public final String c() {
        return this.f2388b;
    }

    public final int d() {
        int i3 = this.f2390d;
        if ((i3 & 1) != 0) {
            return 1;
        }
        if ((i3 & 4) == 4) {
            return 3;
        }
        return 2;
    }
}
