package okhttp3.internal.huc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketPermission;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.Permission;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Internal;
import okhttp3.internal.JavaNetHeaders;
import okhttp3.internal.URLFilter;
import okhttp3.internal.Version;
import okhttp3.internal.http.HttpDate;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;
import vigqyno.C0201;

public final class OkHttpURLConnection extends HttpURLConnection implements Callback {
    private static final Set<String> METHODS = new LinkedHashSet(Arrays.asList(C0201.m82(12719), C0201.m82(12720), C0201.m82(12721), C0201.m82(12722), C0201.m82(12723), C0201.m82(12724), C0201.m82(12725), C0201.m82(12726)));
    public static final String RESPONSE_SOURCE = (Platform.get().getPrefix() + C0201.m82(12718));
    public static final String SELECTED_PROTOCOL = (Platform.get().getPrefix() + C0201.m82(12717));
    public Call call;
    private Throwable callFailure;
    public OkHttpClient client;
    public boolean connectPending;
    private boolean executed;
    private long fixedContentLength;
    public Handshake handshake;
    private final Object lock;
    private final NetworkInterceptor networkInterceptor;
    public Response networkResponse;
    public Proxy proxy;
    private Headers.Builder requestHeaders;
    private Response response;
    private Headers responseHeaders;
    public URLFilter urlFilter;

    /* access modifiers changed from: package-private */
    public final class NetworkInterceptor implements Interceptor {
        private boolean proceed;

        public NetworkInterceptor() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request request = chain.request();
            URLFilter uRLFilter = OkHttpURLConnection.this.urlFilter;
            if (uRLFilter != null) {
                uRLFilter.checkURLPermitted(request.url().url());
            }
            synchronized (OkHttpURLConnection.this.lock) {
                OkHttpURLConnection.this.connectPending = false;
                OkHttpURLConnection.this.proxy = chain.connection().route().proxy();
                OkHttpURLConnection.this.handshake = chain.connection().handshake();
                OkHttpURLConnection.this.lock.notifyAll();
                while (!this.proceed) {
                    try {
                        OkHttpURLConnection.this.lock.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
            }
            if (request.body() instanceof OutputStreamRequestBody) {
                request = ((OutputStreamRequestBody) request.body()).prepareToSendRequest(request);
            }
            Response proceed2 = chain.proceed(request);
            synchronized (OkHttpURLConnection.this.lock) {
                OkHttpURLConnection.this.networkResponse = proceed2;
                ((HttpURLConnection) OkHttpURLConnection.this).url = proceed2.request().url().url();
            }
            return proceed2;
        }

        public void proceed() {
            synchronized (OkHttpURLConnection.this.lock) {
                this.proceed = true;
                OkHttpURLConnection.this.lock.notifyAll();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class UnexpectedException extends IOException {
        public static final Interceptor INTERCEPTOR = new Interceptor() {
            /* class okhttp3.internal.huc.OkHttpURLConnection.UnexpectedException.AnonymousClass1 */

            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) throws IOException {
                try {
                    return chain.proceed(chain.request());
                } catch (Error | RuntimeException e) {
                    throw new UnexpectedException(e);
                }
            }
        };

        public UnexpectedException(Throwable th) {
            super(th);
        }
    }

    public OkHttpURLConnection(URL url, OkHttpClient okHttpClient) {
        super(url);
        this.networkInterceptor = new NetworkInterceptor();
        this.requestHeaders = new Headers.Builder();
        this.fixedContentLength = -1;
        this.lock = new Object();
        this.connectPending = true;
        this.client = okHttpClient;
    }

    private Call buildCall() throws IOException {
        OutputStreamRequestBody outputStreamRequestBody;
        Call call2 = this.call;
        if (call2 != null) {
            return call2;
        }
        boolean z = true;
        ((HttpURLConnection) this).connected = true;
        if (((HttpURLConnection) this).doOutput) {
            if (((HttpURLConnection) this).method.equals(C0201.m82(12727))) {
                ((HttpURLConnection) this).method = C0201.m82(12728);
            } else if (!HttpMethod.permitsRequestBody(((HttpURLConnection) this).method)) {
                throw new ProtocolException(((HttpURLConnection) this).method + C0201.m82(12729));
            }
        }
        Headers.Builder builder = this.requestHeaders;
        String r2 = C0201.m82(12730);
        if (builder.get(r2) == null) {
            this.requestHeaders.add(r2, defaultUserAgent());
        }
        if (HttpMethod.permitsRequestBody(((HttpURLConnection) this).method)) {
            Headers.Builder builder2 = this.requestHeaders;
            String r3 = C0201.m82(12731);
            if (builder2.get(r3) == null) {
                this.requestHeaders.add(r3, C0201.m82(12732));
            }
            long j = -1;
            if (this.fixedContentLength == -1 && ((HttpURLConnection) this).chunkLength <= 0) {
                z = false;
            }
            String str = this.requestHeaders.get(C0201.m82(12733));
            long j2 = this.fixedContentLength;
            if (j2 != -1) {
                j = j2;
            } else if (str != null) {
                j = Long.parseLong(str);
            }
            if (z) {
                outputStreamRequestBody = new StreamedRequestBody(j);
            } else {
                outputStreamRequestBody = new BufferedRequestBody(j);
            }
            outputStreamRequestBody.timeout().timeout((long) this.client.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        } else {
            outputStreamRequestBody = null;
        }
        try {
            Request build = new Request.Builder().url(HttpUrl.get(getURL().toString())).headers(this.requestHeaders.build()).method(((HttpURLConnection) this).method, outputStreamRequestBody).build();
            URLFilter uRLFilter = this.urlFilter;
            if (uRLFilter != null) {
                uRLFilter.checkURLPermitted(build.url().url());
            }
            OkHttpClient.Builder newBuilder = this.client.newBuilder();
            newBuilder.interceptors().clear();
            newBuilder.interceptors().add(UnexpectedException.INTERCEPTOR);
            newBuilder.networkInterceptors().clear();
            newBuilder.networkInterceptors().add(this.networkInterceptor);
            newBuilder.dispatcher(new Dispatcher(this.client.dispatcher().executorService()));
            if (!getUseCaches()) {
                newBuilder.cache(null);
            }
            Call newCall = newBuilder.build().newCall(build);
            this.call = newCall;
            return newCall;
        } catch (IllegalArgumentException e) {
            if (Internal.instance.isInvalidHttpUrlHost(e)) {
                UnknownHostException unknownHostException = new UnknownHostException();
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
            MalformedURLException malformedURLException = new MalformedURLException();
            malformedURLException.initCause(e);
            throw malformedURLException;
        }
    }

    private String defaultUserAgent() {
        String property = System.getProperty(C0201.m82(12734));
        return property != null ? toHumanReadableAscii(property) : Version.userAgent();
    }

    private Headers getHeaders() throws IOException {
        if (this.responseHeaders == null) {
            Response response2 = getResponse(true);
            this.responseHeaders = response2.headers().newBuilder().add(SELECTED_PROTOCOL, response2.protocol().toString()).add(RESPONSE_SOURCE, responseSourceHeader(response2)).build();
        }
        return this.responseHeaders;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0021, code lost:
        r3 = buildCall();
        r2.networkInterceptor.proceed();
        r0 = (okhttp3.internal.huc.OutputStreamRequestBody) r3.request().body();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        if (r0 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        r0.outputStream().close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        if (r2.executed == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        r0 = r2.lock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
        if (r2.response != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004a, code lost:
        if (r2.callFailure != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
        r2.lock.wait();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0054, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0056, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0062, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0064, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0065, code lost:
        r2.executed = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        onResponse(r3, r3.execute());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0071, code lost:
        onFailure(r3, r0);
     */
    private Response getResponse(boolean z) throws IOException {
        synchronized (this.lock) {
            if (this.response != null) {
                return this.response;
            } else if (this.callFailure != null) {
                if (!z || this.networkResponse == null) {
                    throw propagate(this.callFailure);
                }
                return this.networkResponse;
            }
        }
        synchronized (this.lock) {
            if (this.callFailure != null) {
                throw propagate(this.callFailure);
            } else if (this.response != null) {
                return this.response;
            } else {
                throw new AssertionError();
            }
        }
    }

    private static IOException propagate(Throwable th) throws IOException {
        if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw new AssertionError();
        }
    }

    private static String responseSourceHeader(Response response2) {
        if (response2.networkResponse() == null) {
            if (response2.cacheResponse() == null) {
                return C0201.m82(12735);
            }
            return C0201.m82(12736) + response2.code();
        } else if (response2.cacheResponse() == null) {
            return C0201.m82(12737) + response2.code();
        } else {
            return C0201.m82(12738) + response2.networkResponse().code();
        }
    }

    private static String toHumanReadableAscii(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt <= 31 || codePointAt >= 127) {
                ay2 ay2 = new ay2();
                ay2.w0(str, 0, i);
                ay2.z0(63);
                while (true) {
                    i += Character.charCount(codePointAt);
                    if (i >= length) {
                        return ay2.G();
                    }
                    codePointAt = str.codePointAt(i);
                    ay2.z0((codePointAt <= 31 || codePointAt >= 127) ? 63 : codePointAt);
                }
            } else {
                i += Character.charCount(codePointAt);
            }
        }
        return str;
    }

    public void addRequestProperty(String str, String str2) {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException(C0201.m82(12742));
        } else if (str == null) {
            throw new NullPointerException(C0201.m82(12741));
        } else if (str2 == null) {
            Platform platform = Platform.get();
            platform.log(5, C0201.m82(12739) + str + C0201.m82(12740), null);
        } else {
            this.requestHeaders.add(str, str2);
        }
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        if (!this.executed) {
            Call buildCall = buildCall();
            this.executed = true;
            buildCall.enqueue(this);
            synchronized (this.lock) {
                while (this.connectPending && this.response == null && this.callFailure == null) {
                    try {
                        this.lock.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                if (this.callFailure != null) {
                    throw propagate(this.callFailure);
                }
            }
        }
    }

    public void disconnect() {
        if (this.call != null) {
            this.networkInterceptor.proceed();
            this.call.cancel();
        }
    }

    public int getConnectTimeout() {
        return this.client.connectTimeoutMillis();
    }

    public InputStream getErrorStream() {
        try {
            Response response2 = getResponse(true);
            if (HttpHeaders.hasBody(response2) && response2.code() >= 400) {
                return response2.body().byteStream();
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i) {
        try {
            Headers headers = getHeaders();
            if (i >= 0) {
                if (i < headers.size()) {
                    return headers.value(i);
                }
            }
        } catch (IOException unused) {
        }
        return null;
    }

    public String getHeaderFieldKey(int i) {
        try {
            Headers headers = getHeaders();
            if (i >= 0) {
                if (i < headers.size()) {
                    return headers.name(i);
                }
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        try {
            return JavaNetHeaders.toMultimap(getHeaders(), StatusLine.get(getResponse(true)).toString());
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        if (((HttpURLConnection) this).doInput) {
            Response response2 = getResponse(false);
            if (response2.code() < 400) {
                return response2.body().byteStream();
            }
            throw new FileNotFoundException(((HttpURLConnection) this).url.toString());
        }
        throw new ProtocolException(C0201.m82(12743));
    }

    public boolean getInstanceFollowRedirects() {
        return this.client.followRedirects();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        OutputStreamRequestBody outputStreamRequestBody = (OutputStreamRequestBody) buildCall().request().body();
        if (outputStreamRequestBody != null) {
            if (outputStreamRequestBody instanceof StreamedRequestBody) {
                connect();
                this.networkInterceptor.proceed();
            }
            if (!outputStreamRequestBody.isClosed()) {
                return outputStreamRequestBody.outputStream();
            }
            throw new ProtocolException(C0201.m82(12744));
        }
        throw new ProtocolException(C0201.m82(12745) + ((HttpURLConnection) this).method);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() throws IOException {
        int i;
        URL url = getURL();
        String host = url.getHost();
        if (url.getPort() != -1) {
            i = url.getPort();
        } else {
            i = HttpUrl.defaultPort(url.getProtocol());
        }
        if (usingProxy()) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) this.client.proxy().address();
            host = inetSocketAddress.getHostName();
            i = inetSocketAddress.getPort();
        }
        return new SocketPermission(host + C0201.m82(12746) + i, C0201.m82(12747));
    }

    public int getReadTimeout() {
        return this.client.readTimeoutMillis();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        if (!((HttpURLConnection) this).connected) {
            return JavaNetHeaders.toMultimap(this.requestHeaders.build(), null);
        }
        throw new IllegalStateException(C0201.m82(12748));
    }

    public String getRequestProperty(String str) {
        if (str == null) {
            return null;
        }
        return this.requestHeaders.get(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        return getResponse(true).code();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        return getResponse(true).message();
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call2, IOException iOException) {
        synchronized (this.lock) {
            boolean z = iOException instanceof UnexpectedException;
            Throwable th = iOException;
            if (z) {
                th = iOException.getCause();
            }
            this.callFailure = th;
            this.lock.notifyAll();
        }
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call2, Response response2) {
        synchronized (this.lock) {
            this.response = response2;
            this.handshake = response2.handshake();
            ((HttpURLConnection) this).url = response2.request().url().url();
            this.lock.notifyAll();
        }
    }

    public void setConnectTimeout(int i) {
        this.client = this.client.newBuilder().connectTimeout((long) i, TimeUnit.MILLISECONDS).build();
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i) {
        setFixedLengthStreamingMode((long) i);
    }

    public void setIfModifiedSince(long j) {
        super.setIfModifiedSince(j);
        long j2 = ((HttpURLConnection) this).ifModifiedSince;
        String r0 = C0201.m82(12752);
        if (j2 != 0) {
            this.requestHeaders.set(r0, HttpDate.format(new Date(((HttpURLConnection) this).ifModifiedSince)));
        } else {
            this.requestHeaders.removeAll(r0);
        }
    }

    public void setInstanceFollowRedirects(boolean z) {
        this.client = this.client.newBuilder().followRedirects(z).build();
    }

    public void setReadTimeout(int i) {
        this.client = this.client.newBuilder().readTimeout((long) i, TimeUnit.MILLISECONDS).build();
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        if (METHODS.contains(str)) {
            ((HttpURLConnection) this).method = str;
            return;
        }
        throw new ProtocolException(C0201.m82(12753) + METHODS + C0201.m82(12754) + str);
    }

    public void setRequestProperty(String str, String str2) {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException(C0201.m82(12758));
        } else if (str == null) {
            throw new NullPointerException(C0201.m82(12757));
        } else if (str2 == null) {
            Platform platform = Platform.get();
            platform.log(5, C0201.m82(12755) + str + C0201.m82(12756), null);
        } else {
            this.requestHeaders.set(str, str2);
        }
    }

    public boolean usingProxy() {
        if (this.proxy != null) {
            return true;
        }
        Proxy proxy2 = this.client.proxy();
        if (proxy2 == null || proxy2.type() == Proxy.Type.DIRECT) {
            return false;
        }
        return true;
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j) {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException(C0201.m82(12751));
        } else if (((HttpURLConnection) this).chunkLength > 0) {
            throw new IllegalStateException(C0201.m82(12750));
        } else if (j >= 0) {
            this.fixedContentLength = j;
            ((HttpURLConnection) this).fixedContentLength = (int) Math.min(j, 2147483647L);
        } else {
            throw new IllegalArgumentException(C0201.m82(12749));
        }
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        if (str != null) {
            return getHeaders().get(str);
        }
        try {
            return StatusLine.get(getResponse(true)).toString();
        } catch (IOException unused) {
            return null;
        }
    }

    public OkHttpURLConnection(URL url, OkHttpClient okHttpClient, URLFilter uRLFilter) {
        this(url, okHttpClient);
        this.urlFilter = uRLFilter;
    }
}
