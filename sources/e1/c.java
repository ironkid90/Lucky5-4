package E1;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class c implements Closeable, Flushable {

    /* renamed from: n  reason: collision with root package name */
    public static final String[] f242n = new String[128];

    /* renamed from: o  reason: collision with root package name */
    public static final String[] f243o;

    /* renamed from: f  reason: collision with root package name */
    public final Writer f244f;

    /* renamed from: g  reason: collision with root package name */
    public int[] f245g;

    /* renamed from: h  reason: collision with root package name */
    public int f246h = 0;

    /* renamed from: i  reason: collision with root package name */
    public final String f247i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f248j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f249k;

    /* renamed from: l  reason: collision with root package name */
    public String f250l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f251m;

    static {
        for (int i3 = 0; i3 <= 31; i3++) {
            f242n[i3] = String.format("\\u%04x", new Object[]{Integer.valueOf(i3)});
        }
        String[] strArr = f242n;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f243o = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[32];
        this.f245g = iArr;
        if (iArr.length == 0) {
            this.f245g = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f245g;
        int i3 = this.f246h;
        this.f246h = i3 + 1;
        iArr2[i3] = 6;
        this.f247i = ":";
        this.f251m = true;
        if (writer != null) {
            this.f244f = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    public final void a() {
        int k3 = k();
        if (k3 != 1) {
            Writer writer = this.f244f;
            if (k3 == 2) {
                writer.append(',');
                i();
            } else if (k3 != 4) {
                if (k3 != 6) {
                    if (k3 != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    } else if (!this.f248j) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                this.f245g[this.f246h - 1] = 7;
            } else {
                writer.append(this.f247i);
                this.f245g[this.f246h - 1] = 5;
            }
        } else {
            this.f245g[this.f246h - 1] = 2;
            i();
        }
    }

    public void b() {
        r();
        a();
        int i3 = this.f246h;
        int[] iArr = this.f245g;
        if (i3 == iArr.length) {
            this.f245g = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f245g;
        int i4 = this.f246h;
        this.f246h = i4 + 1;
        iArr2[i4] = 1;
        this.f244f.write(91);
    }

    public void c() {
        r();
        a();
        int i3 = this.f246h;
        int[] iArr = this.f245g;
        if (i3 == iArr.length) {
            this.f245g = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f245g;
        int i4 = this.f246h;
        this.f246h = i4 + 1;
        iArr2[i4] = 3;
        this.f244f.write(123);
    }

    public void close() {
        this.f244f.close();
        int i3 = this.f246h;
        if (i3 > 1 || (i3 == 1 && this.f245g[i3 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f246h = 0;
    }

    public final void d(int i3, int i4, char c3) {
        int k3 = k();
        if (k3 != i4 && k3 != i3) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f250l == null) {
            this.f246h--;
            if (k3 == i4) {
                i();
            }
            this.f244f.write(c3);
        } else {
            throw new IllegalStateException("Dangling name: " + this.f250l);
        }
    }

    public void e() {
        d(1, 2, ']');
    }

    public void flush() {
        if (this.f246h != 0) {
            this.f244f.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public void g() {
        d(3, 5, '}');
    }

    public void h(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f250l != null) {
            throw new IllegalStateException();
        } else if (this.f246h != 0) {
            this.f250l = str;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public c j() {
        if (this.f250l != null) {
            if (this.f251m) {
                r();
            } else {
                this.f250l = null;
                return this;
            }
        }
        a();
        this.f244f.write("null");
        return this;
    }

    public final int k() {
        int i3 = this.f246h;
        if (i3 != 0) {
            return this.f245g[i3 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void l(String str) {
        String[] strArr;
        String str2;
        if (this.f249k) {
            strArr = f243o;
        } else {
            strArr = f242n;
        }
        Writer writer = this.f244f;
        writer.write(34);
        int length = str.length();
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i3 < i4) {
                writer.write(str, i3, i4 - i3);
            }
            writer.write(str2);
            i3 = i4 + 1;
        }
        if (i3 < length) {
            writer.write(str, i3, length - i3);
        }
        writer.write(34);
    }

    public void m(long j3) {
        r();
        a();
        this.f244f.write(Long.toString(j3));
    }

    public void n(Boolean bool) {
        String str;
        if (bool == null) {
            j();
            return;
        }
        r();
        a();
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        this.f244f.write(str);
    }

    public void o(Number number) {
        if (number == null) {
            j();
            return;
        }
        r();
        String obj = number.toString();
        if (this.f248j || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            a();
            this.f244f.append(obj);
            return;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public void p(String str) {
        if (str == null) {
            j();
            return;
        }
        r();
        a();
        l(str);
    }

    public void q(boolean z3) {
        String str;
        r();
        a();
        if (z3) {
            str = "true";
        } else {
            str = "false";
        }
        this.f244f.write(str);
    }

    public final void r() {
        if (this.f250l != null) {
            int k3 = k();
            if (k3 == 5) {
                this.f244f.write(44);
            } else if (k3 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            i();
            this.f245g[this.f246h - 1] = 4;
            l(this.f250l);
            this.f250l = null;
        }
    }

    public final void i() {
    }
}
