package U1;

import W.a;
import a.C0094a;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import m2.C0332a;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f1765f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f1766g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f1767h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ f f1768i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f1769j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ long f1770k;

    public /* synthetic */ c(j jVar, String str, int i3, f fVar, ByteBuffer byteBuffer, long j3) {
        this.f1765f = jVar;
        this.f1766g = str;
        this.f1767h = i3;
        this.f1768i = fVar;
        this.f1769j = byteBuffer;
        this.f1770k = j3;
    }

    public final void run() {
        long j3 = this.f1770k;
        FlutterJNI flutterJNI = this.f1765f.f1784f;
        StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
        String str = this.f1766g;
        sb.append(str);
        String a2 = C0332a.a(sb.toString());
        int i3 = Build.VERSION.SDK_INT;
        int i4 = this.f1767h;
        if (i3 >= 29) {
            a.b(C0094a.N(a2), i4);
        } else {
            String N3 = C0094a.N(a2);
            try {
                if (C0094a.f1970j == null) {
                    C0094a.f1970j = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                }
                C0094a.f1970j.invoke((Object) null, new Object[]{Long.valueOf(C0094a.f1967g), N3, Integer.valueOf(i4)});
            } catch (Exception e2) {
                C0094a.D("asyncTraceEnd", e2);
            }
        }
        try {
            C0332a.b("DartMessenger#handleMessageFromDart on " + str);
            f fVar = this.f1768i;
            ByteBuffer byteBuffer = this.f1769j;
            if (fVar != null) {
                try {
                    fVar.f1774a.h(byteBuffer, new g(flutterJNI, i4));
                } catch (Exception e3) {
                    Log.e("DartMessenger", "Uncaught exception in binary message listener", e3);
                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i4);
                } catch (Error e4) {
                    Thread currentThread = Thread.currentThread();
                    if (currentThread.getUncaughtExceptionHandler() != null) {
                        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e4);
                    } else {
                        throw e4;
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                flutterJNI.invokePlatformMessageEmptyResponseCallback(i4);
            }
            if (byteBuffer != null && byteBuffer.isDirect()) {
                byteBuffer.limit(0);
            }
            Trace.endSection();
            flutterJNI.cleanupMessageData(j3);
        } catch (Throwable th2) {
            flutterJNI.cleanupMessageData(j3);
            throw th2;
        }
    }
}
