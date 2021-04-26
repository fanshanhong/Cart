package com.fan.componentization.export_cart;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * 购物车组件对外暴露的服务
 * 必须继承IProvider
 * @author hufeiyang
 */
public interface ICartService extends IProvider {

    /**
     * 获取购物车中商品数量
     * @return
     */
    CartInfo getProductCountInCart();
}
