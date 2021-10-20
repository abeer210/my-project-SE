package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.BitSet;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: ks2  reason: default package */
/* compiled from: ScratchFile */
public class ks2 implements Closeable {
    private final Object a;
    private final File b;
    private File c;
    private RandomAccessFile d;
    private volatile int e;
    private final BitSet f;
    private volatile byte[][] g;
    private final int h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private volatile boolean l;

    /* JADX WARNING: Illegal instructions before constructor call */
    public ks2(File file) throws IOException {
        this(r0);
        cs2 g2 = cs2.g();
        g2.f(file);
    }

    private void h() throws IOException {
        synchronized (this.a) {
            a();
            if (this.e < this.i) {
                if (this.j) {
                    if (this.d == null) {
                        this.c = File.createTempFile(C0201.m82(14591), C0201.m82(14592), this.b);
                        try {
                            this.d = new RandomAccessFile(this.c, C0201.m82(14593));
                        } catch (IOException e2) {
                            if (!this.c.delete()) {
                                String r2 = C0201.m82(14594);
                                Log.w(r2, C0201.m82(14595) + this.c.getAbsolutePath());
                            }
                            throw e2;
                        }
                    }
                    long length = this.d.length();
                    long j2 = (((long) this.e) - ((long) this.h)) * 4096;
                    if (j2 != length) {
                        throw new IOException(C0201.m82(14596) + j2 + C0201.m82(14597) + length);
                    } else if (this.e + 16 > this.e) {
                        this.d.setLength(length + 65536);
                        this.f.set(this.e, this.e + 16);
                    }
                } else if (!this.k) {
                    int length2 = this.g.length;
                    int min = (int) Math.min(((long) length2) * 2, 2147483647L);
                    if (min > length2) {
                        byte[][] bArr = new byte[min][];
                        System.arraycopy(this.g, 0, bArr, 0, length2);
                        this.g = bArr;
                        this.f.set(length2, min);
                    }
                }
            }
        }
    }

    public void a() throws IOException {
        if (this.l) {
            throw new IOException(C0201.m82(14598));
        }
    }

    public ds2 c() throws IOException {
        return new ls2(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.l) {
            this.l = true;
            IOException e2 = null;
            synchronized (this.a) {
                if (this.d != null) {
                    try {
                        this.d.close();
                    } catch (IOException e3) {
                        e2 = e3;
                    }
                }
                if (this.c != null && !this.c.delete() && this.c.exists() && e2 == null) {
                    e2 = new IOException(C0201.m82(14599) + this.c.getAbsolutePath());
                }
                synchronized (this.f) {
                    this.f.clear();
                    this.e = 0;
                }
                if (e2 != null) {
                    throw e2;
                }
            }
        }
    }

    public int k() throws IOException {
        int nextSetBit;
        synchronized (this.f) {
            nextSetBit = this.f.nextSetBit(0);
            if (nextSetBit < 0) {
                h();
                nextSetBit = this.f.nextSetBit(0);
                if (nextSetBit < 0) {
                    throw new IOException(C0201.m82(14600));
                }
            }
            this.f.clear(nextSetBit);
            if (nextSetBit >= this.e) {
                this.e = nextSetBit + 1;
            }
        }
        return nextSetBit;
    }

    public int m() {
        return 4096;
    }

    public void n(int[] iArr, int i2, int i3) {
        synchronized (this.f) {
            while (i2 < i3) {
                int i4 = iArr[i2];
                if (i4 >= 0 && i4 < this.e && !this.f.get(i4)) {
                    this.f.set(i4);
                    if (i4 < this.h) {
                        this.g[i4] = null;
                    }
                }
                i2++;
            }
        }
    }

    public byte[] o(int i2) throws IOException {
        byte[] bArr;
        if (i2 < 0 || i2 >= this.e) {
            a();
            StringBuilder sb = new StringBuilder();
            sb.append(C0201.m82(14605));
            sb.append(i2);
            sb.append(C0201.m82(14606));
            sb.append(this.e - 1);
            throw new IOException(sb.toString());
        } else if (i2 < this.h) {
            byte[] bArr2 = this.g[i2];
            if (bArr2 != null) {
                return bArr2;
            }
            a();
            throw new IOException(C0201.m82(14601) + i2 + C0201.m82(14602));
        } else {
            synchronized (this.a) {
                if (this.d != null) {
                    bArr = new byte[4096];
                    this.d.seek((((long) i2) - ((long) this.h)) * 4096);
                    this.d.readFully(bArr);
                } else {
                    a();
                    throw new IOException(C0201.m82(14603) + i2 + C0201.m82(14604));
                }
            }
            return bArr;
        }
    }

    public void p(int i2, byte[] bArr) throws IOException {
        if (i2 < 0 || i2 >= this.e) {
            a();
            StringBuilder sb = new StringBuilder();
            sb.append(C0201.m82(14609));
            sb.append(i2);
            sb.append(C0201.m82(14610));
            sb.append(this.e - 1);
            throw new IOException(sb.toString());
        } else if (bArr.length != 4096) {
            throw new IOException(C0201.m82(14607) + bArr.length + C0201.m82(14608) + 4096);
        } else if (i2 < this.h) {
            if (this.k) {
                this.g[i2] = bArr;
            } else {
                synchronized (this.a) {
                    this.g[i2] = bArr;
                }
            }
            a();
        } else {
            synchronized (this.a) {
                a();
                this.d.seek((((long) i2) - ((long) this.h)) * 4096);
                this.d.write(bArr);
            }
        }
    }

    public ks2(cs2 cs2) throws IOException {
        this.a = new Object();
        this.e = 0;
        this.f = new BitSet();
        this.l = false;
        boolean z = !cs2.i() || cs2.d();
        this.k = z;
        boolean j2 = z ? cs2.j() : false;
        this.j = j2;
        File c2 = j2 ? cs2.c() : null;
        this.b = c2;
        if (c2 == null || c2.isDirectory()) {
            boolean e2 = cs2.e();
            int i2 = C0188.f24;
            this.i = e2 ? (int) Math.min(2147483647L, cs2.b() / 4096) : C0188.f24;
            if (!cs2.i()) {
                i2 = 0;
            } else if (cs2.d()) {
                i2 = (int) Math.min(2147483647L, cs2.a() / 4096);
            }
            this.h = i2;
            this.g = new byte[(!this.k ? 100000 : i2)][];
            this.f.set(0, this.g.length);
            return;
        }
        throw new IOException(C0201.m82(14590) + this.b);
    }
}
