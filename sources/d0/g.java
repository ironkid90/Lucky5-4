package D0;

import A0.a;
import A2.i;
import G0.f;
import R2.l;
import S2.c;
import U1.b;
import W0.o;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import c2.n;
import c2.q;
import c2.x;
import com.ai9poker.app.R;
import i.C0207i;
import i.C0212n;
import i.C0217s;
import j1.e;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import n.C0338e;
import n.k;
import o0.C0356d;
import org.json.JSONArray;
import org.json.JSONObject;
import r.C0414g;
import s1.C0464y;
import t0.C0477b;
import x0.C0510b;
import x0.C0511c;
import x0.C0513e;
import y1.m;

public final class g implements a, Q.a, C0212n, C0477b, m {

    /* renamed from: g  reason: collision with root package name */
    public static g f205g;

    /* renamed from: h  reason: collision with root package name */
    public static g f206h;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f207f;

    public /* synthetic */ g(int i3, boolean z3) {
        this.f207f = i3;
    }

    public static final boolean e(l lVar) {
        l lVar2 = c.f1533c;
        String b3 = lVar.b();
        return !H2.l.i0(b3.length() - ".class".length(), 0, ".class".length(), b3, ".class", true);
    }

    public static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static n h(Context context, String[] strArr, String str, C0464y yVar) {
        String[] l3 = l(context);
        int length = l3.length;
        int i3 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i3 >= length) {
                return null;
            }
            String str2 = l3[i3];
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i4 = i5;
                }
            }
            if (zipFile != null) {
                int i6 = 0;
                while (true) {
                    int i7 = i6 + 1;
                    if (i6 < 5) {
                        for (String append : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c3 = File.separatorChar;
                            sb.append(c3);
                            sb.append(append);
                            sb.append(c3);
                            sb.append(str);
                            String sb2 = sb.toString();
                            yVar.i("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                n nVar = new n(9);
                                nVar.f2789g = zipFile;
                                nVar.f2790h = entry;
                                return nVar;
                            }
                        }
                        i6 = i7;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i3++;
        }
    }

    public static String[] i(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c3 = File.separatorChar;
        sb.append(c3);
        sb.append("([^\\");
        sb.append(c3);
        sb.append("]*)");
        sb.append(c3);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String file : l(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(file), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(((ZipEntry) entries.nextElement()).getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static boolean j() {
        return ((Boolean) J1.a.f802f.f1055f.a()).booleanValue();
    }

    public static void k(Context context) {
        i.e(context, "context");
        if (j()) {
            Intent intent = new Intent(context, J1.a.class);
            SharedPreferences.Editor edit = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS", 0).edit();
            edit.putString("foregroundServiceAction", "com.pravera.flutter_foreground_task.action.api_restart");
            edit.commit();
            C0414g.b(context, intent);
            return;
        }
        throw new H1.a(6);
    }

    public static String[] l(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m(android.content.Context r31, java.lang.Object r32) {
        /*
            r0 = r31
            r1 = r32
            java.lang.String r2 = "context"
            A2.i.e(r0, r2)
            boolean r2 = j()
            if (r2 != 0) goto L_0x036f
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<J1.a> r3 = J1.a.class
            r2.<init>(r0, r3)
            boolean r3 = r1 instanceof java.util.Map
            if (r3 == 0) goto L_0x001d
            java.util.Map r1 = (java.util.Map) r1
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            java.lang.String r3 = "com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS"
            r5 = 0
            android.content.SharedPreferences r3 = r0.getSharedPreferences(r3, r5)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r6 = "foregroundServiceAction"
            java.lang.String r7 = "com.pravera.flutter_foreground_task.action.api_start"
            r3.putString(r6, r7)
            r3.commit()
            java.lang.String r3 = "com.pravera.flutter_foreground_task.prefs.NOTIFICATION_OPTIONS"
            android.content.SharedPreferences r6 = r0.getSharedPreferences(r3, r5)
            java.lang.String r7 = "serviceId"
            if (r1 == 0) goto L_0x0042
            java.lang.Object r8 = r1.get(r7)
            goto L_0x0043
        L_0x0042:
            r8 = 0
        L_0x0043:
            boolean r9 = r8 instanceof java.lang.Integer
            if (r9 == 0) goto L_0x004a
            java.lang.Integer r8 = (java.lang.Integer) r8
            goto L_0x004b
        L_0x004a:
            r8 = 0
        L_0x004b:
            if (r8 == 0) goto L_0x0052
        L_0x004d:
            int r8 = r8.intValue()
            goto L_0x0069
        L_0x0052:
            if (r1 == 0) goto L_0x005b
            java.lang.String r8 = "notificationId"
            java.lang.Object r8 = r1.get(r8)
            goto L_0x005c
        L_0x005b:
            r8 = 0
        L_0x005c:
            boolean r9 = r8 instanceof java.lang.Integer
            if (r9 == 0) goto L_0x0063
            java.lang.Integer r8 = (java.lang.Integer) r8
            goto L_0x0064
        L_0x0063:
            r8 = 0
        L_0x0064:
            if (r8 == 0) goto L_0x0067
            goto L_0x004d
        L_0x0067:
            r8 = 1000(0x3e8, float:1.401E-42)
        L_0x0069:
            java.lang.String r9 = "notificationChannelId"
            if (r1 == 0) goto L_0x0072
            java.lang.Object r10 = r1.get(r9)
            goto L_0x0073
        L_0x0072:
            r10 = 0
        L_0x0073:
            boolean r11 = r10 instanceof java.lang.String
            if (r11 == 0) goto L_0x007a
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x007b
        L_0x007a:
            r10 = 0
        L_0x007b:
            java.lang.String r11 = "notificationChannelName"
            if (r1 == 0) goto L_0x0084
            java.lang.Object r12 = r1.get(r11)
            goto L_0x0085
        L_0x0084:
            r12 = 0
        L_0x0085:
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x008c
            java.lang.String r12 = (java.lang.String) r12
            goto L_0x008d
        L_0x008c:
            r12 = 0
        L_0x008d:
            java.lang.String r13 = "notificationChannelDescription"
            if (r1 == 0) goto L_0x0096
            java.lang.Object r14 = r1.get(r13)
            goto L_0x0097
        L_0x0096:
            r14 = 0
        L_0x0097:
            boolean r15 = r14 instanceof java.lang.String
            if (r15 == 0) goto L_0x009e
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x009f
        L_0x009e:
            r14 = 0
        L_0x009f:
            java.lang.String r15 = "notificationChannelImportance"
            if (r1 == 0) goto L_0x00aa
            java.lang.Object r16 = r1.get(r15)
            r4 = r16
            goto L_0x00ab
        L_0x00aa:
            r4 = 0
        L_0x00ab:
            boolean r5 = r4 instanceof java.lang.Integer
            if (r5 == 0) goto L_0x00b2
            java.lang.Integer r4 = (java.lang.Integer) r4
            goto L_0x00b3
        L_0x00b2:
            r4 = 0
        L_0x00b3:
            if (r4 == 0) goto L_0x00ba
            int r4 = r4.intValue()
            goto L_0x00bb
        L_0x00ba:
            r4 = 2
        L_0x00bb:
            java.lang.String r5 = "notificationPriority"
            if (r1 == 0) goto L_0x00cc
            java.lang.Object r17 = r1.get(r5)
            r18 = r3
            r30 = r17
            r17 = r2
            r2 = r30
            goto L_0x00d1
        L_0x00cc:
            r17 = r2
            r18 = r3
            r2 = 0
        L_0x00d1:
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x00d8
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L_0x00d9
        L_0x00d8:
            r2 = 0
        L_0x00d9:
            if (r2 == 0) goto L_0x00e0
            int r2 = r2.intValue()
            goto L_0x00e1
        L_0x00e0:
            r2 = -1
        L_0x00e1:
            java.lang.String r3 = "enableVibration"
            if (r1 == 0) goto L_0x00ee
            java.lang.Object r19 = r1.get(r3)
            r0 = r19
            r19 = r3
            goto L_0x00f1
        L_0x00ee:
            r19 = r3
            r0 = 0
        L_0x00f1:
            boolean r3 = r0 instanceof java.lang.Boolean
            if (r3 == 0) goto L_0x00f8
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x00f9
        L_0x00f8:
            r0 = 0
        L_0x00f9:
            if (r0 == 0) goto L_0x0100
            boolean r0 = r0.booleanValue()
            goto L_0x0101
        L_0x0100:
            r0 = 0
        L_0x0101:
            java.lang.String r3 = "playSound"
            if (r1 == 0) goto L_0x0112
            java.lang.Object r20 = r1.get(r3)
            r21 = r0
            r30 = r20
            r20 = r3
            r3 = r30
            goto L_0x0117
        L_0x0112:
            r21 = r0
            r20 = r3
            r3 = 0
        L_0x0117:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x011e
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            goto L_0x011f
        L_0x011e:
            r3 = 0
        L_0x011f:
            if (r3 == 0) goto L_0x0126
            boolean r0 = r3.booleanValue()
            goto L_0x0127
        L_0x0126:
            r0 = 0
        L_0x0127:
            java.lang.String r3 = "showWhen"
            if (r1 == 0) goto L_0x0138
            java.lang.Object r22 = r1.get(r3)
            r23 = r0
            r30 = r22
            r22 = r3
            r3 = r30
            goto L_0x013d
        L_0x0138:
            r23 = r0
            r22 = r3
            r3 = 0
        L_0x013d:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0144
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            goto L_0x0145
        L_0x0144:
            r3 = 0
        L_0x0145:
            if (r3 == 0) goto L_0x014c
            boolean r0 = r3.booleanValue()
            goto L_0x014d
        L_0x014c:
            r0 = 0
        L_0x014d:
            java.lang.String r3 = "showBadge"
            if (r1 == 0) goto L_0x015e
            java.lang.Object r24 = r1.get(r3)
            r25 = r0
            r30 = r24
            r24 = r3
            r3 = r30
            goto L_0x0163
        L_0x015e:
            r25 = r0
            r24 = r3
            r3 = 0
        L_0x0163:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x016a
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            goto L_0x016b
        L_0x016a:
            r3 = 0
        L_0x016b:
            if (r3 == 0) goto L_0x0172
            boolean r0 = r3.booleanValue()
            goto L_0x0173
        L_0x0172:
            r0 = 0
        L_0x0173:
            java.lang.String r3 = "onlyAlertOnce"
            if (r1 == 0) goto L_0x0184
            java.lang.Object r26 = r1.get(r3)
            r27 = r0
            r30 = r26
            r26 = r3
            r3 = r30
            goto L_0x0189
        L_0x0184:
            r27 = r0
            r26 = r3
            r3 = 0
        L_0x0189:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0190
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            goto L_0x0191
        L_0x0190:
            r3 = 0
        L_0x0191:
            if (r3 == 0) goto L_0x0198
            boolean r0 = r3.booleanValue()
            goto L_0x0199
        L_0x0198:
            r0 = 0
        L_0x0199:
            java.lang.String r3 = "visibility"
            if (r1 == 0) goto L_0x01aa
            java.lang.Object r28 = r1.get(r3)
            r29 = r3
            r30 = r28
            r28 = r1
            r1 = r30
            goto L_0x01af
        L_0x01aa:
            r28 = r1
            r29 = r3
            r1 = 0
        L_0x01af:
            boolean r3 = r1 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x01b6
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x01b7
        L_0x01b6:
            r1 = 0
        L_0x01b7:
            r3 = 1
            if (r1 == 0) goto L_0x01bf
            int r1 = r1.intValue()
            goto L_0x01c0
        L_0x01bf:
            r1 = r3
        L_0x01c0:
            android.content.SharedPreferences$Editor r6 = r6.edit()
            r6.putInt(r7, r8)
            r6.putString(r9, r10)
            r6.putString(r11, r12)
            r6.putString(r13, r14)
            r6.putInt(r15, r4)
            r6.putInt(r5, r2)
            r2 = r19
            r4 = r21
            r6.putBoolean(r2, r4)
            r2 = r20
            r4 = r23
            r6.putBoolean(r2, r4)
            r2 = r22
            r4 = r25
            r6.putBoolean(r2, r4)
            r2 = r24
            r4 = r27
            r6.putBoolean(r2, r4)
            r2 = r26
            r6.putBoolean(r2, r0)
            r0 = r29
            r6.putInt(r0, r1)
            r6.commit()
            java.lang.String r0 = "com.pravera.flutter_foreground_task.prefs.FOREGROUND_TASK_OPTIONS"
            r2 = 0
            r1 = r31
            android.content.SharedPreferences r4 = r1.getSharedPreferences(r0, r2)
            java.lang.String r2 = "taskEventAction"
            r5 = r28
            if (r28 == 0) goto L_0x0213
            java.lang.Object r6 = r5.get(r2)
            goto L_0x0214
        L_0x0213:
            r6 = 0
        L_0x0214:
            boolean r7 = r6 instanceof java.util.Map
            if (r7 == 0) goto L_0x021b
            java.util.Map r6 = (java.util.Map) r6
            goto L_0x021c
        L_0x021b:
            r6 = 0
        L_0x021c:
            if (r6 == 0) goto L_0x0228
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>(r6)
            java.lang.String r6 = r7.toString()
            goto L_0x0229
        L_0x0228:
            r6 = 0
        L_0x0229:
            java.lang.String r7 = "autoRunOnBoot"
            if (r5 == 0) goto L_0x0232
            java.lang.Object r8 = r5.get(r7)
            goto L_0x0233
        L_0x0232:
            r8 = 0
        L_0x0233:
            boolean r9 = r8 instanceof java.lang.Boolean
            if (r9 == 0) goto L_0x023a
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            goto L_0x023b
        L_0x023a:
            r8 = 0
        L_0x023b:
            if (r8 == 0) goto L_0x0242
            boolean r8 = r8.booleanValue()
            goto L_0x0243
        L_0x0242:
            r8 = 0
        L_0x0243:
            java.lang.String r9 = "autoRunOnMyPackageReplaced"
            if (r5 == 0) goto L_0x024c
            java.lang.Object r10 = r5.get(r9)
            goto L_0x024d
        L_0x024c:
            r10 = 0
        L_0x024d:
            boolean r11 = r10 instanceof java.lang.Boolean
            if (r11 == 0) goto L_0x0254
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            goto L_0x0255
        L_0x0254:
            r10 = 0
        L_0x0255:
            if (r10 == 0) goto L_0x025c
            boolean r10 = r10.booleanValue()
            goto L_0x025d
        L_0x025c:
            r10 = 0
        L_0x025d:
            java.lang.String r11 = "allowWakeLock"
            if (r5 == 0) goto L_0x0266
            java.lang.Object r12 = r5.get(r11)
            goto L_0x0267
        L_0x0266:
            r12 = 0
        L_0x0267:
            boolean r13 = r12 instanceof java.lang.Boolean
            if (r13 == 0) goto L_0x026e
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            goto L_0x026f
        L_0x026e:
            r12 = 0
        L_0x026f:
            if (r12 == 0) goto L_0x0275
            boolean r3 = r12.booleanValue()
        L_0x0275:
            java.lang.String r12 = "allowWifiLock"
            if (r5 == 0) goto L_0x027e
            java.lang.Object r13 = r5.get(r12)
            goto L_0x027f
        L_0x027e:
            r13 = 0
        L_0x027f:
            boolean r14 = r13 instanceof java.lang.Boolean
            if (r14 == 0) goto L_0x0286
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            goto L_0x0287
        L_0x0286:
            r13 = 0
        L_0x0287:
            if (r13 == 0) goto L_0x028e
            boolean r13 = r13.booleanValue()
            goto L_0x028f
        L_0x028e:
            r13 = 0
        L_0x028f:
            android.content.SharedPreferences$Editor r4 = r4.edit()
            r4.putString(r2, r6)
            r4.putBoolean(r7, r8)
            r4.putBoolean(r9, r10)
            r4.putBoolean(r11, r3)
            r4.putBoolean(r12, r13)
            r4.commit()
            r2 = 0
            android.content.SharedPreferences r0 = r1.getSharedPreferences(r0, r2)
            java.lang.String r2 = "callbackHandle"
            if (r5 == 0) goto L_0x02b3
            java.lang.Object r3 = r5.get(r2)
            goto L_0x02b4
        L_0x02b3:
            r3 = 0
        L_0x02b4:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Long r3 = H2.l.m0(r3)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.remove(r2)
            if (r3 == 0) goto L_0x02cc
            long r3 = r3.longValue()
            r0.putLong(r2, r3)
        L_0x02cc:
            r0.commit()
            r2 = r18
            r0 = 0
            android.content.SharedPreferences r0 = r1.getSharedPreferences(r2, r0)
            java.lang.String r2 = "notificationContentTitle"
            if (r5 == 0) goto L_0x02df
            java.lang.Object r3 = r5.get(r2)
            goto L_0x02e0
        L_0x02df:
            r3 = 0
        L_0x02e0:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L_0x02e7
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x02e8
        L_0x02e7:
            r3 = 0
        L_0x02e8:
            java.lang.String r4 = ""
            if (r3 != 0) goto L_0x02ed
            r3 = r4
        L_0x02ed:
            java.lang.String r6 = "notificationContentText"
            if (r5 == 0) goto L_0x02f6
            java.lang.Object r7 = r5.get(r6)
            goto L_0x02f7
        L_0x02f6:
            r7 = 0
        L_0x02f7:
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L_0x02fe
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x02ff
        L_0x02fe:
            r7 = 0
        L_0x02ff:
            if (r7 != 0) goto L_0x0302
            goto L_0x0303
        L_0x0302:
            r4 = r7
        L_0x0303:
            java.lang.String r7 = "icon"
            if (r5 == 0) goto L_0x030c
            java.lang.Object r8 = r5.get(r7)
            goto L_0x030d
        L_0x030c:
            r8 = 0
        L_0x030d:
            boolean r9 = r8 instanceof java.util.Map
            if (r9 == 0) goto L_0x0314
            java.util.Map r8 = (java.util.Map) r8
            goto L_0x0315
        L_0x0314:
            r8 = 0
        L_0x0315:
            if (r8 == 0) goto L_0x0321
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>(r8)
            java.lang.String r8 = r9.toString()
            goto L_0x0322
        L_0x0321:
            r8 = 0
        L_0x0322:
            java.lang.String r9 = "buttons"
            if (r5 == 0) goto L_0x032b
            java.lang.Object r10 = r5.get(r9)
            goto L_0x032c
        L_0x032b:
            r10 = 0
        L_0x032c:
            boolean r11 = r10 instanceof java.util.List
            if (r11 == 0) goto L_0x0333
            java.util.List r10 = (java.util.List) r10
            goto L_0x0334
        L_0x0333:
            r10 = 0
        L_0x0334:
            if (r10 == 0) goto L_0x0340
            org.json.JSONArray r11 = new org.json.JSONArray
            r11.<init>(r10)
            java.lang.String r10 = r11.toString()
            goto L_0x0341
        L_0x0340:
            r10 = 0
        L_0x0341:
            java.lang.String r11 = "initialRoute"
            if (r5 == 0) goto L_0x034a
            java.lang.Object r5 = r5.get(r11)
            goto L_0x034b
        L_0x034a:
            r5 = 0
        L_0x034b:
            boolean r12 = r5 instanceof java.lang.String
            if (r12 == 0) goto L_0x0352
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0353
        L_0x0352:
            r5 = 0
        L_0x0353:
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putString(r2, r3)
            r0.putString(r6, r4)
            r0.putString(r7, r8)
            r0.putString(r9, r10)
            r0.putString(r11, r5)
            r0.commit()
            r0 = r17
            r.C0414g.b(r1, r0)
            return
        L_0x036f:
            H1.a r0 = new H1.a
            java.lang.String r1 = "The service has already started."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.g.m(android.content.Context, java.lang.Object):void");
    }

    public static void n(Context context) {
        i.e(context, "context");
        if (j()) {
            Intent intent = new Intent(context, J1.a.class);
            SharedPreferences.Editor edit = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS", 0).edit();
            edit.putString("foregroundServiceAction", "com.pravera.flutter_foreground_task.action.api_stop");
            edit.commit();
            SharedPreferences.Editor edit2 = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.NOTIFICATION_OPTIONS", 0).edit();
            edit2.clear();
            edit2.commit();
            SharedPreferences.Editor edit3 = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_TASK_OPTIONS", 0).edit();
            edit3.clear();
            edit3.commit();
            SharedPreferences.Editor edit4 = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_TASK_OPTIONS", 0).edit();
            edit4.clear();
            edit4.commit();
            SharedPreferences.Editor edit5 = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.NOTIFICATION_OPTIONS", 0).edit();
            edit5.clear();
            edit5.commit();
            C0414g.b(context, intent);
            return;
        }
        throw new H1.a(6);
    }

    public static void o(Context context, Object obj) {
        Map map;
        Object obj2;
        Map map2;
        String str;
        Object obj3;
        Boolean bool;
        Object obj4;
        Boolean bool2;
        Object obj5;
        Boolean bool3;
        Object obj6;
        Boolean bool4;
        Object obj7;
        Object obj8;
        String str2;
        Object obj9;
        String str3;
        Object obj10;
        Map map3;
        String str4;
        Object obj11;
        List list;
        String str5;
        Object obj12;
        String str6;
        Context context2 = context;
        Object obj13 = obj;
        i.e(context2, "context");
        if (j()) {
            Intent intent = new Intent(context2, J1.a.class);
            if (obj13 instanceof Map) {
                map = (Map) obj13;
            } else {
                map = null;
            }
            SharedPreferences.Editor edit = context2.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS", 0).edit();
            edit.putString("foregroundServiceAction", "com.pravera.flutter_foreground_task.action.api_update");
            edit.commit();
            SharedPreferences sharedPreferences = context2.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_TASK_OPTIONS", 0);
            if (map != null) {
                obj2 = map.get("taskEventAction");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof Map) {
                map2 = (Map) obj2;
            } else {
                map2 = null;
            }
            if (map2 != null) {
                str = new JSONObject(map2).toString();
            } else {
                str = null;
            }
            if (map != null) {
                obj3 = map.get("autoRunOnBoot");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof Boolean) {
                bool = (Boolean) obj3;
            } else {
                bool = null;
            }
            if (map != null) {
                obj4 = map.get("autoRunOnMyPackageReplaced");
            } else {
                obj4 = null;
            }
            if (obj4 instanceof Boolean) {
                bool2 = (Boolean) obj4;
            } else {
                bool2 = null;
            }
            if (map != null) {
                obj5 = map.get("allowWakeLock");
            } else {
                obj5 = null;
            }
            if (obj5 instanceof Boolean) {
                bool3 = (Boolean) obj5;
            } else {
                bool3 = null;
            }
            if (map != null) {
                obj6 = map.get("allowWifiLock");
            } else {
                obj6 = null;
            }
            if (obj6 instanceof Boolean) {
                bool4 = (Boolean) obj6;
            } else {
                bool4 = null;
            }
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            if (str != null) {
                edit2.putString("taskEventAction", str);
            }
            if (bool != null) {
                edit2.putBoolean("autoRunOnBoot", bool.booleanValue());
            }
            if (bool2 != null) {
                edit2.putBoolean("autoRunOnMyPackageReplaced", bool2.booleanValue());
            }
            if (bool3 != null) {
                edit2.putBoolean("allowWakeLock", bool3.booleanValue());
            }
            if (bool4 != null) {
                edit2.putBoolean("allowWifiLock", bool4.booleanValue());
            }
            edit2.commit();
            SharedPreferences sharedPreferences2 = context2.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_TASK_OPTIONS", 0);
            if (map != null) {
                obj7 = map.get("callbackHandle");
            } else {
                obj7 = null;
            }
            Long m0 = H2.l.m0(String.valueOf(obj7));
            SharedPreferences.Editor edit3 = sharedPreferences2.edit();
            if (m0 != null) {
                edit3.putLong("callbackHandle", m0.longValue());
            }
            edit3.commit();
            SharedPreferences sharedPreferences3 = context2.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.NOTIFICATION_OPTIONS", 0);
            if (map != null) {
                obj8 = map.get("notificationContentTitle");
            } else {
                obj8 = null;
            }
            if (obj8 instanceof String) {
                str2 = (String) obj8;
            } else {
                str2 = null;
            }
            if (map != null) {
                obj9 = map.get("notificationContentText");
            } else {
                obj9 = null;
            }
            if (obj9 instanceof String) {
                str3 = (String) obj9;
            } else {
                str3 = null;
            }
            if (map != null) {
                obj10 = map.get("icon");
            } else {
                obj10 = null;
            }
            if (obj10 instanceof Map) {
                map3 = (Map) obj10;
            } else {
                map3 = null;
            }
            if (map3 != null) {
                str4 = new JSONObject(map3).toString();
            } else {
                str4 = null;
            }
            if (map != null) {
                obj11 = map.get("buttons");
            } else {
                obj11 = null;
            }
            if (obj11 instanceof List) {
                list = (List) obj11;
            } else {
                list = null;
            }
            if (list != null) {
                str5 = new JSONArray(list).toString();
            } else {
                str5 = null;
            }
            if (map != null) {
                obj12 = map.get("initialRoute");
            } else {
                obj12 = null;
            }
            if (obj12 instanceof String) {
                str6 = (String) obj12;
            } else {
                str6 = null;
            }
            SharedPreferences.Editor edit4 = sharedPreferences3.edit();
            if (str2 != null) {
                edit4.putString("notificationContentTitle", str2);
            }
            if (str3 != null) {
                edit4.putString("notificationContentText", str3);
            }
            if (str4 != null) {
                edit4.putString("icon", str4);
            }
            if (str5 != null) {
                edit4.putString("buttons", str5);
            }
            if (str6 != null) {
                edit4.putString("initialRoute", str6);
            }
            edit4.commit();
            C0414g.b(context2, intent);
            return;
        }
        throw new H1.a(6);
    }

    public static final l p(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i3 = 0; i3 < lVarArr.length; i3++) {
                if (lVarArr[i3].equals(mVar)) {
                    return lVarArr[i3];
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean q(android.content.pm.PackageInfo r4) {
        /*
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L_0x002c
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x001c
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0019
            goto L_0x001c
        L_0x0019:
            r2 = r4
        L_0x001a:
            r3 = r0
            goto L_0x002e
        L_0x001c:
            android.content.pm.ApplicationInfo r2 = r4.applicationInfo
            if (r2 != 0) goto L_0x0022
        L_0x0020:
            r2 = r1
            goto L_0x0029
        L_0x0022:
            int r2 = r2.flags
            r2 = r2 & 129(0x81, float:1.81E-43)
            if (r2 == 0) goto L_0x0020
            r2 = r0
        L_0x0029:
            r3 = r2
            r2 = r4
            goto L_0x002e
        L_0x002c:
            r2 = 0
            goto L_0x001a
        L_0x002e:
            if (r4 == 0) goto L_0x004c
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L_0x004c
            if (r3 == 0) goto L_0x003d
            D0.l[] r4 = D0.n.f216a
            D0.l r4 = p(r2, r4)
            goto L_0x0049
        L_0x003d:
            D0.l[] r4 = D0.n.f216a
            r4 = r4[r1]
            D0.l[] r4 = new D0.l[]{r4}
            D0.l r4 = p(r2, r4)
        L_0x0049:
            if (r4 == 0) goto L_0x004c
            return r0
        L_0x004c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.g.q(android.content.pm.PackageInfo):boolean");
    }

    public boolean b(C0217s sVar) {
        return false;
    }

    public long c() {
        return SystemClock.elapsedRealtime();
    }

    public CharSequence d(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        listPreference.getClass();
        if (TextUtils.isEmpty((CharSequence) null)) {
            return listPreference.f2563f.getString(R.string.not_set);
        }
        return null;
    }

    public String g(List list) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Object get() {
        switch (this.f207f) {
            case 15:
                return new o(1, Executors.newSingleThreadExecutor());
            default:
                f fVar = new f(1);
                HashMap hashMap = new HashMap();
                C0356d dVar = C0356d.f4142f;
                Set emptySet = Collections.emptySet();
                if (emptySet != null) {
                    hashMap.put(dVar, new C0511c(30000, 86400000, emptySet));
                    C0356d dVar2 = C0356d.f4144h;
                    Set emptySet2 = Collections.emptySet();
                    if (emptySet2 != null) {
                        hashMap.put(dVar2, new C0511c(1000, 86400000, emptySet2));
                        C0356d dVar3 = C0356d.f4143g;
                        if (Collections.emptySet() != null) {
                            Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C0513e[]{C0513e.f4776g})));
                            if (unmodifiableSet != null) {
                                hashMap.put(dVar3, new C0511c(86400000, 86400000, unmodifiableSet));
                                if (hashMap.keySet().size() >= C0356d.values().length) {
                                    new HashMap();
                                    return new C0510b(fVar, hashMap);
                                }
                                throw new IllegalStateException("Not all priorities have been configured");
                            }
                            throw new NullPointerException("Null flags");
                        }
                        throw new NullPointerException("Null flags");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
        }
    }

    public Object r() {
        switch (this.f207f) {
            case 17:
                return new LinkedHashMap();
            case 18:
                return new LinkedHashSet();
            default:
                return new ConcurrentSkipListMap();
        }
    }

    public g(int i3) {
        this.f207f = i3;
        switch (i3) {
            case 9:
                new k();
                new C0338e();
                return;
            default:
                new CopyOnWriteArrayList();
                return;
        }
    }

    public g(b bVar) {
        this.f207f = 11;
        new q(bVar, "flutter/deferredcomponent", x.f2798a, (e) null).b(new B.m(22, (Object) this));
        C0.f.O().getClass();
        new HashMap();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public g(C0.f fVar) {
        this(4);
        this.f207f = 4;
    }

    public g(RecyclerView recyclerView) {
        this.f207f = 8;
    }

    public void a(C0207i iVar, boolean z3) {
    }
}
