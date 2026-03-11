package U2;

import A2.i;
import C0.r;
import T2.d;
import android.media.MediaPlayer;

public final /* synthetic */ class f implements MediaPlayer.OnErrorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f1806a;

    public /* synthetic */ f(p pVar) {
        this.f1806a = pVar;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i3, int i4) {
        String str;
        String str2;
        p pVar = this.f1806a;
        pVar.getClass();
        if (i3 == 100) {
            str = "MEDIA_ERROR_SERVER_DIED";
        } else {
            str = "MEDIA_ERROR_UNKNOWN {what:" + i3 + '}';
        }
        if (i4 == Integer.MIN_VALUE) {
            str2 = "MEDIA_ERROR_SYSTEM";
        } else if (i4 == -1010) {
            str2 = "MEDIA_ERROR_UNSUPPORTED";
        } else if (i4 == -1007) {
            str2 = "MEDIA_ERROR_MALFORMED";
        } else if (i4 == -1004) {
            str2 = "MEDIA_ERROR_IO";
        } else if (i4 != -110) {
            str2 = "MEDIA_ERROR_UNKNOWN {extra:" + i4 + '}';
        } else {
            str2 = "MEDIA_ERROR_TIMED_OUT";
        }
        boolean z3 = pVar.f1845m;
        r rVar = pVar.f1834b;
        d dVar = pVar.f1833a;
        if (z3 || !i.a(str2, "MEDIA_ERROR_SYSTEM")) {
            pVar.h(false);
            dVar.getClass();
            rVar.F("AndroidAudioError", str, str2);
        } else {
            dVar.getClass();
            rVar.F("AndroidAudioError", "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md", str + ", " + str2);
        }
        return false;
    }
}
