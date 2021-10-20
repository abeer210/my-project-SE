package okhttp3.internal.ws;

import defpackage.ay2;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import vigqyno.C0201;

public final class WebSocketReader {
    public boolean closed;
    private final ay2 controlFrameBuffer = new ay2();
    public final FrameCallback frameCallback;
    public long frameLength;
    public final boolean isClient;
    public boolean isControlFrame;
    public boolean isFinalFrame;
    private final ay2.c maskCursor;
    private final byte[] maskKey;
    private final ay2 messageFrameBuffer = new ay2();
    public int opcode;
    public final cy2 source;

    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(dy2 dy2) throws IOException;

        void onReadMessage(String str) throws IOException;

        void onReadPing(dy2 dy2);

        void onReadPong(dy2 dy2);
    }

    public WebSocketReader(boolean z, cy2 cy2, FrameCallback frameCallback2) {
        if (cy2 == null) {
            throw new NullPointerException(C0201.m82(2493));
        } else if (frameCallback2 != null) {
            this.isClient = z;
            this.source = cy2;
            this.frameCallback = frameCallback2;
            ay2.c cVar = null;
            this.maskKey = z ? null : new byte[4];
            this.maskCursor = !z ? new ay2.c() : cVar;
        } else {
            throw new NullPointerException(C0201.m82(2492));
        }
    }

    private void readControlFrame() throws IOException {
        String str;
        long j = this.frameLength;
        if (j > 0) {
            this.source.S(this.controlFrameBuffer, j);
            if (!this.isClient) {
                this.controlFrameBuffer.B(this.maskCursor);
                this.maskCursor.c(0);
                WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                short s = 1005;
                long Q = this.controlFrameBuffer.Q();
                if (Q != 1) {
                    if (Q != 0) {
                        s = this.controlFrameBuffer.readShort();
                        str = this.controlFrameBuffer.G();
                        String closeCodeExceptionMessage = WebSocketProtocol.closeCodeExceptionMessage(s);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        str = C0201.m82(2495);
                    }
                    this.frameCallback.onReadClose(s, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException(C0201.m82(2496));
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.D());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.D());
                return;
            default:
                throw new ProtocolException(C0201.m82(2494) + Integer.toHexString(this.opcode));
        }
    }

    /* JADX INFO: finally extract failed */
    private void readHeader() throws IOException {
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                int readByte = this.source.readByte() & 255;
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                this.opcode = readByte & 15;
                boolean z = true;
                this.isFinalFrame = (readByte & 128) != 0;
                boolean z2 = (readByte & 8) != 0;
                this.isControlFrame = z2;
                if (!z2 || this.isFinalFrame) {
                    boolean z3 = (readByte & 64) != 0;
                    boolean z4 = (readByte & 32) != 0;
                    boolean z5 = (readByte & 16) != 0;
                    if (z3 || z4 || z5) {
                        throw new ProtocolException(C0201.m82(2503));
                    }
                    int readByte2 = this.source.readByte() & 255;
                    if ((readByte2 & 128) == 0) {
                        z = false;
                    }
                    if (z == this.isClient) {
                        throw new ProtocolException(this.isClient ? C0201.m82(2498) : C0201.m82(2499));
                    }
                    long j = (long) (readByte2 & 127);
                    this.frameLength = j;
                    if (j == 126) {
                        this.frameLength = ((long) this.source.readShort()) & 65535;
                    } else if (j == 127) {
                        long readLong = this.source.readLong();
                        this.frameLength = readLong;
                        if (readLong < 0) {
                            throw new ProtocolException(C0201.m82(2500) + Long.toHexString(this.frameLength) + C0201.m82(2501));
                        }
                    }
                    if (this.isControlFrame && this.frameLength > 125) {
                        throw new ProtocolException(C0201.m82(2502));
                    } else if (z) {
                        this.source.readFully(this.maskKey);
                    }
                } else {
                    throw new ProtocolException(C0201.m82(2497));
                }
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException(C0201.m82(2504));
        }
    }

    private void readMessage() throws IOException {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.S(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    this.messageFrameBuffer.B(this.maskCursor);
                    this.maskCursor.c(this.messageFrameBuffer.Q() - this.frameLength);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            if (!this.isFinalFrame) {
                readUntilNonControlFrame();
                if (this.opcode != 0) {
                    throw new ProtocolException(C0201.m82(2505) + Integer.toHexString(this.opcode));
                }
            } else {
                return;
            }
        }
        throw new IOException(C0201.m82(2506));
    }

    private void readMessageFrame() throws IOException {
        int i = this.opcode;
        if (i == 1 || i == 2) {
            readMessage();
            if (i == 1) {
                this.frameCallback.onReadMessage(this.messageFrameBuffer.G());
            } else {
                this.frameCallback.onReadMessage(this.messageFrameBuffer.D());
            }
        } else {
            throw new ProtocolException(C0201.m82(2507) + Integer.toHexString(i));
        }
    }

    private void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (this.isControlFrame) {
                readControlFrame();
            } else {
                return;
            }
        }
    }

    public void processNextFrame() throws IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
