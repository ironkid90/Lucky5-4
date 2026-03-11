package y1;

import S2.e;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

public final class l extends AbstractMap implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    public static final e f4868m = new e(2);

    /* renamed from: f  reason: collision with root package name */
    public final Comparator f4869f;

    /* renamed from: g  reason: collision with root package name */
    public k f4870g;

    /* renamed from: h  reason: collision with root package name */
    public int f4871h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f4872i = 0;

    /* renamed from: j  reason: collision with root package name */
    public final k f4873j = new k();

    /* renamed from: k  reason: collision with root package name */
    public j f4874k;

    /* renamed from: l  reason: collision with root package name */
    public j f4875l;

    public l() {
        e eVar = f4868m;
        this.f4869f = eVar;
    }

    public final k a(Object obj, boolean z3) {
        int i3;
        k kVar;
        Comparable comparable;
        k kVar2;
        k kVar3 = this.f4870g;
        e eVar = f4868m;
        Comparator comparator = this.f4869f;
        if (kVar3 != null) {
            if (comparator == eVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = kVar3.f4865k;
                if (comparable != null) {
                    i3 = comparable.compareTo(obj2);
                } else {
                    i3 = comparator.compare(obj, obj2);
                }
                if (i3 == 0) {
                    return kVar3;
                }
                if (i3 < 0) {
                    kVar2 = kVar3.f4861g;
                } else {
                    kVar2 = kVar3.f4862h;
                }
                if (kVar2 == null) {
                    break;
                }
                kVar3 = kVar2;
            }
        } else {
            i3 = 0;
        }
        if (!z3) {
            return null;
        }
        k kVar4 = this.f4873j;
        if (kVar3 != null) {
            kVar = new k(kVar3, obj, kVar4, kVar4.f4864j);
            if (i3 < 0) {
                kVar3.f4861g = kVar;
            } else {
                kVar3.f4862h = kVar;
            }
            b(kVar3, true);
        } else if (comparator != eVar || (obj instanceof Comparable)) {
            kVar = new k(kVar3, obj, kVar4, kVar4.f4864j);
            this.f4870g = kVar;
        } else {
            throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
        }
        this.f4871h++;
        this.f4872i++;
        return kVar;
    }

    public final void b(k kVar, boolean z3) {
        int i3;
        int i4;
        int i5;
        int i6;
        while (kVar != null) {
            k kVar2 = kVar.f4861g;
            k kVar3 = kVar.f4862h;
            int i7 = 0;
            if (kVar2 != null) {
                i3 = kVar2.f4867m;
            } else {
                i3 = 0;
            }
            if (kVar3 != null) {
                i4 = kVar3.f4867m;
            } else {
                i4 = 0;
            }
            int i8 = i3 - i4;
            if (i8 == -2) {
                k kVar4 = kVar3.f4861g;
                k kVar5 = kVar3.f4862h;
                if (kVar5 != null) {
                    i6 = kVar5.f4867m;
                } else {
                    i6 = 0;
                }
                if (kVar4 != null) {
                    i7 = kVar4.f4867m;
                }
                int i9 = i7 - i6;
                if (i9 == -1 || (i9 == 0 && !z3)) {
                    e(kVar);
                } else {
                    f(kVar3);
                    e(kVar);
                }
                if (z3) {
                    return;
                }
            } else if (i8 == 2) {
                k kVar6 = kVar2.f4861g;
                k kVar7 = kVar2.f4862h;
                if (kVar7 != null) {
                    i5 = kVar7.f4867m;
                } else {
                    i5 = 0;
                }
                if (kVar6 != null) {
                    i7 = kVar6.f4867m;
                }
                int i10 = i7 - i5;
                if (i10 == 1 || (i10 == 0 && !z3)) {
                    f(kVar);
                } else {
                    e(kVar2);
                    f(kVar);
                }
                if (z3) {
                    return;
                }
            } else if (i8 == 0) {
                kVar.f4867m = i3 + 1;
                if (z3) {
                    return;
                }
            } else {
                kVar.f4867m = Math.max(i3, i4) + 1;
                if (!z3) {
                    return;
                }
            }
            kVar = kVar.f4860f;
        }
    }

    public final void c(k kVar, boolean z3) {
        k kVar2;
        int i3;
        k kVar3;
        if (z3) {
            k kVar4 = kVar.f4864j;
            kVar4.f4863i = kVar.f4863i;
            kVar.f4863i.f4864j = kVar4;
        }
        k kVar5 = kVar.f4861g;
        k kVar6 = kVar.f4862h;
        k kVar7 = kVar.f4860f;
        int i4 = 0;
        if (kVar5 == null || kVar6 == null) {
            if (kVar5 != null) {
                d(kVar, kVar5);
                kVar.f4861g = null;
            } else if (kVar6 != null) {
                d(kVar, kVar6);
                kVar.f4862h = null;
            } else {
                d(kVar, (k) null);
            }
            b(kVar7, false);
            this.f4871h--;
            this.f4872i++;
            return;
        }
        if (kVar5.f4867m > kVar6.f4867m) {
            k kVar8 = kVar5.f4862h;
            while (true) {
                k kVar9 = kVar8;
                kVar2 = kVar5;
                kVar5 = kVar9;
                if (kVar5 == null) {
                    break;
                }
                kVar8 = kVar5.f4862h;
            }
        } else {
            k kVar10 = kVar6.f4861g;
            while (true) {
                k kVar11 = kVar6;
                kVar6 = kVar10;
                kVar3 = kVar11;
                if (kVar6 == null) {
                    break;
                }
                kVar10 = kVar6.f4861g;
            }
            kVar2 = kVar3;
        }
        c(kVar2, false);
        k kVar12 = kVar.f4861g;
        if (kVar12 != null) {
            i3 = kVar12.f4867m;
            kVar2.f4861g = kVar12;
            kVar12.f4860f = kVar2;
            kVar.f4861g = null;
        } else {
            i3 = 0;
        }
        k kVar13 = kVar.f4862h;
        if (kVar13 != null) {
            i4 = kVar13.f4867m;
            kVar2.f4862h = kVar13;
            kVar13.f4860f = kVar2;
            kVar.f4862h = null;
        }
        kVar2.f4867m = Math.max(i3, i4) + 1;
        d(kVar, kVar2);
    }

    public final void clear() {
        this.f4870g = null;
        this.f4871h = 0;
        this.f4872i++;
        k kVar = this.f4873j;
        kVar.f4864j = kVar;
        kVar.f4863i = kVar;
    }

    public final boolean containsKey(Object obj) {
        k kVar = null;
        if (obj != null) {
            try {
                kVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (kVar != null) {
            return true;
        }
        return false;
    }

    public final void d(k kVar, k kVar2) {
        k kVar3 = kVar.f4860f;
        kVar.f4860f = null;
        if (kVar2 != null) {
            kVar2.f4860f = kVar3;
        }
        if (kVar3 == null) {
            this.f4870g = kVar2;
        } else if (kVar3.f4861g == kVar) {
            kVar3.f4861g = kVar2;
        } else {
            kVar3.f4862h = kVar2;
        }
    }

    public final void e(k kVar) {
        int i3;
        int i4;
        k kVar2 = kVar.f4861g;
        k kVar3 = kVar.f4862h;
        k kVar4 = kVar3.f4861g;
        k kVar5 = kVar3.f4862h;
        kVar.f4862h = kVar4;
        if (kVar4 != null) {
            kVar4.f4860f = kVar;
        }
        d(kVar, kVar3);
        kVar3.f4861g = kVar;
        kVar.f4860f = kVar3;
        int i5 = 0;
        if (kVar2 != null) {
            i3 = kVar2.f4867m;
        } else {
            i3 = 0;
        }
        if (kVar4 != null) {
            i4 = kVar4.f4867m;
        } else {
            i4 = 0;
        }
        int max = Math.max(i3, i4) + 1;
        kVar.f4867m = max;
        if (kVar5 != null) {
            i5 = kVar5.f4867m;
        }
        kVar3.f4867m = Math.max(max, i5) + 1;
    }

    public final Set entrySet() {
        j jVar = this.f4874k;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 0);
        this.f4874k = jVar2;
        return jVar2;
    }

    public final void f(k kVar) {
        int i3;
        int i4;
        k kVar2 = kVar.f4861g;
        k kVar3 = kVar.f4862h;
        k kVar4 = kVar2.f4861g;
        k kVar5 = kVar2.f4862h;
        kVar.f4861g = kVar5;
        if (kVar5 != null) {
            kVar5.f4860f = kVar;
        }
        d(kVar, kVar2);
        kVar2.f4862h = kVar;
        kVar.f4860f = kVar2;
        int i5 = 0;
        if (kVar3 != null) {
            i3 = kVar3.f4867m;
        } else {
            i3 = 0;
        }
        if (kVar5 != null) {
            i4 = kVar5.f4867m;
        } else {
            i4 = 0;
        }
        int max = Math.max(i3, i4) + 1;
        kVar.f4867m = max;
        if (kVar4 != null) {
            i5 = kVar4.f4867m;
        }
        kVar2.f4867m = Math.max(max, i5) + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 0
            y1.k r3 = r2.a(r3, r1)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x000e
            java.lang.Object r0 = r3.f4866l
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.l.get(java.lang.Object):java.lang.Object");
    }

    public final Set keySet() {
        j jVar = this.f4875l;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 1);
        this.f4875l = jVar2;
        return jVar2;
    }

    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            k a2 = a(obj, true);
            Object obj3 = a2.f4866l;
            a2.f4866l = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 0
            y1.k r3 = r2.a(r3, r1)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x0010
            r1 = 1
            r2.c(r3, r1)
        L_0x0010:
            if (r3 == 0) goto L_0x0014
            java.lang.Object r0 = r3.f4866l
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.l.remove(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.f4871h;
    }
}
