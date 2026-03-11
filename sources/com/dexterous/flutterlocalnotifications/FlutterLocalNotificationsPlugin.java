package com.dexterous.flutterlocalnotifications;

import C1.d;
import F0.h;
import S1.C0078d;
import Y1.b;
import Z1.a;
import a.C0094a;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.core.graphics.drawable.IconCompat;
import c2.m;
import c2.o;
import c2.p;
import c2.q;
import c2.s;
import c2.t;
import c2.u;
import com.dexterous.flutterlocalnotifications.models.BitmapSource;
import com.dexterous.flutterlocalnotifications.models.DateTimeComponents;
import com.dexterous.flutterlocalnotifications.models.IconSource;
import com.dexterous.flutterlocalnotifications.models.MessageDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationAction;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelAction;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelGroupDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationStyle;
import com.dexterous.flutterlocalnotifications.models.PersonDetails;
import com.dexterous.flutterlocalnotifications.models.ScheduleMode;
import com.dexterous.flutterlocalnotifications.models.ScheduledNotificationRepeatFrequency;
import com.dexterous.flutterlocalnotifications.models.SoundSource;
import com.dexterous.flutterlocalnotifications.models.styles.BigPictureStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.BigTextStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.DefaultStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.InboxStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.MessagingStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.StyleInformation;
import com.dexterous.flutterlocalnotifications.utils.BooleanUtils;
import com.dexterous.flutterlocalnotifications.utils.StringUtils;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l0.C0311a;
import q.C;
import q.C0370B;
import q.C0374d;
import q.C0375e;
import q.C0376f;
import q.C0379i;
import q.C0384n;
import q.C0386p;
import q.D;
import q.M;
import q.N;
import q.T;
import q.V;
import q.W;
import q.Z;
import r.C0414g;
import u.C0490b;
import w1.k;
import y1.f;

@Keep
public class FlutterLocalNotificationsPlugin implements o, t, u, s, b, a {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ACTION_ID = "actionId";
    private static final String ARE_NOTIFICATIONS_ENABLED_METHOD = "areNotificationsEnabled";
    private static final String CALLBACK_HANDLE = "callback_handle";
    private static final String CANCEL_ALL_METHOD = "cancelAll";
    private static final String CANCEL_ID = "id";
    private static final String CANCEL_METHOD = "cancel";
    static final String CANCEL_NOTIFICATION = "cancelNotification";
    private static final String CANCEL_TAG = "tag";
    private static final String CAN_SCHEDULE_EXACT_NOTIFICATIONS_METHOD = "canScheduleExactNotifications";
    private static final String CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD = "createNotificationChannelGroup";
    private static final String CREATE_NOTIFICATION_CHANNEL_METHOD = "createNotificationChannel";
    private static final String DEFAULT_ICON = "defaultIcon";
    private static final String DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD = "deleteNotificationChannelGroup";
    private static final String DELETE_NOTIFICATION_CHANNEL_METHOD = "deleteNotificationChannel";
    private static final String DISPATCHER_HANDLE = "dispatcher_handle";
    private static final String DRAWABLE = "drawable";
    private static final String EXACT_ALARMS_PERMISSION_ERROR_CODE = "exact_alarms_not_permitted";
    static final int EXACT_ALARM_PERMISSION_REQUEST_CODE = 2;
    static final int FULL_SCREEN_INTENT_PERMISSION_REQUEST_CODE = 3;
    private static final String GET_ACTIVE_NOTIFICATIONS_ERROR_MESSAGE = "Android version must be 6.0 or newer to use getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATIONS_METHOD = "getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_ERROR_CODE = "getActiveNotificationMessagingStyleError";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD = "getActiveNotificationMessagingStyle";
    private static final String GET_CALLBACK_HANDLE_METHOD = "getCallbackHandle";
    private static final String GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD = "getNotificationAppLaunchDetails";
    private static final String GET_NOTIFICATION_CHANNELS_ERROR_CODE = "getNotificationChannelsError";
    private static final String GET_NOTIFICATION_CHANNELS_METHOD = "getNotificationChannels";
    private static final String INITIALIZE_METHOD = "initialize";
    private static final String INPUT = "input";
    private static final String INPUT_RESULT = "FlutterLocalNotificationsPluginInputResult";
    private static final String INVALID_BIG_PICTURE_ERROR_CODE = "invalid_big_picture";
    private static final String INVALID_DRAWABLE_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a drawable resource to your Android head project.";
    private static final String INVALID_ICON_ERROR_CODE = "invalid_icon";
    private static final String INVALID_LARGE_ICON_ERROR_CODE = "invalid_large_icon";
    private static final String INVALID_LED_DETAILS_ERROR_CODE = "invalid_led_details";
    private static final String INVALID_LED_DETAILS_ERROR_MESSAGE = "Must specify both ledOnMs and ledOffMs to configure the blink cycle on older versions of Android before Oreo";
    private static final String INVALID_RAW_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a raw resource to your Android head project.";
    private static final String INVALID_SOUND_ERROR_CODE = "invalid_sound";
    private static final String METHOD_CHANNEL = "dexterous.com/flutter/local_notifications";
    static String NOTIFICATION_DETAILS = "notificationDetails";
    static final String NOTIFICATION_ID = "notificationId";
    private static final String NOTIFICATION_LAUNCHED_APP = "notificationLaunchedApp";
    static final int NOTIFICATION_PERMISSION_REQUEST_CODE = 1;
    private static final String NOTIFICATION_RESPONSE_TYPE = "notificationResponseType";
    static final String NOTIFICATION_TAG = "notificationTag";
    static final String PAYLOAD = "payload";
    private static final String PENDING_NOTIFICATION_REQUESTS_METHOD = "pendingNotificationRequests";
    private static final String PERIODICALLY_SHOW_METHOD = "periodicallyShow";
    private static final String PERIODICALLY_SHOW_WITH_DURATION = "periodicallyShowWithDuration";
    private static final String PERMISSION_REQUEST_IN_PROGRESS_ERROR_CODE = "permissionRequestInProgress";
    private static final String PERMISSION_REQUEST_IN_PROGRESS_ERROR_MESSAGE = "Another permission request is already in progress";
    private static final String REQUEST_EXACT_ALARMS_PERMISSION_METHOD = "requestExactAlarmsPermission";
    private static final String REQUEST_FULL_SCREEN_INTENT_PERMISSION_METHOD = "requestFullScreenIntentPermission";
    private static final String REQUEST_NOTIFICATIONS_PERMISSION_METHOD = "requestNotificationsPermission";
    private static final String SCHEDULED_NOTIFICATIONS = "scheduled_notifications";
    private static final String SELECT_FOREGROUND_NOTIFICATION_ACTION = "SELECT_FOREGROUND_NOTIFICATION";
    private static final String SELECT_NOTIFICATION = "SELECT_NOTIFICATION";
    private static final String SHARED_PREFERENCES_KEY = "notification_plugin_cache";
    private static final String SHOW_METHOD = "show";
    private static final String START_FOREGROUND_SERVICE = "startForegroundService";
    private static final String STOP_FOREGROUND_SERVICE = "stopForegroundService";
    private static final String TAG = "FLTLocalNotifPlugin";
    private static final String UNSUPPORTED_OS_VERSION_ERROR_CODE = "unsupported_os_version";
    private static final String ZONED_SCHEDULE_METHOD = "zonedSchedule";
    static k gson;
    private Context applicationContext;
    private h callback;
    private q channel;
    private Activity mainActivity;
    private e permissionRequestProgress = e.f2808f;

    private static void applyGrouping(NotificationDetails notificationDetails, C0386p pVar) {
        if (!StringUtils.isNullOrEmpty(notificationDetails.groupKey).booleanValue()) {
            pVar.f4293s = notificationDetails.groupKey;
            if (BooleanUtils.getValue(notificationDetails.setAsGroupSummary)) {
                pVar.f4294t = true;
            }
            pVar.f4270E = notificationDetails.groupAlertBehavior.intValue();
        }
    }

    private void areNotificationsEnabled(p pVar) {
        pVar.b(Boolean.valueOf(M.a(getNotificationManager(this.applicationContext).f4231b)));
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [l0.b, java.lang.Object] */
    public static k buildGson() {
        boolean z3;
        if (gson == null) {
            RuntimeTypeAdapterFactory<StyleInformation> registerSubtype = RuntimeTypeAdapterFactory.of(StyleInformation.class).registerSubtype(DefaultStyleInformation.class).registerSubtype(BigTextStyleInformation.class).registerSubtype(BigPictureStyleInformation.class).registerSubtype(InboxStyleInformation.class).registerSubtype(MessagingStyleInformation.class);
            f fVar = f.f4848h;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ? obj = new Object();
            D1.a aVar = new D1.a(ScheduleMode.class);
            if (aVar.f221b == aVar.f220a) {
                z3 = true;
            } else {
                z3 = $assertionsDisabled;
            }
            arrayList.add(new z1.p(obj, aVar, z3));
            arrayList.add(registerSubtype);
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
            arrayList3.addAll(arrayList);
            Collections.reverse(arrayList3);
            ArrayList arrayList4 = new ArrayList(arrayList2);
            Collections.reverse(arrayList4);
            arrayList3.addAll(arrayList4);
            boolean z4 = d.f181a;
            gson = new k(fVar, hashMap, arrayList3);
        }
        return gson;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [q.V, java.lang.Object] */
    private static V buildPerson(Context context, PersonDetails personDetails) {
        IconCompat iconCompat;
        IconSource iconSource;
        String str = null;
        if (personDetails == null) {
            return null;
        }
        boolean value = BooleanUtils.getValue(personDetails.bot);
        Object obj = personDetails.icon;
        if (obj == null || (iconSource = personDetails.iconBitmapSource) == null) {
            iconCompat = null;
        } else {
            iconCompat = getIconFromSource(context, obj, iconSource);
        }
        boolean value2 = BooleanUtils.getValue(personDetails.important);
        String str2 = personDetails.key;
        if (str2 == null) {
            str2 = null;
        }
        String str3 = personDetails.name;
        if (str3 == null) {
            str3 = null;
        }
        String str4 = personDetails.uri;
        if (str4 != null) {
            str = str4;
        }
        ? obj2 = new Object();
        obj2.f4232a = str3;
        obj2.f4233b = iconCompat;
        obj2.f4234c = str;
        obj2.f4235d = str2;
        obj2.f4236e = value;
        obj2.f4237f = value2;
        return obj2;
    }

    private static long calculateNextNotificationTrigger(long j3, long j4) {
        while (j3 < System.currentTimeMillis()) {
            j3 += j4;
        }
        return j3;
    }

    private static long calculateRepeatIntervalMilliseconds(NotificationDetails notificationDetails) {
        Integer num = notificationDetails.repeatIntervalMilliseconds;
        if (num != null) {
            return (long) num.intValue();
        }
        int i3 = c.f2804a[notificationDetails.repeatInterval.ordinal()];
        if (i3 == 1) {
            return 60000;
        }
        if (i3 == 2) {
            return 3600000;
        }
        if (i3 == 3) {
            return 86400000;
        }
        if (i3 != 4) {
            return 0;
        }
        return 604800000;
    }

    private static Boolean canCreateNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        boolean z3;
        NotificationChannelAction notificationChannelAction;
        if (Build.VERSION.SDK_INT < 26) {
            return Boolean.FALSE;
        }
        NotificationChannel b3 = ((NotificationManager) context.getSystemService("notification")).getNotificationChannel(notificationChannelDetails.id);
        if (!(b3 == null && ((notificationChannelAction = notificationChannelDetails.channelAction) == null || notificationChannelAction == NotificationChannelAction.CreateIfNotExists)) && (b3 == null || notificationChannelDetails.channelAction != NotificationChannelAction.Update)) {
            z3 = $assertionsDisabled;
        } else {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }

    private void cancel(m mVar, p pVar) {
        Map map = (Map) mVar.f2786b;
        cancelNotification((Integer) map.get(CANCEL_ID), (String) map.get(CANCEL_TAG));
        pVar.b((Object) null);
    }

    private void cancelAllNotifications(p pVar) {
        getNotificationManager(this.applicationContext).f4231b.cancelAll();
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        if (loadScheduledNotifications == null || loadScheduledNotifications.isEmpty()) {
            pVar.b((Object) null);
            return;
        }
        Intent intent = new Intent(this.applicationContext, ScheduledNotificationReceiver.class);
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, it.next().id.intValue(), intent));
        }
        saveScheduledNotifications(this.applicationContext, new ArrayList());
        pVar.b((Object) null);
    }

    private void cancelNotification(Integer num, String str) {
        getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, num.intValue(), new Intent(this.applicationContext, ScheduledNotificationReceiver.class)));
        T notificationManager = getNotificationManager(this.applicationContext);
        if (str == null) {
            notificationManager.a((String) null, num.intValue());
        } else {
            notificationManager.a(str, num.intValue());
        }
        removeNotificationFromCache(this.applicationContext, num);
    }

    private static byte[] castObjectToByteArray(Object obj) {
        if (!(obj instanceof ArrayList)) {
            return (byte[]) obj;
        }
        ArrayList arrayList = (ArrayList) obj;
        byte[] bArr = new byte[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            bArr[i3] = (byte) ((Double) arrayList.get(i3)).intValue();
        }
        return bArr;
    }

    private static void checkCanScheduleExactAlarms(AlarmManager alarmManager) {
        if (Build.VERSION.SDK_INT >= 31 && !alarmManager.canScheduleExactAlarms()) {
            throw new d();
        }
    }

    private static C0370B createMessage(Context context, MessageDetails messageDetails) {
        String str;
        C0370B b3 = new C0370B(messageDetails.text, messageDetails.timestamp.longValue(), buildPerson(context, messageDetails.person));
        String str2 = messageDetails.dataUri;
        if (!(str2 == null || (str = messageDetails.dataMimeType) == null)) {
            Uri parse = Uri.parse(str2);
            b3.f4199e = str;
            b3.f4200f = parse;
        }
        return b3;
    }

    public static Notification createNotification(Context context, NotificationDetails notificationDetails) {
        CharSequence charSequence;
        CharSequence charSequence2;
        IconCompat iconCompat;
        Intent intent;
        int i3;
        int i4;
        PendingIntent pendingIntent;
        boolean z3;
        CharSequence[] charSequenceArr;
        IconSource iconSource;
        Context context2 = context;
        NotificationDetails notificationDetails2 = notificationDetails;
        NotificationChannelDetails fromNotificationDetails = NotificationChannelDetails.fromNotificationDetails(notificationDetails);
        if (canCreateNotificationChannel(context2, fromNotificationDetails).booleanValue()) {
            setupNotificationChannel(context2, fromNotificationDetails);
        }
        Intent launchIntent = getLaunchIntent(context);
        launchIntent.setAction(SELECT_NOTIFICATION);
        launchIntent.putExtra(NOTIFICATION_ID, notificationDetails2.id);
        launchIntent.putExtra(PAYLOAD, notificationDetails2.payload);
        PendingIntent activity = PendingIntent.getActivity(context2, notificationDetails2.id.intValue(), launchIntent, 201326592);
        DefaultStyleInformation defaultStyleInformation = (DefaultStyleInformation) notificationDetails2.styleInformation;
        C0386p pVar = new C0386p(context2, notificationDetails2.channelId);
        if (defaultStyleInformation.htmlFormatTitle.booleanValue()) {
            charSequence = fromHtml(notificationDetails2.title);
        } else {
            charSequence = notificationDetails2.title;
        }
        pVar.f4279e = C0386p.b(charSequence);
        if (defaultStyleInformation.htmlFormatBody.booleanValue()) {
            charSequence2 = fromHtml(notificationDetails2.body);
        } else {
            charSequence2 = notificationDetails2.body;
        }
        pVar.f4280f = C0386p.b(charSequence2);
        pVar.f4272G.tickerText = C0386p.b(notificationDetails2.ticker);
        pVar.c(16, BooleanUtils.getValue(notificationDetails2.autoCancel));
        pVar.f4281g = activity;
        pVar.f4285k = notificationDetails2.priority.intValue();
        pVar.c(2, BooleanUtils.getValue(notificationDetails2.ongoing));
        pVar.f4273H = BooleanUtils.getValue(notificationDetails2.silent);
        pVar.c(8, BooleanUtils.getValue(notificationDetails2.onlyAlertOnce));
        if (notificationDetails2.actions != null) {
            int intValue = notificationDetails2.id.intValue() * 16;
            for (NotificationAction next : notificationDetails2.actions) {
                if (TextUtils.isEmpty(next.icon) || (iconSource = next.iconSource) == null) {
                    iconCompat = null;
                } else {
                    iconCompat = getIconFromSource(context2, next.icon, iconSource);
                }
                Boolean bool = next.showsUserInterface;
                if (bool == null || !bool.booleanValue()) {
                    intent = new Intent(context2, ActionBroadcastReceiver.class);
                    intent.setAction("com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED");
                } else {
                    intent = getLaunchIntent(context);
                    intent.setAction(SELECT_FOREGROUND_NOTIFICATION_ACTION);
                }
                intent.putExtra(NOTIFICATION_ID, notificationDetails2.id).putExtra(NOTIFICATION_TAG, notificationDetails2.tag).putExtra(ACTION_ID, next.id).putExtra(CANCEL_NOTIFICATION, next.cancelNotification).putExtra(PAYLOAD, notificationDetails2.payload);
                List<C0311a> list = next.actionInputs;
                if (list == null || list.isEmpty()) {
                    i3 = 201326592;
                } else if (Build.VERSION.SDK_INT >= 31) {
                    i3 = 167772160;
                } else {
                    i3 = 134217728;
                }
                Boolean bool2 = next.showsUserInterface;
                if (bool2 == null || !bool2.booleanValue()) {
                    i4 = intValue + 1;
                    pendingIntent = PendingIntent.getBroadcast(context2, intValue, intent, i3);
                } else {
                    i4 = intValue + 1;
                    pendingIntent = PendingIntent.getActivity(context2, intValue, intent, i3);
                }
                SpannableString spannableString = new SpannableString(next.title);
                if (next.titleColor != null) {
                    spannableString.setSpan(new ForegroundColorSpan(next.titleColor.intValue()), 0, spannableString.length(), 0);
                }
                C0379i iVar = new C0379i(iconCompat, spannableString, pendingIntent);
                Boolean bool3 = next.contextual;
                if (bool3 != null) {
                    iVar.f4250h = bool3.booleanValue();
                }
                Boolean bool4 = next.showsUserInterface;
                if (bool4 != null) {
                    iVar.f4249g = bool4.booleanValue();
                }
                Boolean bool5 = next.allowGeneratedReplies;
                if (bool5 != null) {
                    iVar.f4246d = bool5.booleanValue();
                }
                List<C0311a> list2 = next.actionInputs;
                if (list2 != null) {
                    for (C0311a next2 : list2) {
                        HashSet hashSet = new HashSet();
                        Bundle bundle = new Bundle();
                        String str = next2.f4004h;
                        Boolean bool6 = next2.f4003g;
                        if (bool6 != null) {
                            z3 = bool6.booleanValue();
                        } else {
                            z3 = true;
                        }
                        List<String> list3 = next2.f4005i;
                        if (list3 != null) {
                            for (String add : list3) {
                                hashSet.add(add);
                            }
                        }
                        List list4 = next2.f4002f;
                        if (list4 != null) {
                            charSequenceArr = (CharSequence[]) list4.toArray(new CharSequence[0]);
                        } else {
                            charSequenceArr = null;
                        }
                        Z z4 = new Z(str, charSequenceArr, z3, bundle, hashSet);
                        if (iVar.f4248f == null) {
                            iVar.f4248f = new ArrayList();
                        }
                        iVar.f4248f.add(z4);
                    }
                }
                pVar.f4276b.add(iVar.a());
                intValue = i4;
            }
        }
        setSmallIcon(context2, notificationDetails2, pVar);
        pVar.d(getBitmapFromSource(context2, notificationDetails2.largeIcon, notificationDetails2.largeIconBitmapSource));
        Integer num = notificationDetails2.color;
        if (num != null) {
            pVar.f4299z = num.intValue();
        }
        Boolean bool7 = notificationDetails2.colorized;
        if (bool7 != null) {
            pVar.v = bool7.booleanValue();
            pVar.f4296w = true;
        }
        Boolean bool8 = notificationDetails2.showWhen;
        if (bool8 != null) {
            pVar.f4286l = BooleanUtils.getValue(bool8);
        }
        Long l3 = notificationDetails2.when;
        if (l3 != null) {
            pVar.f4272G.when = l3.longValue();
        }
        Boolean bool9 = notificationDetails2.usesChronometer;
        if (bool9 != null) {
            pVar.f4287m = bool9.booleanValue();
        }
        Boolean bool10 = notificationDetails2.chronometerCountDown;
        if (bool10 != null) {
            boolean booleanValue = bool10.booleanValue();
            if (pVar.f4298y == null) {
                pVar.f4298y = new Bundle();
            }
            pVar.f4298y.putBoolean("android.chronometerCountDown", booleanValue);
        }
        if (BooleanUtils.getValue(notificationDetails2.fullScreenIntent)) {
            pVar.f4282h = activity;
            pVar.c(128, true);
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails2.shortcutId).booleanValue()) {
            pVar.f4268C = notificationDetails2.shortcutId;
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails2.subText).booleanValue()) {
            pVar.f4289o = C0386p.b(notificationDetails2.subText);
        }
        Integer num2 = notificationDetails2.number;
        if (num2 != null) {
            pVar.f4284j = num2.intValue();
        }
        setVisibility(notificationDetails2, pVar);
        applyGrouping(notificationDetails2, pVar);
        setSound(context2, notificationDetails2, pVar);
        setVibrationPattern(notificationDetails2, pVar);
        setLights(notificationDetails2, pVar);
        setStyle(context2, notificationDetails2, pVar);
        setProgress(notificationDetails2, pVar);
        setCategory(notificationDetails2, pVar);
        setTimeoutAfter(notificationDetails2, pVar);
        Notification a2 = pVar.a();
        int[] iArr = notificationDetails2.additionalFlags;
        if (iArr != null && iArr.length > 0) {
            for (int i5 : iArr) {
                a2.flags = i5 | a2.flags;
            }
        }
        return a2;
    }

    private void createNotificationChannel(m mVar, p pVar) {
        setupNotificationChannel(this.applicationContext, NotificationChannelDetails.from((Map) mVar.f2786b));
        pVar.b((Object) null);
    }

    private void createNotificationChannelGroup(m mVar, p pVar) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            NotificationChannelGroupDetails from = NotificationChannelGroupDetails.from((Map) mVar.f2786b);
            NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
            a.y();
            NotificationChannelGroup e2 = a.e(from.id, from.name);
            if (i3 >= 28) {
                e2.setDescription(from.description);
            }
            notificationManager.createNotificationChannelGroup(e2);
        }
        pVar.b((Object) null);
    }

    private void deleteNotificationChannel(m mVar, p pVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannel((String) mVar.f2786b);
        }
        pVar.b((Object) null);
    }

    private void deleteNotificationChannelGroup(m mVar, p pVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannelGroup((String) mVar.f2786b);
        }
        pVar.b((Object) null);
    }

    private Map<String, Object> describeIcon(IconCompat iconCompat) {
        String str;
        IconSource iconSource;
        if (iconCompat == null) {
            return null;
        }
        int i3 = iconCompat.f2296a;
        if (i3 == -1) {
            i3 = C0490b.c(iconCompat.f2297b);
        }
        if (i3 == 2) {
            iconSource = IconSource.DrawableResource;
            str = this.applicationContext.getResources().getResourceEntryName(iconCompat.f());
        } else if (i3 != 4) {
            return null;
        } else {
            iconSource = IconSource.ContentUri;
            str = iconCompat.g().toString();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("source", Integer.valueOf(iconSource.ordinal()));
        hashMap.put("data", str);
        return hashMap;
    }

    private Map<String, Object> describePerson(V v) {
        if (v == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("key", v.f4235d);
        hashMap.put("name", v.f4232a);
        hashMap.put("uri", v.f4234c);
        hashMap.put("bot", Boolean.valueOf(v.f4236e));
        hashMap.put("important", Boolean.valueOf(v.f4237f));
        hashMap.put("icon", describeIcon(v.f4233b));
        return hashMap;
    }

    private NotificationDetails extractNotificationDetails(p pVar, Map<String, Object> map) {
        NotificationDetails from = NotificationDetails.from(map);
        if (hasInvalidIcon(pVar, from.icon) || hasInvalidLargeIcon(pVar, from.largeIcon, from.largeIconBitmapSource) || hasInvalidBigPictureResources(pVar, from) || hasInvalidRawSoundResource(pVar, from) || hasInvalidLedDetails(pVar, from)) {
            return null;
        }
        return from;
    }

    public static Map<String, Object> extractNotificationResponseMap(Intent intent) {
        int intExtra = intent.getIntExtra(NOTIFICATION_ID, 0);
        HashMap hashMap = new HashMap();
        hashMap.put(NOTIFICATION_ID, Integer.valueOf(intExtra));
        hashMap.put(NOTIFICATION_TAG, intent.getStringExtra(NOTIFICATION_TAG));
        hashMap.put(ACTION_ID, intent.getStringExtra(ACTION_ID));
        hashMap.put(PAYLOAD, intent.getStringExtra(PAYLOAD));
        Bundle b3 = W.b(intent);
        if (b3 != null) {
            hashMap.put(INPUT, b3.getString(INPUT_RESULT));
        }
        if (SELECT_NOTIFICATION.equals(intent.getAction())) {
            hashMap.put(NOTIFICATION_RESPONSE_TYPE, 0);
        }
        if (SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            hashMap.put(NOTIFICATION_RESPONSE_TYPE, 1);
        }
        return hashMap;
    }

    private static Spanned fromHtml(String str) {
        if (str == null) {
            return null;
        }
        return Html.fromHtml(str, 0);
    }

    private void getActiveNotificationMessagingStyle(m mVar, p pVar) {
        Notification notification;
        StatusBarNotification statusBarNotification;
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
        try {
            Map map = (Map) mVar.f2786b;
            int intValue = ((Integer) map.get(CANCEL_ID)).intValue();
            String str = (String) map.get(CANCEL_TAG);
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            int length = activeNotifications.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    notification = null;
                    break;
                }
                statusBarNotification = activeNotifications[i3];
                if (statusBarNotification.getId() == intValue) {
                    if (str == null) {
                        break;
                    } else if (str.equals(statusBarNotification.getTag())) {
                        break;
                    }
                }
                i3++;
            }
            notification = statusBarNotification.getNotification();
            if (notification == null) {
                pVar.b((Object) null);
                return;
            }
            C e2 = C.e(notification);
            if (e2 == null) {
                pVar.b((Object) null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("groupConversation", Boolean.valueOf(e2.f()));
            hashMap.put("person", describePerson(e2.f4203g));
            hashMap.put("conversationTitle", e2.f4204h);
            ArrayList arrayList = new ArrayList();
            Iterator it = e2.f4201e.iterator();
            while (it.hasNext()) {
                C0370B b3 = (C0370B) it.next();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("text", b3.f4195a);
                hashMap2.put("timestamp", Long.valueOf(b3.f4196b));
                hashMap2.put("person", describePerson(b3.f4197c));
                arrayList.add(hashMap2);
            }
            hashMap.put("messages", arrayList);
            pVar.b(hashMap);
        } catch (Throwable th) {
            pVar.a(GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_ERROR_CODE, th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private void getActiveNotifications(p pVar) {
        try {
            StatusBarNotification[] activeNotifications = ((NotificationManager) this.applicationContext.getSystemService("notification")).getActiveNotifications();
            ArrayList arrayList = new ArrayList();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                HashMap hashMap = new HashMap();
                hashMap.put(CANCEL_ID, Integer.valueOf(statusBarNotification.getId()));
                Notification notification = statusBarNotification.getNotification();
                if (Build.VERSION.SDK_INT >= 26) {
                    hashMap.put("channelId", notification.getChannelId());
                }
                hashMap.put(CANCEL_TAG, statusBarNotification.getTag());
                hashMap.put("groupKey", notification.getGroup());
                hashMap.put("title", notification.extras.getCharSequence("android.title"));
                hashMap.put("body", notification.extras.getCharSequence("android.text"));
                hashMap.put("bigText", notification.extras.getCharSequence("android.bigText"));
                arrayList.add(hashMap);
            }
            pVar.b(arrayList);
        } catch (Throwable th) {
            pVar.a(UNSUPPORTED_OS_VERSION_ERROR_CODE, th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private static AlarmManager getAlarmManager(Context context) {
        return (AlarmManager) context.getSystemService("alarm");
    }

    private static Bitmap getBitmapFromSource(Context context, Object obj, BitmapSource bitmapSource) {
        if (bitmapSource == BitmapSource.DrawableResource) {
            return BitmapFactory.decodeResource(context.getResources(), getDrawableResourceId(context, (String) obj));
        }
        if (bitmapSource == BitmapSource.FilePath) {
            return BitmapFactory.decodeFile((String) obj);
        }
        if (bitmapSource != BitmapSource.ByteArray) {
            return null;
        }
        byte[] castObjectToByteArray = castObjectToByteArray(obj);
        return BitmapFactory.decodeByteArray(castObjectToByteArray, 0, castObjectToByteArray.length);
    }

    private static PendingIntent getBroadcastPendingIntent(Context context, int i3, Intent intent) {
        return PendingIntent.getBroadcast(context, i3, intent, 201326592);
    }

    private void getCallbackHandle(p pVar) {
        pVar.b(Long.valueOf(this.applicationContext.getSharedPreferences("flutter_local_notifications_plugin", 0).getLong("com.dexterous.flutterlocalnotifications.CALLBACK_HANDLE_KEY", -1)));
    }

    private static int getDrawableResourceId(Context context, String str) {
        return context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName());
    }

    private static IconCompat getIconFromSource(Context context, Object obj, IconSource iconSource) {
        IconCompat d3;
        int i3 = c.f2805b[iconSource.ordinal()];
        if (i3 == 1) {
            int drawableResourceId = getDrawableResourceId(context, (String) obj);
            PorterDuff.Mode mode = IconCompat.f2295k;
            context.getClass();
            return IconCompat.e(context.getResources(), context.getPackageName(), drawableResourceId);
        } else if (i3 == 2) {
            return IconCompat.d(BitmapFactory.decodeFile((String) obj));
        } else {
            if (i3 != 3) {
                if (i3 == 4) {
                    try {
                        AssetFileDescriptor openFd = context.getAssets().openFd(((W1.f) C0.f.O().f128h).b((String) obj));
                        FileInputStream createInputStream = openFd.createInputStream();
                        d3 = IconCompat.d(BitmapFactory.decodeStream(createInputStream));
                        createInputStream.close();
                        openFd.close();
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                } else if (i3 != 5) {
                    return null;
                } else {
                    byte[] castObjectToByteArray = castObjectToByteArray(obj);
                    int length = castObjectToByteArray.length;
                    d3 = new IconCompat(3);
                    d3.f2297b = castObjectToByteArray;
                    d3.f2300e = 0;
                    d3.f2301f = length;
                }
                return d3;
            }
            String str = (String) obj;
            PorterDuff.Mode mode2 = IconCompat.f2295k;
            str.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f2297b = str;
            return iconCompat;
        }
    }

    private static Intent getLaunchIntent(Context context) {
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }

    private HashMap<String, Object> getMappedNotificationChannel(NotificationChannel notificationChannel) {
        int i3;
        HashMap<String, Object> hashMap = new HashMap<>();
        if (Build.VERSION.SDK_INT >= 26) {
            hashMap.put(CANCEL_ID, notificationChannel.getId());
            hashMap.put("name", notificationChannel.getName());
            hashMap.put("description", notificationChannel.getDescription());
            hashMap.put("groupId", notificationChannel.getGroup());
            hashMap.put("showBadge", Boolean.valueOf(notificationChannel.canShowBadge()));
            hashMap.put("importance", Integer.valueOf(notificationChannel.getImportance()));
            Uri h3 = notificationChannel.getSound();
            if (h3 == null) {
                hashMap.put("sound", (Object) null);
                hashMap.put("playSound", Boolean.FALSE);
            } else {
                hashMap.put("playSound", Boolean.TRUE);
                List asList = Arrays.asList(SoundSource.values());
                if (h3.getScheme().equals("android.resource")) {
                    String[] split = h3.toString().split("/");
                    String str = split[split.length - 1];
                    Integer tryParseInt = tryParseInt(str);
                    if (tryParseInt == null) {
                        hashMap.put("soundSource", Integer.valueOf(asList.indexOf(SoundSource.RawResource)));
                        hashMap.put("sound", str);
                    } else {
                        try {
                            String resourceEntryName = this.applicationContext.getResources().getResourceEntryName(tryParseInt.intValue());
                            if (resourceEntryName != null) {
                                hashMap.put("soundSource", Integer.valueOf(asList.indexOf(SoundSource.RawResource)));
                                hashMap.put("sound", resourceEntryName);
                            }
                        } catch (Exception unused) {
                            hashMap.put("sound", (Object) null);
                            hashMap.put("playSound", Boolean.FALSE);
                        }
                    }
                } else {
                    hashMap.put("soundSource", Integer.valueOf(asList.indexOf(SoundSource.Uri)));
                    hashMap.put("sound", h3.toString());
                }
            }
            hashMap.put("enableVibration", Boolean.valueOf(notificationChannel.shouldVibrate()));
            hashMap.put("vibrationPattern", notificationChannel.getVibrationPattern());
            hashMap.put("enableLights", Boolean.valueOf(notificationChannel.shouldShowLights()));
            hashMap.put("ledColor", Integer.valueOf(notificationChannel.getLightColor()));
            AudioAttributes g2 = notificationChannel.getAudioAttributes();
            if (g2 == null) {
                i3 = 5;
            } else {
                i3 = g2.getUsage();
            }
            hashMap.put("audioAttributesUsage", Integer.valueOf(i3));
        }
        return hashMap;
    }

    private static String getNextFireDate(NotificationDetails notificationDetails) {
        ScheduledNotificationRepeatFrequency scheduledNotificationRepeatFrequency = notificationDetails.scheduledNotificationRepeatFrequency;
        if (scheduledNotificationRepeatFrequency == ScheduledNotificationRepeatFrequency.Daily) {
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusDays(1));
        } else if (scheduledNotificationRepeatFrequency != ScheduledNotificationRepeatFrequency.Weekly) {
            return null;
        } else {
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusWeeks(1));
        }
    }

    private static String getNextFireDateMatchingDateTimeComponents(NotificationDetails notificationDetails) {
        ZoneId of = ZoneId.of(notificationDetails.timeZoneName);
        ZonedDateTime of2 = ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), of);
        ZonedDateTime now = ZonedDateTime.now(of);
        ZonedDateTime of3 = ZonedDateTime.of(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), of2.getHour(), of2.getMinute(), of2.getSecond(), of2.getNano(), of);
        while (of3.isBefore(now)) {
            of3 = of3.plusDays(1);
        }
        DateTimeComponents dateTimeComponents = notificationDetails.matchDateTimeComponents;
        if (dateTimeComponents == DateTimeComponents.Time) {
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
        }
        if (dateTimeComponents == DateTimeComponents.DayOfWeekAndTime) {
            while (of3.getDayOfWeek() != of2.getDayOfWeek()) {
                of3 = of3.plusDays(1);
            }
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
        } else if (dateTimeComponents == DateTimeComponents.DayOfMonthAndTime) {
            while (of3.getDayOfMonth() != of2.getDayOfMonth()) {
                of3 = of3.plusDays(1);
            }
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
        } else if (dateTimeComponents != DateTimeComponents.DateAndTime) {
            return null;
        } else {
            while (true) {
                if (of3.getMonthValue() == of2.getMonthValue() && of3.getDayOfMonth() == of2.getDayOfMonth()) {
                    return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
                }
                of3 = of3.plusDays(1);
            }
        }
    }

    private void getNotificationAppLaunchDetails(p pVar) {
        boolean z3;
        HashMap hashMap = new HashMap();
        Boolean bool = Boolean.FALSE;
        Activity activity = this.mainActivity;
        if (activity != null) {
            Intent intent = activity.getIntent();
            if (intent == null || ((!SELECT_NOTIFICATION.equals(intent.getAction()) && !SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) || launchedActivityFromHistory(intent))) {
                z3 = $assertionsDisabled;
            } else {
                z3 = true;
            }
            Boolean valueOf = Boolean.valueOf(z3);
            if (z3) {
                hashMap.put("notificationResponse", extractNotificationResponseMap(intent));
            }
            bool = valueOf;
        }
        hashMap.put(NOTIFICATION_LAUNCHED_APP, bool);
        pVar.b(hashMap);
    }

    private void getNotificationChannels(p pVar) {
        List<NotificationChannel> list;
        try {
            T notificationManager = getNotificationManager(this.applicationContext);
            if (Build.VERSION.SDK_INT >= 26) {
                list = N.k(notificationManager.f4231b);
            } else {
                notificationManager.getClass();
                list = Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (NotificationChannel c3 : list) {
                arrayList.add(getMappedNotificationChannel(a.c(c3)));
            }
            pVar.b(arrayList);
        } catch (Throwable th) {
            pVar.a(GET_NOTIFICATION_CHANNELS_ERROR_CODE, th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private static T getNotificationManager(Context context) {
        return new T(context);
    }

    private boolean hasInvalidBigPictureResources(p pVar, NotificationDetails notificationDetails) {
        if (notificationDetails.style != NotificationStyle.BigPicture) {
            return $assertionsDisabled;
        }
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        if (hasInvalidLargeIcon(pVar, bigPictureStyleInformation.largeIcon, bigPictureStyleInformation.largeIconBitmapSource)) {
            return true;
        }
        BitmapSource bitmapSource = bigPictureStyleInformation.bigPictureBitmapSource;
        if (bitmapSource == BitmapSource.DrawableResource) {
            String str = (String) bigPictureStyleInformation.bigPicture;
            if (!StringUtils.isNullOrEmpty(str).booleanValue() || isValidDrawableResource(this.applicationContext, str, pVar, INVALID_BIG_PICTURE_ERROR_CODE)) {
                return $assertionsDisabled;
            }
            return true;
        } else if (bitmapSource == BitmapSource.FilePath) {
            return StringUtils.isNullOrEmpty((String) bigPictureStyleInformation.bigPicture).booleanValue();
        } else {
            if (bitmapSource != BitmapSource.ByteArray) {
                return $assertionsDisabled;
            }
            byte[] bArr = (byte[]) bigPictureStyleInformation.bigPicture;
            if (bArr == null || bArr.length == 0) {
                return true;
            }
            return $assertionsDisabled;
        }
    }

    private boolean hasInvalidIcon(p pVar, String str) {
        if (StringUtils.isNullOrEmpty(str).booleanValue() || isValidDrawableResource(this.applicationContext, str, pVar, INVALID_ICON_ERROR_CODE)) {
            return $assertionsDisabled;
        }
        return true;
    }

    private boolean hasInvalidLargeIcon(p pVar, Object obj, BitmapSource bitmapSource) {
        BitmapSource bitmapSource2 = BitmapSource.DrawableResource;
        if (bitmapSource == bitmapSource2 || bitmapSource == BitmapSource.FilePath) {
            String str = (String) obj;
            if (StringUtils.isNullOrEmpty(str).booleanValue() || bitmapSource != bitmapSource2 || isValidDrawableResource(this.applicationContext, str, pVar, INVALID_LARGE_ICON_ERROR_CODE)) {
                return $assertionsDisabled;
            }
            return true;
        } else if (bitmapSource != BitmapSource.ByteArray) {
            return $assertionsDisabled;
        } else {
            if (((byte[]) obj).length == 0) {
                return true;
            }
            return $assertionsDisabled;
        }
    }

    private boolean hasInvalidLedDetails(p pVar, NotificationDetails notificationDetails) {
        if (notificationDetails.ledColor == null) {
            return $assertionsDisabled;
        }
        if (notificationDetails.ledOnMs != null && notificationDetails.ledOffMs != null) {
            return $assertionsDisabled;
        }
        pVar.a(INVALID_LED_DETAILS_ERROR_CODE, INVALID_LED_DETAILS_ERROR_MESSAGE, (Object) null);
        return true;
    }

    private boolean hasInvalidRawSoundResource(p pVar, NotificationDetails notificationDetails) {
        if (StringUtils.isNullOrEmpty(notificationDetails.sound).booleanValue()) {
            return $assertionsDisabled;
        }
        SoundSource soundSource = notificationDetails.soundSource;
        if ((soundSource != null && soundSource != SoundSource.RawResource) || this.applicationContext.getResources().getIdentifier(notificationDetails.sound, "raw", this.applicationContext.getPackageName()) != 0) {
            return $assertionsDisabled;
        }
        String str = notificationDetails.sound;
        pVar.a(INVALID_SOUND_ERROR_CODE, "The resource " + str + " could not be found. Please make sure it has been added as a raw resource to your Android head project.", (Object) null);
        return true;
    }

    private void initialize(m mVar, p pVar) {
        String str = (String) ((Map) mVar.f2786b).get(DEFAULT_ICON);
        if (isValidDrawableResource(this.applicationContext, str, pVar, INVALID_ICON_ERROR_CODE)) {
            Long I3 = C0094a.I(mVar.a(DISPATCHER_HANDLE));
            Long I4 = C0094a.I(mVar.a(CALLBACK_HANDLE));
            if (!(I3 == null || I4 == null)) {
                Context context = this.applicationContext;
                context.getSharedPreferences("flutter_local_notifications_plugin", 0).edit().putLong("com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY", I3.longValue()).apply();
                context.getSharedPreferences("flutter_local_notifications_plugin", 0).edit().putLong("com.dexterous.flutterlocalnotifications.CALLBACK_HANDLE_KEY", I4.longValue()).apply();
            }
            this.applicationContext.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).edit().putString(DEFAULT_ICON, str).apply();
            pVar.b(Boolean.TRUE);
        }
    }

    private static boolean isValidDrawableResource(Context context, String str, p pVar, String str2) {
        if (context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName()) != 0) {
            return true;
        }
        pVar.a(str2, "The resource " + str + " could not be found. Please make sure it has been added as a drawable resource to your Android head project.", (Object) null);
        return $assertionsDisabled;
    }

    private static boolean launchedActivityFromHistory(Intent intent) {
        if (intent == null || (intent.getFlags() & 1048576) != 1048576) {
            return $assertionsDisabled;
        }
        return true;
    }

    private static ArrayList<NotificationDetails> loadScheduledNotifications(Context context) {
        ArrayList<NotificationDetails> arrayList = new ArrayList<>();
        String string = context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).getString(SCHEDULED_NOTIFICATIONS, (String) null);
        if (string != null) {
            return (ArrayList) buildGson().b(string, new D1.a().f221b);
        }
        return arrayList;
    }

    private void pendingNotificationRequests(p pVar) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            HashMap hashMap = new HashMap();
            hashMap.put(CANCEL_ID, next.id);
            hashMap.put("title", next.title);
            hashMap.put("body", next.body);
            hashMap.put(PAYLOAD, next.payload);
            arrayList.add(hashMap);
        }
        pVar.b(arrayList);
    }

    private void processForegroundNotificationAction(Intent intent, Map<String, Object> map) {
        if (intent.getBooleanExtra(CANCEL_NOTIFICATION, $assertionsDisabled)) {
            new T(this.applicationContext).a((String) null, ((Integer) map.get(NOTIFICATION_ID)).intValue());
        }
    }

    public static void removeNotificationFromCache(Context context, Integer num) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(context);
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().id.equals(num)) {
                    it.remove();
                    break;
                }
            } else {
                break;
            }
        }
        saveScheduledNotifications(context, loadScheduledNotifications);
    }

    private void repeat(m mVar, p pVar) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(pVar, (Map) mVar.f2786b);
        if (extractNotificationDetails != null) {
            try {
                repeatNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
                pVar.b((Object) null);
            } catch (d e2) {
                pVar.a(e2.f2807f, e2.getMessage(), (Object) null);
            }
        }
    }

    private static void repeatNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        long calculateRepeatIntervalMilliseconds = calculateRepeatIntervalMilliseconds(notificationDetails);
        long longValue = notificationDetails.calledAt.longValue();
        if (notificationDetails.repeatTime != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(System.currentTimeMillis());
            instance.set(11, notificationDetails.repeatTime.hour.intValue());
            instance.set(12, notificationDetails.repeatTime.minute.intValue());
            instance.set(13, notificationDetails.repeatTime.second.intValue());
            Integer num = notificationDetails.day;
            if (num != null) {
                instance.set(7, num.intValue());
            }
            longValue = instance.getTimeInMillis();
        }
        long calculateNextNotificationTrigger = calculateNextNotificationTrigger(longValue, calculateRepeatIntervalMilliseconds);
        String f3 = buildGson().f(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, f3);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.inexact;
        }
        if (notificationDetails.scheduleMode.useAllowWhileIdle()) {
            setupAllowWhileIdleAlarm(notificationDetails, alarmManager, calculateNextNotificationTrigger, broadcastPendingIntent);
        } else {
            alarmManager.setInexactRepeating(0, calculateNextNotificationTrigger, calculateRepeatIntervalMilliseconds, broadcastPendingIntent);
        }
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    public static void rescheduleNotifications(Context context) {
        Iterator<NotificationDetails> it = loadScheduledNotifications(context).iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            try {
                if (next.repeatInterval == null) {
                    if (next.repeatIntervalMilliseconds == null) {
                        if (next.timeZoneName != null) {
                            zonedScheduleNotification(context, next, Boolean.FALSE);
                        } else {
                            scheduleNotification(context, next, Boolean.FALSE);
                        }
                    }
                }
                repeatNotification(context, next, Boolean.FALSE);
            } catch (d e2) {
                Log.e(TAG, e2.getMessage());
                removeNotificationFromCache(context, next.id);
            }
        }
    }

    private static Uri retrieveSoundResourceUri(Context context, String str, SoundSource soundSource) {
        if (StringUtils.isNullOrEmpty(str).booleanValue()) {
            return RingtoneManager.getDefaultUri(2);
        }
        if (soundSource == null || soundSource == SoundSource.RawResource) {
            return Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + str);
        } else if (soundSource == SoundSource.Uri) {
            return Uri.parse(str);
        } else {
            return null;
        }
    }

    private static void saveScheduledNotification(Context context, NotificationDetails notificationDetails) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(context);
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            if (!next.id.equals(notificationDetails.id)) {
                arrayList.add(next);
            }
        }
        arrayList.add(notificationDetails);
        saveScheduledNotifications(context, arrayList);
    }

    private static void saveScheduledNotifications(Context context, ArrayList<NotificationDetails> arrayList) {
        context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).edit().putString(SCHEDULED_NOTIFICATIONS, buildGson().f(arrayList)).apply();
    }

    public static void scheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        try {
            if (notificationDetails.scheduledNotificationRepeatFrequency != null) {
                zonedScheduleNextNotification(context, notificationDetails);
            } else if (notificationDetails.matchDateTimeComponents != null) {
                zonedScheduleNextNotificationMatchingDateComponents(context, notificationDetails);
            } else {
                if (notificationDetails.repeatInterval == null) {
                    if (notificationDetails.repeatIntervalMilliseconds == null) {
                        removeNotificationFromCache(context, notificationDetails.id);
                        return;
                    }
                }
                scheduleNextRepeatingNotification(context, notificationDetails);
            }
        } catch (d e2) {
            Log.e(TAG, e2.getMessage());
            removeNotificationFromCache(context, notificationDetails.id);
        }
    }

    private static void scheduleNextRepeatingNotification(Context context, NotificationDetails notificationDetails) {
        long calculateNextNotificationTrigger = calculateNextNotificationTrigger(notificationDetails.calledAt.longValue(), calculateRepeatIntervalMilliseconds(notificationDetails));
        String f3 = buildGson().f(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, f3);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.exactAllowWhileIdle;
        }
        setupAllowWhileIdleAlarm(notificationDetails, alarmManager, calculateNextNotificationTrigger, broadcastPendingIntent);
        saveScheduledNotification(context, notificationDetails);
    }

    private static void scheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String f3 = buildGson().f(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, f3);
        setupAlarm(notificationDetails, getAlarmManager(context), notificationDetails.millisecondsSinceEpoch.longValue(), getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent));
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    private Boolean sendNotificationPayloadMessage(Intent intent) {
        if (!SELECT_NOTIFICATION.equals(intent.getAction()) && !SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            return Boolean.FALSE;
        }
        Map<String, Object> extractNotificationResponseMap = extractNotificationResponseMap(intent);
        if (SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            processForegroundNotificationAction(intent, extractNotificationResponseMap);
        }
        this.channel.a("didReceiveNotificationResponse", extractNotificationResponseMap, (p) null);
        return Boolean.TRUE;
    }

    private void setActivity(Activity activity) {
        this.mainActivity = activity;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [q.m, q.D] */
    private static void setBigPictureStyle(Context context, NotificationDetails notificationDetails, C0386p pVar) {
        IconCompat iconCompat;
        CharSequence charSequence;
        CharSequence charSequence2;
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        ? d3 = new D();
        if (bigPictureStyleInformation.contentTitle != null) {
            if (bigPictureStyleInformation.htmlFormatContentTitle.booleanValue()) {
                charSequence2 = fromHtml(bigPictureStyleInformation.contentTitle);
            } else {
                charSequence2 = bigPictureStyleInformation.contentTitle;
            }
            d3.f4207b = C0386p.b(charSequence2);
        }
        if (bigPictureStyleInformation.summaryText != null) {
            if (bigPictureStyleInformation.htmlFormatSummaryText.booleanValue()) {
                charSequence = fromHtml(bigPictureStyleInformation.summaryText);
            } else {
                charSequence = bigPictureStyleInformation.summaryText;
            }
            d3.f4208c = C0386p.b(charSequence);
            d3.f4209d = true;
        }
        IconCompat iconCompat2 = null;
        if (bigPictureStyleInformation.hideExpandedLargeIcon.booleanValue()) {
            d3.f4261f = null;
            d3.f4262g = true;
        } else {
            Object obj = bigPictureStyleInformation.largeIcon;
            if (obj != null) {
                Bitmap bitmapFromSource = getBitmapFromSource(context, obj, bigPictureStyleInformation.largeIconBitmapSource);
                if (bitmapFromSource == null) {
                    iconCompat = null;
                } else {
                    iconCompat = IconCompat.d(bitmapFromSource);
                }
                d3.f4261f = iconCompat;
                d3.f4262g = true;
            }
        }
        Bitmap bitmapFromSource2 = getBitmapFromSource(context, bigPictureStyleInformation.bigPicture, bigPictureStyleInformation.bigPictureBitmapSource);
        if (bitmapFromSource2 != null) {
            iconCompat2 = IconCompat.d(bitmapFromSource2);
        }
        d3.f4260e = iconCompat2;
        pVar.f(d3);
    }

    private static void setBigTextStyle(NotificationDetails notificationDetails, C0386p pVar) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        BigTextStyleInformation bigTextStyleInformation = (BigTextStyleInformation) notificationDetails.styleInformation;
        C0384n nVar = new C0384n(0);
        if (bigTextStyleInformation.bigText != null) {
            if (bigTextStyleInformation.htmlFormatBigText.booleanValue()) {
                charSequence3 = fromHtml(bigTextStyleInformation.bigText);
            } else {
                charSequence3 = bigTextStyleInformation.bigText;
            }
            nVar.f4265f = C0386p.b(charSequence3);
        }
        if (bigTextStyleInformation.contentTitle != null) {
            if (bigTextStyleInformation.htmlFormatContentTitle.booleanValue()) {
                charSequence2 = fromHtml(bigTextStyleInformation.contentTitle);
            } else {
                charSequence2 = bigTextStyleInformation.contentTitle;
            }
            nVar.f4207b = C0386p.b(charSequence2);
        }
        if (bigTextStyleInformation.summaryText != null) {
            if (bigTextStyleInformation.htmlFormatSummaryText.booleanValue()) {
                charSequence = fromHtml(bigTextStyleInformation.summaryText);
            } else {
                charSequence = bigTextStyleInformation.summaryText;
            }
            nVar.f4208c = C0386p.b(charSequence);
            nVar.f4209d = true;
        }
        pVar.f(nVar);
    }

    private void setCanScheduleExactNotifications(p pVar) {
        if (Build.VERSION.SDK_INT < 31) {
            pVar.b(Boolean.TRUE);
        } else {
            pVar.b(Boolean.valueOf(getAlarmManager(this.applicationContext).canScheduleExactAlarms()));
        }
    }

    private static void setCategory(NotificationDetails notificationDetails, C0386p pVar) {
        String str = notificationDetails.category;
        if (str != null) {
            pVar.f4297x = str;
        }
    }

    private static void setInboxStyle(NotificationDetails notificationDetails, C0386p pVar) {
        CharSequence charSequence;
        CharSequence charSequence2;
        InboxStyleInformation inboxStyleInformation = (InboxStyleInformation) notificationDetails.styleInformation;
        C0384n nVar = new C0384n(1);
        if (inboxStyleInformation.contentTitle != null) {
            if (inboxStyleInformation.htmlFormatContentTitle.booleanValue()) {
                charSequence2 = fromHtml(inboxStyleInformation.contentTitle);
            } else {
                charSequence2 = inboxStyleInformation.contentTitle;
            }
            nVar.f4207b = C0386p.b(charSequence2);
        }
        if (inboxStyleInformation.summaryText != null) {
            if (inboxStyleInformation.htmlFormatSummaryText.booleanValue()) {
                charSequence = fromHtml(inboxStyleInformation.summaryText);
            } else {
                charSequence = inboxStyleInformation.summaryText;
            }
            nVar.f4208c = C0386p.b(charSequence);
            nVar.f4209d = true;
        }
        ArrayList<String> arrayList = inboxStyleInformation.lines;
        if (arrayList != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                CharSequence charSequence3 = next;
                if (inboxStyleInformation.htmlFormatLines.booleanValue()) {
                    charSequence3 = fromHtml(next);
                }
                if (charSequence3 != null) {
                    ((ArrayList) nVar.f4265f).add(C0386p.b(charSequence3));
                }
            }
        }
        pVar.f(nVar);
    }

    private static void setLights(NotificationDetails notificationDetails, C0386p pVar) {
        int i3;
        if (BooleanUtils.getValue(notificationDetails.enableLights) && notificationDetails.ledOnMs != null && notificationDetails.ledOffMs != null) {
            int intValue = notificationDetails.ledColor.intValue();
            int intValue2 = notificationDetails.ledOnMs.intValue();
            int intValue3 = notificationDetails.ledOffMs.intValue();
            Notification notification = pVar.f4272G;
            notification.ledARGB = intValue;
            notification.ledOnMS = intValue2;
            notification.ledOffMS = intValue3;
            if (intValue2 == 0 || intValue3 == 0) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            notification.flags = i3 | (notification.flags & -2);
        }
    }

    private static void setMediaStyle(C0386p pVar) {
        pVar.f(new P.a(0));
    }

    private static void setMessagingStyle(Context context, NotificationDetails notificationDetails, C0386p pVar) {
        MessagingStyleInformation messagingStyleInformation = (MessagingStyleInformation) notificationDetails.styleInformation;
        C c3 = new C(buildPerson(context, messagingStyleInformation.person));
        c3.f4205i = Boolean.valueOf(BooleanUtils.getValue(messagingStyleInformation.groupConversation));
        String str = messagingStyleInformation.conversationTitle;
        if (str != null) {
            c3.f4204h = str;
        }
        ArrayList<MessageDetails> arrayList = messagingStyleInformation.messages;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<MessageDetails> it = messagingStyleInformation.messages.iterator();
            while (it.hasNext()) {
                C0370B createMessage = createMessage(context, it.next());
                if (createMessage != null) {
                    ArrayList arrayList2 = c3.f4201e;
                    arrayList2.add(createMessage);
                    if (arrayList2.size() > 25) {
                        arrayList2.remove(0);
                    }
                }
            }
        }
        pVar.f(c3);
    }

    private static void setProgress(NotificationDetails notificationDetails, C0386p pVar) {
        if (BooleanUtils.getValue(notificationDetails.showProgress)) {
            int intValue = notificationDetails.maxProgress.intValue();
            int intValue2 = notificationDetails.progress.intValue();
            boolean booleanValue = notificationDetails.indeterminate.booleanValue();
            pVar.f4290p = intValue;
            pVar.f4291q = intValue2;
            pVar.f4292r = booleanValue;
        }
    }

    private static void setSmallIcon(Context context, NotificationDetails notificationDetails, C0386p pVar) {
        if (!StringUtils.isNullOrEmpty(notificationDetails.icon).booleanValue()) {
            pVar.f4272G.icon = getDrawableResourceId(context, notificationDetails.icon);
            return;
        }
        String string = context.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).getString(DEFAULT_ICON, (String) null);
        if (StringUtils.isNullOrEmpty(string).booleanValue()) {
            pVar.f4272G.icon = notificationDetails.iconResourceId.intValue();
        } else {
            pVar.f4272G.icon = getDrawableResourceId(context, string);
        }
    }

    private static void setSound(Context context, NotificationDetails notificationDetails, C0386p pVar) {
        if (BooleanUtils.getValue(notificationDetails.playSound)) {
            pVar.e(retrieveSoundResourceUri(context, notificationDetails.sound, notificationDetails.soundSource));
        } else {
            pVar.e((Uri) null);
        }
    }

    private static void setStyle(Context context, NotificationDetails notificationDetails, C0386p pVar) {
        int i3 = c.f2806c[notificationDetails.style.ordinal()];
        if (i3 == 1) {
            setBigPictureStyle(context, notificationDetails, pVar);
        } else if (i3 == 2) {
            setBigTextStyle(notificationDetails, pVar);
        } else if (i3 == 3) {
            setInboxStyle(notificationDetails, pVar);
        } else if (i3 == 4) {
            setMessagingStyle(context, notificationDetails, pVar);
        } else if (i3 == 5) {
            setMediaStyle(pVar);
        }
    }

    private static void setTimeoutAfter(NotificationDetails notificationDetails, C0386p pVar) {
        Long l3 = notificationDetails.timeoutAfter;
        if (l3 != null) {
            pVar.f4269D = l3.longValue();
        }
    }

    private static void setVibrationPattern(NotificationDetails notificationDetails, C0386p pVar) {
        if (BooleanUtils.getValue(notificationDetails.enableVibration)) {
            long[] jArr = notificationDetails.vibrationPattern;
            if (jArr != null && jArr.length > 0) {
                pVar.f4272G.vibrate = jArr;
                return;
            }
            return;
        }
        pVar.f4272G.vibrate = new long[]{0};
    }

    private static void setVisibility(NotificationDetails notificationDetails, C0386p pVar) {
        int i3;
        Integer num = notificationDetails.visibility;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                i3 = 1;
                if (intValue != 1) {
                    if (intValue == 2) {
                        i3 = -1;
                    } else {
                        throw new IllegalArgumentException("Unknown index: " + notificationDetails.visibility);
                    }
                }
            } else {
                i3 = 0;
            }
            pVar.f4266A = i3;
        }
    }

    private static void setupAlarm(NotificationDetails notificationDetails, AlarmManager alarmManager, long j3, PendingIntent pendingIntent) {
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.exact;
        }
        if (notificationDetails.scheduleMode.useAllowWhileIdle()) {
            setupAllowWhileIdleAlarm(notificationDetails, alarmManager, j3, pendingIntent);
        } else if (notificationDetails.scheduleMode.useExactAlarm()) {
            checkCanScheduleExactAlarms(alarmManager);
            alarmManager.setExact(0, j3, pendingIntent);
        } else if (notificationDetails.scheduleMode.useAlarmClock()) {
            checkCanScheduleExactAlarms(alarmManager);
            C0375e.b(alarmManager, C0375e.a(j3, pendingIntent), pendingIntent);
        } else {
            alarmManager.set(0, j3, pendingIntent);
        }
    }

    private static void setupAllowWhileIdleAlarm(NotificationDetails notificationDetails, AlarmManager alarmManager, long j3, PendingIntent pendingIntent) {
        if (notificationDetails.scheduleMode.useExactAlarm()) {
            checkCanScheduleExactAlarms(alarmManager);
            C0376f.b(alarmManager, 0, j3, pendingIntent);
        } else if (notificationDetails.scheduleMode.useAlarmClock()) {
            checkCanScheduleExactAlarms(alarmManager);
            C0375e.b(alarmManager, C0375e.a(j3, pendingIntent), pendingIntent);
        } else {
            C0376f.a(alarmManager, 0, j3, pendingIntent);
        }
    }

    private static void setupNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        Integer num;
        int i3;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            a.n();
            NotificationChannel d3 = a.d(notificationChannelDetails.id, notificationChannelDetails.name, notificationChannelDetails.importance.intValue());
            d3.setDescription(notificationChannelDetails.description);
            d3.setGroup(notificationChannelDetails.groupId);
            if (notificationChannelDetails.playSound.booleanValue()) {
                Integer num2 = notificationChannelDetails.audioAttributesUsage;
                if (num2 != null) {
                    i3 = num2.intValue();
                } else {
                    i3 = 5;
                }
                d3.setSound(retrieveSoundResourceUri(context, notificationChannelDetails.sound, notificationChannelDetails.soundSource), new AudioAttributes.Builder().setUsage(i3).build());
            } else {
                d3.setSound((Uri) null, (AudioAttributes) null);
            }
            d3.enableVibration(BooleanUtils.getValue(notificationChannelDetails.enableVibration));
            long[] jArr = notificationChannelDetails.vibrationPattern;
            if (jArr != null && jArr.length > 0) {
                d3.setVibrationPattern(jArr);
            }
            boolean value = BooleanUtils.getValue(notificationChannelDetails.enableLights);
            d3.enableLights(value);
            if (value && (num = notificationChannelDetails.ledColor) != null) {
                d3.setLightColor(num.intValue());
            }
            d3.setShowBadge(BooleanUtils.getValue(notificationChannelDetails.showBadge));
            notificationManager.createNotificationChannel(d3);
        }
    }

    private void show(m mVar, p pVar) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(pVar, (Map) mVar.f2786b);
        if (extractNotificationDetails != null) {
            showNotification(this.applicationContext, extractNotificationDetails);
            pVar.b((Object) null);
        }
    }

    public static void showNotification(Context context, NotificationDetails notificationDetails) {
        Notification createNotification = createNotification(context, notificationDetails);
        T notificationManager = getNotificationManager(context);
        String str = notificationDetails.tag;
        if (str != null) {
            notificationManager.b(str, notificationDetails.id.intValue(), createNotification);
        } else {
            notificationManager.b((String) null, notificationDetails.id.intValue(), createNotification);
        }
    }

    private void startForegroundService(m mVar, p pVar) {
        Map map = (Map) mVar.a("notificationData");
        Integer num = (Integer) mVar.a("startType");
        ArrayList arrayList = (ArrayList) mVar.a("foregroundServiceTypes");
        if (arrayList != null && arrayList.size() == 0) {
            pVar.a("ARGUMENT_ERROR", "If foregroundServiceTypes is non-null it must not be empty!", (Object) null);
        } else if (map == null || num == null) {
            pVar.a("ARGUMENT_ERROR", "An argument passed to startForegroundService was null!", (Object) null);
        } else {
            NotificationDetails extractNotificationDetails = extractNotificationDetails(pVar, map);
            if (extractNotificationDetails == null) {
                return;
            }
            if (extractNotificationDetails.id.intValue() != 0) {
                g gVar = new g(extractNotificationDetails, num.intValue(), arrayList);
                Intent intent = new Intent(this.applicationContext, f.class);
                intent.putExtra("com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter", gVar);
                C0414g.b(this.applicationContext, intent);
                pVar.b((Object) null);
                return;
            }
            pVar.a("ARGUMENT_ERROR", "The id of the notification for a foreground service must not be 0!", (Object) null);
        }
    }

    private void stopForegroundService(p pVar) {
        this.applicationContext.stopService(new Intent(this.applicationContext, f.class));
        pVar.b((Object) null);
    }

    private Integer tryParseInt(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private void zonedSchedule(m mVar, p pVar) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(pVar, (Map) mVar.f2786b);
        if (extractNotificationDetails != null) {
            if (extractNotificationDetails.matchDateTimeComponents != null) {
                extractNotificationDetails.scheduledDateTime = getNextFireDateMatchingDateTimeComponents(extractNotificationDetails);
            }
            try {
                zonedScheduleNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
                pVar.b((Object) null);
            } catch (d e2) {
                pVar.a(e2.f2807f, e2.getMessage(), (Object) null);
            }
        }
    }

    private static void zonedScheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        String nextFireDate = getNextFireDate(notificationDetails);
        if (nextFireDate != null) {
            notificationDetails.scheduledDateTime = nextFireDate;
            zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
        }
    }

    private static void zonedScheduleNextNotificationMatchingDateComponents(Context context, NotificationDetails notificationDetails) {
        String nextFireDateMatchingDateTimeComponents = getNextFireDateMatchingDateTimeComponents(notificationDetails);
        if (nextFireDateMatchingDateTimeComponents != null) {
            notificationDetails.scheduledDateTime = nextFireDateMatchingDateTimeComponents;
            zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
        }
    }

    private static void zonedScheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String f3 = buildGson().f(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, f3);
        setupAlarm(notificationDetails, getAlarmManager(context), ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), ZoneId.of(notificationDetails.timeZoneName)).toInstant().toEpochMilli(), getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent));
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    public boolean onActivityResult(int i3, int i4, Intent intent) {
        if (i3 != 1 && i3 != 2 && i3 != 3) {
            return $assertionsDisabled;
        }
        e eVar = this.permissionRequestProgress;
        e eVar2 = e.f2810h;
        e eVar3 = e.f2808f;
        if (eVar == eVar2 && i3 == 2 && Build.VERSION.SDK_INT >= 31) {
            this.callback.e(getAlarmManager(this.applicationContext).canScheduleExactAlarms());
            this.permissionRequestProgress = eVar3;
        }
        if (this.permissionRequestProgress == e.f2811i && i3 == 3 && Build.VERSION.SDK_INT >= 34) {
            this.callback.e(((NotificationManager) this.applicationContext.getSystemService("notification")).canUseFullScreenIntent());
            this.permissionRequestProgress = eVar3;
        }
        return true;
    }

    public void onAttachedToActivity(Z1.b bVar) {
        T1.d dVar = (T1.d) bVar;
        ((HashSet) dVar.f1706d).add(this);
        ((HashSet) dVar.f1704b).add(this);
        dVar.g(this);
        C0078d dVar2 = (C0078d) dVar.f1703a;
        this.mainActivity = dVar2;
        Intent intent = dVar2.getIntent();
        if (!launchedActivityFromHistory(intent) && SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            processForegroundNotificationAction(intent, extractNotificationResponseMap(intent));
        }
    }

    public void onAttachedToEngine(Y1.a aVar) {
        this.applicationContext = aVar.f1964a;
        q qVar = new q(aVar.f1965b, METHOD_CHANNEL);
        this.channel = qVar;
        qVar.b(this);
    }

    public void onDetachedFromActivity() {
        this.mainActivity = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.mainActivity = null;
    }

    public void onDetachedFromEngine(Y1.a aVar) {
        this.channel.b((o) null);
        this.channel = null;
        this.applicationContext = null;
    }

    public void onMethodCall(m mVar, p pVar) {
        String str = mVar.f2785a;
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -2096263152:
                if (str.equals(STOP_FOREGROUND_SERVICE)) {
                    c3 = 0;
                    break;
                }
                break;
            case -2041662895:
                if (str.equals(GET_NOTIFICATION_CHANNELS_METHOD)) {
                    c3 = 1;
                    break;
                }
                break;
            case -1873731438:
                if (str.equals(DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD)) {
                    c3 = 2;
                    break;
                }
                break;
            case -1785484984:
                if (str.equals(REQUEST_NOTIFICATIONS_PERMISSION_METHOD)) {
                    c3 = 3;
                    break;
                }
                break;
            case -1367724422:
                if (str.equals(CANCEL_METHOD)) {
                    c3 = 4;
                    break;
                }
                break;
            case -1108601471:
                if (str.equals(REQUEST_EXACT_ALARMS_PERMISSION_METHOD)) {
                    c3 = 5;
                    break;
                }
                break;
            case -950516363:
                if (str.equals(REQUEST_FULL_SCREEN_INTENT_PERMISSION_METHOD)) {
                    c3 = 6;
                    break;
                }
                break;
            case -799130106:
                if (str.equals(PENDING_NOTIFICATION_REQUESTS_METHOD)) {
                    c3 = 7;
                    break;
                }
                break;
            case -208611345:
                if (str.equals(GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD)) {
                    c3 = 8;
                    break;
                }
                break;
            case 3529469:
                if (str.equals(SHOW_METHOD)) {
                    c3 = 9;
                    break;
                }
                break;
            case 6625712:
                if (str.equals(PERIODICALLY_SHOW_METHOD)) {
                    c3 = 10;
                    break;
                }
                break;
            case 116003316:
                if (str.equals(GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD)) {
                    c3 = 11;
                    break;
                }
                break;
            case 476547271:
                if (str.equals(CANCEL_ALL_METHOD)) {
                    c3 = 12;
                    break;
                }
                break;
            case 548573423:
                if (str.equals(ZONED_SCHEDULE_METHOD)) {
                    c3 = 13;
                    break;
                }
                break;
            case 767006947:
                if (str.equals(CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD)) {
                    c3 = 14;
                    break;
                }
                break;
            case 825311171:
                if (str.equals(GET_CALLBACK_HANDLE_METHOD)) {
                    c3 = 15;
                    break;
                }
                break;
            case 871091088:
                if (str.equals(INITIALIZE_METHOD)) {
                    c3 = 16;
                    break;
                }
                break;
            case 891942317:
                if (str.equals(ARE_NOTIFICATIONS_ENABLED_METHOD)) {
                    c3 = 17;
                    break;
                }
                break;
            case 972029712:
                if (str.equals(CAN_SCHEDULE_EXACT_NOTIFICATIONS_METHOD)) {
                    c3 = 18;
                    break;
                }
                break;
            case 1008472557:
                if (str.equals(DELETE_NOTIFICATION_CHANNEL_METHOD)) {
                    c3 = 19;
                    break;
                }
                break;
            case 1207771056:
                if (str.equals(START_FOREGROUND_SERVICE)) {
                    c3 = 20;
                    break;
                }
                break;
            case 1594833996:
                if (str.equals(GET_ACTIVE_NOTIFICATIONS_METHOD)) {
                    c3 = 21;
                    break;
                }
                break;
            case 1653467900:
                if (str.equals(CREATE_NOTIFICATION_CHANNEL_METHOD)) {
                    c3 = 22;
                    break;
                }
                break;
            case 2147197514:
                if (str.equals(PERIODICALLY_SHOW_WITH_DURATION)) {
                    c3 = 23;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                stopForegroundService(pVar);
                return;
            case 1:
                getNotificationChannels(pVar);
                return;
            case 2:
                deleteNotificationChannelGroup(mVar, pVar);
                return;
            case 3:
                requestNotificationsPermission(new M1.b(pVar, 1));
                return;
            case L.k.LONG_FIELD_NUMBER:
                cancel(mVar, pVar);
                return;
            case L.k.STRING_FIELD_NUMBER:
                requestExactAlarmsPermission(new h(29, (Object) pVar));
                return;
            case L.k.STRING_SET_FIELD_NUMBER:
                requestFullScreenIntentPermission(new M1.b(pVar, 2));
                return;
            case L.k.DOUBLE_FIELD_NUMBER:
                pendingNotificationRequests(pVar);
                return;
            case L.k.BYTES_FIELD_NUMBER:
                getNotificationAppLaunchDetails(pVar);
                return;
            case 9:
                show(mVar, pVar);
                return;
            case 10:
                repeat(mVar, pVar);
                return;
            case 11:
                getActiveNotificationMessagingStyle(mVar, pVar);
                return;
            case 12:
                cancelAllNotifications(pVar);
                return;
            case 13:
                zonedSchedule(mVar, pVar);
                return;
            case 14:
                createNotificationChannelGroup(mVar, pVar);
                return;
            case 15:
                getCallbackHandle(pVar);
                return;
            case 16:
                initialize(mVar, pVar);
                return;
            case 17:
                areNotificationsEnabled(pVar);
                return;
            case 18:
                setCanScheduleExactNotifications(pVar);
                return;
            case 19:
                deleteNotificationChannel(mVar, pVar);
                return;
            case 20:
                startForegroundService(mVar, pVar);
                return;
            case 21:
                getActiveNotifications(pVar);
                return;
            case 22:
                createNotificationChannel(mVar, pVar);
                return;
            case 23:
                repeat(mVar, pVar);
                return;
            default:
                pVar.c();
                return;
        }
    }

    public boolean onNewIntent(Intent intent) {
        Activity activity;
        boolean booleanValue = sendNotificationPayloadMessage(intent).booleanValue();
        if (booleanValue && (activity = this.mainActivity) != null) {
            activity.setIntent(intent);
        }
        return booleanValue;
    }

    public void onReattachedToActivityForConfigChanges(Z1.b bVar) {
        T1.d dVar = (T1.d) bVar;
        ((HashSet) dVar.f1706d).add(this);
        ((HashSet) dVar.f1704b).add(this);
        dVar.g(this);
        this.mainActivity = (C0078d) dVar.f1703a;
    }

    public boolean onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        e eVar = this.permissionRequestProgress;
        e eVar2 = e.f2809g;
        boolean z3 = $assertionsDisabled;
        if (eVar == eVar2 && i3 == 1) {
            if (iArr.length > 0 && iArr[0] == 0) {
                z3 = true;
            }
            this.callback.e(z3);
            this.permissionRequestProgress = e.f2808f;
        }
        return z3;
    }

    public void requestExactAlarmsPermission(h hVar) {
        e eVar = this.permissionRequestProgress;
        e eVar2 = e.f2808f;
        if (eVar != eVar2) {
            hVar.o();
            return;
        }
        this.callback = hVar;
        if (Build.VERSION.SDK_INT < 31) {
            hVar.e(true);
        } else if (!getAlarmManager(this.applicationContext).canScheduleExactAlarms()) {
            this.permissionRequestProgress = e.f2810h;
            Activity activity = this.mainActivity;
            activity.startActivityForResult(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", Uri.parse("package:" + this.applicationContext.getPackageName())), 2);
        } else {
            this.callback.e(true);
            this.permissionRequestProgress = eVar2;
        }
    }

    public void requestFullScreenIntentPermission(h hVar) {
        e eVar = this.permissionRequestProgress;
        e eVar2 = e.f2808f;
        if (eVar != eVar2) {
            hVar.o();
            return;
        }
        this.callback = hVar;
        if (Build.VERSION.SDK_INT >= 34) {
            getAlarmManager(this.applicationContext);
            if (!((NotificationManager) this.applicationContext.getSystemService("notification")).canUseFullScreenIntent()) {
                this.permissionRequestProgress = e.f2811i;
                Activity activity = this.mainActivity;
                activity.startActivityForResult(new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT", Uri.parse("package:" + this.applicationContext.getPackageName())), 3);
                return;
            }
            this.callback.e(true);
            this.permissionRequestProgress = eVar2;
            return;
        }
        hVar.e(true);
    }

    public void requestNotificationsPermission(h hVar) {
        e eVar = this.permissionRequestProgress;
        e eVar2 = e.f2808f;
        if (eVar != eVar2) {
            hVar.o();
            return;
        }
        this.callback = hVar;
        if (Build.VERSION.SDK_INT < 33) {
            this.callback.e(M.a(new T(this.mainActivity).f4231b));
        } else if (C0414g.a(this.mainActivity, "android.permission.POST_NOTIFICATIONS") == 0) {
            this.callback.e(true);
            this.permissionRequestProgress = eVar2;
        } else {
            this.permissionRequestProgress = e.f2809g;
            C0374d.c(this.mainActivity, new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }
}
