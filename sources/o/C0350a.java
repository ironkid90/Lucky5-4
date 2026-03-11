package o;

import java.util.concurrent.CancellationException;

/* renamed from: o.a  reason: case insensitive filesystem */
public final class C0350a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0350a f4116c;

    /* renamed from: d  reason: collision with root package name */
    public static final C0350a f4117d;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4118a;

    /* renamed from: b  reason: collision with root package name */
    public final CancellationException f4119b;

    static {
        if (h.f4131i) {
            f4117d = null;
            f4116c = null;
            return;
        }
        f4117d = new C0350a(false, (CancellationException) null);
        f4116c = new C0350a(true, (CancellationException) null);
    }

    public C0350a(boolean z3, CancellationException cancellationException) {
        this.f4118a = z3;
        this.f4119b = cancellationException;
    }
}
