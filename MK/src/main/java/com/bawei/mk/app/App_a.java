package com.bawei.mk.app;

import android.app.Application;
import android.content.Context;

/**
 *  * <p>文件描述：<p>
 *  * <p>作者：Zhang Zhi Bo<p>
 *  * <p>创建时间：2019/10/23 09 10 29<p>
 *  * <p>版本号：1<p>
 */
public class App_a extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
    }
}
