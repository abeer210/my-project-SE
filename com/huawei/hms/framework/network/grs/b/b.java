package com.huawei.hms.framework.network.grs.b;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.local.model.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class b {
    private static Map<String, b> a = new ConcurrentHashMap(16);
    private a b;

    public b(Context context, GrsBaseInfo grsBaseInfo) {
        a(context);
        Map<String, b> map = a;
        map.put(context.getPackageName() + grsBaseInfo.uniqueCode(), this);
    }

    public static b a(String str, GrsBaseInfo grsBaseInfo) {
        Map<String, b> map = a;
        return map.get(str + grsBaseInfo.uniqueCode());
    }

    public a a() {
        return this.b.a();
    }

    public String a(GrsBaseInfo grsBaseInfo, String str, String str2) {
        return this.b.a(grsBaseInfo, str, str2);
    }

    public Map<String, String> a(GrsBaseInfo grsBaseInfo, String str) {
        return this.b.a(grsBaseInfo, str);
    }

    public void a(Context context) {
        d dVar = new d(context);
        this.b = dVar;
        if (!dVar.b()) {
            this.b = new c(context);
        }
    }

    public void a(GrsBaseInfo grsBaseInfo) {
        this.b.a(grsBaseInfo);
    }
}
