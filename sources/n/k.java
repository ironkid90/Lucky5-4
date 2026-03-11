package n;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class k {

    /* renamed from: i  reason: collision with root package name */
    public static Object[] f4085i;

    /* renamed from: j  reason: collision with root package name */
    public static int f4086j;

    /* renamed from: k  reason: collision with root package name */
    public static Object[] f4087k;

    /* renamed from: l  reason: collision with root package name */
    public static int f4088l;

    /* renamed from: f  reason: collision with root package name */
    public int[] f4089f = C0337d.f4061a;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f4090g = C0337d.f4062b;

    /* renamed from: h  reason: collision with root package name */
    public int f4091h = 0;

    public static void b(int[] iArr, Object[] objArr, int i3) {
        if (iArr.length == 8) {
            synchronized (k.class) {
                try {
                    if (f4088l < 10) {
                        objArr[0] = f4087k;
                        objArr[1] = iArr;
                        for (int i4 = (i3 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f4087k = objArr;
                        f4088l++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (k.class) {
                try {
                    if (f4086j < 10) {
                        objArr[0] = f4085i;
                        objArr[1] = iArr;
                        for (int i5 = (i3 << 1) - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f4085i = objArr;
                        f4086j++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void a(int i3) {
        if (i3 == 8) {
            synchronized (k.class) {
                try {
                    Object[] objArr = f4087k;
                    if (objArr != null) {
                        this.f4090g = objArr;
                        f4087k = (Object[]) objArr[0];
                        this.f4089f = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f4088l--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i3 == 4) {
            synchronized (k.class) {
                try {
                    Object[] objArr2 = f4085i;
                    if (objArr2 != null) {
                        this.f4090g = objArr2;
                        f4085i = (Object[]) objArr2[0];
                        this.f4089f = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f4086j--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f4089f = new int[i3];
        this.f4090g = new Object[(i3 << 1)];
    }

    public final int c(int i3, Object obj) {
        int i4 = this.f4091h;
        if (i4 == 0) {
            return -1;
        }
        try {
            int a2 = C0337d.a(i4, i3, this.f4089f);
            if (a2 < 0 || obj.equals(this.f4090g[a2 << 1])) {
                return a2;
            }
            int i5 = a2 + 1;
            while (i5 < i4 && this.f4089f[i5] == i3) {
                if (obj.equals(this.f4090g[i5 << 1])) {
                    return i5;
                }
                i5++;
            }
            int i6 = a2 - 1;
            while (i6 >= 0 && this.f4089f[i6] == i3) {
                if (obj.equals(this.f4090g[i6 << 1])) {
                    return i6;
                }
                i6--;
            }
            return ~i5;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i3 = this.f4091h;
        if (i3 > 0) {
            int[] iArr = this.f4089f;
            Object[] objArr = this.f4090g;
            this.f4089f = C0337d.f4061a;
            this.f4090g = C0337d.f4062b;
            this.f4091h = 0;
            b(iArr, objArr, i3);
        }
        if (this.f4091h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        if (d(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (f(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(Object obj) {
        if (obj == null) {
            return e();
        }
        return c(obj.hashCode(), obj);
    }

    public final int e() {
        int i3 = this.f4091h;
        if (i3 == 0) {
            return -1;
        }
        try {
            int a2 = C0337d.a(i3, 0, this.f4089f);
            if (a2 < 0 || this.f4090g[a2 << 1] == null) {
                return a2;
            }
            int i4 = a2 + 1;
            while (i4 < i3 && this.f4089f[i4] == 0) {
                if (this.f4090g[i4 << 1] == null) {
                    return i4;
                }
                i4++;
            }
            int i5 = a2 - 1;
            while (i5 >= 0 && this.f4089f[i5] == 0) {
                if (this.f4090g[i5 << 1] == null) {
                    return i5;
                }
                i5--;
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f4091h != kVar.f4091h) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.f4091h) {
                try {
                    Object g2 = g(i3);
                    Object i4 = i(i3);
                    Object orDefault = kVar.getOrDefault(g2, (Object) null);
                    if (i4 == null) {
                        if (orDefault != null || !kVar.containsKey(g2)) {
                            return false;
                        }
                    } else if (!i4.equals(orDefault)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f4091h != map.size()) {
                return false;
            }
            int i5 = 0;
            while (i5 < this.f4091h) {
                try {
                    Object g3 = g(i5);
                    Object i6 = i(i5);
                    Object obj2 = map.get(g3);
                    if (i6 == null) {
                        if (obj2 != null || !map.containsKey(g3)) {
                            return false;
                        }
                    } else if (!i6.equals(obj2)) {
                        return false;
                    }
                    i5++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(Object obj) {
        int i3 = this.f4091h * 2;
        Object[] objArr = this.f4090g;
        if (obj == null) {
            for (int i4 = 1; i4 < i3; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i5 = 1; i5 < i3; i5 += 2) {
            if (obj.equals(objArr[i5])) {
                return i5 >> 1;
            }
        }
        return -1;
    }

    public final Object g(int i3) {
        return this.f4090g[i3 << 1];
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d3 = d(obj);
        if (d3 >= 0) {
            return this.f4090g[(d3 << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i3) {
        Object[] objArr = this.f4090g;
        int i4 = i3 << 1;
        Object obj = objArr[i4 + 1];
        int i5 = this.f4091h;
        int i6 = 0;
        if (i5 <= 1) {
            b(this.f4089f, objArr, i5);
            this.f4089f = C0337d.f4061a;
            this.f4090g = C0337d.f4062b;
        } else {
            int i7 = i5 - 1;
            int[] iArr = this.f4089f;
            int i8 = 8;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                if (i3 < i7) {
                    int i9 = i3 + 1;
                    int i10 = i7 - i3;
                    System.arraycopy(iArr, i9, iArr, i3, i10);
                    Object[] objArr2 = this.f4090g;
                    System.arraycopy(objArr2, i9 << 1, objArr2, i4, i10 << 1);
                }
                Object[] objArr3 = this.f4090g;
                int i11 = i7 << 1;
                objArr3[i11] = null;
                objArr3[i11 + 1] = null;
            } else {
                if (i5 > 8) {
                    i8 = i5 + (i5 >> 1);
                }
                a(i8);
                if (i5 == this.f4091h) {
                    if (i3 > 0) {
                        System.arraycopy(iArr, 0, this.f4089f, 0, i3);
                        System.arraycopy(objArr, 0, this.f4090g, 0, i4);
                    }
                    if (i3 < i7) {
                        int i12 = i3 + 1;
                        int i13 = i7 - i3;
                        System.arraycopy(iArr, i12, this.f4089f, i3, i13);
                        System.arraycopy(objArr, i12 << 1, this.f4090g, i4, i13 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i6 = i7;
        }
        if (i5 == this.f4091h) {
            this.f4091h = i6;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public final int hashCode() {
        int i3;
        int[] iArr = this.f4089f;
        Object[] objArr = this.f4090g;
        int i4 = this.f4091h;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            Object obj = objArr[i5];
            int i8 = iArr[i6];
            if (obj == null) {
                i3 = 0;
            } else {
                i3 = obj.hashCode();
            }
            i7 += i3 ^ i8;
            i6++;
            i5 += 2;
        }
        return i7;
    }

    public final Object i(int i3) {
        return this.f4090g[(i3 << 1) + 1];
    }

    public final boolean isEmpty() {
        if (this.f4091h <= 0) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        int i3;
        int i4;
        int i5 = this.f4091h;
        if (obj == null) {
            i4 = e();
            i3 = 0;
        } else {
            int hashCode = obj.hashCode();
            i3 = hashCode;
            i4 = c(hashCode, obj);
        }
        if (i4 >= 0) {
            int i6 = (i4 << 1) + 1;
            Object[] objArr = this.f4090g;
            Object obj3 = objArr[i6];
            objArr[i6] = obj2;
            return obj3;
        }
        int i7 = ~i4;
        int[] iArr = this.f4089f;
        if (i5 >= iArr.length) {
            int i8 = 8;
            if (i5 >= 8) {
                i8 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i8 = 4;
            }
            Object[] objArr2 = this.f4090g;
            a(i8);
            if (i5 == this.f4091h) {
                int[] iArr2 = this.f4089f;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f4090g, 0, objArr2.length);
                }
                b(iArr, objArr2, i5);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i7 < i5) {
            int[] iArr3 = this.f4089f;
            int i9 = i7 + 1;
            System.arraycopy(iArr3, i7, iArr3, i9, i5 - i7);
            Object[] objArr3 = this.f4090g;
            System.arraycopy(objArr3, i7 << 1, objArr3, i9 << 1, (this.f4091h - i7) << 1);
        }
        int i10 = this.f4091h;
        if (i5 == i10) {
            int[] iArr4 = this.f4089f;
            if (i7 < iArr4.length) {
                iArr4[i7] = i3;
                Object[] objArr4 = this.f4090g;
                int i11 = i7 << 1;
                objArr4[i11] = obj;
                objArr4[i11 + 1] = obj2;
                this.f4091h = i10 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, (Object) null);
        if (orDefault == null) {
            return put(obj, obj2);
        }
        return orDefault;
    }

    public final Object remove(Object obj) {
        int d3 = d(obj);
        if (d3 >= 0) {
            return h(d3);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d3 = d(obj);
        if (d3 < 0) {
            return null;
        }
        int i3 = (d3 << 1) + 1;
        Object[] objArr = this.f4090g;
        Object obj3 = objArr[i3];
        objArr[i3] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f4091h;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4091h * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f4091h; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object g2 = g(i3);
            if (g2 != this) {
                sb.append(g2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i4 = i(i3);
            if (i4 != this) {
                sb.append(i4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int d3 = d(obj);
        if (d3 < 0) {
            return false;
        }
        Object i3 = i(d3);
        if (obj2 != i3 && (obj2 == null || !obj2.equals(i3))) {
            return false;
        }
        h(d3);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d3 = d(obj);
        if (d3 < 0) {
            return false;
        }
        Object i3 = i(d3);
        if (i3 != obj2 && (obj2 == null || !obj2.equals(i3))) {
            return false;
        }
        int i4 = (d3 << 1) + 1;
        Object[] objArr = this.f4090g;
        Object obj4 = objArr[i4];
        objArr[i4] = obj3;
        return true;
    }
}
