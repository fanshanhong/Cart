package com.fan.componentization.module_cart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.fan.componentization.apt_annotation.ARouter;
import com.fan.componentization.module_comm.MyCommon;

@Route(path = "/cart/cartActivity")
@ARouter(path = "/cart/cartActivity")
public class CartMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_main);

        Intent intent = getIntent();
        String key1 = intent.getStringExtra("key1");
        String key2 = intent.getStringExtra("key2");

        TextView textView = findViewById(R.id.params);
        textView.setText(key1 + "::" + key2);

        MyCommon myCommon = new MyCommon();
        myCommon.getMyCommon();



    }
}