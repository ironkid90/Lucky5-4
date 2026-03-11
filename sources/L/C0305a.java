package l;

import java.util.HashMap;

/* renamed from: l.a  reason: case insensitive filesystem */
public final class C0305a extends C0310f {

    /* renamed from: j  reason: collision with root package name */
    public final HashMap f3987j = new HashMap();

    public final C0307c a(Object obj) {
        return (C0307c) this.f3987j.get(obj);
    }

    public final Object b(Object obj) {
        Object b3 = super.b(obj);
        this.f3987j.remove(obj);
        return b3;
    }
}
