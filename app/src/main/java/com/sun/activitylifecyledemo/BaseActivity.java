package com.sun.activitylifecyledemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public abstract class BaseActivity extends AppCompatActivity {

    private String mTag;

    public abstract String setTAG();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTag = "SXT: " + setTAG();
        Log.d(mTag, "onCreate()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(mTag, "onSaveInstanceState: " + outState.toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(mTag, "onRestoreInstanceState: " + savedInstanceState.toString());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(mTag, "onNewIntent");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(mTag, "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(mTag, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(mTag, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(mTag, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(mTag, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(mTag, "onDestroy");
    }

}
