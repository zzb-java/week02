package com.bawei.mk.model;

import com.bawei.mk.contract.Contract;
import com.bawei.mk.http.HttpUtils;

/**
 *  * <p>文件描述：<p>
 *  * <p>作者：Zhang Zhi Bo<p>
 *  * <p>创建时间：2019/10/23 09 11 09<p>
 *  * <p>版本号：1<p>
 */
public class Model_m {
    public void getData(String url, Contract.iModel iModel){
        HttpUtils.getHttpUtils().doget(url, iModel);
    }
}
