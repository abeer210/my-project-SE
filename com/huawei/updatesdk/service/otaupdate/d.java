package com.huawei.updatesdk.service.otaupdate;

import android.content.Intent;

public class d {
    private static final Object b = new Object();
    private static d c;
    private CheckUpdateCallBack a;

    public static d a() {
        d dVar;
        synchronized (b) {
            if (c == null) {
                c = new d();
            }
            dVar = c;
        }
        return dVar;
    }

    public void a(int i) {
        CheckUpdateCallBack checkUpdateCallBack = this.a;
        if (checkUpdateCallBack != null) {
            checkUpdateCallBack.onMarketStoreError(i);
        }
    }

    public void a(Intent intent) {
        CheckUpdateCallBack checkUpdateCallBack = this.a;
        if (checkUpdateCallBack != null) {
            checkUpdateCallBack.onMarketInstallInfo(intent);
        }
    }

    public void a(CheckUpdateCallBack checkUpdateCallBack) {
        this.a = checkUpdateCallBack;
    }

    public void b(Intent intent) {
        CheckUpdateCallBack checkUpdateCallBack = this.a;
        if (checkUpdateCallBack != null) {
            checkUpdateCallBack.onUpdateInfo(intent);
        }
    }
}
