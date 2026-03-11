package s0;

import A0.a;
import android.content.Context;

public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4472a;

    /* renamed from: b  reason: collision with root package name */
    public final a f4473b;

    /* renamed from: c  reason: collision with root package name */
    public final a f4474c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4475d;

    public b(Context context, a aVar, a aVar2, String str) {
        if (context != null) {
            this.f4472a = context;
            if (aVar != null) {
                this.f4473b = aVar;
                if (aVar2 != null) {
                    this.f4474c = aVar2;
                    if (str != null) {
                        this.f4475d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4472a.equals(((b) cVar).f4472a)) {
            b bVar = (b) cVar;
            if (this.f4473b.equals(bVar.f4473b) && this.f4474c.equals(bVar.f4474c) && this.f4475d.equals(bVar.f4475d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f4472a.hashCode() ^ 1000003) * 1000003) ^ this.f4473b.hashCode()) * 1000003) ^ this.f4474c.hashCode()) * 1000003) ^ this.f4475d.hashCode();
    }

    public final String toString() {
        return "CreationContext{applicationContext=" + this.f4472a + ", wallClock=" + this.f4473b + ", monotonicClock=" + this.f4474c + ", backendName=" + this.f4475d + "}";
    }
}
