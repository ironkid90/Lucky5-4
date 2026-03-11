package C0;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new c(1);

    /* renamed from: a  reason: collision with root package name */
    public final Messenger f131a;

    public i(IBinder iBinder) {
        this.f131a = new Messenger(iBinder);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f131a;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((i) obj).f131a;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f131a;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        Messenger messenger = this.f131a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
