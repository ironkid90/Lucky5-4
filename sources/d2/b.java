package d2;

import C0.r;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import c2.p;
import c2.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final r f2913a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2914b;

    public b(Context context, r rVar) {
        C0152a aVar = new C0152a(0, this);
        this.f2914b = context;
        this.f2913a = rVar;
        rVar.f161h = aVar;
    }

    public static Locale a(String str) {
        Locale.Builder builder = new Locale.Builder();
        String[] split = str.replace('_', '-').split("-");
        builder.setLanguage(split[0]);
        int i3 = 1;
        if (split.length > 1 && split[1].length() == 4) {
            builder.setScript(split[1]);
            i3 = 2;
        }
        if (split.length > i3 && split[i3].length() >= 2 && split[i3].length() <= 3) {
            builder.setRegion(split[i3]);
        }
        return builder.build();
    }

    public final void b(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(locales.get(i3));
        }
        r rVar = this.f2913a;
        rVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            locale.getLanguage();
            locale.getCountry();
            locale.getVariant();
            arrayList2.add(locale.getLanguage());
            arrayList2.add(locale.getCountry());
            arrayList2.add(locale.getScript());
            arrayList2.add(locale.getVariant());
        }
        ((q) rVar.f160g).a("setLocale", arrayList2, (p) null);
    }
}
