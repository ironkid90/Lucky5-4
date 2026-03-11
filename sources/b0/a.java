package B0;

import A2.h;
import android.util.SparseArray;
import java.util.HashMap;
import o0.C0356d;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseArray f101a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f102b;

    static {
        HashMap hashMap = new HashMap();
        f102b = hashMap;
        hashMap.put(C0356d.f4142f, 0);
        hashMap.put(C0356d.f4143g, 1);
        hashMap.put(C0356d.f4144h, 2);
        for (C0356d dVar : hashMap.keySet()) {
            f101a.append(((Integer) f102b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(C0356d dVar) {
        Integer num = (Integer) f102b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static C0356d b(int i3) {
        C0356d dVar = (C0356d) f101a.get(i3);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(h.e("Unknown Priority for value ", i3));
    }
}
