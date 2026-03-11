package B;

import android.media.ImageReader;

public abstract /* synthetic */ class c {
    public static /* synthetic */ ImageReader.Builder g(int i3, int i4) {
        return new ImageReader.Builder(i3, i4);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void m() {
        /*
            android.media.ImageReader$Builder r0 = new android.media.ImageReader$Builder
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B.c.m():void");
    }
}
