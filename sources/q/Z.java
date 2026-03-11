package q;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;

public final class Z {

    /* renamed from: a  reason: collision with root package name */
    public final String f4238a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence[] f4239b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4240c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f4241d;

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f4242e;

    public Z(String str, CharSequence[] charSequenceArr, boolean z3, Bundle bundle, HashSet hashSet) {
        this.f4238a = str;
        this.f4239b = charSequenceArr;
        this.f4240c = z3;
        this.f4241d = bundle;
        this.f4242e = hashSet;
    }

    public static RemoteInput a(Z z3) {
        z3.getClass();
        RemoteInput.Builder addExtras = new RemoteInput.Builder("FlutterLocalNotificationsPluginInputResult").setLabel(z3.f4238a).setChoices(z3.f4239b).setAllowFreeFormInput(z3.f4240c).addExtras(z3.f4241d);
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator it = z3.f4242e.iterator();
            while (it.hasNext()) {
                X.d(addExtras, (String) it.next(), true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Y.b(addExtras, 0);
        }
        return addExtras.build();
    }
}
