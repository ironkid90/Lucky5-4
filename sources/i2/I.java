package I2;

import q2.C0399b;

public abstract class I extends C0067s {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f722k = 0;

    /* renamed from: h  reason: collision with root package name */
    public long f723h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f724i;

    /* renamed from: j  reason: collision with root package name */
    public C0399b f725j;

    public final void i(boolean z3) {
        long j3;
        long j4 = this.f723h;
        if (z3) {
            j3 = 4294967296L;
        } else {
            j3 = 1;
        }
        long j5 = j4 - j3;
        this.f723h = j5;
        if (j5 <= 0 && this.f724i) {
            shutdown();
        }
    }

    public abstract Thread j();

    public final void k(boolean z3) {
        long j3;
        long j4 = this.f723h;
        if (z3) {
            j3 = 4294967296L;
        } else {
            j3 = 1;
        }
        this.f723h = j3 + j4;
        if (!z3) {
            this.f724i = true;
        }
    }

    public abstract long l();

    public final boolean m() {
        Object obj;
        C0399b bVar = this.f725j;
        if (bVar == null) {
            return false;
        }
        if (bVar.isEmpty()) {
            obj = null;
        } else {
            obj = bVar.removeFirst();
        }
        B b3 = (B) obj;
        if (b3 == null) {
            return false;
        }
        b3.run();
        return true;
    }

    public abstract void shutdown();
}
