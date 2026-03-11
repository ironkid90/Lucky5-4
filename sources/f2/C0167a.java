package f2;

import C0.r;
import S1.C0078d;
import T1.d;
import Y1.b;
import Z1.a;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import b2.f;
import c2.p;
import c2.s;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: f2.a  reason: case insensitive filesystem */
public class C0167a implements b, a, s {

    /* renamed from: f  reason: collision with root package name */
    public final PackageManager f2956f;

    /* renamed from: g  reason: collision with root package name */
    public Z1.b f2957g;

    /* renamed from: h  reason: collision with root package name */
    public HashMap f2958h;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f2959i = new HashMap();

    public C0167a(r rVar) {
        this.f2956f = (PackageManager) rVar.f160g;
        rVar.f161h = this;
    }

    public final void a(String str, String str2, boolean z3, f fVar) {
        if (this.f2957g == null) {
            fVar.a("error", "Plugin not bound to an Activity", (Object) null);
            return;
        }
        HashMap hashMap = this.f2958h;
        if (hashMap == null) {
            fVar.a("error", "Can not process text actions before calling queryTextActions", (Object) null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            fVar.a("error", "Text processing activity not found", (Object) null);
            return;
        }
        int hashCode = fVar.hashCode();
        this.f2959i.put(Integer.valueOf(hashCode), fVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z3);
        ((C0078d) ((d) this.f2957g).f1703a).startActivityForResult(intent, hashCode);
    }

    public final HashMap b() {
        List<ResolveInfo> list;
        HashMap hashMap = this.f2958h;
        PackageManager packageManager = this.f2956f;
        if (hashMap == null) {
            this.f2958h = new HashMap();
            int i3 = Build.VERSION.SDK_INT;
            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
            if (i3 >= 33) {
                list = packageManager.queryIntentActivities(type, PackageManager.ResolveInfoFlags.of(0));
            } else {
                list = packageManager.queryIntentActivities(type, 0);
            }
            for (ResolveInfo next : list) {
                String str = next.activityInfo.name;
                next.loadLabel(packageManager).toString();
                this.f2958h.put(str, next);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f2958h.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f2958h.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    public final boolean onActivityResult(int i3, int i4, Intent intent) {
        String str;
        HashMap hashMap = this.f2959i;
        if (!hashMap.containsKey(Integer.valueOf(i3))) {
            return false;
        }
        if (i4 == -1) {
            str = intent.getStringExtra("android.intent.extra.PROCESS_TEXT");
        } else {
            str = null;
        }
        ((p) hashMap.remove(Integer.valueOf(i3))).b(str);
        return true;
    }

    public final void onAttachedToActivity(Z1.b bVar) {
        this.f2957g = bVar;
        ((d) bVar).g(this);
    }

    public final void onDetachedFromActivity() {
        ((HashSet) ((d) this.f2957g).f1705c).remove(this);
        this.f2957g = null;
    }

    public final void onDetachedFromActivityForConfigChanges() {
        ((HashSet) ((d) this.f2957g).f1705c).remove(this);
        this.f2957g = null;
    }

    public final void onReattachedToActivityForConfigChanges(Z1.b bVar) {
        this.f2957g = bVar;
        ((d) bVar).g(this);
    }

    public final void onAttachedToEngine(Y1.a aVar) {
    }

    public final void onDetachedFromEngine(Y1.a aVar) {
    }
}
