package okhttp3.internal.http;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import vigqyno.C0201;

public final class RealInterceptorChain implements Interceptor.Chain {
    private final Call call;
    private int calls;
    private final int connectTimeout;
    private final RealConnection connection;
    private final EventListener eventListener;
    private final HttpCodec httpCodec;
    private final int index;
    private final List<Interceptor> interceptors;
    private final int readTimeout;
    private final Request request;
    private final StreamAllocation streamAllocation;
    private final int writeTimeout;

    public RealInterceptorChain(List<Interceptor> list, StreamAllocation streamAllocation2, HttpCodec httpCodec2, RealConnection realConnection, int i, Request request2, Call call2, EventListener eventListener2, int i2, int i3, int i4) {
        this.interceptors = list;
        this.connection = realConnection;
        this.streamAllocation = streamAllocation2;
        this.httpCodec = httpCodec2;
        this.index = i;
        this.request = request2;
        this.call = call2;
        this.eventListener = eventListener2;
        this.connectTimeout = i2;
        this.readTimeout = i3;
        this.writeTimeout = i4;
    }

    @Override // okhttp3.Interceptor.Chain
    public Call call() {
        return this.call;
    }

    @Override // okhttp3.Interceptor.Chain
    public int connectTimeoutMillis() {
        return this.connectTimeout;
    }

    @Override // okhttp3.Interceptor.Chain
    public Connection connection() {
        return this.connection;
    }

    public EventListener eventListener() {
        return this.eventListener;
    }

    public HttpCodec httpStream() {
        return this.httpCodec;
    }

    @Override // okhttp3.Interceptor.Chain
    public Response proceed(Request request2) throws IOException {
        return proceed(request2, this.streamAllocation, this.httpCodec, this.connection);
    }

    @Override // okhttp3.Interceptor.Chain
    public int readTimeoutMillis() {
        return this.readTimeout;
    }

    @Override // okhttp3.Interceptor.Chain
    public Request request() {
        return this.request;
    }

    public StreamAllocation streamAllocation() {
        return this.streamAllocation;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withConnectTimeout(int i, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.interceptors, this.streamAllocation, this.httpCodec, this.connection, this.index, this.request, this.call, this.eventListener, Util.checkDuration(C0201.m82(1684), (long) i, timeUnit), this.readTimeout, this.writeTimeout);
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withReadTimeout(int i, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.interceptors, this.streamAllocation, this.httpCodec, this.connection, this.index, this.request, this.call, this.eventListener, this.connectTimeout, Util.checkDuration(C0201.m82(1685), (long) i, timeUnit), this.writeTimeout);
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withWriteTimeout(int i, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.interceptors, this.streamAllocation, this.httpCodec, this.connection, this.index, this.request, this.call, this.eventListener, this.connectTimeout, this.readTimeout, Util.checkDuration(C0201.m82(1686), (long) i, timeUnit));
    }

    @Override // okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
        return this.writeTimeout;
    }

    public Response proceed(Request request2, StreamAllocation streamAllocation2, HttpCodec httpCodec2, RealConnection realConnection) throws IOException {
        if (this.index < this.interceptors.size()) {
            this.calls++;
            HttpCodec httpCodec3 = this.httpCodec;
            String r3 = C0201.m82(1678);
            if (httpCodec3 == null || this.connection.supportsUrl(request2.url())) {
                HttpCodec httpCodec4 = this.httpCodec;
                String r4 = C0201.m82(1680);
                if (httpCodec4 == null || this.calls <= 1) {
                    RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.interceptors, streamAllocation2, httpCodec2, realConnection, this.index + 1, request2, this.call, this.eventListener, this.connectTimeout, this.readTimeout, this.writeTimeout);
                    Interceptor interceptor = this.interceptors.get(this.index);
                    Response intercept = interceptor.intercept(realInterceptorChain);
                    if (httpCodec2 == null || this.index + 1 >= this.interceptors.size() || realInterceptorChain.calls == 1) {
                        String r1 = C0201.m82(1681);
                        if (intercept == null) {
                            throw new NullPointerException(r1 + interceptor + C0201.m82(1683));
                        } else if (intercept.body() != null) {
                            return intercept;
                        } else {
                            throw new IllegalStateException(r1 + interceptor + C0201.m82(1682));
                        }
                    } else {
                        throw new IllegalStateException(r3 + interceptor + r4);
                    }
                } else {
                    throw new IllegalStateException(r3 + this.interceptors.get(this.index - 1) + r4);
                }
            } else {
                throw new IllegalStateException(r3 + this.interceptors.get(this.index - 1) + C0201.m82(1679));
            }
        } else {
            throw new AssertionError();
        }
    }
}
