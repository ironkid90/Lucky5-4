package V2;

import A2.i;
import U2.l;
import android.media.MediaPlayer;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f1873a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1874b;

    public d(String str, boolean z3) {
        this.f1873a = str;
        this.f1874b = z3;
    }

    public final void a(l lVar) {
        i.e(lVar, "soundPoolPlayer");
        lVar.release();
        lVar.d(this);
    }

    public final void b(MediaPlayer mediaPlayer) {
        i.e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f1873a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (i.a(this.f1873a, dVar.f1873a) && this.f1874b == dVar.f1874b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1874b) + (this.f1873a.hashCode() * 31);
    }

    public final String toString() {
        return "UrlSource(url=" + this.f1873a + ", isLocal=" + this.f1874b + ')';
    }
}
