package h1;

import e1.C0157c;
import e1.g;

public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3050a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3051b = false;

    /* renamed from: c  reason: collision with root package name */
    public C0157c f3052c;

    /* renamed from: d  reason: collision with root package name */
    public final f f3053d;

    public h(f fVar) {
        this.f3053d = fVar;
    }

    public final g a(String str) {
        if (!this.f3050a) {
            this.f3050a = true;
            this.f3053d.b(this.f3052c, str, this.f3051b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }

    public final g b(boolean z3) {
        if (!this.f3050a) {
            this.f3050a = true;
            this.f3053d.a(this.f3052c, z3 ? 1 : 0, this.f3051b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }
}
