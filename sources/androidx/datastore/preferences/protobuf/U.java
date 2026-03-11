package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

public final class U extends C0098b implements RandomAccess {

    /* renamed from: i  reason: collision with root package name */
    public static final U f2384i = new U(new Object[0], 0, false);

    /* renamed from: g  reason: collision with root package name */
    public Object[] f2385g;

    /* renamed from: h  reason: collision with root package name */
    public int f2386h;

    public U(Object[] objArr, int i3, boolean z3) {
        this.f2407f = z3;
        this.f2385g = objArr;
        this.f2386h = i3;
    }

    public final boolean add(Object obj) {
        a();
        int i3 = this.f2386h;
        Object[] objArr = this.f2385g;
        if (i3 == objArr.length) {
            this.f2385g = Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f2385g;
        int i4 = this.f2386h;
        this.f2386h = i4 + 1;
        objArr2[i4] = obj;
        this.modCount++;
        return true;
    }

    public final void b(int i3) {
        if (i3 < 0 || i3 >= this.f2386h) {
            throw new IndexOutOfBoundsException("Index:" + i3 + ", Size:" + this.f2386h);
        }
    }

    public final U c(int i3) {
        if (i3 >= this.f2386h) {
            return new U(Arrays.copyOf(this.f2385g, i3), this.f2386h, true);
        }
        throw new IllegalArgumentException();
    }

    public final Object get(int i3) {
        b(i3);
        return this.f2385g[i3];
    }

    public final Object remove(int i3) {
        a();
        b(i3);
        Object[] objArr = this.f2385g;
        Object obj = objArr[i3];
        int i4 = this.f2386h;
        if (i3 < i4 - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (i4 - i3) - 1);
        }
        this.f2386h--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i3, Object obj) {
        a();
        b(i3);
        Object[] objArr = this.f2385g;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f2386h;
    }

    public final void add(int i3, Object obj) {
        int i4;
        a();
        if (i3 < 0 || i3 > (i4 = this.f2386h)) {
            throw new IndexOutOfBoundsException("Index:" + i3 + ", Size:" + this.f2386h);
        }
        Object[] objArr = this.f2385g;
        if (i4 < objArr.length) {
            System.arraycopy(objArr, i3, objArr, i3 + 1, i4 - i3);
        } else {
            Object[] objArr2 = new Object[(((i4 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i3);
            System.arraycopy(this.f2385g, i3, objArr2, i3 + 1, this.f2386h - i3);
            this.f2385g = objArr2;
        }
        this.f2385g[i3] = obj;
        this.f2386h++;
        this.modCount++;
    }
}
