package com.example.rathana.localnotificationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView title;
    TextView content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        title=findViewById(R.id.title);
        content=findViewById(R.id.detail);

        Intent intent=getIntent();
        if(intent!=null){
            String t=intent.getStringExtra("title");
            String c=intent.getStringExtra("content");
            title.setText(t);
            content.setText(c);
        }
    }
}
