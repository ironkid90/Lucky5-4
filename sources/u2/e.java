package U2;

import android.media.MediaPlayer;
import java.util.HashMap;

public final /* synthetic */ class e implements MediaPlayer.OnSeekCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f1805a;

    public /* synthetic */ e(p pVar) {
        this.f1805a = pVar;
    }

    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        p pVar = this.f1805a;
        pVar.f1833a.getClass();
        pVar.f1834b.J("audio.onSeekComplete", new HashMap());
    }
}
