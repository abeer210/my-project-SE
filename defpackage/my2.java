package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: my2  reason: default package */
/* compiled from: PushableTimeout */
public final class my2 extends uy2 {
    private uy2 a;
    private boolean b;
    private long c;
    private long d;

    public void a() {
        this.a.timeout(this.d, TimeUnit.NANOSECONDS);
        if (this.b) {
            this.a.deadlineNanoTime(this.c);
        } else {
            this.a.clearDeadline();
        }
    }

    public void b(uy2 uy2) {
        this.a = uy2;
        boolean hasDeadline = uy2.hasDeadline();
        this.b = hasDeadline;
        this.c = hasDeadline ? uy2.deadlineNanoTime() : -1;
        long timeoutNanos = uy2.timeoutNanos();
        this.d = timeoutNanos;
        uy2.timeout(uy2.minTimeout(timeoutNanos, timeoutNanos()), TimeUnit.NANOSECONDS);
        if (this.b && hasDeadline()) {
            uy2.deadlineNanoTime(Math.min(deadlineNanoTime(), this.c));
        } else if (hasDeadline()) {
            uy2.deadlineNanoTime(deadlineNanoTime());
        }
    }
}
