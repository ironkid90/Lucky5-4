package s1;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* renamed from: s1.D  reason: case insensitive filesystem */
public final class C0431D {

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference f4495b;

    /* renamed from: a  reason: collision with root package name */
    public C0465z f4496a;

    public final synchronized C0430C a() {
        String str;
        C0430C c3;
        C0465z zVar = this.f4496a;
        synchronized (((ArrayDeque) zVar.f4630j)) {
            str = (String) ((ArrayDeque) zVar.f4630j).peek();
        }
        Pattern pattern = C0430C.f4491d;
        c3 = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                c3 = new C0430C(split[0], split[1]);
            }
        }
        return c3;
    }
}
