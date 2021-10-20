package com.huawei.hms.maps;

import android.content.Context;
import android.content.pm.PackageManager;
import vigqyno.C0201;

public final class mcq {
    public static String a(Context context) {
        String r0 = C0201.m82(30758);
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getApplicationContext().getPackageName(), 128).metaData.get(C0201.m82(30759));
            if (obj != null) {
                String valueOf = String.valueOf(obj);
                return valueOf.startsWith(C0201.m82(30760)) ? valueOf.substring(6) : valueOf;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return r0;
    }
}
