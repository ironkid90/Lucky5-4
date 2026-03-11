package N;

import L.k;
import android.content.res.Configuration;
import z.a;

public final /* synthetic */ class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1159a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0.f f1160b;

    public /* synthetic */ f(C0.f fVar, int i3) {
        this.f1159a = i3;
        this.f1160b = fVar;
    }

    public final void accept(Object obj) {
        switch (this.f1159a) {
            case 0:
                Configuration configuration = (Configuration) obj;
                C0.f fVar = this.f1160b;
                fVar.getClass();
                fVar.y(false);
                return;
            case 1:
                C0.f fVar2 = this.f1160b;
                fVar2.getClass();
                if (((Integer) obj).intValue() == 80) {
                    fVar2.z(false);
                    return;
                }
                return;
            case k.FLOAT_FIELD_NUMBER:
                if (obj == null) {
                    this.f1160b.getClass();
                    throw null;
                }
                throw new ClassCastException();
            default:
                if (obj == null) {
                    this.f1160b.getClass();
                    throw null;
                }
                throw new ClassCastException();
        }
    }
}
