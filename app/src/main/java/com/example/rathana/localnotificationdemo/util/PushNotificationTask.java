package com.example.rathana.localnotificationdemo.util;

import android.content.Context;

import com.example.rathana.localnotificationdemo.notification.ConcreteNotification;

import java.util.TimerTask;

/**
 * Created by RATHANA on 2/11/2018.
 */

public class PushNotificationTask extends TimerTask{
    private Context context;
    public PushNotificationTask(Context context){
       this.context=context;
    }
    @Override
    public void run() {
        new ConcreteNotification().createBasicNotification(context);
    }
}
