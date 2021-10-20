package com.huawei.hms.framework.common;

import android.text.TextUtils;
import vigqyno.C0201;

public class SystemPropUtils {
    private static final String TAG = null;

    static {
        C0201.m83(SystemPropUtils.class, 537);
    }

    public static String getProperty(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            Logger.w(TAG, C0201.m82(29086));
            return str4;
        }
        try {
            Class<?> cls = Class.forName(str3);
            return (String) cls.getMethod(str, String.class, String.class).invoke(cls, str2, str4);
        } catch (Exception e) {
            Logger.e(TAG, C0201.m82(29085), e);
            return str4;
        }
    }
}
