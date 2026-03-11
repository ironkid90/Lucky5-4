package io.flutter.plugin.platform;

import A.W;
import A.Y;
import C0.r;
import L.j;
import L1.k;
import M0.a;
import S1.C0078d;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import b2.h;
import com.ai9poker.app.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import n.C0336c;
import q.C0380j;
import q.C0386p;
import q.C0390u;
import q.D;
import q.E;
import q.F;
import q.G;
import q.H;
import q.I;
import q.J;
import q.K;
import q.L;
import q.U;
import q.V;
import q.Z;
import u.C0490b;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f3378a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f3379b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3380c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3381d;

    /* renamed from: e  reason: collision with root package name */
    public Object f3382e;

    public f(C0386p pVar) {
        Icon icon;
        ArrayList arrayList;
        Notification notification;
        Bundle bundle;
        ArrayList arrayList2;
        Notification notification2;
        ArrayList arrayList3;
        Bundle[] bundleArr;
        ArrayList arrayList4;
        C0380j jVar;
        C0380j jVar2;
        int i3;
        f fVar = this;
        C0386p pVar2 = pVar;
        new ArrayList();
        fVar.f3382e = new Bundle();
        fVar.f3381d = pVar2;
        Context context = pVar2.f4275a;
        fVar.f3379b = context;
        if (Build.VERSION.SDK_INT >= 26) {
            fVar.f3380c = I.a(context, pVar2.f4267B);
        } else {
            fVar.f3380c = new Notification.Builder(pVar2.f4275a);
        }
        Notification notification3 = pVar2.f4272G;
        ((Notification.Builder) fVar.f3380c).setWhen(notification3.when).setSmallIcon(notification3.icon, notification3.iconLevel).setContent(notification3.contentView).setTicker(notification3.tickerText, (RemoteViews) null).setVibrate(notification3.vibrate).setLights(notification3.ledARGB, notification3.ledOnMS, notification3.ledOffMS).setOngoing((notification3.flags & 2) != 0).setOnlyAlertOnce((notification3.flags & 8) != 0).setAutoCancel((notification3.flags & 16) != 0).setDefaults(notification3.defaults).setContentTitle(pVar2.f4279e).setContentText(pVar2.f4280f).setContentInfo((CharSequence) null).setContentIntent(pVar2.f4281g).setDeleteIntent(notification3.deleteIntent).setFullScreenIntent(pVar2.f4282h, (notification3.flags & 128) != 0).setNumber(pVar2.f4284j).setProgress(pVar2.f4290p, pVar2.f4291q, pVar2.f4292r);
        Notification.Builder builder = (Notification.Builder) fVar.f3380c;
        IconCompat iconCompat = pVar2.f4283i;
        if (iconCompat == null) {
            icon = null;
        } else {
            icon = C0490b.f(iconCompat, context);
        }
        G.b(builder, icon);
        ((Notification.Builder) fVar.f3380c).setSubText(pVar2.f4289o).setUsesChronometer(pVar2.f4287m).setPriority(pVar2.f4285k);
        D d3 = pVar2.f4288n;
        if (d3 instanceof C0390u) {
            C0390u uVar = (C0390u) d3;
            PendingIntent pendingIntent = uVar.f4303h;
            if (pendingIntent == null) {
                jVar = uVar.e(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, uVar.f4307l, R.color.call_notification_decline_color, uVar.f4304i);
            } else {
                jVar = uVar.e(R.drawable.ic_call_decline, R.string.call_notification_decline_action, uVar.f4307l, R.color.call_notification_decline_color, pendingIntent);
            }
            PendingIntent pendingIntent2 = uVar.f4302g;
            if (pendingIntent2 == null) {
                jVar2 = null;
            } else {
                boolean z3 = uVar.f4305j;
                jVar2 = uVar.e(z3 ? R.drawable.ic_call_answer_video : R.drawable.ic_call_answer, z3 ? R.string.call_notification_answer_video_action : R.string.call_notification_answer_action, uVar.f4306k, R.color.call_notification_answer_color, pendingIntent2);
            }
            ArrayList arrayList5 = new ArrayList(3);
            arrayList5.add(jVar);
            ArrayList arrayList6 = uVar.f4206a.f4276b;
            if (arrayList6 != null) {
                Iterator it = arrayList6.iterator();
                i3 = 2;
                while (it.hasNext()) {
                    C0380j jVar3 = (C0380j) it.next();
                    if (jVar3.f4256f) {
                        arrayList5.add(jVar3);
                    } else if (!jVar3.f4251a.getBoolean("key_action_priority") && i3 > 1) {
                        arrayList5.add(jVar3);
                        i3--;
                    }
                    if (jVar2 != null && i3 == 1) {
                        arrayList5.add(jVar2);
                        i3--;
                    }
                }
            } else {
                i3 = 2;
            }
            if (jVar2 != null && i3 >= 1) {
                arrayList5.add(jVar2);
            }
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                fVar.a((C0380j) it2.next());
            }
        } else {
            Iterator it3 = pVar2.f4276b.iterator();
            while (it3.hasNext()) {
                fVar.a((C0380j) it3.next());
            }
        }
        Bundle bundle2 = pVar2.f4298y;
        if (bundle2 != null) {
            ((Bundle) fVar.f3382e).putAll(bundle2);
        }
        int i4 = Build.VERSION.SDK_INT;
        ((Notification.Builder) fVar.f3380c).setShowWhen(pVar2.f4286l);
        E.i((Notification.Builder) fVar.f3380c, pVar2.f4295u);
        E.g((Notification.Builder) fVar.f3380c, pVar2.f4293s);
        E.j((Notification.Builder) fVar.f3380c, (String) null);
        E.h((Notification.Builder) fVar.f3380c, pVar2.f4294t);
        fVar.f3378a = pVar2.f4270E;
        F.b((Notification.Builder) fVar.f3380c, pVar2.f4297x);
        F.c((Notification.Builder) fVar.f3380c, pVar2.f4299z);
        F.f((Notification.Builder) fVar.f3380c, pVar2.f4266A);
        F.d((Notification.Builder) fVar.f3380c, (Notification) null);
        F.e((Notification.Builder) fVar.f3380c, notification3.sound, notification3.audioAttributes);
        ArrayList<String> arrayList7 = pVar2.f4274I;
        ArrayList arrayList8 = pVar2.f4277c;
        if (i4 < 28) {
            if (arrayList8 == null) {
                arrayList4 = null;
            } else {
                arrayList4 = new ArrayList(arrayList8.size());
                Iterator it4 = arrayList8.iterator();
                while (it4.hasNext()) {
                    V v = (V) it4.next();
                    String str = v.f4234c;
                    if (str == null) {
                        CharSequence charSequence = v.f4232a;
                        if (charSequence != null) {
                            str = "name:" + charSequence;
                        } else {
                            str = "";
                        }
                    }
                    arrayList4.add(str);
                }
            }
            if (arrayList4 != null) {
                if (arrayList7 == null) {
                    arrayList7 = arrayList4;
                } else {
                    C0336c cVar = new C0336c(arrayList7.size() + arrayList4.size());
                    cVar.addAll(arrayList4);
                    cVar.addAll(arrayList7);
                    arrayList7 = new ArrayList<>(cVar);
                }
            }
        }
        if (arrayList7 != null && !arrayList7.isEmpty()) {
            for (String a2 : arrayList7) {
                F.a((Notification.Builder) fVar.f3380c, a2);
            }
        }
        ArrayList arrayList9 = pVar2.f4278d;
        if (arrayList9.size() > 0) {
            if (pVar2.f4298y == null) {
                pVar2.f4298y = new Bundle();
            }
            Bundle bundle3 = pVar2.f4298y.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i5 = 0;
            while (i5 < arrayList9.size()) {
                String num = Integer.toString(i5);
                C0380j jVar4 = (C0380j) arrayList9.get(i5);
                Bundle bundle6 = new Bundle();
                IconCompat a3 = jVar4.a();
                bundle6.putInt("icon", a3 != null ? a3.f() : 0);
                bundle6.putCharSequence("title", jVar4.f4258h);
                bundle6.putParcelable("actionIntent", jVar4.f4259i);
                Bundle bundle7 = jVar4.f4251a;
                if (bundle7 != null) {
                    bundle = new Bundle(bundle7);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", jVar4.f4254d);
                bundle6.putBundle("extras", bundle);
                Z[] zArr = jVar4.f4253c;
                if (zArr == null) {
                    arrayList3 = arrayList9;
                    notification2 = notification3;
                    arrayList2 = arrayList8;
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[zArr.length];
                    arrayList3 = arrayList9;
                    notification2 = notification3;
                    int i6 = 0;
                    while (i6 < zArr.length) {
                        Z z4 = zArr[i6];
                        Z[] zArr2 = zArr;
                        Bundle bundle8 = new Bundle();
                        z4.getClass();
                        ArrayList arrayList10 = arrayList8;
                        bundle8.putString("resultKey", "FlutterLocalNotificationsPluginInputResult");
                        bundle8.putCharSequence("label", z4.f4238a);
                        bundle8.putCharSequenceArray("choices", z4.f4239b);
                        bundle8.putBoolean("allowFreeFormInput", z4.f4240c);
                        bundle8.putBundle("extras", z4.f4241d);
                        HashSet hashSet = z4.f4242e;
                        if (!hashSet.isEmpty()) {
                            ArrayList arrayList11 = new ArrayList(hashSet.size());
                            Iterator it5 = hashSet.iterator();
                            while (it5.hasNext()) {
                                arrayList11.add((String) it5.next());
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList11);
                        }
                        bundleArr[i6] = bundle8;
                        i6++;
                        zArr = zArr2;
                        arrayList8 = arrayList10;
                    }
                    arrayList2 = arrayList8;
                }
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", jVar4.f4255e);
                bundle6.putInt("semanticAction", 0);
                bundle5.putBundle(num, bundle6);
                i5++;
                arrayList9 = arrayList3;
                notification3 = notification2;
                arrayList8 = arrayList2;
            }
            notification = notification3;
            arrayList = arrayList8;
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (pVar2.f4298y == null) {
                pVar2.f4298y = new Bundle();
            }
            pVar2.f4298y.putBundle("android.car.EXTENSIONS", bundle3);
            fVar = this;
            ((Bundle) fVar.f3382e).putBundle("android.car.EXTENSIONS", bundle4);
        } else {
            notification = notification3;
            arrayList = arrayList8;
        }
        int i7 = Build.VERSION.SDK_INT;
        ((Notification.Builder) fVar.f3380c).setExtras(pVar2.f4298y);
        H.e((Notification.Builder) fVar.f3380c, (CharSequence[]) null);
        if (i7 >= 26) {
            I.b((Notification.Builder) fVar.f3380c, 0);
            I.e((Notification.Builder) fVar.f3380c, (CharSequence) null);
            I.f((Notification.Builder) fVar.f3380c, pVar2.f4268C);
            I.g((Notification.Builder) fVar.f3380c, pVar2.f4269D);
            I.d((Notification.Builder) fVar.f3380c, pVar2.f4270E);
            if (pVar2.f4296w) {
                I.c((Notification.Builder) fVar.f3380c, pVar2.v);
            }
            if (!TextUtils.isEmpty(pVar2.f4267B)) {
                ((Notification.Builder) fVar.f3380c).setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i7 >= 28) {
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                V v3 = (V) it6.next();
                v3.getClass();
                J.a((Notification.Builder) fVar.f3380c, U.b(v3));
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            K.a((Notification.Builder) fVar.f3380c, pVar2.f4271F);
            K.b((Notification.Builder) fVar.f3380c, (Notification.BubbleMetadata) null);
        }
        if (pVar2.f4273H) {
            if (((C0386p) fVar.f3381d).f4294t) {
                fVar.f3378a = 2;
            } else {
                fVar.f3378a = 1;
            }
            ((Notification.Builder) fVar.f3380c).setVibrate((long[]) null);
            ((Notification.Builder) fVar.f3380c).setSound((Uri) null);
            Notification notification4 = notification;
            int i9 = notification4.defaults & -4;
            notification4.defaults = i9;
            ((Notification.Builder) fVar.f3380c).setDefaults(i9);
            if (i8 >= 26) {
                if (TextUtils.isEmpty(((C0386p) fVar.f3381d).f4293s)) {
                    E.g((Notification.Builder) fVar.f3380c, "silent");
                }
                I.d((Notification.Builder) fVar.f3380c, fVar.f3378a);
            }
        }
    }

    public void a(C0380j jVar) {
        Bundle bundle;
        IconCompat a2 = jVar.a();
        Icon icon = null;
        if (a2 != null) {
            icon = C0490b.f(a2, (Context) null);
        }
        Notification.Action.Builder a3 = G.a(icon, jVar.f4258h, jVar.f4259i);
        Z[] zArr = jVar.f4253c;
        if (zArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[zArr.length];
            for (int i3 = 0; i3 < zArr.length; i3++) {
                remoteInputArr[i3] = Z.a(zArr[i3]);
            }
            for (RemoteInput c3 : remoteInputArr) {
                E.c(a3, c3);
            }
        }
        Bundle bundle2 = jVar.f4251a;
        if (bundle2 != null) {
            bundle = new Bundle(bundle2);
        } else {
            bundle = new Bundle();
        }
        boolean z3 = jVar.f4254d;
        bundle.putBoolean("android.support.allowGeneratedReplies", z3);
        int i4 = Build.VERSION.SDK_INT;
        H.a(a3, z3);
        bundle.putInt("android.support.action.semanticAction", 0);
        if (i4 >= 28) {
            J.b(a3, 0);
        }
        if (i4 >= 29) {
            K.c(a3, jVar.f4256f);
        }
        if (i4 >= 31) {
            L.a(a3, false);
        }
        bundle.putBoolean("android.support.action.showsUserInterface", jVar.f4255e);
        E.b(a3, bundle);
        E.a((Notification.Builder) this.f3380c, E.d(a3));
    }

    public void b(k kVar) {
        a aVar;
        Window window = ((C0078d) this.f3379b).getWindow();
        window.getDecorView();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            aVar = new Y(window);
        } else if (i3 >= 26) {
            aVar = new W(window);
        } else {
            aVar = new W(window);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i5 = kVar.f960d;
        if (i5 != 0) {
            int b3 = j.b(i5);
            if (b3 == 0) {
                aVar.O(false);
            } else if (b3 == 1) {
                aVar.O(true);
            }
        }
        Integer num = (Integer) kVar.f957a;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = (Boolean) kVar.f962f;
        if (bool != null && i4 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i4 >= 26) {
            int i6 = kVar.f961e;
            if (i6 != 0) {
                int b4 = j.b(i6);
                if (b4 == 0) {
                    aVar.N(false);
                } else if (b4 == 1) {
                    aVar.N(true);
                }
            }
            Integer num2 = (Integer) kVar.f958b;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = (Integer) kVar.f959c;
        if (num3 != null && i4 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = (Boolean) kVar.f963g;
        if (bool2 != null && i4 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f3382e = kVar;
    }

    public void c() {
        ((C0078d) this.f3379b).getWindow().getDecorView().setSystemUiVisibility(this.f3378a);
        k kVar = (k) this.f3382e;
        if (kVar != null) {
            b(kVar);
        }
    }

    public f(C0078d dVar, r rVar, C0078d dVar2) {
        h hVar = new h(7, this);
        this.f3379b = dVar;
        this.f3381d = rVar;
        rVar.f161h = hVar;
        this.f3380c = dVar2;
        this.f3378a = 1280;
    }
}
