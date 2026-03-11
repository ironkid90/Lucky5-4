package io.flutter.embedding.engine;

import A.I;
import S1.h;
import S1.n;
import S1.o;
import T1.b;
import T1.j;
import T1.k;
import T1.l;
import U1.f;
import V1.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceControl;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import c2.C0137e;
import c2.w;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.i;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.d;
import io.flutter.view.e;
import io.flutter.view.g;
import io.flutter.view.q;
import io.flutter.view.r;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@Keep
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static l asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private k accessibilityDelegate;
    private a deferredComponentManager;
    private final Set<b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<i> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private d2.b localizationPlugin;
    private final Looper mainLooper = Looper.getMainLooper();
    private Long nativeShellHolderId;
    private U1.k platformMessageHandler;
    private io.flutter.plugin.platform.l platformViewsController;
    private io.flutter.plugin.platform.k platformViewsController2;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();

    private static void asyncWaitForVsync(long j3) {
        l lVar = asyncWaitForVsyncDelegate;
        if (lVar != null) {
            io.flutter.view.a aVar = (io.flutter.view.a) lVar;
            aVar.getClass();
            Choreographer instance = Choreographer.getInstance();
            r rVar = (r) aVar.f3441a;
            q qVar = rVar.f3570c;
            if (qVar != null) {
                qVar.f3564a = j3;
                rVar.f3570c = null;
            } else {
                qVar = new q(rVar, j3);
            }
            instance.postFrameCallback(qVar);
            return;
        }
        throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
    }

    public static Bitmap decodeImage(ByteBuffer byteBuffer, long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new j(j3));
            } catch (IOException e2) {
                Log.e(TAG, "Failed to decode image", e2);
            }
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() != this.mainLooper) {
            throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
        }
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i3, ByteBuffer byteBuffer) {
        C0137e eVar;
        U1.k kVar = this.platformMessageHandler;
        if (kVar != null && (eVar = (C0137e) ((U1.j) kVar).f1789k.remove(Integer.valueOf(i3))) != null) {
            try {
                eVar.a(byteBuffer);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
            } catch (Exception e2) {
                Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e2);
            } catch (Error e3) {
                Thread currentThread = Thread.currentThread();
                if (currentThread.getUncaughtExceptionHandler() != null) {
                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e3);
                    return;
                }
                throw e3;
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$1(long j3, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        Size h3 = imageInfo.getSize();
        nativeImageHeaderCallback(j3, h3.getWidth(), h3.getHeight());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadLibrary$0(String str) {
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j3);

    private native void nativeDeferredComponentInstallFailure(int i3, String str, boolean z3);

    private native void nativeDestroy(long j3);

    private native void nativeDispatchEmptyPlatformMessage(long j3, String str, int i3);

    private native void nativeDispatchPlatformMessage(long j3, String str, ByteBuffer byteBuffer, int i3, int i4);

    private native void nativeDispatchPointerDataPacket(long j3, ByteBuffer byteBuffer, int i3);

    private native void nativeDispatchSemanticsAction(long j3, int i3, int i4, ByteBuffer byteBuffer, int i5);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i3);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i3);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i3);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i3);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i3);

    private native Bitmap nativeGetBitmap(long j3);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j3, int i3, int i4);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j3, int i3);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j3, int i3);

    private native void nativeInvokePlatformMessageResponseCallback(long j3, int i3, ByteBuffer byteBuffer, int i4);

    private native boolean nativeIsSurfaceControlEnabled(long j3);

    private native void nativeLoadDartDeferredLibrary(long j3, int i3, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j3);

    private native void nativeMarkTextureFrameAvailable(long j3, long j4);

    private native void nativeNotifyLowMemoryWarning(long j3);

    private native void nativeOnVsync(long j3, long j4, long j5);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j3, long j4, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z3);

    private native void nativeRegisterTexture(long j3, long j4, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j3, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j4);

    private native void nativeScheduleFrame(long j3);

    private native void nativeSetAccessibilityFeatures(long j3, int i3);

    private native void nativeSetSemanticsEnabled(long j3, boolean z3);

    private native void nativeSetViewportMetrics(long j3, float f3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j3, String str, String str2, String str3, List<String> list, long j4);

    private native void nativeSurfaceChanged(long j3, int i3, int i4);

    private native void nativeSurfaceCreated(long j3, Surface surface);

    private native void nativeSurfaceDestroyed(long j3);

    private native void nativeSurfaceWindowChanged(long j3, Surface surface);

    private native void nativeUnregisterTexture(long j3, long j4);

    private native void nativeUpdateDisplayMetrics(long j3);

    private native void nativeUpdateJavaAssetManager(long j3, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f3);

    private void onPreEngineRestart() {
        for (b a2 : this.engineLifecycleListeners) {
            a2.a();
        }
    }

    private void setApplicationLocale(String str) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            ((g) ((io.flutter.view.a) kVar).f3441a).f3538l = str;
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            g gVar = (g) ((io.flutter.view.a) kVar).f3441a;
            gVar.getClass();
            while (byteBuffer.hasRemaining()) {
                e a2 = gVar.a(byteBuffer.getInt());
                a2.f3472c = byteBuffer.getInt();
                a2.f3473d = g.c(byteBuffer, strArr);
                a2.f3474e = g.c(byteBuffer, strArr);
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            ((io.flutter.view.a) kVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(i iVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(iVar);
    }

    @SuppressLint({"NewApi"})
    public void applyTransactions() {
        io.flutter.plugin.platform.k kVar = this.platformViewsController2;
        if (kVar != null) {
            kVar.getClass();
            SurfaceControl.Transaction g2 = I.g();
            int i3 = 0;
            while (true) {
                ArrayList arrayList = kVar.f3391n;
                if (i3 < arrayList.size()) {
                    g2 = g2.merge(I.i(arrayList.get(i3)));
                    i3++;
                } else {
                    g2.apply();
                    arrayList.clear();
                    return;
                }
            }
        } else {
            throw new RuntimeException("");
        }
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j3) {
        nativeCleanupMessageData(j3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0132, code lost:
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0134, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013c, code lost:
        if (r4.hasNext() == false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013e, code lost:
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0150, code lost:
        if (r3.getLanguage().equals(r5.toLanguageTag()) == false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0153, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015b, code lost:
        if (r4.hasNext() == false) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015d, code lost:
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x016f, code lost:
        if (r3.getLanguage().equals(r5.getLanguage()) == false) goto L_0x0157;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String[] computePlatformResolvedLocale(java.lang.String[] r10) {
        /*
            r9 = this;
            d2.b r0 = r9.localizationPlugin
            r1 = 0
            if (r0 != 0) goto L_0x0008
            java.lang.String[] r10 = new java.lang.String[r1]
            return r10
        L_0x0008:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = r1
        L_0x000e:
            int r3 = r10.length
            if (r2 >= r3) goto L_0x0045
            r3 = r10[r2]
            int r4 = r2 + 1
            r4 = r10[r4]
            int r5 = r2 + 2
            r5 = r10[r5]
            java.util.Locale$Builder r6 = new java.util.Locale$Builder
            r6.<init>()
            boolean r7 = r3.isEmpty()
            if (r7 != 0) goto L_0x0029
            r6.setLanguage(r3)
        L_0x0029:
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x0032
            r6.setRegion(r4)
        L_0x0032:
            boolean r3 = r5.isEmpty()
            if (r3 != 0) goto L_0x003b
            r6.setScript(r5)
        L_0x003b:
            java.util.Locale r3 = r6.build()
            r0.add(r3)
            int r2 = r2 + 3
            goto L_0x000e
        L_0x0045:
            d2.b r10 = r9.localizationPlugin
            r10.getClass()
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0053
            r10 = 0
            goto L_0x017b
        L_0x0053:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            android.content.Context r10 = r10.f2914b
            if (r2 < r3) goto L_0x0105
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.res.Resources r10 = r10.getResources()
            android.content.res.Configuration r10 = r10.getConfiguration()
            android.os.LocaleList r10 = r10.getLocales()
            int r3 = r10.size()
            r4 = r1
        L_0x0071:
            if (r4 >= r3) goto L_0x00f5
            java.util.Locale r5 = r10.get(r4)
            java.lang.String r6 = r5.getLanguage()
            java.lang.String r7 = r5.getScript()
            boolean r7 = r7.isEmpty()
            java.lang.String r8 = "-"
            if (r7 != 0) goto L_0x009d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r8)
            java.lang.String r6 = r5.getScript()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
        L_0x009d:
            java.lang.String r7 = r5.getCountry()
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x00bd
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r8)
            java.lang.String r6 = r5.getCountry()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
        L_0x00bd:
            java.util.Locale$LanguageRange r6 = com.dexterous.flutterlocalnotifications.a.l(r6)
            r2.add(r6)
            com.dexterous.flutterlocalnotifications.a.C()
            java.lang.String r6 = r5.getLanguage()
            java.util.Locale$LanguageRange r6 = com.dexterous.flutterlocalnotifications.a.l(r6)
            r2.add(r6)
            com.dexterous.flutterlocalnotifications.a.C()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getLanguage()
            r6.append(r5)
            java.lang.String r5 = "-*"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.util.Locale$LanguageRange r5 = com.dexterous.flutterlocalnotifications.a.l(r5)
            r2.add(r5)
            int r4 = r4 + 1
            goto L_0x0071
        L_0x00f5:
            java.util.Locale r10 = java.util.Locale.lookup(r2, r0)
            if (r10 == 0) goto L_0x00fd
            goto L_0x017b
        L_0x00fd:
            java.lang.Object r10 = r0.get(r1)
            java.util.Locale r10 = (java.util.Locale) r10
            goto L_0x017b
        L_0x0105:
            android.content.res.Resources r10 = r10.getResources()
            android.content.res.Configuration r10 = r10.getConfiguration()
            android.os.LocaleList r10 = r10.getLocales()
            r2 = r1
        L_0x0112:
            int r3 = r10.size()
            if (r2 >= r3) goto L_0x0175
            java.util.Locale r3 = r10.get(r2)
            java.util.Iterator r4 = r0.iterator()
        L_0x0120:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0134
            java.lang.Object r5 = r4.next()
            java.util.Locale r5 = (java.util.Locale) r5
            boolean r6 = r3.equals(r5)
            if (r6 == 0) goto L_0x0120
        L_0x0132:
            r10 = r5
            goto L_0x017b
        L_0x0134:
            java.util.Iterator r4 = r0.iterator()
        L_0x0138:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0153
            java.lang.Object r5 = r4.next()
            java.util.Locale r5 = (java.util.Locale) r5
            java.lang.String r6 = r3.getLanguage()
            java.lang.String r7 = r5.toLanguageTag()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0138
            goto L_0x0132
        L_0x0153:
            java.util.Iterator r4 = r0.iterator()
        L_0x0157:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0172
            java.lang.Object r5 = r4.next()
            java.util.Locale r5 = (java.util.Locale) r5
            java.lang.String r6 = r3.getLanguage()
            java.lang.String r7 = r5.getLanguage()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0157
            goto L_0x0132
        L_0x0172:
            int r2 = r2 + 1
            goto L_0x0112
        L_0x0175:
            java.lang.Object r10 = r0.get(r1)
            java.util.Locale r10 = (java.util.Locale) r10
        L_0x017b:
            if (r10 != 0) goto L_0x0180
            java.lang.String[] r10 = new java.lang.String[r1]
            return r10
        L_0x0180:
            java.lang.String r0 = r10.getLanguage()
            java.lang.String r1 = r10.getCountry()
            java.lang.String r10 = r10.getScript()
            java.lang.String[] r10 = new java.lang.String[]{r0, r1, r10}
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.computePlatformResolvedLocale(java.lang.String[]):java.lang.String[]");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, S1.h, io.flutter.plugin.platform.b] */
    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.l lVar = this.platformViewsController;
        if (lVar != null) {
            ? hVar = new h(lVar.f3398h.getContext(), lVar.f3398h.getWidth(), lVar.f3398h.getHeight(), 2);
            hVar.f3373l = lVar.f3403m;
            int i3 = lVar.f3410t;
            lVar.f3410t = i3 + 1;
            lVar.f3408r.put(i3, hVar);
            return new FlutterOverlaySurface(i3, hVar.getSurface());
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    @SuppressLint({"NewApi"})
    public FlutterOverlaySurface createOverlaySurface2() {
        io.flutter.plugin.platform.k kVar = this.platformViewsController2;
        if (kVar != null) {
            if (kVar.f3393p == null) {
                SurfaceControl.Builder f3 = I.f();
                f3.setBufferSize(kVar.f3385h.getWidth(), kVar.f3385h.getHeight());
                f3.setFormat(1);
                f3.setName("Flutter Overlay Surface");
                f3.setOpaque(false);
                f3.setHidden(false);
                SurfaceControl d3 = f3.build();
                SurfaceControl.Transaction d4 = kVar.f3385h.getRootSurfaceControl().buildReparentTransaction(d3);
                d4.setLayer(d3, 1000);
                d4.apply();
                kVar.f3393p = I.e(d3);
                kVar.f3394q = d3;
            }
            return new FlutterOverlaySurface(0, kVar.f3393p);
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    @SuppressLint({"NewApi"})
    public SurfaceControl.Transaction createTransaction() {
        io.flutter.plugin.platform.k kVar = this.platformViewsController2;
        if (kVar != null) {
            kVar.getClass();
            SurfaceControl.Transaction g2 = I.g();
            kVar.f3391n.add(g2);
            return g2;
        }
        throw new RuntimeException("");
    }

    public void deferredComponentInstallFailure(int i3, String str, boolean z3) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i3, str, z3);
    }

    @SuppressLint({"NewApi"})
    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController2;
        if (kVar != null) {
            Surface surface = kVar.f3393p;
            if (surface != null) {
                surface.release();
                kVar.f3393p = null;
                kVar.f3394q = null;
                return;
            }
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.l lVar = this.platformViewsController;
        if (lVar != null) {
            lVar.f();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i3);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i3);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i3, int i4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i3, i4);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i4);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i3);
    }

    public void dispatchSemanticsAction(int i3, d dVar) {
        dispatchSemanticsAction(i3, dVar, (Object) null);
    }

    @SuppressLint({"NewApi"})
    public void endFrame2() {
        io.flutter.plugin.platform.k kVar = this.platformViewsController2;
        if (kVar != null) {
            SurfaceControl.Transaction g2 = I.g();
            int i3 = 0;
            while (true) {
                ArrayList arrayList = kVar.f3392o;
                if (i3 < arrayList.size()) {
                    g2 = g2.merge(I.i(arrayList.get(i3)));
                    i3++;
                } else {
                    arrayList.clear();
                    kVar.f3385h.invalidate();
                    kVar.f3385h.getRootSurfaceControl().applyTransactionOnDraw(g2);
                    return;
                }
            }
        } else {
            throw new RuntimeException("");
        }
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float getScaledFontSize(float r7, int r8) {
        /*
            r6 = this;
            C0.f r0 = b2.j.f2747b
            java.lang.Object r1 = r0.f127g
            b2.i r1 = (b2.i) r1
            java.lang.Object r2 = r0.f128h
            java.util.concurrent.ConcurrentLinkedQueue r2 = (java.util.concurrent.ConcurrentLinkedQueue) r2
            if (r1 != 0) goto L_0x0014
            java.lang.Object r1 = r2.poll()
            b2.i r1 = (b2.i) r1
            r0.f127g = r1
        L_0x0014:
            java.lang.Object r1 = r0.f127g
            b2.i r1 = (b2.i) r1
            if (r1 == 0) goto L_0x0027
            int r3 = r1.f2745a
            if (r3 >= r8) goto L_0x0027
            java.lang.Object r1 = r2.poll()
            b2.i r1 = (b2.i) r1
            r0.f127g = r1
            goto L_0x0014
        L_0x0027:
            r2 = 0
            java.lang.String r3 = "Cannot find config with generation: "
            java.lang.String r4 = "SettingsChannel"
            if (r1 != 0) goto L_0x0048
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            r0.append(r1)
            java.lang.String r1 = ", after exhausting the queue."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r4, r0)
        L_0x0046:
            r1 = r2
            goto L_0x0072
        L_0x0048:
            int r5 = r1.f2745a
            if (r5 == r8) goto L_0x0072
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r3 = java.lang.String.valueOf(r8)
            r1.append(r3)
            java.lang.String r3 = ", the oldest config is now: "
            r1.append(r3)
            java.lang.Object r0 = r0.f127g
            b2.i r0 = (b2.i) r0
            int r0 = r0.f2745a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r4, r0)
            goto L_0x0046
        L_0x0072:
            if (r1 != 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            android.util.DisplayMetrics r2 = r1.f2746b
        L_0x0077:
            if (r2 != 0) goto L_0x0098
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "getScaledFontSize called with configurationId "
            r7.<init>(r0)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.append(r8)
            java.lang.String r8 = ", which can't be found."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FlutterJNI"
            android.util.Log.e(r8, r7)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r7
        L_0x0098:
            r8 = 2
            float r7 = android.util.TypedValue.applyDimension(r8, r7, r2)
            float r8 = r2.density
            float r7 = r7 / r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.getScaledFontSize(float, int):float");
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i3, long j3) {
        f fVar;
        boolean z3;
        U1.k kVar = this.platformMessageHandler;
        if (kVar != null) {
            U1.j jVar = (U1.j) kVar;
            synchronized (jVar.f1787i) {
                try {
                    fVar = (f) jVar.f1785g.get(str);
                    if (!jVar.f1788j.get() || fVar != null) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        if (!jVar.f1786h.containsKey(str)) {
                            jVar.f1786h.put(str, new LinkedList());
                        }
                        ((List) jVar.f1786h.get(str)).add(new U1.d(j3, byteBuffer, i3));
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (!z3) {
                jVar.a(str, fVar, byteBuffer, i3, j3);
                return;
            }
            return;
        }
        nativeCleanupMessageData(j3);
    }

    @SuppressLint({"NewApi"})
    public void hideOverlaySurface2() {
        io.flutter.plugin.platform.k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        } else if (kVar.f3394q != null) {
            SurfaceControl.Transaction g2 = I.g();
            g2.setVisibility(kVar.f3394q, false);
            g2.apply();
        }
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j3, int i3) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j3, i3);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i3) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i3);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i3);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    public void invokePlatformMessageResponseCallback(int i3, ByteBuffer byteBuffer, int i4) {
        if (byteBuffer.isDirect()) {
            this.shellHolderLock.readLock().lock();
            try {
                if (isAttached()) {
                    nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i3, byteBuffer, i4);
                } else {
                    Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i3);
                }
            } finally {
                this.shellHolderLock.readLock().unlock();
            }
        } else {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
    }

    public boolean isAttached() {
        if (this.nativeShellHolderId != null) {
            return true;
        }
        return false;
    }

    public boolean isCodePointEmoji(int i3) {
        return nativeFlutterTextUtilsIsEmoji(i3);
    }

    public boolean isCodePointEmojiModifier(int i3) {
        return nativeFlutterTextUtilsIsEmojiModifier(i3);
    }

    public boolean isCodePointEmojiModifierBase(int i3) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i3);
    }

    public boolean isCodePointRegionalIndicator(int i3) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i3);
    }

    public boolean isCodePointVariantSelector(int i3) {
        return nativeFlutterTextUtilsIsVariationSelector(i3);
    }

    public void loadDartDeferredLibrary(int i3, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i3, strArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x018c, code lost:
        if (r12 != null) goto L_0x014a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01c5 A[SYNTHETIC, Splitter:B:111:0x01c5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadLibrary(android.content.Context r19) {
        /*
            r18 = this;
            r1 = r19
            boolean r0 = loadLibraryCalled
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = "FlutterJNI"
            java.lang.String r2 = "FlutterJNI.loadLibrary called more than once"
            android.util.Log.w(r0, r2)
        L_0x000d:
            A.c r0 = new A.c
            r2 = 0
            r0.<init>((int) r2)
            s1.y r2 = new s1.y
            r3 = 7
            r2.<init>(r3)
            r2.f4625i = r0
            if (r1 == 0) goto L_0x01cf
            java.lang.String r0 = "Beginning load of %s..."
            java.lang.String r3 = "flutter"
            java.lang.Object[] r4 = new java.lang.Object[]{r3}
            r2.i(r0, r4)
            java.lang.Object r0 = r2.f4623g
            r4 = r0
            G0.f r4 = (G0.f) r4
            java.lang.Object r0 = r2.f4622f
            r5 = r0
            java.util.HashSet r5 = (java.util.HashSet) r5
            boolean r0 = r5.contains(r3)
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "%s already loaded previously!"
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            r2.i(r0, r1)
        L_0x0041:
            r1 = 1
            goto L_0x01a8
        L_0x0044:
            r7 = 0
            r4.getClass()     // Catch:{ UnsatisfiedLinkError -> 0x0058 }
            java.lang.System.loadLibrary(r3)     // Catch:{ UnsatisfiedLinkError -> 0x0058 }
            r5.add(r3)     // Catch:{ UnsatisfiedLinkError -> 0x0058 }
            java.lang.String r0 = "%s (%s) was loaded normally!"
            java.lang.Object[] r8 = new java.lang.Object[]{r3, r7}     // Catch:{ UnsatisfiedLinkError -> 0x0058 }
            r2.i(r0, r8)     // Catch:{ UnsatisfiedLinkError -> 0x0058 }
            goto L_0x0041
        L_0x0058:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r8 = "Loading the library normally failed: %s"
            r2.i(r8, r0)
            java.lang.String r0 = "%s (%s) was not loaded normally, re-linking..."
            java.lang.Object[] r8 = new java.lang.Object[]{r3, r7}
            r2.i(r0, r8)
            java.io.File r0 = r2.f(r1)
            boolean r8 = r0.exists()
            if (r8 == 0) goto L_0x007b
            goto L_0x018f
        L_0x007b:
            java.lang.String r8 = "lib"
            r9 = 0
            java.io.File r8 = r1.getDir(r8, r9)
            java.io.File r10 = r2.f(r1)
            r4.getClass()
            java.lang.String r11 = java.lang.System.mapLibraryName(r3)
            n0.a r12 = new n0.a
            r12.<init>(r11)
            java.io.File[] r8 = r8.listFiles(r12)
            if (r8 != 0) goto L_0x0099
            goto L_0x00b3
        L_0x0099:
            int r11 = r8.length
            r12 = r9
        L_0x009b:
            if (r12 >= r11) goto L_0x00b3
            r13 = r8[r12]
            java.lang.String r14 = r13.getAbsolutePath()
            java.lang.String r15 = r10.getAbsolutePath()
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x00b0
            r13.delete()
        L_0x00b0:
            int r12 = r12 + 1
            goto L_0x009b
        L_0x00b3:
            java.lang.String[] r8 = android.os.Build.SUPPORTED_ABIS
            int r10 = r8.length
            if (r10 <= 0) goto L_0x00b9
            goto L_0x00d1
        L_0x00b9:
            java.lang.String r8 = android.os.Build.CPU_ABI2
            if (r8 == 0) goto L_0x00cb
            int r10 = r8.length()
            if (r10 != 0) goto L_0x00c4
            goto L_0x00cb
        L_0x00c4:
            java.lang.String r10 = android.os.Build.CPU_ABI
            java.lang.String[] r8 = new java.lang.String[]{r10, r8}
            goto L_0x00d1
        L_0x00cb:
            java.lang.String r8 = android.os.Build.CPU_ABI
            java.lang.String[] r8 = new java.lang.String[]{r8}
        L_0x00d1:
            java.lang.String r10 = java.lang.System.mapLibraryName(r3)
            java.lang.Object r11 = r2.f4624h
            D0.g r11 = (D0.g) r11
            r11.getClass()
            c2.n r11 = D0.g.h(r1, r8, r10, r2)     // Catch:{ all -> 0x01c0 }
            if (r11 == 0) goto L_0x01ab
            r1 = r9
        L_0x00e3:
            int r8 = r1 + 1
            java.lang.Object r12 = r11.f2789g
            java.util.zip.ZipFile r12 = (java.util.zip.ZipFile) r12
            r13 = 5
            if (r1 >= r13) goto L_0x0181
            java.lang.String r1 = "Found %s! Extracting..."
            java.lang.Object[] r13 = new java.lang.Object[]{r10}     // Catch:{ all -> 0x0103 }
            r2.i(r1, r13)     // Catch:{ all -> 0x0103 }
            boolean r1 = r0.exists()     // Catch:{ IOException -> 0x017d }
            if (r1 != 0) goto L_0x0107
            boolean r1 = r0.createNewFile()     // Catch:{ IOException -> 0x017d }
            if (r1 != 0) goto L_0x0107
            goto L_0x017d
        L_0x0103:
            r0 = move-exception
            r7 = r11
            goto L_0x01c3
        L_0x0107:
            java.lang.Object r1 = r11.f2790h     // Catch:{ FileNotFoundException -> 0x0167, IOException -> 0x0165, all -> 0x0162 }
            java.util.zip.ZipEntry r1 = (java.util.zip.ZipEntry) r1     // Catch:{ FileNotFoundException -> 0x0167, IOException -> 0x0165, all -> 0x0162 }
            java.io.InputStream r1 = r12.getInputStream(r1)     // Catch:{ FileNotFoundException -> 0x0167, IOException -> 0x0165, all -> 0x0162 }
            java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0160, IOException -> 0x015e, all -> 0x0159 }
            r13.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0160, IOException -> 0x015e, all -> 0x0159 }
            r14 = 4096(0x1000, float:5.74E-42)
            byte[] r14 = new byte[r14]     // Catch:{ FileNotFoundException -> 0x0177, IOException -> 0x0170, all -> 0x014e }
            r15 = 0
        L_0x011a:
            int r7 = r1.read(r14)     // Catch:{ FileNotFoundException -> 0x0177, IOException -> 0x0170, all -> 0x014e }
            r6 = -1
            if (r7 != r6) goto L_0x0153
            r13.flush()     // Catch:{ FileNotFoundException -> 0x0177, IOException -> 0x0170, all -> 0x014e }
            java.io.FileDescriptor r6 = r13.getFD()     // Catch:{ FileNotFoundException -> 0x0177, IOException -> 0x0170, all -> 0x014e }
            r6.sync()     // Catch:{ FileNotFoundException -> 0x0177, IOException -> 0x0170, all -> 0x014e }
            long r6 = r0.length()     // Catch:{ FileNotFoundException -> 0x0177, IOException -> 0x0170, all -> 0x014e }
            int r6 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x013a
            D0.g.f(r1)     // Catch:{ all -> 0x0103 }
            D0.g.f(r13)     // Catch:{ all -> 0x0103 }
            goto L_0x017d
        L_0x013a:
            D0.g.f(r1)     // Catch:{ all -> 0x0103 }
            D0.g.f(r13)     // Catch:{ all -> 0x0103 }
            r1 = 1
            r0.setReadable(r1, r9)     // Catch:{ all -> 0x0103 }
            r0.setExecutable(r1, r9)     // Catch:{ all -> 0x0103 }
            r0.setWritable(r1)     // Catch:{ all -> 0x0103 }
        L_0x014a:
            r12.close()     // Catch:{ IOException -> 0x018f }
            goto L_0x018f
        L_0x014e:
            r0 = move-exception
            r7 = r1
            r17 = r13
            goto L_0x0169
        L_0x0153:
            r13.write(r14, r9, r7)     // Catch:{ FileNotFoundException -> 0x0177, IOException -> 0x0170, all -> 0x014e }
            long r6 = (long) r7
            long r15 = r15 + r6
            goto L_0x011a
        L_0x0159:
            r0 = move-exception
            r7 = r1
        L_0x015b:
            r17 = 0
            goto L_0x0169
        L_0x015e:
            r13 = 0
            goto L_0x0170
        L_0x0160:
            r13 = 0
            goto L_0x0177
        L_0x0162:
            r0 = move-exception
            r7 = 0
            goto L_0x015b
        L_0x0165:
            r1 = 0
            goto L_0x015e
        L_0x0167:
            r1 = 0
            goto L_0x0160
        L_0x0169:
            D0.g.f(r7)     // Catch:{ all -> 0x0103 }
            D0.g.f(r17)     // Catch:{ all -> 0x0103 }
            throw r0     // Catch:{ all -> 0x0103 }
        L_0x0170:
            D0.g.f(r1)     // Catch:{ all -> 0x0103 }
            D0.g.f(r13)     // Catch:{ all -> 0x0103 }
            goto L_0x017d
        L_0x0177:
            D0.g.f(r1)     // Catch:{ all -> 0x0103 }
            D0.g.f(r13)     // Catch:{ all -> 0x0103 }
        L_0x017d:
            r1 = r8
            r7 = 0
            goto L_0x00e3
        L_0x0181:
            java.lang.String r1 = "FATAL! Couldn't extract the library from the APK!"
            java.lang.Object r6 = r2.f4625i     // Catch:{ all -> 0x0103 }
            A.c r6 = (A.C0002c) r6     // Catch:{ all -> 0x0103 }
            if (r6 == 0) goto L_0x018c
            lambda$loadLibrary$0(r1)     // Catch:{ all -> 0x0103 }
        L_0x018c:
            if (r12 == 0) goto L_0x018f
            goto L_0x014a
        L_0x018f:
            java.lang.String r0 = r0.getAbsolutePath()
            r4.getClass()
            java.lang.System.load(r0)
            r5.add(r3)
            java.lang.String r0 = "%s (%s) was re-linked!"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1}
            r2.i(r0, r1)
            goto L_0x0041
        L_0x01a8:
            loadLibraryCalled = r1
            return
        L_0x01ab:
            java.lang.String[] r0 = D0.g.i(r1, r10)     // Catch:{ Exception -> 0x01b0 }
            goto L_0x01ba
        L_0x01b0:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0103 }
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0103 }
        L_0x01ba:
            H0.b r1 = new H0.b     // Catch:{ all -> 0x0103 }
            r1.<init>(r10, r8, r0)     // Catch:{ all -> 0x0103 }
            throw r1     // Catch:{ all -> 0x0103 }
        L_0x01c0:
            r0 = move-exception
            r1 = r7
            r7 = r1
        L_0x01c3:
            if (r7 == 0) goto L_0x01ce
            java.lang.Object r1 = r7.f2789g     // Catch:{ IOException -> 0x01ce }
            java.util.zip.ZipFile r1 = (java.util.zip.ZipFile) r1     // Catch:{ IOException -> 0x01ce }
            if (r1 == 0) goto L_0x01ce
            r1.close()     // Catch:{ IOException -> 0x01ce }
        L_0x01ce:
            throw r0
        L_0x01cf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Given context is null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.loadLibrary(android.content.Context):void");
    }

    public void markTextureFrameAvailable(long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j3);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.l lVar = this.platformViewsController;
        if (lVar != null) {
            lVar.f3412w.clear();
            lVar.f3413x.clear();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
    }

    public void onDisplayOverlaySurface(int i3, int i4, int i5, int i6, int i7) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.l lVar = this.platformViewsController;
        if (lVar != null) {
            SparseArray sparseArray = lVar.f3408r;
            if (sparseArray.get(i3) != null) {
                lVar.h();
                io.flutter.plugin.platform.b bVar = (io.flutter.plugin.platform.b) sparseArray.get(i3);
                if (bVar.getParent() == null) {
                    lVar.f3398h.addView(bVar);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
                layoutParams.leftMargin = i4;
                layoutParams.topMargin = i5;
                bVar.setLayoutParams(layoutParams);
                bVar.setVisibility(0);
                bVar.bringToFront();
                lVar.f3412w.add(Integer.valueOf(i3));
                return;
            }
            throw new IllegalStateException("The overlay surface (id:" + i3 + ") doesn't exist");
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void onDisplayPlatformView(int i3, int i4, int i5, int i6, int i7, int i8, int i9, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.l lVar = this.platformViewsController;
        if (lVar != null) {
            lVar.h();
            A2.h.j(lVar.f3406p.get(i3));
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }

    @SuppressLint({"NewApi"})
    public void onDisplayPlatformView2(int i3, int i4, int i5, int i6, int i7, int i8, int i9, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.k kVar = this.platformViewsController2;
        if (kVar != null) {
            A2.h.j(kVar.f3389l.get(i3));
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.j] */
    public void onEndFrame() {
        boolean z3;
        ? r3;
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.l lVar = this.platformViewsController;
        if (lVar != null) {
            boolean z4 = false;
            if (!lVar.f3411u || !lVar.f3413x.isEmpty()) {
                if (lVar.f3411u) {
                    h hVar = lVar.f3398h.f1487h;
                    if (hVar != null) {
                        z3 = hVar.e();
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        z4 = true;
                    }
                }
                lVar.g(z4);
                return;
            }
            lVar.f3411u = false;
            o oVar = lVar.f3398h;
            L1.d dVar = new L1.d(5, (Object) lVar);
            h hVar2 = oVar.f1487h;
            if (hVar2 != null && (r3 = oVar.f1489j) != 0) {
                oVar.f1488i = r3;
                oVar.f1489j = null;
                io.flutter.embedding.engine.renderer.h hVar3 = oVar.f1492m.f1681b;
                if (hVar3 == null) {
                    hVar2.c();
                    h hVar4 = oVar.f1487h;
                    if (hVar4 != null) {
                        hVar4.f1461f.close();
                        oVar.removeView(oVar.f1487h);
                        oVar.f1487h = null;
                    }
                    dVar.run();
                    return;
                }
                r3.d();
                hVar3.a(new n(oVar, hVar3, dVar));
                return;
            }
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        for (i b3 : this.flutterUiDisplayListeners) {
            b3.b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        for (i a2 : this.flutterUiDisplayListeners) {
            a2.a();
        }
    }

    public void onSurfaceChanged(int i3, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i3, i4);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j3, long j4, long j5) {
        nativeOnVsync(j3, j4, j5);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j3, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j3, new WeakReference(textureRegistry$ImageConsumer), z3);
    }

    public void registerTexture(long j3, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j3, new WeakReference(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(i iVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(iVar);
    }

    public void requestDartDeferredLibrary(int i3) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j3);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(k kVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = kVar;
    }

    public void setAccessibilityFeatures(int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i3);
        }
    }

    public void setAccessibilityFeaturesInNative(int i3) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i3);
    }

    public void setAsyncWaitForVsyncDelegate(l lVar) {
        asyncWaitForVsyncDelegate = lVar;
    }

    public void setDeferredComponentManager(a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setLocalizationPlugin(d2.b bVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = bVar;
    }

    public void setPlatformMessageHandler(U1.k kVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = kVar;
    }

    public void setPlatformViewsController(io.flutter.plugin.platform.l lVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = lVar;
    }

    public void setPlatformViewsController2(io.flutter.plugin.platform.k kVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = kVar;
    }

    public void setRefreshRateFPS(float f3) {
        refreshRateFPS = f3;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z3);
        }
    }

    public void setSemanticsEnabledInNative(boolean z3) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z3);
    }

    public void setViewportMetrics(float f3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f3, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, iArr, iArr2, iArr3);
    }

    @SuppressLint({"NewApi"})
    public void showOverlaySurface2() {
        io.flutter.plugin.platform.k kVar = this.platformViewsController2;
        if (kVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        } else if (kVar.f3394q != null) {
            SurfaceControl.Transaction g2 = I.g();
            g2.setVisibility(kVar.f3394q, true);
            g2.apply();
        }
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j3) {
        boolean z3;
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j3);
        Long l3 = nativeSpawn.nativeShellHolderId;
        if (l3 == null || l3.longValue() == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            return nativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    @SuppressLint({"NewApi"})
    public void swapTransactions() {
        io.flutter.plugin.platform.k kVar = this.platformViewsController2;
        if (kVar != null) {
            synchronized (kVar) {
                try {
                    kVar.f3392o.clear();
                    for (int i3 = 0; i3 < kVar.f3391n.size(); i3++) {
                        kVar.f3392o.add(I.i(kVar.f3391n.get(i3)));
                    }
                    kVar.f3391n.clear();
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return;
        }
        throw new RuntimeException("");
    }

    public void unregisterTexture(long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j3);
    }

    public void updateDisplayMetrics(int i3, float f3, float f4, float f5) {
        displayWidth = f3;
        displayHeight = f4;
        displayDensity = f5;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i3, d dVar, Object obj) {
        ByteBuffer byteBuffer;
        int i4;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = w.f2795a.b(obj);
            i4 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i4 = 0;
        }
        dispatchSemanticsAction(i3, dVar.f3469f, byteBuffer, i4);
    }

    public void dispatchSemanticsAction(int i3, int i4, ByteBuffer byteBuffer, int i5) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i3, i4, byteBuffer, i5);
    }
}
