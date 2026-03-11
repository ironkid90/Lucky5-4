package s1;

import C0.f;
import L.k;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import o2.a;
import t0.C0477b;
import w0.C0500a;
import x0.C0512d;
import y0.d;
import z0.C0524c;

/* renamed from: s1.z  reason: case insensitive filesystem */
public final class C0465z implements C0477b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f4626f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f4627g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f4628h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f4629i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f4630j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f4631k;

    public C0465z(a aVar, a aVar2, f fVar, a aVar3, a aVar4) {
        this.f4626f = 1;
        this.f4627g = aVar;
        this.f4628h = aVar2;
        this.f4629i = fVar;
        this.f4630j = aVar3;
        this.f4631k = aVar4;
    }

    public static C0465z a(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        C0465z zVar = new C0465z(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) zVar.f4630j)) {
            try {
                ((ArrayDeque) zVar.f4630j).clear();
                String string = ((SharedPreferences) zVar.f4627g).getString((String) zVar.f4628h, "");
                if (!TextUtils.isEmpty(string)) {
                    if (string.contains((String) zVar.f4629i)) {
                        String[] split = string.split((String) zVar.f4629i, -1);
                        if (split.length == 0) {
                            Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                        }
                        for (String str : split) {
                            if (!TextUtils.isEmpty(str)) {
                                ((ArrayDeque) zVar.f4630j).add(str);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zVar;
    }

    public Object get() {
        return new C0500a((Executor) ((a) this.f4627g).get(), (s0.f) ((a) this.f4628h).get(), (C0512d) ((f) this.f4629i).get(), (d) ((a) this.f4630j).get(), (C0524c) ((a) this.f4631k).get());
    }

    public String toString() {
        switch (this.f4626f) {
            case k.FLOAT_FIELD_NUMBER:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f4628h) + ", mProviderPackage: " + ((String) this.f4629i) + ", mQuery: " + ((String) this.f4627g) + ", mCertificates:");
                int i3 = 0;
                while (true) {
                    List list = (List) this.f4630j;
                    if (i3 < list.size()) {
                        sb.append(" [");
                        List list2 = (List) list.get(i3);
                        for (int i4 = 0; i4 < list2.size(); i4++) {
                            sb.append(" \"");
                            sb.append(Base64.encodeToString((byte[]) list2.get(i4), 0));
                            sb.append("\"");
                        }
                        sb.append(" ]");
                        i3++;
                    } else {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                }
            default:
                return super.toString();
        }
    }

    public C0465z(String str, String str2, String str3, List list) {
        this.f4626f = 2;
        this.f4628h = str;
        this.f4629i = str2;
        this.f4627g = str3;
        list.getClass();
        this.f4630j = list;
        this.f4631k = str + "-" + str2 + "-" + str3;
    }

    public C0465z(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f4626f = 0;
        this.f4630j = new ArrayDeque();
        this.f4627g = sharedPreferences;
        this.f4628h = "topic_operation_queue";
        this.f4629i = ",";
        this.f4631k = scheduledThreadPoolExecutor;
    }
}
