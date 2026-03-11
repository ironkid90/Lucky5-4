package io.flutter.plugins.firebase.messaging;

import a.C0094a;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

public class FlutterFirebaseMessagingInitProvider extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        if (C0094a.f1971k != null) {
            return false;
        }
        Context context = getContext();
        if (!(context == null || context.getApplicationContext() == null)) {
            context = context.getApplicationContext();
        }
        Log.d("FLTFireContextHolder", "received application context.");
        C0094a.f1971k = context;
        return false;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
