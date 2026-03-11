package K0;

import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f860a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f861b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f862c = null;

    static {
        Method method;
        Method method2;
        boolean z3;
        Class<String> cls = String.class;
        Class<WorkSource> cls2 = WorkSource.class;
        Process.myUid();
        try {
            method = cls2.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            method = null;
        }
        f860a = method;
        try {
            method2 = cls2.getMethod("add", new Class[]{Integer.TYPE, cls});
        } catch (Exception unused2) {
            method2 = null;
        }
        f861b = method2;
        try {
            cls2.getMethod("size", (Class[]) null);
        } catch (Exception unused3) {
        }
        try {
            cls2.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused4) {
        }
        try {
            cls2.getMethod("getName", new Class[]{Integer.TYPE});
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            try {
                cls2.getMethod("createWorkChain", (Class[]) null);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e2);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, cls});
            } catch (Exception e3) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e3);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                cls2.getMethod("isEmpty", (Class[]) null).setAccessible(true);
            } catch (Exception unused6) {
            }
        }
    }
}
