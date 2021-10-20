package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okhttp3.internal.Util;
import vigqyno.C0201;

public abstract class ResponseBody implements Closeable {
    private Reader reader;

    static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final cy2 source;

        public BomAwareReader(cy2 cy2, Charset charset2) {
            this.source = cy2;
            this.charset = charset2;
        }

        @Override // java.io.Closeable, java.io.Reader, java.lang.AutoCloseable
        public void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.source.j1(), Util.bomAwareCharset(this.source, this.charset));
                    this.delegate = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException(C0201.m82(20253));
        }
    }

    private Charset charset() {
        MediaType contentType = contentType();
        return contentType != null ? contentType.charset(Util.UTF_8) : Util.UTF_8;
    }

    public static ResponseBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            mediaType = MediaType.parse(mediaType + C0201.m82(21929));
        }
        ay2 ay2 = new ay2();
        ay2.n0(str, charset);
        return create(mediaType, ay2.Q(), ay2);
    }

    public final InputStream byteStream() {
        return source().j1();
    }

    /* JADX INFO: finally extract failed */
    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            cy2 source = source();
            try {
                byte[] I = source.I();
                Util.closeQuietly(source);
                if (contentLength == -1 || contentLength == ((long) I.length)) {
                    return I;
                }
                throw new IOException(C0201.m82(21930) + contentLength + C0201.m82(21931) + I.length + C0201.m82(21932));
            } catch (Throwable th) {
                Util.closeQuietly(source);
                throw th;
            }
        } else {
            throw new IOException(C0201.m82(21933) + contentLength);
        }
    }

    public final Reader charStream() {
        Reader reader2 = this.reader;
        if (reader2 != null) {
            return reader2;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract cy2 source();

    public final String string() throws IOException {
        cy2 source = source();
        try {
            return source.p0(Util.bomAwareCharset(source, charset()));
        } finally {
            Util.closeQuietly(source);
        }
    }

    public static ResponseBody create(MediaType mediaType, byte[] bArr) {
        ay2 ay2 = new ay2();
        ay2.Z(bArr);
        return create(mediaType, (long) bArr.length, ay2);
    }

    public static ResponseBody create(MediaType mediaType, dy2 dy2) {
        ay2 ay2 = new ay2();
        ay2.V(dy2);
        return create(mediaType, (long) dy2.A(), ay2);
    }

    public static ResponseBody create(final MediaType mediaType, final long j, final cy2 cy2) {
        if (cy2 != null) {
            return new ResponseBody() {
                /* class okhttp3.ResponseBody.AnonymousClass1 */

                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                public cy2 source() {
                    return cy2;
                }
            };
        }
        throw new NullPointerException(C0201.m82(21928));
    }
}
