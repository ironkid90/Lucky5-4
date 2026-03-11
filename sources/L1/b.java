package L1;

import L.k;
import M1.c;
import android.database.Cursor;
import android.util.Log;
import c2.m;
import java.io.Serializable;
import java.util.HashMap;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f926f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f f927g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ c f928h;

    public /* synthetic */ b(f fVar, c cVar, int i3) {
        this.f926f = i3;
        this.f927g = fVar;
        this.f928h = cVar;
    }

    public final void run() {
        String str;
        Boolean bool;
        boolean z3;
        switch (this.f926f) {
            case 0:
                f fVar = this.f927g;
                c cVar = this.f928h;
                m mVar = cVar.f1096m;
                Integer num = (Integer) mVar.a("cursorId");
                int intValue = num.intValue();
                boolean equals = Boolean.TRUE.equals(mVar.a("cancel"));
                if (a.b(fVar.f936d)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(fVar.h());
                    sb.append("cursor ");
                    sb.append(intValue);
                    if (equals) {
                        str = " cancel";
                    } else {
                        str = " next";
                    }
                    sb.append(str);
                    Log.d("Sqflite", sb.toString());
                }
                HashMap hashMap = fVar.f939g;
                m mVar2 = null;
                if (equals) {
                    m mVar3 = (m) hashMap.get(num);
                    if (mVar3 != null) {
                        fVar.b(mVar3);
                    }
                    cVar.b((Serializable) null);
                    return;
                }
                m mVar4 = (m) hashMap.get(num);
                boolean z4 = false;
                if (mVar4 != null) {
                    try {
                        Cursor cursor = mVar4.f969c;
                        HashMap c3 = f.c(cursor, Integer.valueOf(mVar4.f968b));
                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                            z4 = true;
                        }
                        if (z4) {
                            c3.put("cursorId", num);
                        }
                        cVar.b(c3);
                        if (!z4) {
                            fVar.b(mVar4);
                            return;
                        }
                        return;
                    } catch (Exception e2) {
                        fVar.i(e2, cVar);
                        if (mVar4 != null) {
                            fVar.b(mVar4);
                        } else {
                            mVar2 = mVar4;
                        }
                        if (0 == 0 && mVar2 != null) {
                            fVar.b(mVar2);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        if (0 == 0 && mVar4 != null) {
                            fVar.b(mVar4);
                        }
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("Cursor " + intValue + " not found");
                }
            case 1:
                this.f927g.e(this.f928h);
                return;
            case k.FLOAT_FIELD_NUMBER /*2*/:
                this.f927g.f(this.f928h);
                return;
            case k.INTEGER_FIELD_NUMBER /*3*/:
                this.f927g.d(this.f928h);
                return;
            default:
                f fVar2 = this.f927g;
                c cVar2 = this.f928h;
                Object t3 = cVar2.t("inTransaction");
                if (t3 instanceof Boolean) {
                    bool = (Boolean) t3;
                } else {
                    bool = null;
                }
                if (!Boolean.TRUE.equals(bool) || !cVar2.E() || ((Integer) cVar2.t("transactionId")) != null) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    int i3 = fVar2.f943k + 1;
                    fVar2.f943k = i3;
                    fVar2.f944l = Integer.valueOf(i3);
                }
                if (!fVar2.g(cVar2)) {
                    if (z3) {
                        fVar2.f944l = null;
                        return;
                    }
                    return;
                } else if (z3) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("transactionId", fVar2.f944l);
                    cVar2.b(hashMap2);
                    return;
                } else {
                    if (Boolean.FALSE.equals(bool)) {
                        fVar2.f944l = null;
                    }
                    cVar2.b((Serializable) null);
                    return;
                }
        }
    }
}
