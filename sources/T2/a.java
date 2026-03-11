package T2;

import A2.i;
import android.media.AudioAttributes;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1729a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1730b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1731c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1732d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1733e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1734f;

    public a(boolean z3, boolean z4, int i3, int i4, int i5, int i6) {
        this.f1729a = z3;
        this.f1730b = z4;
        this.f1731c = i3;
        this.f1732d = i4;
        this.f1733e = i5;
        this.f1734f = i6;
    }

    public static a b(a aVar) {
        boolean z3 = aVar.f1729a;
        boolean z4 = aVar.f1730b;
        int i3 = aVar.f1731c;
        int i4 = aVar.f1732d;
        int i5 = aVar.f1733e;
        int i6 = aVar.f1734f;
        aVar.getClass();
        return new a(z3, z4, i3, i4, i5, i6);
    }

    public final AudioAttributes a() {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(this.f1732d).setContentType(this.f1731c).build();
        i.d(build, "build(...)");
        return build;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (T2.a) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof T2.a
            if (r0 == 0) goto L_0x002c
            T2.a r3 = (T2.a) r3
            boolean r0 = r3.f1729a
            boolean r1 = r2.f1729a
            if (r1 != r0) goto L_0x002c
            boolean r0 = r2.f1730b
            boolean r1 = r3.f1730b
            if (r0 != r1) goto L_0x002c
            int r0 = r2.f1731c
            int r1 = r3.f1731c
            if (r0 != r1) goto L_0x002c
            int r0 = r2.f1732d
            int r1 = r3.f1732d
            if (r0 != r1) goto L_0x002c
            int r0 = r2.f1733e
            int r1 = r3.f1733e
            if (r0 != r1) goto L_0x002c
            int r0 = r2.f1734f
            int r3 = r3.f1734f
            if (r0 != r3) goto L_0x002c
            r3 = 1
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.f1729a), Boolean.valueOf(this.f1730b), Integer.valueOf(this.f1731c), Integer.valueOf(this.f1732d), Integer.valueOf(this.f1733e), Integer.valueOf(this.f1734f)});
    }

    public final String toString() {
        return "AudioContextAndroid(isSpeakerphoneOn=" + this.f1729a + ", stayAwake=" + this.f1730b + ", contentType=" + this.f1731c + ", usageType=" + this.f1732d + ", audioFocus=" + this.f1733e + ", audioMode=" + this.f1734f + ')';
    }
}
