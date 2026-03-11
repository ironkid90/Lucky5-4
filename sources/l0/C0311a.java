package l0;

import java.io.Serializable;
import java.util.List;

/* renamed from: l0.a  reason: case insensitive filesystem */
public final class C0311a implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final List f4002f;

    /* renamed from: g  reason: collision with root package name */
    public final Boolean f4003g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4004h;

    /* renamed from: i  reason: collision with root package name */
    public final List f4005i;

    public C0311a(List list, Boolean bool, String str, List list2) {
        this.f4002f = list;
        this.f4003g = bool;
        this.f4004h = str;
        this.f4005i = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0311a.class != obj.getClass()) {
            return false;
        }
        C0311a aVar = (C0311a) obj;
        List list = aVar.f4002f;
        List list2 = this.f4002f;
        if (list2 == null ? list != null : !list2.equals(list)) {
            return false;
        }
        Boolean bool = aVar.f4003g;
        Boolean bool2 = this.f4003g;
        if (bool2 == null ? bool != null : !bool2.equals(bool)) {
            return false;
        }
        String str = aVar.f4004h;
        String str2 = this.f4004h;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list3 = aVar.f4005i;
        List list4 = this.f4005i;
        if (list4 != null) {
            return list4.equals(list3);
        }
        if (list3 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        List list = this.f4002f;
        if (list != null) {
            i3 = list.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = i3 * 31;
        Boolean bool = this.f4003g;
        if (bool != null) {
            i4 = bool.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        String str = this.f4004h;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int i9 = (i8 + i5) * 31;
        List list2 = this.f4005i;
        if (list2 != null) {
            i6 = list2.hashCode();
        }
        return i9 + i6;
    }
}
