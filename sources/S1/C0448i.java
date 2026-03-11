package s1;

import A.C0002c;
import K0.b;
import W0.a;
import W0.h;
import android.content.Context;
import android.content.Intent;

/* renamed from: s1.i  reason: case insensitive filesystem */
public final /* synthetic */ class C0448i implements a {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f4564f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Intent f4565g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f4566h;

    public /* synthetic */ C0448i(Context context, Intent intent, boolean z3) {
        this.f4564f = context;
        this.f4565g = intent;
        this.f4566h = z3;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final Object o(h hVar) {
        if (!b.b() || ((Integer) hVar.c()).intValue() != 402) {
            return hVar;
        }
        return C0449j.a(this.f4564f, this.f4565g, this.f4566h).h(new Object(), new C0002c(14));
    }
}
