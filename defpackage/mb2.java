package defpackage;

import vigqyno.C0201;

/* renamed from: mb2  reason: default package */
public class mb2 {
    private static final char[] a = C0201.m82(34915).toCharArray();

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(a[(b >> 4) & 15]);
            sb.append(a[b & 15]);
        }
        return sb.toString();
    }

    public static byte[] b(String str) {
        return c(str.toCharArray());
    }

    private static byte[] c(char[] cArr) {
        if ((cArr.length & 1) == 0) {
            byte[] bArr = new byte[(cArr.length >> 1)];
            int i = 0;
            int i2 = 0;
            while (i < cArr.length) {
                int digit = Character.digit(cArr[i], 16);
                String r5 = C0201.m82(34916);
                if (digit != -1) {
                    int i3 = i + 1;
                    int digit2 = Character.digit(cArr[i3], 16);
                    if (digit2 != -1) {
                        i = i3 + 1;
                        bArr[i2] = (byte) (((digit << 4) | digit2) & 255);
                        i2++;
                    } else {
                        throw new IllegalArgumentException(r5 + i3);
                    }
                } else {
                    throw new IllegalArgumentException(r5 + i);
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException(C0201.m82(34917));
    }
}
