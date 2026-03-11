package N;

import C0.f;
import S1.w;
import android.view.KeyEvent;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1135a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1136b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1137c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1138d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f1139e;

    public a(f fVar) {
        fVar.getClass();
        this.f1138d = new ArrayList();
        this.f1136b = -1;
        this.f1139e = fVar;
    }

    public String toString() {
        switch (this.f1135a) {
            case 0:
                StringBuilder sb = new StringBuilder(128);
                sb.append("BackStackEntry{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                if (this.f1136b >= 0) {
                    sb.append(" #");
                    sb.append(this.f1136b);
                }
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public a(f fVar, KeyEvent keyEvent) {
        this.f1139e = fVar;
        this.f1136b = ((w[]) fVar.f128h).length;
        this.f1137c = false;
        this.f1138d = keyEvent;
    }
}
