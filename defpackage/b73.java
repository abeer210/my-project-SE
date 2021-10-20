package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import vigqyno.C0201;

/* renamed from: b73  reason: default package */
/* compiled from: CipherInputStream */
public class b73 extends FilterInputStream {
    private final Cipher a;
    private final byte[] b = new byte[512];
    private boolean c = false;
    private byte[] d;
    private int e;
    private int f;

    public b73(InputStream inputStream, Cipher cipher) {
        super(inputStream);
        this.a = cipher;
    }

    private byte[] a() throws y63 {
        try {
            this.c = true;
            return this.a.doFinal();
        } catch (GeneralSecurityException e2) {
            throw new y63(C0201.m82(20133), e2);
        }
    }

    private int c() throws IOException {
        if (this.c) {
            return -1;
        }
        this.f = 0;
        this.e = 0;
        while (true) {
            int i = this.e;
            if (i != 0) {
                return i;
            }
            int read = ((FilterInputStream) this).in.read(this.b);
            if (read == -1) {
                byte[] a2 = a();
                this.d = a2;
                if (a2 == null || a2.length == 0) {
                    return -1;
                }
                int length = a2.length;
                this.e = length;
                return length;
            }
            byte[] update = this.a.update(this.b, 0, read);
            this.d = update;
            if (update != null) {
                this.e = update.length;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return this.e - this.f;
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        try {
            ((FilterInputStream) this).in.close();
            this.f = 0;
            this.e = 0;
        } finally {
            if (!this.c) {
                a();
            }
        }
    }

    public void mark(int i) {
    }

    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f >= this.e && c() < 0) {
            return -1;
        }
        byte[] bArr = this.d;
        int i = this.f;
        this.f = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0;
        }
        int min = (int) Math.min(j, (long) available());
        this.f += min;
        return (long) min;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f >= this.e && c() < 0) {
            return -1;
        }
        int min = Math.min(i2, available());
        System.arraycopy(this.d, this.f, bArr, i, min);
        this.f += min;
        return min;
    }
}
