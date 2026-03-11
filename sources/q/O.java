package q;

import android.app.Notification;
import android.os.Parcel;
import b.C0122a;
import b.C0124c;

public final class O {

    /* renamed from: a  reason: collision with root package name */
    public final String f4210a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4211b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4212c;

    /* renamed from: d  reason: collision with root package name */
    public final Notification f4213d;

    public O(String str, int i3, String str2, Notification notification) {
        this.f4210a = str;
        this.f4211b = i3;
        this.f4212c = str2;
        this.f4213d = notification;
    }

    public final void a(C0124c cVar) {
        String str = this.f4210a;
        int i3 = this.f4211b;
        String str2 = this.f4212c;
        C0122a aVar = (C0122a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(C0124c.f2660a);
            obtain.writeString(str);
            obtain.writeInt(i3);
            obtain.writeString(str2);
            Notification notification = this.f4213d;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.f2658c.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        return "NotifyTask[packageName:" + this.f4210a + ", id:" + this.f4211b + ", tag:" + this.f4212c + "]";
    }
}
