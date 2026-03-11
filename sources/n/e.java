package N;

import A2.i;
import B.m;
import C0.f;
import F0.h;
import F0.v;
import L.k;
import O.b;
import U.a;
import U.d;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import androidx.lifecycle.o;
import androidx.lifecycle.x;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import l.C0306b;
import l.C0307c;
import l.C0310f;

public class e implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, ComponentCallbacks, View.OnCreateContextMenuListener, j, U.e {

    /* renamed from: t  reason: collision with root package name */
    public static final Object f1144t = new Object();

    /* renamed from: f  reason: collision with root package name */
    public final int f1145f = -1;

    /* renamed from: g  reason: collision with root package name */
    public final String f1146g = UUID.randomUUID().toString();

    /* renamed from: h  reason: collision with root package name */
    public final f f1147h = new f(4);

    /* renamed from: i  reason: collision with root package name */
    public f f1148i;

    /* renamed from: j  reason: collision with root package name */
    public final androidx.lifecycle.e f1149j;

    /* renamed from: k  reason: collision with root package name */
    public l f1150k;

    /* renamed from: l  reason: collision with root package name */
    public v f1151l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f1152m;

    /* renamed from: n  reason: collision with root package name */
    public final m f1153n;

    /* renamed from: o  reason: collision with root package name */
    public final d f1154o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f1155p;

    /* renamed from: q  reason: collision with root package name */
    public int f1156q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1157r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1158s;

    /* JADX WARNING: type inference failed for: r1v16, types: [java.lang.Object, androidx.lifecycle.j] */
    public e() {
        Object obj;
        x xVar;
        new b(this, 1);
        this.f1149j = androidx.lifecycle.e.f2504j;
        new o();
        new AtomicInteger();
        this.f1152m = new ArrayList();
        this.f1153n = new m(9, (Object) this);
        this.f1150k = new l(this);
        this.f1151l = new v(this);
        ArrayList arrayList = this.f1152m;
        m mVar = this.f1153n;
        if (!arrayList.contains(mVar)) {
            if (this.f1145f >= 0) {
                e eVar = (e) mVar.f100g;
                eVar.f1151l.c();
                androidx.lifecycle.e eVar2 = eVar.f1150k.f2511c;
                if (eVar2 == androidx.lifecycle.e.f2501g || eVar2 == androidx.lifecycle.e.f2502h) {
                    d dVar = (d) eVar.f1151l.f355c;
                    dVar.getClass();
                    Iterator it = ((C0310f) dVar.f1754c).iterator();
                    while (true) {
                        C0306b bVar = (C0306b) it;
                        obj = null;
                        if (!bVar.hasNext()) {
                            xVar = null;
                            break;
                        }
                        Map.Entry entry = (Map.Entry) bVar.next();
                        i.d(entry, "components");
                        xVar = (x) entry.getValue();
                        if (i.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                            break;
                        }
                    }
                    if (xVar == null) {
                        x xVar2 = new x((d) eVar.f1151l.f355c, eVar);
                        C0310f fVar = (C0310f) ((d) eVar.f1151l.f355c).f1754c;
                        C0307c a2 = fVar.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                        if (a2 != null) {
                            obj = a2.f3992g;
                        } else {
                            C0307c cVar = new C0307c("androidx.lifecycle.internal.SavedStateHandlesProvider", xVar2);
                            fVar.f4001i++;
                            C0307c cVar2 = fVar.f3999g;
                            if (cVar2 == null) {
                                fVar.f3998f = cVar;
                                fVar.f3999g = cVar;
                            } else {
                                cVar2.f3993h = cVar;
                                cVar.f3994i = cVar2;
                                fVar.f3999g = cVar;
                            }
                        }
                        if (((x) obj) == null) {
                            eVar.f1150k.a(new a(1, xVar2));
                        } else {
                            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
                        }
                    }
                    v vVar = eVar.f1151l;
                    if (!vVar.f353a) {
                        vVar.c();
                    }
                    l b3 = vVar.f354b.b();
                    if (b3.f2511c.compareTo(androidx.lifecycle.e.f2503i) < 0) {
                        d dVar2 = (d) vVar.f355c;
                        if (!dVar2.f1752a) {
                            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
                        } else if (!dVar2.f1753b) {
                            dVar2.f1755d = null;
                            dVar2.f1753b = true;
                        } else {
                            throw new IllegalStateException("SavedStateRegistry was already restored.");
                        }
                    } else {
                        throw new IllegalStateException(("performRestore cannot be called when owner is " + b3.f2511c).toString());
                    }
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                arrayList.add(mVar);
            }
        }
        new b(this, 0);
        new c(this);
        this.f1154o = new d(this);
        this.f1155p = true;
        this.f1156q = -1;
        new h(7, (Object) this);
    }

    public final d a() {
        return (d) this.f1151l.f355c;
    }

    public final l b() {
        return this.f1150k;
    }

    public final b c() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final f d() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [N.i, java.lang.Object] */
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        if (!this.f1157r) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            if (!this.f1158s) {
                this.f1158s = true;
                this.f1157r = true;
                if (this.f1156q >= 0) {
                    f d3 = d();
                    int i3 = this.f1156q;
                    if (i3 >= 0) {
                        d3.D(true);
                        this.f1156q = -1;
                        return;
                    }
                    throw new IllegalArgumentException(A2.h.e("Bad id: ", i3));
                }
                a aVar = new a(d());
                ? obj = new Object();
                obj.f1162a = 3;
                obj.f1163b = this;
                ((ArrayList) aVar.f1138d).add(obj);
                obj.f1164c = 0;
                obj.f1165d = 0;
                obj.f1166e = 0;
                obj.f1167f = 0;
                if (!aVar.f1137c) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Commit: " + aVar);
                        PrintWriter printWriter = new PrintWriter(new j());
                        printWriter.print("  ");
                        printWriter.print("mName=");
                        printWriter.print((String) null);
                        printWriter.print(" mIndex=");
                        printWriter.print(aVar.f1136b);
                        printWriter.print(" mCommitted=");
                        printWriter.println(aVar.f1137c);
                        ArrayList arrayList = (ArrayList) aVar.f1138d;
                        if (!arrayList.isEmpty()) {
                            printWriter.print("  ");
                            printWriter.println("Operations:");
                            int size = arrayList.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                i iVar = (i) arrayList.get(i4);
                                switch (iVar.f1162a) {
                                    case 0:
                                        str = "NULL";
                                        break;
                                    case 1:
                                        str = "ADD";
                                        break;
                                    case k.FLOAT_FIELD_NUMBER:
                                        str = "REPLACE";
                                        break;
                                    case k.INTEGER_FIELD_NUMBER:
                                        str = "REMOVE";
                                        break;
                                    case k.LONG_FIELD_NUMBER:
                                        str = "HIDE";
                                        break;
                                    case k.STRING_FIELD_NUMBER:
                                        str = "SHOW";
                                        break;
                                    case k.STRING_SET_FIELD_NUMBER:
                                        str = "DETACH";
                                        break;
                                    case k.DOUBLE_FIELD_NUMBER:
                                        str = "ATTACH";
                                        break;
                                    case k.BYTES_FIELD_NUMBER:
                                        str = "SET_PRIMARY_NAV";
                                        break;
                                    case 9:
                                        str = "UNSET_PRIMARY_NAV";
                                        break;
                                    case 10:
                                        str = "OP_SET_MAX_LIFECYCLE";
                                        break;
                                    default:
                                        str = "cmd=" + iVar.f1162a;
                                        break;
                                }
                                printWriter.print("  ");
                                printWriter.print("  Op #");
                                printWriter.print(i4);
                                printWriter.print(": ");
                                printWriter.print(str);
                                printWriter.print(" ");
                                printWriter.println(iVar.f1163b);
                                if (!(iVar.f1164c == 0 && iVar.f1165d == 0)) {
                                    printWriter.print("  ");
                                    printWriter.print("enterAnim=#");
                                    printWriter.print(Integer.toHexString(iVar.f1164c));
                                    printWriter.print(" exitAnim=#");
                                    printWriter.println(Integer.toHexString(iVar.f1165d));
                                }
                                if (iVar.f1166e != 0 || iVar.f1167f != 0) {
                                    printWriter.print("  ");
                                    printWriter.print("popEnterAnim=#");
                                    printWriter.print(Integer.toHexString(iVar.f1166e));
                                    printWriter.print(" popExitAnim=#");
                                    printWriter.println(Integer.toHexString(iVar.f1167f));
                                }
                            }
                        }
                        printWriter.close();
                    }
                    aVar.f1137c = true;
                    aVar.f1136b = -1;
                    ((f) aVar.f1139e).D(true);
                    return;
                }
                throw new IllegalStateException("commit already called");
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1146g);
        sb.append(")");
        return sb.toString();
    }

    public final void onLowMemory() {
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }
}
