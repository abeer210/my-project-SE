package defpackage;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: kr  reason: default package */
/* compiled from: RandomAccessReader */
public abstract class kr {
    private boolean a = true;

    public boolean a(int i) throws IOException {
        int i2 = i / 8;
        x(i2, 1);
        if (((b(i2) >> (i % 8)) & 1) == 1) {
            return true;
        }
        return false;
    }

    public abstract byte b(int i) throws IOException;

    public abstract byte[] c(int i, int i2) throws IOException;

    public double d(int i) throws IOException {
        return Double.longBitsToDouble(i(i));
    }

    public float e(int i) throws IOException {
        return Float.intBitsToFloat(h(i));
    }

    public short f(int i) throws IOException {
        int b;
        byte b2;
        x(i, 2);
        if (this.a) {
            b = (((short) b(i)) << 8) & -256;
            b2 = b(i + 1);
        } else {
            b = (((short) b(i + 1)) << 8) & -256;
            b2 = b(i);
        }
        return (short) ((((short) b2) & 255) | b);
    }

    public int g(int i) throws IOException {
        int b;
        byte b2;
        x(i, 3);
        if (this.a) {
            b = ((b(i) << 16) & 16711680) | (65280 & (b(i + 1) << 8));
            b2 = b(i + 2);
        } else {
            b = ((b(i + 2) << 16) & 16711680) | (65280 & (b(i + 1) << 8));
            b2 = b(i);
        }
        return (b2 & 255) | b;
    }

    public int h(int i) throws IOException {
        int b;
        byte b2;
        x(i, 4);
        if (this.a) {
            b = ((b(i) << 24) & -16777216) | (16711680 & (b(i + 1) << 16)) | (65280 & (b(i + 2) << 8));
            b2 = b(i + 3);
        } else {
            b = ((b(i + 3) << 24) & -16777216) | (16711680 & (b(i + 2) << 16)) | (65280 & (b(i + 1) << 8));
            b2 = b(i);
        }
        return (b2 & 255) | b;
    }

    public long i(int i) throws IOException {
        long b;
        byte b2;
        x(i, 8);
        if (this.a) {
            b = ((((long) b(i)) << 56) & -72057594037927936L) | ((((long) b(i + 1)) << 48) & 71776119061217280L) | ((((long) b(i + 2)) << 40) & 280375465082880L) | ((((long) b(i + 3)) << 32) & 1095216660480L) | ((((long) b(i + 4)) << 24) & 4278190080L) | ((((long) b(i + 5)) << 16) & 16711680) | ((((long) b(i + 6)) << 8) & 65280);
            b2 = b(i + 7);
        } else {
            b = ((((long) b(i + 7)) << 56) & -72057594037927936L) | ((((long) b(i + 6)) << 48) & 71776119061217280L) | ((((long) b(i + 5)) << 40) & 280375465082880L) | ((((long) b(i + 4)) << 32) & 1095216660480L) | ((((long) b(i + 3)) << 24) & 4278190080L) | ((((long) b(i + 2)) << 16) & 16711680) | ((((long) b(i + 1)) << 8) & 65280);
            b2 = b(i);
        }
        return (((long) b2) & 255) | b;
    }

    public byte j(int i) throws IOException {
        x(i, 1);
        return b(i);
    }

    public abstract long k() throws IOException;

    public byte[] l(int i, int i2) throws IOException {
        byte[] c = c(i, i2);
        int i3 = 0;
        while (i3 < c.length && c[i3] != 0) {
            i3++;
        }
        if (i3 == i2) {
            return c;
        }
        byte[] bArr = new byte[i3];
        if (i3 > 0) {
            System.arraycopy(c, 0, bArr, 0, i3);
        }
        return bArr;
    }

    public String m(int i, int i2, Charset charset) throws IOException {
        return new String(l(i, i2), charset.name());
    }

    public yr n(int i, int i2, Charset charset) throws IOException {
        return new yr(l(i, i2), charset);
    }

    public float o(int i) throws IOException {
        double b;
        double d;
        x(i, 4);
        if (this.a) {
            int b2 = (b(i + 3) & 255) | ((b(i + 2) & 255) << 8);
            b = (double) ((float) (((b(i) & 255) << 8) | (b(i + 1) & 255)));
            double d2 = (double) b2;
            Double.isNaN(d2);
            d = d2 / 65536.0d;
            Double.isNaN(b);
        } else {
            int b3 = (b(i) & 255) | ((b(i + 1) & 255) << 8);
            b = (double) ((float) (((b(i + 3) & 255) << 8) | (b(i + 2) & 255)));
            double d3 = (double) b3;
            Double.isNaN(d3);
            d = d3 / 65536.0d;
            Double.isNaN(b);
        }
        return (float) (b + d);
    }

    public String p(int i, int i2, String str) throws IOException {
        byte[] c = c(i, i2);
        try {
            return new String(c, str);
        } catch (UnsupportedEncodingException unused) {
            return new String(c);
        }
    }

    public String q(int i, int i2, Charset charset) throws IOException {
        return new String(c(i, i2), charset.name());
    }

    public yr r(int i, int i2, Charset charset) throws IOException {
        return new yr(c(i, i2), charset);
    }

    public int s(int i) throws IOException {
        int b;
        byte b2;
        x(i, 2);
        if (this.a) {
            b = (b(i) << 8) & 65280;
            b2 = b(i + 1);
        } else {
            b = (b(i + 1) << 8) & 65280;
            b2 = b(i);
        }
        return (b2 & 255) | b;
    }

    public long t(int i) throws IOException {
        long b;
        byte b2;
        x(i, 4);
        if (this.a) {
            long b3 = 4278190080L & (((long) b(i)) << 24);
            b = (65280 & (((long) b(i + 2)) << 8)) | (16711680 & (((long) b(i + 1)) << 16)) | b3;
            b2 = b(i + 3);
        } else {
            long b4 = 4278190080L & (((long) b(i + 3)) << 24);
            b = (65280 & (((long) b(i + 1)) << 8)) | (16711680 & (((long) b(i + 2)) << 16)) | b4;
            b2 = b(i);
        }
        return (255 & ((long) b2)) | b;
    }

    public short u(int i) throws IOException {
        x(i, 1);
        return (short) (b(i) & 255);
    }

    public boolean v() {
        return this.a;
    }

    public void w(boolean z) {
        this.a = z;
    }

    public abstract void x(int i, int i2) throws IOException;
}
