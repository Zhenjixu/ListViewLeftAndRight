package com.example.administrator.listviewleftandright.zuoyou;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.administrator.listviewleftandright.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private RecyclerView recycler;
    private EditText edit;
    private ArrayList<User1> u1;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        u1 = new ArrayList<>();
        adapter = new RecyclerAdapter(u1, this);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initView() {
        recycler = findViewById(R.id.recycler);
        edit = findViewById(R.id.edit);
        Button user1 = findViewById(R.id.user1);
        Button user2 = findViewById(R.id.user2);

        user1.setOnClickListener(this);
        user2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.user1:
                User1 user1 = new User1();
                user1.setUserName("用户1");
                user1.setContent(edit.getText().toString());
                user1.setType("1");
                u1.add(user1);
                adapter.notifyDataSetChanged();
                break;
            case R.id.user2:
                User1 user2 = new User1();
                user2.setUserName("用户2");
                user2.setContent(edit.getText().toString());
                user2.setType("2");
                u1.add(user2);
                adapter.notifyDataSetChanged();
                break;
        }
    }

}
