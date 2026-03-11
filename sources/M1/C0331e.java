package m1;

import G0.o;

/* renamed from: m1.e  reason: case insensitive filesystem */
public final class C0331e extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0331e(String str) {
        super(str);
        o.c(str, "Detail message must not be empty");
    }
}
