package N2;

import A2.j;
import I2.h0;
import r2.C0423g;
import z2.p;

public final class x extends j implements p {

    /* renamed from: h  reason: collision with root package name */
    public static final x f1224h = new x(2, 0);

    /* renamed from: i  reason: collision with root package name */
    public static final x f1225i = new x(2, 1);

    /* renamed from: j  reason: collision with root package name */
    public static final x f1226j = new x(2, 2);

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f1227g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i3, int i4) {
        super(i3);
        this.f1227g = i4;
    }

    public final Object i(Object obj, Object obj2) {
        Integer num;
        int i3;
        switch (this.f1227g) {
            case 0:
                C0423g gVar = (C0423g) obj2;
                if (!(gVar instanceof h0)) {
                    return obj;
                }
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                if (num != null) {
                    i3 = num.intValue();
                } else {
                    i3 = 1;
                }
                if (i3 == 0) {
                    return gVar;
                }
                return Integer.valueOf(i3 + 1);
            case 1:
                h0 h0Var = (h0) obj;
                C0423g gVar2 = (C0423g) obj2;
                if (h0Var != null) {
                    return h0Var;
                }
                if (gVar2 instanceof h0) {
                    return (h0) gVar2;
                }
                return null;
            default:
                C0423g gVar3 = (C0423g) obj2;
                return (z) obj;
        }
    }
}
