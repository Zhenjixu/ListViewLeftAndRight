package com.example.administrator.listviewleftandright.service;
//　┏┓　　　┏┓
//┏┛┻━━━┛┻┓
//┃　　　　　　　┃ 　
//┃　　　━　　　┃
//┃　┳┛　┗┳　┃
//┃　　　　　　　┃
//┃　　　┻　　　┃
//┃　　　　　　　┃          神兽保佑
//┗━┓　　　┏━┛          代码无bug！！！
//　　┃　　　┃　　　　　　　　　
//　　┃　　　┃
//　　┃　　　┗━━━┓
//　　┃　　　　　　　┣┓
//　　┃　　　　　　　┏┛
//　　┗┓┓┏━┳┓┏┛
//　　　┃┫┫　┃┫┫
//　　　┗┻┛　┗┻┛

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.administrator.listviewleftandright.R;

import java.lang.ref.SoftReference;

/**
 * Created by zjx
 * on 2018/6/27 0027.
 * at 北京
 * Email : 2116301224@qq.com
 * QQ:2116301224
 * WX:zhenjixu0928
 */

public class MyService extends Service {

    public static final String TAG = "TAG";

    private MyBinder mBinder = new MyBinder();


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e(TAG, "onBind==============onBind");
//        mBinder.startDownload();
        return mBinder;
    }

    @Override
    public void onCreate() {
        super.onCreate();
       /* Notification.Builder builder = new Notification.Builder(this);
        PendingIntent contentIntent = PendingIntent.getActivity(this,
                0, new Intent(this, ServiceActivity.class)
                , 0);
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setContentIntent(contentIntent);
        builder.setContentText("前台服务已启动");
        Notification notification = builder.build();
        startForeground(-1, notification);


        new MyAIDLService.Stub() {

            @Override
            public String toUpperCase(String str) throws RemoteException {
                if (str != null) {
                    return str.toUpperCase();
                }
                return null;
            }

            @Override
            public int plus(int a, int b) throws RemoteException {
                return a + b;
            }
        };*/

        Log.e(TAG, "onCreate==============onCreate");
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e(TAG, "onStartCommand==============onStartCommand");
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        Log.e(TAG, "onDestroy==============onDestroy");
        stopForeground(true);
        super.onDestroy();
    }

    @Override
    public void onRebind(Intent intent) {
        Log.e(TAG , "onRebind ============== onRebind");
        super.onRebind(intent);
    }

    public class MyBinder extends Binder {
        public void startDownload() {
            Log.e(TAG, "startDownload ========== startDownload");
        }

    }
}
