package com.example.rathana.localnotificationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.rathana.localnotificationdemo.notification.ConcreteNotification;

public class MainActivity extends AppCompatActivity {

    ConcreteNotification notification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notification=new ConcreteNotification();
    }

    public void onPushNotification(View view) {
        notification.createBasicNotification(this);
    }

    public void onInboxPushNotification(View view) {
        notification.createInboxStyleNotification(this);
    }

    public void onExpandedPushNotification(View view) {
        notification.createBigPictureNotification(this);
    }
}
