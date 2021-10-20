package okhttp3;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.connection.ConnectInterceptor;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;
import vigqyno.C0201;

public final class RealCall implements Call {
    public final OkHttpClient client;
    private EventListener eventListener;
    private boolean executed;
    public final boolean forWebSocket;
    public final Request originalRequest;
    public final RetryAndFollowUpInterceptor retryAndFollowUpInterceptor;
    public final yx2 timeout;

    /* access modifiers changed from: package-private */
    public final class AsyncCall extends NamedRunnable {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        private final Callback responseCallback;

        public AsyncCall(Callback callback) {
            super(C0201.m82(23910), RealCall.this.redactedUrl());
            this.responseCallback = callback;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004f A[Catch:{ all -> 0x0042 }] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0074 A[Catch:{ all -> 0x0042 }] */
        @Override // okhttp3.internal.NamedRunnable
        public void execute() {
            IOException e;
            RealCall.this.timeout.enter();
            boolean z = true;
            try {
                Response responseWithInterceptorChain = RealCall.this.getResponseWithInterceptorChain();
                if (RealCall.this.retryAndFollowUpInterceptor.isCanceled()) {
                    try {
                        this.responseCallback.onFailure(RealCall.this, new IOException(C0201.m82(23911)));
                    } catch (IOException e2) {
                        e = e2;
                        try {
                            IOException timeoutExit = RealCall.this.timeoutExit(e);
                            if (!z) {
                            }
                            RealCall.this.client.dispatcher().finished(this);
                        } catch (Throwable th) {
                            RealCall.this.client.dispatcher().finished(this);
                            throw th;
                        }
                    }
                } else {
                    this.responseCallback.onResponse(RealCall.this, responseWithInterceptorChain);
                }
            } catch (IOException e3) {
                e = e3;
                z = false;
                IOException timeoutExit2 = RealCall.this.timeoutExit(e);
                if (!z) {
                    Platform platform = Platform.get();
                    platform.log(4, C0201.m82(23912) + RealCall.this.toLoggableString(), timeoutExit2);
                } else {
                    RealCall.this.eventListener.callFailed(RealCall.this, timeoutExit2);
                    this.responseCallback.onFailure(RealCall.this, timeoutExit2);
                }
                RealCall.this.client.dispatcher().finished(this);
            }
            RealCall.this.client.dispatcher().finished(this);
        }

        public void executeOn(ExecutorService executorService) {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException(C0201.m82(23913));
                interruptedIOException.initCause(e);
                RealCall.this.eventListener.callFailed(RealCall.this, interruptedIOException);
                this.responseCallback.onFailure(RealCall.this, interruptedIOException);
                RealCall.this.client.dispatcher().finished(this);
            } catch (Throwable th) {
                RealCall.this.client.dispatcher().finished(this);
                throw th;
            }
        }

        public RealCall get() {
            return RealCall.this;
        }

        public String host() {
            return RealCall.this.originalRequest.url().host();
        }

        public Request request() {
            return RealCall.this.originalRequest;
        }
    }

    private RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
        this.retryAndFollowUpInterceptor = new RetryAndFollowUpInterceptor(okHttpClient, z);
        AnonymousClass1 r4 = new yx2() {
            /* class okhttp3.RealCall.AnonymousClass1 */

            @Override // defpackage.yx2
            public void timedOut() {
                RealCall.this.cancel();
            }
        };
        this.timeout = r4;
        r4.timeout((long) okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
    }

    private void captureCallStackTrace() {
        this.retryAndFollowUpInterceptor.setCallStackTrace(Platform.get().getStackTraceForCloseable(C0201.m82(24192)));
    }

    public static RealCall newRealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        RealCall realCall = new RealCall(okHttpClient, request, z);
        realCall.eventListener = okHttpClient.eventListenerFactory().create(realCall);
        return realCall;
    }

    @Override // okhttp3.Call
    public void cancel() {
        this.retryAndFollowUpInterceptor.cancel();
    }

    @Override // okhttp3.Call
    public void enqueue(Callback callback) {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
            } else {
                throw new IllegalStateException(C0201.m82(24193));
            }
        }
        captureCallStackTrace();
        this.eventListener.callStart(this);
        this.client.dispatcher().enqueue(new AsyncCall(callback));
    }

    @Override // okhttp3.Call
    public Response execute() throws IOException {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
            } else {
                throw new IllegalStateException(C0201.m82(24195));
            }
        }
        captureCallStackTrace();
        this.timeout.enter();
        this.eventListener.callStart(this);
        try {
            this.client.dispatcher().executed(this);
            Response responseWithInterceptorChain = getResponseWithInterceptorChain();
            if (responseWithInterceptorChain != null) {
                this.client.dispatcher().finished(this);
                return responseWithInterceptorChain;
            }
            throw new IOException(C0201.m82(24194));
        } catch (IOException e) {
            IOException timeoutExit = timeoutExit(e);
            this.eventListener.callFailed(this, timeoutExit);
            throw timeoutExit;
        } catch (Throwable th) {
            this.client.dispatcher().finished(this);
            throw th;
        }
    }

    public Response getResponseWithInterceptorChain() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.client.interceptors());
        arrayList.add(this.retryAndFollowUpInterceptor);
        arrayList.add(new BridgeInterceptor(this.client.cookieJar()));
        arrayList.add(new CacheInterceptor(this.client.internalCache()));
        arrayList.add(new ConnectInterceptor(this.client));
        if (!this.forWebSocket) {
            arrayList.addAll(this.client.networkInterceptors());
        }
        arrayList.add(new CallServerInterceptor(this.forWebSocket));
        return new RealInterceptorChain(arrayList, null, null, null, 0, this.originalRequest, this, this.eventListener, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis()).proceed(this.originalRequest);
    }

    @Override // okhttp3.Call
    public boolean isCanceled() {
        return this.retryAndFollowUpInterceptor.isCanceled();
    }

    @Override // okhttp3.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    public String redactedUrl() {
        return this.originalRequest.url().redact();
    }

    @Override // okhttp3.Call
    public Request request() {
        return this.originalRequest;
    }

    public StreamAllocation streamAllocation() {
        return this.retryAndFollowUpInterceptor.streamAllocation();
    }

    @Override // okhttp3.Call
    public uy2 timeout() {
        return this.timeout;
    }

    public IOException timeoutExit(IOException iOException) {
        if (!this.timeout.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(C0201.m82(24196));
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public String toLoggableString() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? C0201.m82(24197) : C0201.m82(24198));
        sb.append(this.forWebSocket ? C0201.m82(24199) : C0201.m82(24200));
        sb.append(C0201.m82(24201));
        sb.append(redactedUrl());
        return sb.toString();
    }

    @Override // okhttp3.Call, java.lang.Object
    public RealCall clone() {
        return newRealCall(this.client, this.originalRequest, this.forWebSocket);
    }
}
