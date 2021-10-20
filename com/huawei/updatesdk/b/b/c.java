package com.huawei.updatesdk.b.b;

import vigqyno.C0201;

public class c extends com.huawei.updatesdk.a.b.d.c.c {
    private int isUpdateSdk_ = 1;
    private String locale_ = null;
    private int serviceType_ = 0;
    private String ts_ = null;

    private void e(String str) {
        this.ts_ = str;
    }

    public void a(int i) {
        this.serviceType_ = i;
    }

    public void d(String str) {
        this.locale_ = str;
    }

    @Override // com.huawei.updatesdk.a.b.d.c.c
    public void e() {
        e(String.valueOf(System.currentTimeMillis()));
    }

    public String toString() {
        return getClass().getName() + C0201.m82(35668) + b() + C0201.m82(35669);
    }
}
