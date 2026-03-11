package androidx.datastore.preferences.protobuf;

import a.C0094a;

public abstract class l0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0094a f2456a;

    static {
        j0 j0Var;
        if (!i0.f2446d || !i0.f2445c || C0099c.a()) {
            j0Var = new j0(0);
        } else {
            j0Var = new j0(1);
        }
        f2456a = j0Var;
    }

    public static int a(String str) {
        int length = str.length();
        int i3 = 0;
        int i4 = 0;
        while (i4 < length && str.charAt(i4) < 128) {
            i4++;
        }
        int i5 = length;
        while (true) {
            if (i4 >= length) {
                break;
            }
            char charAt = str.charAt(i4);
            if (charAt < 2048) {
                i5 += (127 - charAt) >>> 31;
                i4++;
            } else {
                int length2 = str.length();
                while (i4 < length2) {
                    char charAt2 = str.charAt(i4);
                    if (charAt2 < 2048) {
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i4) >= 65536) {
                                i4++;
                            } else {
                                throw new k0(i4, length2);
                            }
                        }
                    }
                    i4++;
                }
                i5 += i3;
            }
        }
        if (i5 >= length) {
            return i5;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i5) + 4294967296L));
    }
}
