package defpackage;

import java.util.concurrent.Executor;

/* renamed from: lt1  reason: default package */
public final class lt1<TResult> implements rt1<TResult> {
    private final Executor a;
    private final Object b = new Object();
    private vs1 c;

    public lt1(Executor executor, vs1 vs1) {
        this.a = executor;
        this.c = vs1;
    }

    @Override // defpackage.rt1
    public final void a(zs1<TResult> zs1) {
        if (!zs1.p() && !zs1.n()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new mt1(this, zs1));
                }
            }
        }
    }
}
