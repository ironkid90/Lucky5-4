package L;

import A2.i;
import A2.j;
import S1.m;
import android.content.Context;
import d0.C0140b;
import e0.C0154a;
import java.io.File;
import p2.C0368h;
import z2.a;

public final class b extends j implements a {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f912g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f913h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f914i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, Object obj, Object obj2) {
        super(0);
        this.f912g = i3;
        this.f913h = obj;
        this.f914i = obj2;
    }

    public final Object a() {
        switch (this.f912g) {
            case 0:
                ((c) this.f914i).getClass();
                String concat = "FlutterSharedPreferences".concat(".preferences_pb");
                i.e(concat, "fileName");
                return new File(((Context) this.f913h).getApplicationContext().getFilesDir(), "datastore/".concat(concat));
            default:
                ((C0154a) ((C0140b) this.f913h).f2888g).a((m) this.f914i);
                return C0368h.f4194a;
        }
    }
}
