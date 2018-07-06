package com.example.administrator.listviewleftandright.liaotian;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.listviewleftandright.R;

public class LiaoTianActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv;
    private EditText tv_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liao_tian);
        initView();

    }

    private void initView() {
        tv = (TextView) findViewById(R.id.tv);
        tv_edit = (EditText) findViewById(R.id.tv_edit);
        Button send = (Button) findViewById(R.id.send);

        send.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.send:

                try {
                    Send.sendUDP(tv_edit.getText().toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                String udp = null;
                try {
                    udp = Send.getUDP(tv_edit.getText().toString());
                    tv.setText(udp.toString());
                    Log.e("TAG", udp);
                } catch (Exception e) {
                    e.printStackTrace();
                }




                break;
        }
    }


}
