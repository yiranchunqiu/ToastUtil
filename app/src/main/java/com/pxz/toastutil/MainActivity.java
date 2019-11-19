package com.pxz.toastutil;

import android.os.Bundle;
import android.widget.TextView;

import com.pxz.pxztoast.ToastUtil;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 类说明：首页
 * 联系：530927342@qq.com
 *
 * @author peixianzhong
 * @date 2019/9/3 10:48
 */
public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private TextView tv7;
    private TextView tv8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        tv1 = findViewById(R.id.tv_1);
        tv2 = findViewById(R.id.tv_2);
        tv3 = findViewById(R.id.tv_3);
        tv4 = findViewById(R.id.tv_4);
        tv5 = findViewById(R.id.tv_5);
        tv6 = findViewById(R.id.tv_6);
        tv7 = findViewById(R.id.tv_7);
        tv8 = findViewById(R.id.tv_8);
    }

    private void initData() {
        tv1.setOnClickListener(v -> ToastUtil.shortShow("短时间系统吐司", MainActivity.this));
        tv2.setOnClickListener(v -> ToastUtil.longShow("长时间系统吐司", MainActivity.this));
        tv3.setOnClickListener(v -> ToastUtil.shortShowStyle("短时间自定义吐司", MainActivity.this));
        tv4.setOnClickListener(v -> ToastUtil.longShowStyle("长时间自定义吐司", MainActivity.this));
        tv5.setOnClickListener(v -> ToastUtil.shortShowStyleIc("短时间带图片吐司", MainActivity.this));
        tv6.setOnClickListener(v -> ToastUtil.longShowStyleIc("长时间带图片吐司", MainActivity.this));
        tv7.setOnClickListener(v -> ToastUtil.shortShowStyleIc("短时间自定义图片吐司", R.mipmap.ic_launcher, MainActivity.this));
        tv8.setOnClickListener(v -> ToastUtil.longShowStyleIc("长时间自定义图片吐司", R.mipmap.ic_launcher, MainActivity.this));
    }
}