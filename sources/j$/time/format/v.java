package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class v {

    /* renamed from: a  reason: collision with root package name */
    private final Map f5113a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap f5114b;

    v(Map map) {
        this.f5113a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                int i3 = b.f5063c;
                hashMap2.put((String) entry2.getValue(), new AbstractMap.SimpleImmutableEntry((String) entry2.getValue(), (Long) entry2.getKey()));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            Collections.sort(arrayList2, b.f5062b);
            hashMap.put((A) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put((Object) null, arrayList);
        }
        Collections.sort(arrayList, b.f5062b);
        this.f5114b = hashMap;
    }

    /* access modifiers changed from: package-private */
    public final String a(long j3, A a2) {
        Map map = (Map) this.f5113a.get(a2);
        if (map != null) {
            return (String) map.get(Long.valueOf(j3));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Iterator b(A a2) {
        List list = (List) this.f5114b.get(a2);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
