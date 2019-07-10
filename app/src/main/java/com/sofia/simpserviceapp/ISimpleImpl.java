package com.sofia.simpserviceapp;

import android.os.RemoteException;

import com.sofia.mylib.ISimple;

public class ISimpleImpl extends ISimple.Stub {
    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int sub(int a, int b) throws RemoteException {
        return a - b;
    }
}
