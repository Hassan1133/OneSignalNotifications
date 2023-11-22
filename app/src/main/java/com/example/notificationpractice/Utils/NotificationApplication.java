package com.example.notificationpractice.Utils;

import android.app.Application;

import com.onesignal.OneSignal;

public class NotificationApplication extends Application {
    private static final String ONE_SIGNAL_APP_ID = "8976aa6a-2767-4089-8d06-7b763349f8bd";
    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONE_SIGNAL_APP_ID);
    }
}
