package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ht1  reason: default package */
public final class ht1<TResult> implements rt1<TResult> {
    private final Executor a;
    private final Object b = new Object();
    private ts1 c;

    public ht1(Executor executor, ts1 ts1) {
        this.a = executor;
        this.c = ts1;
    }

    @Override // defpackage.rt1
    public final void a(zs1 zs1) {
        if (zs1.n()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new it1(this));
                }
            }
        }
    }
}
