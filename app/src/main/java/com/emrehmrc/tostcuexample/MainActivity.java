package com.emrehmrc.tostcuexample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.emrehmrc.tostcu.Tostcu;
import com.emrehmrc.tostcu.TostcuUtil;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @ColorInt
    private static int CUSTOM_COLOR = Color.parseColor("#D81B60");
    Button btn_succes, btn_error, btn_info, btn_warning, btn_custom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_succes = findViewById(R.id.btn_succes);
        btn_error = findViewById(R.id.btn_error);
        btn_warning = findViewById(R.id.btn_warning);
        btn_info = findViewById(R.id.btn_info);
        btn_custom = findViewById(R.id.btn_custom);

        btn_info.setOnClickListener(this);
        btn_warning.setOnClickListener(this);
        btn_succes.setOnClickListener(this);
        btn_error.setOnClickListener(this);
        btn_custom.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_succes:
                Tostcu.succes(getApplicationContext(), "This is a Success", TostcuUtil.LONG);
                break;
            case R.id.btn_error:
                Tostcu.error(getApplicationContext(), "This is Error", TostcuUtil.LONG);
                break;
            case R.id.btn_info:
                Tostcu.info(getApplicationContext(), "This is İnfo", TostcuUtil.LONG);
                break;
            case R.id.btn_warning:
                Tostcu.warning(getApplicationContext(), "This is Warning", TostcuUtil.LONG);
                break;
            case R.id.btn_custom:Tostcu.custom(getApplicationContext(),"This is a Custom " +
                    "Toastcu",R.drawable.ic_custom,Toast.LENGTH_LONG,CUSTOM_COLOR,Gravity.CENTER,
                    true,TostcuUtil.currentTypeface,TostcuUtil.textSize);

        }
    }
}
