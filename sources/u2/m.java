package U2;

import A2.i;
import android.media.SoundPool;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final SoundPool f1828a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f1829b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f1830c;

    public m(SoundPool soundPool) {
        this.f1828a = soundPool;
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        i.d(synchronizedMap, "synchronizedMap(...)");
        this.f1829b = synchronizedMap;
        Map synchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
        i.d(synchronizedMap2, "synchronizedMap(...)");
        this.f1830c = synchronizedMap2;
    }
}
