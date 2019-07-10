package com.luck.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.luck.library.base.BaseActivity;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    TextView mTvTest;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvTest = findViewById(R.id.tv_test);
        mTvTest.requestFocus();
        mTvTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MarqueeActivity.class));
            }
        });
    }
}
