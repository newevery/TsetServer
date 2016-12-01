package com.xuenen.tsetserver;

/**
 * Created by Administrator on 04/08/2016.
 */

/**
 * 通用的回调接口，当请求返回的是{String}类型数据时，可以使用该通用接口
 */
public interface OnCommonListener {
    /**
     * 成功的时候回调该方法
     * @param json 返回的数据
     */
    void onSuccess(String json);

    /**
     * 不成功的时候回调该方法
     */
    void onFailed();
}
