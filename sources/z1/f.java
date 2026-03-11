package z1;

import A2.h;
import E1.b;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import w1.l;
import w1.o;
import w1.p;
import w1.q;
import y1.j;

public final class f extends b {

    /* renamed from: y  reason: collision with root package name */
    public static final e f4889y = new e();

    /* renamed from: z  reason: collision with root package name */
    public static final Object f4890z = new Object();

    /* renamed from: u  reason: collision with root package name */
    public Object[] f4891u;
    public int v;

    /* renamed from: w  reason: collision with root package name */
    public String[] f4892w;

    /* renamed from: x  reason: collision with root package name */
    public int[] f4893x;

    public final void B() {
        if (w() == 5) {
            q();
            this.f4892w[this.v - 2] = "null";
        } else {
            G();
            int i3 = this.v;
            if (i3 > 0) {
                this.f4892w[i3 - 1] = "null";
            }
        }
        int i4 = this.v;
        if (i4 > 0) {
            int[] iArr = this.f4893x;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
    }

    public final void D(int i3) {
        if (w() != i3) {
            throw new IllegalStateException("Expected " + h.l(i3) + " but was " + h.l(w()) + E());
        }
    }

    public final String E() {
        return " at path " + i();
    }

    public final Object F() {
        return this.f4891u[this.v - 1];
    }

    public final Object G() {
        Object[] objArr = this.f4891u;
        int i3 = this.v - 1;
        this.v = i3;
        Object obj = objArr[i3];
        objArr[i3] = null;
        return obj;
    }

    public final void H(Object obj) {
        int i3 = this.v;
        Object[] objArr = this.f4891u;
        if (i3 == objArr.length) {
            int i4 = i3 * 2;
            this.f4891u = Arrays.copyOf(objArr, i4);
            this.f4893x = Arrays.copyOf(this.f4893x, i4);
            this.f4892w = (String[]) Arrays.copyOf(this.f4892w, i4);
        }
        Object[] objArr2 = this.f4891u;
        int i5 = this.v;
        this.v = i5 + 1;
        objArr2[i5] = obj;
    }

    public final void a() {
        D(1);
        H(((l) F()).f4740f.iterator());
        this.f4893x[this.v - 1] = 0;
    }

    public final void b() {
        D(3);
        H(((j) ((p) F()).f4742f.entrySet()).iterator());
    }

    public final void close() {
        this.f4891u = new Object[]{f4890z};
        this.v = 1;
    }

    public final void e() {
        D(2);
        G();
        G();
        int i3 = this.v;
        if (i3 > 0) {
            int[] iArr = this.f4893x;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    public final void g() {
        D(4);
        G();
        G();
        int i3 = this.v;
        if (i3 > 0) {
            int[] iArr = this.f4893x;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    public final String i() {
        StringBuilder sb = new StringBuilder("$");
        int i3 = 0;
        while (true) {
            int i4 = this.v;
            if (i3 >= i4) {
                return sb.toString();
            }
            Object[] objArr = this.f4891u;
            Object obj = objArr[i3];
            if (obj instanceof l) {
                i3++;
                if (i3 < i4 && (objArr[i3] instanceof Iterator)) {
                    sb.append('[');
                    sb.append(this.f4893x[i3]);
                    sb.append(']');
                }
            } else if ((obj instanceof p) && (i3 = i3 + 1) < i4 && (objArr[i3] instanceof Iterator)) {
                sb.append('.');
                String str = this.f4892w[i3];
                if (str != null) {
                    sb.append(str);
                }
            }
            i3++;
        }
    }

    public final boolean j() {
        int w3 = w();
        if (w3 == 4 || w3 == 2) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        D(8);
        boolean a2 = ((q) G()).a();
        int i3 = this.v;
        if (i3 > 0) {
            int[] iArr = this.f4893x;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
        return a2;
    }

    public final double n() {
        double d3;
        int w3 = w();
        if (w3 == 7 || w3 == 6) {
            q qVar = (q) F();
            if (qVar.f4743f instanceof Number) {
                d3 = qVar.d().doubleValue();
            } else {
                d3 = Double.parseDouble(qVar.c());
            }
            if (this.f228g || (!Double.isNaN(d3) && !Double.isInfinite(d3))) {
                G();
                int i3 = this.v;
                if (i3 > 0) {
                    int[] iArr = this.f4893x;
                    int i4 = i3 - 1;
                    iArr[i4] = iArr[i4] + 1;
                }
                return d3;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + d3);
        }
        throw new IllegalStateException("Expected " + h.l(7) + " but was " + h.l(w3) + E());
    }

    public final int o() {
        int i3;
        int w3 = w();
        if (w3 == 7 || w3 == 6) {
            q qVar = (q) F();
            if (qVar.f4743f instanceof Number) {
                i3 = qVar.d().intValue();
            } else {
                i3 = Integer.parseInt(qVar.c());
            }
            G();
            int i4 = this.v;
            if (i4 > 0) {
                int[] iArr = this.f4893x;
                int i5 = i4 - 1;
                iArr[i5] = iArr[i5] + 1;
            }
            return i3;
        }
        throw new IllegalStateException("Expected " + h.l(7) + " but was " + h.l(w3) + E());
    }

    public final long p() {
        long j3;
        int w3 = w();
        if (w3 == 7 || w3 == 6) {
            q qVar = (q) F();
            if (qVar.f4743f instanceof Number) {
                j3 = qVar.d().longValue();
            } else {
                j3 = Long.parseLong(qVar.c());
            }
            G();
            int i3 = this.v;
            if (i3 > 0) {
                int[] iArr = this.f4893x;
                int i4 = i3 - 1;
                iArr[i4] = iArr[i4] + 1;
            }
            return j3;
        }
        throw new IllegalStateException("Expected " + h.l(7) + " but was " + h.l(w3) + E());
    }

    public final String q() {
        D(5);
        Map.Entry entry = (Map.Entry) ((Iterator) F()).next();
        String str = (String) entry.getKey();
        this.f4892w[this.v - 1] = str;
        H(entry.getValue());
        return str;
    }

    public final void s() {
        D(9);
        G();
        int i3 = this.v;
        if (i3 > 0) {
            int[] iArr = this.f4893x;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    public final String toString() {
        return f.class.getSimpleName() + E();
    }

    public final String u() {
        int w3 = w();
        if (w3 == 6 || w3 == 7) {
            String c3 = ((q) G()).c();
            int i3 = this.v;
            if (i3 > 0) {
                int[] iArr = this.f4893x;
                int i4 = i3 - 1;
                iArr[i4] = iArr[i4] + 1;
            }
            return c3;
        }
        throw new IllegalStateException("Expected " + h.l(6) + " but was " + h.l(w3) + E());
    }

    public final int w() {
        if (this.v == 0) {
            return 10;
        }
        Object F3 = F();
        if (F3 instanceof Iterator) {
            boolean z3 = this.f4891u[this.v - 2] instanceof p;
            Iterator it = (Iterator) F3;
            if (it.hasNext()) {
                if (z3) {
                    return 5;
                }
                H(it.next());
                return w();
            } else if (z3) {
                return 4;
            } else {
                return 2;
            }
        } else if (F3 instanceof p) {
            return 3;
        } else {
            if (F3 instanceof l) {
                return 1;
            }
            if (F3 instanceof q) {
                Serializable serializable = ((q) F3).f4743f;
                if (serializable instanceof String) {
                    return 6;
                }
                if (serializable instanceof Boolean) {
                    return 8;
                }
                if (serializable instanceof Number) {
                    return 7;
                }
                throw new AssertionError();
            } else if (F3 instanceof o) {
                return 9;
            } else {
                if (F3 == f4890z) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }
}
