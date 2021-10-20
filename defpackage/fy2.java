package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: fy2  reason: default package */
/* compiled from: ForwardingSource */
public abstract class fy2 implements ty2 {
    private final ty2 delegate;

    public fy2(ty2 ty2) {
        if (ty2 != null) {
            this.delegate = ty2;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(20857));
    }

    @Override // java.io.Closeable, defpackage.ty2, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final ty2 delegate() {
        return this.delegate;
    }

    @Override // defpackage.ty2
    public long read(ay2 ay2, long j) throws IOException {
        return this.delegate.read(ay2, j);
    }

    @Override // defpackage.ty2
    public uy2 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + C0201.m82(20858) + this.delegate.toString() + C0201.m82(20859);
    }
}
