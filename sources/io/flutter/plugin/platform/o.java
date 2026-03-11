package io.flutter.plugin.platform;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Display;
import android.view.inputmethod.InputMethodManager;

public final class o extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final InputMethodManager f3418a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.view.inputmethod.InputMethodManager} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o(android.content.Context r1, android.view.inputmethod.InputMethodManager r2) {
        /*
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto L_0x0006
            goto L_0x000f
        L_0x0006:
            java.lang.String r2 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r2)
            r2 = r1
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
        L_0x000f:
            r0.f3418a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.o.<init>(android.content.Context, android.view.inputmethod.InputMethodManager):void");
    }

    public final Context createDisplayContext(Display display) {
        return new o(super.createDisplayContext(display), this.f3418a);
    }

    public final Object getSystemService(String str) {
        if ("input_method".equals(str)) {
            return this.f3418a;
        }
        return super.getSystemService(str);
    }
}
