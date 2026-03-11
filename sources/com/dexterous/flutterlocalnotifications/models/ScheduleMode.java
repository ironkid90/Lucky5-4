package com.dexterous.flutterlocalnotifications.models;

import androidx.annotation.Keep;

@Keep
public enum ScheduleMode {
    alarmClock,
    exact,
    exactAllowWhileIdle,
    inexact,
    inexactAllowWhileIdle;

    public boolean useAlarmClock() {
        if (this == alarmClock) {
            return true;
        }
        return false;
    }

    public boolean useAllowWhileIdle() {
        if (this == exactAllowWhileIdle || this == inexactAllowWhileIdle) {
            return true;
        }
        return false;
    }

    public boolean useExactAlarm() {
        if (this == exact || this == exactAllowWhileIdle) {
            return true;
        }
        return false;
    }
}
