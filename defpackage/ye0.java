package defpackage;

import java.io.Closeable;
import vigqyno.C0201;

/* renamed from: ye0  reason: default package */
/* compiled from: CloseableImage */
public abstract class ye0 implements Closeable, bf0 {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    @Override // java.lang.Object
    public void finalize() throws Throwable {
        if (!isClosed()) {
            f60.C(C0201.m82(34476), C0201.m82(34477), getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public df0 h() {
        return cf0.d;
    }

    public abstract boolean isClosed();

    public abstract int k();

    public boolean m() {
        return false;
    }
}
