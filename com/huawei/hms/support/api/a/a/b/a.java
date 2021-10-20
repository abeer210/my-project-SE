package com.huawei.hms.support.api.a.a.b;

import com.huawei.hms.support.log.HMSLog;
import vigqyno.C0201;

/* compiled from: LocationClientCacheManager */
public class a {
    private static final String a = null;
    private long b;
    private int c;
    private int d;

    /* renamed from: com.huawei.hms.support.api.a.a.b.a$a  reason: collision with other inner class name */
    /* compiled from: LocationClientCacheManager */
    private static class C0108a {
        private static final a a = new a();
    }

    static {
        C0201.m83(a.class, 624);
    }

    public static a a() {
        return C0108a.a;
    }

    public boolean b() {
        long currentTimeMillis = System.currentTimeMillis();
        int i = this.c;
        if (i == 0) {
            this.b = currentTimeMillis;
            this.c = i + 1;
            HMSLog.i(a, C0201.m82(6066));
            return true;
        } else if (currentTimeMillis - this.b > 300000) {
            this.c = 1;
            this.b = currentTimeMillis;
            HMSLog.i(a, C0201.m82(6067));
            return true;
        } else if (i >= 3) {
            this.b = currentTimeMillis;
            HMSLog.i(a, C0201.m82(6068));
            return false;
        } else {
            HMSLog.i(a, C0201.m82(6069));
            this.b = currentTimeMillis;
            this.c++;
            return true;
        }
    }

    public void c() {
        if (this.c == 0 && this.b == 0) {
            HMSLog.i(a, C0201.m82(6070));
            return;
        }
        HMSLog.i(a, C0201.m82(6071));
        this.b = 0;
        this.c = 0;
    }

    public int d() {
        return this.d;
    }

    private a() {
        this.d = 0;
    }

    public void a(int i) {
        this.d = i;
    }
}
