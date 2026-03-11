package P2;

import I2.C0071w;

public final class j extends h {

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f1271h;

    public j(Runnable runnable, long j3, i iVar) {
        super(j3, iVar);
        this.f1271h = runnable;
    }

    public final void run() {
        try {
            this.f1271h.run();
        } finally {
            this.f1269g.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f1271h;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(C0071w.c(runnable));
        sb.append(", ");
        sb.append(this.f1268f);
        sb.append(", ");
        sb.append(this.f1269g);
        sb.append(']');
        return sb.toString();
    }
}
