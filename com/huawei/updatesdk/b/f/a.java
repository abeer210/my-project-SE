package com.huawei.updatesdk.b.f;

import android.text.TextUtils;
import com.huawei.updatesdk.a.a.c.h.b;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public final class a {
    private static final Map<Integer, String> b = new HashMap();
    private static a c = new a();
    private int a = 0;

    static {
        b.put(1, C0201.m82(27578));
        b.put(2, C0201.m82(27579));
        b.put(3, C0201.m82(27580));
        Map<Integer, String> map = b;
        String r2 = C0201.m82(27581);
        map.put(4, r2);
        b.put(5, r2);
        b.put(6, C0201.m82(27582));
        b.put(7, C0201.m82(27583));
        b.put(8, C0201.m82(27584));
        b.put(8, C0201.m82(27585));
        b.put(9, C0201.m82(27586));
        b.put(10, C0201.m82(27587));
        b.put(11, C0201.m82(27588));
        b.put(12, C0201.m82(27589));
    }

    private a() {
        int c2 = c();
        this.a = c2;
        if (c2 == 0) {
            this.a = b();
        }
        com.huawei.updatesdk.a.a.b.a.a.a.a(C0201.m82(27591), C0201.m82(27590) + this.a);
    }

    private String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(C0201.m82(27592));
            if (split.length == 2) {
                return split[1];
            }
        }
        return C0201.m82(27593);
    }

    private int b() {
        String a2 = a(b.a(C0201.m82(27594), C0201.m82(27595)));
        if (TextUtils.isEmpty(a2)) {
            return 0;
        }
        for (Map.Entry<Integer, String> entry : b.entrySet()) {
            if (a2.equals(entry.getValue())) {
                return entry.getKey().intValue();
            }
        }
        return 0;
    }

    private int c() {
        return b.a(C0201.m82(27596), 0);
    }

    public static a d() {
        return c;
    }

    public int a() {
        return this.a;
    }
}
