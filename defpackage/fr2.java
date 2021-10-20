package defpackage;

import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: fr2  reason: default package */
/* compiled from: COSStream */
public class fr2 extends vq2 implements Closeable {
    private ds2 b;
    private final ks2 c;
    private boolean d;

    /* renamed from: fr2$a */
    /* compiled from: COSStream */
    class a extends FilterOutputStream {
        public a(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            fr2 fr2 = fr2.this;
            fr2.m1(ar2.W, (int) fr2.b.length());
            fr2.this.d = false;
        }
    }

    public fr2() {
        this.b = new es2();
        this.c = null;
    }

    private void t1() throws IOException {
        if (this.b.isClosed()) {
            throw new IOException(C0201.m82(8791));
        }
    }

    private ds2 v1(ks2 ks2) {
        if (ks2 == null) {
            return new es2();
        }
        try {
            return ks2.c();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<pr2> y1() throws IOException {
        ArrayList arrayList = new ArrayList();
        tq2 A1 = A1();
        if (A1 instanceof ar2) {
            arrayList.add(qr2.b.a((ar2) A1));
        } else if (A1 instanceof sq2) {
            sq2 sq2 = (sq2) A1;
            for (int i = 0; i < sq2.size(); i++) {
                arrayList.add(qr2.b.a((ar2) sq2.x(i)));
            }
        }
        return arrayList;
    }

    public tq2 A1() {
        return k0(ar2.J);
    }

    @Deprecated
    public InputStream B1() throws IOException {
        return u1();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.b.close();
    }

    public yq2 u1() throws IOException {
        t1();
        if (!this.d) {
            return yq2.a(y1(), this, new gs2(this.b), this.c);
        }
        throw new IllegalStateException(C0201.m82(8792));
    }

    public InputStream w1() throws IOException {
        t1();
        if (!this.d) {
            return new gs2(this.b);
        }
        throw new IllegalStateException(C0201.m82(8793));
    }

    public OutputStream x1() throws IOException {
        t1();
        if (!this.d) {
            this.b = v1(this.c);
            hs2 hs2 = new hs2(this.b);
            this.d = true;
            return new a(hs2);
        }
        throw new IllegalStateException(C0201.m82(8794));
    }

    @Deprecated
    public InputStream z1() throws IOException {
        return w1();
    }

    public fr2(ks2 ks2) {
        this.b = v1(ks2);
        this.c = ks2;
    }
}
