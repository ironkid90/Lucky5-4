package j$.time.chrono;

import j$.time.h;
import j$.time.temporal.a;
import j$.time.temporal.r;
import j$.time.temporal.w;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

public final class y implements m, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final y f5047d;

    /* renamed from: e  reason: collision with root package name */
    private static final y[] f5048e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: a  reason: collision with root package name */
    private final transient int f5049a;

    /* renamed from: b  reason: collision with root package name */
    private final transient h f5050b;

    /* renamed from: c  reason: collision with root package name */
    private final transient String f5051c;

    static {
        y yVar = new y(-1, h.g0(1868, 1, 1), "Meiji");
        f5047d = yVar;
        y yVar2 = new y(0, h.g0(1912, 7, 30), "Taisho");
        y yVar3 = new y(1, h.g0(1926, 12, 25), "Showa");
        y yVar4 = new y(2, h.g0(1989, 1, 8), "Heisei");
        y yVar5 = new y(3, h.g0(2019, 5, 1), "Reiwa");
        y[] yVarArr = new y[5];
        f5048e = yVarArr;
        yVarArr[0] = yVar;
        yVarArr[1] = yVar2;
        yVarArr[2] = yVar3;
        yVarArr[3] = yVar4;
        yVarArr[4] = yVar5;
    }

    static y r() {
        y[] yVarArr = f5048e;
        return yVarArr[yVarArr.length - 1];
    }

    static long y() {
        int b02 = 1000000000 - r().f5050b.b0();
        y[] yVarArr = f5048e;
        int b03 = yVarArr[0].f5050b.b0();
        for (int i3 = 1; i3 < yVarArr.length; i3++) {
            y yVar = yVarArr[i3];
            b02 = Math.min(b02, (yVar.f5050b.b0() - b03) + 1);
            b03 = yVar.f5050b.b0();
        }
        return (long) b02;
    }

    static long x() {
        long f3 = a.DAY_OF_YEAR.C().f();
        for (y yVar : f5048e) {
            f3 = Math.min(f3, (long) (((yVar.f5050b.d0() ? 366 : 365) - yVar.f5050b.Z()) + 1));
            if (yVar.t() != null) {
                f3 = Math.min(f3, (long) (yVar.t().f5050b.Z() - 1));
            }
        }
        return f3;
    }

    private y(int i3, h hVar, String str) {
        this.f5049a = i3;
        this.f5050b = hVar;
        this.f5051c = str;
    }

    /* access modifiers changed from: package-private */
    public final h s() {
        return this.f5050b;
    }

    public static y w(int i3) {
        int i4 = i3 + 1;
        if (i4 >= 0) {
            y[] yVarArr = f5048e;
            if (i4 < yVarArr.length) {
                return yVarArr[i4];
            }
        }
        throw new RuntimeException("Invalid era: " + i3);
    }

    public static y[] A() {
        y[] yVarArr = f5048e;
        return (y[]) Arrays.copyOf(yVarArr, yVarArr.length);
    }

    static y q(h hVar) {
        if (!hVar.c0(x.f5043d)) {
            y[] yVarArr = f5048e;
            for (int length = yVarArr.length - 1; length >= 0; length--) {
                y yVar = yVarArr[length];
                if (hVar.compareTo(yVar.f5050b) >= 0) {
                    return yVar;
                }
            }
            return null;
        }
        throw new RuntimeException("JapaneseDate before Meiji 6 are not supported");
    }

    public final int p() {
        return this.f5049a;
    }

    public final w l(r rVar) {
        a aVar = a.ERA;
        if (rVar == aVar) {
            return v.f5041d.U(aVar);
        }
        return super.l(rVar);
    }

    /* access modifiers changed from: package-private */
    public final y t() {
        if (this == r()) {
            return null;
        }
        return w(this.f5049a + 1);
    }

    public final String toString() {
        return this.f5051c;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 5, this);
    }

    /* access modifiers changed from: package-private */
    public final void C(DataOutput dataOutput) {
        dataOutput.writeByte(this.f5049a);
    }
}
