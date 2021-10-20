package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteOrder;
import vigqyno.C0201;

/* renamed from: pq2  reason: default package */
/* compiled from: ImageInputStreamImpl */
public abstract class pq2 implements DataInput {
    public ByteOrder a = ByteOrder.BIG_ENDIAN;
    public long b = 0;
    public long c = 0;
    public int d = 0;
    private boolean e = false;
    private final byte[] f = new byte[8];

    public final void a() throws IOException {
        if (this.e) {
            throw new IOException(C0201.m82(13829));
        }
    }

    public void b() throws IOException {
        a();
        this.e = true;
    }

    public ByteOrder c() {
        return this.a;
    }

    public long d() {
        return this.c;
    }

    public long e() throws IOException {
        a();
        return this.b;
    }

    public abstract int f() throws IOException;

    @Override // java.lang.Object
    public void finalize() throws Throwable {
        if (!this.e) {
            try {
                b();
            } finally {
                super.finalize();
            }
        }
    }

    public abstract int g(byte[] bArr, int i, int i2) throws IOException;

    public int h() throws IOException {
        a();
        int i = this.d;
        int f2 = f();
        if (f2 != -1) {
            int i2 = (i + 1) & 7;
            if (i2 != 0) {
                f2 >>= 8 - i2;
                j(e() - 1);
            }
            this.d = i2;
            return f2 & 1;
        }
        throw new EOFException();
    }

    public long i(int i) throws IOException {
        a();
        if (i < 0 || i > 64) {
            throw new IllegalArgumentException();
        }
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 1) | ((long) h());
        }
        return j;
    }

    public void j(long j) throws IOException {
        a();
        if (j >= d()) {
            this.d = 0;
            this.b = j;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(13830));
    }

    public void k(ByteOrder byteOrder) {
        this.a = byteOrder;
    }

    public long l(long j) throws IOException {
        j(e() + j);
        return j;
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws IOException {
        int f2 = f();
        if (f2 >= 0) {
            return f2 != 0;
        }
        throw new EOFException(C0201.m82(13831));
    }

    @Override // java.io.DataInput
    public byte readByte() throws IOException {
        int f2 = f();
        if (f2 >= 0) {
            return (byte) f2;
        }
        throw new EOFException(C0201.m82(13832));
    }

    @Override // java.io.DataInput
    public char readChar() throws IOException {
        return (char) readShort();
    }

    @Override // java.io.DataInput
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        while (i2 > 0) {
            int g = g(bArr, i, i2);
            if (g != -1) {
                i += g;
                i2 -= g;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // java.io.DataInput
    public int readInt() throws IOException {
        if (g(this.f, 0, 4) < 0) {
            throw new EOFException();
        } else if (this.a == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f;
            return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
        } else {
            byte[] bArr2 = this.f;
            return (bArr2[0] & 255) | ((bArr2[3] & 255) << 24) | ((bArr2[2] & 255) << 16) | ((bArr2[1] & 255) << 8);
        }
    }

    @Override // java.io.DataInput
    public String readLine() throws IOException {
        StringBuilder sb = new StringBuilder(80);
        boolean z = true;
        while (true) {
            int f2 = f();
            if (f2 == -1) {
                break;
            }
            z = false;
            if (f2 == 10) {
                break;
            } else if (f2 == 13) {
                int f3 = f();
                if (f3 != 10 && f3 != -1) {
                    j(e() - 1);
                }
            } else {
                sb.append((char) f2);
            }
        }
        if (z) {
            return null;
        }
        return sb.toString();
    }

    @Override // java.io.DataInput
    public long readLong() throws IOException {
        if (g(this.f, 0, 8) < 0) {
            throw new EOFException();
        } else if (this.a == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f;
            int i = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            int i2 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16);
            return ((((long) i) & 4294967295L) << 32) | (((long) ((bArr[7] & 255) | ((bArr[6] & 255) << 8) | i2)) & 4294967295L);
        } else {
            byte[] bArr2 = this.f;
            int i3 = (bArr2[0] & 255) | ((bArr2[3] & 255) << 24) | ((bArr2[2] & 255) << 16) | ((bArr2[1] & 255) << 8);
            int i4 = (bArr2[5] & 255) << 8;
            int i5 = bArr2[4] & 255;
            return (((long) i3) & 4294967295L) | ((((long) (i5 | (i4 | (((bArr2[7] & 255) << 24) | ((bArr2[6] & 255) << 16))))) & 4294967295L) << 32);
        }
    }

    @Override // java.io.DataInput
    public short readShort() throws IOException {
        int i;
        if (g(this.f, 0, 2) >= 0) {
            if (this.a == ByteOrder.BIG_ENDIAN) {
                byte[] bArr = this.f;
                i = (bArr[1] & 255) | (bArr[0] << 8);
            } else {
                byte[] bArr2 = this.f;
                i = (bArr2[0] & 255) | (bArr2[1] << 8);
            }
            return (short) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public String readUTF() throws IOException {
        ByteOrder c2 = c();
        k(ByteOrder.BIG_ENDIAN);
        int readUnsignedShort = readUnsignedShort();
        char[] cArr = new char[readUnsignedShort];
        readFully(new byte[readUnsignedShort], 0, readUnsignedShort);
        k(c2);
        return new DataInputStream(new ByteArrayInputStream(this.f)).readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws IOException {
        int f2 = f();
        if (f2 >= 0) {
            return f2;
        }
        throw new EOFException(C0201.m82(13833));
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException {
        return readShort() & 65535;
    }

    @Override // java.io.DataInput
    public int skipBytes(int i) throws IOException {
        long j = (long) i;
        l(j);
        return (int) j;
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        readFully(bArr, 0, bArr.length);
    }
}
