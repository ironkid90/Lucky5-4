package com.dexterous.flutterlocalnotifications;

import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import java.io.Serializable;
import java.util.ArrayList;

public final class g implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final NotificationDetails f2813f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2814g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f2815h;

    public g(NotificationDetails notificationDetails, int i3, ArrayList arrayList) {
        this.f2813f = notificationDetails;
        this.f2814g = i3;
        this.f2815h = arrayList;
    }

    public final String toString() {
        return "ForegroundServiceStartParameter{notificationData=" + this.f2813f + ", startMode=" + this.f2814g + ", foregroundServiceTypes=" + this.f2815h + '}';
    }
}
