package com.huawei.hms.framework.network.grs;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class e {
    private static Map<String, d> a = new ConcurrentHashMap(16);
    private static final Object b = new Object();

    public static d a(GrsBaseInfo grsBaseInfo, Context context) {
        synchronized (b) {
            int uniqueCode = grsBaseInfo.uniqueCode();
            Map<String, d> map = a;
            d dVar = map.get(context.getPackageName() + uniqueCode);
            if (dVar == null) {
                d dVar2 = new d(context, grsBaseInfo);
                Map<String, d> map2 = a;
                map2.put(context.getPackageName() + uniqueCode, dVar2);
                return dVar2;
            } else if (dVar.a((Object) new d(grsBaseInfo))) {
                return dVar;
            } else {
                d dVar3 = new d(context, grsBaseInfo);
                Map<String, d> map3 = a;
                map3.put(context.getPackageName() + uniqueCode, dVar3);
                return dVar3;
            }
        }
    }
}
