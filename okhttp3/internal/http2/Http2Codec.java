package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import vigqyno.C0201;

public final class Http2Codec implements HttpCodec {
    private static final String CONNECTION = null;
    private static final String ENCODING = null;
    private static final String HOST = null;
    private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableList(C0201.m82(19500), C0201.m82(19501), C0201.m82(19502), C0201.m82(19503), C0201.m82(19504), C0201.m82(19505), C0201.m82(19506), C0201.m82(19507), C0201.m82(19508), C0201.m82(19509), C0201.m82(19510), C0201.m82(19511));
    private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableList(C0201.m82(19512), C0201.m82(19513), C0201.m82(19514), C0201.m82(19515), C0201.m82(19516), C0201.m82(19517), C0201.m82(19518), C0201.m82(19519));
    private static final String KEEP_ALIVE = null;
    private static final String PROXY_CONNECTION = null;
    private static final String TE = null;
    private static final String TRANSFER_ENCODING = null;
    private static final String UPGRADE = null;
    private final Interceptor.Chain chain;
    private final Http2Connection connection;
    private final Protocol protocol;
    private Http2Stream stream;
    public final StreamAllocation streamAllocation;

    class StreamFinishingSource extends fy2 {
        public long bytesRead = 0;
        public boolean completed = false;

        public StreamFinishingSource(ty2 ty2) {
            super(ty2);
        }

        private void endOfInput(IOException iOException) {
            if (!this.completed) {
                this.completed = true;
                Http2Codec http2Codec = Http2Codec.this;
                http2Codec.streamAllocation.streamFinished(false, http2Codec, this.bytesRead, iOException);
            }
        }

        @Override // java.io.Closeable, defpackage.ty2, java.lang.AutoCloseable, defpackage.fy2
        public void close() throws IOException {
            super.close();
            endOfInput(null);
        }

        @Override // defpackage.ty2, defpackage.fy2
        public long read(ay2 ay2, long j) throws IOException {
            try {
                long read = delegate().read(ay2, j);
                if (read > 0) {
                    this.bytesRead += read;
                }
                return read;
            } catch (IOException e) {
                endOfInput(e);
                throw e;
            }
        }
    }

    static {
        C0201.m83(Http2Codec.class, 275);
    }

    public Http2Codec(OkHttpClient okHttpClient, Interceptor.Chain chain2, StreamAllocation streamAllocation2, Http2Connection http2Connection) {
        Protocol protocol2;
        this.chain = chain2;
        this.streamAllocation = streamAllocation2;
        this.connection = http2Connection;
        if (okHttpClient.protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            protocol2 = Protocol.H2_PRIOR_KNOWLEDGE;
        } else {
            protocol2 = Protocol.HTTP_2;
        }
        this.protocol = protocol2;
    }

    public static List<Header> http2HeadersList(Request request) {
        Headers headers = request.headers();
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
        arrayList.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(request.url())));
        String header = request.header(C0201.m82(19520));
        if (header != null) {
            arrayList.add(new Header(Header.TARGET_AUTHORITY, header));
        }
        arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            dy2 k = dy2.k(headers.name(i).toLowerCase(Locale.US));
            if (!HTTP_2_SKIPPED_REQUEST_HEADERS.contains(k.J())) {
                arrayList.add(new Header(k, headers.value(i)));
            }
        }
        return arrayList;
    }

    public static Response.Builder readHttp2HeadersList(Headers headers, Protocol protocol2) throws IOException {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        StatusLine statusLine = null;
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            String value = headers.value(i);
            if (name.equals(C0201.m82(19521))) {
                statusLine = StatusLine.parse(C0201.m82(19522) + value);
            } else if (!HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(name)) {
                Internal.instance.addLenient(builder, name, value);
            }
        }
        if (statusLine != null) {
            return new Response.Builder().protocol(protocol2).code(statusLine.code).message(statusLine.message).headers(builder.build());
        }
        throw new ProtocolException(C0201.m82(19523));
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void cancel() {
        Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            http2Stream.closeLater(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public sy2 createRequestBody(Request request, long j) {
        return this.stream.getSink();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void finishRequest() throws IOException {
        this.stream.getSink().close();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void flushRequest() throws IOException {
        this.connection.flush();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public ResponseBody openResponseBody(Response response) throws IOException {
        StreamAllocation streamAllocation2 = this.streamAllocation;
        streamAllocation2.eventListener.responseBodyStart(streamAllocation2.call);
        return new RealResponseBody(response.header(C0201.m82(19524)), HttpHeaders.contentLength(response), jy2.d(new StreamFinishingSource(this.stream.getSource())));
    }

    @Override // okhttp3.internal.http.HttpCodec
    public Response.Builder readResponseHeaders(boolean z) throws IOException {
        Response.Builder readHttp2HeadersList = readHttp2HeadersList(this.stream.takeHeaders(), this.protocol);
        if (!z || Internal.instance.code(readHttp2HeadersList) != 100) {
            return readHttp2HeadersList;
        }
        return null;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void writeRequestHeaders(Request request) throws IOException {
        if (this.stream == null) {
            Http2Stream newStream = this.connection.newStream(http2HeadersList(request), request.body() != null);
            this.stream = newStream;
            newStream.readTimeout().timeout((long) this.chain.readTimeoutMillis(), TimeUnit.MILLISECONDS);
            this.stream.writeTimeout().timeout((long) this.chain.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        }
    }
}
