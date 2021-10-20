package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import vigqyno.C0201;

/* renamed from: s03  reason: default package */
/* compiled from: ASN1OutputStream */
public class s03 {
    private OutputStream a;

    /* renamed from: s03$a */
    /* compiled from: ASN1OutputStream */
    private class a extends s03 {
        private boolean b = true;

        public a(s03 s03, OutputStream outputStream) {
            super(outputStream);
        }

        @Override // defpackage.s03
        public void c(int i) throws IOException {
            if (this.b) {
                this.b = false;
            } else {
                s03.super.c(i);
            }
        }
    }

    public s03(OutputStream outputStream) {
        this.a = outputStream;
    }

    public s03 a() {
        return new c23(this.a);
    }

    public s03 b() {
        return new p23(this.a);
    }

    public void c(int i) throws IOException {
        this.a.write(i);
    }

    public void d(byte[] bArr) throws IOException {
        this.a.write(bArr);
    }

    public void e(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }

    public void f(int i, int i2, byte[] bArr) throws IOException {
        k(i, i2);
        i(bArr.length);
        d(bArr);
    }

    public void g(int i, byte[] bArr) throws IOException {
        c(i);
        i(bArr.length);
        d(bArr);
    }

    public void h(u03 u03) throws IOException {
        if (u03 != null) {
            u03.i(new a(this, this.a));
            return;
        }
        throw new IOException(C0201.m82(39076));
    }

    public void i(int i) throws IOException {
        if (i > 127) {
            int i2 = i;
            int i3 = 1;
            while (true) {
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3++;
            }
            c((byte) (i3 | 128));
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                c((byte) (i >> i4));
            }
            return;
        }
        c((byte) i);
    }

    public void j(g03 g03) throws IOException {
        if (g03 != null) {
            g03.b().i(this);
            return;
        }
        throw new IOException(C0201.m82(39077));
    }

    public void k(int i, int i2) throws IOException {
        if (i2 < 31) {
            c(i | i2);
            return;
        }
        c(i | 31);
        if (i2 < 128) {
            c(i2);
            return;
        }
        byte[] bArr = new byte[5];
        int i3 = 4;
        bArr[4] = (byte) (i2 & 127);
        do {
            i2 >>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        } while (i2 > 127);
        e(bArr, i3, 5 - i3);
    }
}
