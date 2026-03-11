package H2;

import A2.i;
import java.nio.charset.Charset;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f485a;

    static {
        Charset forName = Charset.forName("UTF-8");
        i.d(forName, "forName(...)");
        f485a = forName;
        i.d(Charset.forName("UTF-16"), "forName(...)");
        i.d(Charset.forName("UTF-16BE"), "forName(...)");
        i.d(Charset.forName("UTF-16LE"), "forName(...)");
        i.d(Charset.forName("US-ASCII"), "forName(...)");
        i.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
