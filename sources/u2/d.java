package U2;

import T2.f;
import android.media.MediaPlayer;
import java.util.HashMap;

public final /* synthetic */ class d implements MediaPlayer.OnCompletionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f1804a;

    public /* synthetic */ d(p pVar) {
        this.f1804a = pVar;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        p pVar = this.f1804a;
        if (pVar.f1842j != f.f1747g) {
            pVar.k();
        }
        pVar.f1833a.getClass();
        pVar.f1834b.J("audio.onComplete", new HashMap());
    }
}
