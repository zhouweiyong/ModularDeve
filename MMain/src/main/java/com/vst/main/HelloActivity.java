package com.vst.main;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by zwy on 2017/12/20.
 * email:16681805@qq.com
 */

public class HelloActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_m);
        findViewById(R.id.btn_hello).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HelloActivity.this, "跳到新闻页面", Toast.LENGTH_SHORT).show();
                ARouter.getInstance()
                        .build("/nnews/news")
                        .navigation();
            }
        });
    }
}
