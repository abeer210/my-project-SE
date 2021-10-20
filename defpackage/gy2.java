package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import vigqyno.C0201;

/* renamed from: gy2  reason: default package */
/* compiled from: ForwardingTimeout */
public class gy2 extends uy2 {
    private uy2 a;

    public gy2(uy2 uy2) {
        if (uy2 != null) {
            this.a = uy2;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(18382));
    }

    public final uy2 a() {
        return this.a;
    }

    public final gy2 b(uy2 uy2) {
        if (uy2 != null) {
            this.a = uy2;
            return this;
        }
        throw new IllegalArgumentException(C0201.m82(18383));
    }

    @Override // defpackage.uy2
    public uy2 clearDeadline() {
        return this.a.clearDeadline();
    }

    @Override // defpackage.uy2
    public uy2 clearTimeout() {
        return this.a.clearTimeout();
    }

    @Override // defpackage.uy2
    public long deadlineNanoTime() {
        return this.a.deadlineNanoTime();
    }

    @Override // defpackage.uy2
    public boolean hasDeadline() {
        return this.a.hasDeadline();
    }

    @Override // defpackage.uy2
    public void throwIfReached() throws IOException {
        this.a.throwIfReached();
    }

    @Override // defpackage.uy2
    public uy2 timeout(long j, TimeUnit timeUnit) {
        return this.a.timeout(j, timeUnit);
    }

    @Override // defpackage.uy2
    public long timeoutNanos() {
        return this.a.timeoutNanos();
    }

    @Override // defpackage.uy2
    public uy2 deadlineNanoTime(long j) {
        return this.a.deadlineNanoTime(j);
    }
}
