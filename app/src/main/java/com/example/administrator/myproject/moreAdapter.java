package com.example.administrator.myproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Administrator on 2018/2/11.
 */

public class moreAdapter extends RecyclerView.Adapter<moreAdapter.ViewHolder>{
    private Context mContext;
    private List<more> mMoreList;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(mContext==null){
            mContext=parent.getContext();
        }
        View view= LayoutInflater.from(mContext).inflate(R.layout.more_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        more m=mMoreList.get(position);
        holder.moreName.setText(m.getName());
        Glide.with(mContext).load(m.getImageId()).into(holder.moreImage);
    }

    @Override
    public int getItemCount() {
        return mMoreList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView moreImage;
        TextView moreName;

        public ViewHolder(View view) {
            super(view);
            moreImage=(ImageView)view.findViewById(R.id.more_image);
            moreName=(TextView)view.findViewById(R.id.more_name);
        }
    }

    public moreAdapter(List<more> moreList){
        mMoreList=moreList;
    }

}
