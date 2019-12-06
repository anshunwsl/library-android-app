package com.aswsl.libaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.alibaba.fastjson.JSONObject;
import com.aswsl.common.core.JSONUtil;
import com.aswsl.common.model.UserModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //
    private Button btnTest=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        btnTest=findViewById(R.id.btn_test);
        //
        btnTest.setOnClickListener(this);
    }
    //

    @Override
    public void onClick(View v) {
        //
        UserModel model=new UserModel();
        //
        //
        model.setAddress("shenzhen");
        model.setAge(100);
        model.setUserName("wangsl");
        //
        Log.d(getClass().getSimpleName(), JSONUtil.toJSONString(model));
    }
}
