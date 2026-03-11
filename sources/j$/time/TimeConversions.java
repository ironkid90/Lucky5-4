package j$.time;

import java.time.Duration;

public class TimeConversions {
    public static Duration convert(Duration duration) {
        if (duration == null) {
            return null;
        }
        return Duration.ofSeconds(duration.J(), (long) duration.C());
    }

    public static Duration convert(Duration duration) {
        if (duration == null) {
            return null;
        }
        return Duration.T(duration.getSeconds(), (long) duration.getNano());
    }
}
