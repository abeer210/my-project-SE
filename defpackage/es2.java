package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: es2  reason: default package */
/* compiled from: RandomAccessBuffer */
public class es2 implements ds2, Cloneable {
    private int a = 1024;
    private List<byte[]> b = null;
    private byte[] c;
    private long d;
    private int e;
    private long f;
    private int g;
    private int h;

    public es2() {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        byte[] bArr = new byte[this.a];
        this.c = bArr;
        arrayList.add(bArr);
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
    }

    private void c() throws IOException {
        if (this.c == null) {
            throw new IOException(C0201.m82(18525));
        }
    }

    private void n() throws IOException {
        if (this.h > this.g) {
            o();
            return;
        }
        byte[] bArr = new byte[this.a];
        this.c = bArr;
        this.b.add(bArr);
        this.e = 0;
        this.h++;
        this.g++;
    }

    private void o() throws IOException {
        int i = this.g;
        if (i != this.h) {
            this.e = 0;
            List<byte[]> list = this.b;
            int i2 = i + 1;
            this.g = i2;
            this.c = list.get(i2);
            return;
        }
        throw new IOException(C0201.m82(18526));
    }

    private int s(byte[] bArr, int i, int i2) throws IOException {
        long j = this.d;
        long j2 = this.f;
        if (j >= j2) {
            return 0;
        }
        int min = (int) Math.min((long) i2, j2 - j);
        int i3 = this.a;
        int i4 = this.e;
        int i5 = i3 - i4;
        if (i5 == 0) {
            return 0;
        }
        if (min >= i5) {
            System.arraycopy(this.c, i4, bArr, i, i5);
            this.e += i5;
            this.d += (long) i5;
            return i5;
        }
        System.arraycopy(this.c, i4, bArr, i, min);
        this.e += min;
        this.d += (long) min;
        return min;
    }

    public int a() throws IOException {
        return (int) Math.min(length() - getPosition(), 2147483647L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.c = null;
        this.b.clear();
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }

    @Override // defpackage.is2
    public long getPosition() throws IOException {
        c();
        return this.d;
    }

    @Override // defpackage.is2
    public void h0(int i) throws IOException {
        c();
        seek(getPosition() - ((long) i));
    }

    @Override // defpackage.is2
    public byte[] i(int i) throws IOException {
        byte[] bArr = new byte[i];
        int read = read(bArr);
        while (read < i) {
            read += read(bArr, read, i - read);
        }
        return bArr;
    }

    @Override // defpackage.is2
    public boolean isClosed() {
        return this.c == null;
    }

    @Override // defpackage.is2
    public boolean j() throws IOException {
        c();
        return this.d >= this.f;
    }

    @Override // defpackage.is2
    public long length() throws IOException {
        c();
        return this.f;
    }

    /* renamed from: m */
    public es2 clone() {
        es2 es2 = new es2();
        es2.b = new ArrayList(this.b.size());
        for (byte[] bArr : this.b) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            es2.b.add(bArr2);
        }
        if (this.c != null) {
            List<byte[]> list = es2.b;
            es2.c = list.get(list.size() - 1);
        } else {
            es2.c = null;
        }
        es2.d = this.d;
        es2.e = this.e;
        es2.f = this.f;
        es2.g = this.g;
        es2.h = this.h;
        return es2;
    }

    @Override // defpackage.is2
    public int peek() throws IOException {
        int read = read();
        if (read != -1) {
            h0(1);
        }
        return read;
    }

    @Override // defpackage.is2
    public int read() throws IOException {
        c();
        if (this.d >= this.f) {
            return -1;
        }
        if (this.e >= this.a) {
            int i = this.g;
            if (i >= this.h) {
                return -1;
            }
            List<byte[]> list = this.b;
            int i2 = i + 1;
            this.g = i2;
            this.c = list.get(i2);
            this.e = 0;
        }
        this.d++;
        byte[] bArr = this.c;
        int i3 = this.e;
        this.e = i3 + 1;
        return bArr[i3] & 255;
    }

    @Override // defpackage.is2
    public void seek(long j) throws IOException {
        c();
        if (j >= 0) {
            this.d = j;
            if (j < this.f) {
                int i = this.a;
                int i2 = (int) (j / ((long) i));
                this.g = i2;
                this.e = (int) (j % ((long) i));
                this.c = this.b.get(i2);
                return;
            }
            int i3 = this.h;
            this.g = i3;
            this.c = this.b.get(i3);
            this.e = (int) (this.f % ((long) this.a));
            return;
        }
        throw new IOException(C0201.m82(18527) + j);
    }

    @Override // defpackage.js2
    public void write(int i) throws IOException {
        c();
        int i2 = this.e;
        int i3 = this.a;
        String r2 = C0201.m82(18528);
        if (i2 >= i3) {
            if (this.d + ((long) i3) < 2147483647L) {
                n();
            } else {
                throw new IOException(r2);
            }
        }
        byte[] bArr = this.c;
        int i4 = this.e;
        this.e = i4 + 1;
        bArr[i4] = (byte) i;
        long j = this.d + 1;
        this.d = j;
        if (j > this.f) {
            this.f = j;
        }
        int i5 = this.e;
        int i6 = this.a;
        if (i5 < i6) {
            return;
        }
        if (this.d + ((long) i6) < 2147483647L) {
            n();
            return;
        }
        throw new IOException(r2);
    }

    @Override // defpackage.is2
    public int read(byte[] bArr, int i, int i2) throws IOException {
        c();
        if (this.d >= this.f) {
            return 0;
        }
        int s = s(bArr, i, i2);
        while (s < i2 && a() > 0) {
            s += s(bArr, i + s, i2 - s);
            if (this.e == this.a) {
                o();
            }
        }
        return s;
    }

    @Override // defpackage.js2
    public void write(byte[] bArr, int i, int i2) throws IOException {
        c();
        long j = (long) i2;
        long j2 = this.d + j;
        int i3 = this.a;
        int i4 = this.e;
        int i5 = i3 - i4;
        if (i2 < i5) {
            System.arraycopy(bArr, i, this.c, i4, i2);
            this.e += i2;
        } else if (j2 <= 2147483647L) {
            System.arraycopy(bArr, i, this.c, i4, i5);
            int i6 = i + i5;
            long j3 = (long) (i2 - i5);
            int i7 = ((int) j3) / this.a;
            for (int i8 = 0; i8 < i7; i8++) {
                n();
                System.arraycopy(bArr, i6, this.c, this.e, this.a);
                i6 += this.a;
            }
            long j4 = j3 - (((long) i7) * ((long) this.a));
            if (j4 >= 0) {
                n();
                if (j4 > 0) {
                    System.arraycopy(bArr, i6, this.c, this.e, (int) j4);
                }
                this.e = (int) j4;
            }
        } else {
            throw new IOException(C0201.m82(18529));
        }
        long j5 = this.d + j;
        this.d = j5;
        if (j5 > this.f) {
            this.f = j5;
        }
    }

    @Override // defpackage.is2
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // defpackage.js2
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
