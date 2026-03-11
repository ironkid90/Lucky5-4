package G0;

import A0.a;
import A2.i;
import R.e;
import android.util.Base64;
import c2.o;
import c2.p;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import y1.l;
import y1.m;

public final class f implements a, e, o, m {

    /* renamed from: g  reason: collision with root package name */
    public static f f411g;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f412f;

    public /* synthetic */ f(int i3) {
        this.f412f = i3;
    }

    public String a(List list) {
        i.e(list, "list");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        i.d(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    public long c() {
        return System.currentTimeMillis();
    }

    public void onMethodCall(c2.m mVar, p pVar) {
        ((b2.f) pVar).b((Object) null);
    }

    public Object r() {
        switch (this.f412f) {
            case 16:
                return new ConcurrentHashMap();
            case 17:
                return new l();
            default:
                return new ArrayDeque();
        }
    }

    public void e() {
    }

    public void b(int i3, Serializable serializable) {
    }
}
