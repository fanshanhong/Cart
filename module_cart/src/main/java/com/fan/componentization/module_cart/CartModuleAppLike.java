package com.fan.componentization.module_cart;

import android.content.Context;

import com.fan.componentization.apt_annotation.AppLifeCycle;
import com.fan.componentization.common.IAppLike;
import com.fan.componentization.module_comm.BaseAppLike;

/**
 * @Description:
 * @Author: shanhongfan
 * @Date: 2021/4/25 13:49
 * @Modify:
 */
@AppLifeCycle
public class CartModuleAppLike implements IAppLike {
    @Override
    public int getPriority() {
        return 5;
    }

    @Override
    public void onCreate(Context context) {
        System.out.println("======CartModuleAppLike 执行了");
    }

    @Override
    public void onTerminate() {

    }
}
