package q;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.ai9poker.app.R;
import io.flutter.plugin.platform.c;
import io.flutter.plugin.platform.f;
import r.C0409b;
import u.C0490b;

/* renamed from: q.u  reason: case insensitive filesystem */
public final class C0390u extends D {

    /* renamed from: e  reason: collision with root package name */
    public int f4300e;

    /* renamed from: f  reason: collision with root package name */
    public V f4301f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f4302g;

    /* renamed from: h  reason: collision with root package name */
    public PendingIntent f4303h;

    /* renamed from: i  reason: collision with root package name */
    public PendingIntent f4304i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4305j;

    /* renamed from: k  reason: collision with root package name */
    public Integer f4306k;

    /* renamed from: l  reason: collision with root package name */
    public Integer f4307l;

    /* renamed from: m  reason: collision with root package name */
    public IconCompat f4308m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f4309n;

    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("android.callType", this.f4300e);
        bundle.putBoolean("android.callIsVideo", this.f4305j);
        V v = this.f4301f;
        if (v != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable("android.callPerson", C0388s.b(U.b(v)));
            } else {
                bundle.putParcelable("android.callPersonCompat", v.b());
            }
        }
        IconCompat iconCompat = this.f4308m;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", r.a(C0490b.f(iconCompat, this.f4206a.f4275a)));
        }
        bundle.putCharSequence("android.verificationText", this.f4309n);
        bundle.putParcelable("android.answerIntent", this.f4302g);
        bundle.putParcelable("android.declineIntent", this.f4303h);
        bundle.putParcelable("android.hangUpIntent", this.f4304i);
        Integer num = this.f4306k;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.f4307l;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }

    public final void b(f fVar) {
        CharSequence charSequence;
        Notification.CallStyle callStyle;
        int i3 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) fVar.f3380c;
        Notification.CallStyle callStyle2 = null;
        if (i3 >= 31) {
            int i4 = this.f4300e;
            if (i4 == 1) {
                V v = this.f4301f;
                v.getClass();
                callStyle2 = C0389t.a(U.b(v), this.f4303h, this.f4302g);
            } else if (i4 == 2) {
                V v3 = this.f4301f;
                v3.getClass();
                callStyle2 = C0389t.b(U.b(v3), this.f4304i);
            } else if (i4 == 3) {
                V v4 = this.f4301f;
                v4.getClass();
                callStyle2 = C0389t.c(U.b(v4), this.f4304i, this.f4302g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f4300e));
            }
            if (callStyle2 != null) {
                callStyle2.setBuilder(builder);
                Integer num = this.f4306k;
                if (num != null) {
                    C0389t.d(callStyle2, num.intValue());
                }
                Integer num2 = this.f4307l;
                if (num2 != null) {
                    C0389t.f(callStyle2, num2.intValue());
                }
                C0389t.i(callStyle2, this.f4309n);
                IconCompat iconCompat = this.f4308m;
                if (iconCompat != null) {
                    C0389t.h(callStyle2, C0490b.f(iconCompat, this.f4206a.f4275a));
                }
                C0389t.g(callStyle2, this.f4305j);
                return;
            }
            return;
        }
        V v5 = this.f4301f;
        if (v5 != null) {
            charSequence = v5.f4232a;
        } else {
            charSequence = null;
        }
        builder.setContentTitle(charSequence);
        Bundle bundle = this.f4206a.f4298y;
        if (bundle == null || !bundle.containsKey("android.text")) {
            callStyle = null;
        } else {
            callStyle = this.f4206a.f4298y.getCharSequence("android.text");
        }
        if (callStyle == null) {
            int i5 = this.f4300e;
            if (i5 == 1) {
                callStyle2 = this.f4206a.f4275a.getResources().getString(R.string.call_notification_incoming_text);
            } else if (i5 == 2) {
                callStyle2 = this.f4206a.f4275a.getResources().getString(R.string.call_notification_ongoing_text);
            } else if (i5 == 3) {
                callStyle2 = this.f4206a.f4275a.getResources().getString(R.string.call_notification_screening_text);
            }
            callStyle = callStyle2;
        }
        builder.setContentText(callStyle);
        V v6 = this.f4301f;
        if (v6 != null) {
            IconCompat iconCompat2 = v6.f4233b;
            if (iconCompat2 != null) {
                r.c(builder, C0490b.f(iconCompat2, this.f4206a.f4275a));
            }
            if (i3 >= 28) {
                V v7 = this.f4301f;
                v7.getClass();
                C0388s.a(builder, U.b(v7));
            } else {
                C0387q.a(builder, this.f4301f.f4234c);
            }
        }
        C0387q.b(builder, "call");
    }

    public final String c() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    public final void d(Bundle bundle) {
        Integer num;
        super.d(bundle);
        this.f4300e = bundle.getInt("android.callType");
        this.f4305j = bundle.getBoolean("android.callIsVideo");
        if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
            this.f4301f = U.a(c.c(bundle.getParcelable("android.callPerson")));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.f4301f = V.a(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            this.f4308m = IconCompat.b((Icon) bundle.getParcelable("android.verificationIcon"));
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.f4308m = IconCompat.a(bundle.getBundle("android.verificationIconCompat"));
        }
        this.f4309n = bundle.getCharSequence("android.verificationText");
        this.f4302g = (PendingIntent) bundle.getParcelable("android.answerIntent");
        this.f4303h = (PendingIntent) bundle.getParcelable("android.declineIntent");
        this.f4304i = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
        Integer num2 = null;
        if (bundle.containsKey("android.answerColor")) {
            num = Integer.valueOf(bundle.getInt("android.answerColor"));
        } else {
            num = null;
        }
        this.f4306k = num;
        if (bundle.containsKey("android.declineColor")) {
            num2 = Integer.valueOf(bundle.getInt("android.declineColor"));
        }
        this.f4307l = num2;
    }

    public final C0380j e(int i3, int i4, Integer num, int i5, PendingIntent pendingIntent) {
        if (num == null) {
            num = Integer.valueOf(C0409b.a(this.f4206a.f4275a, i5));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(this.f4206a.f4275a.getResources().getString(i4));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        Context context = this.f4206a.f4275a;
        PorterDuff.Mode mode = IconCompat.f2295k;
        context.getClass();
        C0380j a2 = new C0379i(IconCompat.e(context.getResources(), context.getPackageName(), i3), spannableStringBuilder, pendingIntent).a();
        a2.f4251a.putBoolean("key_action_priority", true);
        return a2;
    }
}
