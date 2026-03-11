package G0;

import D0.j;
import H0.a;
import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new j(10);

    /* renamed from: o  reason: collision with root package name */
    public static final Scope[] f386o = new Scope[0];

    /* renamed from: p  reason: collision with root package name */
    public static final D0.c[] f387p = new D0.c[0];

    /* renamed from: a  reason: collision with root package name */
    public final int f388a;

    /* renamed from: b  reason: collision with root package name */
    public final int f389b;

    /* renamed from: c  reason: collision with root package name */
    public final int f390c;

    /* renamed from: d  reason: collision with root package name */
    public String f391d;

    /* renamed from: e  reason: collision with root package name */
    public IBinder f392e;

    /* renamed from: f  reason: collision with root package name */
    public Scope[] f393f;

    /* renamed from: g  reason: collision with root package name */
    public Bundle f394g;

    /* renamed from: h  reason: collision with root package name */
    public Account f395h;

    /* renamed from: i  reason: collision with root package name */
    public D0.c[] f396i;

    /* renamed from: j  reason: collision with root package name */
    public D0.c[] f397j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f398k;

    /* renamed from: l  reason: collision with root package name */
    public final int f399l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f400m;

    /* renamed from: n  reason: collision with root package name */
    public final String f401n;

    public c(int i3, int i4, int i5, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, D0.c[] cVarArr, D0.c[] cVarArr2, boolean z3, int i6, boolean z4, String str2) {
        scopeArr = scopeArr == null ? f386o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        D0.c[] cVarArr3 = f387p;
        cVarArr = cVarArr == null ? cVarArr3 : cVarArr;
        cVarArr2 = cVarArr2 == null ? cVarArr3 : cVarArr2;
        this.f388a = i3;
        this.f389b = i4;
        this.f390c = i5;
        if ("com.google.android.gms".equals(str)) {
            this.f391d = "com.google.android.gms";
        } else {
            this.f391d = str;
        }
        if (i3 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i7 = C0024a.f379d;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                Object a2 = queryLocalInterface instanceof d ? (d) queryLocalInterface : new A(iBinder);
                if (a2 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = ((A) a2).a();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.f395h = account2;
        } else {
            this.f392e = iBinder;
            this.f395h = account;
        }
        this.f393f = scopeArr;
        this.f394g = bundle;
        this.f396i = cVarArr;
        this.f397j = cVarArr2;
        this.f398k = z3;
        this.f399l = i6;
        this.f400m = z4;
        this.f401n = str2;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        j.a(this, parcel, i3);
    }
}
