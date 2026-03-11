package D0;

import G0.b;
import G0.c;
import G0.e;
import G0.g;
import G0.h;
import G0.u;
import L.k;
import T.C0092m;
import T.I;
import T.J;
import a.C0094a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.versionedparcelable.ParcelImpl;
import c.d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import s1.C0463x;

public final class j implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f210a;

    public /* synthetic */ j(int i3) {
        this.f210a = i3;
    }

    public static void a(c cVar, Parcel parcel, int i3) {
        int W2 = C0094a.W(parcel, 20293);
        int i4 = cVar.f388a;
        C0094a.Y(parcel, 1, 4);
        parcel.writeInt(i4);
        C0094a.Y(parcel, 2, 4);
        parcel.writeInt(cVar.f389b);
        C0094a.Y(parcel, 3, 4);
        parcel.writeInt(cVar.f390c);
        C0094a.U(parcel, 4, cVar.f391d);
        IBinder iBinder = cVar.f392e;
        if (iBinder != null) {
            int W3 = C0094a.W(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            C0094a.X(parcel, W3);
        }
        C0094a.V(parcel, 6, cVar.f393f, i3);
        C0094a.R(parcel, 7, cVar.f394g);
        C0094a.T(parcel, 8, cVar.f395h, i3);
        C0094a.V(parcel, 10, cVar.f396i, i3);
        C0094a.V(parcel, 11, cVar.f397j, i3);
        C0094a.Y(parcel, 12, 4);
        parcel.writeInt(cVar.f398k ? 1 : 0);
        C0094a.Y(parcel, 13, 4);
        parcel.writeInt(cVar.f399l);
        boolean z3 = cVar.f400m;
        C0094a.Y(parcel, 14, 4);
        parcel.writeInt(z3 ? 1 : 0);
        C0094a.U(parcel, 15, cVar.f401n);
        C0094a.X(parcel, W2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: android.os.Bundle} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.view.View$BaseSavedState, F.j, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [G0.u, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v19, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v20, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v21, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v22, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r1v10, types: [T.m, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.Object, T.I] */
    /* JADX WARNING: type inference failed for: r1v12, types: [T.J, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v21, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v23, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v25, types: [c.d, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v19, types: [c.b] */
    /* JADX WARNING: type inference failed for: r7v20, types: [c.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v29 */
    /* JADX WARNING: type inference failed for: r7v33 */
    /* JADX WARNING: type inference failed for: r7v39 */
    /* JADX WARNING: type inference failed for: r7v45 */
    /* JADX WARNING: type inference failed for: r7v47 */
    /* JADX WARNING: type inference failed for: r7v48 */
    /* JADX WARNING: type inference failed for: r7v50 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r25) {
        /*
            r24 = this;
            r0 = r25
            r1 = 8
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            r8 = r24
            int r9 = r8.f210a
            switch(r9) {
                case 0: goto L_0x04d5;
                case 1: goto L_0x049f;
                case 2: goto L_0x0475;
                case 3: goto L_0x0433;
                case 4: goto L_0x0427;
                case 5: goto L_0x03ea;
                case 6: goto L_0x037a;
                case 7: goto L_0x0334;
                case 8: goto L_0x02ea;
                case 9: goto L_0x027f;
                case 10: goto L_0x01d2;
                case 11: goto L_0x01b6;
                case 12: goto L_0x018d;
                case 13: goto L_0x0131;
                case 14: goto L_0x012b;
                case 15: goto L_0x0125;
                case 16: goto L_0x00bb;
                case 17: goto L_0x00b5;
                case 18: goto L_0x00a7;
                case 19: goto L_0x00a1;
                case 20: goto L_0x0091;
                case 21: goto L_0x0087;
                case 22: goto L_0x0063;
                case 23: goto L_0x005d;
                case 24: goto L_0x0035;
                default: goto L_0x0011;
            }
        L_0x0011:
            int r1 = M0.a.X(r25)
        L_0x0015:
            int r2 = r25.dataPosition()
            if (r2 >= r1) goto L_0x002c
            int r2 = r25.readInt()
            char r3 = (char) r2
            if (r3 == r4) goto L_0x0026
            M0.a.T(r0, r2)
            goto L_0x0015
        L_0x0026:
            android.os.Bundle r2 = M0.a.g(r0, r2)
            r7 = r2
            goto L_0x0015
        L_0x002c:
            M0.a.o(r0, r1)
            s1.x r0 = new s1.x
            r0.<init>(r7)
            return r0
        L_0x0035:
            c.d r1 = new c.d
            r1.<init>()
            android.os.IBinder r0 = r25.readStrongBinder()
            int r2 = c.c.f2773d
            if (r0 != 0) goto L_0x0043
            goto L_0x005a
        L_0x0043:
            java.lang.String r2 = c.b.f2772b
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            if (r2 == 0) goto L_0x0053
            boolean r3 = r2 instanceof c.b
            if (r3 == 0) goto L_0x0053
            r7 = r2
            c.b r7 = (c.b) r7
            goto L_0x005a
        L_0x0053:
            c.a r7 = new c.a
            r7.<init>()
            r7.f2771c = r0
        L_0x005a:
            r1.f2775a = r7
            return r1
        L_0x005d:
            android.support.v4.media.session.PlaybackStateCompat r1 = new android.support.v4.media.session.PlaybackStateCompat
            r1.<init>(r0)
            return r1
        L_0x0063:
            android.support.v4.media.session.ParcelableVolumeInfo r1 = new android.support.v4.media.session.ParcelableVolumeInfo
            r1.<init>()
            int r2 = r25.readInt()
            r1.f2056a = r2
            int r2 = r25.readInt()
            r1.f2058c = r2
            int r2 = r25.readInt()
            r1.f2059d = r2
            int r2 = r25.readInt()
            r1.f2060e = r2
            int r0 = r25.readInt()
            r1.f2057b = r0
            return r1
        L_0x0087:
            android.os.Parcelable r0 = r0.readParcelable(r7)
            android.support.v4.media.session.MediaSessionCompat$Token r1 = new android.support.v4.media.session.MediaSessionCompat$Token
            r1.<init>(r0)
            return r1
        L_0x0091:
            android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper r1 = new android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper
            r1.<init>()
            android.os.Parcelable$Creator r2 = android.os.ResultReceiver.CREATOR
            java.lang.Object r0 = r2.createFromParcel(r0)
            android.os.ResultReceiver r0 = (android.os.ResultReceiver) r0
            r1.f2054a = r0
            return r1
        L_0x00a1:
            android.support.v4.media.session.MediaSessionCompat$QueueItem r1 = new android.support.v4.media.session.MediaSessionCompat$QueueItem
            r1.<init>(r0)
            return r1
        L_0x00a7:
            android.support.v4.media.RatingCompat r1 = new android.support.v4.media.RatingCompat
            int r2 = r25.readInt()
            float r0 = r25.readFloat()
            r1.<init>(r2, r0)
            return r1
        L_0x00b5:
            android.support.v4.media.MediaMetadataCompat r1 = new android.support.v4.media.MediaMetadataCompat
            r1.<init>(r0)
            return r1
        L_0x00bb:
            android.os.Parcelable$Creator r1 = android.media.MediaDescription.CREATOR
            java.lang.Object r0 = r1.createFromParcel(r0)
            if (r0 == 0) goto L_0x0124
            android.media.MediaDescription r0 = (android.media.MediaDescription) r0
            java.lang.String r10 = r0.getMediaId()
            java.lang.CharSequence r11 = r0.getTitle()
            java.lang.CharSequence r12 = r0.getSubtitle()
            java.lang.CharSequence r13 = r0.getDescription()
            android.graphics.Bitmap r14 = r0.getIconBitmap()
            android.net.Uri r15 = r0.getIconUri()
            android.os.Bundle r1 = r0.getExtras()
            java.lang.String r2 = "android.support.v4.media.description.MEDIA_URI"
            if (r1 == 0) goto L_0x00f5
            java.lang.Class<android.support.v4.media.session.a> r3 = android.support.v4.media.session.a.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r1.setClassLoader(r3)
            android.os.Parcelable r3 = r1.getParcelable(r2)
            android.net.Uri r3 = (android.net.Uri) r3
            goto L_0x00f6
        L_0x00f5:
            r3 = r7
        L_0x00f6:
            if (r3 == 0) goto L_0x010f
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r1.containsKey(r5)
            if (r6 == 0) goto L_0x0109
            int r6 = r1.size()
            if (r6 != r4) goto L_0x0109
            r16 = r7
            goto L_0x0111
        L_0x0109:
            r1.remove(r2)
            r1.remove(r5)
        L_0x010f:
            r16 = r1
        L_0x0111:
            if (r3 == 0) goto L_0x0116
            r17 = r3
            goto L_0x011c
        L_0x0116:
            android.net.Uri r1 = r0.getMediaUri()
            r17 = r1
        L_0x011c:
            android.support.v4.media.MediaDescriptionCompat r7 = new android.support.v4.media.MediaDescriptionCompat
            r9 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r7.f2048i = r0
        L_0x0124:
            return r7
        L_0x0125:
            android.support.v4.media.MediaBrowserCompat$MediaItem r1 = new android.support.v4.media.MediaBrowserCompat$MediaItem
            r1.<init>(r0)
            return r1
        L_0x012b:
            androidx.versionedparcelable.ParcelImpl r1 = new androidx.versionedparcelable.ParcelImpl
            r1.<init>(r0)
            return r1
        L_0x0131:
            T.J r1 = new T.J
            r1.<init>()
            int r2 = r25.readInt()
            r1.f1571a = r2
            int r2 = r25.readInt()
            r1.f1572b = r2
            int r2 = r25.readInt()
            r1.f1573c = r2
            if (r2 <= 0) goto L_0x0151
            int[] r2 = new int[r2]
            r1.f1574d = r2
            r0.readIntArray(r2)
        L_0x0151:
            int r2 = r25.readInt()
            r1.f1575e = r2
            if (r2 <= 0) goto L_0x0160
            int[] r2 = new int[r2]
            r1.f1576f = r2
            r0.readIntArray(r2)
        L_0x0160:
            int r2 = r25.readInt()
            if (r2 != r5) goto L_0x0168
            r2 = r5
            goto L_0x0169
        L_0x0168:
            r2 = r6
        L_0x0169:
            r1.f1578h = r2
            int r2 = r25.readInt()
            if (r2 != r5) goto L_0x0173
            r2 = r5
            goto L_0x0174
        L_0x0173:
            r2 = r6
        L_0x0174:
            r1.f1579i = r2
            int r2 = r25.readInt()
            if (r2 != r5) goto L_0x017d
            goto L_0x017e
        L_0x017d:
            r5 = r6
        L_0x017e:
            r1.f1580j = r5
            java.lang.Class<T.I> r2 = T.I.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            java.util.ArrayList r0 = r0.readArrayList(r2)
            r1.f1577g = r0
            return r1
        L_0x018d:
            T.I r1 = new T.I
            r1.<init>()
            int r2 = r25.readInt()
            r1.f1567a = r2
            int r2 = r25.readInt()
            r1.f1568b = r2
            int r2 = r25.readInt()
            if (r2 != r5) goto L_0x01a5
            goto L_0x01a6
        L_0x01a5:
            r5 = r6
        L_0x01a6:
            r1.f1570d = r5
            int r2 = r25.readInt()
            if (r2 <= 0) goto L_0x01b5
            int[] r2 = new int[r2]
            r1.f1569c = r2
            r0.readIntArray(r2)
        L_0x01b5:
            return r1
        L_0x01b6:
            T.m r1 = new T.m
            r1.<init>()
            int r2 = r25.readInt()
            r1.f1651a = r2
            int r2 = r25.readInt()
            r1.f1652b = r2
            int r0 = r25.readInt()
            if (r0 != r5) goto L_0x01ce
            goto L_0x01cf
        L_0x01ce:
            r5 = r6
        L_0x01cf:
            r1.f1653c = r5
            return r1
        L_0x01d2:
            int r1 = M0.a.X(r25)
            com.google.android.gms.common.api.Scope[] r2 = G0.c.f386o
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            D0.c[] r4 = G0.c.f387p
            r15 = r2
            r16 = r3
            r18 = r4
            r19 = r18
            r10 = r6
            r11 = r10
            r12 = r11
            r20 = r12
            r21 = r20
            r22 = r21
            r13 = r7
            r14 = r13
            r17 = r14
            r23 = r17
        L_0x01f5:
            int r2 = r25.dataPosition()
            if (r2 >= r1) goto L_0x0275
            int r2 = r25.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x0270;
                case 2: goto L_0x026b;
                case 3: goto L_0x0266;
                case 4: goto L_0x0261;
                case 5: goto L_0x024b;
                case 6: goto L_0x0241;
                case 7: goto L_0x023c;
                case 8: goto L_0x0231;
                case 9: goto L_0x0203;
                case 10: goto L_0x0226;
                case 11: goto L_0x021b;
                case 12: goto L_0x0216;
                case 13: goto L_0x0211;
                case 14: goto L_0x020c;
                case 15: goto L_0x0207;
                default: goto L_0x0203;
            }
        L_0x0203:
            M0.a.T(r0, r2)
            goto L_0x01f5
        L_0x0207:
            java.lang.String r23 = M0.a.j(r0, r2)
            goto L_0x01f5
        L_0x020c:
            boolean r22 = M0.a.H(r0, r2)
            goto L_0x01f5
        L_0x0211:
            int r21 = M0.a.J(r0, r2)
            goto L_0x01f5
        L_0x0216:
            boolean r20 = M0.a.H(r0, r2)
            goto L_0x01f5
        L_0x021b:
            android.os.Parcelable$Creator<D0.c> r3 = D0.c.CREATOR
            java.lang.Object[] r2 = M0.a.k(r0, r2, r3)
            r19 = r2
            D0.c[] r19 = (D0.c[]) r19
            goto L_0x01f5
        L_0x0226:
            android.os.Parcelable$Creator<D0.c> r3 = D0.c.CREATOR
            java.lang.Object[] r2 = M0.a.k(r0, r2, r3)
            r18 = r2
            D0.c[] r18 = (D0.c[]) r18
            goto L_0x01f5
        L_0x0231:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = M0.a.i(r0, r2, r3)
            r17 = r2
            android.accounts.Account r17 = (android.accounts.Account) r17
            goto L_0x01f5
        L_0x023c:
            android.os.Bundle r16 = M0.a.g(r0, r2)
            goto L_0x01f5
        L_0x0241:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r2 = M0.a.k(r0, r2, r3)
            r15 = r2
            com.google.android.gms.common.api.Scope[] r15 = (com.google.android.gms.common.api.Scope[]) r15
            goto L_0x01f5
        L_0x024b:
            int r2 = M0.a.K(r0, r2)
            int r3 = r25.dataPosition()
            if (r2 != 0) goto L_0x0257
            r14 = r7
            goto L_0x01f5
        L_0x0257:
            android.os.IBinder r4 = r25.readStrongBinder()
            int r3 = r3 + r2
            r0.setDataPosition(r3)
            r14 = r4
            goto L_0x01f5
        L_0x0261:
            java.lang.String r13 = M0.a.j(r0, r2)
            goto L_0x01f5
        L_0x0266:
            int r12 = M0.a.J(r0, r2)
            goto L_0x01f5
        L_0x026b:
            int r11 = M0.a.J(r0, r2)
            goto L_0x01f5
        L_0x0270:
            int r10 = M0.a.J(r0, r2)
            goto L_0x01f5
        L_0x0275:
            M0.a.o(r0, r1)
            G0.c r0 = new G0.c
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        L_0x027f:
            int r1 = M0.a.X(r25)
            r11 = r6
            r12 = r11
            r14 = r12
            r10 = r7
            r13 = r10
            r15 = r13
        L_0x0289:
            int r2 = r25.dataPosition()
            if (r2 >= r1) goto L_0x02e0
            int r2 = r25.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x02d6;
                case 2: goto L_0x02d1;
                case 3: goto L_0x02cc;
                case 4: goto L_0x02b6;
                case 5: goto L_0x02b1;
                case 6: goto L_0x029b;
                default: goto L_0x0297;
            }
        L_0x0297:
            M0.a.T(r0, r2)
            goto L_0x0289
        L_0x029b:
            int r2 = M0.a.K(r0, r2)
            int r3 = r25.dataPosition()
            if (r2 != 0) goto L_0x02a7
            r15 = r7
            goto L_0x0289
        L_0x02a7:
            int[] r4 = r25.createIntArray()
            int r3 = r3 + r2
            r0.setDataPosition(r3)
            r15 = r4
            goto L_0x0289
        L_0x02b1:
            int r14 = M0.a.J(r0, r2)
            goto L_0x0289
        L_0x02b6:
            int r2 = M0.a.K(r0, r2)
            int r3 = r25.dataPosition()
            if (r2 != 0) goto L_0x02c2
            r13 = r7
            goto L_0x0289
        L_0x02c2:
            int[] r4 = r25.createIntArray()
            int r3 = r3 + r2
            r0.setDataPosition(r3)
            r13 = r4
            goto L_0x0289
        L_0x02cc:
            boolean r12 = M0.a.H(r0, r2)
            goto L_0x0289
        L_0x02d1:
            boolean r11 = M0.a.H(r0, r2)
            goto L_0x0289
        L_0x02d6:
            android.os.Parcelable$Creator<G0.g> r3 = G0.g.CREATOR
            android.os.Parcelable r2 = M0.a.i(r0, r2, r3)
            r10 = r2
            G0.g r10 = (G0.g) r10
            goto L_0x0289
        L_0x02e0:
            M0.a.o(r0, r1)
            G0.b r0 = new G0.b
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r0
        L_0x02ea:
            int r1 = M0.a.X(r25)
            r9 = r7
            r10 = r9
        L_0x02f0:
            int r11 = r25.dataPosition()
            if (r11 >= r1) goto L_0x0323
            int r11 = r25.readInt()
            char r12 = (char) r11
            if (r12 == r5) goto L_0x031e
            if (r12 == r4) goto L_0x0315
            if (r12 == r3) goto L_0x0310
            if (r12 == r2) goto L_0x0307
            M0.a.T(r0, r11)
            goto L_0x02f0
        L_0x0307:
            android.os.Parcelable$Creator<G0.b> r10 = G0.b.CREATOR
            android.os.Parcelable r10 = M0.a.i(r0, r11, r10)
            G0.b r10 = (G0.b) r10
            goto L_0x02f0
        L_0x0310:
            int r6 = M0.a.J(r0, r11)
            goto L_0x02f0
        L_0x0315:
            android.os.Parcelable$Creator<D0.c> r9 = D0.c.CREATOR
            java.lang.Object[] r9 = M0.a.k(r0, r11, r9)
            D0.c[] r9 = (D0.c[]) r9
            goto L_0x02f0
        L_0x031e:
            android.os.Bundle r7 = M0.a.g(r0, r11)
            goto L_0x02f0
        L_0x0323:
            M0.a.o(r0, r1)
            G0.u r0 = new G0.u
            r0.<init>()
            r0.f444a = r7
            r0.f445b = r9
            r0.f446c = r6
            r0.f447d = r10
            return r0
        L_0x0334:
            int r1 = M0.a.X(r25)
            r10 = r6
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x033d:
            int r6 = r25.dataPosition()
            if (r6 >= r1) goto L_0x0370
            int r6 = r25.readInt()
            char r7 = (char) r6
            if (r7 == r5) goto L_0x036b
            if (r7 == r4) goto L_0x0366
            if (r7 == r3) goto L_0x0361
            if (r7 == r2) goto L_0x035c
            r9 = 5
            if (r7 == r9) goto L_0x0357
            M0.a.T(r0, r6)
            goto L_0x033d
        L_0x0357:
            int r14 = M0.a.J(r0, r6)
            goto L_0x033d
        L_0x035c:
            int r13 = M0.a.J(r0, r6)
            goto L_0x033d
        L_0x0361:
            boolean r12 = M0.a.H(r0, r6)
            goto L_0x033d
        L_0x0366:
            boolean r11 = M0.a.H(r0, r6)
            goto L_0x033d
        L_0x036b:
            int r10 = M0.a.J(r0, r6)
            goto L_0x033d
        L_0x0370:
            M0.a.o(r0, r1)
            G0.g r0 = new G0.g
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            return r0
        L_0x037a:
            int r2 = M0.a.X(r25)
            r3 = 0
            r5 = -1
            r13 = r3
            r15 = r13
            r20 = r5
            r10 = r6
            r11 = r10
            r12 = r11
            r19 = r12
            r17 = r7
            r18 = r17
        L_0x038e:
            int r3 = r25.dataPosition()
            if (r3 >= r2) goto L_0x03e0
            int r3 = r25.readInt()
            char r4 = (char) r3
            switch(r4) {
                case 1: goto L_0x03da;
                case 2: goto L_0x03d4;
                case 3: goto L_0x03ce;
                case 4: goto L_0x03c5;
                case 5: goto L_0x03bc;
                case 6: goto L_0x03b5;
                case 7: goto L_0x03ae;
                case 8: goto L_0x03a7;
                case 9: goto L_0x03a0;
                default: goto L_0x039c;
            }
        L_0x039c:
            M0.a.T(r0, r3)
            goto L_0x038e
        L_0x03a0:
            int r3 = M0.a.J(r0, r3)
            r20 = r3
            goto L_0x038e
        L_0x03a7:
            int r3 = M0.a.J(r0, r3)
            r19 = r3
            goto L_0x038e
        L_0x03ae:
            java.lang.String r3 = M0.a.j(r0, r3)
            r18 = r3
            goto L_0x038e
        L_0x03b5:
            java.lang.String r3 = M0.a.j(r0, r3)
            r17 = r3
            goto L_0x038e
        L_0x03bc:
            M0.a.a0(r0, r3, r1)
            long r3 = r25.readLong()
            r15 = r3
            goto L_0x038e
        L_0x03c5:
            M0.a.a0(r0, r3, r1)
            long r3 = r25.readLong()
            r13 = r3
            goto L_0x038e
        L_0x03ce:
            int r3 = M0.a.J(r0, r3)
            r12 = r3
            goto L_0x038e
        L_0x03d4:
            int r3 = M0.a.J(r0, r3)
            r11 = r3
            goto L_0x038e
        L_0x03da:
            int r3 = M0.a.J(r0, r3)
            r10 = r3
            goto L_0x038e
        L_0x03e0:
            M0.a.o(r0, r2)
            G0.e r0 = new G0.e
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r15, r17, r18, r19, r20)
            return r0
        L_0x03ea:
            int r1 = M0.a.X(r25)
        L_0x03ee:
            r2 = r7
        L_0x03ef:
            int r3 = r25.dataPosition()
            if (r3 >= r1) goto L_0x041e
            int r3 = r25.readInt()
            char r9 = (char) r3
            if (r9 == r5) goto L_0x0418
            if (r9 == r4) goto L_0x0402
            M0.a.T(r0, r3)
            goto L_0x03ef
        L_0x0402:
            android.os.Parcelable$Creator<G0.e> r2 = G0.e.CREATOR
            int r3 = M0.a.K(r0, r3)
            int r9 = r25.dataPosition()
            if (r3 != 0) goto L_0x040f
            goto L_0x03ee
        L_0x040f:
            java.util.ArrayList r2 = r0.createTypedArrayList(r2)
            int r9 = r9 + r3
            r0.setDataPosition(r9)
            goto L_0x03ef
        L_0x0418:
            int r3 = M0.a.J(r0, r3)
            r6 = r3
            goto L_0x03ef
        L_0x041e:
            M0.a.o(r0, r1)
            G0.h r0 = new G0.h
            r0.<init>(r6, r2)
            return r0
        L_0x0427:
            F.j r1 = new F.j
            r1.<init>(r0)
            int r0 = r25.readInt()
            r1.f288a = r0
            return r1
        L_0x0433:
            int r1 = M0.a.X(r25)
            r9 = r7
            r10 = r9
        L_0x0439:
            int r11 = r25.dataPosition()
            if (r11 >= r1) goto L_0x046c
            int r11 = r25.readInt()
            char r12 = (char) r11
            if (r12 == r5) goto L_0x0467
            if (r12 == r4) goto L_0x0462
            if (r12 == r3) goto L_0x0459
            if (r12 == r2) goto L_0x0450
            M0.a.T(r0, r11)
            goto L_0x0439
        L_0x0450:
            android.os.Parcelable$Creator<D0.a> r10 = D0.a.CREATOR
            android.os.Parcelable r10 = M0.a.i(r0, r11, r10)
            D0.a r10 = (D0.a) r10
            goto L_0x0439
        L_0x0459:
            android.os.Parcelable$Creator r9 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r9 = M0.a.i(r0, r11, r9)
            android.app.PendingIntent r9 = (android.app.PendingIntent) r9
            goto L_0x0439
        L_0x0462:
            java.lang.String r7 = M0.a.j(r0, r11)
            goto L_0x0439
        L_0x0467:
            int r6 = M0.a.J(r0, r11)
            goto L_0x0439
        L_0x046c:
            M0.a.o(r0, r1)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r6, r7, r9, r10)
            return r0
        L_0x0475:
            int r1 = M0.a.X(r25)
        L_0x0479:
            int r2 = r25.dataPosition()
            if (r2 >= r1) goto L_0x0496
            int r2 = r25.readInt()
            char r3 = (char) r2
            if (r3 == r5) goto L_0x0491
            if (r3 == r4) goto L_0x048c
            M0.a.T(r0, r2)
            goto L_0x0479
        L_0x048c:
            java.lang.String r7 = M0.a.j(r0, r2)
            goto L_0x0479
        L_0x0491:
            int r6 = M0.a.J(r0, r2)
            goto L_0x0479
        L_0x0496:
            M0.a.o(r0, r1)
            com.google.android.gms.common.api.Scope r0 = new com.google.android.gms.common.api.Scope
            r0.<init>(r7, r6)
            return r0
        L_0x049f:
            int r2 = M0.a.X(r25)
            r9 = -1
        L_0x04a5:
            int r11 = r25.dataPosition()
            if (r11 >= r2) goto L_0x04cc
            int r11 = r25.readInt()
            char r12 = (char) r11
            if (r12 == r5) goto L_0x04c7
            if (r12 == r4) goto L_0x04c2
            if (r12 == r3) goto L_0x04ba
            M0.a.T(r0, r11)
            goto L_0x04a5
        L_0x04ba:
            M0.a.a0(r0, r11, r1)
            long r9 = r25.readLong()
            goto L_0x04a5
        L_0x04c2:
            int r6 = M0.a.J(r0, r11)
            goto L_0x04a5
        L_0x04c7:
            java.lang.String r7 = M0.a.j(r0, r11)
            goto L_0x04a5
        L_0x04cc:
            M0.a.o(r0, r2)
            D0.c r0 = new D0.c
            r0.<init>(r9, r7, r6)
            return r0
        L_0x04d5:
            int r1 = M0.a.X(r25)
            r9 = r7
            r10 = r9
            r7 = r6
        L_0x04dc:
            int r11 = r25.dataPosition()
            if (r11 >= r1) goto L_0x050b
            int r11 = r25.readInt()
            char r12 = (char) r11
            if (r12 == r5) goto L_0x0506
            if (r12 == r4) goto L_0x0501
            if (r12 == r3) goto L_0x04f8
            if (r12 == r2) goto L_0x04f3
            M0.a.T(r0, r11)
            goto L_0x04dc
        L_0x04f3:
            java.lang.String r10 = M0.a.j(r0, r11)
            goto L_0x04dc
        L_0x04f8:
            android.os.Parcelable$Creator r9 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r9 = M0.a.i(r0, r11, r9)
            android.app.PendingIntent r9 = (android.app.PendingIntent) r9
            goto L_0x04dc
        L_0x0501:
            int r7 = M0.a.J(r0, r11)
            goto L_0x04dc
        L_0x0506:
            int r6 = M0.a.J(r0, r11)
            goto L_0x04dc
        L_0x050b:
            M0.a.o(r0, r1)
            D0.a r0 = new D0.a
            r0.<init>(r6, r7, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.j.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final Object[] newArray(int i3) {
        switch (this.f210a) {
            case 0:
                return new a[i3];
            case 1:
                return new c[i3];
            case k.FLOAT_FIELD_NUMBER /*2*/:
                return new Scope[i3];
            case k.INTEGER_FIELD_NUMBER /*3*/:
                return new Status[i3];
            case k.LONG_FIELD_NUMBER /*4*/:
                return new F.j[i3];
            case k.STRING_FIELD_NUMBER /*5*/:
                return new h[i3];
            case k.STRING_SET_FIELD_NUMBER /*6*/:
                return new e[i3];
            case k.DOUBLE_FIELD_NUMBER /*7*/:
                return new g[i3];
            case k.BYTES_FIELD_NUMBER /*8*/:
                return new u[i3];
            case 9:
                return new b[i3];
            case 10:
                return new c[i3];
            case 11:
                return new C0092m[i3];
            case 12:
                return new I[i3];
            case 13:
                return new J[i3];
            case 14:
                return new ParcelImpl[i3];
            case 15:
                return new MediaBrowserCompat$MediaItem[i3];
            case 16:
                return new MediaDescriptionCompat[i3];
            case 17:
                return new MediaMetadataCompat[i3];
            case 18:
                return new RatingCompat[i3];
            case 19:
                return new MediaSessionCompat$QueueItem[i3];
            case 20:
                return new MediaSessionCompat$ResultReceiverWrapper[i3];
            case 21:
                return new MediaSessionCompat$Token[i3];
            case 22:
                return new ParcelableVolumeInfo[i3];
            case 23:
                return new PlaybackStateCompat[i3];
            case 24:
                return new d[i3];
            default:
                return new C0463x[i3];
        }
    }
}
