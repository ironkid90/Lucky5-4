package q2;

import A2.i;
import a.C0094a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p2.C0363c;

public abstract class o extends C0094a {
    public static HashMap Z(C0363c... cVarArr) {
        HashMap hashMap = new HashMap(a0(cVarArr.length));
        b0(hashMap, cVarArr);
        return hashMap;
    }

    public static int a0(int i3) {
        if (i3 < 0) {
            return i3;
        }
        if (i3 < 3) {
            return i3 + 1;
        }
        if (i3 < 1073741824) {
            return (int) ((((float) i3) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final void b0(HashMap hashMap, C0363c[] cVarArr) {
        for (C0363c cVar : cVarArr) {
            hashMap.put(cVar.f4187f, cVar.f4188g);
        }
    }

    public static Map c0(ArrayList arrayList) {
        m mVar = m.f4397f;
        int size = arrayList.size();
        if (size == 0) {
            return mVar;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(a0(arrayList.size()));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0363c cVar = (C0363c) it.next();
                linkedHashMap.put(cVar.f4187f, cVar.f4188g);
            }
            return linkedHashMap;
        }
        C0363c cVar2 = (C0363c) arrayList.get(0);
        i.e(cVar2, "pair");
        Map singletonMap = Collections.singletonMap(cVar2.f4187f, cVar2.f4188g);
        i.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }
}
