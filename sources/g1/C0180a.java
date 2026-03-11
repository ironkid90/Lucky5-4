package g1;

import e1.C0158d;
import e1.e;
import h1.f;
import java.util.Map;

/* renamed from: g1.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0180a implements C0158d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2980a;

    public /* synthetic */ C0180a(int i3) {
        this.f2980a = i3;
    }

    public final void a(Object obj, Object obj2) {
        switch (this.f2980a) {
            case 0:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                e eVar = (e) obj2;
                eVar.e(f.f3041g, entry.getKey());
                eVar.e(f.f3042h, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
