package com.huawei.hms.common.util;

import android.util.Base64;
import com.huawei.hms.support.log.HMSLog;
import vigqyno.C0201;

public final class Base64Utils {
    private static final int FLAG_DEFAULT = 0;
    private static final int FLAG_URL = 0;
    private static final int FLAG_URL_NOPADDING = 0;
    private static final String TAG = null;

    static {
        C0201.m83(Base64Utils.class, 512);
    }

    public static byte[] decode(String str) {
        byte[] bArr = new byte[0];
        if (str != null) {
            try {
                return Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                HMSLog.e(C0201.m82(31138), C0201.m82(31137) + e.getMessage());
            }
        }
        return bArr;
    }

    public static byte[] decodeUrlSafe(String str) {
        byte[] bArr = new byte[0];
        if (str != null) {
            try {
                return Base64.decode(str, 10);
            } catch (IllegalArgumentException e) {
                HMSLog.e(C0201.m82(31140), C0201.m82(31139) + e.getMessage());
            }
        }
        return bArr;
    }

    public static byte[] decodeUrlSafeNoPadding(String str) {
        byte[] bArr = new byte[0];
        if (str != null) {
            try {
                return Base64.decode(str, 11);
            } catch (IllegalArgumentException e) {
                HMSLog.e(C0201.m82(31142), C0201.m82(31141) + e.getMessage());
            }
        }
        return bArr;
    }

    public static String encode(byte[] bArr) {
        if (bArr != null) {
            return Base64.encodeToString(bArr, 0);
        }
        return null;
    }

    public static String encodeUrlSafe(byte[] bArr) {
        if (bArr != null) {
            return Base64.encodeToString(bArr, 10);
        }
        return null;
    }

    public static String encodeUrlSafeNoPadding(byte[] bArr) {
        if (bArr != null) {
            return Base64.encodeToString(bArr, 11);
        }
        return null;
    }
}
