package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import vigqyno.C0201;

/* renamed from: yx2  reason: default package */
/* compiled from: AsyncTimeout */
public class yx2 extends uy2 {
    private static final long IDLE_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(60);
    private static final long IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(IDLE_TIMEOUT_MILLIS);
    private static final int TIMEOUT_WRITE_SIZE = 0;
    public static yx2 head;
    private boolean inQueue;
    private yx2 next;
    private long timeoutAt;

    /* access modifiers changed from: package-private */
    /* renamed from: yx2$a */
    /* compiled from: AsyncTimeout */
    public class a implements sy2 {
        public final /* synthetic */ sy2 a;

        public a(sy2 sy2) {
            this.a = sy2;
        }

        @Override // java.io.Closeable, defpackage.sy2, java.lang.AutoCloseable
        public void close() throws IOException {
            yx2.this.enter();
            try {
                this.a.close();
                yx2.this.exit(true);
            } catch (IOException e) {
                throw yx2.this.exit(e);
            } catch (Throwable th) {
                yx2.this.exit(false);
                throw th;
            }
        }

        @Override // defpackage.sy2, java.io.Flushable
        public void flush() throws IOException {
            yx2.this.enter();
            try {
                this.a.flush();
                yx2.this.exit(true);
            } catch (IOException e) {
                throw yx2.this.exit(e);
            } catch (Throwable th) {
                yx2.this.exit(false);
                throw th;
            }
        }

        @Override // defpackage.sy2
        public uy2 timeout() {
            return yx2.this;
        }

        public String toString() {
            return C0201.m82(3155) + this.a + C0201.m82(3156);
        }

        @Override // defpackage.sy2
        public void write(ay2 ay2, long j) throws IOException {
            vy2.b(ay2.b, 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    py2 py2 = ay2.a;
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += (long) (py2.c - py2.b);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        py2 = py2.f;
                    }
                    yx2.this.enter();
                    try {
                        this.a.write(ay2, j2);
                        j -= j2;
                        yx2.this.exit(true);
                    } catch (IOException e) {
                        throw yx2.this.exit(e);
                    } catch (Throwable th) {
                        yx2.this.exit(false);
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: yx2$b */
    /* compiled from: AsyncTimeout */
    public class b implements ty2 {
        public final /* synthetic */ ty2 a;

        public b(ty2 ty2) {
            this.a = ty2;
        }

        @Override // java.io.Closeable, defpackage.ty2, java.lang.AutoCloseable
        public void close() throws IOException {
            yx2.this.enter();
            try {
                this.a.close();
                yx2.this.exit(true);
            } catch (IOException e) {
                throw yx2.this.exit(e);
            } catch (Throwable th) {
                yx2.this.exit(false);
                throw th;
            }
        }

        @Override // defpackage.ty2
        public long read(ay2 ay2, long j) throws IOException {
            yx2.this.enter();
            try {
                long read = this.a.read(ay2, j);
                yx2.this.exit(true);
                return read;
            } catch (IOException e) {
                throw yx2.this.exit(e);
            } catch (Throwable th) {
                yx2.this.exit(false);
                throw th;
            }
        }

        @Override // defpackage.ty2
        public uy2 timeout() {
            return yx2.this;
        }

        public String toString() {
            return C0201.m82(3195) + this.a + C0201.m82(3196);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: yx2$c */
    /* compiled from: AsyncTimeout */
    public static final class c extends Thread {
        public c() {
            super(C0201.m82(3330));
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0015, code lost:
            r1.timedOut();
         */
        public void run() {
            while (true) {
                try {
                    synchronized (yx2.class) {
                        yx2 awaitTimeout = yx2.awaitTimeout();
                        if (awaitTimeout != null) {
                            if (awaitTimeout == yx2.head) {
                                yx2.head = null;
                                return;
                            }
                        }
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static {
        C0201.m83(yx2.class, 614);
    }

    public static yx2 awaitTimeout() throws InterruptedException {
        yx2 yx2 = head.next;
        if (yx2 == null) {
            long nanoTime = System.nanoTime();
            yx2.class.wait(IDLE_TIMEOUT_MILLIS);
            if (head.next != null || System.nanoTime() - nanoTime < IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return head;
        }
        long remainingNanos = yx2.remainingNanos(System.nanoTime());
        if (remainingNanos > 0) {
            long j = remainingNanos / 1000000;
            yx2.class.wait(j, (int) (remainingNanos - (1000000 * j)));
            return null;
        }
        head.next = yx2.next;
        yx2.next = null;
        return yx2;
    }

    private static synchronized boolean cancelScheduledTimeout(yx2 yx2) {
        synchronized (yx2.class) {
            for (yx2 yx22 = head; yx22 != null; yx22 = yx22.next) {
                if (yx22.next == yx2) {
                    yx22.next = yx2.next;
                    yx2.next = null;
                    return false;
                }
            }
            return true;
        }
    }

    private long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    private static synchronized void scheduleTimeout(yx2 yx2, long j, boolean z) {
        synchronized (yx2.class) {
            if (head == null) {
                head = new yx2();
                new c().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                yx2.timeoutAt = Math.min(j, yx2.deadlineNanoTime() - nanoTime) + nanoTime;
            } else if (j != 0) {
                yx2.timeoutAt = j + nanoTime;
            } else if (z) {
                yx2.timeoutAt = yx2.deadlineNanoTime();
            } else {
                throw new AssertionError();
            }
            long remainingNanos = yx2.remainingNanos(nanoTime);
            yx2 yx22 = head;
            while (true) {
                if (yx22.next == null) {
                    break;
                } else if (remainingNanos < yx22.next.remainingNanos(nanoTime)) {
                    break;
                } else {
                    yx22 = yx22.next;
                }
            }
            yx2.next = yx22.next;
            yx22.next = yx2;
            if (yx22 == head) {
                yx2.class.notify();
            }
        }
    }

    public final void enter() {
        if (!this.inQueue) {
            long timeoutNanos = timeoutNanos();
            boolean hasDeadline = hasDeadline();
            if (timeoutNanos != 0 || hasDeadline) {
                this.inQueue = true;
                scheduleTimeout(this, timeoutNanos, hasDeadline);
                return;
            }
            return;
        }
        throw new IllegalStateException(C0201.m82(4700));
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return cancelScheduledTimeout(this);
    }

    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(C0201.m82(4701));
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final sy2 sink(sy2 sy2) {
        return new a(sy2);
    }

    public final ty2 source(ty2 ty2) {
        return new b(ty2);
    }

    public void timedOut() {
    }

    public final void exit(boolean z) throws IOException {
        if (exit() && z) {
            throw newTimeoutException(null);
        }
    }

    public final IOException exit(IOException iOException) throws IOException {
        if (!exit()) {
            return iOException;
        }
        return newTimeoutException(iOException);
    }
}
