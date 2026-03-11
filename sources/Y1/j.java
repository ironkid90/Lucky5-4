package y1;

import L.k;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.a0;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public class j extends AbstractSet {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4858f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ AbstractMap f4859g;

    public /* synthetic */ j(AbstractMap abstractMap, int i3) {
        this.f4858f = i3;
        this.f4859g = abstractMap;
    }

    public boolean add(Object obj) {
        switch (this.f4858f) {
            case k.FLOAT_FIELD_NUMBER:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                Object value = entry.getValue();
                ((Y) this.f4859g).put((Comparable) entry.getKey(), value);
                return true;
            default:
                return super.add(obj);
        }
    }

    public final void clear() {
        switch (this.f4858f) {
            case 0:
                ((l) this.f4859g).clear();
                return;
            case 1:
                ((l) this.f4859g).clear();
                return;
            default:
                ((Y) this.f4859g).clear();
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f4858f
            switch(r0) {
                case 0: goto L_0x002f;
                case 1: goto L_0x0026;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getKey()
            java.util.AbstractMap r1 = r4.f4859g
            androidx.datastore.preferences.protobuf.Y r1 = (androidx.datastore.preferences.protobuf.Y) r1
            java.lang.Object r0 = r1.get(r0)
            java.lang.Object r5 = r5.getValue()
            if (r0 == r5) goto L_0x0024
            if (r0 == 0) goto L_0x0022
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r5 = 0
            goto L_0x0025
        L_0x0024:
            r5 = 1
        L_0x0025:
            return r5
        L_0x0026:
            java.util.AbstractMap r0 = r4.f4859g
            y1.l r0 = (y1.l) r0
            boolean r5 = r0.containsKey(r5)
            return r5
        L_0x002f:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L_0x0060
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.AbstractMap r0 = r4.f4859g
            y1.l r0 = (y1.l) r0
            r0.getClass()
            java.lang.Object r2 = r5.getKey()
            r3 = 0
            if (r2 == 0) goto L_0x0049
            y1.k r0 = r0.a(r2, r1)     // Catch:{ ClassCastException -> 0x0049 }
            goto L_0x004a
        L_0x0049:
            r0 = r3
        L_0x004a:
            if (r0 == 0) goto L_0x005d
            java.lang.Object r2 = r0.f4866l
            java.lang.Object r5 = r5.getValue()
            if (r2 == r5) goto L_0x005c
            if (r2 == 0) goto L_0x005d
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x005d
        L_0x005c:
            r3 = r0
        L_0x005d:
            if (r3 == 0) goto L_0x0060
            r1 = 1
        L_0x0060:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.j.contains(java.lang.Object):boolean");
    }

    public Iterator iterator() {
        switch (this.f4858f) {
            case 0:
                return new i((l) this.f4859g, 0);
            case 1:
                return new i((l) this.f4859g, 1);
            default:
                return new a0((Y) this.f4859g);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f4858f
            switch(r0) {
                case 0: goto L_0x0035;
                case 1: goto L_0x001c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            boolean r0 = r5.contains(r6)
            if (r0 == 0) goto L_0x001a
            java.util.AbstractMap r0 = r5.f4859g
            androidx.datastore.preferences.protobuf.Y r0 = (androidx.datastore.preferences.protobuf.Y) r0
            java.lang.Object r6 = r6.getKey()
            r0.remove(r6)
            r6 = 1
            goto L_0x001b
        L_0x001a:
            r6 = 0
        L_0x001b:
            return r6
        L_0x001c:
            java.util.AbstractMap r0 = r5.f4859g
            y1.l r0 = (y1.l) r0
            r0.getClass()
            r1 = 0
            r2 = 0
            if (r6 == 0) goto L_0x002b
            y1.k r2 = r0.a(r6, r1)     // Catch:{ ClassCastException -> 0x002b }
        L_0x002b:
            r6 = 1
            if (r2 == 0) goto L_0x0031
            r0.c(r2, r6)
        L_0x0031:
            if (r2 == 0) goto L_0x0034
            r1 = r6
        L_0x0034:
            return r1
        L_0x0035:
            boolean r0 = r6 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L_0x003b
            goto L_0x006b
        L_0x003b:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.util.AbstractMap r0 = r5.f4859g
            y1.l r0 = (y1.l) r0
            r0.getClass()
            java.lang.Object r2 = r6.getKey()
            r3 = 0
            if (r2 == 0) goto L_0x0050
            y1.k r2 = r0.a(r2, r1)     // Catch:{ ClassCastException -> 0x0050 }
            goto L_0x0051
        L_0x0050:
            r2 = r3
        L_0x0051:
            if (r2 == 0) goto L_0x0064
            java.lang.Object r4 = r2.f4866l
            java.lang.Object r6 = r6.getValue()
            if (r4 == r6) goto L_0x0063
            if (r4 == 0) goto L_0x0064
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x0064
        L_0x0063:
            r3 = r2
        L_0x0064:
            if (r3 != 0) goto L_0x0067
            goto L_0x006b
        L_0x0067:
            r1 = 1
            r0.c(r3, r1)
        L_0x006b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.j.remove(java.lang.Object):boolean");
    }

    public final int size() {
        switch (this.f4858f) {
            case 0:
                return ((l) this.f4859g).f4871h;
            case 1:
                return ((l) this.f4859g).f4871h;
            default:
                return ((Y) this.f4859g).size();
        }
    }
}
