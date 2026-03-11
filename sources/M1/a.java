package M1;

import a.C0094a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import s1.C0464y;

public final class a extends C0094a {

    /* renamed from: l  reason: collision with root package name */
    public final Map f1090l;

    /* renamed from: m  reason: collision with root package name */
    public final C0464y f1091m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public final boolean f1092n;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, s1.y] */
    public a(Map map, boolean z3) {
        super(5);
        this.f1090l = map;
        this.f1092n = z3;
    }

    public final boolean E() {
        return this.f1090l.containsKey("transactionId");
    }

    public final void Z(ArrayList arrayList) {
        if (!this.f1092n) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            C0464y yVar = this.f1091m;
            hashMap2.put("code", (String) yVar.f4622f);
            hashMap2.put("message", (String) yVar.f4624h);
            hashMap2.put("data", (HashMap) yVar.f4625i);
            hashMap.put("error", hashMap2);
            arrayList.add(hashMap);
        }
    }

    public final void a0(ArrayList arrayList) {
        if (!this.f1092n) {
            HashMap hashMap = new HashMap();
            hashMap.put("result", (Serializable) this.f1091m.f4623g);
            arrayList.add(hashMap);
        }
    }

    public final Object t(String str) {
        return this.f1090l.get(str);
    }

    public final String x() {
        return (String) this.f1090l.get("method");
    }

    public final boolean y() {
        return this.f1092n;
    }

    public final d z() {
        return this.f1091m;
    }
}
