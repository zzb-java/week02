package com.bawei.mk.presenter;

import com.bawei.mk.base.BasePresenter;
import com.bawei.mk.bean.Beans;
import com.bawei.mk.contract.Contract;
import com.bawei.mk.model.Model_m;
import com.bawei.mk.view.MainActivity;
import com.google.gson.Gson;

/**
 *  * <p>文件描述：<p>
 *  * <p>作者：Zhang Zhi Bo<p>
 *  * <p>创建时间：2019/10/23 09 11 37<p>
 *  * <p>版本号：1<p>
 */
public class Presenter extends BasePresenter implements Contract.iPresenter {
    private com.bawei.mk.model.Model_m model_m;
    @Override
    protected void iModel() {
        model_m = new Model_m();
    }

    @Override
    public void toRequest(String request) {
        model_m.getData(request, new Contract.iModel() {
            @Override
            public void success(String s) {
                Gson gson = new Gson();
                Beans beans = gson.fromJson(s, Beans.class);
                MainActivity vvv = (MainActivity)v;
                vvv.success(beans);

            }

            @Override
            public void failuare(String f) {

            }
        });
    }
}
