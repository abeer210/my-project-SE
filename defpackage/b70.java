package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: b70  reason: default package */
/* compiled from: TailAppendingInputStream */
public class b70 extends FilterInputStream {
    private final byte[] a;
    private int b;
    private int c;

    public b70(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        if (inputStream == null) {
            throw null;
        } else if (bArr != null) {
            this.a = bArr;
        } else {
            throw null;
        }
    }

    private int a() {
        int i = this.b;
        byte[] bArr = this.a;
        if (i >= bArr.length) {
            return -1;
        }
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i);
            this.c = this.b;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            return read;
        }
        return a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.reset();
            this.b = this.c;
            return;
        }
        throw new IOException(C0201.m82(19880));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i3 < i2) {
            int a2 = a();
            if (a2 == -1) {
                break;
            }
            bArr[i + i3] = (byte) a2;
            i3++;
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }
}
