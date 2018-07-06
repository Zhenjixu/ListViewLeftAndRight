package com.example.administrator.listviewleftandright.zhuhang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.administrator.listviewleftandright.R;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView lv = findViewById(R.id.lv);
        lv.setAdapter(new ListAdapter(this));
    }
}
