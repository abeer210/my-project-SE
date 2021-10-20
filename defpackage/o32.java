package defpackage;

import java.io.IOException;
import java.io.Writer;

/* renamed from: o32  reason: default package */
/* compiled from: Streams */
public final class o32 {
    public static void a(o22 o22, h42 h42) throws IOException {
        c42.X.c(h42, o22);
    }

    public static Writer b(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    /* access modifiers changed from: private */
    /* renamed from: o32$a */
    /* compiled from: Streams */
    public static final class a extends Writer {
        private final Appendable a;
        private final C0160a b = new C0160a();

        /* renamed from: o32$a$a  reason: collision with other inner class name */
        /* compiled from: Streams */
        static class C0160a implements CharSequence {
            public char[] a;

            public char charAt(int i) {
                return this.a[i];
            }

            public int length() {
                return this.a.length;
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.a, i, i2 - i);
            }
        }

        public a(Appendable appendable) {
            this.a = appendable;
        }

        @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) throws IOException {
            C0160a aVar = this.b;
            aVar.a = cArr;
            this.a.append(aVar, i, i2 + i);
        }

        @Override // java.io.Writer
        public void write(int i) throws IOException {
            this.a.append((char) i);
        }
    }
}
