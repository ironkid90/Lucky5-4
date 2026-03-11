package w1;

import C1.d;
import D1.a;
import c2.n;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import y1.f;
import z1.C0525a;
import z1.C0526b;
import z1.c;
import z1.l;
import z1.o;
import z1.r;
import z1.s;
import z1.u;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal f4734a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f4735b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final n f4736c;

    /* renamed from: d  reason: collision with root package name */
    public final C0526b f4737d;

    /* renamed from: e  reason: collision with root package name */
    public final List f4738e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4739f;

    static {
        new a(Object.class);
    }

    public k(f fVar, HashMap hashMap, ArrayList arrayList) {
        n nVar = new n(hashMap);
        this.f4736c = nVar;
        this.f4739f = true;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(u.f4963y);
        arrayList2.add(l.f4907b);
        arrayList2.add(fVar);
        arrayList2.addAll(arrayList);
        arrayList2.add(u.f4954o);
        arrayList2.add(u.f4946g);
        arrayList2.add(u.f4943d);
        arrayList2.add(u.f4944e);
        arrayList2.add(u.f4945f);
        z1.k kVar = u.f4950k;
        arrayList2.add(new s(Long.TYPE, Long.class, kVar));
        arrayList2.add(new s(Double.TYPE, Double.class, new h(0)));
        arrayList2.add(new s(Float.TYPE, Float.class, new h(1)));
        arrayList2.add(z1.k.f4905b);
        arrayList2.add(u.f4947h);
        arrayList2.add(u.f4948i);
        arrayList2.add(new r(AtomicLong.class, new i(new i(kVar, 0), 2), 0));
        arrayList2.add(new r(AtomicLongArray.class, new i(new i(kVar, 1), 2), 0));
        arrayList2.add(u.f4949j);
        arrayList2.add(u.f4951l);
        arrayList2.add(u.f4955p);
        arrayList2.add(u.f4956q);
        arrayList2.add(new r(BigDecimal.class, u.f4952m, 0));
        arrayList2.add(new r(BigInteger.class, u.f4953n, 0));
        arrayList2.add(u.f4957r);
        arrayList2.add(u.f4958s);
        arrayList2.add(u.f4960u);
        arrayList2.add(u.v);
        arrayList2.add(u.f4962x);
        arrayList2.add(u.f4959t);
        arrayList2.add(u.f4941b);
        arrayList2.add(c.f4887b);
        arrayList2.add(u.f4961w);
        if (d.f181a) {
            arrayList2.add(d.f183c);
            arrayList2.add(d.f182b);
            arrayList2.add(d.f184d);
        }
        arrayList2.add(C0525a.f4881d);
        arrayList2.add(u.f4940a);
        arrayList2.add(new C0526b(nVar, 0));
        arrayList2.add(new C0526b(nVar, 2));
        C0526b bVar = new C0526b(nVar, 1);
        this.f4737d = bVar;
        arrayList2.add(bVar);
        arrayList2.add(u.f4964z);
        arrayList2.add(new o(nVar, fVar, bVar));
        this.f4738e = Collections.unmodifiableList(arrayList2);
    }

    public static void a(double d3) {
        if (Double.isNaN(d3) || Double.isInfinite(d3)) {
            throw new IllegalArgumentException(d3 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0 = new java.lang.AssertionError("AssertionError (GSON 2.8.9): " + r6.getMessage());
        r0.initCause(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        throw new java.lang.RuntimeException(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        throw new java.lang.RuntimeException(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0084, code lost:
        throw new java.lang.RuntimeException(r6);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029 A[ExcHandler: AssertionError (r6v5 'e' java.lang.AssertionError A[CUSTOM_DECLARE]), Splitter:B:4:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b A[ExcHandler: IOException (r6v4 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:4:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d A[ExcHandler: IllegalStateException (r6v3 'e' java.lang.IllegalStateException A[CUSTOM_DECLARE]), Splitter:B:4:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d A[SYNTHETIC, Splitter:B:25:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007f A[SYNTHETIC, Splitter:B:38:0x007f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r5, java.lang.reflect.Type r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.StringReader r1 = new java.io.StringReader
            r1.<init>(r5)
            E1.b r5 = new E1.b
            r5.<init>(r1)
            java.lang.String r1 = "AssertionError (GSON 2.8.9): "
            r2 = 1
            r5.f228g = r2
            r3 = 0
            r5.w()     // Catch:{ EOFException -> 0x0057, IllegalStateException -> 0x002d, IOException -> 0x002b, AssertionError -> 0x0029 }
            D1.a r2 = new D1.a     // Catch:{ EOFException -> 0x002f, IllegalStateException -> 0x002d, IOException -> 0x002b, AssertionError -> 0x0029 }
            r2.<init>(r6)     // Catch:{ EOFException -> 0x002f, IllegalStateException -> 0x002d, IOException -> 0x002b, AssertionError -> 0x0029 }
            w1.r r6 = r4.c(r2)     // Catch:{ EOFException -> 0x002f, IllegalStateException -> 0x002d, IOException -> 0x002b, AssertionError -> 0x0029 }
            java.lang.Object r0 = r6.a(r5)     // Catch:{ EOFException -> 0x002f, IllegalStateException -> 0x002d, IOException -> 0x002b, AssertionError -> 0x0029 }
        L_0x0024:
            r5.f228g = r3
            goto L_0x005b
        L_0x0027:
            r6 = move-exception
            goto L_0x0085
        L_0x0029:
            r6 = move-exception
            goto L_0x0032
        L_0x002b:
            r6 = move-exception
            goto L_0x004b
        L_0x002d:
            r6 = move-exception
            goto L_0x0051
        L_0x002f:
            r6 = move-exception
            r2 = r3
            goto L_0x0058
        L_0x0032:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0027 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r2.<init>(r1)     // Catch:{ all -> 0x0027 }
            java.lang.String r1 = r6.getMessage()     // Catch:{ all -> 0x0027 }
            r2.append(r1)     // Catch:{ all -> 0x0027 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0027 }
            r0.<init>(r1)     // Catch:{ all -> 0x0027 }
            r0.initCause(r6)     // Catch:{ all -> 0x0027 }
            throw r0     // Catch:{ all -> 0x0027 }
        L_0x004b:
            w1.n r0 = new w1.n     // Catch:{ all -> 0x0027 }
            r0.<init>(r6)     // Catch:{ all -> 0x0027 }
            throw r0     // Catch:{ all -> 0x0027 }
        L_0x0051:
            w1.n r0 = new w1.n     // Catch:{ all -> 0x0027 }
            r0.<init>(r6)     // Catch:{ all -> 0x0027 }
            throw r0     // Catch:{ all -> 0x0027 }
        L_0x0057:
            r6 = move-exception
        L_0x0058:
            if (r2 == 0) goto L_0x007f
            goto L_0x0024
        L_0x005b:
            if (r0 == 0) goto L_0x007e
            int r5 = r5.w()     // Catch:{ d -> 0x0070, IOException -> 0x006e }
            r6 = 10
            if (r5 != r6) goto L_0x0066
            goto L_0x007e
        L_0x0066:
            w1.n r5 = new w1.n     // Catch:{ d -> 0x0070, IOException -> 0x006e }
            java.lang.String r6 = "JSON document was not fully consumed."
            r5.<init>(r6)     // Catch:{ d -> 0x0070, IOException -> 0x006e }
            throw r5     // Catch:{ d -> 0x0070, IOException -> 0x006e }
        L_0x006e:
            r5 = move-exception
            goto L_0x0072
        L_0x0070:
            r5 = move-exception
            goto L_0x0078
        L_0x0072:
            w1.n r6 = new w1.n
            r6.<init>(r5)
            throw r6
        L_0x0078:
            w1.n r6 = new w1.n
            r6.<init>(r5)
            throw r6
        L_0x007e:
            return r0
        L_0x007f:
            w1.n r0 = new w1.n     // Catch:{ all -> 0x0027 }
            r0.<init>(r6)     // Catch:{ all -> 0x0027 }
            throw r0     // Catch:{ all -> 0x0027 }
        L_0x0085:
            r5.f228g = r3
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.k.b(java.lang.String, java.lang.reflect.Type):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [w1.j, java.lang.Object] */
    public final r c(a aVar) {
        boolean z3;
        ConcurrentHashMap concurrentHashMap = this.f4735b;
        r rVar = (r) concurrentHashMap.get(aVar);
        if (rVar != null) {
            return rVar;
        }
        ThreadLocal threadLocal = this.f4734a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z3 = true;
        } else {
            z3 = false;
        }
        j jVar = (j) map.get(aVar);
        if (jVar != null) {
            return jVar;
        }
        try {
            ? obj = new Object();
            map.put(aVar, obj);
            for (s create : this.f4738e) {
                r create2 = create.create(this, aVar);
                if (create2 != null) {
                    if (obj.f4733a == null) {
                        obj.f4733a = create2;
                        concurrentHashMap.put(aVar, create2);
                        map.remove(aVar);
                        if (z3) {
                            threadLocal.remove();
                        }
                        return create2;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.9) cannot handle " + aVar);
        } catch (Throwable th) {
            map.remove(aVar);
            if (z3) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final r d(s sVar, a aVar) {
        List<s> list = this.f4738e;
        if (!list.contains(sVar)) {
            sVar = this.f4737d;
        }
        boolean z3 = false;
        for (s sVar2 : list) {
            if (z3) {
                r create = sVar2.create(this, aVar);
                if (create != null) {
                    return create;
                }
            } else if (sVar2 == sVar) {
                z3 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public final E1.c e(Writer writer) {
        E1.c cVar = new E1.c(writer);
        cVar.f251m = false;
        return cVar;
    }

    public final String f(Serializable serializable) {
        if (serializable == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                g(e(stringWriter));
                return stringWriter.toString();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            Class<?> cls = serializable.getClass();
            StringWriter stringWriter2 = new StringWriter();
            try {
                h(serializable, cls, e(stringWriter2));
                return stringWriter2.toString();
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public final void g(E1.c cVar) {
        o oVar = o.f4741f;
        boolean z3 = cVar.f248j;
        cVar.f248j = true;
        boolean z4 = cVar.f249k;
        cVar.f249k = this.f4739f;
        boolean z5 = cVar.f251m;
        cVar.f251m = false;
        try {
            r rVar = u.f4940a;
            z1.k.d(cVar, oVar);
            cVar.f248j = z3;
            cVar.f249k = z4;
            cVar.f251m = z5;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        } catch (AssertionError e3) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e3.getMessage());
            assertionError.initCause(e3);
            throw assertionError;
        } catch (Throwable th) {
            cVar.f248j = z3;
            cVar.f249k = z4;
            cVar.f251m = z5;
            throw th;
        }
    }

    public final void h(Serializable serializable, Class cls, E1.c cVar) {
        r c3 = c(new a(cls));
        boolean z3 = cVar.f248j;
        cVar.f248j = true;
        boolean z4 = cVar.f249k;
        cVar.f249k = this.f4739f;
        boolean z5 = cVar.f251m;
        cVar.f251m = false;
        try {
            c3.b(cVar, serializable);
            cVar.f248j = z3;
            cVar.f249k = z4;
            cVar.f251m = z5;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        } catch (AssertionError e3) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e3.getMessage());
            assertionError.initCause(e3);
            throw assertionError;
        } catch (Throwable th) {
            cVar.f248j = z3;
            cVar.f249k = z4;
            cVar.f251m = z5;
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f4738e + ",instanceCreators:" + this.f4736c + "}";
    }
}
