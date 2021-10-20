package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import vigqyno.C0201;

/* renamed from: ac2  reason: default package */
public final class ac2 {
    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return C0201.m82(5221);
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static byte[] b(String str) {
        String r0 = C0201.m82(5222);
        String r1 = C0201.m82(5223);
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        try {
            byte[] bytes = upperCase.getBytes(r1);
            for (int i = 0; i < length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(r0);
                int i2 = i * 2;
                sb.append(new String(new byte[]{bytes[i2]}, r1));
                bArr[i] = (byte) (((byte) (Byte.decode(sb.toString()).byteValue() << 4)) ^ Byte.decode(r0 + new String(new byte[]{bytes[i2 + 1]}, r1)).byteValue());
            }
        } catch (UnsupportedEncodingException | NumberFormatException e) {
            bc2.b(C0201.m82(5225), C0201.m82(5224) + e.getMessage());
        }
        return bArr;
    }
}
