package com.huawei.updatesdk.a.a.c;

import android.text.TextUtils;
import com.huawei.updatesdk.a.a.b.a.a.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.IllegalFormatException;
import java.util.Locale;
import vigqyno.C0201;

public abstract class g {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URLEncoder.encode(str, C0201.m82(24721)).replace(C0201.m82(24722), C0201.m82(24723)).replace(C0201.m82(24724), C0201.m82(24725)).replace(C0201.m82(24726), C0201.m82(24727));
        } catch (UnsupportedEncodingException e) {
            a.a(C0201.m82(24728), C0201.m82(24729), e);
            return null;
        }
    }

    public static String a(byte[] bArr) {
        String str;
        String r0 = C0201.m82(24730);
        try {
            MessageDigest instance = MessageDigest.getInstance(C0201.m82(24731));
            instance.update(bArr);
            StringBuilder sb = new StringBuilder(256);
            byte[] digest = instance.digest();
            for (byte b : digest) {
                sb.append(String.format(Locale.ENGLISH, C0201.m82(24732), Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            str = C0201.m82(24735);
            a.b(r0, str);
            return null;
        } catch (IllegalFormatException unused2) {
            str = C0201.m82(24734);
            a.b(r0, str);
            return null;
        } catch (Exception unused3) {
            str = C0201.m82(24733);
            a.b(r0, str);
            return null;
        }
    }

    public static String b(String str) {
        String e = e(str);
        if (e == null) {
            return null;
        }
        return e.toLowerCase(Locale.getDefault());
    }

    public static byte[] c(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int digit = Character.digit(charArray[i2 + 1], 16) | (Character.digit(charArray[i2], 16) << 4);
            if (digit > 127) {
                digit -= 256;
            }
            bArr[i] = Byte.valueOf(String.valueOf(digit)).byteValue();
        }
        return bArr;
    }

    public static boolean d(String str) {
        return str != null && str.trim().startsWith(C0201.m82(24736)) && str.trim().endsWith(C0201.m82(24737));
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return a(str.getBytes(C0201.m82(24738)));
        } catch (UnsupportedEncodingException unused) {
            a.b(C0201.m82(24739), C0201.m82(24740));
            return null;
        }
    }
}
