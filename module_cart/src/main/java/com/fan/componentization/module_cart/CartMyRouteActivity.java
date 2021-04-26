package com.fan.componentization.module_cart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.fan.componentization.apt_annotation.ARouter;
//import com.fan.componentization.module_comm.ARouter$$AAA;

@ARouter(path = "/cart/CartMyRouteActivity")
public class CartMyRouteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_my_route);

        // 终于找到了....
        //ARouter$$AAA.findTargetClass()


                // 1. $$aaa 都是生成在 app 里的, 没必要调整了, 直接把 app 作为 library 发布出来
        // 依赖 common 的 app, 直接就能试用了


        // 3. 注意, !!!这个 扫描的, 不能放在 common 里, 要放在每个有 Activity 的 Module 里才行
        //4. 就应该放在 common 里, 在壳工程打包就行
    }
}