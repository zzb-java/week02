package com.bawei.mk.base;

import com.bawei.mk.contract.Contract;

/**
 *  * <p>文件描述：<p>
 *  * <p>作者：Zhang Zhi Bo<p>
 *  * <p>创建时间：2019/10/23 09 07 55<p>
 *  * <p>版本号：1<p>
 */
public abstract class BasePresenter<V extends BaseActivity>{
    public  V v;
    public BasePresenter(){
        iModel();
    }

    protected abstract void iModel();

    public void attachView(V v){
        this.v=v;
    }
    public void attachView2(){
        v=null;
    }

}
