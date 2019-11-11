package com.bawei.mk.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.mk.R;
import com.bawei.mk.bean.Beans;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 *  * <p>文件描述：<p>
 *  * <p>作者：Zhang Zhi Bo<p>
 *  * <p>创建时间：2019/10/23 14 34 05<p>
 *  * <p>版本号：1<p>
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.Holder> {
    private Context context;
    private List<Beans.ResultBean> list = new ArrayList<>();

    public RecyclerAdapter(Context context, List<Beans.ResultBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = View.inflate(context, R.layout.item, null);

        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        holder.textView.setText(list.get(i).name);
        Glide.with(context)

                .load(list.get(i).imageUrl)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public Holder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.textview);
        }
    }
}
