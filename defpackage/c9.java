package defpackage;

import java.io.UnsupportedEncodingException;
import vigqyno.C0201;

/* renamed from: c9  reason: default package */
public class c9 {
    public static z8 a(z8 z8Var) {
        if (!C0201.m82(4340).equals(z8Var.g())) {
            return z8Var;
        }
        byte[] bArr = new byte[8];
        z8 z8Var2 = new z8((z8Var.h() * 4) / 3);
        int i = 0;
        char c = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < z8Var.h()) {
            int d = z8Var.d(i);
            if (c == 11) {
                if (i2 <= 0 || (d & 192) != 128) {
                    z8Var2.b(b(bArr[0]));
                    i -= i3;
                } else {
                    int i4 = i3 + 1;
                    bArr[i3] = (byte) d;
                    i2--;
                    if (i2 == 0) {
                        z8Var2.c(bArr, 0, i4);
                    } else {
                        i3 = i4;
                    }
                }
                c = 0;
                i3 = 0;
            } else if (d < 127) {
                z8Var2.a((byte) d);
            } else if (d >= 192) {
                int i5 = d;
                i2 = -1;
                while (i2 < 8 && (i5 & 128) == 128) {
                    i2++;
                    i5 <<= 1;
                }
                bArr[i3] = (byte) d;
                i3++;
                c = 11;
            } else {
                z8Var2.b(b((byte) d));
            }
            i++;
        }
        if (c == 11) {
            for (int i6 = 0; i6 < i3; i6++) {
                z8Var2.b(b(bArr[i6]));
            }
        }
        return z8Var2;
    }

    private static byte[] b(byte b) {
        int i = b & 255;
        if (i >= 128) {
            if (i == 129 || i == 141 || i == 143 || i == 144 || i == 157) {
                return new byte[]{32};
            }
            try {
                return new String(new byte[]{b}, C0201.m82(4341)).getBytes(C0201.m82(4342));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new byte[]{b};
    }
}
