package com.huawei.updatesdk.b.a.b;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.ArrayMap;
import android.util.ArraySet;
import com.huawei.updatesdk.a.a.c.g;
import com.huawei.updatesdk.b.a.b.a;
import com.huawei.updatesdk.b.a.b.c;
import java.io.File;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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

    private static void a(a aVar) {
        a().a.put(aVar.c(), aVar);
    }

    private static ArrayList<String> b(PackageInfo packageInfo) {
        ArraySet<String> arraySet;
        a aVar = new a();
        aVar.a(packageInfo.packageName);
        File file = new File(packageInfo.applicationInfo.sourceDir);
        if (!file.exists()) {
            return null;
        }
        aVar.a(file.lastModified());
        c.a a2 = c.a(file);
        ArrayMap<String, ArraySet<PublicKey>> arrayMap = a2.a;
        if (arrayMap == null || arrayMap.isEmpty() || (arraySet = a2.b) == null || arraySet.isEmpty()) {
            a(aVar);
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<String, ArraySet<PublicKey>> entry : a2.a.entrySet()) {
            if (a2.b.contains(entry.getKey())) {
                Iterator<PublicKey> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(g.a(it.next().getEncoded()));
                }
            }
        }
        a.C0113a aVar2 = new a.C0113a();
        aVar2.a(arrayList);
        aVar.a(aVar2);
        a(aVar);
        return arrayList;
    }

    public List<String> a(PackageInfo packageInfo) {
        String str;
        if (Build.VERSION.SDK_INT < 21 || packageInfo == null || (str = packageInfo.applicationInfo.sourceDir) == null) {
            return null;
        }
        long lastModified = new File(str).lastModified();
        a aVar = a().a.get(packageInfo.packageName);
        if (aVar == null || aVar.b() != lastModified) {
            return b(packageInfo);
        }
        if (aVar.a() == null) {
            return null;
        }
        return aVar.a().a();
    }
}
