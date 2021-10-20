package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* renamed from: rq2  reason: default package */
/* compiled from: RandomAccessMemoryCache */
public final class rq2 {
    private long a;
    private ArrayList<byte[]> b = new ArrayList<>();

    private void e(long j) {
        int size = (((int) (j >> 9)) - this.b.size()) + 1;
        for (int i = 0; i < size; i++) {
            this.b.add(new byte[512]);
        }
        this.a = j + 1;
    }

    public int a(InputStream inputStream, int i) throws IOException {
        if (i <= 0) {
            return 0;
        }
        long j = this.a;
        e((((long) i) + j) - 1);
        int i2 = (int) (j >> 9);
        int i3 = (int) (j & 511);
        int i4 = 0;
        while (i > 0) {
            byte[] bArr = this.b.get(i2);
            int min = Math.min(512 - i3, i);
            i -= min;
            i4 += min;
            while (min > 0) {
                int read = inputStream.read(bArr, i3, min);
                if (read < 0) {
                    this.a -= (long) (i - i4);
                    return i4;
                }
                min -= read;
                i3 += read;
            }
            i2++;
            i3 = 0;
        }
        return i4;
    }

    public void b() {
        this.b.clear();
        this.a = 0;
    }

    public int c(long j) {
        if (j >= this.a) {
            return -1;
        }
        return this.b.get((int) (j >> 9))[(int) (j & 511)] & 255;
    }

    public int d(byte[] bArr, int i, int i2, long j) {
        if (i2 > bArr.length - i || i2 < 0 || i < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            long j2 = this.a;
            if (j >= j2) {
                return -1;
            }
            if (((long) i2) + j > j2) {
                i2 = (int) (j2 - j);
            }
            int i3 = (int) (j & 511);
            int min = Math.min(i2, 512 - i3);
            System.arraycopy(this.b.get((int) (j >> 9)), i3, bArr, i, min);
            return min;
        }
    }

    public long f() {
        return this.a;
    }
}
