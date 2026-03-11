package j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

final class i extends j {

    /* renamed from: d  reason: collision with root package name */
    private final Set f5233d;

    i() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String add : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(add);
        }
        this.f5233d = Collections.unmodifiableSet(linkedHashSet);
    }

    /* access modifiers changed from: protected */
    public final Set d() {
        return this.f5233d;
    }

    /* access modifiers changed from: protected */
    public final f c(String str) {
        if (this.f5233d.contains(str)) {
            return new f(TimeZone.getTimeZone(str));
        }
        throw new RuntimeException("Not a built-in time zone: " + str);
    }
}
