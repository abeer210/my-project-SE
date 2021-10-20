package defpackage;

import java.io.UnsupportedEncodingException;
import vigqyno.C0201;

/* renamed from: qb0  reason: default package */
/* compiled from: ImageFormatCheckerUtils */
public class qb0 {
    public static byte[] a(String str) {
        z50.g(str);
        try {
            return str.getBytes(C0201.m82(6334));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(C0201.m82(6335), e);
        }
    }

    public static int b(byte[] bArr, int i, byte[] bArr2, int i2) {
        z50.g(bArr);
        z50.g(bArr2);
        if (i2 > i) {
            return -1;
        }
        int i3 = 0;
        byte b = bArr2[0];
        int i4 = i - i2;
        while (i3 <= i4) {
            int i5 = 1;
            if (bArr[i3] != b) {
                do {
                    i3++;
                    if (i3 > i4) {
                        break;
                    }
                } while (bArr[i3] != b);
            }
            if (i3 <= i4) {
                int i6 = i3 + 1;
                int i7 = (i6 + i2) - 1;
                while (i6 < i7 && bArr[i6] == bArr2[i5]) {
                    i6++;
                    i5++;
                }
                if (i6 == i7) {
                    return i3;
                }
            }
            i3++;
        }
        return -1;
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        z50.g(bArr);
        z50.g(bArr2);
        if (bArr2.length > bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
