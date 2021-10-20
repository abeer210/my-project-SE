package com.huawei.hms.framework.network.grs.d;

import android.os.SystemClock;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import vigqyno.C0201;

public class d {
    private static Map<String, a> a = new ConcurrentHashMap(16);

    public static class a {
        private long a;
        private long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public boolean a() {
            return SystemClock.elapsedRealtime() - this.b <= this.a;
        }
    }

    public static a a(String str) {
        String r1 = C0201.m82(27169);
        Logger.v(r1, C0201.m82(27168) + a.size());
        a aVar = a.get(str);
        Logger.v(r1, C0201.m82(27170) + a.size());
        return aVar;
    }

    public static void a(String str, a aVar) {
        String r1 = C0201.m82(27172);
        Logger.v(r1, C0201.m82(27171) + a.size());
        a.put(str, aVar);
        Logger.v(r1, C0201.m82(27173) + a.size());
    }
}
