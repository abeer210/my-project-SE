package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ug  reason: default package */
/* compiled from: BufferedOutputStream */
public final class ug extends OutputStream {
    private final OutputStream a;
    private byte[] b;
    private ni c;
    private int d;

    public ug(OutputStream outputStream, ni niVar) {
        this(outputStream, niVar, 65536);
    }

    private void a() throws IOException {
        int i = this.d;
        if (i > 0) {
            this.a.write(this.b, 0, i);
            this.d = 0;
        }
    }

    private void c() throws IOException {
        if (this.d == this.b.length) {
            a();
        }
    }

    private void h() {
        byte[] bArr = this.b;
        if (bArr != null) {
            this.c.c(bArr);
            this.b = null;
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.a.close();
            h();
        } catch (Throwable th) {
            this.a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.b;
        int i2 = this.d;
        this.d = i2 + 1;
        bArr[i2] = (byte) i;
        c();
    }

    public ug(OutputStream outputStream, ni niVar, int i) {
        this.a = outputStream;
        this.c = niVar;
        this.b = (byte[]) niVar.e(i, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            if (this.d != 0 || i4 < this.b.length) {
                int min = Math.min(i4, this.b.length - this.d);
                System.arraycopy(bArr, i5, this.b, this.d, min);
                this.d += min;
                i3 += min;
                c();
            } else {
                this.a.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
