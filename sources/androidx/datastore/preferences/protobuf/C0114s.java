package androidx.datastore.preferences.protobuf;

import L.j;

/* renamed from: androidx.datastore.preferences.protobuf.s  reason: case insensitive filesystem */
public enum C0114s {
    DOUBLE_LIST_PACKED(35, 3, r47),
    SINT64_LIST_PACKED(48, 3, r55);
    

    /* renamed from: i  reason: collision with root package name */
    public static final C0114s[] f2490i = null;

    /* renamed from: f  reason: collision with root package name */
    public final int f2492f;

    static {
        C0114s[] values = values();
        f2490i = new C0114s[values.length];
        for (C0114s sVar : values) {
            f2490i[sVar.f2492f] = sVar;
        }
    }

    /* access modifiers changed from: public */
    C0114s(int i3, int i4, B b3) {
        this.f2492f = i3;
        int b4 = j.b(i4);
        if (b4 == 1) {
            b3.getClass();
        } else if (b4 == 3) {
            b3.getClass();
        }
        if (i4 == 1) {
            b3.ordinal();
        }
    }

    public final int a() {
        return this.f2492f;
    }
}
