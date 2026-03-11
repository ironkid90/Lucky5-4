package i2;

import W0.i;
import c2.u;
import java.util.HashMap;

/* renamed from: i2.h  reason: case insensitive filesystem */
public final class C0227h implements u {

    /* renamed from: f  reason: collision with root package name */
    public C0224e f3258f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3259g;

    public final boolean onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        C0224e eVar;
        int i4 = 0;
        if (!this.f3259g || i3 != 240 || (eVar = this.f3258f) == null) {
            return false;
        }
        this.f3259g = false;
        if (iArr.length > 0 && iArr[0] == 0) {
            i4 = 1;
        }
        Integer valueOf = Integer.valueOf(i4);
        HashMap hashMap = (HashMap) eVar.f3244g;
        hashMap.put("authorizationStatus", valueOf);
        ((i) eVar.f3245h).b(hashMap);
        return true;
    }
}
