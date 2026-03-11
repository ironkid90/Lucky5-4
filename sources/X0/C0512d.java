package x0;

import B0.a;
import a.C0094a;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import o0.C0356d;
import r0.i;
import y0.d;

/* renamed from: x0.d  reason: case insensitive filesystem */
public final class C0512d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4772a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4773b;

    /* renamed from: c  reason: collision with root package name */
    public final C0510b f4774c;

    public C0512d(Context context, d dVar, C0510b bVar) {
        this.f4772a = context;
        this.f4773b = dVar;
        this.f4774c = bVar;
    }

    /* JADX INFO: finally extract failed */
    public final void a(i iVar, int i3, boolean z3) {
        Long l3;
        i iVar2 = iVar;
        int i4 = i3;
        Context context = this.f4772a;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(iVar2.f4426a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        C0356d dVar = iVar2.f4428c;
        adler32.update(allocate.putInt(a.a(dVar)).array());
        byte[] bArr = iVar2.f4427b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z3) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i5 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i5 >= i4) {
                        C0094a.l("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar2);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase a2 = ((y0.i) this.f4773b).a();
        String valueOf = String.valueOf(a.a(dVar));
        String str = iVar2.f4426a;
        Cursor rawQuery = a2.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf});
        try {
            if (rawQuery.moveToNext()) {
                l3 = Long.valueOf(rawQuery.getLong(0));
            } else {
                l3 = 0L;
            }
            rawQuery.close();
            long longValue = l3.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            C0510b bVar = this.f4774c;
            builder.setMinimumLatency(bVar.a(dVar, longValue, i4));
            Set set = ((C0511c) bVar.f4768b.get(dVar)).f4771c;
            if (set.contains(C0513e.f4775f)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(C0513e.f4777h)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(C0513e.f4776g)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i4);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(bVar.a(dVar, longValue, i4)), l3, Integer.valueOf(i3)};
            String B3 = C0094a.B("JobInfoScheduler");
            if (Log.isLoggable(B3, 3)) {
                Log.d(B3, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
