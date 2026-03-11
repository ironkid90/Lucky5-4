package F0;

import D0.a;
import G0.o;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public int f360a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f361b;

    public /* synthetic */ y(int i3, Object[] objArr) {
        this.f360a = i3;
        this.f361b = objArr;
    }

    public y(a aVar, int i3) {
        o.e(aVar);
        this.f361b = aVar;
        this.f360a = i3;
    }

    public y(int i3) {
        if (i3 > 0) {
            this.f361b = new Object[i3];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }
}
