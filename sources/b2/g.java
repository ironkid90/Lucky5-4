package b2;

import F0.h;
import U1.b;
import c2.q;
import c2.x;
import j1.e;
import java.util.HashMap;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2735a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f2736b;

    /* renamed from: c  reason: collision with root package name */
    public final q f2737c;

    /* renamed from: d  reason: collision with root package name */
    public f f2738d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2739e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2740f = false;

    public g(b bVar, boolean z3) {
        q qVar = new q(bVar, "flutter/restoration", x.f2798a, (e) null);
        h hVar = new h(24, (Object) this);
        this.f2737c = qVar;
        this.f2735a = z3;
        qVar.b(hVar);
    }

    public static HashMap a(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }
}
