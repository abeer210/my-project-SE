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

public final class Http2Reader implements Closeable {
    public static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private final ContinuationSource continuation;
    public final Hpack.Reader hpackReader;
    private final cy2 source;

    /* access modifiers changed from: package-private */
    public static final class ContinuationSource implements ty2 {
        public byte flags;
        public int left;
        public int length;
        public short padding;
        private final cy2 source;
        public int streamId;

        public ContinuationSource(cy2 cy2) {
            this.source = cy2;
        }

        private void readContinuationHeader() throws IOException {
            int i = this.streamId;
            int readMedium = Http2Reader.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            byte readByte = (byte) (this.source.readByte() & 255);
            this.flags = (byte) (this.source.readByte() & 255);
            if (Http2Reader.logger.isLoggable(Level.FINE)) {
                Http2Reader.logger.fine(Http2.frameLog(true, this.streamId, this.length, readByte, this.flags));
            }
            int readInt = this.source.readInt() & C0188.f24;
            this.streamId = readInt;
            if (readByte != 9) {
                throw Http2.ioException(C0201.m82(35489), Byte.valueOf(readByte));
            } else if (readInt != i) {
                throw Http2.ioException(C0201.m82(35488), new Object[0]);
            }
        }

        @Override // java.io.Closeable, defpackage.ty2, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // defpackage.ty2
        public long read(ay2 ay2, long j) throws IOException {
            while (true) {
                int i = this.left;
                if (i == 0) {
                    this.source.b((long) this.padding);
                    this.padding = 0;
                    if ((this.flags & 4) != 0) {
                        return -1;
                    }
                    readContinuationHeader();
                } else {
                    long read = this.source.read(ay2, Math.min(j, (long) i));
                    if (read == -1) {
                        return -1;
                    }
                    this.left = (int) (((long) this.left) - read);
                    return read;
                }
            }
        }

        @Override // defpackage.ty2
        public uy2 timeout() {
            return this.source.timeout();
        }
    }

    /* access modifiers changed from: package-private */
    public interface Handler {
        void ackSettings();

        void alternateService(int i, String str, dy2 dy2, String str2, int i2, long j);

        void data(boolean z, int i, cy2 cy2, int i2) throws IOException;

        void goAway(int i, ErrorCode errorCode, dy2 dy2);

        void headers(boolean z, int i, int i2, List<Header> list);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, List<Header> list) throws IOException;

        void rstStream(int i, ErrorCode errorCode);

        void settings(boolean z, Settings settings);

        void windowUpdate(int i, long j);
    }

    public Http2Reader(cy2 cy2, boolean z) {
        this.source = cy2;
        this.client = z;
        ContinuationSource continuationSource = new ContinuationSource(cy2);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(4096, continuationSource);
    }

    public static int lengthWithoutPadding(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw Http2.ioException(C0201.m82(11964), Short.valueOf(s), Integer.valueOf(i));
    }

    private void readData(Handler handler, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = true;
            boolean z2 = (b & 1) != 0;
            if ((b & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b & 8) != 0) {
                    s = (short) (this.source.readByte() & 255);
                }
                handler.data(z2, i2, this.source, lengthWithoutPadding(i, b, s));
                this.source.b((long) s);
                return;
            }
            throw Http2.ioException(C0201.m82(11965), new Object[0]);
        }
        throw Http2.ioException(C0201.m82(11966), new Object[0]);
    }

    private void readGoAway(Handler handler, int i, byte b, int i2) throws IOException {
        if (i < 8) {
            throw Http2.ioException(C0201.m82(11969), Integer.valueOf(i));
        } else if (i2 == 0) {
            int readInt = this.source.readInt();
            int readInt2 = this.source.readInt();
            int i3 = i - 8;
            ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt2);
            if (fromHttp2 != null) {
                dy2 dy2 = dy2.e;
                if (i3 > 0) {
                    dy2 = this.source.q((long) i3);
                }
                handler.goAway(readInt, fromHttp2, dy2);
                return;
            }
            throw Http2.ioException(C0201.m82(11967), Integer.valueOf(readInt2));
        } else {
            throw Http2.ioException(C0201.m82(11968), new Object[0]);
        }
    }

    private List<Header> readHeaderBlock(int i, short s, byte b, int i2) throws IOException {
        ContinuationSource continuationSource = this.continuation;
        continuationSource.left = i;
        continuationSource.length = i;
        continuationSource.padding = s;
        continuationSource.flags = b;
        continuationSource.streamId = i2;
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private void readHeaders(Handler handler, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = (b & 1) != 0;
            if ((b & 8) != 0) {
                s = (short) (this.source.readByte() & 255);
            }
            if ((b & 32) != 0) {
                readPriority(handler, i2);
                i -= 5;
            }
            handler.headers(z, i2, -1, readHeaderBlock(lengthWithoutPadding(i, b, s), s, b, i2));
            return;
        }
        throw Http2.ioException(C0201.m82(11970), new Object[0]);
    }

    public static int readMedium(cy2 cy2) throws IOException {
        return (cy2.readByte() & 255) | ((cy2.readByte() & 255) << 16) | ((cy2.readByte() & 255) << 8);
    }

    private void readPing(Handler handler, int i, byte b, int i2) throws IOException {
        boolean z = false;
        if (i != 8) {
            throw Http2.ioException(C0201.m82(11972), Integer.valueOf(i));
        } else if (i2 == 0) {
            int readInt = this.source.readInt();
            int readInt2 = this.source.readInt();
            if ((b & 1) != 0) {
                z = true;
            }
            handler.ping(z, readInt, readInt2);
        } else {
            throw Http2.ioException(C0201.m82(11971), new Object[0]);
        }
    }

    private void readPriority(Handler handler, int i, byte b, int i2) throws IOException {
        if (i != 5) {
            throw Http2.ioException(C0201.m82(11974), Integer.valueOf(i));
        } else if (i2 != 0) {
            readPriority(handler, i2);
        } else {
            throw Http2.ioException(C0201.m82(11973), new Object[0]);
        }
    }

    private void readPushPromise(Handler handler, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            if ((b & 8) != 0) {
                s = (short) (this.source.readByte() & 255);
            }
            handler.pushPromise(i2, this.source.readInt() & C0188.f24, readHeaderBlock(lengthWithoutPadding(i - 4, b, s), s, b, i2));
            return;
        }
        throw Http2.ioException(C0201.m82(11975), new Object[0]);
    }

    private void readRstStream(Handler handler, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            throw Http2.ioException(C0201.m82(11978), Integer.valueOf(i));
        } else if (i2 != 0) {
            int readInt = this.source.readInt();
            ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt);
            if (fromHttp2 != null) {
                handler.rstStream(i2, fromHttp2);
            } else {
                throw Http2.ioException(C0201.m82(11976), Integer.valueOf(readInt));
            }
        } else {
            throw Http2.ioException(C0201.m82(11977), new Object[0]);
        }
    }

    private void readSettings(Handler handler, int i, byte b, int i2) throws IOException {
        if (i2 != 0) {
            throw Http2.ioException(C0201.m82(11984), new Object[0]);
        } else if ((b & 1) != 0) {
            if (i == 0) {
                handler.ackSettings();
            } else {
                throw Http2.ioException(C0201.m82(11979), new Object[0]);
            }
        } else if (i % 6 == 0) {
            Settings settings = new Settings();
            for (int i3 = 0; i3 < i; i3 += 6) {
                int readShort = this.source.readShort() & 65535;
                int readInt = this.source.readInt();
                if (readShort != 2) {
                    if (readShort == 3) {
                        readShort = 4;
                    } else if (readShort == 4) {
                        readShort = 7;
                        if (readInt < 0) {
                            throw Http2.ioException(C0201.m82(11981), new Object[0]);
                        }
                    } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                        throw Http2.ioException(C0201.m82(11980), Integer.valueOf(readInt));
                    }
                } else if (!(readInt == 0 || readInt == 1)) {
                    throw Http2.ioException(C0201.m82(11982), new Object[0]);
                }
                settings.set(readShort, readInt);
            }
            handler.settings(false, settings);
        } else {
            throw Http2.ioException(C0201.m82(11983), Integer.valueOf(i));
        }
    }

    private void readWindowUpdate(Handler handler, int i, byte b, int i2) throws IOException {
        if (i == 4) {
            long readInt = ((long) this.source.readInt()) & 2147483647L;
            if (readInt != 0) {
                handler.windowUpdate(i2, readInt);
            } else {
                throw Http2.ioException(C0201.m82(11985), Long.valueOf(readInt));
            }
        } else {
            throw Http2.ioException(C0201.m82(11986), Integer.valueOf(i));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public boolean nextFrame(boolean z, Handler handler) throws IOException {
        try {
            this.source.b1(9);
            int readMedium = readMedium(this.source);
            if (readMedium < 0 || readMedium > 16384) {
                throw Http2.ioException(C0201.m82(11988), Integer.valueOf(readMedium));
            }
            byte readByte = (byte) (this.source.readByte() & 255);
            if (!z || readByte == 4) {
                byte readByte2 = (byte) (this.source.readByte() & 255);
                int readInt = this.source.readInt() & C0188.f24;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Http2.frameLog(true, readInt, readMedium, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        readData(handler, readMedium, readByte2, readInt);
                        break;
                    case 1:
                        readHeaders(handler, readMedium, readByte2, readInt);
                        break;
                    case 2:
                        readPriority(handler, readMedium, readByte2, readInt);
                        break;
                    case 3:
                        readRstStream(handler, readMedium, readByte2, readInt);
                        break;
                    case 4:
                        readSettings(handler, readMedium, readByte2, readInt);
                        break;
                    case 5:
                        readPushPromise(handler, readMedium, readByte2, readInt);
                        break;
                    case 6:
                        readPing(handler, readMedium, readByte2, readInt);
                        break;
                    case 7:
                        readGoAway(handler, readMedium, readByte2, readInt);
                        break;
                    case 8:
                        readWindowUpdate(handler, readMedium, readByte2, readInt);
                        break;
                    default:
                        this.source.b((long) readMedium);
                        break;
                }
                return true;
            }
            throw Http2.ioException(C0201.m82(11987), Byte.valueOf(readByte));
        } catch (IOException unused) {
            return false;
        }
    }

    public void readConnectionPreface(Handler handler) throws IOException {
        if (!this.client) {
            dy2 q = this.source.q((long) Http2.CONNECTION_PREFACE.A());
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Util.format(C0201.m82(11990), q.m()));
            }
            if (!Http2.CONNECTION_PREFACE.equals(q)) {
                throw Http2.ioException(C0201.m82(11991), q.J());
            }
        } else if (!nextFrame(true, handler)) {
            throw Http2.ioException(C0201.m82(11989), new Object[0]);
        }
    }

    private void readPriority(Handler handler, int i) throws IOException {
        int readInt = this.source.readInt();
        handler.priority(i, readInt & C0188.f24, (this.source.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }
}
