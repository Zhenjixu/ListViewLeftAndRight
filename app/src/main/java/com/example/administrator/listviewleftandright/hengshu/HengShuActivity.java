package com.example.administrator.listviewleftandright.hengshu;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;

import com.example.administrator.listviewleftandright.R;

public class HengShuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heng_shu);

        log("onCreate");

        if (savedInstanceState != null) {
            int page = savedInstanceState.getInt("page");
            log("onCreate() page: " + page);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        log("onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        log("onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        log("onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        log("onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        log("onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        log("onRestart()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("page", 50);

        log("onSaveInstanceState()");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        int page = savedInstanceState.getInt("page");
        log("onRestoreInstanceState() page:  " + page);
    }

//
//    public void get(View v){
//
//        Intent intent = new Intent(this,Main2Activity.class);
//
//        startActivity(intent);
//    }

    /**
     * 对横屏和竖屏进行一些特定的处理
     */
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            log("现在是横屏");

        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            log("现在是竖屏");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void log(String str) {
        Log.e("TAG", str);
    }
}
