package j;

import android.view.MotionEvent;
import android.view.View;

public final class H implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ I f3596a;

    public H(I i3) {
        this.f3596a = i3;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        r rVar;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        I i3 = this.f3596a;
        if (action == 0 && (rVar = i3.f3599A) != null && rVar.isShowing() && x2 >= 0 && x2 < i3.f3599A.getWidth() && y2 >= 0 && y2 < i3.f3599A.getHeight()) {
            i3.f3616w.postDelayed(i3.f3613s, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            i3.f3616w.removeCallbacks(i3.f3613s);
            return false;
        }
    }
}
