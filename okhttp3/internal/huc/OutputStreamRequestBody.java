package okhttp3.internal.huc;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import vigqyno.C0201;

public abstract class OutputStreamRequestBody extends RequestBody {
    public boolean closed;
    private long expectedContentLength;
    private OutputStream outputStream;
    private uy2 timeout;

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        return this.expectedContentLength;
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return null;
    }

    public void initOutputStream(final by2 by2, final long j) {
        this.timeout = by2.timeout();
        this.expectedContentLength = j;
        this.outputStream = new OutputStream() {
            /* class okhttp3.internal.huc.OutputStreamRequestBody.AnonymousClass1 */
            private long bytesReceived;

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                OutputStreamRequestBody.this.closed = true;
                long j = j;
                if (j == -1 || this.bytesReceived >= j) {
                    by2.close();
                    return;
                }
                throw new ProtocolException(C0201.m82(36778) + j + C0201.m82(36779) + this.bytesReceived);
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                if (!OutputStreamRequestBody.this.closed) {
                    by2.flush();
                }
            }

            @Override // java.io.OutputStream
            public void write(int i) throws IOException {
                write(new byte[]{(byte) i}, 0, 1);
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
                if (!OutputStreamRequestBody.this.closed) {
                    long j = j;
                    if (j == -1 || this.bytesReceived + ((long) i2) <= j) {
                        this.bytesReceived += (long) i2;
                        try {
                            by2.write(bArr, i, i2);
                        } catch (InterruptedIOException e) {
                            throw new SocketTimeoutException(e.getMessage());
                        }
                    } else {
                        throw new ProtocolException(C0201.m82(36780) + j + C0201.m82(36781) + this.bytesReceived + i2);
                    }
                } else {
                    throw new IOException(C0201.m82(36782));
                }
            }
        };
    }

    public final boolean isClosed() {
        return this.closed;
    }

    public final OutputStream outputStream() {
        return this.outputStream;
    }

    public Request prepareToSendRequest(Request request) throws IOException {
        return request;
    }

    public final uy2 timeout() {
        return this.timeout;
    }
}
