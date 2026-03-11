package A;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import t.C0469c;

public class T {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f29b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final V f30a;

    static {
        L l3;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            l3 = new K();
        } else if (i3 >= 29) {
            l3 = new J();
        } else {
            l3 = new H();
        }
        l3.b().f31a.a().f31a.b().f31a.c();
    }

    public T(V v) {
        this.f30a = v;
    }

    public V a() {
        return this.f30a;
    }

    public V b() {
        return this.f30a;
    }

    public V c() {
        return this.f30a;
    }

    public C0006g e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t3 = (T) obj;
        if (l() != t3.l() || k() != t3.k() || !Objects.equals(i(), t3.i()) || !Objects.equals(g(), t3.g()) || !Objects.equals(e(), t3.e())) {
            return false;
        }
        return true;
    }

    public C0469c f() {
        return i();
    }

    public C0469c g() {
        return C0469c.f4635e;
    }

    public C0469c h() {
        return i();
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(l()), Boolean.valueOf(k()), i(), g(), e()});
    }

    public C0469c i() {
        return C0469c.f4635e;
    }

    public C0469c j() {
        return i();
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public boolean m(int i3) {
        return true;
    }

    public void d(View view) {
    }

    public void n(C0469c[] cVarArr) {
    }

    public void o(V v) {
    }

    public void p(C0469c cVar) {
    }
}
