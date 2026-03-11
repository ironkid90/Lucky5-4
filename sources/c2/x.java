package c2;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class x implements r {

    /* renamed from: a  reason: collision with root package name */
    public static final x f2798a = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [c2.x, java.lang.Object] */
    static {
        w wVar = w.f2795a;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.ByteArrayOutputStream, c2.v] */
    public final ByteBuffer a(m mVar) {
        ? byteArrayOutputStream = new ByteArrayOutputStream();
        w wVar = w.f2795a;
        wVar.k(byteArrayOutputStream, mVar.f2785a);
        wVar.k(byteArrayOutputStream, mVar.f2786b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, c2.v] */
    public final ByteBuffer b(Object obj) {
        ? byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        w.f2795a.k(byteArrayOutputStream, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    public final m c(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        w wVar = w.f2795a;
        Object e2 = wVar.e(byteBuffer);
        Object e3 = wVar.e(byteBuffer);
        if ((e2 instanceof String) && !byteBuffer.hasRemaining()) {
            return new m(e3, (String) e2);
        }
        throw new IllegalArgumentException("Method call corrupted");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 == 1) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L_0x0011
            r1 = 1
            if (r0 != r1) goto L_0x0046
            goto L_0x001e
        L_0x0011:
            c2.w r0 = c2.w.f2795a
            java.lang.Object r0 = r0.e(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L_0x001e
            return r0
        L_0x001e:
            c2.w r0 = c2.w.f2795a
            java.lang.Object r1 = r0.e(r5)
            java.lang.Object r2 = r0.e(r5)
            java.lang.Object r0 = r0.e(r5)
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L_0x0046
            if (r2 == 0) goto L_0x0036
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L_0x0046
        L_0x0036:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L_0x0046
            c2.i r5 = new c2.i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = (java.lang.String) r2
            r5.<init>(r1, r2, r0)
            throw r5
        L_0x0046:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.x.d(java.nio.ByteBuffer):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, c2.v] */
    public final ByteBuffer e(String str, String str2) {
        ? byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        w wVar = w.f2795a;
        wVar.k(byteArrayOutputStream, "error");
        wVar.k(byteArrayOutputStream, str);
        byteArrayOutputStream.write(0);
        wVar.k(byteArrayOutputStream, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, c2.v] */
    public final ByteBuffer f(String str, String str2, Object obj) {
        ? byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        w wVar = w.f2795a;
        wVar.k(byteArrayOutputStream, str);
        wVar.k(byteArrayOutputStream, str2);
        if (obj instanceof Throwable) {
            wVar.k(byteArrayOutputStream, Log.getStackTraceString((Throwable) obj));
        } else {
            wVar.k(byteArrayOutputStream, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }
}
