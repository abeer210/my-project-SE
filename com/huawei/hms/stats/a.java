package com.huawei.hms.stats;

import android.content.Context;
import com.huawei.hianalytics.ab.bc.ef.ab;
import com.huawei.hianalytics.ab.bc.kl.gh;
import com.huawei.hianalytics.ab.fg.cd;
import java.util.LinkedHashMap;
import vigqyno.C0201;

public abstract class a {
    private static cd a;

    public static void a() {
        if (c() != null && gh.bc().ab()) {
            a.ab(-1);
        }
    }

    public static void a(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (c() != null && gh.bc().ab()) {
            if (i == 1 || i == 0) {
                a.ab(i, str, linkedHashMap);
                return;
            }
            ab.de(C0201.m82(27798), C0201.m82(27797) + i);
        }
    }

    @Deprecated
    public static void a(Context context, String str, String str2) {
        if (c() != null) {
            a.ab(context, str, str2);
        }
    }

    public static boolean b() {
        return com.huawei.hianalytics.hms.ab.cd().ab();
    }

    private static synchronized cd c() {
        cd cdVar;
        synchronized (a.class) {
            if (a == null) {
                a = com.huawei.hianalytics.hms.ab.cd().bc();
            }
            cdVar = a;
        }
        return cdVar;
    }
}
