package j$.time.chrono;

import j$.time.e;
import j$.time.temporal.a;
import j$.time.temporal.b;
import j$.time.temporal.m;
import j$.time.temporal.q;
import j$.time.temporal.s;
import j$.time.temporal.w;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* renamed from: j$.time.chrono.h  reason: case insensitive filesystem */
final class C0534h implements q, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f5009e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a  reason: collision with root package name */
    private final l f5010a;

    /* renamed from: b  reason: collision with root package name */
    final int f5011b;

    /* renamed from: c  reason: collision with root package name */
    final int f5012c;

    /* renamed from: d  reason: collision with root package name */
    final int f5013d;

    static {
        e.a(new Object[]{b.YEARS, b.MONTHS, b.DAYS});
    }

    C0534h(l lVar, int i3, int i4, int i5) {
        this.f5010a = lVar;
        this.f5011b = i3;
        this.f5012c = i4;
        this.f5013d = i5;
    }

    public final String toString() {
        l lVar = this.f5010a;
        int i3 = this.f5013d;
        int i4 = this.f5012c;
        int i5 = this.f5011b;
        if (i5 == 0 && i4 == 0 && i3 == 0) {
            String s3 = ((C0527a) lVar).s();
            return s3 + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((C0527a) lVar).s());
        sb.append(" P");
        if (i5 != 0) {
            sb.append(i5);
            sb.append('Y');
        }
        if (i4 != 0) {
            sb.append(i4);
            sb.append('M');
        }
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    public final m p(m mVar) {
        l lVar = (l) mVar.a(s.a());
        l lVar2 = this.f5010a;
        if (lVar == null || ((C0527a) lVar2).equals(lVar)) {
            int i3 = this.f5011b;
            int i4 = this.f5012c;
            if (i4 != 0) {
                w U3 = lVar2.U(a.MONTH_OF_YEAR);
                long d3 = (!U3.g() || !U3.h()) ? -1 : (U3.d() - U3.e()) + 1;
                if (d3 > 0) {
                    mVar = mVar.d((((long) i3) * d3) + ((long) i4), b.MONTHS);
                } else {
                    if (i3 != 0) {
                        mVar = mVar.d((long) i3, b.YEARS);
                    }
                    mVar = mVar.d((long) i4, b.MONTHS);
                }
            } else if (i3 != 0) {
                mVar = mVar.d((long) i3, b.YEARS);
            }
            int i5 = this.f5013d;
            return i5 != 0 ? mVar.d((long) i5, b.DAYS) : mVar;
        }
        String s3 = lVar2.s();
        String s4 = lVar.s();
        throw new RuntimeException("Chronology mismatch, expected: " + s3 + ", actual: " + s4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0534h)) {
            return false;
        }
        C0534h hVar = (C0534h) obj;
        if (this.f5011b == hVar.f5011b && this.f5012c == hVar.f5012c && this.f5013d == hVar.f5013d) {
            if (((C0527a) this.f5010a).equals(hVar.f5010a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((C0527a) this.f5010a).hashCode() ^ (Integer.rotateLeft(this.f5013d, 16) + (Integer.rotateLeft(this.f5012c, 8) + this.f5011b));
    }

    /* access modifiers changed from: protected */
    public Object writeReplace() {
        return new E((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.f5010a.s());
        objectOutput.writeInt(this.f5011b);
        objectOutput.writeInt(this.f5012c);
        objectOutput.writeInt(this.f5013d);
    }
}
