package com.dexterous.flutterlocalnotifications.models;

import android.graphics.Color;
import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l0.C0311a;

@Keep
public class NotificationAction implements Serializable {
    private static final String ALLOW_GENERATED_REPLIES = "allowGeneratedReplies";
    private static final String CANCEL_NOTIFICATION = "cancelNotification";
    private static final String CONTEXTUAL = "contextual";
    private static final String ICON = "icon";
    private static final String ICON_SOURCE = "iconBitmapSource";
    private static final String ID = "id";
    private static final String INPUTS = "inputs";
    private static final String SHOWS_USER_INTERFACE = "showsUserInterface";
    private static final String TITLE = "title";
    private static final String TITLE_COLOR_ALPHA = "titleColorAlpha";
    private static final String TITLE_COLOR_BLUE = "titleColorBlue";
    private static final String TITLE_COLOR_GREEN = "titleColorGreen";
    private static final String TITLE_COLOR_RED = "titleColorRed";
    public final List<C0311a> actionInputs = new ArrayList();
    public final Boolean allowGeneratedReplies;
    public final Boolean cancelNotification;
    public final Boolean contextual;
    public final String icon;
    public final IconSource iconSource;
    public final String id;
    public final Boolean showsUserInterface;
    public final String title;
    public final Integer titleColor;

    public NotificationAction(Map<String, Object> map) {
        List<Map> list;
        this.id = (String) map.get(ID);
        this.cancelNotification = (Boolean) map.get(CANCEL_NOTIFICATION);
        this.title = (String) map.get(TITLE);
        Integer num = (Integer) map.get(TITLE_COLOR_ALPHA);
        Integer num2 = (Integer) map.get(TITLE_COLOR_RED);
        Integer num3 = (Integer) map.get(TITLE_COLOR_GREEN);
        Integer num4 = (Integer) map.get(TITLE_COLOR_BLUE);
        if (num == null || num2 == null || num3 == null || num4 == null) {
            this.titleColor = null;
        } else {
            this.titleColor = Integer.valueOf(Color.argb(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue()));
        }
        this.icon = (String) map.get(ICON);
        this.contextual = (Boolean) map.get(CONTEXTUAL);
        this.showsUserInterface = (Boolean) map.get(SHOWS_USER_INTERFACE);
        this.allowGeneratedReplies = (Boolean) map.get(ALLOW_GENERATED_REPLIES);
        Integer num5 = (Integer) map.get(ICON_SOURCE);
        if (num5 != null) {
            this.iconSource = IconSource.values()[num5.intValue()];
        } else {
            this.iconSource = null;
        }
        if (map.get(INPUTS) != null && (list = (List) map.get(INPUTS)) != null) {
            for (Map map2 : list) {
                Class<String> cls = String.class;
                this.actionInputs.add(new C0311a(castList(cls, (Collection) map2.get("choices")), (Boolean) map2.get("allowFreeFormInput"), (String) map2.get("label"), castList(cls, (Collection) map2.get("allowedMimeTypes"))));
            }
        }
    }

    public static <T> List<T> castList(Class<? extends T> cls, Collection<?> collection) {
        if (collection == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object cast : collection) {
            try {
                arrayList.add(cls.cast(cast));
            } catch (ClassCastException unused) {
            }
        }
        return arrayList;
    }
}
