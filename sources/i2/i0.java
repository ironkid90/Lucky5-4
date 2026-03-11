package I2;

public abstract class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f764a = new ThreadLocal();

    public static I a() {
        ThreadLocal threadLocal = f764a;
        I i3 = (I) threadLocal.get();
        if (i3 != null) {
            return i3;
        }
        C0053d dVar = new C0053d(Thread.currentThread());
        threadLocal.set(dVar);
        return dVar;
    }
}
