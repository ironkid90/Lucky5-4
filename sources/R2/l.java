package R2;

import A2.i;
import S2.b;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public final class l implements Comparable {

    /* renamed from: g  reason: collision with root package name */
    public static final String f1393g;

    /* renamed from: f  reason: collision with root package name */
    public final b f1394f;

    static {
        String str = File.separator;
        i.d(str, "separator");
        f1393g = str;
    }

    public l(b bVar) {
        i.e(bVar, "bytes");
        this.f1394f = bVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a2 = b.a(this);
        b bVar = this.f1394f;
        if (a2 == -1) {
            a2 = 0;
        } else if (a2 < bVar.b() && bVar.g(a2) == 92) {
            a2++;
        }
        int b3 = bVar.b();
        int i3 = a2;
        while (a2 < b3) {
            if (bVar.g(a2) == 47 || bVar.g(a2) == 92) {
                arrayList.add(bVar.l(i3, a2));
                i3 = a2 + 1;
            }
            a2++;
        }
        if (i3 < bVar.b()) {
            arrayList.add(bVar.l(i3, bVar.b()));
        }
        return arrayList;
    }

    public final String b() {
        b bVar = b.f1528a;
        b bVar2 = b.f1528a;
        b bVar3 = this.f1394f;
        int i3 = b.i(bVar3, bVar2);
        if (i3 == -1) {
            i3 = b.i(bVar3, b.f1529b);
        }
        if (i3 != -1) {
            bVar3 = b.m(bVar3, i3 + 1, 0, 2);
        } else if (g() != null && bVar3.b() == 2) {
            bVar3 = b.f1368i;
        }
        return bVar3.n();
    }

    public final l c() {
        b bVar = b.f1531d;
        b bVar2 = this.f1394f;
        if (i.a(bVar2, bVar)) {
            return null;
        }
        b bVar3 = b.f1528a;
        if (i.a(bVar2, bVar3)) {
            return null;
        }
        b bVar4 = b.f1529b;
        if (i.a(bVar2, bVar4)) {
            return null;
        }
        b bVar5 = b.f1532e;
        bVar2.getClass();
        i.e(bVar5, "suffix");
        int b3 = bVar2.b();
        byte[] bArr = bVar5.f1369f;
        if (bVar2.j(b3 - bArr.length, bVar5, bArr.length) && (bVar2.b() == 2 || bVar2.j(bVar2.b() - 3, bVar3, 1) || bVar2.j(bVar2.b() - 3, bVar4, 1))) {
            return null;
        }
        int i3 = b.i(bVar2, bVar3);
        if (i3 == -1) {
            i3 = b.i(bVar2, bVar4);
        }
        if (i3 != 2 || g() == null) {
            if (i3 == 1) {
                i.e(bVar4, "prefix");
                if (bVar2.j(0, bVar4, bVar4.f1369f.length)) {
                    return null;
                }
            }
            if (i3 != -1 || g() == null) {
                if (i3 == -1) {
                    return new l(bVar);
                }
                if (i3 == 0) {
                    return new l(b.m(bVar2, 0, 1, 1));
                }
                return new l(b.m(bVar2, 0, i3, 1));
            } else if (bVar2.b() == 2) {
                return null;
            } else {
                return new l(b.m(bVar2, 0, 2, 1));
            }
        } else if (bVar2.b() == 3) {
            return null;
        } else {
            return new l(b.m(bVar2, 0, 3, 1));
        }
    }

    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        i.e(lVar, "other");
        return this.f1394f.compareTo(lVar.f1394f);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [R2.a, java.lang.Object] */
    public final l d(String str) {
        i.e(str, "child");
        ? obj = new Object();
        obj.p(str);
        return b.b(this, b.d(obj, false), false);
    }

    public final File e() {
        return new File(this.f1394f.n());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l) || !i.a(((l) obj).f1394f, this.f1394f)) {
            return false;
        }
        return true;
    }

    public final Path f() {
        Path p3 = Paths.get(this.f1394f.n(), new String[0]);
        i.d(p3, "get(toString())");
        return p3;
    }

    public final Character g() {
        b bVar = b.f1528a;
        b bVar2 = this.f1394f;
        if (b.e(bVar2, bVar) != -1 || bVar2.b() < 2 || bVar2.g(1) != 58) {
            return null;
        }
        char g2 = (char) bVar2.g(0);
        if (('a' > g2 || g2 >= '{') && ('A' > g2 || g2 >= '[')) {
            return null;
        }
        return Character.valueOf(g2);
    }

    public final int hashCode() {
        return this.f1394f.hashCode();
    }

    public final String toString() {
        return this.f1394f.n();
    }
}
