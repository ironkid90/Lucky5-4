package M2;

import A2.i;
import H2.d;
import I2.C0068t;
import I2.Q;
import I2.a0;
import L2.e;
import M0.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p2.C0365e;
import p2.C0368h;
import q2.C0401d;
import q2.C0403f;
import q2.l;
import r2.C0420d;
import r2.C0425i;
import r2.C0426j;
import s2.C0466a;
import t2.C0484b;
import t2.C0485c;

public final class n extends C0484b implements e {

    /* renamed from: i  reason: collision with root package name */
    public final e f1121i;

    /* renamed from: j  reason: collision with root package name */
    public final C0425i f1122j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1123k;

    /* renamed from: l  reason: collision with root package name */
    public C0425i f1124l;

    /* renamed from: m  reason: collision with root package name */
    public C0420d f1125m;

    public n(e eVar, C0425i iVar) {
        super(k.f1118f, C0426j.f4457f);
        this.f1121i = eVar;
        this.f1122j = iVar;
        this.f1123k = ((Number) iVar.e(0, m.f1120g)).intValue();
    }

    public final Object b(Object obj, C0420d dVar) {
        try {
            Object p3 = p(dVar, obj);
            if (p3 == C0466a.f4632f) {
                return p3;
            }
            return C0368h.f4194a;
        } catch (Throwable th) {
            this.f1124l = new i(th, dVar.h());
            throw th;
        }
    }

    public final StackTraceElement e() {
        return null;
    }

    public final C0485c g() {
        C0420d dVar = this.f1125m;
        if (dVar instanceof C0485c) {
            return (C0485c) dVar;
        }
        return null;
    }

    public final C0425i h() {
        C0425i iVar = this.f1124l;
        if (iVar == null) {
            return C0426j.f4457f;
        }
        return iVar;
    }

    public final Object l(Object obj) {
        Throwable a2 = C0365e.a(obj);
        if (a2 != null) {
            this.f1124l = new i(a2, h());
        }
        C0420d dVar = this.f1125m;
        if (dVar != null) {
            dVar.m(obj);
        }
        return C0466a.f4632f;
    }

    public final Object p(C0420d dVar, Object obj) {
        List list;
        Comparable comparable;
        int i3;
        String str;
        Object obj2 = obj;
        C0425i h3 = dVar.h();
        Q q3 = (Q) h3.n(C0068t.f786g);
        if (q3 == null || q3.b()) {
            C0425i iVar = this.f1124l;
            if (iVar != h3) {
                int i4 = 0;
                if (iVar instanceof i) {
                    String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((i) iVar).f1116f + ", but then emission attempt of value '" + obj2 + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                    i.e(str2, "<this>");
                    d dVar2 = new d(str2);
                    if (!dVar2.hasNext()) {
                        list = l.f4396f;
                    } else {
                        Object next = dVar2.next();
                        if (!dVar2.hasNext()) {
                            list = a.A(next);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(next);
                            while (dVar2.hasNext()) {
                                arrayList.add(dVar2.next());
                            }
                            list = arrayList;
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object next2 : list) {
                        if (!H2.l.h0((String) next2)) {
                            arrayList2.add(next2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(C0403f.c0(arrayList2));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        int length = str3.length();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                i5 = -1;
                                break;
                            }
                            char charAt = str3.charAt(i5);
                            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                                break;
                            }
                            i5++;
                        }
                        if (i5 == -1) {
                            i5 = str3.length();
                        }
                        arrayList3.add(Integer.valueOf(i5));
                    }
                    Iterator it2 = arrayList3.iterator();
                    if (!it2.hasNext()) {
                        comparable = null;
                    } else {
                        comparable = (Comparable) it2.next();
                        while (it2.hasNext()) {
                            Comparable comparable2 = (Comparable) it2.next();
                            if (comparable.compareTo(comparable2) > 0) {
                                comparable = comparable2;
                            }
                        }
                    }
                    Integer num = (Integer) comparable;
                    if (num != null) {
                        i3 = num.intValue();
                    } else {
                        i3 = 0;
                    }
                    int length2 = str2.length();
                    list.size();
                    int size = list.size() - 1;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object next3 : list) {
                        int i6 = i4 + 1;
                        if (i4 >= 0) {
                            String str4 = (String) next3;
                            if ((i4 == 0 || i4 == size) && H2.l.h0(str4)) {
                                str = null;
                            } else {
                                i.e(str4, "<this>");
                                if (i3 >= 0) {
                                    int length3 = str4.length();
                                    if (i3 <= length3) {
                                        length3 = i3;
                                    }
                                    str = str4.substring(length3);
                                    i.d(str, "substring(...)");
                                } else {
                                    throw new IllegalArgumentException(("Requested character count " + i3 + " is less than zero.").toString());
                                }
                            }
                            if (str != null) {
                                arrayList4.add(str);
                            }
                            i4 = i6;
                        } else {
                            throw new ArithmeticException("Index overflow has happened.");
                        }
                    }
                    StringBuilder sb = new StringBuilder(length2);
                    C0401d.d0(arrayList4, sb, "\n", "", "", -1, "...", (z2.l) null);
                    throw new IllegalStateException(sb.toString().toString());
                } else if (((Number) h3.e(0, new q(this))).intValue() == this.f1123k) {
                    this.f1124l = h3;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f1122j + ",\n\t\tbut emission happened in " + h3 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            }
            this.f1125m = dVar;
            o oVar = p.f1127a;
            e eVar = this.f1121i;
            i.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
            oVar.getClass();
            Object b3 = eVar.b(obj2, this);
            if (!i.a(b3, C0466a.f4632f)) {
                this.f1125m = null;
            }
            return b3;
        }
        throw ((a0) q3).A();
    }
}
