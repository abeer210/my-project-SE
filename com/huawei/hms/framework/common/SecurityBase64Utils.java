package com.huawei.hms.framework.common;

import android.util.Base64;
import com.huawei.secure.android.common.util.SafeBase64;
import vigqyno.C0201;

public class SecurityBase64Utils {
    private static boolean IS_AEGIS_BASE64_LIBRARY_LOADED;
    private static final String SAFE_BASE64_PATH = null;

    static {
        C0201.m83(SecurityBase64Utils.class, 612);
    }

    private static boolean checkCompatible(String str) {
        ClassLoader classLoader = SecurityBase64Utils.class.getClassLoader();
        if (classLoader == null) {
            return false;
        }
        try {
            classLoader.loadClass(str);
            synchronized (StringUtils.class) {
                IS_AEGIS_BASE64_LIBRARY_LOADED = true;
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static byte[] decode(String str, int i) {
        if (IS_AEGIS_BASE64_LIBRARY_LOADED || checkCompatible(C0201.m82(10667))) {
            return SafeBase64.decode(str, i);
        }
        try {
            return Base64.decode(str, i);
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public static String encodeToString(byte[] bArr, int i) {
        if (IS_AEGIS_BASE64_LIBRARY_LOADED || checkCompatible(C0201.m82(10668))) {
            return SafeBase64.encodeToString(bArr, i);
        }
        try {
            return Base64.encodeToString(bArr, i);
        } catch (Exception unused) {
            return null;
        }
    }
}
