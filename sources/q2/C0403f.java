package q2;

import A2.i;
import java.util.Collection;

/* renamed from: q2.f  reason: case insensitive filesystem */
public abstract class C0403f extends C0402e {
    public static int c0(Iterable iterable) {
        i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
