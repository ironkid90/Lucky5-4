package N2;

import M0.a;
import a.C0094a;
import p2.C0365e;
import t2.C0484b;

public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f1222a = 0;

    static {
        Object obj;
        Object obj2;
        Exception exc = new Exception();
        String simpleName = C0094a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            obj = C0484b.class.getCanonicalName();
        } catch (Throwable th) {
            obj = a.h(th);
        }
        if (C0365e.a(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) obj;
        try {
            obj2 = v.class.getCanonicalName();
        } catch (Throwable th2) {
            obj2 = a.h(th2);
        }
        if (C0365e.a(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) obj2;
    }
}
