package com.huawei.hms.framework.network.grs.d;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
import vigqyno.C0201;

public class b {
    private static final String a = null;
    private static final Pattern b = Pattern.compile(C0201.m82(27399));

    static {
        C0201.m83(b.class, 575);
    }

    public static String a(String str) {
        return a(str, C0201.m82(27400));
    }

    private static String a(String str, String str2) {
        String str3;
        String r4;
        try {
            try {
                return a(MessageDigest.getInstance(str2).digest(str.getBytes(C0201.m82(27401))));
            } catch (NoSuchAlgorithmException unused) {
                str3 = a;
                r4 = C0201.m82(27402);
                Logger.w(str3, r4);
                return null;
            }
        } catch (UnsupportedEncodingException unused2) {
            str3 = a;
            r4 = C0201.m82(27403);
            Logger.w(str3, r4);
            return null;
        }
    }

    private static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                stringBuffer.append(C0201.m82(27404));
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        String r1 = C0201.m82(27405);
        int i = 1;
        if (length == 1) {
            return r1;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < str.length(); i2++) {
            String str2 = str.charAt(i2) + C0201.m82(27406);
            if (b.matcher(str2).matches()) {
                if (i % 2 == 0) {
                    str2 = r1;
                }
                i++;
            }
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }
}
