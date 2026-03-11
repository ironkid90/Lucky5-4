package j;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import d2.C0152a;
import i.C0207i;
import i.C0208j;
import java.lang.reflect.Method;

public final class L extends I implements J {

    /* renamed from: E  reason: collision with root package name */
    public static final Method f3623E;

    /* renamed from: D  reason: collision with root package name */
    public C0152a f3624D;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3623E = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public final void a(C0207i iVar, C0208j jVar) {
        C0152a aVar = this.f3624D;
        if (aVar != null) {
            aVar.a(iVar, jVar);
        }
    }

    public final void b(C0207i iVar, C0208j jVar) {
        C0152a aVar = this.f3624D;
        if (aVar != null) {
            aVar.b(iVar, jVar);
        }
    }
}
