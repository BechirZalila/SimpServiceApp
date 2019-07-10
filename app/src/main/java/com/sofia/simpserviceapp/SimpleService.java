package com.sofia.simpserviceapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class SimpleService extends Service {
    public SimpleService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
         return new ISimpleImpl();
    }
}
