package com.huawei.hms.support.api.a.a.a;

import com.huawei.hms.support.api.a.a.b.c;

/* compiled from: RequestActivityTransitionUpdatesCacheManager */
public class b extends c {
    private static volatile b a;
    private static final byte[] b = new byte[0];

    public static b a() {
        if (a == null) {
            synchronized (b) {
                if (a == null) {
                    a = new b();
                }
            }
        }
        return a;
    }
}
