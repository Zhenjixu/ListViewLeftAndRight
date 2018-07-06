package com.example.administrator.listviewleftandright.broadcasreciver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class OutCallReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        /**
         * 这里是接收到广播后需要进行的操作都放在这里
         */
        String info = intent.getStringExtra("info");
        Intent batteryIntent = context.registerReceiver(null,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        int currLevel = batteryIntent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
        int total = batteryIntent.getIntExtra(BatteryManager.EXTRA_SCALE, 1);//总电量
        Toast.makeText(context, info + "::" + currLevel + "::" + total , Toast.LENGTH_SHORT).show();
    }

    public OutCallReceiver() {
        super();
        Log.e("TAG", "OutCallReceiver ======= OutCallReceiver");
    }

    @Override
    public IBinder peekService(Context myContext, Intent service) {
        Log.e("TAG", "peekService ======= peekService");

        return super.peekService(myContext, service);

    }
}