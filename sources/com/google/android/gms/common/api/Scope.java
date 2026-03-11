package com.google.android.gms.common.api;

import D0.j;
import G0.o;
import H0.a;
import a.C0094a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new j(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f2824a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2825b;

    public Scope(String str, int i3) {
        o.c(str, "scopeUri must not be null or empty");
        this.f2824a = i3;
        this.f2825b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2825b.equals(((Scope) obj).f2825b);
    }

    public final int hashCode() {
        return this.f2825b.hashCode();
    }

    public final String toString() {
        return this.f2825b;
    }

    public final void writeToParcel(Parcel parcel, int i3) {
        int W2 = C0094a.W(parcel, 20293);
        C0094a.Y(parcel, 1, 4);
        parcel.writeInt(this.f2824a);
        C0094a.U(parcel, 2, this.f2825b);
        C0094a.X(parcel, W2);
    }
}
