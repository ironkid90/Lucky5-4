package u1;

import android.content.Intent;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: u1.c  reason: case insensitive filesystem */
public final class C0496c {

    /* renamed from: b  reason: collision with root package name */
    public static volatile C0496c f4717b;

    /* renamed from: a  reason: collision with root package name */
    public HashSet f4718a;

    /* JADX WARNING: type inference failed for: r5v1, types: [u1.c, java.lang.Object] */
    public static C0496c a(Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (intent.getBooleanExtra("trace-startup", false)) {
            arrayList.add("--trace-startup");
        }
        if (intent.getBooleanExtra("start-paused", false)) {
            arrayList.add("--start-paused");
        }
        int intExtra = intent.getIntExtra("vm-service-port", 0);
        if (intExtra > 0) {
            arrayList.add("--vm-service-port=" + Integer.toString(intExtra));
        }
        if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
            arrayList.add("--disable-service-auth-codes");
        }
        if (intent.getBooleanExtra("endless-trace-buffer", false)) {
            arrayList.add("--endless-trace-buffer");
        }
        if (intent.getBooleanExtra("use-test-fonts", false)) {
            arrayList.add("--use-test-fonts");
        }
        if (intent.getBooleanExtra("enable-dart-profiling", false)) {
            arrayList.add("--enable-dart-profiling");
        }
        if (intent.getBooleanExtra("profile-startup", false)) {
            arrayList.add("--profile-startup");
        }
        if (intent.getBooleanExtra("enable-software-rendering", false)) {
            arrayList.add("--enable-software-rendering");
        }
        if (intent.getBooleanExtra("skia-deterministic-rendering", false)) {
            arrayList.add("--skia-deterministic-rendering");
        }
        if (intent.getBooleanExtra("trace-skia", false)) {
            arrayList.add("--trace-skia");
        }
        String stringExtra = intent.getStringExtra("trace-skia-allowlist");
        if (stringExtra != null) {
            arrayList.add("--trace-skia-allowlist=".concat(stringExtra));
        }
        if (intent.getBooleanExtra("trace-systrace", false)) {
            arrayList.add("--trace-systrace");
        }
        if (intent.hasExtra("trace-to-file")) {
            arrayList.add("--trace-to-file=" + intent.getStringExtra("trace-to-file"));
        }
        if (intent.hasExtra("profile-microtasks")) {
            arrayList.add("--profile-microtasks");
        }
        if (intent.hasExtra("enable-impeller")) {
            if (intent.getBooleanExtra("enable-impeller", false)) {
                arrayList.add("--enable-impeller=true");
            } else {
                arrayList.add("--enable-impeller=false");
            }
        }
        if (intent.getBooleanExtra("enable-vulkan-validation", false)) {
            arrayList.add("--enable-vulkan-validation");
        }
        if (intent.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
            arrayList.add("--dump-skp-on-shader-compilation");
        }
        if (intent.getBooleanExtra("cache-sksl", false)) {
            arrayList.add("--cache-sksl");
        }
        if (intent.getBooleanExtra("purge-persistent-cache", false)) {
            arrayList.add("--purge-persistent-cache");
        }
        if (intent.getBooleanExtra("verbose-logging", false)) {
            arrayList.add("--verbose-logging");
        }
        if (intent.hasExtra("dart-flags")) {
            arrayList.add("--dart-flags=" + intent.getStringExtra("dart-flags"));
        }
        ? obj = new Object();
        obj.f4718a = new HashSet(arrayList);
        return obj;
    }

    public String[] b() {
        HashSet hashSet = this.f4718a;
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }
}
