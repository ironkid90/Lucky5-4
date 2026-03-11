package f0;

import R.d;
import S1.m;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import e0.C0154a;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p2.C0368h;

/* renamed from: f0.d  reason: case insensitive filesystem */
public final class C0163d implements C0154a {

    /* renamed from: a  reason: collision with root package name */
    public final WindowLayoutComponent f2948a;

    /* renamed from: b  reason: collision with root package name */
    public final ReentrantLock f2949b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f2950c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f2951d = new LinkedHashMap();

    public C0163d(WindowLayoutComponent windowLayoutComponent) {
        this.f2948a = windowLayoutComponent;
    }

    public final void a(m mVar) {
        ReentrantLock reentrantLock = this.f2949b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f2951d;
        try {
            Context context = (Context) linkedHashMap.get(mVar);
            if (context != null) {
                LinkedHashMap linkedHashMap2 = this.f2950c;
                C0165f fVar = (C0165f) linkedHashMap2.get(context);
                if (fVar == null) {
                    reentrantLock.unlock();
                    return;
                }
                fVar.d(mVar);
                linkedHashMap.remove(mVar);
                if (fVar.c()) {
                    linkedHashMap2.remove(context);
                    this.f2948a.removeWindowLayoutInfoListener(fVar);
                }
                reentrantLock.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(Context context, d dVar, m mVar) {
        C0368h hVar;
        ReentrantLock reentrantLock = this.f2949b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f2950c;
        try {
            C0165f fVar = (C0165f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f2951d;
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
                this.f2948a.addWindowLayoutInfoListener(context, fVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
