package q;

import android.app.Person;
import android.content.Context;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;
import u.C0490b;

public abstract class U {
    /* JADX WARNING: type inference failed for: r5v0, types: [q.V, java.lang.Object] */
    public static V a(Person person) {
        IconCompat iconCompat;
        CharSequence name = person.getName();
        if (person.getIcon() != null) {
            iconCompat = IconCompat.b(person.getIcon());
        } else {
            iconCompat = null;
        }
        String uri = person.getUri();
        String key = person.getKey();
        boolean isBot = person.isBot();
        boolean isImportant = person.isImportant();
        ? obj = new Object();
        obj.f4232a = name;
        obj.f4233b = iconCompat;
        obj.f4234c = uri;
        obj.f4235d = key;
        obj.f4236e = isBot;
        obj.f4237f = isImportant;
        return obj;
    }

    public static Person b(V v) {
        Person.Builder name = new Person.Builder().setName(v.f4232a);
        Icon icon = null;
        IconCompat iconCompat = v.f4233b;
        if (iconCompat != null) {
            iconCompat.getClass();
            icon = C0490b.f(iconCompat, (Context) null);
        }
        return name.setIcon(icon).setUri(v.f4234c).setKey(v.f4235d).setBot(v.f4236e).setImportant(v.f4237f).build();
    }
}
