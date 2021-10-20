package defpackage;

/* renamed from: we0  reason: default package */
/* compiled from: CloseableAnimatedImage */
public class we0 extends ye0 {
    private vb0 a;

    public we0(vb0 vb0) {
        this.a = vb0;
    }

    @Override // defpackage.bf0
    public synchronized int a() {
        return isClosed() ? 0 : this.a.c().a();
    }

    @Override // defpackage.bf0
    public synchronized int c() {
        return isClosed() ? 0 : this.a.c().c();
    }

    @Override // defpackage.ye0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.a != null) {
                vb0 vb0 = this.a;
                this.a = null;
                vb0.a();
            }
        }
    }

    @Override // defpackage.ye0
    public synchronized boolean isClosed() {
        return this.a == null;
    }

    @Override // defpackage.ye0
    public synchronized int k() {
        return isClosed() ? 0 : this.a.c().k();
    }

    @Override // defpackage.ye0
    public boolean m() {
        return true;
    }

    public synchronized vb0 n() {
        return this.a;
    }
}
