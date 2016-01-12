package com.baidu.mta.android.library;

// import com.baidu.batsdk.BatSDK;

import com.baidu.mtasdk.MtaSDK;

public class MtaApplication extends android.app.Application {

    @Override
    public void onCreate() {

        MtaSDK.init(this);

        super.onCreate();
    }

}
