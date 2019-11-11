package com.bawei.mk.contract;

import com.bawei.mk.bean.Beans;

/**
 *  * <p>文件描述：<p>
 *  * <p>作者：Zhang Zhi Bo<p>
 *  * <p>创建时间：2019/10/23 09 08 21<p>
 *  * <p>版本号：1<p>
 */
public interface Contract {
    interface iView{
        void success(Beans s);
    }
    interface iModel{
        void success(String s);
        void failuare(String f);
    }
    interface iPresenter{
        void toRequest(String request);
    }

}
