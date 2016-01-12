package com.baidu.mta.android.library;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.baidu.mtasdk.MtaSDK;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onResume() {
        MtaSDK.onResume(this);
        super.onResume();
    }

    @Override
    protected void onStart() {
        // UTestAgent.activityStart(this);
        super.onStart();
    }

    @Override
    protected void onPause() {
        MtaSDK.onPause(this);
        super.onPause();
    }

    @Override
    protected void onStop() {
        // UTestAgent.activityStop(this);
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
    }

}
