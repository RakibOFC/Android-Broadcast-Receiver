package com.rakibofc.labreportfour;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals("android.intent.action.BATTERY_CHANGED")){
            Toast.makeText(context, "Battery Status Changes", Toast.LENGTH_SHORT).show();
        }
    }
}