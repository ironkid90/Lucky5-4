package G0;

import C0.f;
import N.a;
import android.view.KeyEvent;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public boolean f468a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f469b;

    public z(String str, boolean z3) {
        this.f469b = str;
        this.f468a = z3;
    }

    public void a(boolean z3) {
        if (!this.f468a) {
            this.f468a = true;
            a aVar = (a) this.f469b;
            int i3 = aVar.f1136b - 1;
            aVar.f1136b = i3;
            boolean z4 = z3 | aVar.f1137c;
            aVar.f1137c = z4;
            if (i3 == 0 && !z4) {
                ((f) aVar.f1139e).Q((KeyEvent) aVar.f1138d);
                return;
            }
            return;
        }
        throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
    }

    public z(a aVar) {
        this.f469b = aVar;
        this.f468a = false;
    }
}
