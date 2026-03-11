package n;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: n.f  reason: case insensitive filesystem */
public class C0339f {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f4068a;

    /* renamed from: b  reason: collision with root package name */
    public int f4069b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4070c;

    /* renamed from: d  reason: collision with root package name */
    public int f4071d;

    /* renamed from: e  reason: collision with root package name */
    public int f4072e;

    public C0339f(int i3) {
        if (i3 > 0) {
            this.f4070c = i3;
            this.f4068a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final Object a(Object obj) {
        if (obj != null) {
            synchronized (this) {
                try {
                    Object obj2 = this.f4068a.get(obj);
                    if (obj2 != null) {
                        this.f4071d++;
                        return obj2;
                    }
                    this.f4072e++;
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            throw new NullPointerException("key == null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.Object r3, java.lang.Object r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0087
            monitor-enter(r2)
            int r0 = r2.f4069b     // Catch:{ all -> 0x0018 }
            int r0 = r0 + 1
            r2.f4069b = r0     // Catch:{ all -> 0x0018 }
            java.util.LinkedHashMap r0 = r2.f4068a     // Catch:{ all -> 0x0018 }
            java.lang.Object r3 = r0.put(r3, r4)     // Catch:{ all -> 0x0018 }
            if (r3 == 0) goto L_0x001a
            int r4 = r2.f4069b     // Catch:{ all -> 0x0018 }
            int r4 = r4 + -1
            r2.f4069b = r4     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r3 = move-exception
            goto L_0x0085
        L_0x001a:
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            int r4 = r2.f4070c
        L_0x001d:
            monitor-enter(r2)
            int r0 = r2.f4069b     // Catch:{ all -> 0x002f }
            if (r0 < 0) goto L_0x0064
            java.util.LinkedHashMap r0 = r2.f4068a     // Catch:{ all -> 0x002f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0031
            int r0 = r2.f4069b     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x0064
            goto L_0x0031
        L_0x002f:
            r3 = move-exception
            goto L_0x0083
        L_0x0031:
            int r0 = r2.f4069b     // Catch:{ all -> 0x002f }
            if (r0 <= r4) goto L_0x0062
            java.util.LinkedHashMap r0 = r2.f4068a     // Catch:{ all -> 0x002f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x003e
            goto L_0x0062
        L_0x003e:
            java.util.LinkedHashMap r0 = r2.f4068a     // Catch:{ all -> 0x002f }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x002f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x002f }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x002f }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x002f }
            r0.getValue()     // Catch:{ all -> 0x002f }
            java.util.LinkedHashMap r0 = r2.f4068a     // Catch:{ all -> 0x002f }
            r0.remove(r1)     // Catch:{ all -> 0x002f }
            int r0 = r2.f4069b     // Catch:{ all -> 0x002f }
            int r0 = r0 + -1
            r2.f4069b = r0     // Catch:{ all -> 0x002f }
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            goto L_0x001d
        L_0x0062:
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            return r3
        L_0x0064:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x002f }
            r4.<init>()     // Catch:{ all -> 0x002f }
            java.lang.Class r0 = r2.getClass()     // Catch:{ all -> 0x002f }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x002f }
            r4.append(r0)     // Catch:{ all -> 0x002f }
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r4.append(r0)     // Catch:{ all -> 0x002f }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x002f }
            r3.<init>(r4)     // Catch:{ all -> 0x002f }
            throw r3     // Catch:{ all -> 0x002f }
        L_0x0083:
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            throw r3
        L_0x0085:
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            throw r3
        L_0x0087:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "key == null || value == null"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0339f.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final synchronized String toString() {
        int i3;
        int i4;
        int i5;
        int i6;
        try {
            i3 = this.f4071d;
            i4 = this.f4072e;
            int i7 = i3 + i4;
            if (i7 != 0) {
                i5 = (i3 * 100) / i7;
            } else {
                i5 = 0;
            }
            Locale locale = Locale.US;
            i6 = this.f4070c;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return "LruCache[maxSize=" + i6 + ",hits=" + i3 + ",misses=" + i4 + ",hitRate=" + i5 + "%]";
    }
}
