package j2;

import c2.v;
import c2.w;
import java.nio.ByteBuffer;

/* renamed from: j2.b  reason: case insensitive filesystem */
public final class C0265b extends w {

    /* renamed from: d  reason: collision with root package name */
    public static final C0265b f3853d = new Object();

    public final Object f(byte b3, ByteBuffer byteBuffer) {
        if (b3 != -127) {
            return super.f(b3, byteBuffer);
        }
        Object e2 = e(byteBuffer);
        if (e2 == null) {
            return null;
        }
        return C0266c.values()[((Long) e2).intValue()];
    }

    public final void k(v vVar, Object obj) {
        Integer num;
        if (obj instanceof C0266c) {
            vVar.write(129);
            if (obj == null) {
                num = null;
            } else {
                num = Integer.valueOf(((C0266c) obj).f3855f);
            }
            k(vVar, num);
            return;
        }
        super.k(vVar, obj);
    }
}
