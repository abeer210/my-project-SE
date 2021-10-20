package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.ws.WebSocketReader;
import vigqyno.C0201;

public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 0;
    private static final long MAX_QUEUE_SIZE = 0;
    private static final List<Protocol> ONLY_HTTP1 = Collections.singletonList(Protocol.HTTP_1_1);
    private boolean awaitingPong;
    private Call call;
    private ScheduledFuture<?> cancelFuture;
    private boolean enqueuedClose;
    private ScheduledExecutorService executor;
    private boolean failed;
    private final String key;
    public final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue = new ArrayDeque<>();
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<dy2> pongQueue = new ArrayDeque<>();
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode = -1;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private WebSocketWriter writer;
    private final Runnable writerRunnable;

    /* access modifiers changed from: package-private */
    public final class CancelRunnable implements Runnable {
        public CancelRunnable() {
        }

        public void run() {
            RealWebSocket.this.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class Close {
        public final long cancelAfterCloseMillis;
        public final int code;
        public final dy2 reason;

        public Close(int i, dy2 dy2, long j) {
            this.code = i;
            this.reason = dy2;
            this.cancelAfterCloseMillis = j;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class Message {
        public final dy2 data;
        public final int formatOpcode;

        public Message(int i, dy2 dy2) {
            this.formatOpcode = i;
            this.data = dy2;
        }
    }

    /* access modifiers changed from: private */
    public final class PingRunnable implements Runnable {
        public PingRunnable() {
        }

        public void run() {
            RealWebSocket.this.writePingFrame();
        }
    }

    public static abstract class Streams implements Closeable {
        public final boolean client;
        public final by2 sink;
        public final cy2 source;

        public Streams(boolean z, cy2 cy2, by2 by2) {
            this.client = z;
            this.source = cy2;
            this.sink = by2;
        }
    }

    static {
        C0201.m83(RealWebSocket.class, 386);
    }

    public RealWebSocket(Request request, WebSocketListener webSocketListener, Random random2, long j) {
        if (C0201.m82(14111).equals(request.method())) {
            this.originalRequest = request;
            this.listener = webSocketListener;
            this.random = random2;
            this.pingIntervalMillis = j;
            byte[] bArr = new byte[16];
            random2.nextBytes(bArr);
            this.key = dy2.q(bArr).b();
            this.writerRunnable = new Runnable() {
                /* class okhttp3.internal.ws.RealWebSocket.AnonymousClass1 */

                public void run() {
                    do {
                        try {
                        } catch (IOException e) {
                            RealWebSocket.this.failWebSocket(e, null);
                            return;
                        }
                    } while (RealWebSocket.this.writeOneFrame());
                }
            };
            return;
        }
        throw new IllegalArgumentException(C0201.m82(14112) + request.method());
    }

    private void runWriter() {
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.writerRunnable);
        }
    }

    public void awaitTermination(int i, TimeUnit timeUnit) throws InterruptedException {
        this.executor.awaitTermination((long) i, timeUnit);
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        this.call.cancel();
    }

    public void checkResponse(Response response) throws ProtocolException {
        int code = response.code();
        String r1 = C0201.m82(14113);
        if (code == 101) {
            String header = response.header(C0201.m82(14114));
            String r2 = C0201.m82(14115);
            if (r2.equalsIgnoreCase(header)) {
                String header2 = response.header(r2);
                if (C0201.m82(14116).equalsIgnoreCase(header2)) {
                    String header3 = response.header(C0201.m82(14117));
                    String b = dy2.k(this.key + C0201.m82(14118)).v().b();
                    if (!b.equals(header3)) {
                        throw new ProtocolException(C0201.m82(14119) + b + C0201.m82(14120) + header3 + r1);
                    }
                    return;
                }
                throw new ProtocolException(C0201.m82(14121) + header2 + r1);
            }
            throw new ProtocolException(C0201.m82(14122) + header + r1);
        }
        throw new ProtocolException(C0201.m82(14123) + response.code() + C0201.m82(14124) + response.message() + r1);
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i, String str) {
        return close(i, str, 60000);
    }

    public void connect(OkHttpClient okHttpClient) {
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        Request.Builder newBuilder = this.originalRequest.newBuilder();
        String r1 = C0201.m82(14126);
        final Request build2 = newBuilder.header(r1, C0201.m82(14127)).header(C0201.m82(14128), r1).header(C0201.m82(14129), this.key).header(C0201.m82(14130), C0201.m82(14131)).build();
        Call newWebSocketCall = Internal.instance.newWebSocketCall(build, build2);
        this.call = newWebSocketCall;
        newWebSocketCall.timeout().clearTimeout();
        this.call.enqueue(new Callback() {
            /* class okhttp3.internal.ws.RealWebSocket.AnonymousClass2 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                RealWebSocket.this.failWebSocket(iOException, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                try {
                    RealWebSocket.this.checkResponse(response);
                    StreamAllocation streamAllocation = Internal.instance.streamAllocation(call);
                    streamAllocation.noNewStreams();
                    Streams newWebSocketStreams = streamAllocation.connection().newWebSocketStreams(streamAllocation);
                    try {
                        RealWebSocket.this.listener.onOpen(RealWebSocket.this, response);
                        RealWebSocket.this.initReaderAndWriter(C0201.m82(33495) + build2.url().redact(), newWebSocketStreams);
                        streamAllocation.connection().socket().setSoTimeout(0);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e) {
                        RealWebSocket.this.failWebSocket(e, null);
                    }
                } catch (ProtocolException e2) {
                    RealWebSocket.this.failWebSocket(e2, response);
                    Util.closeQuietly(response);
                }
            }
        });
    }

    public void failWebSocket(Exception exc, Response response) {
        synchronized (this) {
            if (!this.failed) {
                this.failed = true;
                Streams streams2 = this.streams;
                this.streams = null;
                if (this.cancelFuture != null) {
                    this.cancelFuture.cancel(false);
                }
                if (this.executor != null) {
                    this.executor.shutdown();
                }
                try {
                    this.listener.onFailure(this, exc, response);
                } finally {
                    Util.closeQuietly(streams2);
                }
            }
        }
    }

    public void initReaderAndWriter(String str, Streams streams2) throws IOException {
        synchronized (this) {
            this.streams = streams2;
            this.writer = new WebSocketWriter(streams2.client, streams2.sink, this.random);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(str, false));
            this.executor = scheduledThreadPoolExecutor;
            if (this.pingIntervalMillis != 0) {
                scheduledThreadPoolExecutor.scheduleAtFixedRate(new PingRunnable(), this.pingIntervalMillis, this.pingIntervalMillis, TimeUnit.MILLISECONDS);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
        }
        this.reader = new WebSocketReader(streams2.client, streams2.source, this);
    }

    public void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            this.reader.processNextFrame();
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i, String str) {
        Streams streams2;
        if (i != -1) {
            synchronized (this) {
                if (this.receivedCloseCode == -1) {
                    this.receivedCloseCode = i;
                    this.receivedCloseReason = str;
                    streams2 = null;
                    if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                        Streams streams3 = this.streams;
                        this.streams = streams2;
                        if (this.cancelFuture != null) {
                            this.cancelFuture.cancel(false);
                        }
                        this.executor.shutdown();
                        streams2 = streams3;
                    }
                } else {
                    throw new IllegalStateException(C0201.m82(14132));
                }
            }
            try {
                this.listener.onClosing(this, i, str);
                if (streams2 != null) {
                    this.listener.onClosed(this, i, str);
                }
            } finally {
                Util.closeQuietly(streams2);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String str) throws IOException {
        this.listener.onMessage(this, str);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(dy2 dy2) {
        if (!this.failed) {
            if (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty()) {
                this.pongQueue.add(dy2);
                runWriter();
                this.receivedPingCount++;
            }
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(dy2 dy2) {
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public synchronized boolean pong(dy2 dy2) {
        if (!this.failed) {
            if (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty()) {
                this.pongQueue.add(dy2);
                runWriter();
                return true;
            }
        }
        return false;
    }

    public boolean processNextFrame() throws IOException {
        try {
            this.reader.processNextFrame();
            if (this.receivedCloseCode == -1) {
                return true;
            }
            return false;
        } catch (Exception e) {
            failWebSocket(e, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.WebSocket
    public Request request() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public boolean send(String str) {
        if (str != null) {
            return send(dy2.k(str), 1);
        }
        throw new NullPointerException(C0201.m82(14134));
    }

    public synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public void tearDown() throws InterruptedException {
        ScheduledFuture<?> scheduledFuture = this.cancelFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.executor.shutdown();
        this.executor.awaitTermination(10, TimeUnit.SECONDS);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r2 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0.writePong(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        if ((r4 instanceof okhttp3.internal.ws.RealWebSocket.Message) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        r2 = r4.data;
        r0 = defpackage.jy2.c(r0.newMessageSink(r4.formatOpcode, (long) r2.A()));
        r0.R0(r2);
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r12.queueSize -= (long) r2.A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        if ((r4 instanceof okhttp3.internal.ws.RealWebSocket.Close) == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0090, code lost:
        r4 = (okhttp3.internal.ws.RealWebSocket.Close) r4;
        r0.writeClose(r4.code, r4.reason);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0099, code lost:
        if (r1 == null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009b, code lost:
        r12.listener.onClosed(r12, r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a0, code lost:
        okhttp3.internal.Util.closeQuietly(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a4, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00aa, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        okhttp3.internal.Util.closeQuietly(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
        throw r0;
     */
    public boolean writeOneFrame() throws IOException {
        String str;
        Streams streams2;
        synchronized (this) {
            if (this.failed) {
                return false;
            }
            WebSocketWriter webSocketWriter = this.writer;
            dy2 poll = this.pongQueue.poll();
            int i = -1;
            Message message = null;
            if (poll == null) {
                Object poll2 = this.messageAndCloseQueue.poll();
                if (poll2 instanceof Close) {
                    int i2 = this.receivedCloseCode;
                    str = this.receivedCloseReason;
                    if (i2 != -1) {
                        Streams streams3 = this.streams;
                        this.streams = null;
                        this.executor.shutdown();
                        message = poll2;
                        i = i2;
                        streams2 = streams3;
                    } else {
                        this.cancelFuture = this.executor.schedule(new CancelRunnable(), ((Close) poll2).cancelAfterCloseMillis, TimeUnit.MILLISECONDS);
                        i = i2;
                        streams2 = null;
                    }
                } else if (poll2 == 0) {
                    return false;
                } else {
                    streams2 = null;
                    str = null;
                }
                message = poll2;
            } else {
                streams2 = null;
                str = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r1 == -1) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        failWebSocket(new java.net.SocketTimeoutException(vigqyno.C0201.m82(14135) + r8.pingIntervalMillis + vigqyno.C0201.m82(14136) + (r1 - 1) + vigqyno.C0201.m82(14137)), null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.writePing(defpackage.dy2.e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        failWebSocket(r0, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    public void writePingFrame() {
        synchronized (this) {
            if (!this.failed) {
                WebSocketWriter webSocketWriter = this.writer;
                int i = this.awaitingPong ? this.sentPingCount : -1;
                this.sentPingCount++;
                this.awaitingPong = true;
            }
        }
    }

    public synchronized boolean close(int i, String str, long j) {
        WebSocketProtocol.validateCloseCode(i);
        dy2 dy2 = null;
        if (str != null) {
            dy2 = dy2.k(str);
            if (((long) dy2.A()) > 123) {
                throw new IllegalArgumentException(C0201.m82(14125) + str);
            }
        }
        if (!this.failed) {
            if (!this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(i, dy2, j));
                runWriter();
                return true;
            }
        }
        return false;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(dy2 dy2) throws IOException {
        this.listener.onMessage(this, dy2);
    }

    @Override // okhttp3.WebSocket
    public boolean send(dy2 dy2) {
        if (dy2 != null) {
            return send(dy2, 2);
        }
        throw new NullPointerException(C0201.m82(14133));
    }

    private synchronized boolean send(dy2 dy2, int i) {
        if (!this.failed) {
            if (!this.enqueuedClose) {
                if (this.queueSize + ((long) dy2.A()) > 16777216) {
                    close(1001, null);
                    return false;
                }
                this.queueSize += (long) dy2.A();
                this.messageAndCloseQueue.add(new Message(i, dy2));
                runWriter();
                return true;
            }
        }
        return false;
    }
}
