package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import vigqyno.C0201;

/* renamed from: uy2  reason: default package */
/* compiled from: Timeout */
public class uy2 {
    public static final uy2 NONE = new a();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* renamed from: uy2$a */
    /* compiled from: Timeout */
    class a extends uy2 {
        @Override // defpackage.uy2
        public uy2 deadlineNanoTime(long j) {
            return this;
        }

        @Override // defpackage.uy2
        public void throwIfReached() throws IOException {
        }

        @Override // defpackage.uy2
        public uy2 timeout(long j, TimeUnit timeUnit) {
            return this;
        }
    }

    public static long minTimeout(long j, long j2) {
        return j == 0 ? j2 : (j2 != 0 && j >= j2) ? j2 : j;
    }

    public uy2 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public uy2 clearTimeout() {
        this.timeoutNanos = 0;
        return this;
    }

    public final uy2 deadline(long j, TimeUnit timeUnit) {
        if (j <= 0) {
            throw new IllegalArgumentException(C0201.m82(31144) + j);
        } else if (timeUnit != null) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j));
        } else {
            throw new IllegalArgumentException(C0201.m82(31143));
        }
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException(C0201.m82(31145));
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public void throwIfReached() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException(C0201.m82(31147));
        } else if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException(C0201.m82(31146));
        }
    }

    public uy2 timeout(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException(C0201.m82(31149) + j);
        } else if (timeUnit != null) {
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException(C0201.m82(31148));
        }
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        try {
            boolean hasDeadline2 = hasDeadline();
            long timeoutNanos2 = timeoutNanos();
            long j = 0;
            if (hasDeadline2 || timeoutNanos2 != 0) {
                long nanoTime = System.nanoTime();
                if (hasDeadline2 && timeoutNanos2 != 0) {
                    timeoutNanos2 = Math.min(timeoutNanos2, deadlineNanoTime() - nanoTime);
                } else if (hasDeadline2) {
                    timeoutNanos2 = deadlineNanoTime() - nanoTime;
                }
                if (timeoutNanos2 > 0) {
                    long j2 = timeoutNanos2 / 1000000;
                    Long.signum(j2);
                    obj.wait(j2, (int) (timeoutNanos2 - (1000000 * j2)));
                    j = System.nanoTime() - nanoTime;
                }
                if (j >= timeoutNanos2) {
                    throw new InterruptedIOException(C0201.m82(31150));
                }
                return;
            }
            obj.wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException(C0201.m82(31151));
        }
    }

    public uy2 deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }
}
