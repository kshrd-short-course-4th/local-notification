package com.example.rathana.localnotificationdemo;

import android.app.Application;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.example.rathana.localnotificationdemo.notification.ConcreteNotificationChannel;
import com.example.rathana.localnotificationdemo.util.PushNotificationTask;

import java.util.Timer;

/**
 * Created by RATHANA on 2/11/2018.
 */

public class App extends Application {
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();
        new ConcreteNotificationChannel().addChannel(this);

        //create timer
        Timer timer=new Timer();
        PushNotificationTask task=new PushNotificationTask(this);
        timer.schedule(task,2000);
    }
}
