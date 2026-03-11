package W1;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import m2.C0332a;

public final class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f1908a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f1909b;

    public d(f fVar, Context context) {
        this.f1909b = fVar;
        this.f1908a = context;
    }

    public final Object call() {
        Throwable th;
        int i3;
        String str;
        String str2;
        f fVar = this.f1909b;
        Context context = this.f1908a;
        C0332a.b("FlutterLoader initTask");
        try {
            fVar.getClass();
            FlutterJNI flutterJNI = fVar.f1916e;
            i3 = 0;
            flutterJNI.loadLibrary(context);
            flutterJNI.updateRefreshRate();
            fVar.f1917f.execute(new L1.d(2, (Object) this));
            File filesDir = context.getFilesDir();
            if (filesDir == null) {
                filesDir = new File(context.getDataDir().getPath(), "files");
            }
            String path = filesDir.getPath();
            File codeCacheDir = context.getCodeCacheDir();
            if (codeCacheDir == null) {
                codeCacheDir = context.getCacheDir();
            }
            if (codeCacheDir == null) {
                codeCacheDir = new File(context.getDataDir().getPath(), "cache");
            }
            String path2 = codeCacheDir.getPath();
            File dir = context.getDir("flutter", 0);
            if (dir == null) {
                dir = new File(context.getDataDir().getPath(), "app_flutter");
            }
            dir.getPath();
            e eVar = new e(path, path2);
            Trace.endSection();
            return eVar;
        } catch (UnsatisfiedLinkError e2) {
            UnsatisfiedLinkError unsatisfiedLinkError = e2;
            if (!unsatisfiedLinkError.toString().contains("couldn't find \"libflutter.so\"")) {
                if (!unsatisfiedLinkError.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                    throw unsatisfiedLinkError;
                }
            }
            String property = System.getProperty("os.arch");
            File file = new File((String) fVar.f1915d.f1902e);
            String[] list = file.list();
            ArrayList arrayList = new ArrayList();
            String[] strArr = Build.SUPPORTED_ABIS;
            int length = strArr.length;
            int i4 = 0;
            while (i4 < length) {
                String str3 = strArr[i4];
                StringBuilder sb = new StringBuilder();
                sb.append("!");
                String str4 = File.separator;
                sb.append(str4);
                sb.append("lib");
                sb.append(str4);
                sb.append(str3);
                String sb2 = sb.toString();
                String[] strArr2 = context.getApplicationInfo().splitSourceDirs;
                ArrayList arrayList2 = new ArrayList();
                if (strArr2 != null) {
                    int length2 = strArr2.length;
                    int i5 = i3;
                    while (i5 < length2) {
                        arrayList2.add(strArr2[i5] + sb2);
                        i5++;
                    }
                    arrayList.addAll(arrayList2);
                }
                String str5 = context.getApplicationInfo().sourceDir;
                if (str5 != null && !str5.isEmpty()) {
                    arrayList.add(str5 + sb2);
                }
                i4++;
                i3 = 0;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
            sb3.append(property);
            sb3.append(", and the native libraries directory (with path ");
            sb3.append(file.getAbsolutePath());
            sb3.append(") ");
            if (file.exists()) {
                str = "contains the following files: " + Arrays.toString(list);
            } else {
                str = "does not exist";
            }
            sb3.append(str);
            if (arrayList.isEmpty()) {
                str2 = "";
            } else {
                str2 = ", and the split and source libraries directory (with path(s) " + arrayList + ")";
            }
            sb3.append(str2);
            sb3.append(".");
            throw new UnsupportedOperationException(sb3.toString(), unsatisfiedLinkError);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
