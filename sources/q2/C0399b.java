package q2;

import A2.h;
import A2.i;
import B2.a;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: q2.b  reason: case insensitive filesystem */
public final class C0399b extends AbstractList implements List, a {

    /* renamed from: i  reason: collision with root package name */
    public static final Object[] f4391i = new Object[0];

    /* renamed from: f  reason: collision with root package name */
    public int f4392f;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f4393g = f4391i;

    /* renamed from: h  reason: collision with root package name */
    public int f4394h;

    public final void a(int i3, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f4393g.length;
        while (i3 < length && it.hasNext()) {
            this.f4393g[i3] = it.next();
            i3++;
        }
        int i4 = this.f4392f;
        for (int i5 = 0; i5 < i4 && it.hasNext(); i5++) {
            this.f4393g[i5] = it.next();
        }
        this.f4394h = collection.size() + this.f4394h;
    }

    public final void add(int i3, Object obj) {
        int i4;
        int i5 = this.f4394h;
        if (i3 < 0 || i3 > i5) {
            throw new IndexOutOfBoundsException(h.f("index: ", i3, ", size: ", i5));
        } else if (i3 == i5) {
            addLast(obj);
        } else if (i3 == 0) {
            addFirst(obj);
        } else {
            g();
            b(this.f4394h + 1);
            int f3 = f(this.f4392f + i3);
            int i6 = this.f4394h;
            if (i3 < ((i6 + 1) >> 1)) {
                if (f3 == 0) {
                    Object[] objArr = this.f4393g;
                    i.e(objArr, "<this>");
                    f3 = objArr.length;
                }
                int i7 = f3 - 1;
                int i8 = this.f4392f;
                if (i8 == 0) {
                    Object[] objArr2 = this.f4393g;
                    i.e(objArr2, "<this>");
                    i4 = objArr2.length - 1;
                } else {
                    i4 = i8 - 1;
                }
                int i9 = this.f4392f;
                if (i7 >= i9) {
                    Object[] objArr3 = this.f4393g;
                    objArr3[i4] = objArr3[i9];
                    C0400c.J(objArr3, objArr3, i9, i9 + 1, i7 + 1);
                } else {
                    Object[] objArr4 = this.f4393g;
                    C0400c.J(objArr4, objArr4, i9 - 1, i9, objArr4.length);
                    Object[] objArr5 = this.f4393g;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    C0400c.J(objArr5, objArr5, 0, 1, i7 + 1);
                }
                this.f4393g[i7] = obj;
                this.f4392f = i4;
            } else {
                int f4 = f(this.f4392f + i6);
                if (f3 < f4) {
                    Object[] objArr6 = this.f4393g;
                    C0400c.J(objArr6, objArr6, f3 + 1, f3, f4);
                } else {
                    Object[] objArr7 = this.f4393g;
                    C0400c.J(objArr7, objArr7, 1, 0, f4);
                    Object[] objArr8 = this.f4393g;
                    objArr8[0] = objArr8[objArr8.length - 1];
                    C0400c.J(objArr8, objArr8, f3 + 1, f3, objArr8.length - 1);
                }
                this.f4393g[f3] = obj;
            }
            this.f4394h++;
        }
    }

    public final boolean addAll(int i3, Collection collection) {
        i.e(collection, "elements");
        int i4 = this.f4394h;
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(h.f("index: ", i3, ", size: ", i4));
        } else if (collection.isEmpty()) {
            return false;
        } else {
            if (i3 == this.f4394h) {
                return addAll(collection);
            }
            g();
            b(collection.size() + this.f4394h);
            int f3 = f(this.f4392f + this.f4394h);
            int f4 = f(this.f4392f + i3);
            int size = collection.size();
            if (i3 < ((this.f4394h + 1) >> 1)) {
                int i5 = this.f4392f;
                int i6 = i5 - size;
                if (f4 < i5) {
                    Object[] objArr = this.f4393g;
                    C0400c.J(objArr, objArr, i6, i5, objArr.length);
                    if (size >= f4) {
                        Object[] objArr2 = this.f4393g;
                        C0400c.J(objArr2, objArr2, objArr2.length - size, 0, f4);
                    } else {
                        Object[] objArr3 = this.f4393g;
                        C0400c.J(objArr3, objArr3, objArr3.length - size, 0, size);
                        Object[] objArr4 = this.f4393g;
                        C0400c.J(objArr4, objArr4, 0, size, f4);
                    }
                } else if (i6 >= 0) {
                    Object[] objArr5 = this.f4393g;
                    C0400c.J(objArr5, objArr5, i6, i5, f4);
                } else {
                    Object[] objArr6 = this.f4393g;
                    i6 += objArr6.length;
                    int i7 = f4 - i5;
                    int length = objArr6.length - i6;
                    if (length >= i7) {
                        C0400c.J(objArr6, objArr6, i6, i5, f4);
                    } else {
                        C0400c.J(objArr6, objArr6, i6, i5, i5 + length);
                        Object[] objArr7 = this.f4393g;
                        C0400c.J(objArr7, objArr7, 0, this.f4392f + length, f4);
                    }
                }
                this.f4392f = i6;
                a(d(f4 - size), collection);
            } else {
                int i8 = f4 + size;
                if (f4 < f3) {
                    int i9 = size + f3;
                    Object[] objArr8 = this.f4393g;
                    if (i9 <= objArr8.length) {
                        C0400c.J(objArr8, objArr8, i8, f4, f3);
                    } else if (i8 >= objArr8.length) {
                        C0400c.J(objArr8, objArr8, i8 - objArr8.length, f4, f3);
                    } else {
                        int length2 = f3 - (i9 - objArr8.length);
                        C0400c.J(objArr8, objArr8, 0, length2, f3);
                        Object[] objArr9 = this.f4393g;
                        C0400c.J(objArr9, objArr9, i8, f4, length2);
                    }
                } else {
                    Object[] objArr10 = this.f4393g;
                    C0400c.J(objArr10, objArr10, size, 0, f3);
                    Object[] objArr11 = this.f4393g;
                    if (i8 >= objArr11.length) {
                        C0400c.J(objArr11, objArr11, i8 - objArr11.length, f4, objArr11.length);
                    } else {
                        C0400c.J(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                        Object[] objArr12 = this.f4393g;
                        C0400c.J(objArr12, objArr12, i8, f4, objArr12.length - size);
                    }
                }
                a(f4, collection);
            }
            return true;
        }
    }

    public final void addFirst(Object obj) {
        g();
        b(this.f4394h + 1);
        int i3 = this.f4392f;
        if (i3 == 0) {
            Object[] objArr = this.f4393g;
            i.e(objArr, "<this>");
            i3 = objArr.length;
        }
        int i4 = i3 - 1;
        this.f4392f = i4;
        this.f4393g[i4] = obj;
        this.f4394h++;
    }

    public final void addLast(Object obj) {
        g();
        b(this.f4394h + 1);
        this.f4393g[f(this.f4392f + this.f4394h)] = obj;
        this.f4394h++;
    }

    public final void b(int i3) {
        if (i3 >= 0) {
            Object[] objArr = this.f4393g;
            if (i3 > objArr.length) {
                if (objArr == f4391i) {
                    if (i3 < 10) {
                        i3 = 10;
                    }
                    this.f4393g = new Object[i3];
                    return;
                }
                int length = objArr.length;
                int i4 = length + (length >> 1);
                if (i4 - i3 < 0) {
                    i4 = i3;
                }
                if (i4 - 2147483639 > 0) {
                    if (i3 > 2147483639) {
                        i4 = Integer.MAX_VALUE;
                    } else {
                        i4 = 2147483639;
                    }
                }
                Object[] objArr2 = new Object[i4];
                C0400c.J(objArr, objArr2, 0, this.f4392f, objArr.length);
                Object[] objArr3 = this.f4393g;
                int length2 = objArr3.length;
                int i5 = this.f4392f;
                C0400c.J(objArr3, objArr2, length2 - i5, 0, i5);
                this.f4392f = 0;
                this.f4393g = objArr2;
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int c(int i3) {
        Object[] objArr = this.f4393g;
        i.e(objArr, "<this>");
        if (i3 == objArr.length - 1) {
            return 0;
        }
        return i3 + 1;
    }

    public final void clear() {
        if (!isEmpty()) {
            g();
            e(this.f4392f, f(this.f4392f + this.f4394h));
        }
        this.f4392f = 0;
        this.f4394h = 0;
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final int d(int i3) {
        if (i3 < 0) {
            return i3 + this.f4393g.length;
        }
        return i3;
    }

    public final void e(int i3, int i4) {
        if (i3 < i4) {
            Object[] objArr = this.f4393g;
            i.e(objArr, "<this>");
            Arrays.fill(objArr, i3, i4, (Object) null);
            return;
        }
        Object[] objArr2 = this.f4393g;
        Arrays.fill(objArr2, i3, objArr2.length, (Object) null);
        Object[] objArr3 = this.f4393g;
        i.e(objArr3, "<this>");
        Arrays.fill(objArr3, 0, i4, (Object) null);
    }

    public final int f(int i3) {
        Object[] objArr = this.f4393g;
        if (i3 >= objArr.length) {
            return i3 - objArr.length;
        }
        return i3;
    }

    public final void g() {
        this.modCount++;
    }

    public final Object get(int i3) {
        int i4 = this.f4394h;
        if (i3 >= 0 && i3 < i4) {
            return this.f4393g[f(this.f4392f + i3)];
        }
        throw new IndexOutOfBoundsException(h.f("index: ", i3, ", size: ", i4));
    }

    public final Object h(int i3) {
        int i4 = this.f4394h;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(h.f("index: ", i3, ", size: ", i4));
        } else if (i3 == size() - 1) {
            return removeLast();
        } else {
            if (i3 == 0) {
                return removeFirst();
            }
            g();
            int f3 = f(this.f4392f + i3);
            Object[] objArr = this.f4393g;
            Object obj = objArr[f3];
            if (i3 < (this.f4394h >> 1)) {
                int i5 = this.f4392f;
                if (f3 >= i5) {
                    C0400c.J(objArr, objArr, i5 + 1, i5, f3);
                } else {
                    C0400c.J(objArr, objArr, 1, 0, f3);
                    Object[] objArr2 = this.f4393g;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i6 = this.f4392f;
                    C0400c.J(objArr2, objArr2, i6 + 1, i6, objArr2.length - 1);
                }
                Object[] objArr3 = this.f4393g;
                int i7 = this.f4392f;
                objArr3[i7] = null;
                this.f4392f = c(i7);
            } else {
                int f4 = f((size() - 1) + this.f4392f);
                if (f3 <= f4) {
                    Object[] objArr4 = this.f4393g;
                    C0400c.J(objArr4, objArr4, f3, f3 + 1, f4 + 1);
                } else {
                    Object[] objArr5 = this.f4393g;
                    C0400c.J(objArr5, objArr5, f3, f3 + 1, objArr5.length);
                    Object[] objArr6 = this.f4393g;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    C0400c.J(objArr6, objArr6, 0, 1, f4 + 1);
                }
                this.f4393g[f4] = null;
            }
            this.f4394h--;
            return obj;
        }
    }

    public final int indexOf(Object obj) {
        int i3;
        int f3 = f(this.f4392f + this.f4394h);
        int i4 = this.f4392f;
        if (i4 < f3) {
            while (i4 < f3) {
                if (i.a(obj, this.f4393g[i4])) {
                    i3 = this.f4392f;
                } else {
                    i4++;
                }
            }
            return -1;
        } else if (i4 < f3) {
            return -1;
        } else {
            int length = this.f4393g.length;
            while (true) {
                if (i4 >= length) {
                    int i5 = 0;
                    while (i5 < f3) {
                        if (i.a(obj, this.f4393g[i5])) {
                            i4 = i5 + this.f4393g.length;
                            i3 = this.f4392f;
                        } else {
                            i5++;
                        }
                    }
                    return -1;
                } else if (i.a(obj, this.f4393g[i4])) {
                    i3 = this.f4392f;
                    break;
                } else {
                    i4++;
                }
            }
        }
        return i4 - i3;
    }

    public final boolean isEmpty() {
        if (this.f4394h == 0) {
            return true;
        }
        return false;
    }

    public final int lastIndexOf(Object obj) {
        int i3;
        int i4;
        int f3 = f(this.f4392f + this.f4394h);
        int i5 = this.f4392f;
        if (i5 < f3) {
            i3 = f3 - 1;
            if (i5 <= i3) {
                while (!i.a(obj, this.f4393g[i3])) {
                    if (i3 != i5) {
                        i3--;
                    }
                }
                i4 = this.f4392f;
            }
            return -1;
        }
        if (i5 > f3) {
            int i6 = f3 - 1;
            while (true) {
                if (-1 >= i6) {
                    Object[] objArr = this.f4393g;
                    i.e(objArr, "<this>");
                    int length = objArr.length - 1;
                    int i7 = this.f4392f;
                    if (i7 <= length) {
                        while (!i.a(obj, this.f4393g[i3])) {
                            if (i3 != i7) {
                                length = i3 - 1;
                            }
                        }
                        i4 = this.f4392f;
                    }
                } else if (i.a(obj, this.f4393g[i6])) {
                    i3 = i6 + this.f4393g.length;
                    i4 = this.f4392f;
                    break;
                } else {
                    i6--;
                }
            }
        }
        return -1;
        return i3 - i4;
    }

    public final /* bridge */ Object remove(int i3) {
        return h(i3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean removeAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            A2.i.e(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0094
            java.lang.Object[] r0 = r11.f4393g
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x0094
        L_0x0013:
            int r0 = r11.f4392f
            int r2 = r11.f4394h
            int r0 = r0 + r2
            int r0 = r11.f(r0)
            int r2 = r11.f4392f
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0046
            r5 = r2
        L_0x0023:
            if (r2 >= r0) goto L_0x003b
            java.lang.Object[] r6 = r11.f4393g
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 != 0) goto L_0x0037
            java.lang.Object[] r7 = r11.f4393g
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0038
        L_0x0037:
            r1 = r4
        L_0x0038:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x003b:
            java.lang.Object[] r12 = r11.f4393g
            java.lang.String r2 = "<this>"
            A2.i.e(r12, r2)
            java.util.Arrays.fill(r12, r5, r0, r3)
            goto L_0x0086
        L_0x0046:
            java.lang.Object[] r5 = r11.f4393g
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x004b:
            if (r2 >= r5) goto L_0x0065
            java.lang.Object[] r8 = r11.f4393g
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 != 0) goto L_0x0061
            java.lang.Object[] r8 = r11.f4393g
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0062
        L_0x0061:
            r7 = r4
        L_0x0062:
            int r2 = r2 + 1
            goto L_0x004b
        L_0x0065:
            int r2 = r11.f(r6)
            r5 = r2
        L_0x006a:
            if (r1 >= r0) goto L_0x0085
            java.lang.Object[] r2 = r11.f4393g
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 != 0) goto L_0x0081
            java.lang.Object[] r2 = r11.f4393g
            r2[r5] = r6
            int r5 = r11.c(r5)
            goto L_0x0082
        L_0x0081:
            r7 = r4
        L_0x0082:
            int r1 = r1 + 1
            goto L_0x006a
        L_0x0085:
            r1 = r7
        L_0x0086:
            if (r1 == 0) goto L_0x0094
            r11.g()
            int r12 = r11.f4392f
            int r5 = r5 - r12
            int r12 = r11.d(r5)
            r11.f4394h = r12
        L_0x0094:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.C0399b.removeAll(java.util.Collection):boolean");
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            g();
            Object[] objArr = this.f4393g;
            int i3 = this.f4392f;
            Object obj = objArr[i3];
            objArr[i3] = null;
            this.f4392f = c(i3);
            this.f4394h--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            g();
            int f3 = f((size() - 1) + this.f4392f);
            Object[] objArr = this.f4393g;
            Object obj = objArr[f3];
            objArr[f3] = null;
            this.f4394h--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final void removeRange(int i3, int i4) {
        int i5 = this.f4394h;
        if (i3 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i4 + ", size: " + i5);
        } else if (i3 <= i4) {
            int i6 = i4 - i3;
            if (i6 != 0) {
                if (i6 == this.f4394h) {
                    clear();
                } else if (i6 == 1) {
                    h(i3);
                } else {
                    g();
                    if (i3 < this.f4394h - i4) {
                        int f3 = f(this.f4392f + (i3 - 1));
                        int f4 = f(this.f4392f + (i4 - 1));
                        while (i3 > 0) {
                            int i7 = f3 + 1;
                            int min = Math.min(i3, Math.min(i7, f4 + 1));
                            Object[] objArr = this.f4393g;
                            int i8 = f4 - min;
                            int i9 = f3 - min;
                            C0400c.J(objArr, objArr, i8 + 1, i9 + 1, i7);
                            f3 = d(i9);
                            f4 = d(i8);
                            i3 -= min;
                        }
                        int f5 = f(this.f4392f + i6);
                        e(this.f4392f, f5);
                        this.f4392f = f5;
                    } else {
                        int f6 = f(this.f4392f + i4);
                        int f7 = f(this.f4392f + i3);
                        int i10 = this.f4394h;
                        while (true) {
                            i10 -= i4;
                            if (i10 <= 0) {
                                break;
                            }
                            Object[] objArr2 = this.f4393g;
                            i4 = Math.min(i10, Math.min(objArr2.length - f6, objArr2.length - f7));
                            Object[] objArr3 = this.f4393g;
                            int i11 = f6 + i4;
                            C0400c.J(objArr3, objArr3, f7, f6, i11);
                            f6 = f(i11);
                            f7 = f(f7 + i4);
                        }
                        int f8 = f(this.f4392f + this.f4394h);
                        e(d(f8 - i6), f8);
                    }
                    this.f4394h -= i6;
                }
            }
        } else {
            throw new IllegalArgumentException(h.f("fromIndex: ", i3, " > toIndex: ", i4));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean retainAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            A2.i.e(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0094
            java.lang.Object[] r0 = r11.f4393g
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x0094
        L_0x0013:
            int r0 = r11.f4392f
            int r2 = r11.f4394h
            int r0 = r0 + r2
            int r0 = r11.f(r0)
            int r2 = r11.f4392f
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0046
            r5 = r2
        L_0x0023:
            if (r2 >= r0) goto L_0x003b
            java.lang.Object[] r6 = r11.f4393g
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x0037
            java.lang.Object[] r7 = r11.f4393g
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0038
        L_0x0037:
            r1 = r4
        L_0x0038:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x003b:
            java.lang.Object[] r12 = r11.f4393g
            java.lang.String r2 = "<this>"
            A2.i.e(r12, r2)
            java.util.Arrays.fill(r12, r5, r0, r3)
            goto L_0x0086
        L_0x0046:
            java.lang.Object[] r5 = r11.f4393g
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x004b:
            if (r2 >= r5) goto L_0x0065
            java.lang.Object[] r8 = r11.f4393g
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0061
            java.lang.Object[] r8 = r11.f4393g
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0062
        L_0x0061:
            r7 = r4
        L_0x0062:
            int r2 = r2 + 1
            goto L_0x004b
        L_0x0065:
            int r2 = r11.f(r6)
            r5 = r2
        L_0x006a:
            if (r1 >= r0) goto L_0x0085
            java.lang.Object[] r2 = r11.f4393g
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L_0x0081
            java.lang.Object[] r2 = r11.f4393g
            r2[r5] = r6
            int r5 = r11.c(r5)
            goto L_0x0082
        L_0x0081:
            r7 = r4
        L_0x0082:
            int r1 = r1 + 1
            goto L_0x006a
        L_0x0085:
            r1 = r7
        L_0x0086:
            if (r1 == 0) goto L_0x0094
            r11.g()
            int r12 = r11.f4392f
            int r5 = r5 - r12
            int r12 = r11.d(r5)
            r11.f4394h = r12
        L_0x0094:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.C0399b.retainAll(java.util.Collection):boolean");
    }

    public final Object set(int i3, Object obj) {
        int i4 = this.f4394h;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(h.f("index: ", i3, ", size: ", i4));
        }
        int f3 = f(this.f4392f + i3);
        Object[] objArr = this.f4393g;
        Object obj2 = objArr[f3];
        objArr[f3] = obj;
        return obj2;
    }

    public final int size() {
        return this.f4394h;
    }

    public final Object[] toArray() {
        return toArray(new Object[this.f4394h]);
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        h(indexOf);
        return true;
    }

    public final Object[] toArray(Object[] objArr) {
        i.e(objArr, "array");
        int length = objArr.length;
        int i3 = this.f4394h;
        if (length < i3) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i3);
            i.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int f3 = f(this.f4392f + this.f4394h);
        int i4 = this.f4392f;
        if (i4 < f3) {
            C0400c.J(this.f4393g, objArr, 0, i4, f3);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f4393g;
            C0400c.J(objArr2, objArr, 0, this.f4392f, objArr2.length);
            Object[] objArr3 = this.f4393g;
            C0400c.J(objArr3, objArr, objArr3.length - this.f4392f, 0, f3);
        }
        int i5 = this.f4394h;
        if (i5 < objArr.length) {
            objArr[i5] = null;
        }
        return objArr;
    }

    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        i.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        g();
        b(collection.size() + this.f4394h);
        a(f(this.f4392f + this.f4394h), collection);
        return true;
    }
}
