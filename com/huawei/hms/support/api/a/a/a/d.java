package com.huawei.hms.support.api.a.a.a;

import com.huawei.hms.support.api.a.a.b.c;

/* compiled from: RequestActivityUpdatesCacheManager */
public class d extends c {
    private static volatile d a;
    private static final byte[] b = new byte[0];

    public static d a() {
        if (a == null) {
            synchronized (b) {
                if (a == null) {
                    a = new d();
                }
            }
        }
        return a;
    }
}
