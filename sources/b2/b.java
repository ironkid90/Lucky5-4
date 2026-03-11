package b2;

import A2.h;

public enum b {
    ;
    

    /* renamed from: f  reason: collision with root package name */
    public String f2708f;

    public static b a(String str) {
        for (b bVar : values()) {
            if (bVar.f2708f.equals(str)) {
                return bVar;
            }
        }
        throw new NoSuchFieldException(h.g("No such ClipboardContentFormat: ", str));
    }
}
