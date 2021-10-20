package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: or  reason: default package */
/* compiled from: SequentialReader */
public abstract class or {
    private boolean a = true;

    public abstract int a();

    public abstract byte b() throws IOException;

    public abstract void c(byte[] bArr, int i, int i2) throws IOException;

    public abstract byte[] d(int i) throws IOException;

    public short e() throws IOException {
        int b;
        int b2;
        if (this.a) {
            b = (((short) b()) << 8) & -256;
            b2 = ((short) b()) & 255;
        } else {
            b = ((short) b()) & 255;
            b2 = (((short) b()) << 8) & -256;
        }
        return (short) (b | b2);
    }

    public int f() throws IOException {
        int b;
        int b2;
        if (this.a) {
            b = ((b() << 24) & -16777216) | ((b() << 16) & 16711680) | ((b() << 8) & 65280);
            b2 = b() & 255;
        } else {
            b = (b() & 255) | (65280 & (b() << 8)) | (16711680 & (b() << 16));
            b2 = -16777216 & (b() << 24);
        }
        return b | b2;
    }

    public long g() throws IOException {
        if (this.a) {
            return (-72057594037927936L & (((long) b()) << 56)) | (71776119061217280L & (((long) b()) << 48)) | ((((long) b()) << 40) & 280375465082880L) | ((((long) b()) << 32) & 1095216660480L) | ((((long) b()) << 24) & 4278190080L) | ((((long) b()) << 16) & 16711680) | ((((long) b()) << 8) & 65280) | (((long) b()) & 255);
        }
        return ((((long) b()) << 8) & 65280) | (((long) b()) & 255) | ((((long) b()) << 16) & 16711680) | ((((long) b()) << 24) & 4278190080L) | (1095216660480L & (((long) b()) << 32)) | (280375465082880L & (((long) b()) << 40)) | (71776119061217280L & (((long) b()) << 48)) | ((((long) b()) << 56) & -72057594037927936L);
    }

    public byte h() throws IOException {
        return b();
    }

    public byte[] i(int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            byte b = b();
            bArr[i2] = b;
            if (b == 0) {
                break;
            }
            i2++;
        }
        if (i2 == i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        if (i2 > 0) {
            System.arraycopy(bArr, 0, bArr2, 0, i2);
        }
        return bArr2;
    }

    public String j(int i, Charset charset) throws IOException {
        return k(i, charset).toString();
    }

    public yr k(int i, Charset charset) throws IOException {
        return new yr(i(i), charset);
    }

    public abstract long l() throws IOException;

    public String m(int i) throws IOException {
        return new String(d(i));
    }

    public String n(int i, Charset charset) throws IOException {
        return new String(d(i), charset);
    }

    public yr o(int i, Charset charset) throws IOException {
        return new yr(d(i), charset);
    }

    public int p() throws IOException {
        int b;
        int b2;
        if (this.a) {
            b = (b() << 8) & 65280;
            b2 = b() & 255;
        } else {
            b = b() & 255;
            b2 = 65280 & (b() << 8);
        }
        return b | b2;
    }

    public long q() throws IOException {
        if (this.a) {
            return (4278190080L & (((long) b()) << 24)) | (16711680 & (((long) b()) << 16)) | ((((long) b()) << 8) & 65280) | (((long) b()) & 255);
        }
        long b = 255 & ((long) b());
        long b2 = 16711680 & (((long) b()) << 16);
        return (4278190080L & (((long) b()) << 24)) | b2 | (65280 & (((long) b()) << 8)) | b;
    }

    public short r() throws IOException {
        return (short) (b() & 255);
    }

    public void s(boolean z) {
        this.a = z;
    }

    public abstract void t(long j) throws IOException;

    public abstract boolean u(long j) throws IOException;
}
