package q2;

import A2.i;
import M0.a;
import java.util.Arrays;
import java.util.List;

/* renamed from: q2.e  reason: case insensitive filesystem */
public abstract class C0402e extends a {
    public static List b0(Object... objArr) {
        i.e(objArr, "elements");
        if (objArr.length <= 0) {
            return l.f4396f;
        }
        List asList = Arrays.asList(objArr);
        i.d(asList, "asList(...)");
        return asList;
    }
}
