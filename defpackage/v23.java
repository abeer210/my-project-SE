package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: v23  reason: default package */
/* compiled from: IndefiniteLengthInputStream */
public class v23 extends y23 {
    private int c;
    private int d;
    private boolean e = false;
    private boolean f = true;

    public v23(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.c = inputStream.read();
        int read = inputStream.read();
        this.d = read;
        if (read >= 0) {
            h();
            return;
        }
        throw new EOFException();
    }

    private boolean h() {
        if (!this.e && this.f && this.c == 0 && this.d == 0) {
            this.e = true;
            c(true);
        }
        return this.e;
    }

    public void k(boolean z) {
        this.f = z;
        h();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.e) {
            return -1;
        }
        int read = this.a.read(bArr, i + 2, i2 - 2);
        if (read >= 0) {
            bArr[i] = (byte) this.c;
            bArr[i + 1] = (byte) this.d;
            this.c = this.a.read();
            int read2 = this.a.read();
            this.d = read2;
            if (read2 >= 0) {
                return read + 2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (h()) {
            return -1;
        }
        int read = this.a.read();
        if (read >= 0) {
            int i = this.c;
            this.c = this.d;
            this.d = read;
            return i;
        }
        throw new EOFException();
    }
}
