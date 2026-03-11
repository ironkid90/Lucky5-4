package M;

import L.d;
import L.f;
import L.g;
import L.h;
import L.j;
import L.k;
import R2.m;
import R2.n;
import R2.o;
import R2.p;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.C0103g;
import androidx.datastore.preferences.protobuf.C0109m;
import androidx.datastore.preferences.protobuf.C0118w;
import androidx.datastore.preferences.protobuf.C0119x;
import androidx.datastore.preferences.protobuf.C0120y;
import androidx.datastore.preferences.protobuf.W;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import q2.C0401d;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f1083a = new Object();

    public final b a(p pVar) {
        int i3;
        byte[] bArr;
        try {
            f q3 = f.q(new o(pVar));
            b bVar = new b(false);
            f[] fVarArr = (f[]) Arrays.copyOf(new f[0], 0);
            A2.i.e(fVarArr, "pairs");
            bVar.b();
            if (fVarArr.length <= 0) {
                Map o3 = q3.o();
                A2.i.d(o3, "preferencesProto.preferencesMap");
                for (Map.Entry entry : o3.entrySet()) {
                    String str = (String) entry.getKey();
                    k kVar = (k) entry.getValue();
                    A2.i.d(str, "name");
                    A2.i.d(kVar, "value");
                    int E3 = kVar.E();
                    if (E3 == 0) {
                        i3 = -1;
                    } else {
                        i3 = h.f1082a[j.b(E3)];
                    }
                    switch (i3) {
                        case -1:
                            throw new IOException("Value case is null.", (Throwable) null);
                        case 1:
                            bVar.d(new e(str), Boolean.valueOf(kVar.v()));
                            break;
                        case k.FLOAT_FIELD_NUMBER:
                            bVar.d(new e(str), Float.valueOf(kVar.z()));
                            break;
                        case k.INTEGER_FIELD_NUMBER:
                            bVar.d(new e(str), Double.valueOf(kVar.y()));
                            break;
                        case k.LONG_FIELD_NUMBER:
                            bVar.d(new e(str), Integer.valueOf(kVar.A()));
                            break;
                        case k.STRING_FIELD_NUMBER:
                            bVar.d(new e(str), Long.valueOf(kVar.B()));
                            break;
                        case k.STRING_SET_FIELD_NUMBER:
                            e eVar = new e(str);
                            String C3 = kVar.C();
                            A2.i.d(C3, "value.string");
                            bVar.d(eVar, C3);
                            break;
                        case k.DOUBLE_FIELD_NUMBER:
                            e eVar2 = new e(str);
                            C0119x p3 = kVar.D().p();
                            A2.i.d(p3, "value.stringSet.stringsList");
                            bVar.d(eVar2, C0401d.j0(p3));
                            break;
                        case k.BYTES_FIELD_NUMBER:
                            e eVar3 = new e(str);
                            C0103g w3 = kVar.w();
                            int size = w3.size();
                            if (size == 0) {
                                bArr = C0120y.f2498b;
                            } else {
                                byte[] bArr2 = new byte[size];
                                w3.d(bArr2, size);
                                bArr = bArr2;
                            }
                            A2.i.d(bArr, "value.bytes.toByteArray()");
                            bVar.d(eVar3, bArr);
                            break;
                        case 9:
                            throw new IOException("Value not set.", (Throwable) null);
                        default:
                            throw new RuntimeException();
                    }
                }
                return new b(new LinkedHashMap(bVar.a()), true);
            }
            f fVar = fVarArr[0];
            throw null;
        } catch (A e2) {
            throw new IOException("Unable to parse preferences proto.", e2);
        }
    }

    public final void b(Object obj, n nVar) {
        C0118w wVar;
        Map a2 = ((b) obj).a();
        d p3 = f.p();
        for (Map.Entry entry : a2.entrySet()) {
            Object value = entry.getValue();
            String str = ((e) entry.getKey()).f1078a;
            if (value instanceof Boolean) {
                L.i F3 = k.F();
                boolean booleanValue = ((Boolean) value).booleanValue();
                F3.c();
                k.s((k) F3.f2496g, booleanValue);
                wVar = F3.a();
            } else if (value instanceof Float) {
                L.i F4 = k.F();
                float floatValue = ((Number) value).floatValue();
                F4.c();
                k.t((k) F4.f2496g, floatValue);
                wVar = F4.a();
            } else if (value instanceof Double) {
                L.i F5 = k.F();
                double doubleValue = ((Number) value).doubleValue();
                F5.c();
                k.q((k) F5.f2496g, doubleValue);
                wVar = F5.a();
            } else if (value instanceof Integer) {
                L.i F6 = k.F();
                int intValue = ((Number) value).intValue();
                F6.c();
                k.u((k) F6.f2496g, intValue);
                wVar = F6.a();
            } else if (value instanceof Long) {
                L.i F7 = k.F();
                long longValue = ((Number) value).longValue();
                F7.c();
                k.n((k) F7.f2496g, longValue);
                wVar = F7.a();
            } else if (value instanceof String) {
                L.i F8 = k.F();
                F8.c();
                k.o((k) F8.f2496g, (String) value);
                wVar = F8.a();
            } else if (value instanceof Set) {
                L.i F9 = k.F();
                g q3 = h.q();
                A2.i.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                q3.c();
                h.n((h) q3.f2496g, (Set) value);
                F9.c();
                k.p((k) F9.f2496g, (h) q3.a());
                wVar = F9.a();
            } else if (value instanceof byte[]) {
                L.i F10 = k.F();
                byte[] bArr = (byte[]) value;
                C0103g gVar = C0103g.f2423h;
                C0103g c3 = C0103g.c(bArr, 0, bArr.length);
                F10.c();
                k.r((k) F10.f2496g, c3);
                wVar = F10.a();
            } else {
                throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
            }
            p3.getClass();
            str.getClass();
            p3.c();
            f.n((f) p3.f2496g).put(str, (k) wVar);
        }
        f fVar = (f) p3.a();
        m mVar = new m(nVar);
        int a3 = fVar.a((W) null);
        Logger logger = C0109m.f2457q;
        if (a3 > 4096) {
            a3 = 4096;
        }
        C0109m mVar2 = new C0109m(mVar, a3);
        fVar.b(mVar2);
        if (mVar2.f2462o > 0) {
            mVar2.z0();
        }
    }
}
