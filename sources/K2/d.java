package K2;

import B.m;
import I2.C0054e;
import N2.a;
import z2.l;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final j f878a = new j(-1, (j) null, (b) null, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final int f879b = a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c  reason: collision with root package name */
    public static final int f880c = a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d  reason: collision with root package name */
    public static final m f881d = new m(11, (Object) "BUFFERED");

    /* renamed from: e  reason: collision with root package name */
    public static final m f882e = new m(11, (Object) "SHOULD_BUFFER");

    /* renamed from: f  reason: collision with root package name */
    public static final m f883f = new m(11, (Object) "S_RESUMING_BY_RCV");

    /* renamed from: g  reason: collision with root package name */
    public static final m f884g = new m(11, (Object) "RESUMING_BY_EB");

    /* renamed from: h  reason: collision with root package name */
    public static final m f885h = new m(11, (Object) "POISONED");

    /* renamed from: i  reason: collision with root package name */
    public static final m f886i = new m(11, (Object) "DONE_RCV");

    /* renamed from: j  reason: collision with root package name */
    public static final m f887j = new m(11, (Object) "INTERRUPTED_SEND");

    /* renamed from: k  reason: collision with root package name */
    public static final m f888k = new m(11, (Object) "INTERRUPTED_RCV");

    /* renamed from: l  reason: collision with root package name */
    public static final m f889l = new m(11, (Object) "CHANNEL_CLOSED");

    /* renamed from: m  reason: collision with root package name */
    public static final m f890m = new m(11, (Object) "SUSPEND");

    /* renamed from: n  reason: collision with root package name */
    public static final m f891n = new m(11, (Object) "SUSPEND_NO_WAITER");

    /* renamed from: o  reason: collision with root package name */
    public static final m f892o = new m(11, (Object) "FAILED");

    /* renamed from: p  reason: collision with root package name */
    public static final m f893p = new m(11, (Object) "NO_RECEIVE_RESULT");

    /* renamed from: q  reason: collision with root package name */
    public static final m f894q = new m(11, (Object) "CLOSE_HANDLER_CLOSED");

    /* renamed from: r  reason: collision with root package name */
    public static final m f895r = new m(11, (Object) "CLOSE_HANDLER_INVOKED");

    /* renamed from: s  reason: collision with root package name */
    public static final m f896s = new m(11, (Object) "NO_CLOSE_CAUSE");

    public static final boolean a(C0054e eVar, Object obj, l lVar) {
        m k3 = eVar.k(obj, lVar);
        if (k3 == null) {
            return false;
        }
        eVar.o(k3);
        return true;
    }
}
