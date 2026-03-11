package I2;

import A2.j;
import r2.C0423g;
import r2.C0425i;
import z2.p;

/* renamed from: I2.p  reason: case insensitive filesystem */
public final class C0065p extends j implements p {

    /* renamed from: h  reason: collision with root package name */
    public static final C0065p f778h = new C0065p(2, 0);

    /* renamed from: i  reason: collision with root package name */
    public static final C0065p f779i = new C0065p(2, 1);

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f780g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0065p(int i3, int i4) {
        super(i3);
        this.f780g = i4;
    }

    public final Object i(Object obj, Object obj2) {
        switch (this.f780g) {
            case 0:
                return ((C0425i) obj).d((C0423g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                C0423g gVar = (C0423g) obj2;
                return bool;
            default:
                return ((C0425i) obj).d((C0423g) obj2);
        }
    }
}
