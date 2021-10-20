package com.huawei.hms.framework.network.grs.c.b;

import android.os.SystemClock;
import com.huawei.hms.framework.network.grs.c.e;
import java.util.concurrent.Future;

public class b {
    private Future<e> a;
    private long b = SystemClock.elapsedRealtime();

    public b(Future<e> future) {
        this.a = future;
    }

    public Future<e> a() {
        return this.a;
    }

    public boolean b() {
        return SystemClock.elapsedRealtime() - this.b <= 300000;
    }
}
