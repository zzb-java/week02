package com.bawei.mk.http;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.print.PageRange;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bawei.mk.app.App_a;
import com.bawei.mk.contract.Contract;

/**
 *  * <p>文件描述：<p>
 *  * <p>作者：Zhang Zhi Bo<p>
 *  * <p>创建时间：2019/10/23 09 10 51<p>
 *  * <p>版本号：1<p>
 */
public class HttpUtils{
    private static HttpUtils httpUtils = new HttpUtils();
    private HttpUtils(){}

    public static HttpUtils getHttpUtils() {
        return httpUtils;
    }
    public  boolean network(Context context) {
        if (context != null) {
            ConnectivityManager systemService = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetworkInfo = systemService.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }

            }
            return false;
        }

        public void doget (String url,final Contract.iModel iModel){
            final RequestQueue requestQueue = Volley.newRequestQueue(App_a.context);
            StringRequest stringRequest = new StringRequest(0, url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    iModel.success(response);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    iModel.failuare(error.toString());
                }

            });
            requestQueue.add(stringRequest);
        }
    }

