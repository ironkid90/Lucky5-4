package h2;

import C0.r;
import L.k;
import android.support.v4.media.session.a;
import java.util.ArrayList;

/* renamed from: h2.k  reason: case insensitive filesystem */
public final class C0197k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3098a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3099b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r f3100c;

    public /* synthetic */ C0197k(ArrayList arrayList, r rVar, int i3) {
        this.f3098a = i3;
        this.f3099b = arrayList;
        this.f3100c = rVar;
    }

    public final void a(Exception exc) {
        switch (this.f3098a) {
            case 0:
                this.f3100c.q(a.F(exc));
                return;
            case 1:
                this.f3100c.q(a.F(exc));
                return;
            case k.FLOAT_FIELD_NUMBER:
                this.f3100c.q(a.F(exc));
                return;
            case k.INTEGER_FIELD_NUMBER:
                this.f3100c.q(a.F(exc));
                return;
            case k.LONG_FIELD_NUMBER:
                this.f3100c.q(a.F(exc));
                return;
            default:
                this.f3100c.q(a.F(exc));
                return;
        }
    }
}
