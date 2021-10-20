package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.zip.GZIPInputStream;
import vigqyno.C0201;

public final class r0 {
    public static final String A = null;
    public static final String B = null;
    private static final gy1 f = new gy1(C0201.m82(32234));
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;
    public static final String v = null;
    public static final String w = null;
    public static final String x = null;
    public static final String y = null;
    public static final String z = null;
    private final byte[] a = new byte[8192];
    private final b0 b;
    private final fz1<i3> c;
    private final fz1<v> d;
    private final x0 e;

    static {
        C0201.m83(r0.class, 100);
    }

    public r0(b0 b0Var, fz1<i3> fz1, fz1<v> fz12, x0 x0Var) {
        this.b = b0Var;
        this.c = fz1;
        this.d = fz12;
        this.e = x0Var;
    }

    private final File b(q0 q0Var) {
        File c2 = this.b.c(q0Var.b, q0Var.c, q0Var.d, q0Var.e);
        if (!c2.exists()) {
            c2.mkdirs();
        }
        return c2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x017f A[Catch:{ all -> 0x032e, all -> 0x0334 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0293 A[SYNTHETIC, Splitter:B:91:0x0293] */
    public final void a(q0 q0Var) {
        InputStream inputStream;
        r2 c2;
        long j2;
        File file;
        int min;
        int max;
        long j3;
        l2 l2Var = new l2(this.b, q0Var.b, q0Var.c, q0Var.d, q0Var.e);
        File y2 = this.b.y(q0Var.b, q0Var.c, q0Var.d, q0Var.e);
        if (!y2.exists()) {
            y2.mkdirs();
        }
        try {
            InputStream inputStream2 = q0Var.k;
            GZIPInputStream gZIPInputStream = q0Var.f != 1 ? inputStream2 : new GZIPInputStream(inputStream2, this.a.length);
            try {
                if (q0Var.g > 0) {
                    k2 a2 = l2Var.a();
                    int e2 = a2.e();
                    int i2 = q0Var.g;
                    if (e2 == i2 - 1) {
                        int a3 = a2.a();
                        if (a3 == 1) {
                            f.c(A, a2.b());
                            File file2 = new File(a2.b());
                            if (file2.exists()) {
                                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, y);
                                randomAccessFile.seek(a2.c());
                                long d2 = a2.d();
                                while (true) {
                                    min = (int) Math.min(d2, (long) this.a.length);
                                    max = Math.max(gZIPInputStream.read(this.a, 0, min), 0);
                                    if (max > 0) {
                                        randomAccessFile.write(this.a, 0, max);
                                    }
                                    j3 = d2 - ((long) max);
                                    if (j3 <= 0) {
                                        break;
                                    } else if (max <= 0) {
                                        break;
                                    } else {
                                        d2 = j3;
                                    }
                                }
                                long length = randomAccessFile.length();
                                randomAccessFile.close();
                                if (max != min) {
                                    f.c(t, new Object[0]);
                                    l2Var.e(file2.getCanonicalPath(), length, j3, q0Var.g);
                                }
                            } else {
                                throw new t0(j, q0Var.a);
                            }
                        } else if (a3 == 2) {
                            f.c(u, new Object[0]);
                            File s2 = this.b.s(q0Var.b, q0Var.c, q0Var.d, q0Var.e);
                            if (s2.exists()) {
                                inputStream = new SequenceInputStream(new FileInputStream(s2), gZIPInputStream);
                                if (inputStream != null) {
                                    k0 k0Var = new k0(inputStream);
                                    File b2 = b(q0Var);
                                    do {
                                        c2 = k0Var.c();
                                        if (!c2.g() && !k0Var.m()) {
                                            if (!c2.c() || c2.b()) {
                                                l2Var.h(c2.i(), k0Var);
                                            } else {
                                                l2Var.f(c2.i());
                                                File file3 = new File(b2, c2.d());
                                                file3.getParentFile().mkdirs();
                                                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                                int read = k0Var.read(this.a);
                                                while (read > 0) {
                                                    fileOutputStream.write(this.a, 0, read);
                                                    read = k0Var.read(this.a);
                                                }
                                                fileOutputStream.close();
                                            }
                                        }
                                        if (k0Var.k()) {
                                            break;
                                        }
                                    } while (!k0Var.m());
                                    if (k0Var.m()) {
                                        f.c(s, new Object[0]);
                                        l2Var.h(c2.i(), inputStream);
                                    }
                                    if (!q0Var.a()) {
                                        if (c2.g()) {
                                            f.c(h, new Object[0]);
                                            l2Var.g(c2.i(), q0Var.g);
                                        } else if (k0Var.m()) {
                                            f.c(q, new Object[0]);
                                            l2Var.b(q0Var.g);
                                        } else {
                                            if (c2.f() == 0) {
                                                f.c(m, new Object[0]);
                                                file = new File(b(q0Var), c2.d());
                                                j2 = c2.e() - k0Var.n();
                                                if (file.length() != j2) {
                                                    throw new t0(p);
                                                }
                                            } else {
                                                f.c(k, new Object[0]);
                                                file = l2Var.i();
                                                j2 = file.length();
                                            }
                                            l2Var.e(file.getCanonicalPath(), j2, k0Var.n(), q0Var.g);
                                        }
                                    }
                                }
                                gZIPInputStream.close();
                                if (q0Var.a()) {
                                    try {
                                        l2Var.j(q0Var.g);
                                    } catch (IOException e3) {
                                        f.e(z, e3.getMessage());
                                        throw new t0(g, e3, q0Var.a);
                                    }
                                }
                                f.f(w, Integer.valueOf(q0Var.g), q0Var.e, q0Var.b, Integer.valueOf(q0Var.a));
                                this.c.a().d(q0Var.a, q0Var.b, q0Var.e, q0Var.g);
                                q0Var.k.close();
                                if (q0Var.j == 3) {
                                    String str = q0Var.b;
                                    long j4 = q0Var.i;
                                    this.d.a().h(AssetPackState.b(str, 3, 0, j4, j4, this.e.a(str, q0Var)));
                                    return;
                                }
                                return;
                            }
                            throw new t0(n, q0Var.a);
                        } else if (a3 == 3) {
                            f.c(x, new Object[0]);
                            l2Var.d(gZIPInputStream, a2.c());
                            if (!q0Var.a()) {
                                throw new t0(v, q0Var.a);
                            }
                        } else {
                            throw new t0(String.format(l, Integer.valueOf(a2.a())), q0Var.a);
                        }
                        inputStream = null;
                        if (inputStream != null) {
                        }
                        gZIPInputStream.close();
                        if (q0Var.a()) {
                        }
                        f.f(w, Integer.valueOf(q0Var.g), q0Var.e, q0Var.b, Integer.valueOf(q0Var.a));
                        this.c.a().d(q0Var.a, q0Var.b, q0Var.e, q0Var.g);
                        q0Var.k.close();
                        if (q0Var.j == 3) {
                        }
                    } else {
                        throw new t0(String.format(B, Integer.valueOf(i2), Integer.valueOf(a2.e())), q0Var.a);
                    }
                }
                inputStream = gZIPInputStream;
                if (inputStream != null) {
                }
                gZIPInputStream.close();
                if (q0Var.a()) {
                }
                f.f(w, Integer.valueOf(q0Var.g), q0Var.e, q0Var.b, Integer.valueOf(q0Var.a));
                this.c.a().d(q0Var.a, q0Var.b, q0Var.e, q0Var.g);
                try {
                    q0Var.k.close();
                } catch (IOException unused) {
                    f.g(r, Integer.valueOf(q0Var.g), q0Var.e, q0Var.b);
                }
                if (q0Var.j == 3) {
                }
            } catch (Throwable th) {
                ez1.a(th, th);
            }
            throw th;
        } catch (IOException e4) {
            f.e(o, e4.getMessage());
            throw new t0(String.format(i, Integer.valueOf(q0Var.g), q0Var.e, q0Var.b, Integer.valueOf(q0Var.a)), e4, q0Var.a);
        }
    }
}
