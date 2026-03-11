package q;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* renamed from: q.i  reason: case insensitive filesystem */
public final class C0379i {

    /* renamed from: a  reason: collision with root package name */
    public final IconCompat f4243a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f4244b;

    /* renamed from: c  reason: collision with root package name */
    public final PendingIntent f4245c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4246d = true;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f4247e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f4248f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4249g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4250h;

    public C0379i(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        this.f4243a = iconCompat;
        this.f4244b = C0386p.b(charSequence);
        this.f4245c = pendingIntent;
        this.f4247e = bundle;
        this.f4248f = null;
        this.f4246d = true;
        this.f4249g = true;
        this.f4250h = false;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q.C0380j a() {
        /*
            r14 = this;
            boolean r0 = r14.f4250h
            if (r0 != 0) goto L_0x0005
            goto L_0x0009
        L_0x0005:
            android.app.PendingIntent r0 = r14.f4245c
            if (r0 == 0) goto L_0x0083
        L_0x0009:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = r14.f4248f
            if (r2 == 0) goto L_0x0042
            java.util.Iterator r2 = r2.iterator()
        L_0x001b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0042
            java.lang.Object r3 = r2.next()
            q.Z r3 = (q.Z) r3
            boolean r4 = r3.f4240c
            if (r4 != 0) goto L_0x003e
            java.lang.CharSequence[] r4 = r3.f4239b
            if (r4 == 0) goto L_0x0032
            int r4 = r4.length
            if (r4 != 0) goto L_0x003e
        L_0x0032:
            java.util.HashSet r4 = r3.f4242e
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x003e
            r0.add(r3)
            goto L_0x001b
        L_0x003e:
            r1.add(r3)
            goto L_0x001b
        L_0x0042:
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto L_0x004b
            r10 = r3
            goto L_0x0058
        L_0x004b:
            int r2 = r0.size()
            q.Z[] r2 = new q.Z[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            q.Z[] r0 = (q.Z[]) r0
            r10 = r0
        L_0x0058:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0060
        L_0x005e:
            r9 = r3
            goto L_0x006e
        L_0x0060:
            int r0 = r1.size()
            q.Z[] r0 = new q.Z[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            r3 = r0
            q.Z[] r3 = (q.Z[]) r3
            goto L_0x005e
        L_0x006e:
            q.j r0 = new q.j
            boolean r11 = r14.f4246d
            boolean r12 = r14.f4249g
            boolean r13 = r14.f4250h
            android.app.PendingIntent r7 = r14.f4245c
            android.os.Bundle r8 = r14.f4247e
            androidx.core.graphics.drawable.IconCompat r5 = r14.f4243a
            java.lang.CharSequence r6 = r14.f4244b
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x0083:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Contextual Actions must contain a valid PendingIntent"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C0379i.a():q.j");
    }
}
