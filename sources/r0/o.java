package r0;

import A0.a;
import C0.f;
import L1.d;
import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import o0.C0355c;
import p0.C0360a;
import w0.C0501b;
import x0.j;
import x0.k;

public final class o {

    /* renamed from: e  reason: collision with root package name */
    public static volatile j f4442e;

    /* renamed from: a  reason: collision with root package name */
    public final a f4443a;

    /* renamed from: b  reason: collision with root package name */
    public final a f4444b;

    /* renamed from: c  reason: collision with root package name */
    public final C0501b f4445c;

    /* renamed from: d  reason: collision with root package name */
    public final j f4446d;

    public o(a aVar, a aVar2, C0501b bVar, j jVar, k kVar) {
        this.f4443a = aVar;
        this.f4444b = aVar2;
        this.f4445c = bVar;
        this.f4446d = jVar;
        kVar.getClass();
        kVar.f4801a.execute(new d(10, (Object) kVar));
    }

    public static o a() {
        j jVar = f4442e;
        if (jVar != null) {
            return (o) jVar.f4434k.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [M0.b, java.lang.Object] */
    public static void b(Context context) {
        if (f4442e == null) {
            synchronized (o.class) {
                try {
                    if (f4442e == null) {
                        ? obj = new Object();
                        context.getClass();
                        obj.f1087a = context;
                        f4442e = obj.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final n c(C0360a aVar) {
        Set set;
        byte[] bArr;
        if (aVar != null) {
            set = Collections.unmodifiableSet(C0360a.f4167d);
        } else {
            set = Collections.singleton(new C0355c("proto"));
        }
        f a2 = i.a();
        aVar.getClass();
        a2.f127g = "cct";
        String str = aVar.f4170a;
        String str2 = aVar.f4171b;
        if (str2 == null && str == null) {
            bArr = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bArr = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        a2.f128h = bArr;
        return new n(set, a2.u(), this);
    }
}
