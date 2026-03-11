package U2;

import android.media.AudioManager;

public final /* synthetic */ class a implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1795a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ M0.a f1796b;

    public /* synthetic */ a(M0.a aVar, int i3) {
        this.f1795a = i3;
        this.f1796b = aVar;
    }

    public final void onAudioFocusChange(int i3) {
        switch (this.f1795a) {
            case 0:
                ((b) this.f1796b).v(i3);
                return;
            default:
                ((b) this.f1796b).v(i3);
                return;
        }
    }
}
