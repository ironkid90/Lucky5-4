package L1;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import b2.f;
import d2.C0152a;
import i.C0203e;
import i.C0204f;
import i.C0207i;
import i.C0208j;
import i.C0209k;
import java.io.File;

public final class p implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f982f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f983g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f984h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f985i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f986j;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f982f = i3;
        this.f986j = obj;
        this.f983g = obj2;
        this.f984h = obj3;
        this.f985i = obj4;
    }

    public final void run() {
        switch (this.f982f) {
            case 0:
                synchronized (q.f990k) {
                    f fVar = (f) this.f983g;
                    if (fVar != null) {
                        q.a((q) this.f986j, fVar);
                    }
                    try {
                        if (a.b(q.f991l)) {
                            Log.d("Sqflite", "delete database " + ((String) this.f984h));
                        }
                        SQLiteDatabase.deleteDatabase(new File((String) this.f984h));
                    } catch (Exception e2) {
                        Log.e("Sqflite", "error " + e2 + " while closing database " + q.f995p);
                    }
                }
                ((f) this.f985i).b((Object) null);
                return;
            default:
                C0203e eVar = (C0203e) this.f983g;
                if (eVar != null) {
                    C0152a aVar = (C0152a) this.f986j;
                    ((C0204f) aVar.f2912g).f3124E = true;
                    eVar.f3118b.c(false);
                    ((C0204f) aVar.f2912g).f3124E = false;
                }
                C0208j jVar = (C0208j) this.f984h;
                if (jVar.isEnabled() && jVar.hasSubMenu()) {
                    ((C0207i) this.f985i).p(jVar, (C0209k) null, 4);
                    return;
                }
                return;
        }
    }
}
