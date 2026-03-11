package R2;

import java.util.ArrayList;
import java.util.Map;
import q2.C0401d;
import q2.m;
import z2.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1378a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1379b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f1380c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f1381d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f1382e;

    /* renamed from: f  reason: collision with root package name */
    public final Long f1383f;

    /* renamed from: g  reason: collision with root package name */
    public final Map f1384g;

    public e(boolean z3, boolean z4, Long l3, Long l4, Long l5, Long l6) {
        m mVar = m.f4397f;
        this.f1378a = z3;
        this.f1379b = z4;
        this.f1380c = l3;
        this.f1381d = l4;
        this.f1382e = l5;
        this.f1383f = l6;
        this.f1384g = mVar;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f1378a) {
            arrayList.add("isRegularFile");
        }
        if (this.f1379b) {
            arrayList.add("isDirectory");
        }
        Long l3 = this.f1380c;
        if (l3 != null) {
            arrayList.add("byteCount=" + l3);
        }
        Long l4 = this.f1381d;
        if (l4 != null) {
            arrayList.add("createdAt=" + l4);
        }
        Long l5 = this.f1382e;
        if (l5 != null) {
            arrayList.add("lastModifiedAt=" + l5);
        }
        Long l6 = this.f1383f;
        if (l6 != null) {
            arrayList.add("lastAccessedAt=" + l6);
        }
        Map map = this.f1384g;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return C0401d.e0(arrayList, ", ", "FileMetadata(", ")", (l) null, 56);
    }
}
