package T1;

import B.m;
import C0.f;
import C0.r;
import U1.b;
import V1.a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import b2.C0129a;
import b2.g;
import b2.j;
import c2.n;
import f2.C0167a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.h;
import io.flutter.plugin.platform.k;
import io.flutter.plugin.platform.l;
import java.util.HashMap;
import java.util.HashSet;
import m2.C0333b;

public final class c implements C0333b {

    /* renamed from: y  reason: collision with root package name */
    public static long f1678y = 1;

    /* renamed from: z  reason: collision with root package name */
    public static final HashMap f1679z = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f1680a;

    /* renamed from: b  reason: collision with root package name */
    public final h f1681b;

    /* renamed from: c  reason: collision with root package name */
    public final b f1682c;

    /* renamed from: d  reason: collision with root package name */
    public final e f1683d;

    /* renamed from: e  reason: collision with root package name */
    public final d2.b f1684e;

    /* renamed from: f  reason: collision with root package name */
    public final f f1685f;

    /* renamed from: g  reason: collision with root package name */
    public final C0129a f1686g;

    /* renamed from: h  reason: collision with root package name */
    public final F0.h f1687h;

    /* renamed from: i  reason: collision with root package name */
    public final m f1688i;

    /* renamed from: j  reason: collision with root package name */
    public final F0.h f1689j;

    /* renamed from: k  reason: collision with root package name */
    public final g f1690k;

    /* renamed from: l  reason: collision with root package name */
    public final r f1691l;

    /* renamed from: m  reason: collision with root package name */
    public final F0.h f1692m;

    /* renamed from: n  reason: collision with root package name */
    public final F0.h f1693n;

    /* renamed from: o  reason: collision with root package name */
    public final j f1694o;

    /* renamed from: p  reason: collision with root package name */
    public final F0.h f1695p;

    /* renamed from: q  reason: collision with root package name */
    public final b2.h f1696q;

    /* renamed from: r  reason: collision with root package name */
    public final r f1697r;

    /* renamed from: s  reason: collision with root package name */
    public final l f1698s;

    /* renamed from: t  reason: collision with root package name */
    public final k f1699t;

    /* renamed from: u  reason: collision with root package name */
    public final n f1700u;
    public final HashSet v;

    /* renamed from: w  reason: collision with root package name */
    public final long f1701w;

    /* renamed from: x  reason: collision with root package name */
    public final a f1702x;

    public c(Context context, String[] strArr) {
        this(context, (FlutterJNI) null, new l(), strArr, true, false);
    }

    public c(Context context, FlutterJNI flutterJNI, l lVar, String[] strArr, boolean z3, boolean z4) {
        AssetManager assetManager;
        this.v = new HashSet();
        this.f1702x = new a(this);
        long j3 = f1678y;
        f1678y = 1 + j3;
        this.f1701w = j3;
        f1679z.put(Long.valueOf(j3), this);
        try {
            assetManager = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assetManager = context.getAssets();
        }
        f O2 = f.O();
        if (flutterJNI == null) {
            ((G0.f) O2.f127g).getClass();
            flutterJNI = new FlutterJNI();
        }
        this.f1680a = flutterJNI;
        b bVar = new b(flutterJNI, assetManager, this.f1701w);
        this.f1682c = bVar;
        flutterJNI.setPlatformMessageHandler(bVar.f1762i);
        f.O().getClass();
        this.f1685f = new f(bVar, flutterJNI);
        new D0.g(bVar);
        this.f1686g = new C0129a(bVar);
        r rVar = new r(bVar, 22);
        this.f1687h = new F0.h(bVar, 20);
        this.f1688i = new m(bVar, 25);
        this.f1689j = new F0.h(bVar, 17);
        this.f1691l = new r(bVar, 23);
        r rVar2 = new r(bVar, context.getPackageManager());
        this.f1690k = new g(bVar, z4);
        this.f1692m = new F0.h(bVar, 25);
        this.f1693n = new F0.h(bVar, 26);
        this.f1694o = new j(bVar);
        this.f1695p = new F0.h(bVar, 27);
        this.f1696q = new b2.h(bVar);
        this.f1697r = new r(bVar, 26);
        d2.b bVar2 = new d2.b(context, rVar);
        this.f1684e = bVar2;
        W1.f fVar = (W1.f) O2.f128h;
        if (!flutterJNI.isAttached()) {
            fVar.d(context.getApplicationContext());
            fVar.a(context, strArr);
        }
        k kVar = new k();
        kVar.f3383f = lVar.f3396f;
        kVar.f3386i = flutterJNI;
        lVar.f3399i = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f1702x);
        flutterJNI.setPlatformViewsController(lVar);
        flutterJNI.setPlatformViewsController2(kVar);
        flutterJNI.setLocalizationPlugin(bVar2);
        O2.getClass();
        flutterJNI.setDeferredComponentManager((a) null);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f1681b = new h(flutterJNI);
        this.f1698s = lVar;
        this.f1699t = kVar;
        n nVar = new n(4);
        nVar.f2789g = lVar;
        nVar.f2790h = kVar;
        this.f1700u = nVar;
        e eVar = new e(context.getApplicationContext(), this);
        this.f1683d = eVar;
        bVar2.b(context.getResources().getConfiguration());
        if (z3 && fVar.f1915d.f1898a) {
            M0.a.L(this);
        }
        android.support.v4.media.session.a.f(context, this);
        eVar.a(new C0167a(rVar2));
    }
}
