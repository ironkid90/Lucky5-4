package S2;

import A2.h;
import A2.i;
import R2.l;
import android.support.v4.media.session.a;
import java.util.ArrayList;
import q2.C0401d;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final R2.b f1528a = a.p("/");

    /* renamed from: b  reason: collision with root package name */
    public static final R2.b f1529b = a.p("\\");

    /* renamed from: c  reason: collision with root package name */
    public static final R2.b f1530c = a.p("/\\");

    /* renamed from: d  reason: collision with root package name */
    public static final R2.b f1531d = a.p(".");

    /* renamed from: e  reason: collision with root package name */
    public static final R2.b f1532e = a.p("..");

    static {
        R2.b bVar = R2.b.f1368i;
    }

    public static final int a(l lVar) {
        if (lVar.f1394f.b() == 0) {
            return -1;
        }
        R2.b bVar = lVar.f1394f;
        if (bVar.g(0) != 47) {
            if (bVar.g(0) == 92) {
                if (bVar.b() > 2 && bVar.g(1) == 92) {
                    R2.b bVar2 = f1529b;
                    i.e(bVar2, "other");
                    int d3 = bVar.d(bVar2.f1369f, 2);
                    if (d3 == -1) {
                        return bVar.b();
                    }
                    return d3;
                }
            } else if (bVar.b() <= 2 || bVar.g(1) != 58 || bVar.g(2) != 92) {
                return -1;
            } else {
                char g2 = (char) bVar.g(0);
                if (('a' > g2 || g2 >= '{') && ('A' > g2 || g2 >= '[')) {
                    return -1;
                }
                return 3;
            }
        }
        return 1;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [R2.a, java.lang.Object] */
    public static final l b(l lVar, l lVar2, boolean z3) {
        i.e(lVar, "<this>");
        i.e(lVar2, "child");
        if (a(lVar2) != -1 || lVar2.g() != null) {
            return lVar2;
        }
        R2.b c3 = c(lVar);
        if (c3 == null && (c3 = c(lVar2)) == null) {
            c3 = f(l.f1393g);
        }
        ? obj = new Object();
        obj.m(lVar.f1394f);
        if (obj.f1367g > 0) {
            obj.m(c3);
        }
        obj.m(lVar2.f1394f);
        return d(obj, z3);
    }

    public static final R2.b c(l lVar) {
        R2.b bVar = lVar.f1394f;
        R2.b bVar2 = f1528a;
        if (R2.b.e(bVar, bVar2) != -1) {
            return bVar2;
        }
        R2.b bVar3 = f1529b;
        if (R2.b.e(lVar.f1394f, bVar3) != -1) {
            return bVar3;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [R2.a, java.lang.Object] */
    public static final l d(R2.a aVar, boolean z3) {
        R2.b bVar;
        boolean z4;
        boolean z5;
        boolean z6;
        R2.b bVar2;
        R2.b bVar3;
        R2.b bVar4;
        char a2;
        R2.a aVar2 = aVar;
        ? obj = new Object();
        R2.b bVar5 = null;
        int i3 = 0;
        while (true) {
            if (!aVar2.c(f1528a)) {
                bVar = f1529b;
                if (!aVar2.c(bVar)) {
                    break;
                }
            }
            byte d3 = aVar.d();
            if (bVar5 == null) {
                bVar5 = e(d3);
            }
            i3++;
        }
        if (i3 < 2 || !i.a(bVar5, bVar)) {
            z4 = false;
        } else {
            z4 = true;
        }
        R2.b bVar6 = f1530c;
        if (z4) {
            i.b(bVar5);
            obj.m(bVar5);
            obj.m(bVar5);
        } else if (i3 > 0) {
            i.b(bVar5);
            obj.m(bVar5);
        } else {
            long b3 = aVar2.b(bVar6);
            if (bVar5 == null) {
                if (b3 == -1) {
                    bVar5 = f(l.f1393g);
                } else {
                    bVar5 = e(aVar2.a(b3));
                }
            }
            if (!i.a(bVar5, bVar)) {
                bVar4 = bVar5;
            } else {
                bVar4 = bVar5;
                if (aVar2.f1367g >= 2 && aVar2.a(1) == 58 && (('a' <= (a2 = (char) aVar2.a(0)) && a2 < '{') || ('A' <= a2 && a2 < '['))) {
                    if (b3 == 2) {
                        obj.l(aVar2, 3);
                    } else {
                        obj.l(aVar2, 2);
                    }
                }
            }
            bVar5 = bVar4;
        }
        if (obj.f1367g > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (aVar2.f1367g == 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            bVar2 = f1531d;
            if (z6) {
                break;
            }
            long b4 = aVar2.b(bVar6);
            if (b4 == -1) {
                bVar3 = aVar2.g(aVar2.f1367g);
            } else {
                bVar3 = aVar2.g(b4);
                aVar.d();
            }
            R2.b bVar7 = f1532e;
            if (i.a(bVar3, bVar7)) {
                if (!z5 || !arrayList.isEmpty()) {
                    if (!z3 || (!z5 && (arrayList.isEmpty() || i.a(C0401d.f0(arrayList), bVar7)))) {
                        arrayList.add(bVar3);
                    } else if ((!z4 || arrayList.size() != 1) && !arrayList.isEmpty()) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
            } else if (!i.a(bVar3, bVar2) && !i.a(bVar3, R2.b.f1368i)) {
                arrayList.add(bVar3);
            }
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 > 0) {
                obj.m(bVar5);
            }
            obj.m((R2.b) arrayList.get(i4));
        }
        if (obj.f1367g == 0) {
            obj.m(bVar2);
        }
        return new l(obj.g(obj.f1367g));
    }

    public static final R2.b e(byte b3) {
        if (b3 == 47) {
            return f1528a;
        }
        if (b3 == 92) {
            return f1529b;
        }
        throw new IllegalArgumentException(h.e("not a directory separator: ", b3));
    }

    public static final R2.b f(String str) {
        if (i.a(str, "/")) {
            return f1528a;
        }
        if (i.a(str, "\\")) {
            return f1529b;
        }
        throw new IllegalArgumentException(h.g("not a directory separator: ", str));
    }
}
