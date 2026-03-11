package y0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

public final class k extends SQLiteOpenHelper {

    /* renamed from: h  reason: collision with root package name */
    public static final String f4830h = ("INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")");

    /* renamed from: i  reason: collision with root package name */
    public static final int f4831i = 5;

    /* renamed from: j  reason: collision with root package name */
    public static final List f4832j = Arrays.asList(new j[]{new j(0), new j(1), new j(2), new j(3), new j(4)});

    /* renamed from: f  reason: collision with root package name */
    public final int f4833f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4834g = false;

    public k(int i3, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i3);
        this.f4833f = i3;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
        List list = f4832j;
        if (i4 <= list.size()) {
            while (i3 < i4) {
                switch (((j) list.get(i3)).f4829a) {
                    case 0:
                        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                        break;
                    case 1:
                        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
                        break;
                    case L.k.FLOAT_FIELD_NUMBER:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                        break;
                    case L.k.INTEGER_FIELD_NUMBER:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                        break;
                    default:
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                        sQLiteDatabase.execSQL(f4830h);
                        break;
                }
                i3++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i3 + " to " + i4 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f4834g = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f4834g) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, this.f4833f);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f4834g) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i4);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f4834g) {
            onConfigure(sQLiteDatabase);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
        if (!this.f4834g) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i3, i4);
    }
}
