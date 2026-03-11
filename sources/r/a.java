package R;

import java.io.Serializable;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f1321f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f1322g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Serializable f1323h;

    public /* synthetic */ a(b bVar, int i3, Serializable serializable) {
        this.f1321f = bVar;
        this.f1322g = i3;
        this.f1323h = serializable;
    }

    public final void run() {
        this.f1321f.f1325b.b(this.f1322g, this.f1323h);
    }
}
