package T;

import S2.e;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import w.d;

/* renamed from: T.j  reason: case insensitive filesystem */
public final class C0089j implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    public static final ThreadLocal f1640j = new ThreadLocal();

    /* renamed from: k  reason: collision with root package name */
    public static final e f1641k = new e(1);

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f1642f;

    /* renamed from: g  reason: collision with root package name */
    public long f1643g;

    /* renamed from: h  reason: collision with root package name */
    public long f1644h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f1645i;

    public final void a(RecyclerView recyclerView, int i3, int i4) {
        if (recyclerView.f2630r && this.f1643g == 0) {
            this.f1643g = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0087h hVar = recyclerView.f2610b0;
        hVar.f1632a = i3;
        hVar.f1633b = i4;
    }

    public final void b(long j3) {
        C0088i iVar;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f1642f;
        int size = arrayList.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0087h hVar = recyclerView2.f2610b0;
                hVar.f1634c = 0;
                i3 += hVar.f1634c;
            }
        }
        ArrayList arrayList2 = this.f1645i;
        arrayList2.ensureCapacity(i3);
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i5);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0087h hVar2 = recyclerView3.f2610b0;
                Math.abs(hVar2.f1632a);
                Math.abs(hVar2.f1633b);
                if (hVar2.f1634c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new Object());
                    } else {
                        C0088i iVar2 = (C0088i) arrayList2.get(0);
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList2, f1641k);
        if (arrayList2.size() > 0 && (recyclerView = iVar.f1638d) != null) {
            int i6 = (iVar = (C0088i) arrayList2.get(0)).f1639e;
            if (recyclerView.f2619i.L() <= 0) {
                z zVar = recyclerView.f2613f;
                try {
                    recyclerView.f2588B++;
                    zVar.a(i6);
                    throw null;
                } catch (Throwable th) {
                    int i7 = recyclerView.f2588B - 1;
                    recyclerView.f2588B = i7;
                    if (i7 < 1) {
                        recyclerView.f2588B = 0;
                    }
                    throw th;
                }
            } else {
                RecyclerView.j(recyclerView.f2619i.K(0));
                throw null;
            }
        }
    }

    public final void run() {
        try {
            int i3 = d.f4721a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f1642f;
            if (arrayList.isEmpty()) {
                this.f1643g = 0;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i4);
                if (recyclerView.getWindowVisibility() == 0) {
                    j3 = Math.max(recyclerView.getDrawingTime(), j3);
                }
            }
            if (j3 == 0) {
                this.f1643g = 0;
                Trace.endSection();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j3) + this.f1644h);
            this.f1643g = 0;
            Trace.endSection();
        } catch (Throwable th) {
            this.f1643g = 0;
            int i5 = d.f4721a;
            Trace.endSection();
            throw th;
        }
    }
}
