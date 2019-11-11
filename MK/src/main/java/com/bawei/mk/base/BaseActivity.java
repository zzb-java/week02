package com.bawei.mk.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 *  * <p>文件描述：<p>
 *  * <p>作者：Zhang Zhi Bo<p>
 *  * <p>创建时间：2019/10/23 09 07 45<p>
 *  * <p>版本号：1<p>
 */
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {
    public  P p;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayout());
        p = getPro();
        p.attachView(this);
        initView();
        initData();
    }

    protected abstract P getPro();

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int initLayout();
}
