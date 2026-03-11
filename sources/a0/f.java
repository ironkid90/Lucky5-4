package a0;

import A2.h;
import A2.i;
import H1.a;
import L.j;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import q2.C0398a;
import q2.l;

public final class f extends g {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1983a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1984b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1985c;

    /* renamed from: d  reason: collision with root package name */
    public final a f1986d;

    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.Throwable, H1.a, java.lang.Exception] */
    public f(Object obj, String str, C0095a aVar, int i3) {
        i.e(obj, "value");
        h.k("verificationMode", i3);
        this.f1983a = obj;
        this.f1984b = str;
        this.f1985c = i3;
        String b3 = g.b(obj, str);
        i.e(b3, "message");
        ? exc = new Exception(b3);
        StackTraceElement[] stackTrace = exc.getStackTrace();
        i.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length >= 0) {
            List list = l.f4396f;
            List list2 = list;
            if (length != 0) {
                int length2 = stackTrace.length;
                if (length >= length2) {
                    int length3 = stackTrace.length;
                    list2 = list;
                    if (length3 != 0) {
                        if (length3 != 1) {
                            list2 = new ArrayList(new C0398a(stackTrace, false));
                        } else {
                            list2 = M0.a.A(stackTrace[0]);
                        }
                    }
                } else if (length == 1) {
                    list2 = M0.a.A(stackTrace[length2 - 1]);
                } else {
                    ArrayList arrayList = new ArrayList(length);
                    for (int i4 = length2 - length; i4 < length2; i4++) {
                        arrayList.add(stackTrace[i4]);
                    }
                    list2 = arrayList;
                }
            }
            exc.setStackTrace((StackTraceElement[]) list2.toArray(new StackTraceElement[0]));
            this.f1986d = exc;
            return;
        }
        throw new IllegalArgumentException(("Requested element count " + length + " is less than zero.").toString());
    }

    public final Object a() {
        int b3 = j.b(this.f1985c);
        if (b3 == 0) {
            throw this.f1986d;
        } else if (b3 == 1) {
            String b4 = g.b(this.f1983a, this.f1984b);
            i.e(b4, "message");
            Log.d("f", b4);
            return null;
        } else if (b3 == 2) {
            return null;
        } else {
            throw new RuntimeException();
        }
    }

    public final g d(String str, z2.l lVar) {
        return this;
    }
}
