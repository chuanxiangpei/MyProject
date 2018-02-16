package com.example.administrator.myproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/2/12.
 */

public class moreActivity  extends AppCompatActivity{

    private moreAdapter adapter;
    private List<more> moreList=new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_main);

        initMore();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        GridLayoutManager layoutManager=new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new moreAdapter(moreList);
        recyclerView.setAdapter(adapter);

    }
     private void initMore(){
        moreList.clear();
        more m1=new more("banana",R.drawable.banana);
        moreList.add(m1);
        more m2=new more("cherry",R.drawable.cherry);
        moreList.add(m2);
        more m3=new more("mango",R.drawable.mango);
        moreList.add(m3);
        more m4=new more("orange",R.drawable.orange);
        moreList.add(m4);
        more m5=new more("pear",R.drawable.pear);
        moreList.add(m5);
        more m6=new more("pineapple",R.drawable.pineapple);
        moreList.add(m6);
        more m7=new more("strawberry",R.drawable.strawberry);
        moreList.add(m7);
         more m8=new more("strawberry",R.drawable.strawberry);
         moreList.add(m7);
         more m9=new more("strawberry",R.drawable.strawberry);
         moreList.add(m7);
         more m10=new more("strawberry",R.drawable.strawberry);
         moreList.add(m7);
    }

}
