package j$.time.zone;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArrayList f5234a;

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap f5235b = new ConcurrentHashMap(512, 0.75f, 2);

    /* renamed from: c  reason: collision with root package name */
    private static volatile Set f5236c;

    /* access modifiers changed from: protected */
    public abstract f c(String str);

    /* access modifiers changed from: protected */
    public abstract Set d();

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f5234a = copyOnWriteArrayList;
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new h(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public static Set a() {
        return f5236c;
    }

    public static f b(String str, boolean z3) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = f5235b;
        j jVar = (j) concurrentHashMap.get(str);
        if (jVar != null) {
            return jVar.c(str);
        }
        if (concurrentHashMap.isEmpty()) {
            throw new RuntimeException("No time-zone data files registered");
        }
        throw new RuntimeException("Unknown time-zone ID: ".concat(str));
    }

    public static void e(j jVar) {
        Objects.requireNonNull(jVar, "provider");
        synchronized (j.class) {
            try {
                for (String str : jVar.d()) {
                    Objects.requireNonNull(str, "zoneId");
                    if (((j) f5235b.putIfAbsent(str, jVar)) != null) {
                        throw new RuntimeException("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + jVar);
                    }
                }
                f5236c = Collections.unmodifiableSet(new HashSet(f5235b.keySet()));
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        f5234a.add(jVar);
    }
}
