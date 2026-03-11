package H2;

import G2.b;
import java.util.Iterator;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f492a;

    /* renamed from: b  reason: collision with root package name */
    public final int f493b;

    /* renamed from: c  reason: collision with root package name */
    public final int f494c;

    /* renamed from: d  reason: collision with root package name */
    public final k f495d;

    public c(String str, int i3, int i4, k kVar) {
        this.f492a = str;
        this.f493b = i3;
        this.f494c = i4;
        this.f495d = kVar;
    }

    public final Iterator iterator() {
        return new b(this);
    }
}
