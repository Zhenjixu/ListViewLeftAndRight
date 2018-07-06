package com.example.administrator.listviewleftandright.broadcasreciver;

import android.content.Intent;
import android.os.BatteryManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.administrator.listviewleftandright.R;
import com.example.administrator.listviewleftandright.zuoyou.MainActivity;

public class BrocadeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button brocade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brocade);
        initView();
    }

    private void initView() {
        brocade = (Button) findViewById(R.id.brocade);

        brocade.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.brocade:
                Intent intent = new Intent("com.example.administrator.listviewleftandright");
                intent.putExtra("info","我们很有缘,谢谢你收到我");
                BrocadeActivity.this.sendBroadcast(intent);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
