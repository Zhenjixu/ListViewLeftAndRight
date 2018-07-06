package com.example.administrator.listviewleftandright.photo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.administrator.listviewleftandright.R;

import java.io.File;

public class ImgUpDataActivity extends AppCompatActivity implements View.OnClickListener {

    private String url = "http://172.20.10.14:8080/test";
    private ImageView img;
    private Button img_btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_and_video);
        initView();

    }

    private void initView() {
        img = (ImageView) findViewById(R.id.img);
        img_btn = (Button) findViewById(R.id.img_btn);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        img_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_btn:

                break;
        }
    }
}
