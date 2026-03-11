package y0;

import android.database.Cursor;
import u0.g;

public final /* synthetic */ class f implements g {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f4820f;

    public /* synthetic */ f(long j3) {
        this.f4820f = j3;
    }

    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        cursor.moveToNext();
        return new g(cursor.getLong(0), this.f4820f);
    }
}
