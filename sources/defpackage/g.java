package defpackage;

import A2.i;
import M0.a;
import c2.v;
import c2.w;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: g  reason: default package */
public final class g extends w {
    public final Object f(byte b3, ByteBuffer byteBuffer) {
        List list;
        List list2;
        i.e(byteBuffer, "buffer");
        if (b3 == -127) {
            Object e2 = e(byteBuffer);
            if (e2 instanceof List) {
                list2 = (List) e2;
            } else {
                list2 = null;
            }
            if (list2 != null) {
                return new b((Boolean) list2.get(0));
            }
            return null;
        } else if (b3 != -126) {
            return super.f(b3, byteBuffer);
        } else {
            Object e3 = e(byteBuffer);
            if (e3 instanceof List) {
                list = (List) e3;
            } else {
                list = null;
            }
            if (list != null) {
                return new a((Boolean) list.get(0));
            }
            return null;
        }
    }

    public final void k(v vVar, Object obj) {
        if (obj instanceof b) {
            vVar.write(129);
            k(vVar, a.A(((b) obj).f2657a));
        } else if (obj instanceof a) {
            vVar.write(130);
            k(vVar, a.A(((a) obj).f1966a));
        } else {
            super.k(vVar, obj);
        }
    }
}
