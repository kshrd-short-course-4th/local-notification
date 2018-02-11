package com.example.rathana.localnotificationdemo.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;

/**
 * Created by RATHANA on 2/11/2018.
 */

public class ConcreteNotificationChannel {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void addChannel(Context context){
        NotificationChannel mChannel=new NotificationChannel(
                "personal_user",
                "Personal User"
                , NotificationManager.IMPORTANCE_HIGH
        );

        mChannel.enableLights(true);
        mChannel.enableVibration(true);
        mChannel.setDescription("this channel for personal user");
        mChannel.setLightColor(Color.RED);

         NotificationManager mManager= (NotificationManager) context.getSystemService(
                 Context.NOTIFICATION_SERVICE
         );
         mManager.createNotificationChannel(mChannel);
    }

}
