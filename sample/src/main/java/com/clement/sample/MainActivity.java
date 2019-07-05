package com.clement.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.clement.mavenlibrarytest.TestApi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_tips).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //调用library的方法
                TestApi.doTest(MainActivity.this);
            }
        });
    }
}
