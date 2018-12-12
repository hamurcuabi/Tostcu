package com.emrehmrc.tostcuexample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.emrehmrc.tostcu.Tostcu;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @ColorInt
    private static int ERROR_COLOR = Color.parseColor("#00574B");
    Button btn_succes, btn_error, btn_info, btn_warning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_succes = findViewById(R.id.btn_succes);
        btn_error = findViewById(R.id.btn_error);
        btn_warning = findViewById(R.id.btn_warning);
        btn_info = findViewById(R.id.btn_info);

        btn_info.setOnClickListener(this);
        btn_warning.setOnClickListener(this);
        btn_succes.setOnClickListener(this);
        btn_error.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_succes:
                Tostcu.succes(getApplicationContext(), "Succes");
                break;
            case R.id.btn_error:
                Tostcu.error(getApplicationContext(), "Error");
                break;
            case R.id.btn_info:
                Tostcu.info(getApplicationContext(), "İnfo");
                break;
            case R.id.btn_warning:
                Tostcu.warning(getApplicationContext(), "Warning");
                break;

        }
    }
}
