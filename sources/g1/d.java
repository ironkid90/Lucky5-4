package g1;

import e1.C0158d;
import f1.C0166a;
import java.util.Date;
import java.util.HashMap;

public final class d implements C0166a {

    /* renamed from: e  reason: collision with root package name */
    public static final C0180a f2983e = new C0180a(0);

    /* renamed from: f  reason: collision with root package name */
    public static final C0181b f2984f = new C0181b(0);

    /* renamed from: g  reason: collision with root package name */
    public static final C0181b f2985g = new C0181b(1);

    /* renamed from: h  reason: collision with root package name */
    public static final c f2986h = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2987a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f2988b;

    /* renamed from: c  reason: collision with root package name */
    public final C0180a f2989c = f2983e;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2990d = false;

    public d() {
        HashMap hashMap = new HashMap();
        this.f2987a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f2988b = hashMap2;
        Class<String> cls = String.class;
        hashMap2.put(cls, f2984f);
        hashMap.remove(cls);
        Class<Boolean> cls2 = Boolean.class;
        hashMap2.put(cls2, f2985g);
        hashMap.remove(cls2);
        Class<Date> cls3 = Date.class;
        hashMap2.put(cls3, f2986h);
        hashMap.remove(cls3);
    }

    public final C0166a a(Class cls, C0158d dVar) {
        this.f2987a.put(cls, dVar);
        this.f2988b.remove(cls);
        return this;
    }
}
