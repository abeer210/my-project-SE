package com.huawei.hms.support.hianalytics;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class HiAnalyticsBase {
    public static Map<String, String> getMapForBi(Context context, String str) {
        HashMap hashMap = new HashMap();
        if (context != null && !TextUtils.isEmpty(str)) {
            String[] split = str.split(C0201.m82(10248));
            if (split.length >= 2) {
                String str2 = split[0];
                String str3 = split[1];
                hashMap.put(C0201.m82(10249), str2);
                hashMap.put(C0201.m82(10250), str3);
                hashMap.put(C0201.m82(10251), context.getPackageName());
                hashMap.put(C0201.m82(10252), C0201.m82(10253));
                hashMap.put(C0201.m82(10254), String.valueOf(System.currentTimeMillis()));
            }
        }
        return hashMap;
    }
}
