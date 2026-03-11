package x;

import android.content.Context;
import java.util.concurrent.Callable;
import s1.C0465z;

public final class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4746a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f4747b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f4748c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0465z f4749d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f4750e;

    public /* synthetic */ c(String str, Context context, C0465z zVar, int i3, int i4) {
        this.f4746a = i4;
        this.f4747b = str;
        this.f4748c = context;
        this.f4749d = zVar;
        this.f4750e = i3;
    }

    public final Object call() {
        switch (this.f4746a) {
            case 0:
                return f.a(this.f4747b, this.f4748c, this.f4749d, this.f4750e);
            default:
                try {
                    return f.a(this.f4747b, this.f4748c, this.f4749d, this.f4750e);
                } catch (Throwable unused) {
                    return new e(-3);
                }
        }
    }
}
