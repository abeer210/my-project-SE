package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import vigqyno.C0201;

/* renamed from: lg  reason: default package */
/* compiled from: StrictLineReader */
public class lg implements Closeable {
    private final InputStream a;
    private final Charset b;
    private byte[] c;
    private int d;
    private int e;

    /* access modifiers changed from: package-private */
    /* renamed from: lg$a */
    /* compiled from: StrictLineReader */
    public class a extends ByteArrayOutputStream {
        public a(int i) {
            super(i);
        }

        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, (i <= 0 || ((ByteArrayOutputStream) this).buf[i + -1] != 13) ? ((ByteArrayOutputStream) this).count : i - 1, lg.this.b.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public lg(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void c() throws IOException {
        InputStream inputStream = this.a;
        byte[] bArr = this.c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.d = 0;
            this.e = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.a) {
            if (this.c != null) {
                this.c = null;
                this.a.close();
            }
        }
    }

    public boolean h() {
        return this.e == -1;
    }

    public String k() throws IOException {
        int i;
        int i2;
        synchronized (this.a) {
            if (this.c != null) {
                if (this.d >= this.e) {
                    c();
                }
                for (int i3 = this.d; i3 != this.e; i3++) {
                    if (this.c[i3] == 10) {
                        if (i3 != this.d) {
                            i2 = i3 - 1;
                            if (this.c[i2] == 13) {
                                String str = new String(this.c, this.d, i2 - this.d, this.b.name());
                                this.d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.c, this.d, i2 - this.d, this.b.name());
                        this.d = i3 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.e - this.d) + 80);
                loop1:
                while (true) {
                    aVar.write(this.c, this.d, this.e - this.d);
                    this.e = -1;
                    c();
                    i = this.d;
                    while (true) {
                        if (i != this.e) {
                            if (this.c[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.d) {
                    aVar.write(this.c, this.d, i - this.d);
                }
                this.d = i + 1;
                return aVar.toString();
            }
            throw new IOException(C0201.m82(29082));
        }
    }

    public lg(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException(C0201.m82(29081));
        } else if (charset.equals(mg.a)) {
            this.a = inputStream;
            this.b = charset;
            this.c = new byte[i];
        } else {
            throw new IllegalArgumentException(C0201.m82(29080));
        }
    }
}
