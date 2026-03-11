package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: n.c  reason: case insensitive filesystem */
public final class C0336c implements Collection, Set {

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f4051j = new int[0];

    /* renamed from: k  reason: collision with root package name */
    public static final Object[] f4052k = new Object[0];

    /* renamed from: l  reason: collision with root package name */
    public static Object[] f4053l;

    /* renamed from: m  reason: collision with root package name */
    public static int f4054m;

    /* renamed from: n  reason: collision with root package name */
    public static Object[] f4055n;

    /* renamed from: o  reason: collision with root package name */
    public static int f4056o;

    /* renamed from: f  reason: collision with root package name */
    public int[] f4057f;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f4058g;

    /* renamed from: h  reason: collision with root package name */
    public int f4059h;

    /* renamed from: i  reason: collision with root package name */
    public C0334a f4060i;

    public C0336c(int i3) {
        if (i3 == 0) {
            this.f4057f = f4051j;
            this.f4058g = f4052k;
        } else {
            a(i3);
        }
        this.f4059h = 0;
    }

    public static void b(int[] iArr, Object[] objArr, int i3) {
        if (iArr.length == 8) {
            synchronized (C0336c.class) {
                try {
                    if (f4056o < 10) {
                        objArr[0] = f4055n;
                        objArr[1] = iArr;
                        for (int i4 = i3 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f4055n = objArr;
                        f4056o++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0336c.class) {
                try {
                    if (f4054m < 10) {
                        objArr[0] = f4053l;
                        objArr[1] = iArr;
                        for (int i5 = i3 - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f4053l = objArr;
                        f4054m++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void a(int i3) {
        if (i3 == 8) {
            synchronized (C0336c.class) {
                try {
                    Object[] objArr = f4055n;
                    if (objArr != null) {
                        this.f4058g = objArr;
                        f4055n = (Object[]) objArr[0];
                        this.f4057f = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f4056o--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i3 == 4) {
            synchronized (C0336c.class) {
                try {
                    Object[] objArr2 = f4053l;
                    if (objArr2 != null) {
                        this.f4058g = objArr2;
                        f4053l = (Object[]) objArr2[0];
                        this.f4057f = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f4054m--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f4057f = new int[i3];
        this.f4058g = new Object[i3];
    }

    public final boolean add(Object obj) {
        int i3;
        int i4;
        if (obj == null) {
            i4 = d();
            i3 = 0;
        } else {
            int hashCode = obj.hashCode();
            i3 = hashCode;
            i4 = c(hashCode, obj);
        }
        if (i4 >= 0) {
            return false;
        }
        int i5 = ~i4;
        int i6 = this.f4059h;
        int[] iArr = this.f4057f;
        if (i6 >= iArr.length) {
            int i7 = 8;
            if (i6 >= 8) {
                i7 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i7 = 4;
            }
            Object[] objArr = this.f4058g;
            a(i7);
            int[] iArr2 = this.f4057f;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f4058g, 0, objArr.length);
            }
            b(iArr, objArr, this.f4059h);
        }
        int i8 = this.f4059h;
        if (i5 < i8) {
            int[] iArr3 = this.f4057f;
            int i9 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i9, i8 - i5);
            Object[] objArr2 = this.f4058g;
            System.arraycopy(objArr2, i5, objArr2, i9, this.f4059h - i5);
        }
        this.f4057f[i5] = i3;
        this.f4058g[i5] = obj;
        this.f4059h++;
        return true;
    }

    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f4059h;
        int[] iArr = this.f4057f;
        boolean z3 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f4058g;
            a(size);
            int i3 = this.f4059h;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f4057f, 0, i3);
                System.arraycopy(objArr, 0, this.f4058g, 0, this.f4059h);
            }
            b(iArr, objArr, this.f4059h);
        }
        for (Object add : collection) {
            z3 |= add(add);
        }
        return z3;
    }

    public final int c(int i3, Object obj) {
        int i4 = this.f4059h;
        if (i4 == 0) {
            return -1;
        }
        int a2 = C0337d.a(i4, i3, this.f4057f);
        if (a2 < 0 || obj.equals(this.f4058g[a2])) {
            return a2;
        }
        int i5 = a2 + 1;
        while (i5 < i4 && this.f4057f[i5] == i3) {
            if (obj.equals(this.f4058g[i5])) {
                return i5;
            }
            i5++;
        }
        int i6 = a2 - 1;
        while (i6 >= 0 && this.f4057f[i6] == i3) {
            if (obj.equals(this.f4058g[i6])) {
                return i6;
            }
            i6--;
        }
        return ~i5;
    }

    public final void clear() {
        int i3 = this.f4059h;
        if (i3 != 0) {
            b(this.f4057f, this.f4058g, i3);
            this.f4057f = f4051j;
            this.f4058g = f4052k;
            this.f4059h = 0;
        }
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i3 = this.f4059h;
        if (i3 == 0) {
            return -1;
        }
        int a2 = C0337d.a(i3, 0, this.f4057f);
        if (a2 < 0 || this.f4058g[a2] == null) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f4057f[i4] == 0) {
            if (this.f4058g[i4] == null) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.f4057f[i5] == 0) {
            if (this.f4058g[i5] == null) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    public final void e(int i3) {
        Object[] objArr = this.f4058g;
        Object obj = objArr[i3];
        int i4 = this.f4059h;
        if (i4 <= 1) {
            b(this.f4057f, objArr, i4);
            this.f4057f = f4051j;
            this.f4058g = f4052k;
            this.f4059h = 0;
            return;
        }
        int[] iArr = this.f4057f;
        int i5 = 8;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            int i6 = i4 - 1;
            this.f4059h = i6;
            if (i3 < i6) {
                int i7 = i3 + 1;
                System.arraycopy(iArr, i7, iArr, i3, i6 - i3);
                Object[] objArr2 = this.f4058g;
                System.arraycopy(objArr2, i7, objArr2, i3, this.f4059h - i3);
            }
            this.f4058g[this.f4059h] = null;
            return;
        }
        if (i4 > 8) {
            i5 = i4 + (i4 >> 1);
        }
        a(i5);
        this.f4059h--;
        if (i3 > 0) {
            System.arraycopy(iArr, 0, this.f4057f, 0, i3);
            System.arraycopy(objArr, 0, this.f4058g, 0, i3);
        }
        int i8 = this.f4059h;
        if (i3 < i8) {
            int i9 = i3 + 1;
            System.arraycopy(iArr, i9, this.f4057f, i3, i8 - i3);
            System.arraycopy(objArr, i9, this.f4058g, i3, this.f4059h - i3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f4059h != set.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.f4059h) {
                try {
                    if (!set.contains(this.f4058g[i3])) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f4057f;
        int i3 = this.f4059h;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += iArr[i5];
        }
        return i4;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return d();
        }
        return c(obj.hashCode(), obj);
    }

    public final boolean isEmpty() {
        if (this.f4059h <= 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        if (this.f4060i == null) {
            this.f4060i = new C0334a(1, this);
        }
        C0334a aVar = this.f4060i;
        if (aVar.f4046b == null) {
            aVar.f4046b = new C0341h(aVar, 1);
        }
        return aVar.f4046b.iterator();
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        e(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        boolean z3 = false;
        for (Object remove : collection) {
            z3 |= remove(remove);
        }
        return z3;
    }

    public final boolean retainAll(Collection collection) {
        boolean z3 = false;
        for (int i3 = this.f4059h - 1; i3 >= 0; i3--) {
            if (!collection.contains(this.f4058g[i3])) {
                e(i3);
                z3 = true;
            }
        }
        return z3;
    }

    public final int size() {
        return this.f4059h;
    }

    public final Object[] toArray() {
        int i3 = this.f4059h;
        Object[] objArr = new Object[i3];
        System.arraycopy(this.f4058g, 0, objArr, 0, i3);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4059h * 14);
        sb.append('{');
        for (int i3 = 0; i3 < this.f4059h; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = this.f4058g[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f4059h) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f4059h);
        }
        System.arraycopy(this.f4058g, 0, objArr, 0, this.f4059h);
        int length = objArr.length;
        int i3 = this.f4059h;
        if (length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
