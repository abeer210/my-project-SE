package defpackage;

import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: xr2  reason: default package */
/* compiled from: CCITTFaxG31DDecodeInputStream */
public final class xr2 extends InputStream {
    private static final f l = new f();
    private static final f m = new f();
    private static final int[] n = {128, 64, 32, 16, 8, 4, 2, 1};
    private InputStream a;
    private int b;
    private int c;
    private boolean d;
    private int e;
    private int f = 8;
    private zr2 g;
    private int h;
    private int i;
    private int j = -1;
    private int k;

    /* access modifiers changed from: private */
    /* renamed from: xr2$b */
    /* compiled from: CCITTFaxG31DDecodeInputStream */
    public interface b {
        int a(xr2 xr2) throws IOException;

        int getType();
    }

    /* access modifiers changed from: private */
    /* renamed from: xr2$c */
    /* compiled from: CCITTFaxG31DDecodeInputStream */
    public static class c extends d implements b {
        private c() {
            super();
        }

        @Override // defpackage.xr2.b
        public int a(xr2 xr2) throws IOException {
            return 0;
        }

        @Override // defpackage.xr2.d
        public b b(xr2 xr2) throws IOException {
            int s;
            do {
                s = xr2.s();
            } while (s == 0);
            if (s < 0) {
                return null;
            }
            return this;
        }

        @Override // defpackage.xr2.b
        public int getType() {
            return -2;
        }

        public String toString() {
            return C0201.m82(20364);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: xr2$d */
    /* compiled from: CCITTFaxG31DDecodeInputStream */
    public static abstract class d {
        private d() {
        }

        public abstract b b(xr2 xr2) throws IOException;
    }

    /* access modifiers changed from: private */
    /* renamed from: xr2$e */
    /* compiled from: CCITTFaxG31DDecodeInputStream */
    public static class e extends d implements b {
        private final int a;

        public e(int i) {
            super();
            this.a = i;
        }

        @Override // defpackage.xr2.b
        public int a(xr2 xr2) throws IOException {
            xr2.w(this.a);
            return this.a;
        }

        @Override // defpackage.xr2.d
        public b b(xr2 xr2) throws IOException {
            return this;
        }

        @Override // defpackage.xr2.b
        public int getType() {
            return 0;
        }

        public String toString() {
            return C0201.m82(20252) + this.a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: xr2$f */
    /* compiled from: CCITTFaxG31DDecodeInputStream */
    public static class f extends d {
        private d a;
        private d b;

        private f() {
            super();
        }

        @Override // defpackage.xr2.d
        public b b(xr2 xr2) throws IOException {
            int s = xr2.s();
            if (s < 0) {
                return null;
            }
            d c = c(s);
            if (c != null) {
                return c.b(xr2);
            }
            throw new IOException(C0201.m82(20856));
        }

        public d c(int i) {
            return i == 0 ? this.a : this.b;
        }

        public void d(int i, d dVar) {
            if (i == 0) {
                this.a = dVar;
            } else {
                this.b = dVar;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: xr2$g */
    /* compiled from: CCITTFaxG31DDecodeInputStream */
    public static class g extends d implements b {
        private final int a;
        private final int b;

        public g(int i, int i2) {
            super();
            this.a = i;
            this.b = i2;
        }

        @Override // defpackage.xr2.b
        public int a(xr2 xr2) {
            xr2.x(this.a, this.b);
            return this.b;
        }

        @Override // defpackage.xr2.d
        public b b(xr2 xr2) throws IOException {
            return this;
        }

        @Override // defpackage.xr2.b
        public int getType() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C0201.m82(20778));
            sb.append(this.b);
            sb.append(C0201.m82(20779));
            sb.append(this.a == 0 ? C0201.m82(20780) : C0201.m82(20781));
            return sb.toString();
        }
    }

    static {
        m();
    }

    public xr2(InputStream inputStream, int i2, int i3, boolean z) {
        this.a = inputStream;
        this.b = i2;
        this.c = i3;
        zr2 zr2 = new zr2(i2);
        this.g = zr2;
        this.i = zr2.f();
        this.d = z;
    }

    private static void k(short s, f fVar, d dVar) {
        int i2 = s >> 8;
        int i3 = s & 255;
        for (int i4 = i2 - 1; i4 > 0; i4--) {
            int i5 = (i3 >> i4) & 1;
            d c2 = fVar.c(i5);
            if (c2 == null) {
                c2 = new f();
                fVar.d(i5, c2);
            }
            if (c2 instanceof f) {
                fVar = (f) c2;
            } else {
                throw new IllegalStateException(C0201.m82(37098) + c2.getClass().getName());
            }
        }
        int i6 = i3 & 1;
        if (fVar.c(i6) == null) {
            fVar.d(i6, dVar);
            return;
        }
        throw new IllegalStateException(C0201.m82(37099));
    }

    private static void m() {
        p(wr2.a, l, true);
        p(wr2.b, m, false);
        n(wr2.c, l);
        n(wr2.d, m);
        o(wr2.e, l);
        o(wr2.e, m);
        c cVar = new c();
        k(2816, l, cVar);
        k(2816, m, cVar);
    }

    private static void n(short[] sArr, f fVar) {
        int length = sArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            k(sArr[i2], fVar, new e(i3 * 64));
            i2 = i3;
        }
    }

    private static void o(short[] sArr, f fVar) {
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            k(sArr[i2], fVar, new e((i2 + 28) * 64));
        }
    }

    private static void p(short[] sArr, f fVar, boolean z) {
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            k(sArr[i2], fVar, new g(!z ? 1 : 0, i2));
        }
    }

    private boolean r() throws IOException {
        if (this.d && this.f != 0) {
            u();
        }
        if (this.e < 0) {
            return false;
        }
        int i2 = this.j + 1;
        this.j = i2;
        int i3 = this.c;
        if (i3 > 0 && i2 >= i3) {
            return false;
        }
        this.g.c();
        this.h = 0;
        int i4 = 6;
        int i5 = 0;
        boolean z = true;
        while (true) {
            if (i5 < this.b || this.k > 0) {
                b b2 = (z ? l : m).b(this);
                if (b2 == null) {
                    if (i5 <= 0) {
                        return false;
                    }
                    this.i = 0;
                    return true;
                } else if (b2.getType() == -2) {
                    i4--;
                    if (i4 == 0) {
                        return false;
                    }
                } else {
                    i5 += b2.a(this);
                    if (this.k == 0) {
                        z = !z;
                    }
                    i4 = -1;
                }
            } else {
                this.i = 0;
                return true;
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int s() throws IOException {
        if (this.f >= 8) {
            u();
            if (this.e < 0) {
                return -1;
            }
        }
        int i2 = this.e;
        int[] iArr = n;
        int i3 = this.f;
        this.f = i3 + 1;
        return (i2 & iArr[i3]) == 0 ? 0 : 1;
    }

    private void u() throws IOException {
        this.e = this.a.read();
        this.f = 0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void w(int i2) {
        this.k += i2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void x(int i2, int i3) {
        int i4 = this.k + i3;
        this.k = i4;
        if (i2 != 0) {
            this.g.h(this.h, i4);
        }
        this.h += this.k;
        this.k = 0;
    }

    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.i >= this.g.f() && !r()) {
            return -1;
        }
        byte[] g2 = this.g.g();
        int i2 = this.i;
        this.i = i2 + 1;
        return g2[i2] & 255;
    }
}
