package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import vigqyno.C0201;

/* renamed from: rb3  reason: default package */
/* compiled from: HexEncoder */
public class rb3 implements ob3 {
    public final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public final byte[] b = new byte[128];

    public rb3() {
        d();
    }

    private static boolean c(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    @Override // defpackage.ob3
    public int a(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && c(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        int i2 = 0;
        while (i < length) {
            while (i < length && c(str.charAt(i))) {
                i++;
            }
            int i3 = i + 1;
            byte b2 = this.b[str.charAt(i)];
            while (i3 < length && c(str.charAt(i3))) {
                i3++;
            }
            int i4 = i3 + 1;
            byte b3 = this.b[str.charAt(i3)];
            if ((b2 | b3) >= 0) {
                outputStream.write((b2 << 4) | b3);
                i2++;
                i = i4;
            } else {
                throw new IOException(C0201.m82(3997));
            }
        }
        return i2;
    }

    @Override // defpackage.ob3
    public int b(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        for (int i3 = i; i3 < i + i2; i3++) {
            int i4 = bArr[i3] & 255;
            outputStream.write(this.a[i4 >>> 4]);
            outputStream.write(this.a[i4 & 15]);
        }
        return i2 * 2;
    }

    public void d() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.a;
            if (i < bArr2.length) {
                this.b[bArr2[i]] = (byte) i;
                i++;
            } else {
                byte[] bArr3 = this.b;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
        }
    }
}
