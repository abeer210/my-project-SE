package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: z8  reason: default package */
public class z8 {
    private byte[] a;
    private int b;
    private String c;

    public z8(int i) {
        this.c = null;
        this.a = new byte[i];
        this.b = 0;
    }

    public z8(InputStream inputStream) throws IOException {
        this.c = null;
        this.b = 0;
        this.a = new byte[16384];
        while (true) {
            int read = inputStream.read(this.a, this.b, 16384);
            if (read > 0) {
                int i = this.b + read;
                this.b = i;
                if (read == 16384) {
                    e(i + 16384);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public z8(byte[] bArr) {
        this.c = null;
        this.a = bArr;
        this.b = bArr.length;
    }

    public z8(byte[] bArr, int i, int i2) {
        this.c = null;
        if (i2 <= bArr.length - i) {
            byte[] bArr2 = new byte[i2];
            this.a = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, i2);
            this.b = i2;
            return;
        }
        throw new ArrayIndexOutOfBoundsException(C0201.m82(18251));
    }

    private void e(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            byte[] bArr2 = new byte[(bArr.length * 2)];
            this.a = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
    }

    public void a(byte b2) {
        e(this.b + 1);
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        bArr[i] = b2;
    }

    public void b(byte[] bArr) {
        c(bArr, 0, bArr.length);
    }

    public void c(byte[] bArr, int i, int i2) {
        e(this.b + i2);
        System.arraycopy(bArr, i, this.a, this.b, i2);
        this.b += i2;
    }

    public int d(int i) {
        if (i < this.b) {
            return this.a[i] & 255;
        }
        throw new IndexOutOfBoundsException(C0201.m82(18252));
    }

    public InputStream f() {
        return new ByteArrayInputStream(this.a, 0, this.b);
    }

    public String g() {
        String r0;
        if (this.c == null) {
            int i = this.b;
            String r1 = C0201.m82(18253);
            if (i >= 2) {
                byte[] bArr = this.a;
                byte b2 = bArr[0];
                String r6 = C0201.m82(18254);
                if (b2 == 0) {
                    if (i < 4 || bArr[1] != 0) {
                        r0 = C0201.m82(18256);
                        this.c = r0;
                    } else if ((bArr[2] & 255) == 254 && (bArr[3] & 255) == 255) {
                        r0 = C0201.m82(18255);
                        this.c = r0;
                    }
                } else if ((bArr[0] & 255) < 128) {
                    if (bArr[1] == 0) {
                        r0 = (i < 4 || bArr[2] != 0) ? C0201.m82(18258) : C0201.m82(18257);
                        this.c = r0;
                    }
                } else if ((bArr[0] & 255) != 239) {
                    int i2 = bArr[0] & 255;
                    String r4 = C0201.m82(18259);
                    if (i2 == 254 || i < 4 || bArr[2] != 0) {
                        this.c = r4;
                    }
                }
                this.c = r6;
            }
            this.c = r1;
        }
        return this.c;
    }

    public int h() {
        return this.b;
    }
}
