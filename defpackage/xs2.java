package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import vigqyno.C0201;

/* renamed from: xs2  reason: default package */
/* compiled from: PDDocument */
public class xs2 implements Closeable {
    private final wq2 a;
    private ys2 b;
    private final is2 c;
    private bt2 d = new ws2();

    public xs2(wq2 wq2, is2 is2, et2 et2) {
        new HashSet();
        this.a = wq2;
        this.c = is2;
    }

    public static xs2 m(File file) throws IOException {
        return o(file, C0201.m82(35001), false);
    }

    public static xs2 n(File file, String str, InputStream inputStream, String str2, boolean z) throws IOException {
        rs2 rs2 = new rs2(new fs2(file), str, inputStream, str2, z);
        rs2.C0();
        return rs2.z0();
    }

    public static xs2 o(File file, String str, boolean z) throws IOException {
        return n(file, str, null, null, z);
    }

    public wq2 a() {
        return this.a;
    }

    public ys2 c() {
        if (this.b == null) {
            tq2 k0 = this.a.s0().k0(ar2.o0);
            if (k0 instanceof vq2) {
                this.b = new ys2(this, (vq2) k0);
            } else {
                this.b = new ys2(this);
            }
        }
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.a.isClosed()) {
            this.a.close();
            is2 is2 = this.c;
            if (is2 != null) {
                is2.close();
            }
        }
    }

    public int h() {
        return c().b().getCount();
    }

    public bt2 k() {
        return this.d;
    }
}
