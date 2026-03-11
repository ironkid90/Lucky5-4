package androidx.datastore.preferences.protobuf;

import L.k;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public final class r {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f2475c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Y f2476a = Y.f();

    /* renamed from: b  reason: collision with root package name */
    public boolean f2477b;

    static {
        new r(0);
    }

    public r() {
    }

    public static void b(C0109m mVar, q0 q0Var, int i3, Object obj) {
        if (q0Var == q0.GROUP) {
            mVar.O0(i3, 3);
            ((C0097a) obj).b(mVar);
            mVar.O0(i3, 4);
            return;
        }
        mVar.O0(i3, q0Var.f2474g);
        switch (q0Var.ordinal()) {
            case 0:
                mVar.J0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                mVar.H0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case k.FLOAT_FIELD_NUMBER:
                mVar.S0(((Long) obj).longValue());
                return;
            case k.INTEGER_FIELD_NUMBER:
                mVar.S0(((Long) obj).longValue());
                return;
            case k.LONG_FIELD_NUMBER:
                mVar.L0(((Integer) obj).intValue());
                return;
            case k.STRING_FIELD_NUMBER:
                mVar.J0(((Long) obj).longValue());
                return;
            case k.STRING_SET_FIELD_NUMBER:
                mVar.H0(((Integer) obj).intValue());
                return;
            case k.DOUBLE_FIELD_NUMBER:
                mVar.B0(((Boolean) obj).booleanValue() ? (byte) 1 : 0);
                return;
            case k.BYTES_FIELD_NUMBER:
                if (obj instanceof C0103g) {
                    mVar.F0((C0103g) obj);
                    return;
                } else {
                    mVar.N0((String) obj);
                    return;
                }
            case 9:
                ((C0097a) obj).b(mVar);
                return;
            case 10:
                C0097a aVar = (C0097a) obj;
                mVar.getClass();
                mVar.Q0(((C0118w) aVar).a((W) null));
                aVar.b(mVar);
                return;
            case 11:
                if (obj instanceof C0103g) {
                    mVar.F0((C0103g) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                mVar.Q0(length);
                mVar.C0(bArr, 0, length);
                return;
            case 12:
                mVar.Q0(((Integer) obj).intValue());
                return;
            case 13:
                mVar.L0(((Integer) obj).intValue());
                return;
            case 14:
                mVar.H0(((Integer) obj).intValue());
                return;
            case 15:
                mVar.J0(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                mVar.Q0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                mVar.S0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a() {
        Map map;
        Map map2;
        if (!this.f2477b) {
            Y y2 = this.f2476a;
            int size = y2.f2395f.size();
            for (int i3 = 0; i3 < size; i3++) {
                Map.Entry c3 = y2.c(i3);
                if (c3.getValue() instanceof C0118w) {
                    C0118w wVar = (C0118w) c3.getValue();
                    wVar.getClass();
                    T t3 = T.f2381c;
                    t3.getClass();
                    t3.a(wVar.getClass()).h(wVar);
                    wVar.j();
                }
            }
            if (!y2.f2397h) {
                if (y2.f2395f.size() <= 0) {
                    Iterator it = y2.d().iterator();
                    if (it.hasNext()) {
                        ((Map.Entry) it.next()).getKey().getClass();
                        throw new ClassCastException();
                    }
                } else {
                    y2.c(0).getKey().getClass();
                    throw new ClassCastException();
                }
            }
            if (!y2.f2397h) {
                if (y2.f2396g.isEmpty()) {
                    map = Collections.emptyMap();
                } else {
                    map = Collections.unmodifiableMap(y2.f2396g);
                }
                y2.f2396g = map;
                if (y2.f2399j.isEmpty()) {
                    map2 = Collections.emptyMap();
                } else {
                    map2 = Collections.unmodifiableMap(y2.f2399j);
                }
                y2.f2399j = map2;
                y2.f2397h = true;
            }
            this.f2477b = true;
        }
    }

    public final Object clone() {
        r rVar = new r();
        Y y2 = this.f2476a;
        if (y2.f2395f.size() <= 0) {
            Iterator it = y2.d().iterator();
            if (!it.hasNext()) {
                return rVar;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() == null) {
                entry.getValue();
                throw null;
            }
            throw new ClassCastException();
        }
        Map.Entry c3 = y2.c(0);
        if (c3.getKey() == null) {
            c3.getValue();
            throw null;
        }
        throw new ClassCastException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return this.f2476a.equals(((r) obj).f2476a);
    }

    public final int hashCode() {
        return this.f2476a.hashCode();
    }

    public r(int i3) {
        a();
        a();
    }
}
