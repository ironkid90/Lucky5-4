package I0;

import C0.r;
import D0.g;
import E0.b;
import F0.a;
import F0.d;
import F0.s;
import F0.v;
import F0.w;
import G0.h;
import G0.i;
import G0.o;
import W0.p;
import android.content.Context;
import android.os.Build;
import j1.e;
import java.lang.reflect.InvocationTargetException;

public final class c {

    /* renamed from: i  reason: collision with root package name */
    public static final r f696i = new r((b) new Object(), new e(1));

    /* renamed from: a  reason: collision with root package name */
    public final Context f697a;

    /* renamed from: b  reason: collision with root package name */
    public final String f698b;

    /* renamed from: c  reason: collision with root package name */
    public final r f699c;

    /* renamed from: d  reason: collision with root package name */
    public final i f700d;

    /* renamed from: e  reason: collision with root package name */
    public final a f701e;

    /* renamed from: f  reason: collision with root package name */
    public final int f702f;

    /* renamed from: g  reason: collision with root package name */
    public final g f703g;

    /* renamed from: h  reason: collision with root package name */
    public final d f704h;

    public c(Context context, r rVar, b bVar) {
        boolean z3;
        i iVar = i.f420a;
        o.f(context, "Null context is not permitted.");
        o.f(rVar, "Api must not be null.");
        o.f(bVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f697a = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 30) {
            z3 = true;
        } else {
            z3 = false;
        }
        String str = null;
        if (z3) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", (Class[]) null).invoke(context, (Object[]) null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f698b = str;
        this.f699c = rVar;
        this.f700d = iVar;
        this.f701e = new a(rVar, str);
        d d3 = d.d(this.f697a);
        this.f704h = d3;
        this.f702f = d3.f314h.getAndIncrement();
        this.f703g = bVar.f224a;
        O0.e eVar = d3.f319m;
        eVar.sendMessage(eVar.obtainMessage(7, this));
    }

    public final p a(h hVar) {
        F0.h hVar2 = new F0.h(0);
        hVar2.f322g = new F0.h(4, (Object) hVar);
        v vVar = new v(hVar2, new D0.c[]{O0.c.f1235a}, false);
        W0.i iVar = new W0.i();
        d dVar = this.f704h;
        dVar.getClass();
        w wVar = new w(vVar, iVar, this.f703g);
        O0.e eVar = dVar.f319m;
        eVar.sendMessage(eVar.obtainMessage(4, new s(wVar, dVar.f315i.get(), this)));
        return iVar.f1875a;
    }
}
