package com.example.administrator.listviewleftandright.zuoyou;
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
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.listviewleftandright.R;

import java.util.List;

/**
 * Created by zjx
 * on 2018/6/27 0027.
 * at 北京
 * Email : 2116301224@qq.com
 * QQ:2116301224
 * WX:zhenjixu0928
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<User1> list;
    private Context context;

    public RecyclerAdapter(List<User1> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        int type = 0;
        if (list.get(position).getType().equals("1")) {
            type = 1;
        } else {
            type = 2;
        }
        return type;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holder = null;
        if (viewType == 1) {
            View left = LayoutInflater.from(context).inflate(R.layout.item_left, parent, false);
            holder = new LeftHolder(left);
        } else if (viewType == 2) {
            View right = LayoutInflater.from(context).inflate(R.layout.item_right, parent, false);
            holder = new RightHolder(right);
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof LeftHolder){
            ((LeftHolder) holder).content.setText(list.get(position).getContent());
            ((LeftHolder) holder).name.setText(list.get(position).getUserName());
        }else if(holder instanceof RightHolder){
            ((RightHolder) holder).content.setText(list.get(position).getContent());
            ((RightHolder) holder).name.setText(list.get(position).getUserName());
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class LeftHolder extends RecyclerView.ViewHolder {

        private final TextView content;
        private final TextView name;

        public LeftHolder(View itemView) {
            super(itemView);
            content = itemView.findViewById(R.id.content);
            name = itemView.findViewById(R.id.userName);
        }
    }

    public class RightHolder extends RecyclerView.ViewHolder {

        private final TextView content;
        private final TextView name;

        public RightHolder(View itemView) {
            super(itemView);
            content = itemView.findViewById(R.id.content);
            name = itemView.findViewById(R.id.userName);
        }
    }

}
