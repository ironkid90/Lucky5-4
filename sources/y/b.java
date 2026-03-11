package Y;

import android.os.Parcel;
import android.util.SparseIntArray;
import n.C0335b;
import n.k;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f1956d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f1957e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1958f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1959g;

    /* renamed from: h  reason: collision with root package name */
    public final String f1960h;

    /* renamed from: i  reason: collision with root package name */
    public int f1961i;

    /* renamed from: j  reason: collision with root package name */
    public int f1962j;

    /* renamed from: k  reason: collision with root package name */
    public int f1963k;

    /* JADX WARNING: type inference failed for: r5v0, types: [n.b, n.k] */
    /* JADX WARNING: type inference failed for: r6v0, types: [n.b, n.k] */
    /* JADX WARNING: type inference failed for: r7v0, types: [n.b, n.k] */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new k(), new k(), new k());
    }

    public final b a() {
        Parcel parcel = this.f1957e;
        int dataPosition = parcel.dataPosition();
        int i3 = this.f1962j;
        if (i3 == this.f1958f) {
            i3 = this.f1959g;
        }
        int i4 = i3;
        return new b(parcel, dataPosition, i4, this.f1960h + "  ", this.f1953a, this.f1954b, this.f1955c);
    }

    public final boolean e(int i3) {
        while (this.f1962j < this.f1959g) {
            int i4 = this.f1963k;
            if (i4 == i3) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i3)) > 0) {
                return false;
            }
            int i5 = this.f1962j;
            Parcel parcel = this.f1957e;
            parcel.setDataPosition(i5);
            int readInt = parcel.readInt();
            this.f1963k = parcel.readInt();
            this.f1962j += readInt;
        }
        if (this.f1963k == i3) {
            return true;
        }
        return false;
    }

    public final void i(int i3) {
        int i4 = this.f1961i;
        SparseIntArray sparseIntArray = this.f1956d;
        Parcel parcel = this.f1957e;
        if (i4 >= 0) {
            int i5 = sparseIntArray.get(i4);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i5);
            parcel.writeInt(dataPosition - i5);
            parcel.setDataPosition(dataPosition);
        }
        this.f1961i = i3;
        sparseIntArray.put(i3, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i3);
    }

    public b(Parcel parcel, int i3, int i4, String str, C0335b bVar, C0335b bVar2, C0335b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f1956d = new SparseIntArray();
        this.f1961i = -1;
        this.f1963k = -1;
        this.f1957e = parcel;
        this.f1958f = i3;
        this.f1959g = i4;
        this.f1962j = i3;
        this.f1960h = str;
    }
}
