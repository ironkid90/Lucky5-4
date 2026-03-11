package b2;

import U1.g;
import android.util.Log;
import c2.n;
import c2.p;
import c2.q;
import java.nio.ByteBuffer;

public final class f implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2732a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2733b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2734c;

    public /* synthetic */ f(int i3, Object obj, Object obj2) {
        this.f2732a = i3;
        this.f2734c = obj;
        this.f2733b = obj2;
    }

    public final void a(String str, String str2, Object obj) {
        switch (this.f2732a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                return;
            default:
                ((g) this.f2733b).a(((q) ((n) this.f2734c).f2790h).f2793c.f(str, str2, obj));
                return;
        }
    }

    public final void b(Object obj) {
        switch (this.f2732a) {
            case 0:
                ((g) this.f2734c).f2736b = (byte[]) this.f2733b;
                return;
            default:
                ((g) this.f2733b).a(((q) ((n) this.f2734c).f2790h).f2793c.b(obj));
                return;
        }
    }

    public final void c() {
        switch (this.f2732a) {
            case 0:
                return;
            default:
                ((g) this.f2733b).a((ByteBuffer) null);
                return;
        }
    }

    private final void d() {
    }
}
