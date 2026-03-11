package T;

import A2.h;
import java.util.ArrayList;

/* renamed from: T.c  reason: case insensitive filesystem */
public final class C0082c extends s {

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f1594e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f1595f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f1596g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f1597h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f1598i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f1599j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f1600k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f1601l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f1602m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f1603n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f1604o;

    public static void c(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size >= 0) {
            arrayList.get(size).getClass();
            throw new ClassCastException();
        }
    }

    public final void a() {
        ArrayList arrayList = this.f1596g;
        int size = arrayList.size() - 1;
        if (size < 0) {
            ArrayList arrayList2 = this.f1594e;
            int size2 = arrayList2.size() - 1;
            while (size2 >= 0) {
                if (arrayList2.get(size2) != null) {
                    throw new ClassCastException();
                } else if (this.f1655a == null) {
                    arrayList2.remove(size2);
                    size2--;
                } else {
                    throw null;
                }
            }
            ArrayList arrayList3 = this.f1595f;
            int size3 = arrayList3.size() - 1;
            if (size3 < 0) {
                ArrayList arrayList4 = this.f1597h;
                int size4 = arrayList4.size() - 1;
                if (size4 < 0) {
                    arrayList4.clear();
                    if (b()) {
                        ArrayList arrayList5 = this.f1599j;
                        int size5 = arrayList5.size() - 1;
                        while (size5 >= 0) {
                            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                            int size6 = arrayList6.size() - 1;
                            if (size6 < 0) {
                                size5--;
                            } else {
                                h.j(arrayList6.get(size6));
                                throw null;
                            }
                        }
                        ArrayList arrayList7 = this.f1598i;
                        int size7 = arrayList7.size() - 1;
                        while (size7 >= 0) {
                            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                            int size8 = arrayList8.size() - 1;
                            if (size8 < 0) {
                                size7--;
                            } else {
                                arrayList8.get(size8).getClass();
                                throw new ClassCastException();
                            }
                        }
                        ArrayList arrayList9 = this.f1600k;
                        int size9 = arrayList9.size() - 1;
                        while (size9 >= 0) {
                            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                            int size10 = arrayList10.size() - 1;
                            if (size10 < 0) {
                                size9--;
                            } else {
                                h.j(arrayList10.get(size10));
                                throw null;
                            }
                        }
                        c(this.f1603n);
                        c(this.f1602m);
                        c(this.f1601l);
                        c(this.f1604o);
                        ArrayList arrayList11 = this.f1656b;
                        if (arrayList11.size() <= 0) {
                            arrayList11.clear();
                        } else {
                            h.j(arrayList11.get(0));
                            throw null;
                        }
                    }
                } else {
                    h.j(arrayList4.get(size4));
                    throw null;
                }
            } else {
                arrayList3.get(size3).getClass();
                throw new ClassCastException();
            }
        } else {
            h.j(arrayList.get(size));
            throw null;
        }
    }

    public final boolean b() {
        if (!this.f1595f.isEmpty() || !this.f1597h.isEmpty() || !this.f1596g.isEmpty() || !this.f1594e.isEmpty() || !this.f1602m.isEmpty() || !this.f1603n.isEmpty() || !this.f1601l.isEmpty() || !this.f1604o.isEmpty() || !this.f1599j.isEmpty() || !this.f1598i.isEmpty() || !this.f1600k.isEmpty()) {
            return true;
        }
        return false;
    }
}
