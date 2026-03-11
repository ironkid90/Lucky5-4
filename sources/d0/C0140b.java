package d0;

import L.k;
import e0.C0154a;

/* renamed from: d0.b  reason: case insensitive filesystem */
public final class C0140b implements C0146h {

    /* renamed from: h  reason: collision with root package name */
    public static final C0140b f2881h = new C0140b("NONE", 0);

    /* renamed from: i  reason: collision with root package name */
    public static final C0140b f2882i = new C0140b("FULL", 0);

    /* renamed from: j  reason: collision with root package name */
    public static final C0140b f2883j = new C0140b("FLAT", 1);

    /* renamed from: k  reason: collision with root package name */
    public static final C0140b f2884k = new C0140b("HALF_OPENED", 1);

    /* renamed from: l  reason: collision with root package name */
    public static final C0140b f2885l = new C0140b("FOLD", 2);

    /* renamed from: m  reason: collision with root package name */
    public static final C0140b f2886m = new C0140b("HINGE", 2);

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f2887f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f2888g;

    public /* synthetic */ C0140b(String str, int i3) {
        this.f2887f = i3;
        this.f2888g = str;
    }

    public String toString() {
        switch (this.f2887f) {
            case 0:
                return (String) this.f2888g;
            case 1:
                return (String) this.f2888g;
            case k.FLOAT_FIELD_NUMBER:
                return (String) this.f2888g;
            default:
                return super.toString();
        }
    }

    public C0140b(C0154a aVar) {
        this.f2887f = 3;
        int i3 = C0151m.f2910b;
        this.f2888g = aVar;
    }
}
