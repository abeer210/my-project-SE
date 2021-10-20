package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: ey2  reason: default package */
/* compiled from: ForwardingSink */
public abstract class ey2 implements sy2 {
    private final sy2 delegate;

    public ey2(sy2 sy2) {
        if (sy2 != null) {
            this.delegate = sy2;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(32225));
    }

    @Override // java.io.Closeable, defpackage.sy2, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final sy2 delegate() {
        return this.delegate;
    }

    @Override // defpackage.sy2, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // defpackage.sy2
    public uy2 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + C0201.m82(32226) + this.delegate.toString() + C0201.m82(32227);
    }

    @Override // defpackage.sy2
    public void write(ay2 ay2, long j) throws IOException {
        this.delegate.write(ay2, j);
    }
}
