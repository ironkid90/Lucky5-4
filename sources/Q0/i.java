package q0;

import java.util.ArrayList;

public final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f4359a;

    public i(ArrayList arrayList) {
        this.f4359a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return this.f4359a.equals(((i) ((o) obj)).f4359a);
    }

    public final int hashCode() {
        return this.f4359a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f4359a + "}";
    }
}
