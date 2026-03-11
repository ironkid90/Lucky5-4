package R2;

import A2.i;
import q2.C0400c;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f1403a;

    /* renamed from: b  reason: collision with root package name */
    public int f1404b;

    /* renamed from: c  reason: collision with root package name */
    public int f1405c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1406d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1407e;

    /* renamed from: f  reason: collision with root package name */
    public q f1408f;

    /* renamed from: g  reason: collision with root package name */
    public q f1409g;

    public q() {
        this.f1403a = new byte[8192];
        this.f1407e = true;
        this.f1406d = false;
    }

    public final q a() {
        q qVar = this.f1408f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f1409g;
        i.b(qVar2);
        qVar2.f1408f = this.f1408f;
        q qVar3 = this.f1408f;
        i.b(qVar3);
        qVar3.f1409g = this.f1409g;
        this.f1408f = null;
        this.f1409g = null;
        return qVar;
    }

    public final void b(q qVar) {
        i.e(qVar, "segment");
        qVar.f1409g = this;
        qVar.f1408f = this.f1408f;
        q qVar2 = this.f1408f;
        i.b(qVar2);
        qVar2.f1409g = qVar;
        this.f1408f = qVar;
    }

    public final q c() {
        this.f1406d = true;
        return new q(this.f1403a, this.f1404b, this.f1405c, true);
    }

    public final void d(q qVar, int i3) {
        i.e(qVar, "sink");
        if (qVar.f1407e) {
            int i4 = qVar.f1405c;
            int i5 = i4 + i3;
            byte[] bArr = qVar.f1403a;
            if (i5 > 8192) {
                if (!qVar.f1406d) {
                    int i6 = qVar.f1404b;
                    if (i5 - i6 <= 8192) {
                        C0400c.I(0, i6, i4, bArr, bArr);
                        qVar.f1405c -= qVar.f1404b;
                        qVar.f1404b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i7 = qVar.f1405c;
            int i8 = this.f1404b;
            C0400c.I(i7, i8, i8 + i3, this.f1403a, bArr);
            qVar.f1405c += i3;
            this.f1404b += i3;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public q(byte[] bArr, int i3, int i4, boolean z3) {
        i.e(bArr, "data");
        this.f1403a = bArr;
        this.f1404b = i3;
        this.f1405c = i4;
        this.f1406d = z3;
        this.f1407e = false;
    }
}
