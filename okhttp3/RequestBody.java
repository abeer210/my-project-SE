package okhttp3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import okhttp3.internal.Util;
import vigqyno.C0201;

public abstract class RequestBody {
    public static RequestBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            mediaType = MediaType.parse(mediaType + C0201.m82(3394));
        }
        return create(mediaType, str.getBytes(charset));
    }

    public long contentLength() throws IOException {
        return -1;
    }

    public abstract MediaType contentType();

    public abstract void writeTo(by2 by2) throws IOException;

    public static RequestBody create(final MediaType mediaType, final dy2 dy2) {
        return new RequestBody() {
            /* class okhttp3.RequestBody.AnonymousClass1 */

            @Override // okhttp3.RequestBody
            public long contentLength() throws IOException {
                return (long) dy2.A();
            }

            @Override // okhttp3.RequestBody
            public MediaType contentType() {
                return MediaType.this;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(by2 by2) throws IOException {
                by2.R0(dy2);
            }
        };
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
        if (bArr != null) {
            Util.checkOffsetAndCount((long) bArr.length, (long) i, (long) i2);
            return new RequestBody() {
                /* class okhttp3.RequestBody.AnonymousClass2 */

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return (long) i2;
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(by2 by2) throws IOException {
                    by2.write(bArr, i, i2);
                }
            };
        }
        throw new NullPointerException(C0201.m82(3395));
    }

    public static RequestBody create(final MediaType mediaType, final File file) {
        if (file != null) {
            return new RequestBody() {
                /* class okhttp3.RequestBody.AnonymousClass3 */

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(by2 by2) throws IOException {
                    ty2 ty2 = null;
                    try {
                        ty2 = jy2.j(file);
                        by2.x0(ty2);
                    } finally {
                        Util.closeQuietly(ty2);
                    }
                }
            };
        }
        throw new NullPointerException(C0201.m82(3393));
    }
}
