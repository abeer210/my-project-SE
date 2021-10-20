package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: pr  reason: default package */
/* compiled from: StreamReader */
public class pr extends or {
    private final InputStream b;
    private long c;

    public pr(InputStream inputStream) {
        if (inputStream != null) {
            this.b = inputStream;
            this.c = 0;
            return;
        }
        throw null;
    }

    private long v(long j) throws IOException {
        long j2 = 0;
        while (j2 != j) {
            long skip = this.b.skip(j - j2);
            j2 += skip;
            if (skip == 0) {
                break;
            }
        }
        this.c += j2;
        return j2;
    }

    @Override // defpackage.or
    public int a() {
        try {
            return this.b.available();
        } catch (IOException unused) {
            return 0;
        }
    }

    @Override // defpackage.or
    public byte b() throws IOException {
        int read = this.b.read();
        if (read != -1) {
            this.c++;
            return (byte) read;
        }
        throw new EOFException(C0201.m82(37752));
    }

    @Override // defpackage.or
    public void c(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 != i2) {
            int read = this.b.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                i3 += read;
            } else {
                throw new EOFException(C0201.m82(37753));
            }
        }
        this.c += (long) i3;
    }

    @Override // defpackage.or
    public byte[] d(int i) throws IOException {
        byte[] bArr = new byte[i];
        c(bArr, 0, i);
        return bArr;
    }

    @Override // defpackage.or
    public long l() {
        return this.c;
    }

    @Override // defpackage.or
    public void t(long j) throws IOException {
        if (j >= 0) {
            long v = v(j);
            if (v != j) {
                throw new EOFException(String.format(C0201.m82(37754), Long.valueOf(j), Long.valueOf(v)));
            }
            return;
        }
        throw new IllegalArgumentException(C0201.m82(37755));
    }

    @Override // defpackage.or
    public boolean u(long j) throws IOException {
        if (j >= 0) {
            return v(j) == j;
        }
        throw new IllegalArgumentException(C0201.m82(37756));
    }
}
