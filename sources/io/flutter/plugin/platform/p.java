package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

public final class p extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final s f3419a;

    /* renamed from: b  reason: collision with root package name */
    public s f3420b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f3421c;

    public p(Context context, s sVar, Context context2) {
        super(context);
        this.f3419a = sVar;
        this.f3421c = context2;
    }

    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i3 = 0;
        while (i3 < stackTrace.length && i3 < 11) {
            if (stackTrace[i3].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i3].getMethodName().equals("<init>")) {
                return this.f3421c.getSystemService(str);
            }
            i3++;
        }
        if (this.f3420b == null) {
            this.f3420b = this.f3419a;
        }
        return this.f3420b;
    }
}
