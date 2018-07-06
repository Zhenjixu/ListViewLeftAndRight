package com.example.administrator.listviewleftandright.zhuhang;
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

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zjx
 * on 2018/6/27 0027.
 * at 北京
 * Email : 2116301224@qq.com
 * QQ:2116301224
 * WX:zhenjixu0928
 */
public class ListAdapter extends BaseAdapter {
    private List<String> strings = new ArrayList<>();
    private Context context;

    ListAdapter(Context context) {
        this.context = context;
        for (int i = 0; i < 20; i++) {
            final int finalI = i;
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    strings.add(finalI + "");
                    notifyDataSetChanged();
                }

            };
// 设置动画延时
            Handler handler = new Handler();
            handler.postDelayed(r, i * 1000);
        }
    }

    @Override
    public int getCount() {
        return strings.size();
    }

    @Override
    public Object getItem(int position) {
        return strings.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        TextView tv = new TextView(context);
        tv.setText(strings.get(position));
        tv.setTextSize(20);
        return tv;
    }
}
