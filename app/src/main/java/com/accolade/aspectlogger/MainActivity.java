package com.accolade.aspectlogger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.accolade.logger.MyAnnotation;

public class MainActivity extends AppCompatActivity {

    @Override
    @MyAnnotation(methodName = "onCreate")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    @MyAnnotation(methodName = "onResume")
    protected void onResume() {
        super.onResume();
    }

    @Override
    @MyAnnotation(methodName = "onStart")
    protected void onStart() {
        super.onStart();
    }

    @Override
    @MyAnnotation(methodName = "onPause")
    protected void onPause() {
        super.onPause();
    }

    @Override
    @MyAnnotation(methodName = "onStop")
    protected void onStop() {
        super.onStop();
    }
}
