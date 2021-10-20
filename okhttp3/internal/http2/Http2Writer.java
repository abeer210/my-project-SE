package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import vigqyno.C0188;
import vigqyno.C0201;

public final class Http2Writer implements Closeable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final ay2 hpackBuffer;
    public final Hpack.Writer hpackWriter;
    private int maxFrameSize = 16384;
    private final by2 sink;

    public Http2Writer(by2 by2, boolean z) {
        this.sink = by2;
        this.client = z;
        ay2 ay2 = new ay2();
        this.hpackBuffer = ay2;
        this.hpackWriter = new Hpack.Writer(ay2);
    }

    private void writeContinuationFrames(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min((long) this.maxFrameSize, j);
            long j2 = (long) min;
            j -= j2;
            frameHeader(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
            this.sink.write(this.hpackBuffer, j2);
        }
    }

    private static void writeMedium(by2 by2, int i) throws IOException {
        by2.O((i >>> 16) & 255);
        by2.O((i >>> 8) & 255);
        by2.O(i & 255);
    }

    public synchronized void applyAndAckSettings(Settings settings) throws IOException {
        if (!this.closed) {
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            if (settings.getHeaderTableSize() != -1) {
                this.hpackWriter.setHeaderTableSizeSetting(settings.getHeaderTableSize());
            }
            frameHeader(0, 0, (byte) 4, (byte) 1);
            this.sink.flush();
        } else {
            throw new IOException(C0201.m82(5378));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public synchronized void connectionPreface() throws IOException {
        if (this.closed) {
            throw new IOException(C0201.m82(5380));
        } else if (this.client) {
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Util.format(C0201.m82(5379), Http2.CONNECTION_PREFACE.m()));
            }
            this.sink.write(Http2.CONNECTION_PREFACE.I());
            this.sink.flush();
        }
    }

    public synchronized void data(boolean z, int i, ay2 ay2, int i2) throws IOException {
        if (!this.closed) {
            byte b = 0;
            if (z) {
                b = (byte) 1;
            }
            dataFrame(i, b, ay2, i2);
        } else {
            throw new IOException(C0201.m82(5381));
        }
    }

    public void dataFrame(int i, byte b, ay2 ay2, int i2) throws IOException {
        frameHeader(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.sink.write(ay2, (long) i2);
        }
    }

    public synchronized void flush() throws IOException {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException(C0201.m82(5382));
        }
    }

    public void frameHeader(int i, int i2, byte b, byte b2) throws IOException {
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Http2.frameLog(false, i, i2, b, b2));
        }
        int i3 = this.maxFrameSize;
        if (i2 > i3) {
            throw Http2.illegalArgument(C0201.m82(5384), Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            writeMedium(this.sink, i2);
            this.sink.O(b & 255);
            this.sink.O(b2 & 255);
            this.sink.C(i & C0188.f24);
        } else {
            throw Http2.illegalArgument(C0201.m82(5383), Integer.valueOf(i));
        }
    }

    public synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        if (this.closed) {
            throw new IOException(C0201.m82(5386));
        } else if (errorCode.httpCode != -1) {
            frameHeader(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.sink.C(i);
            this.sink.C(errorCode.httpCode);
            if (bArr.length > 0) {
                this.sink.write(bArr);
            }
            this.sink.flush();
        } else {
            throw Http2.illegalArgument(C0201.m82(5385), new Object[0]);
        }
    }

    public synchronized void headers(int i, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(false, i, list);
        } else {
            throw new IOException(C0201.m82(5387));
        }
    }

    public int maxDataLength() {
        return this.maxFrameSize;
    }

    public synchronized void ping(boolean z, int i, int i2) throws IOException {
        if (!this.closed) {
            frameHeader(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.sink.C(i);
            this.sink.C(i2);
            this.sink.flush();
        } else {
            throw new IOException(C0201.m82(5389));
        }
    }

    public synchronized void pushPromise(int i, int i2, List<Header> list) throws IOException {
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long Q = this.hpackBuffer.Q();
            int min = (int) Math.min((long) (this.maxFrameSize - 4), Q);
            long j = (long) min;
            frameHeader(i, min + 4, (byte) 5, Q == j ? (byte) 4 : 0);
            this.sink.C(i2 & C0188.f24);
            this.sink.write(this.hpackBuffer, j);
            if (Q > j) {
                writeContinuationFrames(i, Q - j);
            }
        } else {
            throw new IOException(C0201.m82(5390));
        }
    }

    public synchronized void rstStream(int i, ErrorCode errorCode) throws IOException {
        if (this.closed) {
            throw new IOException(C0201.m82(5391));
        } else if (errorCode.httpCode != -1) {
            frameHeader(i, 4, (byte) 3, (byte) 0);
            this.sink.C(errorCode.httpCode);
            this.sink.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void settings(Settings settings) throws IOException {
        if (!this.closed) {
            int i = 0;
            frameHeader(0, settings.size() * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (settings.isSet(i)) {
                    this.sink.v(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.sink.C(settings.get(i));
                }
                i++;
            }
            this.sink.flush();
        } else {
            throw new IOException(C0201.m82(5392));
        }
    }

    public synchronized void synReply(boolean z, int i, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(z, i, list);
        } else {
            throw new IOException(C0201.m82(5393));
        }
    }

    public synchronized void synStream(boolean z, int i, int i2, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(z, i, list);
        } else {
            throw new IOException(C0201.m82(5394));
        }
    }

    public synchronized void windowUpdate(int i, long j) throws IOException {
        if (this.closed) {
            throw new IOException(C0201.m82(5396));
        } else if (j == 0 || j > 2147483647L) {
            throw Http2.illegalArgument(C0201.m82(5395), Long.valueOf(j));
        } else {
            frameHeader(i, 4, (byte) 8, (byte) 0);
            this.sink.C((int) j);
            this.sink.flush();
        }
    }

    public void headers(boolean z, int i, List<Header> list) throws IOException {
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long Q = this.hpackBuffer.Q();
            int min = (int) Math.min((long) this.maxFrameSize, Q);
            long j = (long) min;
            byte b = Q == j ? (byte) 4 : 0;
            if (z) {
                b = (byte) (b | 1);
            }
            frameHeader(i, min, (byte) 1, b);
            this.sink.write(this.hpackBuffer, j);
            if (Q > j) {
                writeContinuationFrames(i, Q - j);
                return;
            }
            return;
        }
        throw new IOException(C0201.m82(5388));
    }
}
