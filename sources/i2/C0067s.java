package I2;

import A2.i;
import r2.C0417a;
import r2.C0421e;
import r2.C0422f;
import r2.C0423g;
import r2.C0424h;
import r2.C0425i;
import r2.C0426j;

/* renamed from: I2.s  reason: case insensitive filesystem */
public abstract class C0067s extends C0417a implements C0422f {

    /* renamed from: g  reason: collision with root package name */
    public static final r f784g = new r(C0421e.f4456f, C0066q.f781g);

    public C0067s() {
        super(C0421e.f4456f);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [A2.j, z2.l] */
    public final C0425i c(C0424h hVar) {
        i.e(hVar, "key");
        boolean z3 = hVar instanceof r;
        C0426j jVar = C0426j.f4457f;
        if (z3) {
            r rVar = (r) hVar;
            C0424h hVar2 = this.f4452f;
            if ((hVar2 == rVar || rVar.f783g == hVar2) && ((C0423g) rVar.f782f.j(this)) != null) {
                return jVar;
            }
        } else if (C0421e.f4456f == hVar) {
            return jVar;
        }
        return this;
    }

    public abstract void g(C0425i iVar, Runnable runnable);

    public boolean h() {
        return !(this instanceof j0);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [A2.j, z2.l] */
    public final C0423g n(C0424h hVar) {
        C0423g gVar;
        i.e(hVar, "key");
        if (hVar instanceof r) {
            r rVar = (r) hVar;
            C0424h hVar2 = this.f4452f;
            if ((hVar2 == rVar || rVar.f783g == hVar2) && (gVar = (C0423g) rVar.f782f.j(this)) != null) {
                return gVar;
            }
            return null;
        } else if (C0421e.f4456f == hVar) {
            return this;
        } else {
            return null;
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + C0071w.c(this);
    }
}
