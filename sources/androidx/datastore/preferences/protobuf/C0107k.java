package androidx.datastore.preferences.protobuf;

import L.k;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.k  reason: case insensitive filesystem */
public final class C0107k {

    /* renamed from: a  reason: collision with root package name */
    public final C0106j f2452a;

    /* renamed from: b  reason: collision with root package name */
    public int f2453b;

    /* renamed from: c  reason: collision with root package name */
    public int f2454c;

    /* renamed from: d  reason: collision with root package name */
    public int f2455d = 0;

    public C0107k(C0106j jVar) {
        Charset charset = C0120y.f2497a;
        this.f2452a = jVar;
        jVar.f2450b = this;
    }

    public final int a() {
        int i3 = this.f2455d;
        if (i3 != 0) {
            this.f2453b = i3;
            this.f2455d = 0;
        } else {
            this.f2453b = this.f2452a.u();
        }
        int i4 = this.f2453b;
        if (i4 == 0 || i4 == this.f2454c) {
            return Integer.MAX_VALUE;
        }
        return i4 >>> 3;
    }

    public final void b(Object obj, W w3, C0111o oVar) {
        int i3 = this.f2454c;
        this.f2454c = ((this.f2453b >>> 3) << 3) | 4;
        try {
            w3.b(obj, this, oVar);
            if (this.f2453b != this.f2454c) {
                throw new IOException("Failed to parse the message.");
            }
        } finally {
            this.f2454c = i3;
        }
    }

    public final void c(Object obj, W w3, C0111o oVar) {
        C0106j jVar = this.f2452a;
        int v = jVar.v();
        if (jVar.f2449a < 100) {
            int e2 = jVar.e(v);
            jVar.f2449a++;
            w3.b(obj, this, oVar);
            jVar.a(0);
            jVar.f2449a--;
            jVar.d(e2);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public final void d(C0119x xVar) {
        int u3;
        int i3 = this.f2453b & 7;
        C0106j jVar = this.f2452a;
        if (i3 == 0) {
            do {
                ((U) xVar).add(Boolean.valueOf(jVar.f()));
                if (!jVar.c()) {
                    u3 = jVar.u();
                } else {
                    return;
                }
            } while (u3 == this.f2453b);
            this.f2455d = u3;
        } else if (i3 == 2) {
            int b3 = jVar.b() + jVar.v();
            do {
                ((U) xVar).add(Boolean.valueOf(jVar.f()));
            } while (jVar.b() < b3);
            v(b3);
        } else {
            throw A.b();
        }
    }

    public final C0103g e() {
        w(2);
        return this.f2452a.g();
    }

    public final void f(C0119x xVar) {
        int u3;
        if ((this.f2453b & 7) == 2) {
            do {
                ((U) xVar).add(e());
                C0106j jVar = this.f2452a;
                if (!jVar.c()) {
                    u3 = jVar.u();
                } else {
                    return;
                }
            } while (u3 == this.f2453b);
            this.f2455d = u3;
            return;
        }
        throw A.b();
    }

    public final void g(C0119x xVar) {
        int u3;
        int i3 = this.f2453b & 7;
        C0106j jVar = this.f2452a;
        if (i3 == 1) {
            do {
                ((U) xVar).add(Double.valueOf(jVar.h()));
                if (!jVar.c()) {
                    u3 = jVar.u();
                } else {
                    return;
                }
            } while (u3 == this.f2453b);
            this.f2455d = u3;
        } else if (i3 == 2) {
            int v = jVar.v();
            if ((v & 7) == 0) {
                int b3 = jVar.b() + v;
                do {
                    ((U) xVar).add(Double.valueOf(jVar.h()));
                } while (jVar.b() < b3);
                return;
            }
            throw new IOException("Failed to parse the message.");
        } else {
            throw A.b();
        }
    }

    public final void h(C0119x xVar) {
        int u3;
        int i3 = this.f2453b & 7;
        C0106j jVar = this.f2452a;
        if (i3 == 0) {
            do {
                ((U) xVar).add(Integer.valueOf(jVar.i()));
                if (!jVar.c()) {
                    u3 = jVar.u();
                } else {
                    return;
                }
            } while (u3 == this.f2453b);
            this.f2455d = u3;
        } else if (i3 == 2) {
            int b3 = jVar.b() + jVar.v();
            do {
                ((U) xVar).add(Integer.valueOf(jVar.i()));
            } while (jVar.b() < b3);
            v(b3);
        } else {
            throw A.b();
        }
    }

    public final Object i(q0 q0Var, Class cls, C0111o oVar) {
        int ordinal = q0Var.ordinal();
        C0106j jVar = this.f2452a;
        switch (ordinal) {
            case 0:
                w(1);
                return Double.valueOf(jVar.h());
            case 1:
                w(5);
                return Float.valueOf(jVar.l());
            case k.FLOAT_FIELD_NUMBER:
                w(0);
                return Long.valueOf(jVar.n());
            case k.INTEGER_FIELD_NUMBER:
                w(0);
                return Long.valueOf(jVar.w());
            case k.LONG_FIELD_NUMBER:
                w(0);
                return Integer.valueOf(jVar.m());
            case k.STRING_FIELD_NUMBER:
                w(1);
                return Long.valueOf(jVar.k());
            case k.STRING_SET_FIELD_NUMBER:
                w(5);
                return Integer.valueOf(jVar.j());
            case k.DOUBLE_FIELD_NUMBER:
                w(0);
                return Boolean.valueOf(jVar.f());
            case k.BYTES_FIELD_NUMBER:
                w(2);
                return jVar.t();
            case 10:
                w(2);
                W a2 = T.f2381c.a(cls);
                C0118w g2 = a2.g();
                c(g2, a2, oVar);
                a2.h(g2);
                return g2;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(jVar.v());
            case 13:
                w(0);
                return Integer.valueOf(jVar.i());
            case 14:
                w(5);
                return Integer.valueOf(jVar.o());
            case 15:
                w(1);
                return Long.valueOf(jVar.p());
            case 16:
                w(0);
                return Integer.valueOf(jVar.q());
            case 17:
                w(0);
                return Long.valueOf(jVar.r());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final void j(C0119x xVar) {
        int u3;
        int i3 = this.f2453b & 7;
        C0106j jVar = this.f2452a;
        if (i3 == 2) {
            int v = jVar.v();
            if ((v & 3) == 0) {
                int b3 = jVar.b() + v;
                do {
                    ((U) xVar).add(Integer.valueOf(jVar.j()));
                } while (jVar.b() < b3);
                return;
            }
            throw new IOException("Failed to parse the message.");
        } else if (i3 == 5) {
            do {
                ((U) xVar).add(Integer.valueOf(jVar.j()));
                if (!jVar.c()) {
                    u3 = jVar.u();
                } else {
                    return;
                }
            } while (u3 == this.f2453b);
            this.f2455d = u3;
        } else {
            throw A.b();
        }
    }

    public final void k(C0119x xVar) {
        int u3;
        int i3 = this.f2453b & 7;
        C0106j jVar = this.f2452a;
        if (i3 == 1) {
            do {
                ((U) xVar).add(Long.valueOf(jVar.k()));
                if (!jVar.c()) {
                    u3 = jVar.u();
                } else {
                    return;
                }
            } while (u3 == this.f2453b);
            this.f2455d = u3;
        } else if (i3 == 2) {
            int v = jVar.v();
            if ((v & 7) == 0) {
                int b3 = jVar.b() + v;
                do {
                    ((U) xVar).add(Long.valueOf(jVar.k()));
                } while (jVar.b() < b3);
                return;
            }
            throw new IOException("Failed to parse the message.");
        } else {
            throw A.b();
        }
    }

    public final void l(C0119x xVar) {
        int u3;
        int i3 = this.f2453b & 7;
        C0106j jVar = this.f2452a;
        if (i3 == 2) {
            int v = jVar.v();
            if ((v & 3) == 0) {
                int b3 = jVar.b() + v;
                do {
                    ((U) xVar).add(Float.valueOf(jVar.l()));
                } while (jVar.b() < b3);
                return;
            }
            throw new IOException("Failed to parse the message.");
        } else if (i3 == 5) {
            do {
                ((U) xVar).add(Float.valueOf(jVar.l()));
                if (!jVar.c()) {
                    u3 = jVar.u();
                } else {
                    return;
                }
            } while (u3 == this.f2453b);
            this.f2455d = u3;
        } else {
            throw A.b();
        }
    }

    public final void m(C0119x xVar) {
        int u3;
        int i3 = this.f2453b & 7;
        C0106j jVar = this.f2452a;
        if (i3 == 0) {
            do {
                ((U) xVar).add(Integer.valueOf(jVar.m()));
                if (!jVar.c()) {
                    u3 = jVar.u();
                } else {
                    return;
                }
            } while (u3 == this.f2453b);
            this.f2455d = u3;
        } else if (i3 == 2) {
            int b3 = jVar.b() + jVar.v();
            do {
                ((U) xVar).add(Integer.valueOf(jVar.m()));
            } while (jVar.b() < b3);
            v(b3);
        } else {
            throw A.b();
        }
    }

    public final void n(C0119x xVar) {
        int u3;
        int i3 = this.f2453b & 7;
        C0106j jVar = this.f2452a;
        if (i3 == 0) {
            do {
                ((U) xVar).add(Long.valueOf(jVar.n()));
                if (!jVar.c()) {
                    u3 = jVar.u();
                } else {
                    return;
                }
            } while (u3 == this.f2453b);
            this.f2455d = u3;
        } else if (i3 == 2) {
            int b3 = jVar.b() + jVar.v();
            do {
                ((U) xVar).add(Long.valueOf(jVar.n()));
            } while (jVar.b() < b3);
            v(b3);
        } else {
            throw A.b();
        }
    }

    public final void o(C0119x xVar) {
        int u3;
        int i3 = this.f2453b & 7;
        C0106j jVar = this.f2452a;
        if (i3 == 2) {
            int v = jVar.v();
            if ((v & 3) == 0) {
                int b3 = jVar.b() + v;
                do {
                    ((U) xVar).add(Integer.valueOf(jVar.o()));
                } while (jVar.b() < b3);
                return;
            }
            throw new IOException("Failed to parse the message.");
        } else if (i3 == 5) {
            do {
                ((U) xVar).add(Integer.valueOf(jVar.o()));
                if (!jVar.c()) {
                    u3 = jVar.u();
                } else {
                    return;
                }
            } while (u3 == this.f2453b);
            this.f2455d = u3;
        } else {
            throw A.b();
        }
    }

    public final void p(C0119x xVar) {
        int u3;
        int i3 = this.f2453b & 7;
        C0106j jVar = this.f2452a;
        if (i3 == 1) {
            do {
                ((U) xVar).add(Long.valueOf(jVar.p()));
                if (!jVar.c()) {
                    u3 = jVar.u();
                } else {
                    return;
                }
            } while (u3 == this.f2453b);
            this.f2455d = u3;
        } else if (i3 == 2) {
            int v = jVar.v();
            if ((v & 7) == 0) {
                int b3 = jVar.b() + v;
                do {
                    ((U) xVar).add(Long.valueOf(jVar.p()));
                } while (jVar.b() < b3);
                return;
            }
            throw new IOException("Failed to parse the message.");
        } else {
            throw A.b();
        }
    }

    public final void q(C0119x xVar) {
        int u3;
        int i3 = this.f2453b & 7;
        C0106j jVar = this.f2452a;
        if (i3 == 0) {
            do {
                ((U) xVar).add(Integer.valueOf(jVar.q()));
                if (!jVar.c()) {
                    u3 = jVar.u();
                } else {
                    return;
                }
            } while (u3 == this.f2453b);
            this.f2455d = u3;
        } else if (i3 == 2) {
            int b3 = jVar.b() + jVar.v();
            do {
                ((U) xVar).add(Integer.valueOf(jVar.q()));
            } while (jVar.b() < b3);
            v(b3);
        } else {
            throw A.b();
        }
    }

    public final void r(C0119x xVar) {
        int u3;
        int i3 = this.f2453b & 7;
        C0106j jVar = this.f2452a;
        if (i3 == 0) {
            do {
                ((U) xVar).add(Long.valueOf(jVar.r()));
                if (!jVar.c()) {
                    u3 = jVar.u();
                } else {
                    return;
                }
            } while (u3 == this.f2453b);
            this.f2455d = u3;
        } else if (i3 == 2) {
            int b3 = jVar.b() + jVar.v();
            do {
                ((U) xVar).add(Long.valueOf(jVar.r()));
            } while (jVar.b() < b3);
            v(b3);
        } else {
            throw A.b();
        }
    }

    public final void s(C0119x xVar, boolean z3) {
        String str;
        int u3;
        if ((this.f2453b & 7) == 2) {
            do {
                C0106j jVar = this.f2452a;
                if (z3) {
                    w(2);
                    str = jVar.t();
                } else {
                    w(2);
                    str = jVar.s();
                }
                ((U) xVar).add(str);
                if (!jVar.c()) {
                    u3 = jVar.u();
                } else {
                    return;
                }
            } while (u3 == this.f2453b);
            this.f2455d = u3;
            return;
        }
        throw A.b();
    }

    public final void t(C0119x xVar) {
        int u3;
        int i3 = this.f2453b & 7;
        C0106j jVar = this.f2452a;
        if (i3 == 0) {
            do {
                ((U) xVar).add(Integer.valueOf(jVar.v()));
                if (!jVar.c()) {
                    u3 = jVar.u();
                } else {
                    return;
                }
            } while (u3 == this.f2453b);
            this.f2455d = u3;
        } else if (i3 == 2) {
            int b3 = jVar.b() + jVar.v();
            do {
                ((U) xVar).add(Integer.valueOf(jVar.v()));
            } while (jVar.b() < b3);
            v(b3);
        } else {
            throw A.b();
        }
    }

    public final void u(C0119x xVar) {
        int u3;
        int i3 = this.f2453b & 7;
        C0106j jVar = this.f2452a;
        if (i3 == 0) {
            do {
                ((U) xVar).add(Long.valueOf(jVar.w()));
                if (!jVar.c()) {
                    u3 = jVar.u();
                } else {
                    return;
                }
            } while (u3 == this.f2453b);
            this.f2455d = u3;
        } else if (i3 == 2) {
            int b3 = jVar.b() + jVar.v();
            do {
                ((U) xVar).add(Long.valueOf(jVar.w()));
            } while (jVar.b() < b3);
            v(b3);
        } else {
            throw A.b();
        }
    }

    public final void v(int i3) {
        if (this.f2452a.b() != i3) {
            throw A.e();
        }
    }

    public final void w(int i3) {
        if ((this.f2453b & 7) != i3) {
            throw A.b();
        }
    }

    public final boolean x() {
        int i3;
        C0106j jVar = this.f2452a;
        if (jVar.c() || (i3 = this.f2453b) == this.f2454c) {
            return false;
        }
        return jVar.x(i3);
    }
}
