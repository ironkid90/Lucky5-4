package K0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f852a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f853b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f854c;

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f855d;

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f856e;

    /* renamed from: f  reason: collision with root package name */
    public static String f857f;

    /* renamed from: g  reason: collision with root package name */
    public static int f858g;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0063, code lost:
        if (r3 != null) goto L_0x004e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[SYNTHETIC, Splitter:B:28:0x005e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = "/proc/"
            java.lang.String r1 = f857f
            if (r1 != 0) goto L_0x0068
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x0013
            java.lang.String r0 = android.app.Application.getProcessName()
            f857f = r0
            goto L_0x0068
        L_0x0013:
            int r1 = f858g
            if (r1 != 0) goto L_0x001d
            int r1 = android.os.Process.myPid()
            f858g = r1
        L_0x001d:
            r2 = 0
            if (r1 > 0) goto L_0x0021
            goto L_0x0066
        L_0x0021:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0062, all -> 0x0055 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0062, all -> 0x0055 }
            r3.append(r1)     // Catch:{ IOException -> 0x0062, all -> 0x0055 }
            java.lang.String r0 = "/cmdline"
            r3.append(r0)     // Catch:{ IOException -> 0x0062, all -> 0x0055 }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x0062, all -> 0x0055 }
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ IOException -> 0x0062, all -> 0x0055 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0057 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x0057 }
            r4.<init>(r0)     // Catch:{ all -> 0x0057 }
            r3.<init>(r4)     // Catch:{ all -> 0x0057 }
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ IOException -> 0x0062, all -> 0x0055 }
            java.lang.String r0 = r3.readLine()     // Catch:{ IOException -> 0x0063, all -> 0x0052 }
            G0.o.e(r0)     // Catch:{ IOException -> 0x0063, all -> 0x0052 }
            java.lang.String r2 = r0.trim()     // Catch:{ IOException -> 0x0063, all -> 0x0052 }
        L_0x004e:
            r3.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x0066
        L_0x0052:
            r0 = move-exception
            r2 = r3
            goto L_0x005c
        L_0x0055:
            r0 = move-exception
            goto L_0x005c
        L_0x0057:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ IOException -> 0x0062, all -> 0x0055 }
            throw r0     // Catch:{ IOException -> 0x0062, all -> 0x0055 }
        L_0x005c:
            if (r2 == 0) goto L_0x0061
            r2.close()     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            throw r0
        L_0x0062:
            r3 = r2
        L_0x0063:
            if (r3 == 0) goto L_0x0066
            goto L_0x004e
        L_0x0066:
            f857f = r2
        L_0x0068:
            java.lang.String r0 = f857f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.b.a():java.lang.String");
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f853b == null) {
            f853b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f853b.booleanValue();
        if (f854c == null) {
            f854c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (!f854c.booleanValue()) {
            return false;
        }
        if (!b() || Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }
}
