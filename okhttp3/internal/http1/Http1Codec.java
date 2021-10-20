package okhttp3.internal.http1;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import vigqyno.C0201;

public final class Http1Codec implements HttpCodec {
    private static final int HEADER_LIMIT = 0;
    private static final int STATE_CLOSED = 0;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 0;
    private static final int STATE_OPEN_RESPONSE_BODY = 0;
    private static final int STATE_READING_RESPONSE_BODY = 0;
    private static final int STATE_READ_RESPONSE_HEADERS = 0;
    private static final int STATE_WRITING_REQUEST_BODY = 0;
    public final OkHttpClient client;
    private long headerLimit = 262144;
    public final by2 sink;
    public final cy2 source;
    public int state = 0;
    public final StreamAllocation streamAllocation;

    /* access modifiers changed from: private */
    public abstract class AbstractSource implements ty2 {
        public long bytesRead;
        public boolean closed;
        public final gy2 timeout;

        private AbstractSource() {
            this.timeout = new gy2(Http1Codec.this.source.timeout());
            this.bytesRead = 0;
        }

        @Override // java.io.Closeable, defpackage.ty2, java.lang.AutoCloseable
        public abstract /* synthetic */ void close() throws IOException;

        public final void endOfInput(boolean z, IOException iOException) throws IOException {
            Http1Codec http1Codec = Http1Codec.this;
            int i = http1Codec.state;
            if (i != 6) {
                if (i == 5) {
                    http1Codec.detachTimeout(this.timeout);
                    Http1Codec http1Codec2 = Http1Codec.this;
                    http1Codec2.state = 6;
                    StreamAllocation streamAllocation = http1Codec2.streamAllocation;
                    if (streamAllocation != null) {
                        streamAllocation.streamFinished(!z, http1Codec2, this.bytesRead, iOException);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException(C0201.m82(26764) + Http1Codec.this.state);
            }
        }

        @Override // defpackage.ty2
        public long read(ay2 ay2, long j) throws IOException {
            try {
                long read = Http1Codec.this.source.read(ay2, j);
                if (read > 0) {
                    this.bytesRead += read;
                }
                return read;
            } catch (IOException e) {
                endOfInput(false, e);
                throw e;
            }
        }

        @Override // defpackage.ty2
        public uy2 timeout() {
            return this.timeout;
        }
    }

    /* access modifiers changed from: private */
    public final class ChunkedSink implements sy2 {
        private boolean closed;
        private final gy2 timeout = new gy2(Http1Codec.this.sink.timeout());

        public ChunkedSink() {
        }

        @Override // java.io.Closeable, defpackage.sy2, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (!this.closed) {
                this.closed = true;
                Http1Codec.this.sink.l0(C0201.m82(29131));
                Http1Codec.this.detachTimeout(this.timeout);
                Http1Codec.this.state = 3;
            }
        }

        @Override // defpackage.sy2, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (!this.closed) {
                Http1Codec.this.sink.flush();
            }
        }

        @Override // defpackage.sy2
        public uy2 timeout() {
            return this.timeout;
        }

        @Override // defpackage.sy2
        public void write(ay2 ay2, long j) throws IOException {
            if (this.closed) {
                throw new IllegalStateException(C0201.m82(29133));
            } else if (j != 0) {
                Http1Codec.this.sink.y0(j);
                by2 by2 = Http1Codec.this.sink;
                String r1 = C0201.m82(29132);
                by2.l0(r1);
                Http1Codec.this.sink.write(ay2, j);
                Http1Codec.this.sink.l0(r1);
            }
        }
    }

    /* access modifiers changed from: private */
    public class ChunkedSource extends AbstractSource {
        private static final long NO_CHUNK_YET = 0;
        private long bytesRemainingInChunk = -1;
        private boolean hasMoreChunks = true;
        private final HttpUrl url;

        static {
            C0201.m83(ChunkedSource.class, 560);
        }

        public ChunkedSource(HttpUrl httpUrl) {
            super();
            this.url = httpUrl;
        }

        private void readChunkSize() throws IOException {
            if (this.bytesRemainingInChunk != -1) {
                Http1Codec.this.source.J0();
            }
            try {
                this.bytesRemainingInChunk = Http1Codec.this.source.i1();
                String trim = Http1Codec.this.source.J0().trim();
                if (this.bytesRemainingInChunk < 0 || (!trim.isEmpty() && !trim.startsWith(C0201.m82(7642)))) {
                    throw new ProtocolException(C0201.m82(7643) + this.bytesRemainingInChunk + trim + C0201.m82(7644));
                } else if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    HttpHeaders.receiveHeaders(Http1Codec.this.client.cookieJar(), this.url, Http1Codec.this.readHeaders());
                    endOfInput(true, null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // java.io.Closeable, okhttp3.internal.http1.Http1Codec.AbstractSource, defpackage.ty2, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.closed) {
                if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    endOfInput(false, null);
                }
                this.closed = true;
            }
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource, defpackage.ty2
        public long read(ay2 ay2, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(C0201.m82(7647) + j);
            } else if (this.closed) {
                throw new IllegalStateException(C0201.m82(7646));
            } else if (!this.hasMoreChunks) {
                return -1;
            } else {
                long j2 = this.bytesRemainingInChunk;
                if (j2 == 0 || j2 == -1) {
                    readChunkSize();
                    if (!this.hasMoreChunks) {
                        return -1;
                    }
                }
                long read = super.read(ay2, Math.min(j, this.bytesRemainingInChunk));
                if (read != -1) {
                    this.bytesRemainingInChunk -= read;
                    return read;
                }
                ProtocolException protocolException = new ProtocolException(C0201.m82(7645));
                endOfInput(false, protocolException);
                throw protocolException;
            }
        }
    }

    /* access modifiers changed from: private */
    public final class FixedLengthSink implements sy2 {
        private long bytesRemaining;
        private boolean closed;
        private final gy2 timeout = new gy2(Http1Codec.this.sink.timeout());

        public FixedLengthSink(long j) {
            this.bytesRemaining = j;
        }

        @Override // java.io.Closeable, defpackage.sy2, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.closed) {
                this.closed = true;
                if (this.bytesRemaining <= 0) {
                    Http1Codec.this.detachTimeout(this.timeout);
                    Http1Codec.this.state = 3;
                    return;
                }
                throw new ProtocolException(C0201.m82(4649));
            }
        }

        @Override // defpackage.sy2, java.io.Flushable
        public void flush() throws IOException {
            if (!this.closed) {
                Http1Codec.this.sink.flush();
            }
        }

        @Override // defpackage.sy2
        public uy2 timeout() {
            return this.timeout;
        }

        @Override // defpackage.sy2
        public void write(ay2 ay2, long j) throws IOException {
            if (!this.closed) {
                Util.checkOffsetAndCount(ay2.Q(), 0, j);
                if (j <= this.bytesRemaining) {
                    Http1Codec.this.sink.write(ay2, j);
                    this.bytesRemaining -= j;
                    return;
                }
                throw new ProtocolException(C0201.m82(4650) + this.bytesRemaining + C0201.m82(4651) + j);
            }
            throw new IllegalStateException(C0201.m82(4652));
        }
    }

    /* access modifiers changed from: private */
    public class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long j) throws IOException {
            super();
            this.bytesRemaining = j;
            if (j == 0) {
                endOfInput(true, null);
            }
        }

        @Override // java.io.Closeable, okhttp3.internal.http1.Http1Codec.AbstractSource, defpackage.ty2, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.closed) {
                if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    endOfInput(false, null);
                }
                this.closed = true;
            }
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource, defpackage.ty2
        public long read(ay2 ay2, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(C0201.m82(3392) + j);
            } else if (!this.closed) {
                long j2 = this.bytesRemaining;
                if (j2 == 0) {
                    return -1;
                }
                long read = super.read(ay2, Math.min(j2, j));
                if (read != -1) {
                    long j3 = this.bytesRemaining - read;
                    this.bytesRemaining = j3;
                    if (j3 == 0) {
                        endOfInput(true, null);
                    }
                    return read;
                }
                ProtocolException protocolException = new ProtocolException(C0201.m82(3390));
                endOfInput(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException(C0201.m82(3391));
            }
        }
    }

    /* access modifiers changed from: private */
    public class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        public UnknownLengthSource() {
            super();
        }

        @Override // java.io.Closeable, okhttp3.internal.http1.Http1Codec.AbstractSource, defpackage.ty2, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.closed) {
                if (!this.inputExhausted) {
                    endOfInput(false, null);
                }
                this.closed = true;
            }
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource, defpackage.ty2
        public long read(ay2 ay2, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(C0201.m82(2583) + j);
            } else if (this.closed) {
                throw new IllegalStateException(C0201.m82(2582));
            } else if (this.inputExhausted) {
                return -1;
            } else {
                long read = super.read(ay2, j);
                if (read != -1) {
                    return read;
                }
                this.inputExhausted = true;
                endOfInput(true, null);
                return -1;
            }
        }
    }

    static {
        C0201.m83(Http1Codec.class, 410);
    }

    public Http1Codec(OkHttpClient okHttpClient, StreamAllocation streamAllocation2, cy2 cy2, by2 by2) {
        this.client = okHttpClient;
        this.streamAllocation = streamAllocation2;
        this.source = cy2;
        this.sink = by2;
    }

    private String readHeaderLine() throws IOException {
        String b0 = this.source.b0(this.headerLimit);
        this.headerLimit -= (long) b0.length();
        return b0;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void cancel() {
        RealConnection connection = this.streamAllocation.connection();
        if (connection != null) {
            connection.cancel();
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public sy2 createRequestBody(Request request, long j) {
        if (C0201.m82(30685).equalsIgnoreCase(request.header(C0201.m82(30684)))) {
            return newChunkedSink();
        }
        if (j != -1) {
            return newFixedLengthSink(j);
        }
        throw new IllegalStateException(C0201.m82(30686));
    }

    public void detachTimeout(gy2 gy2) {
        uy2 a = gy2.a();
        gy2.b(uy2.NONE);
        a.clearDeadline();
        a.clearTimeout();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void finishRequest() throws IOException {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void flushRequest() throws IOException {
        this.sink.flush();
    }

    public boolean isClosed() {
        return this.state == 6;
    }

    public sy2 newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException(C0201.m82(30687) + this.state);
    }

    public ty2 newChunkedSource(HttpUrl httpUrl) throws IOException {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(httpUrl);
        }
        throw new IllegalStateException(C0201.m82(30688) + this.state);
    }

    public sy2 newFixedLengthSink(long j) {
        if (this.state == 1) {
            this.state = 2;
            return new FixedLengthSink(j);
        }
        throw new IllegalStateException(C0201.m82(30689) + this.state);
    }

    public ty2 newFixedLengthSource(long j) throws IOException {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j);
        }
        throw new IllegalStateException(C0201.m82(30690) + this.state);
    }

    public ty2 newUnknownLengthSource() throws IOException {
        if (this.state == 4) {
            StreamAllocation streamAllocation2 = this.streamAllocation;
            if (streamAllocation2 != null) {
                this.state = 5;
                streamAllocation2.noNewStreams();
                return new UnknownLengthSource();
            }
            throw new IllegalStateException(C0201.m82(30691));
        }
        throw new IllegalStateException(C0201.m82(30692) + this.state);
    }

    @Override // okhttp3.internal.http.HttpCodec
    public ResponseBody openResponseBody(Response response) throws IOException {
        StreamAllocation streamAllocation2 = this.streamAllocation;
        streamAllocation2.eventListener.responseBodyStart(streamAllocation2.call);
        String header = response.header(C0201.m82(30693));
        if (!HttpHeaders.hasBody(response)) {
            return new RealResponseBody(header, 0, jy2.d(newFixedLengthSource(0)));
        }
        if (C0201.m82(30695).equalsIgnoreCase(response.header(C0201.m82(30694)))) {
            return new RealResponseBody(header, -1, jy2.d(newChunkedSource(response.request().url())));
        }
        long contentLength = HttpHeaders.contentLength(response);
        if (contentLength != -1) {
            return new RealResponseBody(header, contentLength, jy2.d(newFixedLengthSource(contentLength)));
        }
        return new RealResponseBody(header, -1, jy2.d(newUnknownLengthSource()));
    }

    public Headers readHeaders() throws IOException {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readHeaderLine = readHeaderLine();
            if (readHeaderLine.length() == 0) {
                return builder.build();
            }
            Internal.instance.addLenient(builder, readHeaderLine);
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public Response.Builder readResponseHeaders(boolean z) throws IOException {
        int i = this.state;
        if (i == 1 || i == 3) {
            try {
                StatusLine parse = StatusLine.parse(readHeaderLine());
                Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(readHeaders());
                if (z && parse.code == 100) {
                    return null;
                }
                if (parse.code == 100) {
                    this.state = 3;
                    return headers;
                }
                this.state = 4;
                return headers;
            } catch (EOFException e) {
                IOException iOException = new IOException(C0201.m82(30697) + this.streamAllocation);
                iOException.initCause(e);
                throw iOException;
            }
        } else {
            throw new IllegalStateException(C0201.m82(30696) + this.state);
        }
    }

    public void writeRequest(Headers headers, String str) throws IOException {
        if (this.state == 0) {
            by2 l0 = this.sink.l0(str);
            String r0 = C0201.m82(30698);
            l0.l0(r0);
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                this.sink.l0(headers.name(i)).l0(C0201.m82(30699)).l0(headers.value(i)).l0(r0);
            }
            this.sink.l0(r0);
            this.state = 1;
            return;
        }
        throw new IllegalStateException(C0201.m82(30700) + this.state);
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void writeRequestHeaders(Request request) throws IOException {
        writeRequest(request.headers(), RequestLine.get(request, this.streamAllocation.connection().route().proxy().type()));
    }
}
