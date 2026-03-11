package C0;

import O0.e;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.Objects;
import java.util.regex.Matcher;
import n.k;

public final class g extends e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f130a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(b bVar, Looper looper) {
        super(looper);
        this.f130a = bVar;
        Looper.getMainLooper();
    }

    public final void handleMessage(Message message) {
        b bVar = this.f130a;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new h());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof i) {
                        bVar.f117g = (i) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        bVar.f116f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !Objects.equals(split[1], "ID")) {
                                Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                                return;
                            }
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            bVar.b(str, intent2.putExtra("error", str2).getExtras());
                            return;
                        }
                        synchronized (bVar.f111a) {
                            int i3 = 0;
                            while (true) {
                                try {
                                    k kVar = bVar.f111a;
                                    if (i3 < kVar.f4091h) {
                                        bVar.b((String) kVar.g(i3), intent2.getExtras());
                                        i3++;
                                    }
                                } finally {
                                }
                            }
                        }
                        return;
                    }
                    Matcher matcher = b.f110j.matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group != null) {
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            bVar.b(group, extras);
                            return;
                        }
                        return;
                    } else if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
