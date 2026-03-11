package j$.time;

import j$.time.chrono.l;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.q;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.regex.Pattern;

public final class s implements q, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final s f5153d = new s(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* renamed from: a  reason: collision with root package name */
    private final int f5154a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5155b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5156c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        e.a(new Object[]{b.YEARS, b.MONTHS, b.DAYS});
    }

    public static s b(int i3) {
        if (i3 == 0) {
            return f5153d;
        }
        return new s(0, 0, i3);
    }

    private s(int i3, int i4, int i5) {
        this.f5154a = i3;
        this.f5155b = i4;
        this.f5156c = i5;
    }

    public final int a() {
        return this.f5156c;
    }

    public final long d() {
        return (((long) this.f5154a) * 12) + ((long) this.f5155b);
    }

    public final m p(m mVar) {
        l lVar = (l) mVar.a(j$.time.temporal.s.a());
        if (lVar == null || j$.time.chrono.s.f5038d.equals(lVar)) {
            if (this.f5155b == 0) {
                int i3 = this.f5154a;
                if (i3 != 0) {
                    mVar = mVar.d((long) i3, b.YEARS);
                }
            } else {
                long d3 = d();
                if (d3 != 0) {
                    mVar = mVar.d(d3, b.MONTHS);
                }
            }
            int i4 = this.f5156c;
            return i4 != 0 ? mVar.d((long) i4, b.DAYS) : mVar;
        }
        String s3 = lVar.s();
        throw new RuntimeException("Chronology mismatch, expected: ISO, actual: " + s3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f5154a == sVar.f5154a && this.f5155b == sVar.f5155b && this.f5156c == sVar.f5156c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f5156c, 16) + Integer.rotateLeft(this.f5155b, 8) + this.f5154a;
    }

    public final String toString() {
        if (this == f5153d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i3 = this.f5154a;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('Y');
        }
        int i4 = this.f5155b;
        if (i4 != 0) {
            sb.append(i4);
            sb.append('M');
        }
        int i5 = this.f5156c;
        if (i5 != 0) {
            sb.append(i5);
            sb.append('D');
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new t((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.f5154a);
        objectOutput.writeInt(this.f5155b);
        objectOutput.writeInt(this.f5156c);
    }

    static s c(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        int readInt2 = objectInput.readInt();
        int readInt3 = objectInput.readInt();
        if ((readInt | readInt2 | readInt3) == 0) {
            return f5153d;
        }
        return new s(readInt, readInt2, readInt3);
    }
}
