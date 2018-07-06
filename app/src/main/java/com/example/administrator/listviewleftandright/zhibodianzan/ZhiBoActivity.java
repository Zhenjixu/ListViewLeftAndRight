package com.example.administrator.listviewleftandright.zhibodianzan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.administrator.listviewleftandright.R;

public class ZhiBoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhi_bo);
        final HeartLayout heartLayout = (HeartLayout)findViewById(R.id.heart_layout);
        findViewById(R.id.member_send_good).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                heartLayout.addFavor();
            }
        });
    }
}
