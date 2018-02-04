package com.bugfreetechnology.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


// Local broadcast receiver
public class FirstBroadcastReciever extends BroadcastReceiver {
    private static final String TAG = "FirstBroadcastReciever";
    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d(TAG, "onReceive: "+intent.getDataString());
        String data = intent.getStringExtra("SAMPLE");
        Log.d(TAG, "onReceive: DATA "+ data);
    }
}
