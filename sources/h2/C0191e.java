package h2;

import X0.h;
import Y1.a;
import Y1.b;
import android.content.Context;
import java.util.HashMap;

/* renamed from: h2.e  reason: case insensitive filesystem */
public class C0191e implements b, m, C0198l {

    /* renamed from: h  reason: collision with root package name */
    public static final HashMap f3070h = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public Context f3071f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3072g = false;

    /* JADX WARNING: type inference failed for: r4v0, types: [h2.h, java.lang.Object] */
    public static C0194h c(h hVar) {
        String str = hVar.f1946a;
        String str2 = hVar.f1950e;
        if (str2 == null) {
            str2 = null;
        }
        String str3 = hVar.f1952g;
        if (str3 == null) {
            str3 = null;
        }
        ? obj = new Object();
        if (str != null) {
            obj.f3078a = str;
            String str4 = hVar.f1947b;
            if (str4 != null) {
                obj.f3079b = str4;
                if (str2 != null) {
                    obj.f3080c = str2;
                    if (str3 != null) {
                        obj.f3081d = str3;
                        obj.f3082e = null;
                        obj.f3083f = hVar.f1948c;
                        obj.f3084g = hVar.f1951f;
                        obj.f3085h = null;
                        obj.f3086i = hVar.f1949d;
                        obj.f3087j = null;
                        obj.f3088k = null;
                        obj.f3089l = null;
                        obj.f3090m = null;
                        obj.f3091n = null;
                        return obj;
                    }
                    throw new IllegalStateException("Nonnull field \"projectId\" is null.");
                }
                throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
            }
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }
        throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
    }

    public final void onAttachedToEngine(a aVar) {
        m.b(aVar.f1965b, this);
        C0198l.a(aVar.f1965b, this);
        this.f3071f = aVar.f1964a;
    }

    public final void onDetachedFromEngine(a aVar) {
        this.f3071f = null;
        m.b(aVar.f1965b, (C0191e) null);
        C0198l.a(aVar.f1965b, (C0191e) null);
    }
}
