package G0;

import D0.f;
import K0.b;
import M0.c;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.ai9poker.app.R;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import n.k;
import w.C0499a;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final k f421a = new k();

    /* renamed from: b  reason: collision with root package name */
    public static Locale f422b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = c.a(context).f1087a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String b(Context context, int i3) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i3 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, new Object[]{a2});
        }
        if (i3 != 2) {
            if (i3 == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, new Object[]{a2});
            }
            if (i3 == 5) {
                return d(context, "common_google_play_services_invalid_account_text", a2);
            }
            if (i3 == 7) {
                return d(context, "common_google_play_services_network_error_text", a2);
            }
            if (i3 == 9) {
                return resources.getString(R.string.common_google_play_services_unsupported_text, new Object[]{a2});
            }
            if (i3 == 20) {
                return d(context, "common_google_play_services_restricted_profile_text", a2);
            }
            switch (i3) {
                case 16:
                    return d(context, "common_google_play_services_api_unavailable_text", a2);
                case 17:
                    return d(context, "common_google_play_services_sign_in_failed_text", a2);
                case 18:
                    return resources.getString(R.string.common_google_play_services_updating_text, new Object[]{a2});
                default:
                    return resources.getString(R.string.common_google_play_services_unknown_issue, new Object[]{a2});
            }
        } else if (b.c(context)) {
            return resources.getString(R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(R.string.common_google_play_services_update_text, new Object[]{a2});
        }
    }

    public static String c(Context context, int i3) {
        Resources resources = context.getResources();
        switch (i3) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case L.k.FLOAT_FIELD_NUMBER /*2*/:
                return resources.getString(R.string.common_google_play_services_update_title);
            case L.k.INTEGER_FIELD_NUMBER /*3*/:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case L.k.LONG_FIELD_NUMBER /*4*/:
            case L.k.STRING_SET_FIELD_NUMBER /*6*/:
            case 18:
                return null;
            case L.k.STRING_FIELD_NUMBER /*5*/:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case L.k.DOUBLE_FIELD_NUMBER /*7*/:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case L.k.BYTES_FIELD_NUMBER /*8*/:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i3);
                return null;
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e2 = e(context, str);
        if (e2 == null) {
            e2 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e2, new Object[]{str2});
    }

    public static String e(Context context, String str) {
        Resources resources;
        k kVar = f421a;
        synchronized (kVar) {
            try {
                Locale locale = C0499a.a(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(f422b)) {
                    kVar.clear();
                    f422b = locale;
                }
                String str2 = (String) kVar.getOrDefault(str, (Object) null);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = f.f202a;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources == null) {
                    return null;
                }
                int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    return null;
                }
                String string = resources.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    return null;
                }
                f421a.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
