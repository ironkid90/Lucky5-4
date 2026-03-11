package androidx.datastore.preferences.protobuf;

import A2.h;

/* renamed from: androidx.datastore.preferences.protobuf.f  reason: case insensitive filesystem */
public final class C0102f extends C0103g {

    /* renamed from: j  reason: collision with root package name */
    public final int f2420j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2421k;

    public C0102f(byte[] bArr, int i3, int i4) {
        super(bArr);
        C0103g.b(i3, i3 + i4, bArr.length);
        this.f2420j = i3;
        this.f2421k = i4;
    }

    public final byte a(int i3) {
        int i4 = this.f2421k;
        if (((i4 - (i3 + 1)) | i3) >= 0) {
            return this.f2426g[this.f2420j + i3];
        } else if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(h.e("Index < 0: ", i3));
        } else {
            throw new ArrayIndexOutOfBoundsException(h.f("Index > length: ", i3, ", ", i4));
        }
    }

    public final void d(byte[] bArr, int i3) {
        System.arraycopy(this.f2426g, this.f2420j, bArr, 0, i3);
    }

    public final int e() {
        return this.f2420j;
    }

    public final byte f(int i3) {
        return this.f2426g[this.f2420j + i3];
    }

    public final int size() {
        return this.f2421k;
    }
}
