package com.example.myapplicationdemo0213;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity_onCLick";
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private TextView activity_main_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //寻找控件和注册点击事件
        initfindviewById();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_main_button1:
                Log.d(TAG, "onClick: activity_main_button1");
                activity_main_textview.setText("我是0217里面的project");
                break;
            case R.id.activity_main_button2:
                Log.d(TAG, "onClick: activity_main_button2");
                break;
            case R.id.activity_main_button3:
                Log.d(TAG, "onClick: activity_main_button3");
                break;
            case R.id.activity_main_button4:
                Log.d(TAG, "onClick: activity_main_button4");
                break;
            case R.id.activity_main_button5:
                Log.d(TAG, "onClick: activity_main_button5");
                break;
        }
    }

    //注册点击事件
    private void initfindviewById() {
        button1 = findViewById(R.id.activity_main_button1);
        button2 = findViewById(R.id.activity_main_button2);
        button3 = findViewById(R.id.activity_main_button3);
        button4 = findViewById(R.id.activity_main_button4);
        button5 = findViewById(R.id.activity_main_button5);
        activity_main_textview = findViewById(R.id.activity_main_textview);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }
}
