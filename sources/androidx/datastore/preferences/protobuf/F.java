package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

public final class F {

    /* renamed from: b  reason: collision with root package name */
    public static final C0115t f2350b = new C0115t(1);

    /* renamed from: a  reason: collision with root package name */
    public final Object f2351a;

    public F(C0109m mVar) {
        C0120y.a(mVar, "output");
        this.f2351a = mVar;
        mVar.f2459l = this;
    }

    public void a(int i3, boolean z3) {
        ((C0109m) this.f2351a).D0(i3, z3);
    }

    public void b(int i3, C0103g gVar) {
        ((C0109m) this.f2351a).E0(i3, gVar);
    }

    public void c(int i3, double d3) {
        C0109m mVar = (C0109m) this.f2351a;
        mVar.getClass();
        mVar.I0(Double.doubleToRawLongBits(d3), i3);
    }

    public void d(int i3, int i4) {
        ((C0109m) this.f2351a).K0(i3, i4);
    }

    public void e(int i3, int i4) {
        ((C0109m) this.f2351a).G0(i3, i4);
    }

    public void f(long j3, int i3) {
        ((C0109m) this.f2351a).I0(j3, i3);
    }

    public void g(int i3, float f3) {
        C0109m mVar = (C0109m) this.f2351a;
        mVar.getClass();
        mVar.G0(i3, Float.floatToRawIntBits(f3));
    }

    public void h(int i3, Object obj, W w3) {
        C0109m mVar = (C0109m) this.f2351a;
        mVar.O0(i3, 3);
        w3.d((C0097a) obj, mVar.f2459l);
        mVar.O0(i3, 4);
    }

    public void i(int i3, int i4) {
        ((C0109m) this.f2351a).K0(i3, i4);
    }

    public void j(long j3, int i3) {
        ((C0109m) this.f2351a).R0(j3, i3);
    }

    public void k(int i3, Object obj, W w3) {
        C0109m mVar = (C0109m) this.f2351a;
        C0097a aVar = (C0097a) obj;
        mVar.O0(i3, 2);
        mVar.Q0(aVar.a(w3));
        w3.d(aVar, mVar.f2459l);
    }

    public void l(int i3, int i4) {
        ((C0109m) this.f2351a).G0(i3, i4);
    }

    public void m(long j3, int i3) {
        ((C0109m) this.f2351a).I0(j3, i3);
    }

    public void n(int i3, int i4) {
        ((C0109m) this.f2351a).P0(i3, (i4 >> 31) ^ (i4 << 1));
    }

    public void o(long j3, int i3) {
        ((C0109m) this.f2351a).R0((j3 >> 63) ^ (j3 << 1), i3);
    }

    public void p(int i3, int i4) {
        ((C0109m) this.f2351a).P0(i3, i4);
    }

    public void q(long j3, int i3) {
        ((C0109m) this.f2351a).R0(j3, i3);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, androidx.datastore.preferences.protobuf.E] */
    public F() {
        T t3 = T.f2381c;
        L l3 = f2350b;
        try {
            l3 = (L) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
        }
        L[] lArr = {C0115t.f2493b, l3};
        ? obj = new Object();
        obj.f2349a = lArr;
        Charset charset = C0120y.f2497a;
        this.f2351a = obj;
    }
}
