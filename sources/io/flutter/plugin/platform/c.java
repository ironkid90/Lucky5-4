package io.flutter.plugin.platform;

import android.app.ActivityManager;
import android.app.Person;
import android.os.Parcelable;
import android.text.PrecomputedText;
import android.text.TextPaint;

public abstract /* synthetic */ class c {
    public static /* synthetic */ ActivityManager.TaskDescription b(String str, int i3) {
        return new ActivityManager.TaskDescription(str, 0, i3);
    }

    public static /* bridge */ /* synthetic */ Person c(Parcelable parcelable) {
        return (Person) parcelable;
    }

    public static /* synthetic */ PrecomputedText.Params.Builder g(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }
}
