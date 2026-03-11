package W1;

import D0.g;
import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.r;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import m2.C0332a;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1912a;

    /* renamed from: b  reason: collision with root package name */
    public g f1913b;

    /* renamed from: c  reason: collision with root package name */
    public long f1914c;

    /* renamed from: d  reason: collision with root package name */
    public b f1915d;

    /* renamed from: e  reason: collision with root package name */
    public FlutterJNI f1916e;

    /* renamed from: f  reason: collision with root package name */
    public ExecutorService f1917f;

    /* renamed from: g  reason: collision with root package name */
    public Future f1918g;

    public static String c(Context context, String str) {
        if (str.startsWith("--aot-shared-library-name=")) {
            File file = new File(str.substring(26));
            try {
                String canonicalPath = file.getCanonicalPath();
                String canonicalPath2 = context.getApplicationContext().getFilesDir().getCanonicalPath();
                boolean startsWith = canonicalPath.startsWith(canonicalPath2 + File.separator);
                boolean endsWith = canonicalPath.endsWith(".so");
                if (startsWith && endsWith) {
                    return "--aot-shared-library-name=".concat(canonicalPath);
                }
                Log.e("FlutterLoader", "External path " + canonicalPath + " rejected; not overriding aot-shared-library-name.");
                return null;
            } catch (IOException unused) {
                Log.e("FlutterLoader", "External path " + file.getPath() + " is not a valid path. Please ensure this shared AOT library exists.");
                return null;
            }
        } else {
            throw new IllegalArgumentException("AOT shared library name flag was not specified correctly; please use --aot-shared-library-name=<path>.");
        }
    }

    public final void a(Context context, String[] strArr) {
        Throwable th;
        int i3;
        boolean z3;
        String str;
        Context context2 = context;
        String[] strArr2 = strArr;
        if (!this.f1912a) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
            } else if (this.f1913b != null) {
                try {
                    C0332a.b("FlutterLoader#ensureInitializationComplete");
                    e eVar = (e) this.f1918g.get();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                    arrayList.add("--icu-native-lib-path=" + ((String) this.f1915d.f1902e) + File.separator + "libflutter.so");
                    if (strArr2 != null) {
                        for (String str2 : strArr2) {
                            if (str2.startsWith("--aot-shared-library-name=")) {
                                String c3 = c(context, str2);
                                if (c3 != null) {
                                    str2 = c3;
                                } else {
                                    Log.w("FlutterLoader", "Skipping unsafe AOT shared library name flag: " + str2 + ". Please ensure that the library is vetted and placed in your application's internal storage.");
                                }
                            }
                            arrayList.add(str2);
                        }
                    }
                    arrayList.add("--aot-shared-library-name=" + ((String) this.f1915d.f1899b));
                    arrayList.add("--aot-shared-library-name=" + ((String) this.f1915d.f1902e) + File.separator + ((String) this.f1915d.f1899b));
                    StringBuilder sb = new StringBuilder();
                    sb.append("--cache-dir-path=");
                    sb.append(eVar.f1911b);
                    arrayList.add(sb.toString());
                    Object obj = this.f1915d.f1901d;
                    arrayList.add("--domain-network-policy=" + ((String) this.f1915d.f1901d));
                    this.f1913b.getClass();
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        i3 = bundle.getInt("io.flutter.embedding.android.OldGenHeapSize");
                    } else {
                        i3 = 0;
                    }
                    if (i3 == 0) {
                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                        i3 = (int) ((((double) memoryInfo.totalMem) / 1000000.0d) / 2.0d);
                    }
                    arrayList.add("--old-gen-heap-size=" + i3);
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                    arrayList.add("--prefetched-default-font-manager");
                    if (bundle != null) {
                        if (bundle.containsKey("io.flutter.embedding.android.EnableImpeller")) {
                            if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller")) {
                                arrayList.add("--enable-impeller=true");
                            } else {
                                arrayList.add("--enable-impeller=false");
                            }
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                            arrayList.add("--enable-vulkan-validation");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                            arrayList.add("--enable-opengl-gpu-tracing");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                            arrayList.add("--enable-vulkan-gpu-tracing");
                        }
                        if (!bundle.getBoolean("io.flutter.embedding.android.DisableMergedPlatformUIThread", false)) {
                            if (bundle.getBoolean("io.flutter.embedding.android.EnableFlutterGPU", false)) {
                                arrayList.add("--enable-flutter-gpu");
                            }
                            if (bundle.getBoolean("io.flutter.embedding.android.EnableSurfaceControl", false)) {
                                arrayList.add("--enable-surface-control");
                            }
                            String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                            if (string != null) {
                                arrayList.add("--impeller-backend=" + string);
                            }
                            if (bundle.getBoolean("io.flutter.embedding.android.ImpellerLazyShaderInitialization")) {
                                arrayList.add("--impeller-lazy-shader-mode");
                            }
                            if (bundle.getBoolean("io.flutter.embedding.android.ImpellerAntialiasLines")) {
                                arrayList.add("--impeller-antialias-lines");
                            }
                        } else {
                            throw new IllegalArgumentException("io.flutter.embedding.android.DisableMergedPlatformUIThread is no longer allowed.");
                        }
                    }
                    if (bundle == null) {
                        z3 = true;
                    } else {
                        z3 = bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
                    }
                    if (z3) {
                        str = "true";
                    } else {
                        str = "false";
                    }
                    arrayList.add("--leak-vm=" + str);
                    this.f1916e.init(context, (String[]) arrayList.toArray(new String[0]), (String) null, eVar.f1910a, eVar.f1911b, SystemClock.uptimeMillis() - this.f1914c, Build.VERSION.SDK_INT);
                    this.f1912a = true;
                    Trace.endSection();
                    return;
                } catch (Exception e2) {
                    Log.e("FlutterLoader", "Flutter initialization failed.", e2);
                    throw new RuntimeException(e2);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
            }
        } else {
            return;
        }
        throw th;
    }

    public final String b(String str) {
        return ((String) this.f1915d.f1900c) + File.separator + str;
    }

    public final void d(Context context) {
        g gVar = new g(10, false);
        if (this.f1913b == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C0332a.b("FlutterLoader#startInitialization");
                try {
                    Context applicationContext = context.getApplicationContext();
                    this.f1913b = gVar;
                    this.f1914c = SystemClock.uptimeMillis();
                    this.f1915d = a.a(applicationContext);
                    r a2 = r.a((DisplayManager) applicationContext.getSystemService("display"), this.f1916e);
                    a2.f3569b.setAsyncWaitForVsyncDelegate(a2.f3571d);
                    this.f1918g = this.f1917f.submit(new d(this, applicationContext));
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw new IllegalStateException("startInitialization must be called on the main thread");
            }
        } else {
            return;
        }
        throw th;
    }
}
