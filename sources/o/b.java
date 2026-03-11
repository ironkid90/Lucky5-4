package O;

import T.C0093n;
import T.t;
import android.graphics.Rect;
import android.view.View;
import java.util.LinkedHashMap;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1232a;

    public b() {
        this.f1232a = new LinkedHashMap();
    }

    public static b a(t tVar, int i3) {
        if (i3 == 0) {
            return new C0093n(tVar, 0);
        }
        if (i3 == 1) {
            return new C0093n(tVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public b(t tVar) {
        new Rect();
        this.f1232a = tVar;
    }
}
