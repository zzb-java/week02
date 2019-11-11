package com.bawei.mk.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.bawei.mk.R;
import com.bawei.mk.adapter.RecyclerAdapter;
import com.bawei.mk.base.BaseActivity;
import com.bawei.mk.bean.Beans;
import com.bawei.mk.contract.Contract;
import com.bawei.mk.presenter.Presenter;

public class MainActivity extends BaseActivity implements Contract.iView {

    private RecyclerView recyclerView;

    @Override
    protected Presenter getPro() {
        Presenter presenter = new Presenter();

        return presenter;
    }
    @Override
    protected void initView() {

        recyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);



    }
    @Override
    protected void initData() {
        Presenter pp = (Presenter) p;
        pp.toRequest("http://172.17.8.100/movieApi/movie/v1/findHotMovieList?page=1&count=5");
    }
    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void success(Beans s) {
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(this,s.result);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
