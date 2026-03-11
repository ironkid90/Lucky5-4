package B;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;

public abstract /* synthetic */ class d {
    public static /* synthetic */ NotificationChannel e(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ AudioFocusRequest.Builder i(int i3) {
        return new AudioFocusRequest.Builder(i3);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void q() {
        /*
            android.media.AudioFocusRequest$Builder r0 = new android.media.AudioFocusRequest$Builder
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B.d.q():void");
    }
}
