package defpackage;

import java.util.concurrent.Executor;

/* renamed from: jt1  reason: default package */
public final class jt1<TResult> implements rt1<TResult> {
    private final Executor a;
    private final Object b = new Object();
    private us1<TResult> c;

    public jt1(Executor executor, us1<TResult> us1) {
        this.a = executor;
        this.c = us1;
    }

    @Override // defpackage.rt1
    public final void a(zs1<TResult> zs1) {
        synchronized (this.b) {
            if (this.c != null) {
                this.a.execute(new kt1(this, zs1));
            }
        }
    }
}
