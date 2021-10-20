package defpackage;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: l53  reason: default package */
/* compiled from: CMSTypedStream */
public class l53 {
    public InputStream a;

    /* renamed from: l53$a */
    /* compiled from: CMSTypedStream */
    private static class a extends FilterInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int d = sb3.d(((FilterInputStream) this).in, bArr, i, i2);
            if (d > 0) {
                return d;
            }
            return -1;
        }
    }

    public l53(InputStream inputStream) {
        this(d43.o.u(), inputStream, 32768);
    }

    public InputStream a() {
        return this.a;
    }

    public l53(String str, InputStream inputStream, int i) {
        this(new p03(str), inputStream, i);
    }

    public l53(p03 p03, InputStream inputStream, int i) {
        this.a = new a(new BufferedInputStream(inputStream, i));
    }
}
