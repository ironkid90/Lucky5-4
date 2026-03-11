package q;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import io.flutter.plugin.platform.c;
import java.util.ArrayList;

/* renamed from: q.B  reason: case insensitive filesystem */
public final class C0370B {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f4195a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4196b;

    /* renamed from: c  reason: collision with root package name */
    public final V f4197c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f4198d = new Bundle();

    /* renamed from: e  reason: collision with root package name */
    public String f4199e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f4200f;

    public C0370B(CharSequence charSequence, long j3, V v) {
        this.f4195a = charSequence;
        this.f4196b = j3;
        this.f4197c = v;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0370B b3 = (C0370B) arrayList.get(i3);
            b3.getClass();
            Bundle bundle = new Bundle();
            CharSequence charSequence = b3.f4195a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", b3.f4196b);
            V v = b3.f4197c;
            if (v != null) {
                bundle.putCharSequence("sender", v.f4232a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", C0369A.a(U.b(v)));
                } else {
                    bundle.putBundle("person", v.b());
                }
            }
            String str = b3.f4199e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = b3.f4200f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = b3.f4198d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i3] = bundle;
        }
        return bundleArr;
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [q.V, java.lang.Object] */
    public static ArrayList b(Parcelable[] parcelableArr) {
        V v;
        ArrayList arrayList = new ArrayList(parcelableArr.length);
        for (Bundle bundle : parcelableArr) {
            if (bundle instanceof Bundle) {
                Bundle bundle2 = bundle;
                C0370B b3 = null;
                try {
                    if (bundle2.containsKey("text")) {
                        if (bundle2.containsKey("time")) {
                            if (bundle2.containsKey("person")) {
                                v = V.a(bundle2.getBundle("person"));
                            } else if (bundle2.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                                v = U.a(c.c(bundle2.getParcelable("sender_person")));
                            } else if (bundle2.containsKey("sender")) {
                                CharSequence charSequence = bundle2.getCharSequence("sender");
                                ? obj = new Object();
                                obj.f4232a = charSequence;
                                obj.f4233b = null;
                                obj.f4234c = null;
                                obj.f4235d = null;
                                obj.f4236e = false;
                                obj.f4237f = false;
                                v = obj;
                            } else {
                                v = null;
                            }
                            C0370B b4 = new C0370B(bundle2.getCharSequence("text"), bundle2.getLong("time"), v);
                            if (bundle2.containsKey("type") && bundle2.containsKey("uri")) {
                                b4.f4199e = bundle2.getString("type");
                                b4.f4200f = (Uri) bundle2.getParcelable("uri");
                            }
                            if (bundle2.containsKey("extras")) {
                                b4.f4198d.putAll(bundle2.getBundle("extras"));
                            }
                            b3 = b4;
                        }
                    }
                } catch (ClassCastException unused) {
                }
                if (b3 != null) {
                    arrayList.add(b3);
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.app.Person} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Notification.MessagingStyle.Message c() {
        /*
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            long r3 = r7.f4196b
            java.lang.CharSequence r5 = r7.f4195a
            q.V r6 = r7.f4197c
            if (r0 < r1) goto L_0x0019
            if (r6 != 0) goto L_0x0010
            goto L_0x0014
        L_0x0010:
            android.app.Person r2 = q.U.b(r6)
        L_0x0014:
            android.app.Notification$MessagingStyle$Message r0 = q.C0369A.b(r5, r3, r2)
            goto L_0x0022
        L_0x0019:
            if (r6 != 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            java.lang.CharSequence r2 = r6.f4232a
        L_0x001e:
            android.app.Notification$MessagingStyle$Message r0 = q.C0395z.a(r5, r3, r2)
        L_0x0022:
            java.lang.String r1 = r7.f4199e
            if (r1 == 0) goto L_0x002b
            android.net.Uri r2 = r7.f4200f
            q.C0395z.b(r0, r1, r2)
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C0370B.c():android.app.Notification$MessagingStyle$Message");
    }
}
