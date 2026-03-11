package j$.time.format;

import java.util.Comparator;
import java.util.Map;

final class u implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return ((String) ((Map.Entry) obj2).getKey()).length() - ((String) ((Map.Entry) obj).getKey()).length();
    }
}
