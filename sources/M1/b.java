package M1;

import c2.p;
import com.dexterous.flutterlocalnotifications.h;
import java.io.Serializable;
import java.util.HashMap;

public final class b implements d, h {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f1093f;

    /* renamed from: g  reason: collision with root package name */
    public final p f1094g;

    public /* synthetic */ b(p pVar, int i3) {
        this.f1093f = i3;
        this.f1094g = pVar;
    }

    public void a(String str, HashMap hashMap) {
        this.f1094g.a("sqlite_error", str, hashMap);
    }

    public void b(Serializable serializable) {
        this.f1094g.b(serializable);
    }

    public void e(boolean z3) {
        switch (this.f1093f) {
            case 1:
                this.f1094g.b(Boolean.valueOf(z3));
                return;
            default:
                this.f1094g.b(Boolean.valueOf(z3));
                return;
        }
    }

    public void o() {
        switch (this.f1093f) {
            case 1:
                this.f1094g.a("permissionRequestInProgress", "Another permission request is already in progress", (Object) null);
                return;
            default:
                this.f1094g.a("permissionRequestInProgress", "Another permission request is already in progress", (Object) null);
                return;
        }
    }
}
