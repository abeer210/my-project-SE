package com.huawei.hms.framework.network.grs.d;

import com.huawei.hms.framework.common.Logger;
import vigqyno.C0201;

public class e {
    private static final String a = null;

    static {
        C0201.m83(e.class, 578);
    }

    public static boolean a(Long l) {
        if (l == null) {
            Logger.v(a, C0201.m82(27088));
            return true;
        }
        try {
            if (l.longValue() - System.currentTimeMillis() >= 0) {
                Logger.v(a, C0201.m82(27089));
                return false;
            }
            Logger.v(a, C0201.m82(27090));
            return true;
        } catch (NumberFormatException unused) {
            Logger.v(a, C0201.m82(27091));
        }
    }

    public static boolean a(Long l, long j) {
        if (l == null) {
            Logger.v(a, C0201.m82(27092));
            return true;
        }
        try {
            if (l.longValue() - (System.currentTimeMillis() + j) >= 0) {
                Logger.v(a, C0201.m82(27093));
                return false;
            }
        } catch (NumberFormatException unused) {
            Logger.v(a, C0201.m82(27094));
        }
        return true;
    }
}
