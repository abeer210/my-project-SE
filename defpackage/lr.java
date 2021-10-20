package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: lr  reason: default package */
/* compiled from: RandomAccessStreamReader */
public class lr extends kr {
    private final InputStream b;
    private final int c;
    private final ArrayList<byte[]> d;
    private boolean e;
    private long f;

    public lr(InputStream inputStream) {
        this(inputStream, 2048, -1);
    }

    @Override // defpackage.kr
    public byte b(int i) throws IOException {
        int i2 = this.c;
        int i3 = i / i2;
        return this.d.get(i3)[i % i2];
    }

    @Override // defpackage.kr
    public byte[] c(int i, int i2) throws IOException {
        x(i, i2);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i2 != 0) {
            int i4 = this.c;
            int i5 = i / i4;
            int i6 = i % i4;
            int min = Math.min(i2, i4 - i6);
            System.arraycopy(this.d.get(i5), i6, bArr, i3, min);
            i2 -= min;
            i += min;
            i3 += min;
        }
        return bArr;
    }

    @Override // defpackage.kr
    public long k() throws IOException {
        long j = this.f;
        if (j != -1) {
            return j;
        }
        y(C0188.f24, 1);
        return this.f;
    }

    @Override // defpackage.kr
    public void x(int i, int i2) throws IOException {
        if (i < 0) {
            throw new ar(String.format(C0201.m82(29454), Integer.valueOf(i)));
        } else if (i2 < 0) {
            throw new ar(C0201.m82(29453));
        } else if ((((long) i) + ((long) i2)) - 1 > 2147483647L) {
            throw new ar(String.format(C0201.m82(29452), Integer.valueOf(i), Integer.valueOf(i2)));
        } else if (!y(i, i2)) {
            throw new ar(i, i2, this.f);
        }
    }

    public boolean y(int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0) {
            return false;
        }
        long j = (((long) i) + ((long) i2)) - 1;
        if (j > 2147483647L) {
            return false;
        }
        int i4 = (int) j;
        if (!this.e) {
            int i5 = i4 / this.c;
            while (i5 >= this.d.size()) {
                byte[] bArr = new byte[this.c];
                int i6 = 0;
                while (!this.e && i6 != (i3 = this.c)) {
                    int read = this.b.read(bArr, i6, i3 - i6);
                    if (read == -1) {
                        this.e = true;
                        int size = (this.d.size() * this.c) + i6;
                        long j2 = this.f;
                        if (j2 == -1) {
                            this.f = (long) size;
                        } else {
                            int i7 = (j2 > ((long) size) ? 1 : (j2 == ((long) size) ? 0 : -1));
                        }
                        if (((long) i4) >= this.f) {
                            this.d.add(bArr);
                            return false;
                        }
                    } else {
                        i6 += read;
                    }
                }
                this.d.add(bArr);
            }
            return true;
        } else if (((long) i4) < this.f) {
            return true;
        } else {
            return false;
        }
    }

    public lr(InputStream inputStream, int i, long j) {
        this.d = new ArrayList<>();
        if (inputStream == null) {
            throw null;
        } else if (i > 0) {
            this.c = i;
            this.b = inputStream;
            this.f = j;
        } else {
            throw new IllegalArgumentException(C0201.m82(29451));
        }
    }
}
