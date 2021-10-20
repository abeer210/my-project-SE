package com.huawei.updatesdk.a.b.d;

import com.huawei.updatesdk.a.b.d.c.d;
import com.huawei.updatesdk.service.appmgr.bean.b;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class a {
    private static Map<String, Class> a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(C0201.m82(31271), b.class);
    }

    public static d a(String str) throws InstantiationException, IllegalAccessException {
        Class cls = a.get(str);
        if (cls != null) {
            return (d) cls.newInstance();
        }
        throw new InstantiationException(C0201.m82(31272) + str);
    }
}
