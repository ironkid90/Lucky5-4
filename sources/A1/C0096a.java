package a1;

import L1.k;
import S1.r;
import android.support.v4.media.session.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: a1.a  reason: case insensitive filesystem */
public final class C0096a {

    /* renamed from: a  reason: collision with root package name */
    public final String f1996a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f1997b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f1998c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1999d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2000e;

    /* renamed from: f  reason: collision with root package name */
    public final d f2001f;

    /* renamed from: g  reason: collision with root package name */
    public final Set f2002g;

    public C0096a(String str, Set set, Set set2, int i3, int i4, d dVar, Set set3) {
        this.f1996a = str;
        this.f1997b = Collections.unmodifiableSet(set);
        this.f1998c = Collections.unmodifiableSet(set2);
        this.f1999d = i3;
        this.f2000e = i4;
        this.f2001f = dVar;
        this.f2002g = Collections.unmodifiableSet(set3);
    }

    public static k a(q qVar) {
        return new k(qVar, new q[0]);
    }

    public static C0096a b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            a.h(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        return new C0096a((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new r(1, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f1997b.toArray()) + ">{" + this.f1999d + ", type=" + this.f2000e + ", deps=" + Arrays.toString(this.f1998c.toArray()) + "}";
    }
}
