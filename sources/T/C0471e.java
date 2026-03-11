package t;

import a.C0094a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v4.media.session.a;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import s.c;
import s.d;

/* renamed from: t.e  reason: case insensitive filesystem */
public class C0471e extends C0094a {

    /* renamed from: l  reason: collision with root package name */
    public static Class f4642l = null;

    /* renamed from: m  reason: collision with root package name */
    public static Constructor f4643m = null;

    /* renamed from: n  reason: collision with root package name */
    public static Method f4644n = null;

    /* renamed from: o  reason: collision with root package name */
    public static Method f4645o = null;

    /* renamed from: p  reason: collision with root package name */
    public static boolean f4646p = false;

    public static boolean Z(Object obj, String str, int i3, boolean z3) {
        a0();
        try {
            return ((Boolean) f4644n.invoke(obj, new Object[]{str, Integer.valueOf(i3), Boolean.valueOf(z3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void a0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f4646p) {
            f4646p = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor((Class[]) null);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
                method2 = null;
                cls = null;
                method = null;
            }
            f4643m = constructor;
            f4642l = cls;
            f4644n = method;
            f4645o = method2;
        }
    }

    public Typeface h(Context context, c cVar, Resources resources, int i3) {
        a0();
        try {
            Object newInstance = f4643m.newInstance((Object[]) null);
            d[] dVarArr = cVar.f4458a;
            int length = dVarArr.length;
            int i4 = 0;
            while (i4 < length) {
                d dVar = dVarArr[i4];
                File w3 = a.w(context);
                if (w3 == null) {
                    return null;
                }
                try {
                    if (!a.m(w3, resources, dVar.f4464f)) {
                        w3.delete();
                        return null;
                    } else if (!Z(newInstance, w3.getPath(), dVar.f4460b, dVar.f4461c)) {
                        return null;
                    } else {
                        w3.delete();
                        i4++;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    w3.delete();
                }
            }
            a0();
            try {
                Object newInstance2 = Array.newInstance(f4642l, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f4645o.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049 A[SYNTHETIC, Splitter:B:18:0x0049] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface i(android.content.Context r4, x.g[] r5, int r6) {
        /*
            r3 = this;
            int r0 = r5.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x0006
            return r2
        L_0x0006:
            x.g r5 = r3.s(r5, r6)
            android.content.ContentResolver r6 = r4.getContentResolver()
            android.net.Uri r5 = r5.f4759a     // Catch:{ IOException -> 0x0081 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r6.openFileDescriptor(r5, r0, r2)     // Catch:{ IOException -> 0x0081 }
            if (r5 != 0) goto L_0x001e
            if (r5 == 0) goto L_0x001d
            r5.close()     // Catch:{ IOException -> 0x0081 }
        L_0x001d:
            return r2
        L_0x001e:
            java.lang.String r6 = "/proc/self/fd/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ErrnoException -> 0x0046 }
            r0.<init>(r6)     // Catch:{ ErrnoException -> 0x0046 }
            int r6 = r5.getFd()     // Catch:{ ErrnoException -> 0x0046 }
            r0.append(r6)     // Catch:{ ErrnoException -> 0x0046 }
            java.lang.String r6 = r0.toString()     // Catch:{ ErrnoException -> 0x0046 }
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch:{ ErrnoException -> 0x0046 }
            android.system.StructStat r0 = android.system.Os.stat(r6)     // Catch:{ ErrnoException -> 0x0046 }
            int r0 = r0.st_mode     // Catch:{ ErrnoException -> 0x0046 }
            boolean r0 = android.system.OsConstants.S_ISREG(r0)     // Catch:{ ErrnoException -> 0x0046 }
            if (r0 == 0) goto L_0x0046
            java.io.File r0 = new java.io.File     // Catch:{ ErrnoException -> 0x0046 }
            r0.<init>(r6)     // Catch:{ ErrnoException -> 0x0046 }
            goto L_0x0047
        L_0x0046:
            r0 = r2
        L_0x0047:
            if (r0 == 0) goto L_0x005a
            boolean r6 = r0.canRead()     // Catch:{ all -> 0x0058 }
            if (r6 != 0) goto L_0x0050
            goto L_0x005a
        L_0x0050:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r0)     // Catch:{ all -> 0x0058 }
            r5.close()     // Catch:{ IOException -> 0x0081 }
            return r4
        L_0x0058:
            r4 = move-exception
            goto L_0x0078
        L_0x005a:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0058 }
            java.io.FileDescriptor r0 = r5.getFileDescriptor()     // Catch:{ all -> 0x0058 }
            r6.<init>(r0)     // Catch:{ all -> 0x0058 }
            android.graphics.Typeface r4 = r3.j(r4, r6)     // Catch:{ all -> 0x006e }
            r6.close()     // Catch:{ all -> 0x0058 }
            r5.close()     // Catch:{ IOException -> 0x0081 }
            return r4
        L_0x006e:
            r4 = move-exception
            r6.close()     // Catch:{ all -> 0x0073 }
            goto L_0x0077
        L_0x0073:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch:{ all -> 0x0058 }
        L_0x0077:
            throw r4     // Catch:{ all -> 0x0058 }
        L_0x0078:
            r5.close()     // Catch:{ all -> 0x007c }
            goto L_0x0080
        L_0x007c:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x0081 }
        L_0x0080:
            throw r4     // Catch:{ IOException -> 0x0081 }
        L_0x0081:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C0471e.i(android.content.Context, x.g[], int):android.graphics.Typeface");
    }
}
