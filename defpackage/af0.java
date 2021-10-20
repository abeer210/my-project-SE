package defpackage;

import android.graphics.ColorSpace;
import android.util.Pair;
import com.facebook.imageutils.HeifExifUtil;
import com.facebook.imageutils.a;
import com.facebook.imageutils.b;
import com.facebook.imageutils.c;
import com.facebook.imageutils.f;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: af0  reason: default package */
/* compiled from: EncodedImage */
public class af0 implements Closeable {
    private final v60<q60> a;
    private final c60<FileInputStream> b;
    private ob0 c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private nd0 j;
    private ColorSpace k;

    public af0(v60<q60> v60) {
        this.c = ob0.b;
        this.d = -1;
        this.e = 0;
        this.f = -1;
        this.g = -1;
        this.h = 1;
        this.i = -1;
        z50.b(v60.z(v60));
        this.a = v60.clone();
        this.b = null;
    }

    public static boolean D(af0 af0) {
        return af0.d >= 0 && af0.f >= 0 && af0.g >= 0;
    }

    public static boolean F(af0 af0) {
        return af0 != null && af0.E();
    }

    private void H() {
        if (this.f < 0 || this.g < 0) {
            G();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034 A[SYNTHETIC, Splitter:B:15:0x0034] */
    private b K() {
        Throwable th;
        InputStream inputStream;
        try {
            inputStream = w();
            try {
                b b2 = a.b(inputStream);
                this.k = b2.a();
                Pair<Integer, Integer> b3 = b2.b();
                if (b3 != null) {
                    this.f = ((Integer) b3.first).intValue();
                    this.g = ((Integer) b3.second).intValue();
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return b2;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    private Pair<Integer, Integer> N() {
        Pair<Integer, Integer> g2 = f.g(w());
        if (g2 != null) {
            this.f = ((Integer) g2.first).intValue();
            this.g = ((Integer) g2.second).intValue();
        }
        return g2;
    }

    public static af0 c(af0 af0) {
        if (af0 != null) {
            return af0.a();
        }
        return null;
    }

    public static void h(af0 af0) {
        if (af0 != null) {
            af0.close();
        }
    }

    public int A() {
        H();
        return this.f;
    }

    public boolean B(int i2) {
        if (this.c != nb0.a || this.b != null) {
            return true;
        }
        z50.g(this.a);
        q60 w = this.a.w();
        if (w.e(i2 - 2) == -1 && w.e(i2 - 1) == -39) {
            return true;
        }
        return false;
    }

    public synchronized boolean E() {
        return v60.z(this.a) || this.b != null;
    }

    public void G() {
        Pair<Integer, Integer> pair;
        ob0 c2 = pb0.c(w());
        this.c = c2;
        if (nb0.b(c2)) {
            pair = N();
        } else {
            pair = K().b();
        }
        if (c2 == nb0.a && this.d == -1) {
            if (pair != null) {
                int b2 = c.b(w());
                this.e = b2;
                this.d = c.a(b2);
            }
        } else if (c2 == nb0.k && this.d == -1) {
            int a2 = HeifExifUtil.a(w());
            this.e = a2;
            this.d = c.a(a2);
        } else {
            this.d = 0;
        }
    }

    public void P(nd0 nd0) {
        this.j = nd0;
    }

    public void Q(int i2) {
        this.e = i2;
    }

    public void R(int i2) {
        this.g = i2;
    }

    public void T(ob0 ob0) {
        this.c = ob0;
    }

    public void U(int i2) {
        this.d = i2;
    }

    public void V(int i2) {
        this.h = i2;
    }

    public void Z(int i2) {
        this.f = i2;
    }

    public af0 a() {
        af0 af0;
        c60<FileInputStream> c60 = this.b;
        if (c60 != null) {
            af0 = new af0(c60, this.i);
        } else {
            v60 n = v60.n(this.a);
            if (n == null) {
                af0 = null;
            } else {
                try {
                    af0 = new af0(n);
                } catch (Throwable th) {
                    v60.s(n);
                    throw th;
                }
            }
            v60.s(n);
        }
        if (af0 != null) {
            af0.k(this);
        }
        return af0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        v60.s(this.a);
    }

    public void k(af0 af0) {
        this.c = af0.u();
        this.f = af0.A();
        this.g = af0.s();
        this.d = af0.x();
        this.e = af0.p();
        this.h = af0.y();
        this.i = af0.z();
        this.j = af0.n();
        this.k = af0.o();
    }

    public v60<q60> m() {
        return v60.n(this.a);
    }

    public nd0 n() {
        return this.j;
    }

    public ColorSpace o() {
        H();
        return this.k;
    }

    public int p() {
        H();
        return this.e;
    }

    public String r(int i2) {
        v60<q60> m = m();
        String r1 = C0201.m82(12089);
        if (m == null) {
            return r1;
        }
        int min = Math.min(z(), i2);
        byte[] bArr = new byte[min];
        try {
            q60 w = m.w();
            if (w == null) {
                return r1;
            }
            w.f(0, bArr, 0, min);
            m.close();
            StringBuilder sb = new StringBuilder(min * 2);
            for (int i3 = 0; i3 < min; i3++) {
                sb.append(String.format(C0201.m82(12090), Byte.valueOf(bArr[i3])));
            }
            return sb.toString();
        } finally {
            m.close();
        }
    }

    public int s() {
        H();
        return this.g;
    }

    public ob0 u() {
        H();
        return this.c;
    }

    public InputStream w() {
        c60<FileInputStream> c60 = this.b;
        if (c60 != null) {
            return c60.get();
        }
        v60 n = v60.n(this.a);
        if (n == null) {
            return null;
        }
        try {
            return new s60((q60) n.w());
        } finally {
            v60.s(n);
        }
    }

    public int x() {
        H();
        return this.d;
    }

    public int y() {
        return this.h;
    }

    public int z() {
        v60<q60> v60 = this.a;
        if (v60 == null || v60.w() == null) {
            return this.i;
        }
        return this.a.w().size();
    }

    public af0(c60<FileInputStream> c60) {
        this.c = ob0.b;
        this.d = -1;
        this.e = 0;
        this.f = -1;
        this.g = -1;
        this.h = 1;
        this.i = -1;
        z50.g(c60);
        this.a = null;
        this.b = c60;
    }

    public af0(c60<FileInputStream> c60, int i2) {
        this(c60);
        this.i = i2;
    }
}
