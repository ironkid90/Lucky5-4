package V2;

import A2.i;
import U2.l;
import android.media.MediaPlayer;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final a f1872a;

    public b(byte[] bArr) {
        this.f1872a = new a(bArr);
    }

    public final void a(l lVar) {
        i.e(lVar, "soundPoolPlayer");
        throw new IllegalStateException("Bytes sources are not supported on LOW_LATENCY mode yet.");
    }

    public final void b(MediaPlayer mediaPlayer) {
        i.e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f1872a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && i.a(this.f1872a, ((b) obj).f1872a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1872a.hashCode();
    }

    public final String toString() {
        return "BytesSource(dataSource=" + this.f1872a + ')';
    }
}
