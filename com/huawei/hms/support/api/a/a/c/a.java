package com.huawei.hms.support.api.a.a.c;

import com.huawei.hms.support.api.a.a.b.c;
import com.huawei.hms.support.log.HMSLog;
import vigqyno.C0201;

/* compiled from: LocationRequestCacheManager */
public class a extends c {
    private static volatile a a;
    private static final byte[] b = new byte[0];

    public static a a() {
        if (a == null) {
            synchronized (b) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    public void a(b bVar, int i) {
        if (bVar == null || com.huawei.hms.support.api.a.c.a.a(b())) {
            HMSLog.i(C0201.m82(11001), C0201.m82(11002));
            return;
        }
        for (int i2 = 0; i2 < b().size(); i2++) {
            b bVar2 = null;
            if (b().get(i2) instanceof b) {
                bVar2 = (b) b().get(i2);
            }
            if (bVar2 != null && bVar2.equals(bVar)) {
                if (i > 0) {
                    bVar2.b().setNumUpdates(i);
                }
                bVar2.a(i);
            }
        }
    }
}
