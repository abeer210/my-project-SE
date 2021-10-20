package com.huawei.updatesdk.b.a.a;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.huawei.updatesdk.a.a.c.d;
import com.huawei.updatesdk.b.b.a;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class b {
    private static b b;
    private final Map<String, a> a = new HashMap();

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (b == null) {
                b = new b();
            }
            bVar = b;
        }
        return bVar;
    }

    public String a(PackageInfo packageInfo) {
        if (packageInfo == null || packageInfo.packageName == null || TextUtils.isEmpty(packageInfo.applicationInfo.sourceDir)) {
            return null;
        }
        a aVar = this.a.get(packageInfo.packageName);
        if (aVar != null && aVar.b() == packageInfo.lastUpdateTime && aVar.c() == packageInfo.versionCode) {
            return aVar.a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(packageInfo.lastUpdateTime);
        sb.append(packageInfo.versionCode);
        sb.append(packageInfo.packageName);
        String str = C0201.m82(8264) + packageInfo.packageName;
        String str2 = C0201.m82(8265) + packageInfo.packageName;
        boolean z = !TextUtils.equals(sb.toString(), a.c().c(str));
        if (z) {
            a.c().a(str, sb.toString());
        }
        String c = a.c().c(str2);
        if (TextUtils.isEmpty(c) || z) {
            c = d.a(packageInfo.applicationInfo.sourceDir, C0201.m82(8266));
            a.c().a(str2, c);
        }
        a aVar2 = new a();
        aVar2.a(c);
        aVar2.a(packageInfo.lastUpdateTime);
        aVar2.a(packageInfo.versionCode);
        this.a.put(packageInfo.packageName, aVar2);
        return c;
    }
}
