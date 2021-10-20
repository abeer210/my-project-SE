package com.huawei.hms.framework.common;

import android.text.TextUtils;
import com.huawei.secure.android.common.util.SafeString;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import vigqyno.C0201;

public class StringUtils {
    private static final int INIT_CAPACITY = 0;
    private static boolean IS_AEGIS_STRING_LIBRARY_LOADED;
    private static final String SAFE_STRING_PATH = null;
    private static final String TAG = null;

    static {
        C0201.m83(StringUtils.class, 503);
    }

    public static String anonymizeMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 != 0) {
                charArray[i] = '*';
            }
        }
        return new String(charArray);
    }

    public static String byte2Str(byte[] bArr) {
        String r0 = C0201.m82(15660);
        if (bArr == null) {
            return r0;
        }
        try {
            return new String(bArr, C0201.m82(15661));
        } catch (UnsupportedEncodingException e) {
            Logger.w(C0201.m82(15662), e);
            return r0;
        }
    }

    private static boolean checkCompatible(String str) {
        ClassLoader classLoader = SecurityBase64Utils.class.getClassLoader();
        if (classLoader == null) {
            return false;
        }
        try {
            classLoader.loadClass(str);
            synchronized (StringUtils.class) {
                IS_AEGIS_STRING_LIBRARY_LOADED = true;
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static String format(String str, Object... objArr) {
        return str == null ? C0201.m82(15663) : String.format(Locale.ROOT, str, objArr);
    }

    public static byte[] getBytes(long j) {
        return getBytes(String.valueOf(j));
    }

    public static byte[] getBytes(String str) {
        byte[] bArr = new byte[0];
        if (str == null) {
            return bArr;
        }
        try {
            return str.getBytes(C0201.m82(15664));
        } catch (UnsupportedEncodingException unused) {
            Logger.w(C0201.m82(15665), C0201.m82(15666));
            return bArr;
        }
    }

    public static String getTraceInfo(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder(1024);
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(C0201.m82(15667));
            sb.append(stackTraceElement.toString());
            sb.append(C0201.m82(15668));
        }
        return sb.toString();
    }

    public static String replace(String str, CharSequence charSequence, CharSequence charSequence2) {
        if (IS_AEGIS_STRING_LIBRARY_LOADED || checkCompatible(C0201.m82(15669))) {
            return SafeString.replace(str, charSequence, charSequence2);
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(charSequence)) {
            return str;
        }
        try {
            return str.replace(charSequence, charSequence2);
        } catch (Exception unused) {
            return str;
        }
    }

    public static byte[] str2Byte(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            return str.getBytes(C0201.m82(15670));
        } catch (UnsupportedEncodingException e) {
            Logger.w(C0201.m82(15671), e);
            return new byte[0];
        }
    }

    public static boolean strEquals(String str, String str2) {
        return str == str2 || (str != null && str.equals(str2));
    }

    public static int stringToInteger(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            Logger.w(C0201.m82(15672), C0201.m82(15673), e);
            return i;
        }
    }

    public static long stringToLong(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            Logger.w(C0201.m82(15674), C0201.m82(15675), e);
            return j;
        }
    }

    public static String substring(String str, int i) {
        if (checkCompatible(C0201.m82(15676))) {
            return SafeString.substring(str, i);
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        String r1 = C0201.m82(15677);
        if (!isEmpty && str.length() >= i && i >= 0) {
            try {
                return str.substring(i);
            } catch (Exception unused) {
            }
        }
        return r1;
    }

    public static String substring(String str, int i, int i2) {
        if (IS_AEGIS_STRING_LIBRARY_LOADED || checkCompatible(C0201.m82(15678))) {
            return SafeString.substring(str, i, i2);
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        String r1 = C0201.m82(15679);
        if (!isEmpty && i >= 0 && i2 <= str.length() && i2 >= i) {
            try {
                return str.substring(i, i2);
            } catch (Exception unused) {
            }
        }
        return r1;
    }

    public static String toLowerCase(String str) {
        return str == null ? str : str.toLowerCase(Locale.ROOT);
    }
}
