package j$.time.temporal;

import j$.time.DayOfWeek;

enum h implements r {
    ;
    
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f5165a = null;

    public final boolean T() {
        return true;
    }

    static {
        f5165a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    static w d0(j$.time.h hVar) {
        return w.j(1, (long) f0(e0(hVar)));
    }

    /* access modifiers changed from: private */
    public static int f0(int i3) {
        j$.time.h g02 = j$.time.h.g0(i3, 1, 1);
        if (g02.W() != DayOfWeek.THURSDAY) {
            return (g02.W() != DayOfWeek.WEDNESDAY || !g02.d0()) ? 52 : 53;
        }
        return 53;
    }

    static int a0(j$.time.h hVar) {
        int ordinal = hVar.W().ordinal();
        int i3 = 1;
        int Z = hVar.Z() - 1;
        int i4 = (3 - ordinal) + Z;
        int i5 = i4 - ((i4 / 7) * 7);
        int i6 = i5 - 3;
        if (i6 < -3) {
            i6 = i5 + 4;
        }
        if (Z < i6) {
            return (int) w.j(1, (long) f0(e0(hVar.s0(180).o0(-1)))).d();
        }
        int i7 = ((Z - i6) / 7) + 1;
        if (i7 != 53 || i6 == -3 || (i6 == -2 && hVar.d0())) {
            i3 = i7;
        }
        return i3;
    }

    /* access modifiers changed from: private */
    public static int e0(j$.time.h hVar) {
        int b02 = hVar.b0();
        int Z = hVar.Z();
        if (Z <= 3) {
            if (Z - hVar.W().ordinal() < -2) {
                return b02 - 1;
            }
            return b02;
        } else if (Z < 363) {
            return b02;
        } else {
            return ((Z - 363) - (hVar.d0() ? 1 : 0)) - hVar.W().ordinal() >= 0 ? b02 + 1 : b02;
        }
    }
}
