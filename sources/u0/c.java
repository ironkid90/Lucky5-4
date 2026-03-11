package u0;

public enum c implements h1.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);
    

    /* renamed from: f  reason: collision with root package name */
    public final int f4703f;

    /* access modifiers changed from: public */
    c(int i3) {
        this.f4703f = i3;
    }

    public final int a() {
        return this.f4703f;
    }
}
