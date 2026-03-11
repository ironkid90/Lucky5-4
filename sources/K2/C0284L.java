package k2;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.LinkedHashSet;
import q2.o;

/* renamed from: k2.L  reason: case insensitive filesystem */
public final class C0284L extends ObjectInputStream {
    public final Class resolveClass(ObjectStreamClass objectStreamClass) {
        String str;
        String[] strArr = {"java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;"};
        LinkedHashSet linkedHashSet = new LinkedHashSet(o.a0(4));
        for (int i3 = 0; i3 < 4; i3++) {
            linkedHashSet.add(strArr[i3]);
        }
        if (objectStreamClass != null) {
            str = objectStreamClass.getName();
        } else {
            str = null;
        }
        if (str == null || linkedHashSet.contains(str)) {
            return super.resolveClass(objectStreamClass);
        }
        throw new ClassNotFoundException(objectStreamClass.getName());
    }
}
