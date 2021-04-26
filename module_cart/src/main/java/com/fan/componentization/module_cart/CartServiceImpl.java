package com.fan.componentization.module_cart;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.fan.componentization.export_cart.CartInfo;
import com.fan.componentization.export_cart.ICartService;

/**
 * 购物车组件服务的实现
 * 需要@Route注解、指定CartRouterTable中定义的服务路由
 */
@Route(path = "/cart/service")
public class CartServiceImpl implements ICartService {

    @Override
    public CartInfo getProductCountInCart() {
    	//这里实际项目中 应该是 请求接口 或查询数据库
        CartInfo cartInfo = new CartInfo();
        return cartInfo;
    }

    @Override
    public void init(Context context) {
        //初始化工作，服务注入时会调用，可忽略
    }
}
