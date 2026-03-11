package s1;

import android.net.Uri;
import android.text.TextUtils;
import b2.h;

/* renamed from: s1.w  reason: case insensitive filesystem */
public final class C0462w {

    /* renamed from: a  reason: collision with root package name */
    public final String f4600a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4601b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f4602c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4603d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4604e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f4605f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4606g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4607h;

    /* renamed from: i  reason: collision with root package name */
    public final String f4608i;

    /* renamed from: j  reason: collision with root package name */
    public final String f4609j;

    /* renamed from: k  reason: collision with root package name */
    public final String f4610k;

    /* renamed from: l  reason: collision with root package name */
    public final String f4611l;

    /* renamed from: m  reason: collision with root package name */
    public final String f4612m;

    /* renamed from: n  reason: collision with root package name */
    public final Uri f4613n;

    /* renamed from: o  reason: collision with root package name */
    public final String f4614o;

    /* renamed from: p  reason: collision with root package name */
    public final Integer f4615p;

    /* renamed from: q  reason: collision with root package name */
    public final Integer f4616q;

    /* renamed from: r  reason: collision with root package name */
    public final Integer f4617r;

    public C0462w(h hVar) {
        String[] strArr;
        String[] strArr2;
        this.f4600a = hVar.w("gcm.n.title");
        this.f4601b = hVar.s("gcm.n.title");
        Object[] q3 = hVar.q("gcm.n.title");
        Uri uri = null;
        if (q3 == null) {
            strArr = null;
        } else {
            strArr = new String[q3.length];
            for (int i3 = 0; i3 < q3.length; i3++) {
                strArr[i3] = String.valueOf(q3[i3]);
            }
        }
        this.f4602c = strArr;
        this.f4603d = hVar.w("gcm.n.body");
        this.f4604e = hVar.s("gcm.n.body");
        Object[] q4 = hVar.q("gcm.n.body");
        if (q4 == null) {
            strArr2 = null;
        } else {
            strArr2 = new String[q4.length];
            for (int i4 = 0; i4 < q4.length; i4++) {
                strArr2[i4] = String.valueOf(q4[i4]);
            }
        }
        this.f4605f = strArr2;
        this.f4606g = hVar.w("gcm.n.icon");
        String w3 = hVar.w("gcm.n.sound2");
        this.f4608i = TextUtils.isEmpty(w3) ? hVar.w("gcm.n.sound") : w3;
        this.f4609j = hVar.w("gcm.n.tag");
        this.f4610k = hVar.w("gcm.n.color");
        this.f4611l = hVar.w("gcm.n.click_action");
        this.f4612m = hVar.w("gcm.n.android_channel_id");
        String w4 = hVar.w("gcm.n.link_android");
        w4 = TextUtils.isEmpty(w4) ? hVar.w("gcm.n.link") : w4;
        this.f4613n = !TextUtils.isEmpty(w4) ? Uri.parse(w4) : uri;
        this.f4607h = hVar.w("gcm.n.image");
        this.f4614o = hVar.w("gcm.n.ticker");
        this.f4615p = hVar.n("gcm.n.notification_priority");
        this.f4616q = hVar.n("gcm.n.visibility");
        this.f4617r = hVar.n("gcm.n.notification_count");
        hVar.j("gcm.n.sticky");
        hVar.j("gcm.n.local_only");
        hVar.j("gcm.n.default_sound");
        hVar.j("gcm.n.default_vibrate_timings");
        hVar.j("gcm.n.default_light_settings");
        hVar.t();
        hVar.p();
        hVar.x();
    }
}
