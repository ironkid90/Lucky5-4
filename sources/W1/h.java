package w1;

import E1.b;
import E1.c;

public final class h extends r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4730a;

    public /* synthetic */ h(int i3) {
        this.f4730a = i3;
    }

    public final Object a(b bVar) {
        switch (this.f4730a) {
            case 0:
                if (bVar.w() != 9) {
                    return Double.valueOf(bVar.n());
                }
                bVar.s();
                return null;
            default:
                if (bVar.w() != 9) {
                    return Float.valueOf((float) bVar.n());
                }
                bVar.s();
                return null;
        }
    }

    public final void b(c cVar, Object obj) {
        switch (this.f4730a) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    cVar.j();
                    return;
                }
                k.a(number.doubleValue());
                cVar.o(number);
                return;
            default:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    cVar.j();
                    return;
                }
                k.a((double) number2.floatValue());
                cVar.o(number2);
                return;
        }
    }
}
