package D2;

import A2.i;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class a extends C2.a {
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        i.d(current, "current(...)");
        return current;
    }
}
