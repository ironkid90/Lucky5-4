package q2;

import A2.i;
import M0.a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import z2.l;

/* renamed from: q2.d  reason: case insensitive filesystem */
public abstract class C0401d extends C0407j {
    public static final void d0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, l lVar) {
        i.e(collection, "<this>");
        i.e(charSequence, "separator");
        i.e(charSequence2, "prefix");
        i.e(charSequence3, "postfix");
        i.e(charSequence4, "truncated");
        sb.append(charSequence2);
        int i4 = 0;
        for (Object next : collection) {
            i4++;
            boolean z3 = true;
            if (i4 > 1) {
                sb.append(charSequence);
            }
            if (i3 >= 0 && i4 > i3) {
                break;
            } else if (lVar != null) {
                sb.append((CharSequence) lVar.j(next));
            } else {
                if (next != null) {
                    z3 = next instanceof CharSequence;
                }
                if (z3) {
                    sb.append((CharSequence) next);
                } else if (next instanceof Character) {
                    sb.append(((Character) next).charValue());
                } else {
                    sb.append(next.toString());
                }
            }
        }
        if (i3 >= 0 && i4 > i3) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String e0(Collection collection, String str, String str2, String str3, l lVar, int i3) {
        String str4;
        String str5;
        if ((i3 & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i3 & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i3 & 32) != 0) {
            lVar = null;
        }
        i.e(collection, "<this>");
        i.e(str4, "prefix");
        i.e(str5, "postfix");
        StringBuilder sb = new StringBuilder();
        d0(collection, sb, str, str4, str5, -1, "...", lVar);
        return sb.toString();
    }

    public static Object f0(List list) {
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final void g0(Iterable iterable, AbstractCollection abstractCollection) {
        i.e(iterable, "<this>");
        for (Object add : iterable) {
            abstractCollection.add(add);
        }
    }

    public static List h0(Iterable iterable) {
        ArrayList arrayList;
        Object obj;
        i.e(iterable, "<this>");
        boolean z3 = iterable instanceof Collection;
        l lVar = l.f4396f;
        if (z3) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return lVar;
            }
            if (size != 1) {
                return i0(collection);
            }
            if (iterable instanceof List) {
                obj = ((List) iterable).get(0);
            } else {
                obj = collection.iterator().next();
            }
            return a.A(obj);
        }
        if (z3) {
            arrayList = i0((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            g0(iterable, arrayList2);
            arrayList = arrayList2;
        }
        int size2 = arrayList.size();
        if (size2 == 0) {
            return lVar;
        }
        if (size2 != 1) {
            return arrayList;
        }
        return a.A(arrayList.get(0));
    }

    public static ArrayList i0(Collection collection) {
        i.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set j0(Collection collection) {
        Object obj;
        i.e(collection, "<this>");
        n nVar = n.f4398f;
        int size = collection.size();
        if (size == 0) {
            return nVar;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(o.a0(collection.size()));
            g0(collection, linkedHashSet);
            return linkedHashSet;
        }
        if (collection instanceof List) {
            obj = ((List) collection).get(0);
        } else {
            obj = collection.iterator().next();
        }
        Set singleton = Collections.singleton(obj);
        i.d(singleton, "singleton(...)");
        return singleton;
    }
}
