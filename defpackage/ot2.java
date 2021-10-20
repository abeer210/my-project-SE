package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import vigqyno.C0201;

/* renamed from: ot2  reason: default package */
/* compiled from: RC4Cipher */
public class ot2 {
    private final int[] a = new int[256];
    private int b;
    private int c;

    private static int a(byte b2) {
        return b2 < 0 ? b2 + 256 : b2;
    }

    private static void c(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    public void b(byte[] bArr) {
        this.b = 0;
        this.c = 0;
        if (bArr.length < 1 || bArr.length > 32) {
            throw new IllegalArgumentException(C0201.m82(28599));
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = i;
            i++;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.a.length; i4++) {
            int a2 = a(bArr[i2]);
            int[] iArr2 = this.a;
            i3 = ((a2 + iArr2[i4]) + i3) % 256;
            c(iArr2, i4, i3);
            i2 = (i2 + 1) % bArr.length;
        }
    }

    public void d(byte b2, OutputStream outputStream) throws IOException {
        int i = (this.b + 1) % 256;
        this.b = i;
        int[] iArr = this.a;
        int i2 = (iArr[i] + this.c) % 256;
        this.c = i2;
        c(iArr, i, i2);
        int[] iArr2 = this.a;
        outputStream.write(b2 ^ ((byte) iArr2[(iArr2[this.b] + iArr2[this.c]) % 256]));
    }

    public void e(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                f(bArr, 0, read, outputStream);
            } else {
                return;
            }
        }
    }

    public void f(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        for (int i3 = i; i3 < i + i2; i3++) {
            d(bArr[i3], outputStream);
        }
    }

    public void g(byte[] bArr, OutputStream outputStream) throws IOException {
        for (byte b2 : bArr) {
            d(b2, outputStream);
        }
    }
}
