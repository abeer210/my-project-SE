package defpackage;

import java.io.InputStream;

/* renamed from: y23  reason: default package */
/* compiled from: LimitedInputStream */
public abstract class y23 extends InputStream {
    public final InputStream a;
    private int b;

    public y23(InputStream inputStream, int i) {
        this.a = inputStream;
        this.b = i;
    }

    public int a() {
        return this.b;
    }

    public void c(boolean z) {
        InputStream inputStream = this.a;
        if (inputStream instanceof v23) {
            ((v23) inputStream).k(z);
        }
    }
}
