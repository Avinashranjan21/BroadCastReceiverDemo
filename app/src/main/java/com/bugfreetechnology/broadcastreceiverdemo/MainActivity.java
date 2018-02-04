package com.bugfreetechnology.broadcastreceiverdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_sendBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_sendBroadcast = findViewById(R.id.btn_sendBroadcast);

        btn_sendBroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FirstBroadcastReciever.class);
                intent.putExtra("SAMPLE","BROADCAST_TEST_MESSAGE");
                sendBroadcast(intent);
            }
        });
    }
}
