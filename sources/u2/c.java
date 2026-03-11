package U2;

import android.media.MediaPlayer;
import p2.C0363c;
import q2.o;

public final /* synthetic */ class c implements MediaPlayer.OnPreparedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f1803a;

    public /* synthetic */ c(p pVar) {
        this.f1803a = pVar;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        int i3;
        h hVar;
        h hVar2;
        p pVar = this.f1803a;
        pVar.h(true);
        pVar.f1833a.getClass();
        Integer num = null;
        if (pVar.f1845m && (hVar2 = pVar.f1837e) != null) {
            num = hVar2.i();
        }
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = 0;
        }
        pVar.f1834b.J("audio.onDuration", o.Z(new C0363c("value", Integer.valueOf(i3))));
        if (pVar.f1846n) {
            pVar.f();
        }
        if (pVar.f1847o >= 0) {
            h hVar3 = pVar.f1837e;
            if ((hVar3 == null || !hVar3.j()) && (hVar = pVar.f1837e) != null) {
                hVar.n(pVar.f1847o);
            }
        }
    }
}
