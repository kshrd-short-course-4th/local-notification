package com.example.rathana.localnotificationdemo.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;

import com.example.rathana.localnotificationdemo.DetailActivity;
import com.example.rathana.localnotificationdemo.R;

/**
 * Created by RATHANA on 2/11/2018.
 */

public class ConcreteNotification {

   public void createBasicNotification(Context context){
       NotificationCompat.Builder builder=new NotificationCompat.Builder(context,"personal_user");
       String title="Someone post story";
       String contentText="Grab all your screens, throw them in the Navigation Drawer and we’re done.";
       builder.setContentTitle(title);
       builder.setContentText(contentText);
       Uri uri= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
       builder.setSound(uri);
       builder.setSmallIcon(R.drawable.play_button);
       Bitmap bitmap= BitmapFactory.decodeResource(context.getResources(),R.drawable.kangaroo);
       builder.setLargeIcon(bitmap);

       Intent intent=new Intent(context,DetailActivity.class);
        intent.putExtra("title",title);
        intent.putExtra("content",contentText);
       PendingIntent pendingIntent= PendingIntent.getActivity(
               context,
               1,
               intent,
               PendingIntent.FLAG_UPDATE_CURRENT
       );

       builder.setContentIntent(pendingIntent);

       Notification notification=builder.build();
       NotificationManager mManager=
               (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

       mManager.notify(0,notification);
   }


   public void createInboxStyleNotification(Context context){
       NotificationCompat.Builder builder=new NotificationCompat.Builder(context,"personal_user");
       String title="Someone post story";
       String contentText="Grab all your screens, throw them in the Navigation Drawer and we’re done.";
       builder.setContentTitle(title);
       builder.setContentText(contentText);
       Uri uri= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
       builder.setSound(uri);
       builder.setSmallIcon(R.drawable.play_button);
       Bitmap bitmap= BitmapFactory.decodeResource(context.getResources(),R.drawable.kangaroo);
       builder.setLargeIcon(bitmap);

       Intent intent=new Intent(context,DetailActivity.class);
       intent.putExtra("title",title);
       intent.putExtra("content",contentText);
       PendingIntent pendingIntent= PendingIntent.getActivity(
               context,
               1,
               intent,
               PendingIntent.FLAG_UPDATE_CURRENT
       );
       builder.setContentIntent(pendingIntent);
       //add inbox style

       NotificationCompat.InboxStyle style=new NotificationCompat.InboxStyle();
       style.setBigContentTitle("Applying an expanded layout");
       String ss[] =new String[6];
       for (String s : ss){
           style.addLine(s);
       }
        builder.setStyle(style);
       Notification notification=builder.build();
       NotificationManager mManager=
               (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

       mManager.notify(0,notification);
   }

    public void createBigPictureNotification(Context context){
        NotificationCompat.Builder builder=new NotificationCompat.Builder(context,"personal_user");
        String title="Someone post story";
        String contentText="Grab all your screens, throw them in the Navigation Drawer and we’re done.";
        builder.setContentTitle(title);
        builder.setContentText(contentText);
        Uri uri= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        builder.setSound(uri);
        builder.setSmallIcon(R.drawable.play_button);
        Bitmap bitmap= BitmapFactory.decodeResource(context.getResources(),R.drawable.kangaroo);
        builder.setLargeIcon(bitmap);

        Intent intent=new Intent(context,DetailActivity.class);
        intent.putExtra("title",title);
        intent.putExtra("content",contentText);
        PendingIntent pendingIntent= PendingIntent.getActivity(
                context,
                1,
                intent,
                PendingIntent.FLAG_UPDATE_CURRENT
        );
        builder.setContentIntent(pendingIntent);
        //add inbox style

        NotificationCompat.BigPictureStyle style=  new NotificationCompat.BigPictureStyle();
        Bitmap bitmap1=BitmapFactory.decodeResource(context.getResources(),R.drawable.play_button);
        Bitmap bitmap2=BitmapFactory.decodeResource(context.getResources(),R.drawable.kangaroo);
        style.bigLargeIcon(bitmap1);
        style.bigPicture(bitmap2);
        builder.setStyle(style);
        Notification notification=builder.build();
        NotificationManager mManager=
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        mManager.notify(0,notification);
    }

}
