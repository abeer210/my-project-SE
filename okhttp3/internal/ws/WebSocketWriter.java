package okhttp3.internal.ws;

import defpackage.ay2;
import java.io.IOException;
import java.util.Random;
import vigqyno.C0201;

public final class WebSocketWriter {
    public boolean activeWriter;
    public final ay2 buffer = new ay2();
    public final FrameSink frameSink = new FrameSink();
    public final boolean isClient;
    private final ay2.c maskCursor;
    private final byte[] maskKey;
    public final Random random;
    public final by2 sink;
    public final ay2 sinkBuffer;
    public boolean writerClosed;

    /* access modifiers changed from: package-private */
    public final class FrameSink implements sy2 {
        public boolean closed;
        public long contentLength;
        public int formatOpcode;
        public boolean isFirstFrame;

        public FrameSink() {
        }

        @Override // java.io.Closeable, defpackage.sy2, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.Q(), this.isFirstFrame, true);
                this.closed = true;
                WebSocketWriter.this.activeWriter = false;
                return;
            }
            throw new IOException(C0201.m82(13028));
        }

        @Override // defpackage.sy2, java.io.Flushable
        public void flush() throws IOException {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.Q(), this.isFirstFrame, false);
                this.isFirstFrame = false;
                return;
            }
            throw new IOException(C0201.m82(13029));
        }

        @Override // defpackage.sy2
        public uy2 timeout() {
            return WebSocketWriter.this.sink.timeout();
        }

        @Override // defpackage.sy2
        public void write(ay2 ay2, long j) throws IOException {
            if (!this.closed) {
                WebSocketWriter.this.buffer.write(ay2, j);
                boolean z = this.isFirstFrame && this.contentLength != -1 && WebSocketWriter.this.buffer.Q() > this.contentLength - 8192;
                long m = WebSocketWriter.this.buffer.m();
                if (m > 0 && !z) {
                    WebSocketWriter.this.writeMessageFrame(this.formatOpcode, m, this.isFirstFrame, false);
                    this.isFirstFrame = false;
                    return;
                }
                return;
            }
            throw new IOException(C0201.m82(13030));
        }
    }

    public WebSocketWriter(boolean z, by2 by2, Random random2) {
        if (by2 == null) {
            throw new NullPointerException(C0201.m82(15697));
        } else if (random2 != null) {
            this.isClient = z;
            this.sink = by2;
            this.sinkBuffer = by2.d();
            this.random = random2;
            ay2.c cVar = null;
            this.maskKey = z ? new byte[4] : null;
            this.maskCursor = z ? new ay2.c() : cVar;
        } else {
            throw new NullPointerException(C0201.m82(15696));
        }
    }

    private void writeControlFrame(int i, dy2 dy2) throws IOException {
        if (!this.writerClosed) {
            int A = dy2.A();
            if (((long) A) <= 125) {
                this.sinkBuffer.c0(i | 128);
                if (this.isClient) {
                    this.sinkBuffer.c0(A | 128);
                    this.random.nextBytes(this.maskKey);
                    this.sinkBuffer.Z(this.maskKey);
                    if (A > 0) {
                        long Q = this.sinkBuffer.Q();
                        this.sinkBuffer.V(dy2);
                        this.sinkBuffer.B(this.maskCursor);
                        this.maskCursor.c(Q);
                        WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.c0(A);
                    this.sinkBuffer.V(dy2);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException(C0201.m82(15698));
        }
        throw new IOException(C0201.m82(15699));
    }

    public sy2 newMessageSink(int i, long j) {
        if (!this.activeWriter) {
            this.activeWriter = true;
            FrameSink frameSink2 = this.frameSink;
            frameSink2.formatOpcode = i;
            frameSink2.contentLength = j;
            frameSink2.isFirstFrame = true;
            frameSink2.closed = false;
            return frameSink2;
        }
        throw new IllegalStateException(C0201.m82(15700));
    }

    public void writeClose(int i, dy2 dy2) throws IOException {
        dy2 dy22 = dy2.e;
        if (!(i == 0 && dy2 == null)) {
            if (i != 0) {
                WebSocketProtocol.validateCloseCode(i);
            }
            ay2 ay2 = new ay2();
            ay2.j0(i);
            if (dy2 != null) {
                ay2.V(dy2);
            }
            dy22 = ay2.D();
        }
        try {
            writeControlFrame(8, dy22);
        } finally {
            this.writerClosed = true;
        }
    }

    public void writeMessageFrame(int i, long j, boolean z, boolean z2) throws IOException {
        if (!this.writerClosed) {
            int i2 = 0;
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= 128;
            }
            this.sinkBuffer.c0(i);
            if (this.isClient) {
                i2 = 128;
            }
            if (j <= 125) {
                this.sinkBuffer.c0(((int) j) | i2);
            } else if (j <= 65535) {
                this.sinkBuffer.c0(i2 | 126);
                this.sinkBuffer.j0((int) j);
            } else {
                this.sinkBuffer.c0(i2 | 127);
                this.sinkBuffer.i0(j);
            }
            if (this.isClient) {
                this.random.nextBytes(this.maskKey);
                this.sinkBuffer.Z(this.maskKey);
                if (j > 0) {
                    long Q = this.sinkBuffer.Q();
                    this.sinkBuffer.write(this.buffer, j);
                    this.sinkBuffer.B(this.maskCursor);
                    this.maskCursor.c(Q);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            } else {
                this.sinkBuffer.write(this.buffer, j);
            }
            this.sink.t();
            return;
        }
        throw new IOException(C0201.m82(15701));
    }

    public void writePing(dy2 dy2) throws IOException {
        writeControlFrame(9, dy2);
    }

    public void writePong(dy2 dy2) throws IOException {
        writeControlFrame(10, dy2);
    }
}
