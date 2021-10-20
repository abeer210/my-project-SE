package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vigqyno.C0201;

/* renamed from: jy2  reason: default package */
/* compiled from: Okio */
public final class jy2 {
    public static final Logger a = Logger.getLogger(jy2.class.getName());

    /* access modifiers changed from: package-private */
    /* renamed from: jy2$a */
    /* compiled from: Okio */
    public class a implements sy2 {
        public final /* synthetic */ uy2 a;
        public final /* synthetic */ OutputStream b;

        public a(uy2 uy2, OutputStream outputStream) {
            this.a = uy2;
            this.b = outputStream;
        }

        @Override // java.io.Closeable, defpackage.sy2, java.lang.AutoCloseable
        public void close() throws IOException {
            this.b.close();
        }

        @Override // defpackage.sy2, java.io.Flushable
        public void flush() throws IOException {
            this.b.flush();
        }

        @Override // defpackage.sy2
        public uy2 timeout() {
            return this.a;
        }

        public String toString() {
            return C0201.m82(18351) + this.b + C0201.m82(18352);
        }

        @Override // defpackage.sy2
        public void write(ay2 ay2, long j) throws IOException {
            vy2.b(ay2.b, 0, j);
            while (j > 0) {
                this.a.throwIfReached();
                py2 py2 = ay2.a;
                int min = (int) Math.min(j, (long) (py2.c - py2.b));
                this.b.write(py2.a, py2.b, min);
                int i = py2.b + min;
                py2.b = i;
                long j2 = (long) min;
                j -= j2;
                ay2.b -= j2;
                if (i == py2.c) {
                    ay2.a = py2.b();
                    qy2.a(py2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: jy2$b */
    /* compiled from: Okio */
    public class b implements ty2 {
        public final /* synthetic */ uy2 a;
        public final /* synthetic */ InputStream b;

        public b(uy2 uy2, InputStream inputStream) {
            this.a = uy2;
            this.b = inputStream;
        }

        @Override // java.io.Closeable, defpackage.ty2, java.lang.AutoCloseable
        public void close() throws IOException {
            this.b.close();
        }

        @Override // defpackage.ty2
        public long read(ay2 ay2, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(C0201.m82(18262) + j);
            } else if (j == 0) {
                return 0;
            } else {
                try {
                    this.a.throwIfReached();
                    py2 U = ay2.U(1);
                    int read = this.b.read(U.a, U.c, (int) Math.min(j, (long) (8192 - U.c)));
                    if (read == -1) {
                        return -1;
                    }
                    U.c += read;
                    long j2 = (long) read;
                    ay2.b += j2;
                    return j2;
                } catch (AssertionError e) {
                    if (jy2.e(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }
        }

        @Override // defpackage.ty2
        public uy2 timeout() {
            return this.a;
        }

        public String toString() {
            return C0201.m82(18263) + this.b + C0201.m82(18264);
        }
    }

    /* renamed from: jy2$c */
    /* compiled from: Okio */
    class c implements sy2 {
        @Override // java.io.Closeable, defpackage.sy2, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // defpackage.sy2, java.io.Flushable
        public void flush() throws IOException {
        }

        @Override // defpackage.sy2
        public uy2 timeout() {
            return uy2.NONE;
        }

        @Override // defpackage.sy2
        public void write(ay2 ay2, long j) throws IOException {
            ay2.b(j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: jy2$d */
    /* compiled from: Okio */
    public class d extends yx2 {
        public final /* synthetic */ Socket a;

        public d(Socket socket) {
            this.a = socket;
        }

        @Override // defpackage.yx2
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException(C0201.m82(18106));
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // defpackage.yx2
        public void timedOut() {
            String r0 = C0201.m82(18107);
            try {
                this.a.close();
            } catch (Exception e) {
                Logger logger = jy2.a;
                Level level = Level.WARNING;
                logger.log(level, r0 + this.a, (Throwable) e);
            } catch (AssertionError e2) {
                if (jy2.e(e2)) {
                    Logger logger2 = jy2.a;
                    Level level2 = Level.WARNING;
                    logger2.log(level2, r0 + this.a, (Throwable) e2);
                    return;
                }
                throw e2;
            }
        }
    }

    private jy2() {
    }

    public static sy2 a(File file) throws FileNotFoundException {
        if (file != null) {
            return g(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException(C0201.m82(31089));
    }

    public static sy2 b() {
        return new c();
    }

    public static by2 c(sy2 sy2) {
        return new ny2(sy2);
    }

    public static cy2 d(ty2 ty2) {
        return new oy2(ty2);
    }

    public static boolean e(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains(C0201.m82(31090))) ? false : true;
    }

    public static sy2 f(File file) throws FileNotFoundException {
        if (file != null) {
            return g(new FileOutputStream(file));
        }
        throw new IllegalArgumentException(C0201.m82(31091));
    }

    public static sy2 g(OutputStream outputStream) {
        return h(outputStream, new uy2());
    }

    private static sy2 h(OutputStream outputStream, uy2 uy2) {
        if (outputStream == null) {
            throw new IllegalArgumentException(C0201.m82(31093));
        } else if (uy2 != null) {
            return new a(uy2, outputStream);
        } else {
            throw new IllegalArgumentException(C0201.m82(31092));
        }
    }

    public static sy2 i(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException(C0201.m82(31095));
        } else if (socket.getOutputStream() != null) {
            yx2 n = n(socket);
            return n.sink(h(socket.getOutputStream(), n));
        } else {
            throw new IOException(C0201.m82(31094));
        }
    }

    public static ty2 j(File file) throws FileNotFoundException {
        if (file != null) {
            return k(new FileInputStream(file));
        }
        throw new IllegalArgumentException(C0201.m82(31096));
    }

    public static ty2 k(InputStream inputStream) {
        return l(inputStream, new uy2());
    }

    private static ty2 l(InputStream inputStream, uy2 uy2) {
        if (inputStream == null) {
            throw new IllegalArgumentException(C0201.m82(31098));
        } else if (uy2 != null) {
            return new b(uy2, inputStream);
        } else {
            throw new IllegalArgumentException(C0201.m82(31097));
        }
    }

    public static ty2 m(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException(C0201.m82(31100));
        } else if (socket.getInputStream() != null) {
            yx2 n = n(socket);
            return n.source(l(socket.getInputStream(), n));
        } else {
            throw new IOException(C0201.m82(31099));
        }
    }

    private static yx2 n(Socket socket) {
        return new d(socket);
    }
}
