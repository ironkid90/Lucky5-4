package c2;

import android.util.Log;
import java.nio.ByteBuffer;
import s1.C0464y;

/* renamed from: c2.a  reason: case insensitive filesystem */
public final class C0133a implements C0137e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2776a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2777b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2778c;

    public /* synthetic */ C0133a(int i3, Object obj, Object obj2) {
        this.f2776a = i3;
        this.f2778c = obj;
        this.f2777b = obj2;
    }

    public final void a(ByteBuffer byteBuffer) {
        switch (this.f2776a) {
            case 0:
                C0464y yVar = (C0464y) this.f2778c;
                try {
                    ((C0135c) this.f2777b).q(((l) yVar.f4624h).a(byteBuffer));
                    return;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) yVar.f4622f), "Failed to handle message reply", e2);
                    return;
                }
            default:
                q qVar = (q) this.f2778c;
                p pVar = (p) this.f2777b;
                if (byteBuffer == null) {
                    try {
                        pVar.c();
                        return;
                    } catch (RuntimeException e3) {
                        Log.e("MethodChannel#" + qVar.f2792b, "Failed to handle method call result", e3);
                        return;
                    }
                } else {
                    try {
                        pVar.b(qVar.f2793c.d(byteBuffer));
                        return;
                    } catch (i e4) {
                        pVar.a(e4.f2781f, e4.getMessage(), e4.f2782g);
                        return;
                    }
                }
        }
    }
}
