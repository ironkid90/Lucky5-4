package L1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final String f999a;

    /* renamed from: b  reason: collision with root package name */
    public final List f1000b;

    public r(String str, List list) {
        this.f999a = str;
        this.f1000b = list == null ? new ArrayList() : list;
    }

    public static Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i3 = 0; i3 < list.size(); i3++) {
            bArr[i3] = (byte) ((Integer) list.get(i3)).intValue();
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        String str = this.f999a;
        if (str != null) {
            if (!str.equals(rVar.f999a)) {
                return false;
            }
        } else if (rVar.f999a != null) {
            return false;
        }
        List list = this.f1000b;
        if (list.size() != rVar.f1000b.size()) {
            return false;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            boolean z3 = list.get(i3) instanceof byte[];
            List list2 = rVar.f1000b;
            if (!z3 || !(list2.get(i3) instanceof byte[])) {
                if (!list.get(i3).equals(list2.get(i3))) {
                    return false;
                }
            } else if (!Arrays.equals((byte[]) list.get(i3), (byte[]) list2.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f999a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f999a);
        List list = this.f1000b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + list;
        }
        sb.append(str);
        return sb.toString();
    }
}
