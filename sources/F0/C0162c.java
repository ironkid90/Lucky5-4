package f0;

import A2.r;
import F0.h;
import S1.m;
import a0.d;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import e0.C0154a;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p2.C0368h;
import q2.l;

/* renamed from: f0.c  reason: case insensitive filesystem */
public final class C0162c implements C0154a {

    /* renamed from: a  reason: collision with root package name */
    public final WindowLayoutComponent f2942a;

    /* renamed from: b  reason: collision with root package name */
    public final h f2943b;

    /* renamed from: c  reason: collision with root package name */
    public final ReentrantLock f2944c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f2945d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f2946e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f2947f = new LinkedHashMap();

    public C0162c(WindowLayoutComponent windowLayoutComponent, h hVar) {
        this.f2942a = windowLayoutComponent;
        this.f2943b = hVar;
    }

    public final void a(m mVar) {
        ReentrantLock reentrantLock = this.f2944c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f2946e;
        try {
            Context context = (Context) linkedHashMap.get(mVar);
            if (context != null) {
                LinkedHashMap linkedHashMap2 = this.f2945d;
                C0165f fVar = (C0165f) linkedHashMap2.get(context);
                if (fVar == null) {
                    reentrantLock.unlock();
                    return;
                }
                fVar.d(mVar);
                linkedHashMap.remove(mVar);
                if (fVar.f2955d.isEmpty()) {
                    linkedHashMap2.remove(context);
                    d dVar = (d) this.f2947f.remove(fVar);
                    if (dVar != null) {
                        dVar.f1980a.invoke(dVar.f1981b, new Object[]{dVar.f1982c});
                    }
                }
                reentrantLock.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(Context context, R.d dVar, m mVar) {
        C0368h hVar;
        ReentrantLock reentrantLock = this.f2944c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f2945d;
        try {
            C0165f fVar = (C0165f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f2946e;
            if (fVar != null) {
                fVar.b(mVar);
                linkedHashMap2.put(mVar, context);
                hVar = C0368h.f4194a;
            } else {
                hVar = null;
            }
            if (hVar == null) {
                C0165f fVar2 = new C0165f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(mVar, context);
                fVar2.b(mVar);
                if (context instanceof Activity) {
                    this.f2947f.put(fVar2, this.f2943b.v(this.f2942a, r.a(WindowLayoutInfo.class), (Activity) context, new C0161b(fVar2)));
                } else {
                    fVar2.accept(new WindowLayoutInfo(l.f4396f));
                    reentrantLock.unlock();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
