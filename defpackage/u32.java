package defpackage;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: u32  reason: default package */
/* compiled from: JsonTreeWriter */
public final class u32 extends h42 {
    private static final Writer o = new a();
    private static final t22 p = new t22(C0201.m82(27477));
    private final List<o22> l = new ArrayList();
    private String m;
    private o22 n = q22.a;

    /* renamed from: u32$a */
    /* compiled from: JsonTreeWriter */
    static class a extends Writer {
        @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public u32() {
        super(o);
    }

    private o22 U() {
        List<o22> list = this.l;
        return list.get(list.size() - 1);
    }

    private void V(o22 o22) {
        if (this.m != null) {
            if (!o22.e() || p()) {
                ((r22) U()).i(this.m, o22);
            }
            this.m = null;
        } else if (this.l.isEmpty()) {
            this.n = o22;
        } else {
            o22 U = U();
            if (U instanceof m22) {
                ((m22) U).i(o22);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // defpackage.h42
    public h42 H(long j) throws IOException {
        V(new t22(Long.valueOf(j)));
        return this;
    }

    @Override // defpackage.h42
    public h42 K(Boolean bool) throws IOException {
        if (bool == null) {
            x();
            return this;
        }
        V(new t22(bool));
        return this;
    }

    @Override // defpackage.h42
    public h42 N(Number number) throws IOException {
        if (number == null) {
            x();
            return this;
        }
        if (!s()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException(C0201.m82(27478) + number);
            }
        }
        V(new t22(number));
        return this;
    }

    @Override // defpackage.h42
    public h42 P(String str) throws IOException {
        if (str == null) {
            x();
            return this;
        }
        V(new t22(str));
        return this;
    }

    @Override // defpackage.h42
    public h42 Q(boolean z) throws IOException {
        V(new t22(Boolean.valueOf(z)));
        return this;
    }

    public o22 T() {
        if (this.l.isEmpty()) {
            return this.n;
        }
        throw new IllegalStateException(C0201.m82(27479) + this.l);
    }

    @Override // defpackage.h42, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.l.isEmpty()) {
            this.l.add(p);
            return;
        }
        throw new IOException(C0201.m82(27480));
    }

    @Override // defpackage.h42, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // defpackage.h42
    public h42 h() throws IOException {
        m22 m22 = new m22();
        V(m22);
        this.l.add(m22);
        return this;
    }

    @Override // defpackage.h42
    public h42 k() throws IOException {
        r22 r22 = new r22();
        V(r22);
        this.l.add(r22);
        return this;
    }

    @Override // defpackage.h42
    public h42 n() throws IOException {
        if (this.l.isEmpty() || this.m != null) {
            throw new IllegalStateException();
        } else if (U() instanceof m22) {
            List<o22> list = this.l;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // defpackage.h42
    public h42 o() throws IOException {
        if (this.l.isEmpty() || this.m != null) {
            throw new IllegalStateException();
        } else if (U() instanceof r22) {
            List<o22> list = this.l;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // defpackage.h42
    public h42 u(String str) throws IOException {
        if (this.l.isEmpty() || this.m != null) {
            throw new IllegalStateException();
        } else if (U() instanceof r22) {
            this.m = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // defpackage.h42
    public h42 x() throws IOException {
        V(q22.a);
        return this;
    }
}
