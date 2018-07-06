package com.example.administrator.listviewleftandright.service;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.administrator.listviewleftandright.R;

public class ServiceActivity extends AppCompatActivity implements View.OnClickListener {


    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceDisconnected(ComponentName name) {
        }

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            MyService.MyBinder myBinder = (MyService.MyBinder) service;
            myBinder.startDownload();
            /*MyAIDLService myAIDLService = MyAIDLService.Stub.asInterface(service);
            try {
                int result = myAIDLService.plus(3, 5);
                String upperStr = myAIDLService.toUpperCase("hello world");
                Log.d("TAG", "result is " + result);
                Log.d("TAG", "upperStr is " + upperStr);
            } catch (RemoteException e) {
                e.printStackTrace();
            }*/

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        initView();
        EditText edit = findViewById(R.id.edit);
        edit.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
    }

    private void initView() {

        Button start_service = (Button) findViewById(R.id.start_service);
        start_service.setOnClickListener(this);
        Button stop_service = (Button) findViewById(R.id.stop_service);
        stop_service.setOnClickListener(this);
        Button bind_service = (Button) findViewById(R.id.bind_service);
        bind_service.setOnClickListener(this);
        Button unbind_service = (Button) findViewById(R.id.unbind_service);
        unbind_service.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start_service:
                Intent startIntent = new Intent(this, MyService.class);
                startService(startIntent);
                break;
            case R.id.stop_service:
                Intent stopIntent = new Intent(this, MyService.class);
                stopService(stopIntent);
                break;
            case R.id.bind_service:
                Intent bindIntent = new Intent(this, MyService.class);
                bindService(bindIntent, connection, BIND_AUTO_CREATE);
                break;
            case R.id.unbind_service:
                unbindService(connection);
                break;

        }
    }
}
